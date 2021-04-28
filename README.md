## HTTP status code
#### What is not:
* is not yet another library containing HTTP status codes.
* is not a clone of existing solutions (Spring Framework, Apache HTTP).

#### Why:
* existing solutions don't offer support for non-standard status codes.

#### What is:
* a collection of standard and non-standard codes.
* it contains other info like RFC where a code was published or entity that uses a given code


### How to use it
The recommended way to use this library is through your build tool.

The http-status-code artifact is published to Maven Central, using the group `com.deevvi`.

Latest stable version is `1.1.0`.

Therefore,it can be added to your Gradle project by adding the dependencies:

```
compile "com.deevvi:http-status-code:1.1.0"
```
and in Maven:
```
<dependency>
    <groupId>com.deevvi</groupId>
    <artifactId>http-status-code</artifactId>
    <version>1.1.0</version>
</dependency>
```

Code example:

```
HttpStatusCode.isValidValue(999);
HttpStatusCode.resolve(100).isServerError();

HttpStatusCode statusCode = HttpStatusCode.resolve(300);
if(statusCode.isSuccessful()){
  ...
}
```

