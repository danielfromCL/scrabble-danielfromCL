# Scrabble

![http://creativecommons.org/licenses/by/4.0/](https://i.creativecommons.org/l/by/4.0/88x31.png)

Interactive graphic programming language heavily inspired by 
[Scratch](https://scratch.mit.edu).
This work is licensed under a
[Creative Commons Attribution 4.0 International License](http://creativecommons.org/licenses/by/4.0/), 
and aims purely to be used with the purpose of teaching in the context of the course 
_CC3002 Metodologías de Diseño y programación_ of the 
[_Computer Sciences Department (DCC)_](https://www.dcc.uchile.cl) of the 
_University of Chile_.

---


Considerations to be made: the operations solicited, are implemented as the sum method, sub method, div method, mult method, and method, or method and neg method. As for the transformations, they're implemented as transformtoObject, where Object must be replaced by the class of the type of object desired (if it is allowed). Note that methods and transformations that were not allowed will return an object of the nullType, made using the Null Pattern.
As for the functionalities made for the second submission, I used the Composite Pattern in order to implement the Abstract Syntax Tree, where each inner node is an operation represented by it's own class and all the leaf nodes are the ITypes objects previously defined, all bound together by an AST Interface. As for the opitimization of memory, I used the Flyweight Pattern so as to not create new instances of objects that were already created. In order to do this I created a new factory class for each IType, where each factory has a Hashmap that allows the factory to check whether an object with that parameter has already been creaeted. I also made use of the Singleton Pattern in these factories so that there can only be one instance of each factory, guaranteeing that the same object can't be created twice by two different isntances of the same factory class.


I had previously written the following text: "One thing to note is that I didn't modify the methods previously defined for ITypes so that they would use these factories, since this would violate the modularity of the program, which in turn could lead to a case where I didn't want to optimize memory anymore and so I would delete these factories and my ITypes methods would stop working. With this in mind, I opted to only create these factories and not use them on the methods that I had already implemented."
However, I asked one of the auxiliary teachers if it was necessary for these methods to be changed and he said yes, so I modified all methods on ITypes so that now they use these flyweight factories in order to return their respective objects and in doing so I'm optimizing memory utilization.


Finally, I also made a Test class for every Class and Interface, so that shared functionalities between objects were tested on their respective Interface Test Class and functionalities that were unique to each Class were tested on their respective Test Class. 
