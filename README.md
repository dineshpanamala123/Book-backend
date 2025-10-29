# 📘 Book Finder Backend

This is the backend service for the Book Finder application. It provides RESTful APIs to save, retrieve, search, and delete books using a MySQL database. The backend is built with **Spring Boot** and integrates with the **Open Library API** via the frontend.

---

## 🚀 Features

- Save books with title, author, and cover image
- Retrieve all saved books
- Search books by title (case-insensitive)
- Delete books by ID
- CORS enabled for frontend integration

---

## 🛠️ Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- MySQL
- Maven

---

## 📦 API Endpoints

| Method | Endpoint                    | Description                  |
|--------|-----------------------------|------------------------------|
| POST   | `/api/books/save`           | Save a new book              |
| GET    | `/api/books/saved`          | Get all saved books          |
| GET    | `/api/books/search?title=`  | Search books by title        |
| DELETE | `/api/books/delete/{id}`    | Delete book by ID            |

---

## ⚙️ Setup Instructions

### 1. Clone the Repository

```bash
git clone https://github.com/your-username/Book-backend.git
cd Book-backend
2. Configure MySQL
Create a database named bookdb and update your application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password
spring.jpa.hibernate.ddl-auto=update
3. Run the Application:
mvn spring-boot:run
Before save book:
<img width="1912" height="787" alt="image" src="https://github.com/user-attachments/assets/0d3666c0-e459-4ead-8f9e-c5a59e5babf3" />
After saved book:
automatically save database.
<img width="1631" height="786" alt="image" src="https://github.com/user-attachments/assets/0c45d474-6ef2-4788-b50e-0d2b14723d20" />



