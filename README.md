---> Assignment Title: Java Assignment – Search Service <---

---> Description
This project demonstrates a microservices-based Search Service that consumes an Inventory Service and filters products priced under $50 using Java Streams.

---> Services
- Inventory Service (Port 8081)
- Search Service (Port 8080)

---> API

---> Inventory Service
GET http://localhost:8081/api/inventory/products

---> Search Service
GET http://localhost:8080/api/search/products

---> Tech Stack
- Java 21
- Spring Boot
- H2 Database
- REST APIs
