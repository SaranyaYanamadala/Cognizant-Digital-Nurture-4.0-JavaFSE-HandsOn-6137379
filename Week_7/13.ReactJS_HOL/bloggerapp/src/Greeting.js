import React from 'react';

function Greeting({ type }) {
    if(type === 'book') {
        return <h2> Welcome to the Book Details </h2>;
    } else if(type === 'blog') {
        return <h2> Welcome to Blog Details </h2>;
    } else if(type === 'course') {
        return <h2> Welcome to Course Details </h2>;
    } else {
        return <h2> Please choose a category category </h2>;
    }
}

export default Greeting;