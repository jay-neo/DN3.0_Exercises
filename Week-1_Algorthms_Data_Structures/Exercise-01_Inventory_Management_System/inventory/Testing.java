package inventory;

class Testing {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        // Adding products
        Product product1 = new Product("P001", "Laptop", 10, 999.99);
        Product product2 = new Product("P002", "Smartphone", 20, 599.99);
        inventory.addProduct(product1);
        inventory.addProduct(product2);

        // Updating a product
        product1.setQuantity(15);
        inventory.updateProduct(product1);

        // Retrieving a product
        Product retrievedProduct = inventory.getProduct("P001");
        System.out.println("Retrieved Product: " + retrievedProduct.getProductName() + ", Quantity: " + retrievedProduct.getQuantity());

        // Deleting a product
        inventory.deleteProduct("P002");
    }
}
