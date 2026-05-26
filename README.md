# Bajaj Finserv Health Challenge Submission (BPHL)

This repository contains the Java Spring Boot REST API solution built for the Bajaj Finserv Health qualifier.

## Candidate Details
- **Name:** Swayam Garg
- **College Roll Number:** 0827CD231067
- **Email:** swayamgarg231225@acropolis.in
- **DOB:** 13/01/2005

## Features
- **POST `/bfhl`**:
  - Classifies elements in the input JSON array into numbers (even/odd), alphabets (converted to uppercase), and special characters.
  - Returns calculated `sum` of numeric values.
  - Returns `concat_string` which contains the concatenation of all alphabetical characters in the input, reversed and in alternating caps format.
  - Handles multi-character and single-character elements gracefully.
  - Returns standard response JSON including candidate information.
  - Includes duplicated `sepcial_characters` key fallback to avoid failure on systems with evaluation typos.
- **GET `/bfhl`**:
  - Returns hardcoded operation code: `{"operation_code": 1}`

## API Specs

### POST Request
- **URL**: `/bfhl`
- **Headers**: `Content-Type: application/json`
- **Body**:
```json
{
  "data": ["a", "1", "334", "4", "R", "$"]
}
```

### POST Response
```json
{
  "is_success": true,
  "user_id": "swayam_garg_13012005",
  "email": "swayamgarg231225@acropolis.in",
  "roll_number": "0827CD231067",
  "even_numbers": ["334", "4"],
  "odd_numbers": ["1"],
  "alphabets": ["A", "R"],
  "special_characters": ["$"],
  "sepcial_characters": ["$"],
  "sum": "339",
  "concat_string": "Ra"
}
```

## Running the Application Locally
To compile, run test cases, and start the server:

1. **Test application**:
   ```bash
   ./mvnw clean test
   ```

2. **Run application**:
   ```bash
   ./mvnw spring-boot:run
   ```
   Or run the precompiled JAR:
   ```bash
   java -jar bphl-0.0.1-SNAPSHOT.jar
   ```

## Downloads
- **Download JAR File**: [bphl-0.0.1-SNAPSHOT.jar](https://github.com/Swayam7Garg/bphl/raw/main/bphl-0.0.1-SNAPSHOT.jar)
