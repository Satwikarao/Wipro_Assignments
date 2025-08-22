// Importing React and Component to create a class component
import React, { Component } from 'react';
// Importing Bootstrap CSS to apply styling
import 'bootstrap/dist/css/bootstrap.min.css';

// Functional component to display the list of fruits
function FruitList(props) {
  return (
    // Using Bootstrap class list-group to style the list
    <ul className="list-group mt-3">
      {
        // Looping through each fruit in the array using map function
        props.fruits.map((fruit, index) => (
          // Each list item has a key and a Bootstrap class
          <li key={index} className="list-group-item">
            {fruit}  {/* Displaying the fruit name */}
          </li>
        ))
      }
    </ul>
  );
}

// Class component named FruitsLab11 to manage the fruit list
class FruitsLab11 extends Component {
  constructor(props) {
    super(props); // Calling the parent class constructor

    // Defining state to store fruits array and newFruit input value
    this.state = {
      fruits: ['Apple', 'Banana', 'Orange'], // initial fruits list
      newFruit: '' // empty string for input box
    };
  }

  // Function to handle input box changes
  handleChange = (event) => {
    // Update the state with new input value
    this.setState({ newFruit: event.target.value });
  }

  // Function to add new fruit to the fruits array
  addFruit = () => {
    // Check if input is not an empty string
    if (this.state.newFruit.trim() !== '') {
      // Updating the fruits array by adding the newFruit
      this.setState({
        fruits: [...this.state.fruits, this.state.newFruit], // add new fruit
        newFruit: '' // clear the input box
      });
    }
  }

  // The render method displays the UI elements
  render() {
    return (
      // Using Bootstrap container class to center the content
      <div className="container mt-4">
        {/* Title of Lab 11 */}
        <h3>Lab 11 - Fruits Component</h3>

        {/* Input and button in one line using Bootstrap input-group */}
        <div className="input-group mb-3">
          {/* Text input to enter new fruit name */}
          <input
            type="text"
            className="form-control"
            placeholder="Enter a fruit name"
            value={this.state.newFruit} // input value from state
            onChange={this.handleChange} // calling handleChange on typing
          />
          {/* Button to add fruit */}
          <button className="btn btn-primary" onClick={this.addFruit}>
            Add
          </button>
        </div>

        {/* Passing fruits array to FruitList functional component */}
        <FruitList fruits={this.state.fruits} />
      </div>
    );
  }
}

// Exporting the component so it can be used in App.js
export default FruitsLab11;
