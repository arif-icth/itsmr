Step 1: Set Up the Spring Boot Project
Use Spring Initializer 
Add dependencies:
Spring Web
Spring Data JPA
Spring devtools
MySQL Driver
Spring Validation

Extract the downloaded project and open it in your preferred IDE

Step 2.
 maven setting, add folder and properties file and run the spring boot project

Database:
step 3.
creating database
CREATE DATABASE dre; or from my sql tool/xamps server using http://127.0.0.1/phpmyadmin/index.php?route=/database/structure&db=dre

step 4.
USE dre;

CREATE TABLE dre_record1 (
id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
certification_date DATE NOT NULL,
status ENUM('Active', 'Inactive') NOT NULL
);

Angular:
step 5.
Install node js:https://nodejs.org/en/download
check the version npm -v
step 6.
Install angular:npm install -g @angular/cli@17
check the version ng v
step 7.
Create angular App
ng new dre --standalone false
step 8.
install dependencies if it is required other wise do not require
npm install @angular/common @angular/forms @angular/http
step 9.
run the project:ng serve
UI url:http://localhost:4200/
step 10.
Create service
ng g s dre
step 11.
Create Component
ng g c dre
ng g c dre-form

step 12.
run the angular application
ng serve


