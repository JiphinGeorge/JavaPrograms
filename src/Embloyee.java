import java.util.Scanner;

class Netsalary {
    int empid;
    String name, designation, dept;

    public Netsalary(int empid, String name, String designation, String dept) {
        this.empid = empid;
        this.name = name;
        this.designation = designation;
        this.dept = dept;
    }

    void displayemployeedetails() {
        System.out.println("Employee ID: " + empid);
        System.out.println("Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + dept);
    }
}

class Salary1 extends Netsalary {
    double basic, hra, da, allowance, pf;

    public Salary1(int empid, String name, String designation, String dept, double basic) {
        super(empid, name, designation, dept);
        this.basic = basic;
        this.hra = 1250;
        this.da = 1.10 * basic;
        this.allowance = 0.35 * basic;
        this.pf = 0.12 * basic;
    }

    public double computeNetsalary() {
        return (basic + hra + da + allowance - pf);
    }

    public void displaysalarydetails() {
        displayemployeedetails();
        System.out.println("Basic Salary: " + basic);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("PF: " + pf);
        System.out.println("Net Salary: " + computeNetsalary());
    }
}

public class Embloyee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Employee ID:");
        int empid = sc.nextInt();
        sc.nextLine();  // Consume the newline character
        
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter Designation:");
        String designation = sc.nextLine();
        
        System.out.println("Enter Department:");
        String dept = sc.nextLine();  // Added department input
        
        System.out.println("Enter Basic Salary:");
        double basic = sc.nextDouble();
        
        Salary1 emp = new Salary1(empid, name, designation, dept, basic); // Changed to Salary1
        emp.displaysalarydetails();
        
    
    }
}
