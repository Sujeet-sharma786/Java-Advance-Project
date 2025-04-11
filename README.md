# E Learning Platform

> E-learning web application made using Spring Boot and MySql.
> Service is live at : https://java-advanced-project.onrender.com
> 

---

###How to Start the Application
**clone the repository**

#Method 1-->

#inside root folder run to build the project
```shell
  mvn clean install
```
#To run the project
```shell
mvn spring-boot:run
```

#Method 2(using Docker)-->

#clone the repository and run docker command below in the root directory of project on your device

```shell
docker build -t java-app .
```

```shell
docker run -p 8080:8080 java-app
```
#This will run the app at url: http://localhost:8080

#Note: Docker desktop should be available to your desktop



