# Bank-management-system

Overview
The Bank Management Application is a full-stack web application designed to simulate basic banking operations. 

It allows users to create bank accounts, deposit and withdraw money, and delete accounts. 

The app features a modern React frontend with Material-UI for a polished user interface and a Spring Boot backend connected to a MySQL database for data persistence. 

This project is a learning exercise to explore full-stack development and REST APIs. 

Features
Account Management:
Create new accounts with an account holder's name and initial balance.
View all accounts in a tabular dashboard.
Deposit and withdraw money from accounts.
Delete accounts with a single click.
User Interface:
Responsive design using Material-UI components.
Dark/light mode toggle for enhanced user experience.
Navigation between dashboard and create account pages using React Router.
Error Handling:
Displays alerts for failed operations (e.g., failed to fetch accounts).
Planned Features:
Role-based login system for admins (full access) and customers (view-only access to their accounts).
Transaction history and financial insights.
Tech Stack
Frontend: React, Material-UI, React Router, Axios
Backend: Spring Boot (v3.4.5), Spring Data JPA
Database: MySQL (BankDB)
Project Structure
Backend (BankManagementApp):
REST APIs for CRUD operations on accounts.
MySQL database with an Account table (fields: account_number, account_holder_name, account_balance).
Configured with Hibernate for automatic schema generation.
Frontend (bank-frontend):
Dashboard page to view and manage accounts.
Create account page for adding new accounts.
Navigation bar with links and theme toggle.
