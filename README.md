Java-Design-Pattern
===================

Design Pattern for java Developer

This repository contains many example of Design patterns which is very helpful for design an Application eg:
<div>Creational Pattern
 <ul>
 <li><b>Factory Method </b>: When a client object does not know which class to instantiate, it can make use of the factory method to create
an instance of an appropriate class from a class hierarchy or a family of related classes. The factory method may be designed as part of the client itself or in a separate class.The class that contains the factory method or any of its subclasses decides on which class to select and how to instantiate it.</li>
<li> <b>Prototype</b>  - Provides a simpler way of creating an object by cloning it from an existing (prototype) object.</li>
<li><b>Singleton</b>  - Provides a controlled object creation mechanism to ensure that only one instance of a given class exists.</li>
<li><b>Abstract Factory Method</b> - Allows the creation of an instance of a class from a suite of related classes without having a client      object to specify the actual concrete class to be instantiated.</li>
<li> <b>Builder </b> -  Allows the creation of a complex object by providing the information on only its type and content, keeping the details of the object creation transparent to the client. This allows the same construction process to produce different representations of the object.</li>
</ul>
</div>

<div> Collectional
<ul>
<li><b>Composite </b> -Allows both individual objects and composite objects to be treated uniformly. 
<li><b>Iterator </b> - Allows a client to access the contents of an aggregate object (collection of objects) in some sequential manner, without having any knowledge about the internal representation of its contents.</li>
<li><b>Flyweight</b> - The intrinsic, invariant common information and the variable parts of a class are separated into two classes, leading to savings in terms of the memory usage and the amount of time required for the creation of a large number of its instances.</li>
<li> <b>Visitor</b> - Allows an operation to be defined across a collection of different objects without changing the classes of objects on
which it operates. </li>
</ul>
</div>


<div>Structural Pattern
<ul>
<li><b>Decorator</b> - Extends the functionality of an object in a manner that is transparent to its clients without using inheritance.</li>
<li><b>Adopter</b> - Allows the conversion of the interface of a class to another interface that clients expect. This allows classes with incompatible interfaces to work together.</li>
<li><b>Chain of Responsibility</b> - Avoids coupling a (request) sender object to a receiver object. Allows a sender object to pass its request along a chain of objects without knowing which object will actually handle the request.</li>
<li><b>Facade</b> - Provides a higher-level interface to a subsystem of classes, making the subsystem easier to use.</li>
<li><b>Proxy </b> - Allows a separate object to be used as a substitute to provide controlled access to an object that is not accessible by normal means.</li>
<li><b>Bridge</b> - Allows the separation of an abstract interface from its implementation. This eliminates the dependency between the two, allowing them to be modified independently.</li>
<li><b>Visual Proxy</b> - Facilitates the mechanism for delaying the creation of an object until it is actually needed in a manner that is
transparent to its client objects.</li>
<li><b>Counting Proxy</b> - When there is a need to perform supplemental operations such as logging and counting before or after a method call
on an object, recommends encapsulating the supplemental functionality into a separate object.</li>
<li><b>Aggregate Enforcer</b> - Recommends that when an aggregate object is instantiated,all of its member variables representing the set of
constituting objects must also be initialized. In other words, whenever an aggregate object is instantiated it must be constructed in full.</li>
<li><b>Explicit Object Release</b> - Recommends that when an object goes out of scope, all of the system resources tied up with that object must be released in a timely manner. </li>
<li><b>Object cache</b> -Stores the results of a method call on an object in a repository. When client objects invoke the same method,
instead of accessing the actual object, results are returned to the client object from the repository. This is done mainly
to achieve a faster response time. </li>
</ul>
</div>



       
