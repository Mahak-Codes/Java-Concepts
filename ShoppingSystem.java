/*Build a Java program for a simple online shopping system. Design a class hierarchy
representing different products: Product (base class), Electronics, Clothing, and
Books (subclasses). Use interfaces like Discountable and Shippable for products
that can have discounts and shipping options. Implement dynamic method
dispatch to display product details and calculate final costs based on discounts
and shipping methods.*/
package BasicsOfJava;
interface Discountable {
    double calculateDiscount();
}

interface Shippable {
    double calculateShippingCost();
}



// Base class for all products
class Product {
    protected String name;
    protected double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void displayDetails() {
        System.out.println("Product: " + name);
        System.out.println("Price: $" + price);
    }
}

// Subclass for electronic products
class Electronics extends Product implements Discountable, Shippable {
    private double discount;
    private double shippingCost;

    public Electronics(String name, double price, double discount, double shippingCost) {
        super(name, price);
        this.discount = discount;
        this.shippingCost = shippingCost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Discount: " + discount + "%");
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Final Price: $" + calculateFinalCost());
    }

    @Override
    public double calculateDiscount() {
        return price * (discount / 100);
    }

    @Override
    public double calculateShippingCost() {
        return shippingCost;
    }

    public double calculateFinalCost() {
        return price - calculateDiscount() + calculateShippingCost();
    }
}

// Subclass for clothing products
class Clothing extends Product implements Discountable, Shippable {
    private double discount;
    private double shippingCost;

    public Clothing(String name, double price, double discount, double shippingCost) {
        super(name, price);
        this.discount = discount;
        this.shippingCost = shippingCost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Discount: " + discount + "%");
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Final Price: $" + calculateFinalCost());
    }

    @Override
    public double calculateDiscount() {
        return price * (discount / 100);
    }

    @Override
    public double calculateShippingCost() {
        return shippingCost;
    }

    public double calculateFinalCost() {
        return price - calculateDiscount() + calculateShippingCost();
    }
}

// Subclass for book products
class Books extends Product implements Discountable, Shippable {
    private double discount;
    private double shippingCost;

    public Books(String name, double price, double discount, double shippingCost) {
        super(name, price);
        this.discount = discount;
        this.shippingCost = shippingCost;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Discount: " + discount + "%");
        System.out.println("Shipping Cost: $" + shippingCost);
        System.out.println("Final Price: $" + calculateFinalCost());
    }

    @Override
    public double calculateDiscount() {
        return price * (discount / 100);
    }

    @Override
    public double calculateShippingCost() {
        return shippingCost;
    }

    public double calculateFinalCost() {
        return price - calculateDiscount() + calculateShippingCost();
    }
}

public class ShoppingSystem {
    public static void main(String[] args) {
        Electronics laptop = new Electronics("Laptop", 50000.0, 10.0, 20.0);
        Clothing shirt = new Clothing("T-Shirt", 200.0, 5.0, 5.0);
        Books novel = new Books("Novel", 150.0, 15.0, 3.0);

        System.out.println("Product Details:");
        System.out.println("======================");
        laptop.displayDetails();
        System.out.println("======================");
        shirt.displayDetails();
        System.out.println("======================");
        novel.displayDetails();
        System.out.println("======================");
    }
}


