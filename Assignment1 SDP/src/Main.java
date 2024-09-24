public class Main{
    public static void main(String[] args) {
        Product a = new ElectronicsProduct(100);
        Product b = new FoodProduct(100);
        Product c = new ClothingProduct(100);
        Product d = new HouseholdProduct(100);
        System.out.println();
        System.out.println(DiscountCalculator.calculateDiscount(a));
        System.out.println(DiscountCalculator.calculateDiscount(b));
        System.out.println(DiscountCalculator.calculateDiscount(c));
        System.out.println(DiscountCalculator.calculateDiscount(d));
    }

}