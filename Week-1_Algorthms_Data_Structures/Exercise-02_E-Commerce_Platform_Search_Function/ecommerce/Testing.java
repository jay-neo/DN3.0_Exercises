package ecommerce;

class Testing {
    public static void main(String[] args) {
        Product[] products = {
            new Product("P001", "Laptop", "Electronics"),
            new Product("P002", "Smartphone", "Electronics"),
            new Product("P003", "Tablet", "Electronics"),
            new Product("P004", "Headphones", "Accessories")
        };

        // Test Linear Search
        int linearSearchResult = SearchAlgorithms.linearSearch(products, "Tablet");
        if (linearSearchResult != -1) {
            System.out.println("Product found at index (Linear Search): " + linearSearchResult);
        } else {
            System.out.println("Product not found (Linear Search)");
        }

        // Sort products for Binary Search
        SearchAlgorithms.sortProductsByName(products);

        // Test Binary Search
        int binarySearchResult = SearchAlgorithms.binarySearch(products, "Tablet");
        if (binarySearchResult != -1) {
            System.out.println("Product found at index (Binary Search): " + binarySearchResult);
        } else {
            System.out.println("Product not found (Binary Search)");
        }
    }
}
