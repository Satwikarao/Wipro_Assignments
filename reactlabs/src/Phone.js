import React, { useState } from 'react';

const Phone = () => {
  const [phone, setPhone] = useState({
    brand: 'Apple',
    model: 'iPhone 15',
    price: 79999,
  });

  const increasePrice = () => {
    setPhone({ ...phone, price: phone.price + 1000 });
  };

  return (
    <div>
      <h2>Phone Details</h2>
      <p>Brand: {phone.brand}</p>
      <p>Model: {phone.model}</p>
      <p>Price: ₹{phone.price}</p>
      <button onClick={increasePrice}>Increase Price</button>
    </div>
  );
};

export default Phone;
