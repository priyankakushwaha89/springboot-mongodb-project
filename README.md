# SpringBoot-MongoDB-DockerCompose

This Spring Boot project demonstrates how to integrate `MongoDB` with `Docker Compose` for managing a sportTeam entity. The project provides `CRUD operations` for managing sports teams and utilizes `Docker Compose` to run `MongoDB` and the `Spring Boot application` in `isolated containers`.

## Features
- `Spring Boot`: A framework to build stand-alone, production-grade Spring-based applications.
- `Maven`: Dependency management and build automation.
- `MongoDB`: NoSQL database for storing and managing sportTeam data.
- `Containerization`: Docker Compose for deployment.

## Technologies Used
- Java
- Spring Boot
- Hibernate
- Mongodb(can be replaced with any other database)

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven 3.6 or higher

### Installation

1. Clone the repository:
   ```sh
   git clone https://github.com/priyankakushwaha89/springboot-mongodb-project.git
   cd springboot-mongodb-project

2. Configure the database:

    Update the src/main/resources/application.properties file with your database connection details:
     ```sh
    spring.data.mongodb.uri=mongodb://localhost:27017/Sportsname
        #or
    #spring.data.mongodb.port=27017
    spring.data.mongodb.database=Sportsname
   
3. Build the project:
   ```sh
     mvn clean install
4. Run the application:
   ```sh
     mvn spring-boot:run
The application will start on http://localhost:8080.

### Endpoints

1. Test Endpoint
- URL: `/test`
- Method: GET
- Description: Test the API to ensure it's running
- Response: "This is Method Arguement Not Valid Exception Test"

2. Save Data
- URL: `/save`
- Method: POST
- Description: Add new user data.
- Request Body: json in postman
  
  ```sh
  {
        "id": 1,
        "tname": "black",
        "tmember": 5,
        "tscore": 20
    }

3. Get All Users Data
- URL: `/all`
- Method: GET
- Description: Returns a list of all users data.
  
  ```sh
  [
    {
        "id": 1,
        "tname": "black",
        "tmember": 5,
        "tscore": 20
    },
    {
        "id": 2,
        "tname": "pink",
        "tmember": 5,
        "tscore": 19
    },
    {
        "id": 3,
        "tname": "red",
        "tmember": 5,
        "tscore": 18
    }
]
  
4. Retreving Data Using name and userId.
- URL: `/{id}` 
- Method: GET
- Description: Returns user data of specific id.

5. Updating Users data
- URL: `/upd/{id}`
- Method: PUT
- Description: Updates all fields of data.

6. Deletion of User data
- URL: `/del/{id}`
- Method: DELETE
- Description: Delete user data of provided id.


## Project Structure

- SportTeam: Entity class representing a sports Team profile.
- TeamRepository: Repository interface for CRUD operations on Sports Team profiles.
- MyController: REST controller for handling user-related requests.


