# Intro

**Data Structure:** a collection of data items in a memory of a running program that are organizaed in some fashion that allows items to be stored and retrieved by some fixed methods. 

**Algorithms:** A logical sequence of discrete steps that describes a complete solution to a given problem commutable in a finite amount of time and space



*Q* Whats the difference between 
```java 
for (int num : numbers) {
	twiceNumbers.addLast(numbers.get(i) * 2);
}
for (int i = 0; i < size; i++) {
	twiceNumbers.addLast(num * 2);
}
```
"Good programmers worry about data structures and their relationships" - Linus Torvalds

## Code Comparison
*Creating a string full of A*
- Stringbuilder's append function vs String
- *Q* How is memory stored and organizeed for a function 
    
*Iterating over a list of numbers*
- For loop vs for each loop (the second is shorted)
*Creating and searching in collections of Circle objects*
- tree vs linked list (tree is much slower depending on method of creation of tree)
    
*Calculating Fibonacci Numbers*
- recursion vs iterating and storing (recursion can be dangerous, and is not efficient)
 
 ## Java Programs Basics
- source code -> javac Hello.java (Hello.java)
	+ A compiler translates bytecode into machine instructions
- bytecode -> java Hello (Hello.class)
	+ JVM (java virutal machine) interprets one line at a time into machine code, the CPU executes
- machine instructions
	+ a compiler translates the bycode into machine instructions

## Tips
- Understand the concepts and reasons for doing this
- Use pen and paper 
- Try solving problems by yourself
- Write code solutions yourself
- Treat mistakes and bugs as your friends
- Make friends
  
## Java Memory
Programs use memory to store data. 

Variables have four things assocaited with it (ex. int x = 10;)
- name (x)
- value (10)
- location (memory address)
- type (int)

**For primitive type variables** -> int, long, float, double, char, boolean
- value stored at the memory address is the actual value associated with the variable

```java
Circle c;
c = new Circle(15);
```
assigning the Circle object to c, means that the value of c variable is set to memory address of the new Circle object
we say that c *refers to the object*


**A Program organizes its things in two different memory areas:**
1. heaps
2. stack


Stack - all local variables and temp information for functions/methods are stored
- organized in  memory blocks called stack frames
- each block belongs to  a function/method
- the block of a function that is currently executing is on top
- right below it is a block of a function (that called the currently executing function)
- block for main is always at the bottom of the stack



[Stack Example](https://cs.nyu.edu/~joannakl/cs102_s22/slides/02-java-memory.html#28)
![Stack Example](https://cs.nyu.edu/~joannakl/cs102_s22/slides/02-java-memory.html#28)

- Each stack frame contains info about local variables that the function creates
	- the function arguments
	- all locally created variables
	- the return value (if applicable)
	
	
**Heap** - chunks of memory are all over the place when allocated to different arrays and objects 
- occurs whenever we use the keyword *new*
 
 
 Arrays in java are always stored on the in consecutive memory locations
 ```java
int [] array = new int[10];
```
