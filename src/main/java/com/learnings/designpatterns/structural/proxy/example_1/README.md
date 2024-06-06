In proxy pattern, a class represents functionality of another class.

In proxy pattern, we create object having original object to interface its functionality to outer world.

###Implementation

We are going to create an Image interface and concrete classes implementing the Image interface. ProxyImage is a a proxy class to reduce memory footprint of RealImage object loading.

ProxyPatternDemo, our demo class, will use ProxyImage to get an Image object to load and display as it needs.