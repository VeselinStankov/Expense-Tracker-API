# Expense-Tracker-API
Spring Boot REST API using PostgreSQL and JWT

Spring Boot REST API, which is connected to a PostgreSQL database with some very basic tables and connections. It is used to track your expenses in categories of your choosing.

You can register a user with first and last name, email and password (which is encrypted).
When you log in with the correct email and password you get a JWT authentication token, which we use for authorization in further ussages.
You can login with multiple users. Every user can create many categories and each category can have multiple transactions.
You can view, update and delete categories as well as transactons.
