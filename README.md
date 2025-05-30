# Bank-management-system

Overview
The Bank Management Application is a full-stack web application designed to simulate basic banking operations. 

It allows users to create bank accounts, deposit and withdraw money, and delete accounts. 

The app features a modern React frontend with Material-UI for a polished user interface and a Spring Boot backend connected to a MySQL database for data persistence. </br>

This project is a learning exercise to explore full-stack development and REST APIs. </br>

Features</br>
Account Management:</br>
Create new accounts with an account holder's name and initial balance.</br>
View all accounts in a tabular dashboard.</br>
Deposit and withdraw money from accounts.</br>
Delete accounts with a single click.</br>
User Interface:</br>
Responsive design using Material-UI components.</br>
Dark/light mode toggle for enhanced user experience.</br>
Navigation between dashboard and create account pages using React Router.</br>
Error Handling:</br>
Displays alerts for failed operations (e.g., failed to fetch accounts).</br>
Planned Features:</br>
Role-based login system for admins (full access) and customers (view-only access to their accounts).</br>
Transaction history and financial insights.</br>
Tech Stack</br>
Frontend: React, Material-UI, React Router</br>
Backend: Spring Boot (v3.4.5), Spring Data JPA</br>
Database: MySQL (BankDB)</br>
Project Structure</br>
Backend (BankManagementApp):</br>
REST APIs for CRUD operations on accounts.</br>
MySQL database with an Account table (fields: account_number, account_holder_name, account_balance).</br>
Configured with Hibernate for automatic schema generation.</br>
Frontend (bank-frontend):</br>
Dashboard page to view and manage accounts.</br>
Create account page for adding new accounts.</br>
Navigation bar with links and theme toggle.</br>
