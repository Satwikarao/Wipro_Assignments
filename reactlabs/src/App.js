import React, { useState } from 'react';

// Import all components with file names as seen in your folder
import GroceryList from './GroceryList';
import Car from './Car';
import Phone from './Phone';
import SweetsList from './SweetsList';
import Electronics from './Electronics';
import CanteenMenu from './CanteenMenu';
import JuiceList from './JuiceList';
import Restaurant from './Restaurant';
import TempleList from './TempleList';
import TailorShop from './TailorShop';
import FruitsLab11 from './FruitsLab11';
import TelevisionLab12 from './TelevisionLab12';
import MarriageFormLab13 from './MarriageFormLab13';
import AccessoriesFormLab14 from './AccessoriesFormLab14';
import { FlightBookingControlled, FlightBookingUncontrolled } from './FlightBookingLab15';

function App() {
  const [lab, setLab] = useState('');
  const groceryItems = ['Rice', 'Wheat', 'Sugar', 'Milk', 'Oil'];

  return (
    <div className="container mt-4">
      <h1 className="text-center mb-4">React Labs Project</h1>
      <div className="d-flex flex-wrap gap-2 mb-4">
        <button className="btn btn-outline-primary" onClick={() => setLab('lab1')}>Lab 1 - GroceryList</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab2')}>Lab 2 - Car Component</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab3')}>Lab 3 - Phone</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab4')}>Lab 4 - Sweets List</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab5')}>Lab 5 - Electronics</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab6')}>Lab 6 - Canteen Menu</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab7')}>Lab 7 - Juice List</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab8')}>Lab 8 - Restaurant</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab9')}>Lab 9 - Temple List</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab10')}>Lab 10 - Tailor Shop</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab11')}>Lab 11 - Fruits List</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab12')}>Lab 12 - Television</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab13')}>Lab 13 - Marriage Form</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab14')}>Lab 14 - Accessories Form</button>
        <button className="btn btn-outline-primary" onClick={() => setLab('lab15')}>Lab 15 - Flight Booking</button>
      </div>

      {lab === 'lab1' && <GroceryList items={groceryItems} />}
      {lab === 'lab2' && <Car brand="Toyota" model="Fortuner" color="Black" year="2022" />}
      {lab === 'lab3' && <Phone />}
      {lab === 'lab4' && <SweetsList />}
      {lab === 'lab5' && <Electronics />}
      {lab === 'lab6' && <CanteenMenu />}
      {lab === 'lab7' && <JuiceList />}
      {lab === 'lab8' && <Restaurant />}
      {lab === 'lab9' && <TempleList />}
      {lab === 'lab10' && <TailorShop />}
      {lab === 'lab11' && <FruitsLab11 />}
      {lab === 'lab12' && <TelevisionLab12 />}
      {lab === 'lab13' && <MarriageFormLab13 />}
      {lab === 'lab14' && <AccessoriesFormLab14 />}
      {lab === 'lab15' && (
        <>
          <FlightBookingControlled />
          <FlightBookingUncontrolled />
        </>
      )}
    </div>
  );
}

export default App;