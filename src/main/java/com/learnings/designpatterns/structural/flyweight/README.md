###Fly Weight - A fine grained instance used for efficient sharing.

####Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and 
increase performance.

it tries to reuse already existing similar kind objects by storing them and creates new object when no matching object is found.

Hashmap data structure is used here.

assume we need to create circles with different colors. colors are red / green / blue/ black / white.

assume we need to create thousands of circles(objects) with those colors.

if we create objects for each colored circle, its a wastage of memory.

so in this pattern we create only five circles(objects) with those five colors and use them.