import React from 'react';

const CanteenItem = ({ name, price, category, available }) => {
  return (
    <p>
      {name} - ₹{price} - {category} - {available ? 'Available' : 'Not Available'}
    </p>
  );
};

const CanteenMenu = () => {
  const items = [
    { id: 1, name: 'Idli', price: 30, category: 'Breakfast', available: true },
    { id: 2, name: 'Dosa', price: 50, category: 'Breakfast', available: true },
    { id: 3, name: 'Vada', price: 20, category: 'Snack', available: false },
    { id: 4, name: 'Poori', price: 40, category: 'Breakfast', available: true },
    { id: 5, name: 'Meals', price: 120, category: 'Lunch', available: true },
  ];

  return (
    <div>
      <h2>Canteen Menu</h2>
      <p>Canteen Name: Campus Food Court</p>
      <p>Location: Block A, Ground Floor</p>
      <p>Open Hours: 8:00 AM - 8:00 PM</p>

      {items.map((item) => (
        <CanteenItem
          key={item.id}
          name={item.name}
          price={item.price}
          category={item.category}
          available={item.available}
        />
      ))}
    </div>
  );
};

export default CanteenMenu;
