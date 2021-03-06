# About project

### First task
 
It is a simple stateless application with a REST interface for validating JSON files.

**_Examples_**:

*Run the container with the service*:
```docker run -d --rm -p 80:80 JsonValidation```


*Sending a file to validate*:
```curl -s --upload-file filename.json http://localhost```

**_Example of service response in case of error_**:
```
{
 "errorCode"  : 12345,
 "errorMessage" : ["verbose, plain language description of the problem with hints about how to fix it]",
 "errorPlace" : ["highlight the point where error has occurred"],
 "resource"   : ["filename"],
 "request-id" : ["the request id generated by the API for easier tracking of errors"],
}
``` 
### Second task
 
The JSON Validation Service (JVS) is a validator that allows every users to check JSON objects for compliance with the JSON grammar.

*Create image with Gradle*: ```./gradlew crdockerimage```
