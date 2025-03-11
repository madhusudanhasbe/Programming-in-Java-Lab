# Java Assignment 3
## Objective: 
**Create a Student class describing attributes of a student like PRN, name, DOB, marks etc. Create an array of objects of Student class and perform operations like add students, display, search (by PRN, by name, by position), update/edit and delete.**
### Main Class
Methods:
- ```main(String[] args)```: This method runs a menu-driven program to interact with the `StudentFunctions` class.
### Student Class
This class represents a student with fields for PRN, name, date of birth, and marks. It includes getter and setter methods for these fields.
### StudentFunctions Class
This class contains an ArrayList of `Student` objects and methods to manipulate this list.
Methods:
- `addStudent()`: Prompts the user to enter the PRN, name, date of birth, and marks for a new student. The student is then added to the list.
- `displayStudents()`: Displays all the students in the list and their details.
- `searchStudent()`: Prompts the user to enter a PRN. Their details are displayed if a student with the entered PRN is found. Otherwise, a "Student not found!" message is displayed.
- `updateStudent()`: Prompts the user to enter a PRN. If a student with the entered PRN is found, the user is prompted to enter new values for the name, date of birth, and marks. The student's details are then updated.
- `deleteStudent()`: Prompts the user to enter a PRN. If a student with the entered PRN is found, they are removed from the list.
