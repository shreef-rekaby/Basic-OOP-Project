# Student Management System (Basic OOP Project)

A robust Java console application designed to demonstrate the practical application of **Object-Oriented Programming (OOP)** principles. This project serves as a management tool for student records, handling data through structured classes and modular logic.

## 📌 Project Overview

This system provides a Command Line Interface (CLI) to perform CRUD operations on student data. It focuses on clean code, data integrity, and efficient memory management using the Java Collections Framework.

## 🛠️ OOP Concepts Implemented

This project was built specifically to showcase core Object-Oriented design patterns:

*   **Composition**: The `Student` class contains an `Address` object, demonstrating a "Has-A" relationship to organize complex data.
*   **Encapsulation**: Used private fields with public getter/setter methods to ensure data security and controlled access.
*   **Abstraction**: Separated the data model (Student, Address) from the application logic (SimpleOne) for better maintainability.
*   **Data Categorization (Enums)**: Implemented a `Department` Enum to restrict inputs to specific, valid categories (IT, CS, IS, SE), ensuring data integrity.

## 🚀 Key Features

*   **Dynamic Data Storage**: Uses `ArrayList` to manage records in-memory without needing a database.
*   **Student Profiling**: Stores ID, Name, GPA, Department, and full Address details.
*   **Functional Logic**: Utilizes **Lambda Expressions** (`removeIf`) for modern, concise data filtering and deletion.
*   **Buffer Management**: Implements careful `Scanner` handling to manage transitions between numeric and string inputs.

## 💻 Tech Stack

*   **Language**: Java (JDK 8+)
*   **Collections**: Java ArrayList
*   **Logic**: Lambda Expressions, Switch-Case Menus, Enums
*   **IDE**: NetBeans / IntelliJ / VS Code

## 📋 How to Run

1.  **Clone the project**:
    ```bash
    git clone https://github.com/shreef-rekaby/Basic-OOP-Project.git
    ```
2.  **Compile**:
    ```bash
    javac simpleone/*.java
    ```
3.  **Run**:
    ```bash
    java simpleone.SimpleOne
    ```

## 👤 Author
**Shreef Rekaby**  
[GitHub Profile](https://github.com/shreef-rekaby) | [LinkedIn](www.linkedin.com/in/shreef-rekaby)
