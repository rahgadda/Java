## Control Statements
- Control Statements are to used to advance in the flow of execution and branch based on the flow of the program.
- Control statement can be classified in 3 categories.
    - Selection
        - Selection Statements help to chose different path based on the value of a variable or result of an expression. 
    - Iteration
        - Iteration Statements are useful for repetitive execution.
    - Jump
        - Jump statements are useful to execute proram in non linear fashion.

**Selection Statements**
- if-else
    - An if statement consists of a boolean expression followed by one or more statements.
    - The statements inside a if block are executed only of the boolean expression is true.
    - if statement can be followed by an optional **else** block.
    - The statements inside else is executed only of the boolean expression is false.
    - Java also supports **else if** which is used in the case of nested statements.
    - ```Java
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        ```

- switch
