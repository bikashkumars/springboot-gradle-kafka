# Spring Boot Kafka publisher - BIKASH

[![N|Solid](https://avatars1.githubusercontent.com/u/335019)](https://debugmycode.com)

[![Build Status](https://travis-ci.org/joemccann/dillinger.svg?branch=master)](https://debugmycode.com)

SpringBoot with Rest Web-services. Received message in Post method. This converts request payload to string and publish the entire body to Kafka topic.

  - Spring Boot latest (org.springframework.boot)
  - Spring Kafka latest (org.springframework.kafka)
  - spring web latest (spring-boot-starter-web)

### Install Kafka and Zookeeper
Follow this tutorial to download and install kafka. Make sure you are running zookeeper and kafka before running this springboot app.
https://kafka.apache.org/quickstart

### Installation and Required Tools

Requires Java8 and Gradle 4.x
Download both and set the environement path. So that java and gradle command in accessible from command prompt/terminal.

Download latest version of Visual Studio Code and install these extension
```sh
Spring Boot Dashboard
Spring Boot Extension Pack
Spring Boot Tools
```

### Run the Application
Run the project using command prompt. bootRun is part of spring Boot and we are calling bootRun from gradle.
```sh
gradle clean bootRun
```

### Use Application
This is a web-service Application. So after running application, you can use postman to test the web-service

```sh
Open Postman

Hit http://localhost:8080/platform/v1/notification with Method as POST and send some JSON in body post

```