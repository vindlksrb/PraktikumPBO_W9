// Superclass
class Employee {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public double calculateSalary() {
        return 0.0; // Default
    }

    public double calculateSalary(boolean withBonus) {
        return calculateSalary(); // Default
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: " + calculateSalary());
    }
}

// Subclass: Software Engineer
class SoftwareEngineer extends Employee {
    SoftwareEngineer(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 8000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() + 1000000 : calculateSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("Software Engineer");
        super.displayInfo();
    }
}

// Subclass: Data Scientist
class DataScientist extends Employee {
    DataScientist(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 9000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() + 1500000 : calculateSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("Data Scientist");
        super.displayInfo();
    }
}

// Subclass: Intern
class Intern extends Employee {
    Intern(String name) {
        super(name);
    }

    @Override
    public double calculateSalary() {
        return 3000000;
    }

    @Override
    public double calculateSalary(boolean withBonus) {
        return withBonus ? calculateSalary() + 500000 : calculateSalary();
    }

    @Override
    public void displayInfo() {
        System.out.println("Intern");
        super.displayInfo();
    }
}

// Class Main
public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new SoftwareEngineer("Akbar"),
            new DataScientist("Gerald"),
            new Intern("Irfan")
        };

        System.out.println("=== POLYMORPHIC DISPLAY ===");
        for (Employee emp : employees) {
            emp.displayInfo();
            System.out.println();
        }

        System.out.println("=== CALLING calculateSalary(true) (tanpa polymorphism) ===");
        for (Employee emp : employees) {
            System.out.println(emp.name + " Total Salary: " + emp.calculateSalary(true));
        }
    }
}

