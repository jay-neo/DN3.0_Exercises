package ecommerce;

class Testing {
    public static void main(String[] args) {
        Order[] orders = {
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 300.20),
            new Order("O004", "Diana", 200.00)
        };

        System.out.println("Original Orders:");
        printOrders(orders);

        // Bubble Sort
        SortingAlgorithms.bubbleSort(orders);
        System.out.println("\nOrders Sorted by Bubble Sort:");
        printOrders(orders);

        // Reinitialize orders for quick sort test
        orders = new Order[]{
            new Order("O001", "Alice", 250.50),
            new Order("O002", "Bob", 150.75),
            new Order("O003", "Charlie", 300.20),
            new Order("O004", "Diana", 200.00)
        };

        // Quick Sort
        SortingAlgorithms.quickSort(orders, 0, orders.length - 1);
        System.out.println("\nOrders Sorted by Quick Sort:");
        printOrders(orders);
    }

    public static void printOrders(Order[] orders) {
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
