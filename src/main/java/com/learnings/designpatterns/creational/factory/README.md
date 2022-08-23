Factory pattern is one of the most used design patterns in Java to create objects.

###In Factory pattern, we create object without exposing the creation logic to the client and refer to newly created object using a common interface.
Factory method is used to achieve low coupling.

here interface is defined as OS and an abstract method in it as feature.
3 classes have defined as Windows, Android, Ios and implemented the interface.
feature method has override in all classes to print; "im going to die", "most powerful os", "secure os " respectively.

####A separate class has defined as OperatingSystemFactory with a method public OS getInstance(String str) {}. 

That method returns OS type objects according to the string parameter it get.

Finally there is a class as Main which contain the main method.
It create an object of  OperatingSystemFactory class and calls the getInstance() in it which return a OS type object. and calls the feature method.