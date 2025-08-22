// Import React, Component base class, and createRef for refs
import React, { Component, createRef } from "react";

// Controlled component: FlightBookingControlled
class FlightBookingControlled extends Component {
  constructor(props) {
    super(props);
    // Initialize state to hold form inputs and submitted data
    this.state = {
      passengerName: "",    // Passenger name input
      email: "",            // Email input
      gender: "",           // Gender input (radio)
      mealPreference: "Veg",// Meal preference (select dropdown)
      specialRequest: "",   // Special request (textarea)
      submitted: null,      // Holds submitted form data
    };
  }

  // Generic handler for controlled inputs, updates state on change
  handleChange = (e) => {
    const { name, value, type, checked } = e.target;
    // Use checked for checkboxes otherwise value
    this.setState({
      [name]: type === "checkbox" ? checked : value,
    });
  };

  // Submit handler: sets submitted state and resets inputs
  handleSubmit = (e) => {
    e.preventDefault(); // Prevent form page reload
    // Extract current values from state
    const { passengerName, email, gender, mealPreference, specialRequest } = this.state;
    // Save data to submitted and reset form inputs
    this.setState({
      submitted: { passengerName, email, gender, mealPreference, specialRequest },
      passengerName: "",
      email: "",
      gender: "",
      mealPreference: "Veg",
      specialRequest: "",
    });
  };

  render() {
    const { passengerName, email, gender, mealPreference, specialRequest, submitted } = this.state;

    return (
      <div className="card p-4 mb-4 shadow">
        <h3>Controlled Flight Booking Form</h3>
        {/* Controlled form with submit */}
        <form onSubmit={this.handleSubmit}>
          {/* Passenger Name input */}
          <div className="mb-3">
            <label>Passenger Name</label>
            <input
              type="text"
              name="passengerName"
              value={passengerName}           // Controlled value bound to state
              onChange={this.handleChange}    // Update state on input change
              className="form-control"
              required
            />
          </div>

          {/* Email input */}
          <div className="mb-3">
            <label>Email</label>
            <input
              type="email"
              name="email"
              value={email}
              onChange={this.handleChange}
              className="form-control"
              required
            />
          </div>

          {/* Gender radio buttons */}
          <div className="mb-3">
            <label>Gender</label><br />
            <div className="form-check form-check-inline">
              <input
                type="radio"
                name="gender"
                value="Male"
                checked={gender === "Male"}           // Checked based on state
                onChange={this.handleChange}
                className="form-check-input"
                required
              />
              <label className="form-check-label">Male</label>
            </div>
            <div className="form-check form-check-inline">
              <input
                type="radio"
                name="gender"
                value="Female"
                checked={gender === "Female"}
                onChange={this.handleChange}
                className="form-check-input"
              />
              <label className="form-check-label">Female</label>
            </div>
          </div>

          {/* Meal Preference select dropdown */}
          <div className="mb-3">
            <label>Meal Preference</label>
            <select
              name="mealPreference"
              value={mealPreference}
              onChange={this.handleChange}
              className="form-select"
            >
              <option value="Veg">Veg</option>
              <option value="Non-Veg">Non-Veg</option>
            </select>
          </div>

          {/* Special Request textarea */}
          <div className="mb-3">
            <label>Special Request</label>
            <textarea
              name="specialRequest"
              value={specialRequest}
              onChange={this.handleChange}
              className="form-control"
              rows="3"
            />
          </div>

          {/* Submit button */}
          <button type="submit" className="btn btn-primary">Submit</button>
        </form>

        {/* Display submitted data, conditional rendering */}
        {submitted && (
          <div className="mt-4">
            <h5>Submitted Details</h5>
            <table className="table table-bordered">
              <tbody>
                <tr><th>Passenger Name</th><td>{submitted.passengerName}</td></tr>
                <tr><th>Email</th><td>{submitted.email}</td></tr>
                <tr><th>Gender</th><td>{submitted.gender}</td></tr>
                <tr><th>Meal Preference</th><td>{submitted.mealPreference}</td></tr>
                <tr><th>Special Request</th><td>{submitted.specialRequest}</td></tr>
              </tbody>
            </table>
          </div>
        )}
      </div>
    );
  }
}

// Uncontrolled component: FlightBookingUncontrolled
class FlightBookingUncontrolled extends Component {
  // Create refs for uncontrolled form fields
  flightNumberRef = createRef();
  sourceRef = createRef();
  destinationRef = createRef();
  travelDateRef = createRef();
  termsAcceptedRef = createRef();

  state = {
    submittedData: null,  // To hold submitted form data
  };

  // Submit handler reads values via refs
  handleSubmit = (e) => {
    e.preventDefault();
    // Extract current values directly from refs
    const submittedData = {
      flightNumber: this.flightNumberRef.current.value,
      source: this.sourceRef.current.value,
      destination: this.destinationRef.current.value,
      travelDate: this.travelDateRef.current.value,
      termsAccepted: this.termsAcceptedRef.current.checked ? "Yes" : "No",
    };

    // Save submitted data
    this.setState({ submittedData });
    
    // Reset form fields
    e.target.reset();
  };

  render() {
    const { submittedData } = this.state;

    return (
      <div className="card p-4 shadow">
        <h3>Uncontrolled Flight Booking Form</h3>
        <form onSubmit={this.handleSubmit}>
          {/* Flight Number text input with ref */}
          <div className="mb-3">
            <label>Flight Number</label>
            <input type="text" ref={this.flightNumberRef} className="form-control" required />
          </div>

          {/* Source text input */}
          <div className="mb-3">
            <label>Source</label>
            <input type="text" ref={this.sourceRef} className="form-control" required />
          </div>

          {/* Destination text input */}
          <div className="mb-3">
            <label>Destination</label>
            <input type="text" ref={this.destinationRef} className="form-control" required />
          </div>

          {/* Travel Date date input */}
          <div className="mb-3">
            <label>Travel Date</label>
            <input type="date" ref={this.travelDateRef} className="form-control" required />
          </div>

          {/* Terms Accepted checkbox */}
          <div className="form-check mb-3">
            <input
              type="checkbox"
              ref={this.termsAcceptedRef}
              className="form-check-input"
              id="termsCheck"
              required
            />
            <label className="form-check-label" htmlFor="termsCheck">
              Terms Accepted
            </label>
          </div>

          {/* Submit button */}
          <button type="submit" className="btn btn-primary">Submit</button>
        </form>

        {/* Display submitted data */}
        {submittedData && (
          <div className="mt-4 card p-3">
            <h5>Flight Details</h5>
            <p><strong>Flight Number:</strong> {submittedData.flightNumber}</p>
            <p><strong>Source:</strong> {submittedData.source}</p>
            <p><strong>Destination:</strong> {submittedData.destination}</p>
            <p><strong>Travel Date:</strong> {submittedData.travelDate}</p>
            <p><strong>Terms Accepted:</strong> {submittedData.termsAccepted}</p>
          </div>
        )}
      </div>
    );
  }
}

// Export both components for use in App.js or elsewhere
export { FlightBookingControlled, FlightBookingUncontrolled };