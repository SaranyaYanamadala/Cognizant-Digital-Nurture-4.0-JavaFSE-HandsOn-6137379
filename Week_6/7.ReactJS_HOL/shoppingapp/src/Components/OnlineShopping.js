import React, { Component } from 'react';
import Cart from './Cart';

class OnlineShopping extends Component {
  constructor(props) {
    super(props);
    this.state = {
      items: [
        new Cart("Laptop", 55000),
        new Cart("Phone", 20000),
        new Cart("Headphones", 1500),
        new Cart("Charger", 800),
        new Cart("Smartwatch", 3500)
      ]
    };
  }

  render() {
    return (
      <div>
        <h2>Shopping Cart</h2>
        <table border="1">
          <thead>
            <tr>
              <th>Item Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {this.state.items.map((item, index) => (
              <tr key={index}>
                <td>{item.itemname}</td>
                <td>{item.price}</td>
              </tr>
            ))}
          </tbody>
        </table>
      </div>
    );
  }
}

export default OnlineShopping;