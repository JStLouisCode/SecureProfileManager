# SecureProfileManager
SecureProfileManager is a Java application that provides user authentication and registration capabilities, allowing users to create and manage their profiles securely. The application is built with a graphical user interface (GUI) and utilizes a MySQL database to store user data securely.

## Features

- User Registration: Users can create new profiles by providing their first name, last name, date of birth, username, and password. The application securely stores user passwords as hashed values in the database.

- User Authentication: Registered users can log in using their usernames and passwords. The application authenticates users by comparing the entered password with the stored password hash.

- Secure Password Handling: Passwords are securely hashed using the SHA-256 algorithm before storing them in the database. This ensures that user passwords are not stored in plain text.

- User Profile Management: Users can view and update their profiles, including changing their passwords.

## Prerequisites

To run the SecureProfileManager application, you need the following software and tools:

- Java Development Kit (JDK): Install the latest version of the JDK to execute Java applications.

- MySQL Database: Set up a MySQL database for storing user data. You should have the database URL, username, and password.

- Dependencies: Ensure that you have the necessary external JAR files, such as the MySQL JDBC driver, to connect to the database.

## Getting Started

1. Clone the repository or download the source code for the SecureProfileManager application.

2. Set up your MySQL database and make sure to provide the database URL, username, and password in the DatabaseHandler class.

3. Build the application by compiling the source code using your preferred Java development environment.

4. Run the App class to start the SecureProfileManager application.

## Usage

- When you run the application, you'll be presented with a graphical user interface (GUI).

- Choose between user registration (Sign Up) and user authentication (Log In).

- For user registration, provide your first name, last name, date of birth, username, and password. Click "Confirm" to create your profile.

- For user authentication, enter your username and password. Click "Confirm" to log in.

- You can also update your profile and change your password from the application.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Acknowledgments

- This application uses the MySQL database and the SHA-256 hashing algorithm for password security.

- The GUI components are built using Java's Swing library.
