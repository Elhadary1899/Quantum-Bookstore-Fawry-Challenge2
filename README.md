# Quantum Bookstore 📚

An extensible Java application that simulates an online bookstore system, built for the Fawry N² Dev Slope Challenge.

## 🚀 Features

- Manage a catalog of different book types:
  - **Paper Books**: physical copies with stock, shipped to the user's address.
  - **EBooks**: digital books sent via email, with a specified file type.
  - **Demo Books**: sample books, not for sale.
- Add new books to inventory.
- Remove outdated books based on a given age threshold.
- Buy books by ISBN:
  - Reduces stock for paper books.
  - Validates quantity and sends EBooks to email.
  - Prevents DemoBooks from being purchased.
- Returns the total amount paid for any successful transaction.=

---

## 🧱 Tech Stack

- **Language**: Java
- **Paradigm**: Object-Oriented Programming (OOP)
- **Design**: Polymorphic methods for extensibility
- **Tools**:  IntelliJ IDEA IDE

---

## 🧩 Code Structure
src/
├── Book.java # Abstract base class </br>
├── PaperBook.java # Physical book with stock </br>
├── EBook.java # Digital book with file type </br>
├── DemoBook.java # Sample book (not for sale) </br>
├── BookStore.java # Core inventory and purchase logic </br>
├── BookStoreTest.java # Main test class with sample scenario </br>
├── OutOfStockException.java # Custom exception (optional)
