## OOPS Concepts

- Object-oriented is the core of Java programming. There are multiple programming paradigms and are classified based on the way **code** and **data** are handled.
- Two important paradigms of programming are

  - **Process-oriented model:**

    - The Process oriented model can be understood as the code written on data.
    - In this model a program could be understood as a series of linear steps.
    - Procedural Programming languages like C follows this approach. It is difficult to manage the code as the programs grow complex in this approach.

  - **Object-oriented model:**

    - The Object-oriented model can be understood as programming done around data(objects) and interfaces defined to access the data.
    - This can be considered as data controls access to code.
    - Bundling code into individual software objects provide lot of benefits like below.
      - Modularity
      - Information-hiding
      - Code re-use
      - Pluggability and debugging ease

    ![alt text][oop-pop]

    [oop-pop]: ../01-Images/1.jpg "OOP VS POP"

### Key Concepts of OOPS

Below are the key concepts of Object Oriented Programing

![alt text][oop]

[oop]: ../01-Images/2.jpg "OOP"

- **Object:**

  - An object is a software bundle of related state and behavior.
  - Object is a self-contained component which consists of methods and properties to make a particular type of data useful.
  - An object contains an address and takes up some space in memory.

    ![alt text][obj]

    [obj]: ../01-Images/3.jpg "OOP VS POP"

- **Class:**

  - A Class is the blueprint for creating objects.
  - Class does not consume any space.

- **Inheritence:**

  - Object-oriented programming allows classes to inherit state and behavior from other classes. This will it help with reusability of code .

  ![alt text][inheritence]

  [inheritence]: ../01-Images/4.jpg "inheritence"

- **Polymorphism:**

  - The word **poly** means many and **morphs** means forms, So it means many forms.
  - Polymorphism allows us to perform a single action in different ways depending on the calling object.
  - There two different ways we can be achieve polymorphism using

    - **Method Overloading:**
      - When there are multiple functions with same name but different parameters then these functions are said to be overloaded.
      - This type of implement is called as **Compile time Polymorphism**.
    - **Method Overriding:**
      - It is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
      - This type of implement is called as **Runtime Polymorphism**.

- **Abstraction:**

  - This is a process of hiding the implementation details from the user. In Java, abstraction is achieved using abstract classes and interfaces.
  - This feature is used to hide design details.

- **Encapsulation:**

  - This is a process of binding/wrapping code and data together into a single unit.
  - In encapsulation, a variables of a class will be hidden from other classes and can be accessed only through the methods of their current class.
  - This feature is used to hide implementation details.
