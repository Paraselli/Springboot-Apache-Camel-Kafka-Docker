# 🚀 Spring Boot Apache Camel Kafka Docker

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge\&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-green?style=for-the-badge\&logo=springboot)
![Apache Camel](https://img.shields.io/badge/Apache_Camel-Integration-D22128?style=for-the-badge\&logo=apache)
![Kafka](https://img.shields.io/badge/Apache_Kafka-Event_Driven-black?style=for-the-badge\&logo=apachekafka)
![Docker](https://img.shields.io/badge/Docker-Containerized-2496ED?style=for-the-badge\&logo=docker)

### ⚡ Integration-focused Spring Boot microservice with Apache Camel, Kafka, and Docker

</div>

---

## 📌 Overview

This project is a **portfolio-ready integration-focused microservice** built using:

* **Spring Boot** for backend APIs
* **Apache Camel** for enterprise integration patterns (EIP)
* **Apache Kafka** for asynchronous event streaming
* **Docker** for containerized deployment

It demonstrates how to build scalable, event-driven integration pipelines using **message routing**, **transformation**, and **distributed messaging** in a production-style architecture.

---

## 🏗️ Architecture

```text id="2j4s7m"
     +------------------+
     |   REST Client    |
     +--------+---------+
              |
              v
     +------------------+
     | Spring Boot API  |
     +--------+---------+
              |
              v
     +------------------+
     | Apache Camel     |
     | Route Engine     |
     +--------+---------+
              |
              v
     +------------------+
     | Apache Kafka     |
     | Event Streaming  |
     +------------------+

 Docker → Containerized Deployment
```

---

## ✨ Features

* ✅ Spring Boot REST API
* ✅ Apache Camel route processing
* ✅ Kafka event streaming
* ✅ Message transformation & routing
* ✅ Event-driven architecture
* ✅ Dockerized deployment
* ✅ Portfolio-ready integration project

---

## 🛠️ Tech Stack

| Technology   | Purpose               |
| ------------ | --------------------- |
| Java 17      | Core language         |
| Spring Boot  | Backend framework     |
| Apache Camel | Integration framework |
| Apache Kafka | Event streaming       |
| Docker       | Containerization      |
| Maven        | Build tool            |

---

## 📂 Project Structure

```bash id="7l2w4f"
Springboot-Apache-Camel-Kafka-Docker/
├── src/
│   └── main/
│       └── java/
├── Dockerfile
├── docker-compose.yml
├── application.properties
├── pom.xml
└── README.md
```

---

## ⚙️ Getting Started

### 1️⃣ Clone Repository

```bash id="1g9p4m"
git clone https://github.com/Paraselli/Springboot-Apache-Camel-Kafka-Docker.git
cd Springboot-Apache-Camel-Kafka-Docker
```

---

### 2️⃣ Start Services

```bash id="4m9v2s"
docker-compose up -d
```

This starts:

* Kafka
* Zookeeper
* Spring Boot App

---

### 3️⃣ Run Application

```bash id="3q7n1x"
mvn clean install
mvn spring-boot:run
```

Application runs on:

```bash id="9f1k8r"
http://localhost:8080
```

---

## 📡 API Example

### Trigger Integration Flow

```http id="3m8r5p"
GET /test
```

### Flow Triggered

1. Request received via REST API
2. Apache Camel route processes request
3. Message transformed (if needed)
4. Event published to Kafka topic
5. Consumer processes asynchronously

---

## 🔄 Apache Camel Flow

```text id="8v3m1n"
REST API Request
      ↓
Spring Boot Controller
      ↓
Apache Camel Route
      ↓
Message Transformation
      ↓
Kafka Topic
      ↓
Async Consumer
```

---

## 🎯 Use Cases

* Enterprise integration systems
* Message routing & transformation
* Event-driven microservices
* Real-time data pipelines
* Distributed system integration

---

## 🚀 Future Enhancements

* Add Kafka consumer processing logic
* Implement retry handling & DLQ
* Add monitoring (Prometheus + Grafana)
* Deploy to Kubernetes
* Add distributed tracing

---

## 👨‍💻 Author

---

### Ram Paraselli

[![LinkedIn](https://img.shields.io/badge/LinkedIn-Profile-0A66C2?style=for-the-badge\&logo=linkedin)](https://www.linkedin.com/in/ram-paraselli/)

[![GitHub](https://img.shields.io/badge/GitHub-Profile-181717?style=for-the-badge\&logo=github)](https://github.com/Paraselli)

---

## ⭐ Support

If this project helped you, consider giving it a **star** ⭐ on GitHub.
