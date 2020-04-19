## Exception Handling

**Overview**
- An exception is disruption of intended flow of the program. When exception occurs system will terminate the program and display stack track of the cause of the error.
- Programmer can control this behavior using exceptional handling. All exceptions are child classes of *Throwable* class.
- Exceptions are categorized into three types
  - Checked:
    - These are identified by complier during compilation process and exception handling should be addressed by the programmers during creation of the code. Example `FileNotFoundException`.
  - Unchecked:
    - These cannot be identified by complier during compilation process and created only at runtime based on input provided. Example `ArithmeticException`, `ArrayIndexOutOfBoundsException`.
  - Error:
    - These are errors created during execution of code by JVM like `StackOverflowError`. These vary from environment and are not directly dependent on user inputs like Unchecked exceptions.

![](../01-Images/10-ExceptionHandling.png)
- Java exception handling is managed by five keywords `try`, `catch`, `finally` , `throw` ,`throws`. Below are different exception handling scenarios.
  - Basic: 
    - This example illustrates basic use of `try`, `catch` and `finally`
    ```java
    // Code without exception handling
    class Testing {
        public static void main (final String args[]){
            System.out.println("Result "+1/0);
        }
    }
    ```
    ```java
    class Testing {
        public static void main(final String args[]) {
            try {
                FileInputStream file = new FileInputStream("");
                byte x = (byte) file.read();
            } catch (IOException e) {
                System.out.println("Invalid File");
                e.printStackTrace();
            }
        }
    }
    ```
    ```java
    class Testing {
        // Unchecked Exception
        public static void main (final String args[]){
            try{
                System.out.println("Result "+1/0);
            }catch(ArithmeticException e){
                System.out.println("Invalid expression");
                e.printStackTrace();
            }
        }
    }
    ```
    ```java
    ```