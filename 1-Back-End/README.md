# Uber-Eats Example
## BACK-END

Welcome to Back-End Session, hier I'm show you the structure and details about the darkness side in this project hahaha

![3](https://user-images.githubusercontent.com/59379254/103615178-e11c6800-4f08-11eb-9c72-75c64405859d.png)
![1](https://user-images.githubusercontent.com/59379254/103615180-e1b4fe80-4f08-11eb-8987-080de893bd34.png)
![2](https://user-images.githubusercontent.com/59379254/103615177-e083d180-4f08-11eb-858f-08dbecf40a29.png)

##Details
### Domain model
![modelo-conceitual](https://user-images.githubusercontent.com/59379254/103614771-242a0b80-4f08-11eb-9c73-deff3f990b48.png)

### Layers pattern adopted
![camadas](https://user-images.githubusercontent.com/59379254/103614806-3441eb00-4f08-11eb-800a-f69a21306064.png)

## Checklist
- Initial project setup
    - Dependencies
    - .properties files
    - Security configuration
- Domain model
    - Entities and relationships
    - Object-relational mapping
    - Seed
- Create endpoints
    - [GET] / products
    - [GET] / orders
    - [POST] / orders
    - [PUT] / orders / {id} / delivered
- Validate dev profile
    - Local Postgres database
    - Test all endpoints
- Prepare project for implementation
    - system.properties file
    - Profile prod -> commit
- Deploy project on Heroku
    - Create app and provision Postgres
    - Create remote database
    - Run commands on Heroku CLI
  
## How to run:
run the command below to initialize:
```
mvn spring-boot:run
```