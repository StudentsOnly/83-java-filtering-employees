import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class EmployeeDatabase {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("John Smith", 50000, "R&D", "Male"),
                new Employee("Jane Smith", 60000, "Marketing", "Female"),
                new Employee("Dina Davis", 75000, "R&D", "Female"),
                new Employee("Jim Brown", 40000, "Sales", "Male"),
                new Employee("Eva Brown", 35000, "HR", "Female")
        );

        System.out.println("\nInitial list of Employees:\n");
        employees.forEach(System.out::println);

        List<Employee> filteredEmployees = filterEmployees(employees, emp -> "R&D".equals(emp.getDepartment()));
        System.out.println("\nFiltered employees in R&D department:\n");
        filteredEmployees.forEach(System.out::println);

        List<String> transformedNames = transformEmployeeNames(employees, emp ->
                "Male".equalsIgnoreCase(emp.getGender()) ? "Mr. " + emp.getName() : "Ms. " + emp.getName());
        System.out.println("\nTransformed employee names:\n");
        transformedNames.forEach(System.out::println);


    }

    private static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> criteria) {
        List<Employee> filteredList = new ArrayList<>();
        employees.forEach(emp -> {
            if (criteria.test(emp)) {
                filteredList.add(emp);
            }
        });
        return filteredList;
    }

    private static List<String> transformEmployeeNames(List<Employee> employees, Function<Employee, String> transformer) {
        List<String> transformedNames = new ArrayList<>();
        employees.forEach(emp -> transformedNames.add(transformer.apply(emp)));
        return transformedNames;
    }
}
