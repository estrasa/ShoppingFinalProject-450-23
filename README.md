# ShoppingFinalProject-450-23 

While this project has not reached full functionality, I will describe here the design concept.

The user will interact through the console, and the control flow will run much like it did in
the hospital assignment. There will be menus in the form of print statements, and the user 
will make selections by entering the number of their desired option. 

There is meant to be a Factory design for the products, and the IOAndMenuManager is meant to 
populate a catalog with every type of object for the user to browse. 

A Product has a name, price, and description.

The catalog may be browsed freely, allowing one to view a product description and go backwards 
in the menu. Adding a product to the cart will require sign-in, as the cart is meant to be 
associated with an account. 

An account only requires a username and password for creation. When selecting to place an order, 
the user will be prompted to enter name and address information.

The list of users will be saved in a Singleton UserList. When signing in, this list will be 
consulted to see if the entered username and password match an account on file. 

The cart will hold items in an ArrayList called contents, and keep track of the sum of 
prices of its contents, in a variable called total. The cart implements a CartManager 
interface with relevant methods. 

There is a class Order which instatntiates an object to hold data for an individual order. 
The class OrderLog contains an ArrayList to hold the orders that have been placed. 
OrderLog implements OrderManager.
