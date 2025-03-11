# Java Assignment 6
## Part 1: 
**Implementation of Fixed and Growable Stack using Interface_STK**
### Main Class
Methods:
- ```main(String[] args)```: This is the class's main method. It includes a menu-driven program that allows the user to interact with either a `Fixed_STK` or a `Growable_STK`. The user can choose to push an element onto the stack, pop an element from the stack, display the stack, or exit the program.
### Interface
`Interface_STK` is an interface that declares the following:
Methods:
- `push(int element)`: Pushes an element onto the stack.
- `pop()`: Pops an element from the stack.
- `displayStack()`: Displays the contents of the stack.
- `isOverflow()`: Checks if the stack is full.
- `isUnderflow()`: Checks if the stack is empty.
### Fixed_STK Class
This class implements a fixed-size stack. The size of the stack is determined at the time of creation and cannot be changed afterwards. It implements the `Interface_STK` interface.
### Growable_STK Class
This class implements a growable stack. The stack starts with an initial size, but it can grow as needed when more elements are pushed onto the stack. It implements the `Interface_STK` interface as well.
## Part 2:
**Create a program showing the implementation of the multiple inheritance of class Result, which extends class Student and implements interface Exam.**
### Main Class
Methods:
- ```main(String[] args)```: This is the class's main method. It includes a simple interactive program that prompts the user to enter a student's details, creates a `Result` object with these details, and displays the student's details along with the calculated percentage.
### Interface
`Exam` is an interface that declares the following:
Methods:
- `percent_cal()`: For calculating the percentage of marks.
### Student Class
This class represents a student with fields for roll number, name, and marks for two subjects.
### Result Class
This class extends the `Student` class and implements the `Exam` interface. 
Methods:
- `percent_cal()`: It overrides the `percent_cal()` method to calculate the percentage based on the marks of two subjects.
- `displayExamResults()`: It displays the student's details and calculated percentage.
