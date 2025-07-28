import React from 'react';
import LoggedInGreeting from './LoggedInGreeting';
import LoggedOutGreeting from './LoggedOutGreeting';

function Greetings(props) {
    const isLoggedIn = props.isLoggedIn;

    if(isLoggedIn) {
        return <LoggedInGreeting />;
    }

    return <LoggedOutGreeting />;
}

export default Greetings;