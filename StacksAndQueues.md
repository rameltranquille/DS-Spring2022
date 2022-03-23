# Stacks and Queues



## Stacks and Stack ADT
**Stacks** are structures in which elements are always added and removed from the same end (depending on how you visualize the stack,
you may wish to think of that end as the top of the stack). Stacks *LIFO* structures.

```java
public interface Stack<E> {
	
	/** Add to the top of the stack
	 @ param item character to be added to stack
	*/
	public void push (E item);
	
	/** remove and return the top element
	*/
	public E pop ();
	
	/** return the element at the top or null if empty
	*/
	public E peek ();
	
	/** produces string representation of the stack
	 returns a String object that contains all elements stored on the stack. The elements are separated by spaces,
	 and the rightmost element was the top of the stack
	*/
	public String toString();
}
```

When using an array based implementation, we also need to make sure
the array grows and where the top and bottom are. In Java's implementation,
the bottom of the stack is always at index 0. 

The index of the first empty space = size. Thus, size is more efficient to calculate.

### Stack Implementation Using an Array

**Push**
```java
if size >= capacity
	grow the array and copy the contents to the new array
array[size] = new element
size++
```

**Pop**
```java
if size == 0 
	nothing todo
else
	size--
	return array[size]

```
**Alt Pop**
```java
if size == 0 
	nothing to pop
else
	tmp = array[size-1]
	array[size-1] = null
	size--
	return tmp

```
**Top**
```java
if size == 0
	nothing to return
else
	return array[size-1]

```
### Stack Implementation Using a Linked Structure
Again, we must decide where top and bottom should be. When implementing, using a LL,
we should start from the front/beginning of the list (using the tail as the bottom
and the top as the front). This saves us time when using the *pop()* method, because
we do not have to traverse through the list when popping the top value out.





## Queues and Queues ADT
A Queue is a DS in which elements are added to one end (rear/back of a queue) and removed from the other end (front of a queue). 
Queues are first in first out structures (FIFO).
```java
public interface Queue<E> {
	/** Add an element to the queue. 
	* param item - an element 
	*/
	public void enqueue (E item) ;
	
	
	/** Remove and return the element from the front of the queue
	* return the element from the front of the queue or null if queue is empty
	*/
	public E dequeue();
	
	/** Return the element from the front of the queue
	* return the element from the front of queue or null if queue is empty
	*/
	public E peek ();
	/** Compute a string representation of the queue
	* return String object representing the queue. The string should contain
	* the current queue elements one per line.
	*/
	public String toString();
}
// note that the names for the methods are different in java
```

As before, we must decide the front and the end of the queue, in addition to making sure the array capacity grows if necessary.
so for the following 

### Start Point & Capacity of array-based Q
- capacity = 8
- size = 3
- front = 2
- back = 5 (or 1 if you want to use a circular array)

*front* - index of the first element (size > 0)
*back* - index at which the next element should be added
$$
*size = back - front* mod capacity
$$
*Note on MOD: 10 mod 8 = 2. Its somewhat like the remainder after division. But not exactly.* Java's % is a remainder, not mod

*Note: In a circular array-based Queue, where there are empty locations in the front of the array, we wrap values back to
the start of the array instead of allocating a new one.*

**Additional Capacity for array-based Q**
- we want to copy the old values from the old array to our new one, so we multiply the capacity of the new unfilled-list
- thereafter we place values (not at their original index) but instead at index (i - front) mod capacity in the new array
- then we can place new values at the end 
- and easily remove values from the beginning
	* if this was not done, the larger array afterwards, would be disorganized and disrupt our normal Queueing operations

## Queue Using a Linked Structure
For the LL we must answer the previous question of where to start. For a Queue, which uses FIFO, we would 
want to access the first variable quickly as its the first to go. So we should start at the tail of the LL.
*And link backwards*.

Thus making the *dequeue* and *enqueue* operations constant time O(1).





