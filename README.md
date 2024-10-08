## Exercise: Employee Database

### Objective:
The objective of this exercise is to practice using Java's Predicate and Function interfaces to filter and transform data within an employee database. You will create methods to filter and transform employee information efficiently using these interfaces.

### Instructions:

### Filter Employees
-	Create a method named filterEmployees that takes a list of employees and a Predicate<Employee> as parameters.
-	Use the provided Predicate to filter employees based on specific criteria (e.g., salary range, department etc.).
-	Return a new list containing the filtered employees.

### Transform Employee Names
-	Create a method named transformEmployeeNames that takes a list of employees and a Function<Employee, String> as parameters.
-	Use the provided Function to transform employee names by concatenating "Mr." or "Ms." based on the employee's gender.
-	Return a new list with the transformed employee names.
