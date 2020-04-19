## Data Types, Variables, and Arrays

**Data Types**
- Java is a Strongly typed language. it means that every variable  and expression has a type and it is strictly defined and .
- Java compiler checks for type compatibility during assignments ,parameters passing to methods.
- Java has two types of data types.
    - **Primitive Data Types(simple Data types)**
    - **Reference/Object Data Types**
- Java has eight primitive data types.They are **byte**,**short**,**int**,**long**,**char**, **float**,**double** and **boolean**.

---
| Data Type |                         Contents                        |  Size  | Default Value |
|:---------:|:-------------------------------------------------------:|:------:|:-------------:|
|    Byte   |    Signed two's complement integer from -128 to 127     |  8-bit |       0       |
|   short   |  signed two's complement integer from -2^15 to 2^15 -1  | 16-bit |       0       |
|    int    |   signed two's complement integer from -2^31 to 2^31-1  | 32-bit |       0       |
|    long   |   signed two's complement integer from -2^63 to 2^63-1  | 64-bit |       0L      |
|  float    |          single precision floating point number           | 32-bit |  0.0f |
|  double |           double precision floating point number          | 64-bit |  0.0d |
| boolean |             stores boolean value true or false            |  1-bit | false |
|   char  | Stores 16-bit unicode character from '\u0000' to '\ffff'  | 16-bit |   -   |

- Reference variables are created using the defined constructors of the class.These variables are declared to be of a specific type and that cannot be changed and that type is called reference data type.
- class objects and various types of array variables come under reference data type.

**Variables**
- A variable is a named storage that can store values that a program can manipulate.
- The type of the variable determines the size ,layout and the range of values that can be stored in a variable.

Example for declaration and initialization  the variable is as follows

```java
int x, y;         // Declares two integers x,y.
int x = 10, y = 10;  // Example of initialization
byte B = 22;         // initializes a byte type variable B.
double pi = 3.14159; // declares and assigns a value of PI.
char a = 'a';        // the char variable a iis initialized with value 'a'
```
- There are three kind of variable  in Java . They are 
    - Local Variables
        - Local variables are declared in methods, constructors, or blocks and are only visible inside them.
        - There is no default value for local variables, so local variables should be declared and an initial value should be assigned before the first use.

    - Instance Variables
        - Instance variables are declared in a class, but outside a method, constructor or any block and are visible for all methods, constructors and block in the class.
        - Instance variables have default values and also values can be assigned during the declaration or within the constructor.
        - There would only be one copy of each class variable per class, regardless of how many objects are created from it.

    - Class/Static Variables
        - Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.
        - There would only be one copy of each class variable per class, regardless of how many objects are created from it.
        - Static variables can be accessed by calling with the class name ClassName.VariableName.
        
            ```java
            public class Employee {
            
               // salary  variable is a     private static variable
               private static double salary;

               // DEPARTMENT is a constant
               public static final String   DEPARTMENT ="Development ";

               public static void main(String   args[]) {
                   salary = 1000;
                   System.out.println   (DEPARTMENT +"average  salary:" + salary);
               }
            }
            ```

**Arrays**
- Array is the data structure that stores fixed-size sequential collections of same type.
- Declaration is done as follows
    ```java
    int   a[]; //dataType arrayRefVar[];
    int[] b;  //dataType[] arrayRefVar; **prefered way**
    ``` 
- Arrays can be created by using new keyword as follows.
    ```java
        //dataType[] arrayRefVar = new dataType[arraySize];
        double[] myList = new double[10];

        animal[] a = new animal[5];
    ```