const user = {
  name: "Alice",
  age: 25,
  email: "alice@example.com"
};

for (const key in user) {
  if (user.hasOwnProperty(key)) {
    console.log(`${key}: ${user[key]}`);
  }
}
