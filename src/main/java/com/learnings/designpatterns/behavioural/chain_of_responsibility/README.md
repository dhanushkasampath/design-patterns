###Chain of Responsibility - A way of passing a request between a chain of objects.

There is a sender who send requests.

there are receivers who handle the requests(send responses.)

receivers are in a chain. if one receiver fail to handle the request the request is goes to the next receiver..