<h2 align="center">Exercise 7: Financial Forecasting</h2>

### Scenario: 
You are developing a financial forecasting tool that predicts future values based on past data.

### Steps:
1. Understand Recursive Algorithms:
    - Explain the concept of recursion and how it can simplify certain problems.

2. Setup:
    - Create a method to calculate the future value using a recursive approach.

3. Implementation:
    - Implement a recursive algorithm to predict future values based on past growth rates.

4. Analysis:
    - Discuss the time complexity of your recursive algorithm.
    - Explain how to optimize the recursive solution to avoid excessive computation







---

<h2 align="center">Solution</h2>



### Recursion:

- Recursion is a method where a function calls itself to solve a problem. Each recursive call should simplify the problem, bringing it closer to a base case which ends the recursion.
- It simplifies code for problems that have repetitive or self-similar structures (e.g., factorial, Fibonacci sequence). It makes code more readable and easier to understand for certain problems.


Calculating the factorial of a number:

```java
public int factorial(int n) {
    if (n <= 1) { // Base case
        return 1;
    } else {
        return n * factorial(n - 1); // Recursive case
    }
}
```



### Testing

```java
javac ./financialforecasting/FinancialForecast.java
```

```java
java financialforecasting.FinancialForecast
```


### Analysis

Time Complexity: The time complexity of the recursive method is O(n), where n is the number of periods. This is because each call to calculateFutureValue makes exactly one recursive call, and the recursion depth is equal to the number of periods.

Optimizing the Recursive Solution:
- Memoization: To avoid repeated calculations, you can store already computed values in a cache (e.g., an array or a hash map).
- Iterative Approach: In cases where recursion is not necessary, an iterative approach can be used to avoid the overhead of recursive calls.