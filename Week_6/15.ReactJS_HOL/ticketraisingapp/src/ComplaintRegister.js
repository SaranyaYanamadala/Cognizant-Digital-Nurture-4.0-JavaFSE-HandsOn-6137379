import React, { useState } from 'react';

function ComplaintRegister() {
  const [employeeName, setEmployeeName] = useState('');
  const [complaint, setComplaint] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    const transactionId = Math.floor(Math.random() * 1000);
    alert(
      `Thanks ${employeeName}\nYour Complaint was Submitted.\nTransaction ID is: ${transactionId}`
    );
    setEmployeeName('');
    setComplaint('');
  };

  return (
    <div style={{ textAlign: 'center', marginTop: '40px' }}>
      <h2 style={{ color: 'red' }}>Register your complaints here!!!</h2>
      <form
        onSubmit={handleSubmit}
        style={{
          display: 'inline-block',
          textAlign: 'left',
          border: '1px solid lightgray',
          padding: '20px 30px',
          borderRadius: '8px',
          backgroundColor: '#f9f9f9',
        }}
      >
        <div style={{ marginBottom: '15px' }}>
          <label style={{ display: 'inline-block', width: '100px' }}>Name:</label>
          <input
            type="text"
            value={employeeName}
            onChange={(e) => setEmployeeName(e.target.value)}
            required
            style={{ padding: '5px', width: '250px' }}
          />
        </div>
        <div style={{ marginBottom: '15px' }}>
          <label style={{ display: 'inline-block', width: '100px' }}>Complaint:</label>
          <textarea
            value={complaint}
            onChange={(e) => setComplaint(e.target.value)}
            required
            rows="3"
            style={{ padding: '5px', width: '250px' }}
          ></textarea>
        </div>
        <div style={{ textAlign: 'center' }}>
          <button type="submit" style={{ padding: '6px 14px' }}>
            Submit
          </button>
        </div>
      </form>
    </div>
  );
}

export default ComplaintRegister;
