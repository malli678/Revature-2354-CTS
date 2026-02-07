import java.util.Scanner;

class User1 {
    String username;

    void login() {
        System.out.println(username + " is logged in");
    }
}

class Employee1 extends User1 {
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

class Manager1 extends Employee1 {
    void approveLeave() {
        System.out.println(name + " approved leave");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args) {
        Manager1 m1 = new Manager1();

        m1.username = "Admin";
        m1.login();
        m1.work();
        m1.approveLeave();
    }
}
