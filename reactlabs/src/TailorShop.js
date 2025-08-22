import React from 'react';
import ServiceCard from './ServiceCard';

const TailorShop = () => {
  const services = [
    { serviceName: 'Shirts', price: 500, fabricsAvailable: ['Cotton', 'Linen'] },
    { serviceName: 'Pants', price: 700, fabricsAvailable: ['Denim', 'Polyester'] },
    { serviceName: 'Lehenga', price: 2000, fabricsAvailable: ['Silk', 'Net', 'Georgette'] },
    { serviceName: 'Blouse', price: 800, fabricsAvailable: ['Silk', 'Brocade'] },
  ];

  return (
    <div className="container">
      <h2>Tailoring Services</h2>
      <div className="row">
        {services.map((service, index) => (
          <div className="col" key={index}>
            <ServiceCard
              serviceName={service.serviceName}
              price={service.price}
              fabricsAvailable={service.fabricsAvailable}
            />
          </div>
        ))}
      </div>
    </div>
  );
};

export default TailorShop;
