###Mediator pattern is used to reduce communication complexity between multiple objects or classes.

This pattern provides a mediator class which normally handles all the communications between different classes and supports easy maintenance of the code by loose coupling.

Basically what has done is just embedding a method of another class in another method and prevent direct access.

Assume there is a chat room user. he calls a method in its class. but it get the out put with the help of another class