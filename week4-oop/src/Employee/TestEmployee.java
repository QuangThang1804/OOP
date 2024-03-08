package Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee1 = new Employee(8, "Peter", "Tan", 2500);
        System.out.println(employee1.toString());

        employee1.setSalary(999);
        System.out.println(employee1.toString());
        System.out.println("id is: " + employee1.getId());
        System.out.println("firstName is: " + employee1.getFirstName());
        System.out.println("lastName is: " + employee1.getLastName());
        System.out.println("salary is: " + employee1.getSalary());
        System.out.println("name is: " + employee1.getName());
        System.out.println("annual salary is: " + employee1.getAnnualSalary());

        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1);
    }
}
