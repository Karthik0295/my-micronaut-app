# My Micronaut App

This is a simple Micronaut project Setup.

## Prerequisites

Before running this project on a new system, ensure you have the following installed:

1. **Java 17**  
   - Download and install from: https://jdk.java.net/17/

2. **Gradle (Recommended: 8.11.1 or higher)**  
   - Download and install from: https://gradle.org/install/

3. **Git** (to clone the repository)  
   - Download and install from: https://git-scm.com/downloads

## Setup Instructions

Follow these steps to set up and run the project:

1. **Clone the Repository**  

   git clone https://github.com/Karthik0295/my-micronaut-app.git
   cd develop

2. **Verify Java and Gradle Installation**  

   java -version
   gradle -v


3. **Clean, Build and Run the Project**  
    ./gradlew clean
    ./gradlew build
    ./gradlew run



4. **Build the Project**  

   ./gradlew build


## Project Structure

```
my-micronaut-app/
├── src/
│   ├── main/
│   │   ├── java/my/micronaut/app/
│   │   │   ├── Application.java
│   │   │   ├── HelloController.java
│   │   ├── resources/
│   │       ├── application.yml
│   │       ├── logback.xml
├── build.gradle.kts
├── settings.gradle.kts
├── README.md
```

## Troubleshooting

- If you encounter a `permission denied` error while running Gradle commands, try:  
  ```sh
  chmod +x gradlew
  ./gradlew run
  ```

- If the application does not start, check the logs and ensure Java 17 is installed correctly.

For further support, check the [Micronaut Documentation](https://micronaut.io/documentation.html).