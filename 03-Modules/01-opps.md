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

<<<<<<< HEAD
1. #### Object
   An object is a software bundle of related state and behavior. it means object is a self-contained component which consists of methods and properties to make a particular type of data useful. an object contains an address and takes up some space in memory. 

   ![alt text][obj]

   [obj]: ../01-Images/3.jpg "OOP VS POP"
=======
    [obj]: ../01-Images/3.jpg "OOP VS POP"

- **Class:**

  - A Class is the blueprint for creating objects.
  - Class does not consume any space.

- **Inheritence:**
>>>>>>> e10b76429db69af6b6eed4527d283bd798f685c7

  - Object-oriented programming allows classes to inherit state and behavior from other classes. This will it help with reusability of code .

<<<<<<< HEAD
   A Class is the blueprint for creatingobjects. Class does not consume any space.

3. #### Inheritence
        
   Object-oriented programming allows classes to inherit state and behavior ith code  reusability.

   ![alt text][Inheritence]

   [Inheritence]: ../01-Images/4.jpg "inheritence"
=======
  ![alt text][inheritence]

  [inheritence]: ../01-Images/4.jpg "inheritence"

- **Polymorphism:**

  - The word **poly** means many and **morphs** means forms, So it means many forms.
  - Polymorphism allows us to perform a single action in different ways depending on the calling object.
  - There two different ways we can be achieve polymorphism using
>>>>>>> e10b76429db69af6b6eed4527d283bd798f685c7

    - **Method Overloading:**
      - When there are multiple functions with same name but different parameters then these functions are said to be overloaded.
      - This type of implement is called as **Compile time Polymorphism**.
    - **Method Overriding:**
      - It is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
      - This type of implement is called as **Runtime Polymorphism**.

<<<<<<< HEAD
   The word “poly” means many and “morphs”means forms, So it means many forms.Polymorphism allows us to perform a single action in different ways depending on the calling object. This can be achieved by method **overloading** and method **overriding**.
   - Method Overloading: When there are 
   multiple functions with same name but 
   different parameters then these unctions 
   are said to be overloaded.
   - Method Overriding: It is a feature hat 
   allows a subclass or child class to 
   provide a specific implementation of a 
   method that is already provided by one f 
   its super-classes or parent classes.

   Polymorphism in java is of two types:
   1. Compile time Polymorphism
   2. Runtime Polymorphism <br /><br />
    
5. #### Abstraction
    Abstraction is a process of hiding the implementation details from the user. In Java, abstraction is achieved using abstract classes and interfaces.

6. #### Encapsulation
    Binding (or wrapping) code and data together into a single unit are known as encapsulation. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.
=======
- **Abstraction:**

  - This is a process of hiding the implementation details from the user. In Java, abstraction is achieved using abstract classes and interfaces.
  - This feature is used to hide design details.

- **Encapsulation:**

  - This is a process of binding/wrapping code and data together into a single unit.
  - In encapsulation, a variables of a class will be hidden from other classes and can be accessed only through the methods of their current class.
  - This feature is used to hide implementation details.
>>>>>>> e10b76429db69af6b6eed4527d283bd798f685c7
