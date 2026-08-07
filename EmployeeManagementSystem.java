// ---------- Bonus class: fixed bonus, locked against changes/inheritance ----------
// 'final' on the class stops anyone from extending it (no subclassing).
// 'final' on the method is technically redundant once the class itself is
// final (a final class's methods can't be overridden anyway), but it's kept
// here to make the intent explicit: this value is not meant to be touched.
final class Bonus {
    private final double fixedBonusAmount = 5000.0;

    public final double getBonusAmount() {
        return fixedBonusAmount;
    }
}

// ---------- Employee class: base entity ----------
class Employee {
    protected String employeeName;
    protected double basicSalary;

    public Employee(String employeeName, double basicSalary) {
        // 'this' explicitly ties the parameter to the instance variable,
        // avoiding any ambiguity since the parameter names match the fields
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
    }

    public void displayDetails() {
        System.out.println("Employee Name : " + this.employeeName);
        System.out.println("Basic Salary  : Rs. " + this.basicSalary);
    }
}

// ---------- Manager class: IS-A Employee, adds department + bonus ----------
class Manager extends Employee {
    private String department;
    private Bonus managerBonus;

    public Manager(String employeeName, double basicSalary, String department) {
        // Reuses Employee's constructor instead of re-assigning
        // employeeName/basicSalary directly — avoids duplicating logic
        super(employeeName, basicSalary);
        this.department = department;
        this.managerBonus = new Bonus();
    }

    @Override
    public void displayDetails() {
        super.displayDetails(); // reuse Employee's display logic, then extend it
        System.out.println("Department    : " + this.department);
        System.out.println("Bonus         : Rs. " + this.managerBonus.getBonusAmount());
        double totalPay = this.basicSalary + this.managerBonus.getBonusAmount();
        System.out.println("Total Pay     : Rs. " + totalPay);
    }
}

// ---------- Demonstration ----------
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee regularEmployee = new Employee("Ravi Patel", 35000.0);
        Manager departmentManager = new Manager("Ansh Mehta", 60000.0, "Software Engineering");

        System.out.println("=== Employee Details ===");
        regularEmployee.displayDetails();

        System.out.println("\n=== Manager Details ===");
        departmentManager.displayDetails();
    }
}