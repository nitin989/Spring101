# Spring101
Spring Boot 
This is a simple sprint boot application using spring JPA and mysql as DB. It takes care of 4 rest services :- 
1. SaveEmployee
2. GetAllEmployees
3. GetEmployeeById
4. DeleteEmployeeById

This application also takes care of API versioning :- 
1. /v1 which interacts with in-memory List to store data
2. /v2 which interacts with mysql DB
