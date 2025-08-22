// Importing React and Component base class from 'react'
import React, { Component } from "react";

//  Functional Component to display the list of televisions
function TelevisionList({ models }) {
  // Receives "models" array as props
  return (
    <div>
      {/* Section heading */}
      <h3>📺 Available Television Models</h3>
      
      {/* Render models dynamically inside <ul> */}
      <ul>
        {models.map((tv, index) => (
          // Each item must have a unique key
          <li key={index}>{tv}</li>
        ))}
      </ul>
    </div>
  );
}

// Class Component - Works as the Manager
class TelevisionManager extends Component {
  // Constructor for initializing the component’s state
  constructor(props) {
    super(props); // Call parent constructor
    
    // State contains list of models and input field for new model
    this.state = {
      models: ["Sony Bravia", "Samsung Neo QLED", "LG OLED"], // initial TV models
      newModel: "" // input field state (controlled component)
    };
  }

  // Event handler for input box changes
  handleChange = (event) => {
    // Update state dynamically based on what is typed
    this.setState({ newModel: event.target.value });
  };

  // Event handler for adding new TV model
  addModel = () => {
    // Prevent adding blank values
    if (this.state.newModel.trim() === "") return;

    // Update state using spread operator
    this.setState((prevState) => ({
      models: [...prevState.models, prevState.newModel], // add new model
      newModel: "" // reset the input field
    }));
  };

  // Render method - what appears on browser
  render() {
    return (
      <div className="container mt-3">
        {/* Section title */}
        <h2>Lab 12 - Television Manager</h2>

        {/* Input box for typing new model */}
        <input
          type="text"
          className="form-control w-50 d-inline"
          placeholder="Enter new television model"
          value={this.state.newModel}  // Controlled input (value comes from state)
          onChange={this.handleChange} // Updates state when user types
        />

        {/* Add button */}
        <button
          className="btn btn-primary ms-2"
          onClick={this.addModel} // Calls addModel function
        >
          Add Television
        </button>

        {/* Passing the models array as props to TelevisionList */}
        <TelevisionList models={this.state.models} />
      </div>
    );
  }
}

// Export component so it can be used in App.js
export default TelevisionManager;