import React from 'react';
import './App.css';
import CourseDetails from './CourseDetails';
import BookDetails from './BookDetails';
import BlogDetails from './BlogDetails';

function App() {
  return (
    <div className="App">
      <div className="container">
        <CourseDetails />
        <div className="divider"></div>
        <BookDetails />
        <div className="divider"></div>
        <BlogDetails />
      </div>
    </div>
  );
}

export default App;
