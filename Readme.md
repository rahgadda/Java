# Java

## Table of Content

- [Overview](#overview)
- [History](#history)
- [Modules](#modules)
- [Appendix](#appendix)

## Overview

- Java is one of the world’s most important and widely used computer languages.
- Java is loaded with lots of features like Open Source, Simple, Secure, Portable, Object Oriented, Multithreaded, Interpreted and Distributed.
- Java Basic Terminologies

  - **JCP:** The Java Community Process is the process that formalizes and standardizes Java technologies.
  - **JSR:** The Java Specification Requests is used to introduce new technologies into the language. Not all JSR specifications are taken up by the language.
  - **JDK:** The Java Development Kit is a complete Java development platform with JavaCompiler, JavaDocs and JavaDebugger
  - **JRE:** The Java Runtime Environment provides an environment where Java applications can run effectively.
  - **JVM:** The Java Virtual Machine (JVM) is responsible for supporting the execution of Java applications.
  - **JCL:** The Java Class Library is a set of standard libraries that is available to any application running on the JVM.
  - **Java EE:** The Java Enterprise Edition (Java EE) was created to extend the Java SE by adding a set of specifications that define capabilities commonly used by enterprise applications.

---

## History

- History of Java programming language is usually associated with origin predates of the web. Below is the evolution of Java
  - In **1991, The Green Project at Sun Micro Systems(now Oracle)** begins looking for a purpose. They take apart many electronic devices, like cable TV set-top boxes and remote controls to find a way for the appliances to talk to each other.
  - The Green Project (Naughton, Gosling and Sheridan) settles on smart consumer electronics as the delivery platform. **Gosling** starts development of a **new programming language and by August 1991, James Gosling at Sun created a language C++ ++**. His friends asked to name it something else and then he called it as **Oka (on the name of tree found outside his window)**.
  - By **October 1992**, 7 inch a cross between a PDA and a remote control, is ready. This is demoed to **Scott McNealy** who is blown away. Following that demo, the Green Project is set up as **First Person Inc**, a wholly owned Sun subsidiary.
  - In **early 1993**, The Green Project hears about a **Time-Warner request for proposal for a setup box operating system**. First Person Inc quickly shifts focus from smart consumer electronics (which is proving to be more hype than reality) to the **setup box OS market**, and place a bid with Time-Warner. They lose the bid.
  - In **early 1994**, First Person Inc concludes that like smart consumer electronics setup boxes were more hype than reality. Without a market to be seen **First Person is rolled back into Sun**.
  - After failing at interactive media, people at Sun sat together in a coffee shop to figure out what they have to do with Oak and decided rename it to **Java by Gosling after looking at the menu**.
  - In **1994**, a team of Java developers started writing **Web Runner, which was a clone of the internet browser Mosaic**. It was based on the Java programming language. The name Web Runner was a tribute to the Blade Runner movie. Web Runner's first public demonstration was given by **John Gage and James Gosling at the Technology Entertainment Design Conference in Monterey, California in 1995**. It was later renamed **Hot Java, it was officially announced in May the same year at the Sun World conference**.
  - **Hot Java was a modular, extensible web browser from Sun Microsystems implemented in Java**. It was the first browser to support **Java applets**, and was Sun's demonstration platform for the then-new technology.

---

## Architecture

- System hardware interacts with executable software using Operating System (OS). OS is responsible for allocation and de-allocation of resource based on request from different software programs.
- A Virtual Machine is a software implementation of a physical machine inside OS. Java was developed with the concept of **WORA (Write Once Run Anywhere)**, which runs on a VM.
- The heart of Java programing language is JVM. The compiler compiles the Java file into a **.class** file and then that **.class** file is inputted into the JVM to load and executes the class file.
- Below is the detailed overview of JVM Architecture

  ![alt text][oop-pop]

  [oop-pop]: 01-Images/5.png "JVM Architecture"

  - **Class Loader Sub System:**
    - This is used to load, link and initialize a class file when JVM refers to a class for the first time.
      - Loading
        - The class loader sub system reads the .class file and generate corresponding binary data in **method area**.
        - There are three types of class loaders
          - Bootstrap/Primordial Class Loader
            - It is responsible to load core Java API classes (jdk/jre/lib/rt.jar)
            - This is implemented in native languages like C, C++ and not in Java.
          - Extension Class Loader
            - Loads the classes available in the extension class path (jdk/jre/lib/ext)
            - This is implemented in Java.
          - Application/System Class Loader
            - Loads the classes available in the class path.
            - This is implemented in Java.
      - Linking
        - This process involves the below:
          - Verification:
            - Check if metadata of class file is structurally correct.
            - JVM will check if class file is generated on a valid compiler using Byte Code Verifier.
          - Preparation:
            - In this phase static variables will be initialized with default values.
          - Resolution:
            - This will replace symbolic names of java program with memory location references from method area.
      - Initialization
        - This will initialized static variables with actual assignment values and execute static blocks if defined
        - The execution is from top to bottom and parent to child.
    - This process kicks during runtime and not in compile time.
    - Sub System used Delegation Algorithm to load a class.
      - When a new class file is asked to be loaded then system will check if class is loaded. If not loaded then it will ask class sub system to load the class.
      - Class loader sub system handovers the request of loading to Application -> Extension -> Bootstrap.
      - If class is not available in Bootstrap it delegates request to Extension and then to Application.
      - If class is not available in any loader then system will raise **ClassNotFoundException**
      - Classes loaded in child will be visible in the parent i.e. classes loaded in Application are visible in Extension and Bootstrap.

---

## Installation

- Download the latest version of java based on your operating system architecture from [Oracle jdk](https://www.oracle.com/technetwork/java/javase/downloads/index.html) .

- Execute the Installer and please select the installation folder.

  ![alt text][java_home]

  [java_home]: 01-Images/7.jpg "Progress"

- Continue with the installation for the subsequent steps.

  ![alt text][java_install]

  [java_install]: 01-Images/8.jpg "Java Install"

  ![alt text][java_complete]

  [java_complete]: 01-Images/9.jpg "Installation Complete"

- **Setting of Path for Java**

  - Right-click on 'My Computer' and select 'Properties'.
  - Click on the 'Environment variables' button under the 'Advanced' tab.
  - Alter the 'Path' variable so that it also contains the path to the Java executable
    - In the case of our example ( See second point ) the java executable lies at `C:\Program Files\Java\jdk1.8.0_221\bin`
  - Confirm the installation by checking the java version in the command prompt

    ```java
    java -version
    ```

    ![alt text][java_version]

    [Java_Version]: 01-Images/6.jpg "Java Version"

  - Creating a First program in Java.
    - Create a file name 'HelloWorld.java' using a Text editor
    - Write the Below code in it.
      ```java
        public class HelloWorld {
          public static void main(String[] args) throws Exception {
              System.out.println("Hello Java");
          }
        }
      ```

  ***

## Modules

- This program details most important module of Core Java features:
  - [OOPS Concepts](03-Modules/01-oops.md)
  - [Data Types, Variables, and Arrays](03-Modules/02-datatypes.md)
  - [Operators](03-Modules/03-operators.md)
  - [Control Statements](03-Modules/04-controlstatements.md)
  - Class & Object
  - Packages and Interfaces
  - [Exception Handling](03-Modules/07-exception.md)
  - Annotations
  - Generics
  - [Collections Framework](03-Modules/10-collections)
  - I/O Operations & NIO
  - Concurrency Utilities
  - Regular Expressions
  - Lambda Expressions
  - Date & Time Functions
- Advanced concepts of
  - JUnit
  - Logging
  - Servlet
  - JAXB
  - Jackson
  - CDI
  - Universal Connection Pooling
  - JPA
  - Jax-RS
  - Reactive Programing

---

## Appendix
- References
  - [Java 8 Complete Reference](02-Books/Java8TheCompleteReferenceNinthEdition.pdf)
