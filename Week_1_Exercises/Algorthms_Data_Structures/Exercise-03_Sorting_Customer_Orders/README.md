<h2 align="center">Exercise 3: Sorting Customer Orders</h2>

### Scenario: 
You are tasked with sorting customer orders by their total price on an e-commerce platform. This helps in prioritizing high-value orders.

### Steps:
1. Understand Sorting Algorithms:
    - Explain different sorting algorithms (Bubble Sort, Insertion Sort, Quick Sort, Merge Sort)

2. Setup:
    - Create a class Order with attributes like `orderId`, `customerName`, and `totalPrice`
    
3. Implementation:
    - Implement **Bubble Sort** to sort orders by `totalPrice`.
    - Implement **Quick Sort** to sort orders by `totalPrice`.

4. Analysis:
    - Compare the performance (time complexity) of Bubble Sort and Quick Sort.
    - Discuss why Quick Sort is generally preferred over Bubble Sort.




---

<h2 align="center">Solution</h2>

<table align="center">
    <tr>
        <th>Algorithm</th>
        <th>Description</th>
        <th>Time Complexity</th>
    </tr>
    <tr>
        <td>Bubble Sort</td>
        <td>
            A simple comparison-based algorithm where each pair of adjacent elements is compared and swapped if they are in the wrong order. This process is repeated until the list is sorted.
        </td>
        <td>
            Best: O(n) <br>
            Average: O(n^2) <br>
            Worst: O(n^2)
        </td>
    </tr>
    <tr>
        <td>Insertion Sort</td>
        <td>
            Builds the sorted array one item at a time, with each new element being compared to those already sorted and inserted into its correct position.
        </td>
        <td>
            Best: O(n) <br>
            Average: O(n^2) <br>
            Worst: O(n^2)
        </td>
    </tr>
    <tr>
        <td>Quick Sort</td>
        <td>
            An efficient, comparison-based algorithm that uses a divide-and-conquer strategy. It selects a pivot element and partitions the array into two halves, recursively sorting each half.
        </td>
        <td>
            Best: O(n log n) <br>
            Average: O(n log n) <br>
            Worst: O(n^2)
        </td>
    </tr>
    <tr>
        <td>Merge Sort</td>
        <td>
            Another divide-and-conquer algorithm that splits the array into halves, recursively sorts each half, and then merges the sorted halves to produce a sorted array.
        </td>
        <td>
            Best: O(n log n) <br>
            Average: O(n log n) <br>
            Worst: O(n log n)
        </td>
    </tr>
</table>



### Testing

```java
javac ./ecommerce/*.java
```

```java
java ecommerce.Testing
```

### Analysis


Time Complexity Comparison:

Bubble Sort:
- Best Case: O(n) (when the array is already sorted)
- Average Case: O(n^2)
- Worst Case: O(n^2)


Quick Sort:
- Best Case: O(n log n)
- Average Case: O(n log n)
- Worst Case: O(n^2) (when the pivot is the smallest or largest element)


Why Quick Sort is Generally Preferred Over Bubble Sort:
- Performance: Quick Sort has a significantly better average-case time complexity (O(n log n)) compared to Bubble Sort's O(n^2). This makes Quick Sort much more efficient for larger datasets.
- Practical Efficiency: Even though Quick Sort has a worst-case time complexity of O(n^2), it can be mitigated by using good pivot selection strategies (e.g., choosing the median or random pivot).
- Space Complexity: Quick Sort has better space efficiency in terms of auxiliary space compared to Merge Sort and does not require additional storage like Merge Sort does.
