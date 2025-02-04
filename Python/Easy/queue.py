'''Think of a queue as people standing in line in a supermarket.

The first person to stand in line is also the first who can pay and leave the supermarket. This way of organizing elements is called FIFO: First In First Out.

Basic operations we can do on a queue are:

Enqueue: Adds a new element to the queue.
Dequeue: Removes and returns the first (front) element from the queue.
Peek: Returns the first element in the queue.
isEmpty: Checks if the queue is empty.
Size: Finds the number of elements in the queue.
Experiment with these basic operations in the queue animation above.

Queues can be implemented by using arrays or linked lists.

Memory Efficient: Array elements do not hold the next elements address like linked list nodes do.
Easier to implement and understand: Using arrays to implement queues require less code than using linked lists, and for this reason it is typically easier to understand as well.'''


queue=[]

#Enqueue: Adds a new element to the queue.

queue.append("A")
queue.append("B")
queue.append("C")
queue.append("D")
print("Queue: ", queue)
#Dequeue: Removes and returns the first (front) element from the queue.

element=queue.pop(0)
print("Dequeue Element:", element)

#Peek: Returns the first element in the queue.
peekelement=queue[0]
print("Peek Element:", peekelement)

#isEmpty: Checks if the queue is empty.
isEmpty=not bool(queue)
print("isEmpty: ", isEmpty)

# Size
print("Size: ", len(queue))

