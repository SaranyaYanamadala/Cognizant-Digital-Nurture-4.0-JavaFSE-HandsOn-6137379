import React, { useState } from 'react';
import Greetings from './Greetings';

function App() {
  const [isLoggedIn, setIsLoggedIn] = useState(false);

  const handleLogin  = () => setIsLoggedIn(true);
  const handleLogout = () => setIsLoggedIn(false);

  return (
    <div>
      <h1> Ticket Booking App </h1>
      <Greetings isLoggedIn = {isLoggedIn} />
      <br />
      {isLoggedIn ? (
        <button onClick = {handleLogout}> Logout </button>
      ) : (
        <button onClick = {handleLogin}> Login </button>
      )}
    </div>
  );
}



export default App;