// DevOpsEngineer class extending Employee
public class DevOpsEngineer extends Employee {
    double bonus;

    public DevOpsEngineer(String name, int empId, double salary, double bonus) {
        super(name, empId, salary);
        this.bonus = bonus;
    }

    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        double totalSalary = salary + bonus;
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + totalSalary);
    }

    public static void main(String[] args) {
        // Creating a DevOpsEngineer object
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Jane Smith", 1002, 70000.0, 5000.0);

        // Displaying DevOps engineer details
        System.out.println("DevOps Engineer Details:");
        devOpsEngineer.displayEmployeeDetails();
    }
}