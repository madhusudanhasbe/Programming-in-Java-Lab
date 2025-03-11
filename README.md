# Java Assignment 2
## Part 1: 
**Write a Java program that declares two arrays named 'even' and 'odd'. Accept numbers from the user and move them to respective arrays depending on whether they are even or odd.**
## Part 2:
**Implement a Java method that finds two neighboring numbers in an array with the smallest distance to each. The function should return the index of the 1st number.**
## Part 3:
**Write a Java program to convert an array into ArrayList and vice versa.**
### Main Class
Methods:
- ```main(String[] args)```: This is the main method of the class. It creates instances of the ```Input``` and ```Methods``` classes, calls the ```ArraySorter``` method to sort numbers into even and odd, calls the ```findClosestPair``` method to find the closest pair of numbers in an array, and calls the ```ArrayConverter``` method to convert an array to an ArrayList and vice versa.
### Input Class
The Input class contains methods for taking input from the user in various ways and calculating the factorial of a number.
Methods: 
- ```inputNumberArray()```: This method prompts the user to enter the size of the array and then the elements of the array. It returns the array of numbers.
### Methods Class
The Methods class contains methods for sorting numbers into even and odd, finding the closest pair of numbers in an array, and converting an array to an ArrayList and vice versa.
Methods:
- ```ArraySorter()```: This method sorts numbers into even and odd arrays. It prints the even and odd numbers of the array.
- ```findClosestPair(double[] numbers)```: This method finds the closest pair of numbers in an array. It returns the index of the first number of the closest pair.
- ```ArrayConverter()```: This method converts an array to an ArrayList and vice versa. It prints the ArrayList and the new array.
