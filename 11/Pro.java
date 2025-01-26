class Product {
    String name;
    double price;
    int quantity;

    Product(String nam, double price, int quantity) {
        this.name = nam;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProductDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    double calculateTotalCost() {
        return price * quantity;
    }
}

public class Pro {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 799.99, 2);

        product.displayProductDetails();

        double totalCost = product.calculateTotalCost();
        System.out.println("Total Cost: $" + totalCost);
    }
}
