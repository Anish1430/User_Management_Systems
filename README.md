# User Management System

This is a Spring Boot project for a User Management System. It provides endpoints for managing user information.

## User Attributes
- UserId
- username
- DateOfBirth
- email
- Phone Number
- Date
- Time

## Endpoints
- `POST /api/users/addUser`: Add a new user.
- `GET /api/users/getUser/{userId}`: Get user information by UserId.
- `GET /api/users/getAllUser`: Get information of all users.
- `PUT /api/users/updateUserInfo/{userId}`: Update user information.
- `DELETE /api/users/deleteUser/{userId}`: Delete user by UserId.

## Validation
The following validations are applied:

- `username`: Alphanumeric with underscore, minimum 3 and maximum 16 characters.
- `dateOfBirth`: Valid date format (yyyy-MM-dd).
- `email`: Valid email format.
- `phoneNumber`: 12 digits with the first two as country code.

## How to Run
1. Clone the repository.
2. Open the project in IntelliJ IDEA.
3. Run the application.

## Technologies Used
- Spring Boot
- Spring Data JPA
- H2 Database (for simplicity, replace with preferred database)
- Java
- Mysql server
- JDBC

## Contributors
- [Anish kumar Sharma]
- [Github link](https://github.com/Anish1430/User_Management_Systems)

Feel free to contribute or report issues!
