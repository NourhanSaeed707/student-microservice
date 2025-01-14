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
- Data Persistence: Implements persistent storage with databases tailored for student and school services.
- RESTful APIs: Clean and well-documented APIs for seamless interaction with services.

## Technologies:
Provide a list of frameworks, libraries, and tools used in the project, such as:
- Spring Boot
- Spring Cloud (Eureka, Config Server, Gateway)
- Zipkin
- Docker Compose
- PostgreSQL

## How to start project:
Follow these steps to set up and run the project locally:
1. Prerequisites
Ensure the following tools are installed on your system:
- Java JDK 17 or higher
- Maven (for building the project)
- Docker and Docker Compose (for containerized deployment)
- Git (for cloning the repository)
  
2. Clone the Repository
Clone this repository to your local machine using Git:
- **https://github.com/NourhanSaeed707/student-microservice.git**
  
3. Build the Project
Use Maven to build the project and package all microservices:
- **mvn clean install**
  
4. Set Up Configuration
Make sure the Config Server is correctly set up with configuration files for each microservice.
Verify the configurations are stored in the config-repo directory or a Git-based configuration repository.

5. Start the Project with Docker Compose
Run the entire system using Docker Compose:
- **docker-compose up --build**

6. Verify Services
Once all containers are running, verify that the services are accessible:
- **Eureka Dashboard: http://localhost:8761**
- **Config Server: http://localhost:8888**
- **API Gateway: http://localhost:8080**
- **Zipkin UI: http://localhost:9411**

7. Interact with APIs
Use tools like Postman or cURL to interact with the microservices through the API Gateway.
For example:
- **GET http://localhost:8080/api/students** 
- **POST http://localhost:8080/api/schools**

8. Stop the Project
To stop all running containers, use:
- **docker-compose down**

## Conclusion
This project demonstrates the power and flexibility of microservices architecture using Spring Cloud, Docker, and distributed tracing with Zipkin. It is designed to showcase essential microservices concepts, such as service discovery, centralized configuration, and API routing, while leveraging containerization for seamless deployment.
By running this project, you can get hands-on experience with building and managing microservices, and it provides a solid foundation for extending functionality or integrating more advanced features.
