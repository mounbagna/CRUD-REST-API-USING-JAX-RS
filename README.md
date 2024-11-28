# CRUD Operations on Books - REST API
This is a 6th semester Web Architechture course assignment that implements a RESTful API for performing CRUD operations on a Books database. The API is built using JAX-RS with Jersey, and the application is tested using Postman.

## Features
 1. Add a book
 2. Retrieve all books
 3. Retrieve a book by ID
 4. Update a book
 5. Delete a book by ID

## Tools and Technologies
- IntelliJ IDEA
- JAX-RS with Jersey
- Maven
- Tomcat server
- Postman
- MySQL

## Installation and Setup
1. Clone the Repository: Download the project files from this repository.
2. Open in IntelliJ IDEA: Open the project in IntelliJ IDEA.
3. Install Dependencies
 - Right-click the project, select Add Library, and include the required dependencies such as the MySQL Connector in the lib folder.
 - Run mvn install to ensure all Maven dependencies are installed.
4. Configure Tomcat Server: Add the Tomcat server in IntelliJ IDEA, and deploy the project to the server.
5. Run the Project
 - Start the Tomcat server.
 - Copy the generated link and open it in your browser.
 - Click on Jersey Resource, copy the link displayed in your browser, and use it for testing in Postman.
6. Database Setup: Import the provided books.sql file into your MySQL database to set up the required schema and data.

## API Endpoints
### 1. Add a Book
 - Endpoint: /insertion
 - Method: POST
 - Example URL: http://localhost:8080/crud/webapi/crud/insertion 

### 2. Retrieve All Books
 - Endpoint: /retrieve
 - Method: GET
 - Example URL: http://localhost:8080/crud/webapi/crud/retrieve  

### 3. Retrieve Book by ID
 - Endpoint: /retrieveById/{id}
 - Method: GET
 - Example URL: http://localhost:8080/crud/webapi/crud/retrieveById/2  

### 4. Update a Book
 - Endpoint: /updateBook
 - Method: POST
 - Example URL: http://localhost:8080/crud/webapi/crud/updateBook  

### 5. Delete Book by ID
 - Endpoint: /deleteBookById/{id}
 - Method: DELETE
 - Example URL: http://localhost:8080/crud/webapi/crud/deleteBookById/3  

## Notes
 - Ensure you specify the correct HTTP method in Postman for each operation.
   - GET for retrieving data.
   - POST for adding or updating data.
   - DELETE for removing data.
- Update the database connection settings in your configuration file to match your MySQL setup.

## Database Schema
The database schema is included in the books.sql file. Use this file to set up the database.

### Connect
- [LinkedIn](https://www.linkedin.com/in/mounbagna-abdella-abasse-875958314/) – Connect with me on LinkedIn!

