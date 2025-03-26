# Real Estate Management System

## Project Overview
This is a Java-based real estate management system that allows tracking and analysis of different types of residential properties including houses, villas, and holiday homes.

## Features
- View and manage different types of properties
- Calculate total prices for each property type
- Calculate average square meters
- Filter properties by room count and salon count
- Unified service for managing all residence types

## Architecture
The project follows object-oriented design principles with:

- **Models**: Base `Residence` class with specialized types (`House`, `Villa`, `HolidayHome`)
- **Repositories**: Data access layer for each property type
- **Services**: Business logic for property management
- **Factory**: Centralized service creation through `ServiceFactory`

## Class Structure
- `Residence`: Base class with common properties (price, square meters, rooms)
- Property types: `House`, `Villa`, `HolidayHome` extending from `Residence`
- `BaseRepository`: Interface defining common repository operations
- `BaseService`: Common service functionality for all property types
- Specialized services: `HouseService`, `VillaService`, `HolidayHomeService`
- `ResidentService`: Manages all property types together

## Getting Started
1. Clone the repository
2. Open in your Java IDE
3. Run `Application.java` to see property statistics

## Sample Output
```
========== REAL ESTATE SUMMARY ==========

----- TOTAL PRICES -----
Total price of houses: $1070000.0
Total price of villas: $6000000.0
Total price of holiday homes: $1070000.0
Total price of all properties: $8140000.0

----- AVERAGE SQUARE METERS -----
Average square meters of houses: 183.33 m²
Average square meters of villas: 426.67 m²
Average square meters of holiday homes: 430.0 m²
Average square meters of all properties: 346.67 m²

----- PROPERTY COUNTS -----
Total number of properties: 9
Number of houses: 3
Number of villas: 3
Number of holiday homes: 3

----- FILTERED PROPERTIES -----
Properties with 3 rooms: 3
Properties with 2 salons: 3

========== END OF REPORT ==========
```

## Technologies Used
- Java 17
- Object-oriented programming
- Stream API for data processing