import React, { Component } from "react";

class MenuItem extends Component {
  render() {
    const { name, price, category, available } = this.props;
    return (
      <p>
        {name} - ₹{price} ({category}) - {available ? "Available" : "Not Available"}
      </p>
    );
  }
}

class Restaurant extends Component {
  render() {
    const menu = [
      { id: 1, name: "Paneer Butter Masala", price: 150, category: "Main Course", available: true },
      { id: 2, name: "Chicken Biryani", price: 200, category: "Main Course", available: true },
      { id: 3, name: "Masala Dosa", price: 80, category: "Breakfast", available: true },
      { id: 4, name: "Gulab Jamun", price: 40, category: "Dessert", available: false },
      { id: 5, name: "Veg Thali", price: 120, category: "Combo", available: true }
    ];

    return (
      <div>
        <h2>Restaurant Name: Spice Hub</h2>
        <p>Location: Block B, First Floor</p>
        <p>Open Hours: 10:00 AM - 10:00 PM</p>

        {menu.map((item) => (
          <MenuItem
            key={item.id}
            name={item.name}
            price={item.price}
            category={item.category}
            available={item.available}
          />
        ))}
      </div>
    );
  }
}

export default Restaurant;
