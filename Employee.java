class Employee {
    private String name;
    private double salary;
    private String department;
    private String gender;

    public Employee(String name, double salary, String department, String gender) {
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + ", Salary: $" + salary + ", Department: " + department;
    }
}