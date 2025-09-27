# Use official Maven + JDK image
FROM maven:3.9.0-eclipse-temurin-17

# Set working directory
WORKDIR /app

# Copy pom.xml and source code
COPY pom.xml .
COPY src ./src

# Build the Maven project
RUN mvn clean package -DskipTests

# Set the entrypoint to run the main class
CMD ["java", "-cp", "target/PrintingTest_1-1.0-SNAPSHOT.jar", "com.example.Greeting"]
