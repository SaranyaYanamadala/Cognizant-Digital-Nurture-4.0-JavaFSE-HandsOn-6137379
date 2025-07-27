//import logo from './logo.svg';
import './App.css';
import React from 'react';
import { BrowserRouter, Routes, Route, Link} from 'react-router-dom';
import Home from "./Home/Home";
import TrainersList from "./TrainersList/TrainerList";
import TrainerDetail from './TrainerDetail/TrainerDetail';


function App() {
  return (
    <BrowserRouter>
      <div className = "App">
        <header>
          <h1> My Academy Trainers App </h1>
          <nav>
            <Link to = "/"> Home </Link> | <Link to = "/trainers"> Show Trainers </Link>
          </nav>
        </header>

        <Routes>
          <Route path = "/" element = {<Home />} />
          <Route path = "/trainers" element = {<TrainersList />} />
          <Route path = "/trainer/:id" element = {<TrainerDetail />} />
        </Routes>

      </div>
    </BrowserRouter>
  );
}

export default App;
