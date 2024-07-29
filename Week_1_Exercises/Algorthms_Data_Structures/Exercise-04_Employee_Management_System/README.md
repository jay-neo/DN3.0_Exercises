<h2 align="center">Exercise 4: Employee Management System</h2>

### Scenario:
You are developing an employee management system for a company. Efficiently managing employee records is crucial.

### Steps:
1. Understand Array Representation:
    - Explain how arrays are represented in memory and their advantages.

2. Setup:
    - Create a class Employee with attributes like `employeeId`, `name`, `position` and `salary`.

3. Implementation:
    - Use an array to store employee records.
    - Implement methods to `add`, `search`, `traverse` and `delete` employees in the array.

4. Analysis:
    - Analyze the time complexity of each operation (add, search, traverse, delete).
    - Discuss the limitations of arrays and when to use them.





---

<h2 align="center">Solution</h2>


### Array Representation in Memory

- Contiguous Memory Allocation: Arrays are stored in contiguous memory locations. This means that each element of the array is placed next to its predecessor in memory.
- Indexing: Arrays allow direct access to any element using its index, making access operations very fast (O(1) time complexity).


### Advantages of Array
- Fast Access: Direct indexing provides fast access to elements.
- Ease of Use: Simple to declare, initialize, and use.
- Memory Efficiency: Arrays have a fixed size, which can help manage memory usage effectively.


### Testing

```java
javac ./employeemanagement/*.java
```

```java
java employeemanagement.Testing
```

### Analysis


Time Complexity:
- Add: O(1)
- Search: O(n)
- Traverse: O(n)
- Delete: O(n)

Limitations of Arrays:
- Once an array is created, its size cannot be changed. This can lead to wasted memory if the array is not fully used or insufficient space if the array needs to grow.
- Adding or removing elements from the middle of the array can be slow, as it requires shifting elements to maintain contiguity.
- Arrays do not support efficient random insertions/deletions; all operations must maintain the order of elements.