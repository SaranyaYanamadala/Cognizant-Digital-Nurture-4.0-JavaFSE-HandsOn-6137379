import React from 'react';

function IndianPlayers() {
  const allPlayers = [
    "Sachin", "Dravid", "Sehwag", "Dhoni", "Kohli", "Rohit"
  ];

  const oddPlayers = allPlayers.filter((_, index) => index % 2 === 0);
  const evenPlayers = allPlayers.filter((_, index) => index % 2 !== 0);

  const [odd1, odd2, odd3] = oddPlayers;
  const [even1, even2, even3] = evenPlayers;

  const T20players = ["Surya", "Pant"];
  const RanjiTrophy = ["Jaiswal", "Rahane"];
  const merged = [...T20players, ...RanjiTrophy];

  return (
    <div>
      <h2>Odd Team Players</h2>
      <ul>
        <li>{odd1}</li>
        <li>{odd2}</li>
        <li>{odd3}</li>
      </ul>

      <h2>Even Team Players</h2>
      <ul>
        <li>{even1}</li>
        <li>{even2}</li>
        <li>{even3}</li>
      </ul>

      <h2>Merged Players (T20 + Ranji Trophy)</h2>
      <ul>
        {merged.map((p, i) => (
          <li key={i}>{p}</li>
        ))}
      </ul>
    </div>
  );
}

export default IndianPlayers;
