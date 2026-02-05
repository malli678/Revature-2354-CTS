// Functional Interface
interface DiscountRule {
    double apply(double amount);
}

// Service class
class DiscountService {
    public double finalAmount(double amount, DiscountRule rule) {
        return amount - rule.apply(amount);
    }
}

// Main class
public class FunctionalInterfaceDemo {

    public static void main(String[] args) {

        DiscountService service = new DiscountService();

        // Lambda expressions
        DiscountRule festivalDiscount = amount -> amount * 0.10;
        DiscountRule premiumDiscount = amount -> amount * 0.15;

        double price = 2000;

        System.out.println("Original price: " + price);

        System.out.println(
            "After Festival Discount: " +
            service.finalAmount(price, festivalDiscount)
        );

        System.out.println(
            "After Premium Discount: " +
            service.finalAmount(price, premiumDiscount)
        );
    }
}
