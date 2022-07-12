# Reward service
* [General info](#general-info)
* [Technologies](#technologies)
* [Setup](#setup)
* [Endpoints](#setup)
* [Troubleshooting](#troubleshooting)
* [Author](#author)


## General info
This project is simple app which calculate number of reward points for received transactions.
	
## Technologies
Project is created with:
* Spring Boot 2.7.1
* Java 1.11
* MongoDB
	
## Setup
To run this project execute:

Step 1
* git clone --recursive https://github.com/phawlicki/reward.git
* cd reward
* mvn install

Step 2 

In the project base directory:
* cd setup
* docker-compose up

Step 3

Run app

## Endpoints
* Save transaction Http method: POST http://localhost:8080/rewards/transaction
* Get reward Http method: GET http://localhost:8080/rewards/points?customerId={id}&from={date}
* Update transaction Http method: PUT http://localhost:8080/rewards/transaction
* Delete transaction Http method: DELETE http://localhost:8080/rewards/points?id={id}

## Troubleshooting
Please note that if you clone repository using Intellij, sometimes after import and install you need to use "Reload all maven project" button to properly mark package(as a generated source root) with generated clases from json schema.

## Author
* Przemysław Hawlicki
