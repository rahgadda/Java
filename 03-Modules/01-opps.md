## OOPS Concepts

Object-oriented programming is at the core of Java.
There are multiple paradigms of programming.They are classified based on the way the two elements which are **code** and  **data** are handled.

Two important paradigms of programming are

- Process-oriented model
- Object-oriented model

The Process oriented model can be understood as the code written on data. In this model a program could be understood as a series of linear steps.Procedural Programming languages like C follows this approach. It is difficult to manage the code as the programs grow complex in this approach.

The Object-oriented model can be understood as programming done around data(objects) and interfaces defined to access the data. This can be considered as data controls access to code.

Bundling code into individual software objects provide lot of benefits like below.

1. Modularity
2. Information-hiding
3. Code re-use
4. Pluggability and debugging ease

![alt text][oop-pop]

[oop-pop]: ../01-Images/1.jpg
"OOP VS POP"

They are four pillars of the object oriented programming paradigm. They are

1. Inheritance
2. Polymorphism
3. Abstraction
4. Encapsulation

![alt text][oop]

[oop]: ../01-Images/2.jpg "OOP"

### Key terms in Object Oriented Programming

1. #### Object

    An object is a software bundle of related state and behavior. it means object is a self-contained component which consists of methods and properties to make a particular type of data useful. an object contains an address and takes up some space in memory. 

![alt text][obj]

[obj]: ../01-Images/3.jpg "OOP VS POP"

2. #### Class

    A Class is the blueprint for creating objects. Class does not consume any space.

3. #### Inheritence
        Object-oriented programming allows classes to inherit state and behavior from other classes. it helps with code reusability.

![alt text][Inheritence]

[Inheritence]: ../01-Images/4.jpg "inheritence"

4. #### Polymorphism

        The word “poly” means many and “morphs” means forms, So it means many forms.Polymorphism allows us to perform a single action in different ways depending on the calling object. This can be achieved by method **overloading** and method **overriding**.
    polymorphism in java is of two types:

    1. Compile time Polymorphism
    1. Runtime Polymorphism

- Method Overloading: When there are multiple functions with same name but different parameters then these functions are said to be overloaded
- Method Overriding: It is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes.
  
5. #### Abstraction
    Abstraction is a process of hiding the implementation details from the user. In Java, abstraction is achieved using abstract classes and interfaces.

5. #### Encapsulation
    Binding (or wrapping) code and data together into a single unit are known as encapsulation. In encapsulation, the variables of a class will be hidden from other classes, and can be accessed only through the methods of their current class. Therefore, it is also known as data hiding.