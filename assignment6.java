class Cart {

    // Single item
    double calculateTotal(double price) {
        return price;
    }

    // Multiple items of same type
    double calculateTotal(double price, int quantity) {
        return price * quantity;
    }

    // With discount
    double calculateTotal(double price, int quantity, double discount) {
        double total = price * quantity;
        return total - (total * discount / 100);
    }

    public static void main(String[] args) {
        Cart c = new Cart();

        System.out.println("Single item: Rs. " + c.calculateTotal(500));

        System.out.println("Multiple items: Rs. " +
                           c.calculateTotal(500, 3));

        System.out.println("After discount: Rs. " +
                           c.calculateTotal(500, 3, 10));
    }
}