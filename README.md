# Student Microservice
## Introduction:
This repository demonstrates a microservices-based architecture for managing students and schools, utilizing modern technologies to ensure scalability and flexibility. The system consists of the following components:
- Student Service: Manages student-related data and operations.
- School Service: Handles school-related data and operations.
- API Gateway: Acts as a single entry point for all microservices, routing and load balancing requests.
- Discovery Server: Enables service registration and discovery using Netflix Eureka.
- Config Server: Centralizes configuration management for all microservices.

## Features:
- Service Discovery: Built with Netflix Eureka to dynamically register and discover microservices.
- Centralized Configuration: Utilizes Spring Cloud Config Server for managing application configurations across environments.
- API Gateway: Implements a gateway layer using Spring Cloud Gateway to route requests, handle load balancing, and provide security.
- Distributed Tracing: Integrated with Zipkin for detailed tracking of requests across services, helping diagnose issues and analyze performance.
- Containerized Deployment: Uses Docker Compose for seamless deployment and orchestration of all microservices.
