This project implements a Spring Boot web API for managing class and student data. It offers CRUD (Create, Read, Update, Delete) operations for both entities.

installation

This is a standard Spring Boot project and can be run using Maven or Gradle.

practice

Base URL: http://localhost:8080
Rate controller endpoints:
/les: GET - retrieves all classes
/lesson/{id}: GET - retrieves a lesson by ID (replace {id} with the ID of the lesson)
/lesson: POST - creates a new lesson (send the lesson data in the request body)
/lesson/{id}: DELETE - deleting a lesson by ID (replace {id} with the ID of the lesson)
/lesson/{id}: PUT - lesson update by ID (send the updated lesson data in the request body)
Student controller endpoints: (similar structure to lesson endpoints)

Sample code snippets

Consider providing code snippets that demonstrate how to interact with your API. for example:

Java
// Get all classes
RestTemplate restTemplate = new RestTemplate();
List<Lesson> lessons = restTemplate.getForObject("http://localhost:8080/lesson", List.class);

// Publish a new class
lesson newLesson = new Lesson();
newLesson.setName("Introduction to Spring");
restTemplate.postForObject("http://localhost:8080/lesson", newLesson, null);
It is important to use the code carefully.
