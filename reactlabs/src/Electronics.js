import React, { useState } from 'react';

const Electronics = () => {
  const [name, setName] = useState('Laptop');
  const [brand, setBrand] = useState('Dell');
  const [price, setPrice] = useState(55000);

  const changeBrand = () => {
    setBrand('HP');
  };

  const increasePrice = () => {
    setPrice(price + 1000);
  };

  return (
    <div>
      <h2>Electronic Item Details</h2>
      <p>Name: {name}</p>
      <p>Brand: {brand}</p>
      <p>Price: ₹{price}</p>
      <button onClick={changeBrand}>Change Brand</button>
      <button onClick={increasePrice}>Increase Price</button>
    </div>
  );
};

export default Electronics;
