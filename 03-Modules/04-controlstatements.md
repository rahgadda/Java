## Control Statements

- Control Statements are to used to advance in the flow of execution and branch based on the flow of the program.
- `{`
       
  `}` Represents block of code. 
  
  If there is a single statement; use of statement block is optional.
- Control statement can be classified in 3 categories.
    - Selection
        - Selection Statements help to chose different path based on the value of a variable or result of an expression. 
    - Iteration
        - Iteration Statements are useful for repetitive execution.
    - Jump
        - Jump statements are useful to execute programs in non linear fashion.

### Selection
- **if-else**
    - An if statement consists of a boolean expression followed by one or more statements.
    - The statements inside a if block are executed only of the boolean expression is true.
    - if statement can be followed by an optional **else** block.
    - The statements inside else is executed only of the boolean expression is false.
    - Java also supports **else if** which is used in the case of nested statements.
      ```java
          if (time < 10) {
              System.out.println("Good morning.");
          } else if (time < 20) {
              System.out.println("Good day.");
          } else {
              System.out.println("Good evening.");
          }
      ```
- **switch:**
  - This is extension to if else statement with large possibilities.
  - It provides an easy way to dispatch execution to different parts of your code based on the value of an expression.
  - In Switch, The value of the *expression* is compared with each of the values in the *case* statements. If a match is found, the code sequence following that case statement is executed.
  - If none of the case statements match the value of the expression, then the *default* statement is executed.
  - The *break* statement is used to terminate a statement sequence.
  - Expression of switch statement can be of data types byte, short, int, char or enum. From JDK 7 String data types are also supported.
  - Duplicate case values are not allowed.
    ```java
    String sampleExp="day";

    switch(sampleExp){
        case "morning":
            System.out.println("Good morning.");
            break;
        case "day":
            System.out.println("Good day.");
            break;
        case "evening":
            System.out.println("Good evening.");
            break;
        default:
            System.out.println("Hello.");
    }
    ``` 

### Iteration
- **while**:
  - This is fundamental looping statement. The body of the loop will be executed as long as the conditional expression is `true`.
  - When condition becomes `false`, control passes to the next line of code immediately following the loop.
    ```java
    int i =0;
    while (i > 11){
        System.out.println(i);
    }
    ```
- **do while**:
  - Each iteration of the do-while loop first executes the body of the loop and then evaluates the conditional expression.
  - This looping construct will allow to execute the loop body at-least once.
    ```java
    int i =0;
    do {
        System.out.println(i);
    } while (i > 0)
    ```
- **for**:
  - There are two for of for loop
    - Traditional:
      - Supported from original version of JDK.
      - When the loop first starts, java will execute below order. All the below statements are optional. If none provided, java will create infinite loop
        - **Initialization:** This is used to initialize loop control variables. Variable declared are scoped only w.r.t for loop.
        - **Condition**: This must be a Boolean expression.
        - **Statement**: Execution body statements. 
        - **Iteration**: This is usually an expression that increments or decrements the loop control variable.
      - Comma can be used to include multiple Initialization and Iteration statements.
      ```java
      for (a=1, b=4; a<b; a++, b--){
          System.out.println("a = "+a+" b= "+b);
      }
      ```
    - For Each:
      - Supported from JDK 5 and above.
      - This looping style is designed to cycle through a collection of objects, such as an array, in strictly sequential fashion, from start to finish.
      - The iteration variable is “read-only” as it relates to the underlying array.
        ```java
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for(int x: nums) 
          sum += x;
        ```
  - Local variable type inference is a feature in Java 10 that allows the developer to skip the type declaration associated with local variables. `var` keyword is used to declare these variables. 

### Jump
- break:
  - Used to stop switch or looping flow.
  - It can also be used with labels
    ```java
    boolean t=true;

    first: {
        second: {
            third: {
              System.out.println("Entered third loop"); 
              if (t) 
                break second; 
            }
            System.out.println("Entered second loop");
        }
        System.out.println("Entered first loop");
    }
    ```
- continue:
  - Used to skip one looping iteration.
  - Like `break`, It can also be used with labels.
    ```java
    
        outer: for(int i=0; i<10; i++) {
            for(int j=0; j<10; j++){
                if (j>i){
                    System.out.println("j = " + j);
                    break outer;
                }
            }
            System.out.println("i = " + i);
        }
    ```
- return:
  - Used to explicitly return from a method to caller method.