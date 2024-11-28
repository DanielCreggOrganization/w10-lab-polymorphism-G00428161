package Polymorphism;

// Main.java

public class Main {
    public static void main(String[] args) {
        // Create an instance of PriceCalculator
        PriceCalculator calculator = new PriceCalculator();
        
        // Define the base price of the item
        double basePrice = 50.00;

        // No discount
        double priceNoDiscount = calculator.calculatePrice(basePrice);
        System.out.println("Price with no discount: $" + priceNoDiscount);

        // 10% discount
        double priceWithDiscount = calculator.calculatePrice(basePrice, 10);
        System.out.println("Price with 10% discount: $" + priceWithDiscount);

        // Student discount (with student ID)
        double priceWithStudentDiscount = calculator.calculatePrice(basePrice, true);
        System.out.println("Price with student discount: $" + priceWithStudentDiscount);

        // 10% discount + student discount
        double priceWithBothDiscounts = calculator.calculatePrice(basePrice, 10, true);
        System.out.println("Price with 10% discount and student discount: $" + priceWithBothDiscounts);
    }
}
