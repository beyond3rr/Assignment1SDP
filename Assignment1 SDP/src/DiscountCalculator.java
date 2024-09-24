class DiscountCalculator {
    public static double calculateDiscount(Product product) {
        return product.getDiscount();
    }

}
class FoodProduct implements Product{

    public double price;

    public FoodProduct(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return 0.05;
    }

}
class ElectronicsProduct implements Product{

    public double price;

    public ElectronicsProduct(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return 0.1;
    }

}
class ClothingProduct implements Product{

    public double price;

    public ClothingProduct(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return 0.2;
    }

}
class HouseholdProduct implements Product{

    public double price;

    public HouseholdProduct(double price) {
        this.price = price;
    }

    public double getDiscount() {
        return 0.25;
    }

}
