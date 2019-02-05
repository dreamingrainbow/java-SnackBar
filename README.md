# Project (Snack Bar):
## Multi Class application -
### Shippable JAR file including

## class Snack

parameters : 
  * id
  * name
  * quantity
  * cost
  * vending machine id

methods : 
* set | get name
* set | get inventory
* get selection price
* buy items

```
ToDo  : 
	Add A Snack
		Assign Id
		Assign Name
		Add Inventory
		Set Price
		Get Selection Price
		Buy Selection
```
## class Vending machine

parameters : 
  * id
  * name

methods : 
* set | get name


## class Customer

parameters : 
  * id
  * name
  * cash on hand

methods : 
* set | get name
* add | get cash on hand
* buy selection


## Testing

##### Instantiate 2 customers
	Jane with $45.25
	Bob with $33.14
##### Instantiate 3 Vending Machines
	Food
	Drink
	Office
##### Instantiate 5 snacks
	In Vending Machine Food
		36 Chips at $1.75
		36 Chocolate Bar at $1.00
		30 Pretzel at $2.00
	In Vending Machine Drink
		24 Soda at $2.50
		20 Water at $2.75
	

Customer 1

> buys 3 of snack 4.

> Print Customer 1 Cash on hand.

> Print quantity of snack 4.

Customer 1 

> buys 1 of snack 3. 

> Print Customer 1 Cash on hand. 

> Print quantity of snack 3.

Customer 2

> buys 2 of snack 4. Print Customer 2 Cash on Hand. Print quantity of snack 4.

Customer 1 

> finds $10. 

> Print Customer 1 Cash on Hand.

Customer 1 

> buys 1 of snack 2.

> Print Customer 1 Cash on Hand.

> Print quantity of snack 2.

Snack 3 

> gets 12 more.
> Print quantity of snack 3.

Customer 2 

> buys 3 of snack 3.
> Print Customer 2 Cash on hand.
> Print quantity of snack 3.
