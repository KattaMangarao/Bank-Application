# Bank-Application 🎦

A real-time **Spring Boot banking management system** demonstrating production-grade backend development with REST APIs, database design, and layered architecture.

## 📄 Project Overview

Modern banking application built with Spring Boot that handles core banking operations:
- **Multi-layer architecture**: Controller → Service → Repository pattern
- **RESTful APIs** for all banking operations  
- **MySQL database** with proper schema design
- **Error handling** with global exception handling
- **Input validation** using annotations

## ✨ Features

- ✅ User account management (Create, Read, Update, Delete)
- ✅ Deposit and withdrawal operations
- ✅ Transaction history tracking
- ✅ Account balance inquiries
- ✅ Data validation and error responses
- ✅ Proper REST API structure with HTTP status codes

## 🛠️ Tech Stack

| Component | Technology |
|-----------|------------|
| **Backend Framework** | Spring Boot 2.x |
| **Database** | MySQL |
| **ORM** | Spring Data JPA |
| **Build Tool** | Maven |
| **API Testing** | Postman |
| **Version Control** | Git |

## 🚶 Getting Started

### Prerequisites
- Java 8+
- Maven 3.6+
- MySQL 5.7+

### Installation

1. **Clone the repository**
   ```bash
   git clone https://github.com/KattaMangarao/Bank-Application.git
   cd Bank-Application
   ```

2. **Setup MySQL Database**
   ```sql
   CREATE DATABASE bank_app;
   USE bank_app;
   ```

3. **Configure application.properties**
   Update src/main/resources/application.properties with your MySQL credentials

4. **Build and run**
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

Server runs on `http://localhost:8080`

## 📧 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/api/users` | Create new account |
| GET | `/api/users/{id}` | Get account details |
| PUT | `/api/users/{id}` | Update account |
| DELETE | `/api/users/{id}` | Delete account |
| POST | `/api/transactions/deposit` | Deposit money |
| POST | `/api/transactions/withdraw` | Withdraw money |
| GET | `/api/transactions/{userId}` | View transaction history |

## 💳 Key Implementation Details

- **Layered Architecture**: Clean separation between Controller, Service, and Repository layers
- **Exception Handling**: Global exception handler for consistent error responses
- **Input Validation**: Annotations for data validation
- **JPA Relationships**: Proper entity relationships
- **Status Codes**: Proper HTTP status codes (200, 201, 400, 404, 500)

## 📄 Learning Outcomes

This project demonstrates:
- Spring Boot REST API development
- MySQL database design
- JPA entity mapping
- Layered architecture best practices
- Error handling and validation
- API documentation

## 🚀 Future Enhancements

- [ ] Spring Security with JWT authentication
- [ ] Unit tests with JUnit and Mockito
- [ ] Pagination for transaction history
- [ ] Cloud deployment (AWS/Heroku)
- [ ] Advanced filtering and search

## 📇 Resources

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Spring Data JPA](https://spring.io/projects/spring-data-jpa)
- [MySQL Documentation](https://dev.mysql.com/doc/)

---

**Status**: ✅ Complete | **Last Updated**: December 2025
