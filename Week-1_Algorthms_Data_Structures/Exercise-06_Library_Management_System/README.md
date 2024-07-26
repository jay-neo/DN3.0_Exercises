<h2 align="center">Exercise 6: Library Management System</h2>

### Scenario: 
You are developing a library management system where users can search for books by title or author.


### Steps:
1. Understand Search Algorithms:
    - Explain linear search and binary search algorithms.

2. Setup:
    - Create a class **Book** with attributes like `bookId`, `title` and `author`

3. Implementation:
    - Implement linear search to find books by title.
    - Implement binary search to find books by title (assuming the list is sorted).


4. Analysis:
    - Compare the time complexity of linear and binary search.
    - Discuss when to use each algorithm based on the data set size and order.







---

<h2 align="center">Solution</h2>


### Linear Search & Binary Search

Linear Search algorithm that checks each element in the list sequentially until the desired element is found or the list ends. Otherside Binary Search algorithm that repeatedly divides a sorted list in half to narrow down the location of the desired element.



### Testing

```java
javac ./librarymanagement/*.java
```

```java
java librarymanagement.Testing
```


### Analysis

<table align="center">
    <tr>
        <th>Algorithm</th>
        <th>Time Complexity</th>
        <th>Use Cases</th>
    </tr>
    <tr>
        <td>Linear Search</td>
        <td>
            Best Case: O(1) <br>
            Average/Worst Case: O(n)
        </td>
        <td>
            Suitable for small or unsorted lists. <br>
            Easy to implement and does not require pre-sorting.
        </td>
    </tr>
    <tr>
        <td>Binary Search</td>
        <td>
            Best Case: O(1) <br>
            Average/Worst Case: O(log n)
        </td>
        <td>
            Efficient for large, sorted lists. <br>
            Requires the list to be sorted, which can be an overhead if the list changes frequently.
        </td>
    </tr>
</table>