function isPalindrome(str) {
  const cleaned = str.toLowerCase().replace(/[^a-z0-9]/g, '');
  
  const reversed = cleaned.split('').reverse().join('');
  
  return cleaned === reversed;
}

console.log("madam :-", isPalindrome("madam"));      
console.log("racecar :-", isPalindrome("racecar"));    
console.log("hello :-", isPalindrome("hello"));      
console.log("A man, a plan, a canal: Panama :-", isPalindrome("A man, a plan, a canal: Panama")); 
