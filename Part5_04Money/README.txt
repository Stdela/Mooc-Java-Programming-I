In the Payment card exercise we used a double-type object variable to store the amount of money. 
In real applications this is not the approach you want to take, since as we have seen, calculating with doubles is not exact. 
A more reasonable way to handle amounts of money is create an own class for that purpose.

Plus
First create the method public Money plus(Money addition) that returns a new money object that is worth the total amount of the object whose method was called and the object that is received as the parameter.
Less
Create the method public boolean lessThan(Money compared) that returns true if the money-object on which the method is called on has a lesser value than the money object given as a parameter.
Minus
Write the method public Money minus(Money decreaser) that returns a new money object worth the difference of the object whose method was called and the object received as the parameter. If the difference would be negative, the worth of the created money object is set to 0.
