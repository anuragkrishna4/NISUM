const weatherData = {
  "New York": {
    country: "USA",
    date: "Tuesday, 21 May 2025",
    temperature: "23°C - Sunny"
  },
  "London": {
    country: "UK",
    date: "Tuesday, 21 May 2025",
    temperature: "18°C - Cloudy"    
  },
  "Tokyo": {
    country: "Japan",
    date: "Tuesday, 21 May 2025",
    temperature: "27°C - Rainy"
  },
  "Delhi": {
    country: "India",
    date: "Tuesday, 21 May 2025",
    temperature: "35°C - Sunny"
  }
};

document.getElementById("cityInput").addEventListener("keypress", function (e) {
  if (e.key === "Enter") {
    const city = e.target.value.trim();
    const data = weatherData[city];

    if (data) {
      document.getElementById("cityName").textContent = `${city}, ${data.country}`;
      document.getElementById("date").textContent = data.date;
      document.getElementById("temperature").textContent = data.temperature;
      document.getElementById("weatherIcon").src = data.icon;
    } else {
      alert("Weather data not found. Try: New York, London, Tokyo, or Delhi.");
    }

    e.target.value = ""; 
  }
});
