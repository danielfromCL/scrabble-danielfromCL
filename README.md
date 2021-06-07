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


There's one consideration to be made: Even though the IntBinary Interface doesn't have to extend INumbers, I preferred to do so in order for to be explicit that everything that an INumbers object has, an IntBinary object also has. This was also made with extensibility in mind, so that if there are new numbers types added in the future that share functionality with any of these interfaces, or if there are new methods that can receive or return INumbers objects, they'll be easily added.
Aside from that, since Float and Int objects both could receive any INumbers object as parameter for its operations, I grouped both into an Interface called FloatInt. As for Binary objects, since they could only receive Binary and Int objects as parameter for its operations, I also grouped both into an Interface called IntBinary. Also, since Binary and Bool both have logical operations, I grouped both into an ILogical interface where their methods are declared.
As for the operations solicited, they're implemented as the sum method, sub method, div method, mult method, and method, or method and neg method. As for the transformations, they're implemented as transformtoObject, where Object must be replaced by the class of the type of object desired (if it is allowed). Note that methods and transformations that were not allowed won't return null, they'll simply not work, since those methods don't exist for that specific class.
Finally, I also made a Test class for every Class and Interface, so that shared functionalities between objects were tested on their respective Interface Test Class and functionalities that were unique to each Class were tested on their respective Test Class. 
