import React, { Component } from "react";

class EventExamples extends Component {
  constructor(props) {
    super(props);
    this.state = {
      count: 0
    };
  }

  increment = () => {
    this.setState(prevState => ({ count: prevState.count + 1 }));
  };

  sayHello = () => {
    console.log("Hello from React!");
    alert("Hello! Welcome to Event Handling Example.");
  };

  handleIncrement = () => {
    this.increment();
    this.sayHello();
  };

  sayMessage = (message) => {
    alert(message);
  };

  handleClick = (event) => {
    alert("I was clicked!");
    console.log("Synthetic event:", event);
  };

  decrement = () => {
    this.setState(prevState => ({ count: prevState.count - 1 }));
  };

  render() {
    return (
      <div>
        <h2>Counter: {this.state.count}</h2>
        <button onClick={this.handleIncrement}>Increment</button>{" "}<br />
        <button onClick={this.decrement}>Decrement</button>{" "}<br />
        <button onClick={() => this.sayMessage("Welcome!")}>Say Welcome</button>{" "}<br />
        <button onClick={this.handleClick}>OnPress</button>
      </div>
    );
  }
}

export default EventExamples;