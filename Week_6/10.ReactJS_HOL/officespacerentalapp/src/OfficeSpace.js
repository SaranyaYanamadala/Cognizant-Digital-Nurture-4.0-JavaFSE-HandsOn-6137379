import React from "react";

function OfficeSpace() {
  const imageUrl = "https://tse1.mm.bing.net/th/id/OIP.EKRASV9_SODtSXva45XuVwHaE7?rs=1&pid=ImgDetMain&o=7&rm=3";

  // Single object
  const office = {
    name: "Corporate Hub",
    rent: 55000,
    address: "12th Main Road, Chennai"
  };

  // List of offices
  const officeList = [
    { name: "Tech Park", rent: 75000, address: "Whitefield, Bangalore", image: "https://i.pinimg.com/originals/0c/e5/73/0ce573d1f7d0e1a25f5cb7c1369e0443.jpg" },
    { name: "Startup Arena", rent: 58000, address: "Hitech City, Hyderabad", image: "https://i.pinimg.com/originals/2f/0a/f1/2f0af1c5bcc25af712cfc1c74df20293.jpg" },
    { name: "Innovation Tower", rent: 90000, address: "Cyberhub, Gurgaon", image: "https://southgaterealtyllc.com/wp-content/uploads/2017/12/shutterstock_735875389.jpg" },
    { name: "Biz Center", rent: 45000, address: "MG Road, Pune", image: "https://img.freepik.com/premium-photo/modern-city-office-3d-space-illustration_672509-2004.jpg"}
  ];

  return (
    <div>
      <img src={imageUrl} alt="Office Space" width="300" height="200" />

      <h2>Featured Office</h2>
      <p><strong>Name:</strong> {office.name}</p>
      <p>
        <strong>Rent:</strong>{" "}
        <span style={{ color: office.rent > 60000 ? "green" : "red" }}>
          ₹{office.rent}
        </span>
      </p>
      <p><strong>Address:</strong> {office.address}</p>

      <hr />

      <h2>Available Office Spaces</h2>
      <ul>
        {officeList.map((space, index) => (
          <li key={index} style={{ marginBottom: '20px', listStyleType: 'none' }}>
            <img
                src={space.image}
                alt={space.name}
                width="300"
                height="200"
                style={{ borderRadius: '10px', marginBottom: '10px' }}
            />
            <p><strong>Name:</strong> {space.name}</p>
            <p>
              <strong>Rent:</strong>{" "}
              <span style={{ color: space.rent > 60000 ? "green" : "red" }}>
                ₹{space.rent}
              </span>
            </p>
            <p><strong>Address:</strong> {space.address}</p>
            <hr />
          </li>
        ))}
      </ul>
    </div>
  );
}

export default OfficeSpace;
