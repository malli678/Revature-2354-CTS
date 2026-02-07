import java.util.Scanner;

class Employee {
    int id;
    String name;
    Scanner sc = new Scanner(System.in);

    void work() {
        System.out.println("Enter the ID of employee");
        id = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        System.out.println("Enter the name of employee");
        name = sc.nextLine();

        System.out.println(name + " is on Duty.");
    }
}

class Manager extends Employee {
    void approveLeave() {
        System.out.println(name + " approved leave");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Manager m1 = new Manager();
        m1.work();
        m1.approveLeave();
    }
}
