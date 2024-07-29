<h2 align="center">Exercise 2: Inventory Management System</h2>

### Scenario: 
You are working on the search functionality of an e-commerce platform. The search needs to be optimized for fast performance.


### Steps:
1. Understand Asymptotic Notation:
    - Explain Big O notation and how it helps in analyzing algorithms.
    - Describe the best, average, and worst-case scenarios for search operations.

2. Setup:
    - Create a class Product with attributes for searching, such as `productId`, `productName` and `category`.

3. Implementation:
    - Implement linear search and binary search algorithms.
    - Store products in an array for linear search and a sorted array for binary search

4. Analysis:
    - Compare the time complexity of linear and binary search algorithms.
    - Discuss which algorithm is more suitable for your platform and why.



---

<h2 align="center">Solution</h2>


### Asymptotic Notation

#### Big O Notation:

Big O notation is used to describe the upper bound of the time complexity of an algorithm, giving an estimate of the worst-case scenario. It provides a way to classify algorithms based on their runtime or space requirements as the input size grows.


#### Best, Average, and Worst-Case Scenarios for Search Operations:

- Best Case: The scenario where the algorithm performs the minimum number of operations. For example, in a search operation, the best case is finding the target element on the first attempt.
- Average Case: The scenario where the algorithm performs an average number of operations. This is an expected performance across all possible inputs.
- Worst Case: The scenario where the algorithm performs the maximum number of operations. For example, in a search operation, the worst case is having to search through all elements without finding the target.




### Testing

```java
javac ./ecommerce/*.java
```

```java
java ecommerce.Testing
```

### Analysis



**Time Complexity Comparison:**

Linear Search: O(n)
- Best Case: O(1) (if the target is the first element)
- Average Case: O(n/2)
- Worst Case: O(n) (if the target is the last element or not present)


Binary Search: O(log n)
- Best Case: O(1) (if the target is the middle element)
- Average Case: O(log n)
- Worst Case: O(log n) (always halves the search space)


Suitability for E-commerce Platform:
- Linear Search: Suitable for small datasets or unsorted lists. It is simple to implement but inefficient for large datasets.
- Binary Search: More suitable for large datasets due to its O(log n) time complexity, but it requires the data to be sorted. This means additional overhead for maintaining sorted data, but the performance gain for search operations is significant.

