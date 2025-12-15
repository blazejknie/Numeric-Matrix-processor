# Numeric Matrix Processor

Numeric Matrix Processor is a **Java console application** that allows users to perform common numerical operations on matrices. The project was created as an educational exercise to practice matrix algorithms, control flow, and working with two‑dimensional arrays in Java.

---

## Table of Contents

* Overview
* Features
* Requirements
* Getting Started
* Usage
* Project Structure
* License

---

## Overview

The application runs in the terminal and provides an interactive menu. Users can input matrices of arbitrary size and perform various linear algebra operations such as addition, multiplication, transposition, determinant calculation, and matrix inversion.

The project focuses on:

* Clean separation of logic
* Correct mathematical implementation
* User input validation
* Readable console output

---

## Features

The program supports the following operations:

* Add two matrices
* Multiply a matrix by a scalar
* Multiply two matrices
* Transpose a matrix (different transpose modes if implemented)
* Calculate the determinant of a matrix
* Calculate the inverse of a matrix (if it exists)

All operations are accessible through a simple text‑based menu.

---

## Requirements

To run this project, you need:

* Java Development Kit (JDK) 8 or higher
* Any operating system that supports Java (Windows, Linux, macOS)
* (Optional) An IDE such as IntelliJ IDEA, Eclipse, or VS Code

---

## Getting Started

### Clone the repository

```bash
git clone https://github.com/blazejknie/Numeric-Matrix-processor.git
```

### Navigate to the project directory

```bash
cd Numeric-Matrix-processor
```

### Compile the project

```bash
javac -d out src/processor/*.java
```

### Run the application

```bash
java -cp out processor.Main
```

> Note: If the main class has a different name, replace `processor.Main` with the correct entry point.

---

## Usage

After starting the program, the following menu is displayed:

```
=== Numeric Matrix Processor ===
1. Add matrices
2. Multiply matrix by a number
3. Multiply matrices
4. Transpose matrix
5. Calculate determinant
6. Inverse matrix
0. Exit
```

### Example: Matrix Addition

Input:

```
1
2 2
1 2
3 4
2 2
5 6
7 8
```

Output:

```
6 8
10 12
```

The program validates matrix dimensions and displays an error message if an operation cannot be performed.

---

## Project Structure

```
Numeric-Matrix-processor/
├── src/
│   └── processor/        # Application source code
├── out/                  # Compiled .class files
├── .gitignore
└── README.md
```

---

## License

This project is licensed under the MIT License. You are free to use, modify, and distribute this software.

---

## Author

Created by **Błażej Knie** as a learning project for practicing Java and numerical algorithms.

If you find this project useful, feel free to give it a ⭐ on GitHub.
