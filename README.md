# 🚀 Spring Boot + Apache Camel + Kafka + Docker

A production-ready **integration-focused microservices application** built using **Spring Boot, Apache Camel, Apache Kafka, and Docker**.
This project demonstrates **enterprise integration patterns (EIP)**, **message routing**, and **event-driven architecture**.

---

## 🧩 Tech Stack

* **Backend**: Spring Boot
* **Integration Framework**: Apache Camel
* **Messaging**: Apache Kafka
* **Containerization**: Docker, Docker Compose
* **Build Tool**: Maven

---

## ⚙️ Features

* ✅ Apache Camel routes for message transformation and routing
* ✅ Kafka integration for asynchronous messaging
* ✅ REST API endpoints for triggering workflows
* ✅ Event-driven architecture implementation
* ✅ Dockerized application setup
* ✅ Scalable integration pipelines

---

## 🏗️ Architecture

* **REST Controller** → Receives API requests
* **Apache Camel Routes** → Handles routing & transformation
* **Kafka Producer/Consumer** → Event streaming
* **Docker** → Containerized deployment

---

## 🔄 Apache Camel Flow

1. Request received via REST API
2. Camel route processes the request
3. Message transformed (if needed)
4. Event published to Kafka topic
5. Consumer processes asynchronously

---

## 🚀 Getting Started

### 1️⃣ Clone the repository

```bash id="v2g5yo"
git clone https://github.com/Paraselli/Springboot-Apache-Camel-Kafka-Docker.git
cd Springboot-Apache-Camel-Kafka-Docker
```

---

### 2️⃣ Start services using Docker

```bash id="p6m3sj"
docker-compose up -d
```

---

### 3️⃣ Run the application

```bash id="n3r8lc"
mvn clean install
mvn spring-boot:run
```

---

## 📡 API Example

```http id="7s5q8w"
GET /test
```

👉 This triggers Camel route and sends message to Kafka

---

## 🔥 Use Cases

* Enterprise integration systems
* Message routing & transformation
* Event-driven microservices
* Real-time data pipelines

---

## 📌 Future Enhancements

* Add Kafka consumer processing logic
* Implement error handling & retries (DLQ)
* Add monitoring (Prometheus, Grafana)
* Deploy to Kubernetes

---

## 👨‍💻 Author

**Ram Paraselli**
🔗 linkedin.com/in/ram-paraselli
🔗 github.com/Paraselli

---

## ⭐ Star this repo if you find it useful!
