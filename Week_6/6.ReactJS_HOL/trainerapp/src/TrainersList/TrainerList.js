import React from 'react';
import { Link } from 'react-router-dom';
import trainersMock from '../TrainersMock';

const TrainersList = () => {
    return (
        <div>
            <h2> Trainers List </h2>
                <ul>
                    {trainersMock.map((trainer) => (
                        <li key = {trainer.id}>
                            <Link to = {`/trainer/${trainer.id}`}> {trainer.name}</Link>
                        </li>
                    ))}
                </ul>
        </div>
    );
};

export default TrainersList;