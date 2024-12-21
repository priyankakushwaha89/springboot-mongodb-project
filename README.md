Spring Boot MongoDB Project

Overview

This is a CRUD application built using Spring Boot and MongoDB. The application manages SportTeam entities and demonstrates basic CRUD operations. It also leverages Docker Compose for containerized deployment.

Features

Entity: SportTeam with CRUD operations.

Database: MongoDB for data storage.

Containerization: Docker Compose for deployment.

Technologies Used

Spring Boot: Framework for application development.

MongoDB: NoSQL database for data persistence.

Docker Compose: For container orchestration.

Spring Data MongoDB: For database interaction.

Project Structure

src/
├── main/
│   ├── java/
│   │   └── com.example.sportsteam/
│   │       ├── controller/
│   │       │   └── TeamController.java
│   │       ├── entity/
│   │       │   └── SportTeam.java
│   │       ├── repository/
│   │       │   └── TeamRepository.java
│   │       └── SportTeamApplication.java
│   └── resources/
│       ├── application.properties
│       ├── data/
│       │   └── import.json (optional: sample data)
│       └── static/
└── test/

Getting Started

Prerequisites

Java 17 or later

Maven

Docker and Docker Compose

Clone the Repository

git clone https://github.com/your-username/springboot-mongodb-project.git
cd springboot-mongodb-project

Build the Application

mvn clean install

Run with Docker Compose

Make sure docker-compose.yml is in the root directory.

Start the services:

docker-compose up

Access the application at:

http://localhost:8080

Endpoints

Base URL

http://localhost:8080/api/v1/teams

Endpoints

Method

Endpoint

Description

GET

/

Get all teams

GET

/{id}

Get team by ID

POST

/

Create a new team

PUT

/{id}

Update team by ID

DELETE

/{id}

Delete team by ID

Example SportTeam Entity

{
  "id": "team123",
  "name": "Golden Eagles",
  "city": "New York",
  "players": ["John Doe", "Jane Smith"]
}

Docker Compose Configuration

docker-compose.yml

version: '3.8'
services:
  mongodb:
    image: mongo:latest
    container_name: mongodb
    ports:
      - "27017:27017"
    volumes:
      - mongo-data:/data/db

  springboot-app:
    build: .
    container_name: springboot-mongodb-app
    ports:
      - "8080:8080"
    depends_on:
      - mongodb

volumes:
  mongo-data:

How to Contribute

Fork the repository.

Create a feature branch.

Commit your changes.

Push to the branch.

Open a Pull Request.

License

This project is licensed under the MIT License. See the LICENSE file for details.

