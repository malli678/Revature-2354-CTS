import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + salary;
    }
}

public class LambdaWithCollectionDemo {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(101, "Sam", 78000),
            new Employee(102, "Tina", 38000),
            new Employee(103, "Yash", 58000),
            new Employee(104, "Peter", 78000)
        );

        // Predicate to check bonus eligibility
        //Predicate: A functional interface.  Has one method.:
        Predicate<Employee> eligibleForBonus = e -> e.salary > 50000;

        for (Employee e : employees) {
            if (eligibleForBonus.test(e)) {
                System.out.println(e.name + " is eligible for bonus");
            }
        }
    }
}
