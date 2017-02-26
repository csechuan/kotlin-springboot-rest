# springboot-kotlin-demo

Demonstrates:
- using Kotlin to write a RESTful API
- using Docker to run the application

***

## Building and Running the application
* containerize the application:
```
./gradlew clean build buildDocker
```
* run the container:
```
docker run --name demoapp -P -t csechuan/springboot-kotlin-demo
```
* stop and remove the container:
```
docker stop demoapp && docker rm demoapp
```
* list all containers:
```
docker ps -a
```
* list images:
```
docker images
```

Once the application is running, you can:
* open <http://localhost:8080> and you should see some json

