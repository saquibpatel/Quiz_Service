# Spring Cloud Quiz Microservices System

A production-ready Microservices-based Quiz Application built using **Spring Boot 3, Spring Cloud, Eureka Service Registry, API Gateway, and OpenFeign Client**.

This project demonstrates complete microservices architecture including service discovery, inter-service communication, load balancing, and centralized routing.

---

##  Microservices Architecture Overview

- **MS1 – Quiz Service**
- **MS2 – Question Service**
- **Service Registry – Eureka Server**
- **API Gateway – Spring Cloud Gateway**
- **Inter-Service Communication – OpenFeign Client**

---

## Tech Stack

- Java 17+
- Microservice
- Spring Boot 3
- Spring Cloud
- Eureka Server (Service Discovery)
- Spring Cloud API Gateway
- OpenFeign Client
- Spring Data JPA
- PostgreSQL / MySQL
- Maven
- REST APIs

---

##  Microservices Details

###  Quiz Service (MS1)
- Creates and manages quizzes
- Fetches questions from Question Service using Feign Client
- Registers with Eureka Server

###  Question Service (MS2)
- Manages quiz questions
- Exposes REST APIs
- Registers with Eureka Server

###  Eureka Server
- Central Service Registry
- Enables dynamic service discovery
- Supports multiple service instances

###  API Gateway
- Central entry point for all microservices
- Routes client requests to respective services
- Provides load balancing automatically

---

##  Microservices Communication Flow

Client → API Gateway → Quiz Service → Question Service

Handled using **Feign Client + Eureka Load Balancing**

---

##  Project Features

- Service Registry using Eureka  
- API Gateway Routing  
- Load Balancing  
- Feign Client Inter-Service Communication  
- Centralized Request Handling  
- Scalable Microservice Instances  
- Spring Boot 3 & Spring Cloud Latest Versions  

---

##  Testing

All APIs were tested using:
- Postman
- Browser-based Gateway Routes

---

##  How to Run the Project

### Step 1: Start Eureka Server

### Step 2: Start Question Service

### Step 3: Start Quiz Service

### Step 4: Start API Gateway


---

##  Learning Outcomes

- Hands-on experience with Microservices Architecture
- Service Discovery using Eureka
- Load Balanced Inter-Service Communication using Feign
- API Gateway Routing
- Real-world Spring Boot Microservices Setup

---

##  Author

**Saquib**  
Java Backend Developer | Spring Boot | Microservices | REST APIs  

---

##  If you like this project, don't forget to give it a star!
