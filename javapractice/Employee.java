package javapractice;

public class Employee {

    public String empName;
    public int empid;
    public String department;
    public double empsalary;

    public static void main(String[] args) {

        Employee obj = new Employee();

        obj.setDetails("Jeya", 101, "Testing", 20000);
        obj.displayDetails();

        obj.increaseSalary(10);   // 10% increment
        System.out.println("After Increment:");
        obj.displayDetails();

        Employee obj2 = new Employee();
        obj2.setDetails("Arun", 102, "Automation", 30000);
        obj2.displayDetails();
    }

    public void setDetails(String name, int id, String dept, double salary) {
        empName = name;
        empid = id;
        department = dept;
        empsalary = salary;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee ID: " + empid);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + empsalary);
        System.out.println("---------------------");
    }

    public void increaseSalary(double percentage) {
        empsalary = empsalary + (empsalary * percentage / 100);
    }
}
