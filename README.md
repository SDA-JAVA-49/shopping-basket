# Exercise 10.
### Create a shop imitating application . 
- Create Basket class that will allow for adding ,
removing and retrieving all items in the basket. Each item is an instance of Product
interface that defines two methods , one to get price of an item and one to check for
availability based on a provided date
- Create GenericProduct class that implements Product interface and will have supplier
supplying price and function checking availability based on a provided date for a
particular product
- Make sure that Basket does not expose it’s internal list storing products ( meaning it will
not return a reference to it’s internal list but rather a copy ), all operations on that list
should be done through Basket methods