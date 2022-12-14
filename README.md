# fizzbuzzapi
Fizzbuzz embeded in an API

1. Requirements

- Docker / Docker-compose : If you don't use Docker desktop app for Windows you will need;
WSL VM with a Linux distribution set or a "native" Linux machine 

- An API platform such as Postman, Insomnia...

- A Java IDE such as Intelliji, Eclipse..

- JDK 11 

2. App stack used for current version :
    - JDK 11
    - SpringWeb
    - Flyway
    - Postgres 12
    - Spring JPA
    - Docker-compose


3. Running APP

- Clone the following repo : https://github.com/NicolasDelaval/fizzbuzzapi.git

- According to which platform you use Docker, start docker service and execute "docker-compose up -d" within the root folder of the repo

- Open the project within your IDE and run it : you're now all set

- If you wish to connect the pgs containerized db in your IDE :
  url : jdbc:postgresql://127.0.0.1:5438/fizzbuzz
  user: fizz
  pwd : buzz

- Launch your API plaftorm and generate a POST request to the following url : http://localhost:8080/api/v1/fizzbuzz/postfizz
  with the following body format :

  {
    "int1" : integer,
    "int2" : integer,
    "intLimit":integer,
    "str1" : "String",
     "str2" : "String"
   }

   You will receive the expected behaviour from a "fizzbuzz" algorythm within the response pane

- If you wish to get all previous post requests persisted in db, please send a GET request to the following URL : http://localhost:8080/api/v0.1/fizzbuzz//getallfizz


4.known issues (v1.0) :
   The following request works fine executed in pgs console

    SELECT int1 as Param1, int2 as Param2, str1 as Param3, str2 as Param4,
    count(*) AS numberHits
    FROM topfizz
    GROUP BY int1,int2,str1,str2
    HAVING COUNT(*)>1
    LIMIT 3

    Used as a native query within the app, it generates a 500 error while being called by a GET
    Request. 




  



