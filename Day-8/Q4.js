class Car {
  constructor(brand, speed) {
    this.brand = brand;
    this.speed = speed;
  }

  accelerate() {
    this.speed += 10;
  }
}


const myCar = new Car('Toyota', 50);
console.log("Car Speed:-");
console.log(myCar.speed);  
myCar.accelerate();
console.log("Car Speed after acceleration:-");
console.log(myCar.speed);  
