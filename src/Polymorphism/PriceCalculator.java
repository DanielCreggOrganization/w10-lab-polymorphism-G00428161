package Polymorphism;

// PriceCalculator.java

public class PriceCalculator {

    // Method 1: Regular price with no discount
    public double calculatePrice(double basePrice) {
        return basePrice;
    }

    // Method 2: Price after applying percentage discount
    public double calculatePrice(double basePrice, double discountPercent) {
        return basePrice * (1 - discountPercent / 100);
    }

    // Method 3: Price with student discount ($5 off if valid ID)
    public double calculatePrice(double basePrice, boolean hasStudentId) {
        if (hasStudentId) {
            return basePrice - 5.00; // Subtract $5 for student discount
        } else {
            return basePrice;
        }
    }

    // Method 4: Price with both percentage discount and student discount
    public double calculatePrice(double basePrice, double discountPercent, boolean hasStudentId) {
        double priceAfterDiscount = basePrice * (1 - discountPercent / 100);
        if (hasStudentId) {
            priceAfterDiscount -= 5.00; // Subtract $5 for student discount
        }
        return priceAfterDiscount;
    }
}
