import React from "react";
import EventExamples from "./EventExamples";
import CurrencyConverter from "./CurrencyConverter";

function App() {
  return (
    <div className="App">
      <h1>🎯 Event Examples App</h1>
      <EventExamples />
      <hr />
      <CurrencyConverter />
    </div>
  );
}

export default App;