# Intervue.io Automation Script

This Java project automates the login flow and basic navigation for [Intervue.io](https://www.intervue.io) using Selenium WebDriver.

## Features

- Open Intervue.io in Chrome
- Login with user credentials
- Take a screenshot if login fails
- Perform a sample search
- Log out of the application

## Technologies Used

- Java
- Selenium WebDriver
- ChromeDriver
- JDK 8 or above

##  Folder Structure
└── IntervueLoginTest.java
├── Screenshot/ # Folder to store screenshots 
├── softwaress/ # Folder containing chromedriver.exe 

## Setup Instructions

1. **Install Java JDK**  
   [Download JDK](https://www.oracle.com/java/technologies/javase-downloads.html)

2. **Install Chrome browser**

3. **Download ChromeDriver**  
   Compatible with your Chrome version:  
   https://sites.google.com/a/chromium.org/chromedriver/

4. **Set ChromeDriver Path**  
   Update this line in the code if needed:
   ```java
   System.setProperty("webdriver.chrome.driver", "./softwaress/chromedriver.exe");

5. **Add Selenium Jar Files to Classpath**
   You can use Selenium Jars, or use Maven.

6. **Run the Program**
   Compile and run IntervueLoginTest.java from your IDE or terminal.



