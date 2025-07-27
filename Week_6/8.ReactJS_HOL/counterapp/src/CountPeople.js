import React, { Component } from 'react';
import './App.css';

class CountPeople extends Component {
    constructor(props) {
        super(props);
        this.state = {
            entryCount : 0,
            exitCount : 0
        };
    }

    updateEntry = () => {
        this.setState(prevState => ({
            entryCount : prevState.entryCount + 1
        }));
    };

    updateExit = () => {
        this.setState(prevState => ({
            exitCount : prevState.exitCount + 1
        }));
    };

    render() {
        return (
            <div className = "center">
                <div className = "box">
                    <button onClick = {this.updateEntry} className = "btn">Login</button>
                    <span className = "msg"> {this.state.entryCount} People Entered!!</span>
                </div>

                <div className = "box">
                    <button onClick = {this.updateExit} className = "btn">Exit</button>
                    <span className = "msg"> {this.state.exitCount} People Left!!</span>
                </div>
            </div>
        );
    }
}

export default CountPeople;