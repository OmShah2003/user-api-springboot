# User API

This is a simple RESTful API for user registration and fetching user details built with Spring Boot.

## Getting Started

### Prerequisites

- Java 17+
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/omshah/userapi.git
    cd userapi
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

### API Endpoints

#### Register User

- **URL:** `/api/user/register`
- **Method:** `POST`
- **Request Body:**
    ```json
    {
      "username": "john",
      "email": "john@example.com",
      "password": "password123"
    }
    ```
- **Response:**
    - `200 OK` if registration is successful

#### Fetch User

- **URL:** `/api/user/fetch?username=john`
- **Method:** `GET`
- **Response:**
    - `200 OK` with user details if the user is found
    - `404 Not Found` if the user is not found

### Swagger UI

Access the API documentation via Swagger UI at:
http://localhost:8080/swagger-ui.html


### Running Tests

To run the tests, execute:
```sh
mvn test

