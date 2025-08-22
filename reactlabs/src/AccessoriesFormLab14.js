import React, { Component } from "react";

class AccessoriesFormLab14 extends Component {
  constructor(props) {
    super(props);
    // Initialize state for all form fields and submitted data
    this.state = {
      accessoryName: "",       // Text input
      description: "",         // Textarea input
      category: "Jewelry",     // Select dropdown default
      brand: "",               // Radio buttons (only one brand selected)
      available: false,        // Checkbox (boolean)
      warranty: "",            // Number input
      submittedData: null      // Holds submitted form data
    };
  }

  // Handle every input change, including checkbox and radio/select
  handleChange = (event) => {
    const { name, type, value, checked } = event.target;
    // Checkbox uses 'checked' else use 'value'
    const val = type === "checkbox" ? checked : value;
    this.setState({ [name]: val });
  };

  // Form submission handler
  handleSubmit = (event) => {
    event.preventDefault(); // Prevent form reload

    // Prepare data object to save submitted details
    const {
      accessoryName,
      description,
      category,
      brand,
      available,
      warranty,
    } = this.state;

    const newData = {
      accessoryName,
      description,
      category,
      brand,
      available: available ? "Yes" : "No", // display as Yes/No
      warranty,
    };

    // Save submitted data and clear inputs (except category for better UX)
    this.setState({
      submittedData: newData,
      accessoryName: "",
      description: "",
      category: "Jewelry",
      brand: "",
      available: false,
      warranty: "",
    });
  };

  render() {
    return (
      <div className="container mt-4">
        {/* Form heading */}
        <h2 className="text-center mb-4">Lab 14 - Accessories Form</h2>

        {/* Form card */}
        <div className="card p-4 shadow">
          <form onSubmit={this.handleSubmit}>
            {/* Accessory Name - text */}
            <div className="form-group mb-3">
              <label>Accessory Name</label>
              <input
                type="text"
                name="accessoryName"
                value={this.state.accessoryName}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            {/* Description - textarea */}
            <div className="form-group mb-3">
              <label>Description</label>
              <textarea
                name="description"
                value={this.state.description}
                onChange={this.handleChange}
                className="form-control"
                rows="3"
                required
              />
            </div>

            {/* Category - select dropdown */}
            <div className="form-group mb-3">
              <label>Category</label>
              <select
                name="category"
                value={this.state.category}
                onChange={this.handleChange}
                className="form-control"
                required
              >
                <option value="Jewelry">Jewelry</option>
                <option value="Watches">Watches</option>
                <option value="Bags">Bags</option>
                <option value="Others">Others</option>
              </select>
            </div>

            {/* Brand - radio buttons */}
            <div className="form-group mb-3">
              <label>Brand</label>
              <div>
                <div className="form-check form-check-inline">
                  <input
                    type="radio"
                    name="brand"
                    value="Brand A"
                    checked={this.state.brand === "Brand A"}
                    onChange={this.handleChange}
                    className="form-check-input"
                    required
                  />
                  <label className="form-check-label">Brand A</label>
                </div>

                <div className="form-check form-check-inline">
                  <input
                    type="radio"
                    name="brand"
                    value="Brand B"
                    checked={this.state.brand === "Brand B"}
                    onChange={this.handleChange}
                    className="form-check-input"
                  />
                  <label className="form-check-label">Brand B</label>
                </div>

                <div className="form-check form-check-inline">
                  <input
                    type="radio"
                    name="brand"
                    value="Brand C"
                    checked={this.state.brand === "Brand C"}
                    onChange={this.handleChange}
                    className="form-check-input"
                  />
                  <label className="form-check-label">Brand C</label>
                </div>
              </div>
            </div>

            {/* Available in stock - checkbox */}
            <div className="form-group mb-3 form-check">
              <input
                type="checkbox"
                name="available"
                checked={this.state.available}
                onChange={this.handleChange}
                className="form-check-input"
                id="availableCheck"
              />
              <label className="form-check-label" htmlFor="availableCheck">
                Available in stock
              </label>
            </div>

            {/* Warranty - number input */}
            <div className="form-group mb-4">
              <label>Warranty (months)</label>
              <input
                type="number"
                name="warranty"
                value={this.state.warranty}
                onChange={this.handleChange}
                className="form-control"
                min="0"
                required
              />
            </div>

            {/* Submit button */}
            <button type="submit" className="btn btn-primary w-100">
              Submit
            </button>
          </form>
        </div>

        {/* Display submitted data in a Bootstrap table if available */}
        {this.state.submittedData && (
          <div className="card mt-4 p-4 shadow">
            <h3 className="text-center mb-3">Submitted Accessory Details</h3>
            <table className="table table-bordered">
              <thead>
                <tr>
                  <th>Accessory Name</th>
                  <th>Description</th>
                  <th>Category</th>
                  <th>Brand</th>
                  <th>Available</th>
                  <th>Warranty (months)</th>
                </tr>
              </thead>
              <tbody>
                <tr>
                  <td>{this.state.submittedData.accessoryName}</td>
                  <td>{this.state.submittedData.description}</td>
                  <td>{this.state.submittedData.category}</td>
                  <td>{this.state.submittedData.brand}</td>
                  <td>{this.state.submittedData.available}</td>
                  <td>{this.state.submittedData.warranty}</td>
                </tr>
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

export default AccessoriesFormLab14;