import React from 'react';

const ServiceCard = ({ serviceName, price, fabricsAvailable }) => {
  return (
    <div className="card m-2" style={{ width: '200px' }}>
      <div className="card-body">
        <h5 className="card-title">{serviceName}</h5>
        <p className="card-text">Price: ₹{price}</p>
        <p><strong>Fabrics:</strong></p>
        <ul>
          {fabricsAvailable.map((fabric, index) => (
            <li key={index}>{fabric}</li>
          ))}
        </ul>
      </div>
    </div>
  );
};

export default ServiceCard;
