# Java Assignment 1
## Part 1: 
**Implement a menu-driven Java program (like fib or factorial) to implement these input methods in Java (command line args, Scanner, BufferedReader, DataInputStream, Console)**
### Main Class
Methods:
- ```main(String[] args)```: This is the class's main method. It creates an instance of the Input class and a Scanner object. It then prompts the user to choose an input method and calls the appropriate method from the Input class based on the user’s choice. The result of the factorial of a number is then printed.
### Input Class
The Input class contains methods for taking input from the user in various ways and calculating the factorial of a number.
Methods: 
- ```inputUsingCommand(String[] args)```: This method takes command line arguments as input, parses the first argument to an integer, and returns the factorial of that number.
- ```inputUsingScanner()```: This method uses a Scanner object to take input from the user, parses the input to an integer and returns the factorial of that number.
- ```inputUsingBuffered()```: This method uses a BufferedReader object to take input from the user, parses the input to an integer, and returns the factorial of that number.
- ```inputUsingDataInput()```: This method uses a DataInputStream object to take input from the user, parses the input to an integer and returns the factorial of that number.
- ```inputUsingConsole()```: This method uses a Console object to take input from the user, parses the input to an integer and returns the factorial of that number.
- ```factorial(int n)```: This private method calculates and returns the factorial of a given number.
## Part 2:
**Implement a simple menu-driven calculator in Java to implement add, sub, multiplication, div, sqrt, power, mean, and variance. Implement a separate Calculator class to include all related functions inside that class. (Mean calculation: the program reads numbers from the keyboard, summing them until the user enters the string "end". It then stops input & displays the avg. of numbers)**
### Main Class
Methods:
- ```main(String[] args)```: This is the class's main method. It creates an instance of the Input and Calculator classes and a Scanner object. It then prompts the user to choose an operation and calls the appropriate method from the Calculator class based on the user’s choice. The result of the chosen operation is then printed to the console.
### Input Class
The Input class contains a method for taking two numbers as input from the user.
Methods:
- ```inputNumbers()```: This method uses a Scanner object to take two numbers as input from the user and returns them as an array of double datatype.
### Calculator Class
The Calculator class contains methods for various mathematical operations such as addition, subtraction, multiplication, division, square root, power, mean, and variance.
Methods:
- ```add(double n1, double n2)```: This method returns the sum of two numbers.
- ```sub(double n1, double n2)```: This method returns the difference of two numbers.
- ```mul(double n1, double n2)```: This method returns the product of two numbers.
- ```div(double n1, double n2)```: This method returns the division of two numbers. It checks if the denominator is zero to avoid division by zero.
- ```sqrt(double n1)```: This method returns the square root of a number.
- ```power(double n1, double n2)```: This method returns the first number raised to the power of the second number.
- ```mean()```: This method calculates and prints the mean of a series of numbers entered by the user. The user enters numbers one by one and types ‘end’ when they are finished.
- ```variance()```: This method calculates and prints the variance of a series of numbers entered by the user. The user first enters the size of the array, and then enters each number.
