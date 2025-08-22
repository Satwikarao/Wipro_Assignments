// Import React and Component class from react library
import React, { Component } from "react";

// Define a class component named MarriageFormLab13
class MarriageFormLab13 extends Component {
  // Constructor method for initializing component state
  constructor(props) {
    super(props); // Call parent class constructor

    // Initialize state with form fields and submitted data placeholder
    this.state = {
      brideName: "",   // To store bride's name input
      groomName: "",   // To store groom's name input
      date: "",        // To store marriage date input
      venue: "",       // To store venue input
      submitted: null  // To hold submitted form data after submit
    };
  }

  // Generic input handler to update state based on input field's name
  handleChange = (event) => {
    const { name, value } = event.target; // Extract the input’s name and value
    this.setState({ [name]: value });     // Update corresponding state property
  };

  // Form submit handler to save data and reset input fields
  handleSubmit = (event) => {
    event.preventDefault(); // Prevent default page reload on submit
    
    // Save current form data into 'submitted' state and clear inputs
    this.setState({
      submitted: {
        brideName: this.state.brideName,
        groomName: this.state.groomName,
        date: this.state.date,
        venue: this.state.venue,
      },
      brideName: "",  // Reset brideName field
      groomName: "",  // Reset groomName field
      date: "",       // Reset date field
      venue: ""       // Reset venue field
    });
  };

  // Render method returns JSX for UI display
  render() {
    return (
      <div className="container mt-4">
        {/* Primary heading */}
        <h2 className="text-center">💍 Marriage Form</h2>

        {/* Bootstrap card for form layout */}
        <div className="card p-4 shadow">
          {/* Form with submit event attached */}
          <form onSubmit={this.handleSubmit}>

            {/* Bride Name input field */}
            <div className="form-group mb-3">
              <label>Bride Name</label>
              <input
                type="text"
                name="brideName"                 // Name linked to state property
                value={this.state.brideName}     // Controlled input from state
                onChange={this.handleChange}     // Handle changes to update state
                className="form-control"          // Bootstrap style class
                required                        // Make input mandatory
              />
            </div>

            {/* Groom Name input field */}
            <div className="form-group mb-3">
              <label>Groom Name</label>
              <input
                type="text"
                name="groomName"
                value={this.state.groomName}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            {/* Marriage Date input field */}
            <div className="form-group mb-3">
              <label>Marriage Date</label>
              <input
                type="date"
                name="date"
                value={this.state.date}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            {/* Venue input field */}
            <div className="form-group mb-3">
              <label>Venue</label>
              <input
                type="text"
                name="venue"
                value={this.state.venue}
                onChange={this.handleChange}
                className="form-control"
                required
              />
            </div>

            {/* Submit button */}
            <button type="submit" className="btn btn-success w-100">
              Submit
            </button>
          </form>
        </div>

        {/* Display submitted data if available */}
        {this.state.submitted && (
          <div className="card mt-4 p-4 shadow">
            <h4 className="text-center">🎉 Marriage Details Submitted</h4>
            <p><strong>Bride:</strong> {this.state.submitted.brideName}</p>
            <p><strong>Groom:</strong> {this.state.submitted.groomName}</p>
            <p><strong>Date:</strong> {this.state.submitted.date}</p>
            <p><strong>Venue:</strong> {this.state.submitted.venue}</p>
          </div>
        )}
      </div>
    );
  }
}

// Export the component so it can be imported in other files
export default MarriageFormLab13;