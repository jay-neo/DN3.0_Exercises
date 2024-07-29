<h2 align="center">Exercise 5: Task Management System</h2>

### Scenario: 
You are developing a task management system where tasks need to be added, deleted, and traversed efficiently.

### Steps:
1. Understand Linked Lists:
    - Explain the different types of linked lists (Singly Linked List, Doubly Linked List).

2. Setup:
    - Create a class Task with attributes like `taskId`, `taskName` and `status`.

3. Implementation:
    - Implement a singly linked list to manage tasks.
    - Implement methods to **add**, **search**, **traverse** and **delete** tasks in the linked list.

4. Analysis:
    - Analyze the time complexity of each operation.
    - Discuss the advantages of linked lists over arrays for dynamic data.






---

<h2 align="center">Solution</h2>

### Linked List

Linked lists are data structures consisting of nodes that store data and references to other nodes. In a singly linked list, each node points to the next node, allowing traversal in one direction only. It's simple and uses less memory, but can't be traversed backwards.

A doubly linked list has nodes with two references: one to the next node and one to the previous node, enabling traversal in both directions. This provides more flexibility for operations like insertion and deletion but requires more memory per node and is more complex to implement. Both types offer advantages over arrays in terms of dynamic memory allocation and ease of insertion and deletion.



### Testing

```java
javac ./taskmanagement/*.java
```

```java
java taskmanagement.Testing
```

### Analysis


Time Complexity:
- Add: O(n)
- Search: O(n)
- Traverse: O(n)
- Delete: O(n)



Limitations:
- Elements cannot be accessed directly by index, requiring traversal from the head node.
- Linked lists require extra memory for storing references/pointers.
- Linked lists may have poorer cache performance compared to arrays due to non-contiguous memory allocation.
