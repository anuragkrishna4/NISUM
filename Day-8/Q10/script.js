document.getElementById('myForm').addEventListener('submit', function(e) {
  e.preventDefault();

  // Get input values
  const name = document.getElementById('name').value.trim();
  const email = document.getElementById('email').value.trim();
  const password = document.getElementById('password').value.trim();

  // Error span elements
  const nameError = document.getElementById('nameError');
  const emailError = document.getElementById('emailError');
  const passwordError = document.getElementById('passwordError');

  // Reset error messages
  nameError.textContent = '';
  emailError.textContent = '';
  passwordError.textContent = '';

  let valid = true;

  // Name validation
  if (name === '') {
    nameError.textContent = 'Name must not be empty.';
    valid = false;
  }

  // Email validation
  const emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
  if (!emailPattern.test(email)) {
    emailError.textContent = 'Please enter a valid email address.';
    valid = false;
  }

  // Password validation
  if (password.length < 6) {
    passwordError.textContent = 'Password must be at least 6 characters.';
    valid = false;
  }

  // Final check
  if (valid) {
    alert('Form submitted successfully!');
    // Here, you can also reset the form or perform further processing
    document.getElementById('myForm').reset();
  }
});
