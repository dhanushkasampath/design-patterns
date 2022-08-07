###Facade - A single class that represents an entire subsystem.

Facade pattern hides the complexities of the system and provides an interface to the client using which the client can access the system.

there is an interface named  Shape with an abstract method draw().

three classes named, Circle, Rectangle, Square have implemented that interface and overrode the
draw() method.

There is a special class named ShapeMaker have created the 3 objects while creating its own object.
ShapeMaker calls the method in those three classes.

So the user can call the functions of those 3 classes by just calling drawCircle()/drawSquare()/drawRectangle() methods in the ShapeMaker class.

Therefore here ShapeMaker class represent the entire subsystem. 