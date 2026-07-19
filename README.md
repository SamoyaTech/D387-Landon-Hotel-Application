# D387 – Advanced Java Multithreaded Application

## Overview
This project was completed as part of **D387 – Advanced Java**, demonstrating the ability to build and modify a full‑stack application using **Spring Boot (Java)** and **Angular (TypeScript)**. The application includes **multithreaded processing**, external API calls, time‑zone messaging, currency exchange, and deployment using **Docker**.

The backend handles concurrent tasks using Java threads, while the frontend provides a clean UI for interacting with translation, time‑zone, and currency features.

---

## Features

### ✔ Multithreaded Language Translation
- Uses Java multithreading to translate a message into multiple languages concurrently.
- Each translation runs in its own thread.
- Results are combined and returned to the Angular frontend.

### ✔ Time Zone Messaging
- Generates a message showing the current time in multiple time zones (e.g., EST, PST, UTC).
- Uses Java’s `ZonedDateTime` and `ZoneId` classes.
- Returned to the frontend via REST API.

### ✔ Currency Exchange
- Pulls live exchange rates from an external API.
- Converts a user‑provided amount between currencies.
- Uses Java HTTP client + JSON parsing.

### ✔ Angular Frontend
- Displays translation results, time‑zone messages, and currency conversions.
- Communicates with the Spring Boot backend via REST endpoints.
- Built and served as part of the full‑stack application.

### ✔ Docker Containerization
- Spring Boot backend packaged as an executable JAR.
- Dockerfile builds a single image containing the backend.
- Container runs the multithreaded application on a specified port.

---

## Tech Stack

- Java 17  
- Spring Boot  
- Angular  
- TypeScript  
- HTML/CSS  
- REST API integration
- Docker  

