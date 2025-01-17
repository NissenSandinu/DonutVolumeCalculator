# Donut Volume Calculator

This project calculates the volume of a toroidal "donut" shape based on user provided radius using OOP principles in Java. The pipeline includes calculation logic, encapsulation, and a console based interface for user input.

The project structure is divided into key steps, as outlined below.

## Pre-Processing
- The calculation uses user input for Inner Radius and Outer Radius in centimetres.
- The Donut class performs calculations using mathematical formulas and OOP techniques.
- Outputs are displayed in the console with values rounded to two decimal places.

## 01 : Setup
- Loading necessary Java libraries (Scanner, Math classes).
- Defining the Donut class for encapsulating data and logic.
- Designing the DonutMaker class to serve as the main interface for user input and output.

## 02 : Donut Volume Calculation
- **Input Validation:** User provides valid inner and outer radius.
- **Volume Calculation:** Formula used:
    **𝑉𝑜𝑙𝑢𝑚𝑒 = 0.25 * π² * (𝑅𝑜 - 𝑅𝑖)² * (𝑅𝑜 + 𝑅𝑖)**
- **Output Formatting:** Result displayed in cubic centimeters with two decimal precision.

## 03 : User Interaction
- The program provides clear prompts for user input.
- Handles common edge cases (e.g., inner radius greater than or equal to outer radius).
- Displays the result in a user-friendly format.

## 04 : Output
- **Console Display:** Shows calculated volume based on input values.
- **Example:**

      Enter Outer Radius in cm: 10  
      Enter Inner Radius in cm: 5  
      The Volume of the donut in cm^3: 925.28<br> 
      Program by Nissen Wettasinghe

## Directory Structure
- **Source Code:** All Java files (Donut.java, DonutMaker.java) are in the root directory.
- **Output:** Console displays the calculated result.
- **Logs:** Error and debug information are logged in the console during runtime.

## Abbreviations
- **OOP:** Object-Oriented Programming
- **PS:** Placeholder for additional functionality if needed
