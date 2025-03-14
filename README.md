# Point of Sale API

This is a simple Point of Sale system I built as a personal proejct. It uses MySQL as the database, Wildfly as the server and Postman as the interface through which you can perform actions on data.

## What it does

This system can be used to keep track of your inventory, departments, employees, customers and their invoices. It can also checkout customers with the option to apply discounts.

## How it works

The system is pretty straightforward. You can add customers to your database with their contact info, add items with prices and descriptions, and then process sales by entering the customer details (if new customer) or customerID (if previous customer), the items they are buying (itemID) and discounts, if applicable.

When you check a customer out, the system calculates the total price and stores the invoice data of that customer which can be referenced later on.

Since this is built as an API, you can use Postman to interact with the system. You can:
* Get list of items, departments, customer, employees, discounts, taxes using the GET request.
* Add new items, departments, customer, employees, discounts, taxes using POST request.
* Update information of items, departments, customer, employees, discounts, taxes using the PUT request.
* Delete information deemed unecessary using the DELETE request.


Since this was done as a personal project, the code might be a bit unstructured and hard to understand, please bear with it.
