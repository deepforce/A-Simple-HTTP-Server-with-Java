## Build a simple HTTP sever with Java

#### How to make HTTP Server in Java

You can use  `ServerSocket`class in Java to create a Server which can accept requests.

#### Blocking Method

Blocking methods in Java are those methods which block the executing thread until their operation finished.

A famous example of blocking method is InputStream read() method which blocks until all data from InputStream has been read completely.

#### HTTP

This is the standard HTTP Server, its simple because HTTP is stateless, which means it doesn't need to remember previous connection, all it care for new incoming connections. This is endless cycle until server is stopped.



It's better to use `BufferedReader` because browser will send multiple line.

#### Resources

1.[Java Network Programming, 4th Addition](https://www.amazon.com/Java-Network-Programming-4th-Addition/dp/1449357679?creativeASIN=1449357679&linkCode=w61&imprToken=FF7NhC3IB1MN112dCR3EfQ&slotNum=0&tag=javamysqlanta-20)