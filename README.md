# Java Assignment 5
## Part 1: 
**Implement the generic Shapes class as an interface s so that we can implement concrete classes like circle, triangle, rectangle class from it**
### Main Class
Methods:
- ```main(String[] args)```: This method creates a `Circle`, `Rectangle`, and `Triangle` object, sets their dimensions, calculates their area and perimeter, and then displays these values.
### Interface
`Shapes` is an interface that represents a shape with methods to calculate the area and perimeter.
Methods:
- `area`: Returns the area of the shape.
- `perimeter()`: Returns the perimeter of the shape.
### Circle Class
This class represents a circle with a field for radius. It includes a setter method for the radius and implements the `Shapes` interface.
 Methods:
- `setRadius(double radius)`: Sets the radius of the circle.
- `area()`: Returns the area of the circle.
- `perimeter()`: Returns the circumference of the circle.
### Rectangle Class
This class represents a rectangle with fields for length and breadth. It includes a setter method for these fields and implements the `Shapes` interface.
Methods:
- `setSize(double length, double breadth)`: Sets the length and breadth of the rectangle.
- `area()`: Returns the area of the rectangle.
- `perimeter()`: Returns the perimeter of the rectangle.
### Triangle Class
This class represents a triangle with fields for the lengths of its three sides. It includes a setter method for these fields and implements the `Shapes` interface.
Methods:
- `setSide(double sideA, double sideB, double sideC)`: Sets the lengths of the three sides of the triangle.
- `area()`: Returns the area of the triangle.
- `perimeter()`: Returns the perimeter of the triangle.
## Part 2:
**Implement Employee as an abstract and derive 2 classes such as NormalEmployee and BonusEmployee from it and perform the salary calculations based on the formulas as per the sent excel attachment**
### Main Class
Methods:
- ```main(String[] args)```: This method creates a `NormalEmployee` and a `BonusEmployee` object, gets their details, calculates their salary, and then displays these values.
### Employee Abstract Class
This abstract class represents an employee with fields for employee details and methods to get and set these details.
Fields:
- Employee details such as `name, address, designation, department, date of joining, bank name, UAN, PF_NO, ESINo, employee ID, bank account number, total working days, paid days, leaves taken, loss of pay days, gross wage, net salary, total earning, total deductions, basic wage, house rent allowance, conveyance allowances, medical allowances, other allowances, employee provident fund, employee state insurance, professional tax, loan recovery`.
  
Methods:
- Getter and setter methods for all the fields.
- `salaryCalculation()`: An abstract method to calculate the salary of the employee. The implementation of this method will be provided by the classes that extend the `Employee` class.
`getEmployeeDetails()`: Prompts the user to enter the details of the employee and sets these details.
### NormalEmployee Class
This class represents a normal employee. It extends the `Employee` abstract class and provides an implementation for the `salaryCalculation()` method.
Methods:
- `salaryCalculation()`: This method calculates the salary of a normal employee. It first calculates the basic wage, house rent allowance, conveyance allowances, medical allowances, and other allowances. Then it calculates the total earnings and deductions (including employee provident fund, employee state insurance, professional tax, and loan recovery). Finally, it calculates and sets the net salary of the employee.
### BonusEmployee Class
This class represents an employee who is receiving a bonus in his/her salary. It also extends the `Employee` abstract class and provides an implementation for the `salaryCalculation()` method.
Methods:
- `salaryCalculation()`: This method calculates the salary and the bonus of an employee. It first calculates the basic wage, house rent allowance, conveyance allowances, medical allowances, and other allowances. Then it calculates the total earnings and deductions (including employee provident fund, employee state insurance, professional tax, and loan recovery). It also calculates a bonus based on the total earnings. Finally, it calculates and sets the net salary of the employee, which includes the bonus.
