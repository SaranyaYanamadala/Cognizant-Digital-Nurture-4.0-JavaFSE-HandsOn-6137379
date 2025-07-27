import React, { Component } from "react";

class CurrencyConverter extends Component {
  constructor(props) {
    super(props);
    this.state = {
      rupees: "",
      convertedAmount: "",
      selectedCurrency: "EUR"
    };

    this.rates = {
      EUR: 90,   // Euro
      USD: 83,   // US Dollar
      GBP: 105   // British Pound
    };
  }

  handleRupeeChange = (event) => {
    this.setState({ rupees: event.target.value });
  };

  handleCurrencyChange = (event) => {
    this.setState({ selectedCurrency: event.target.value });
  };

  handleSubmit = () => {
    const { rupees, selectedCurrency } = this.state;
    const rate = this.rates[selectedCurrency];

    const amount = parseFloat(rupees);
    if (!isNaN(amount)) {
      const converted = amount / rate;
      this.setState({ convertedAmount: converted.toFixed(2) });
    } else {
      alert("Please enter a valid number");
    }
  };

  render() {
    const { rupees, selectedCurrency, convertedAmount } = this.state;

    return (
      <div>
        <h2>💱 Multi-Currency Converter</h2>

        <div style={{ marginBottom: "10px" }}>
          <label>₹ Rupees: </label>
          <input
            type="number"
            placeholder="Enter INR"
            value={rupees}
            onChange={this.handleRupeeChange}
          />
        </div>

        <div style={{ marginBottom: "10px" }}>
          <label>Select Currency: </label>
          <select value={selectedCurrency} onChange={this.handleCurrencyChange}>
            <option value="EUR">Euro (€)</option>
            <option value="USD">US Dollar ($)</option>
            <option value="GBP">British Pound (£)</option>
          </select>
        </div>

        <button onClick={this.handleSubmit}>Convert</button>

        <div style={{ marginTop: "10px" }}>
          <label>Converted Amount ({selectedCurrency}): </label>
          <input
            type="text"
            value={convertedAmount}
            readOnly
          />
        </div>
      </div>
    );
  }
}

export default CurrencyConverter;
