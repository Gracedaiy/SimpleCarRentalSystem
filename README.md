# Car Rental System #

## Description ##
It is a simple car rental system. In this project, I defined the **Car** class and this class has five attributes/porperties. Alternatively, like the tree below.
* Car
  * `id` - The identify number of different types of cars.
  * `name` - The brand of cars.
  * `rental fee` - The rental fee of each type of car.
  * `manned` - How many people the car can handle.
  * `cargo` - How large the cargo is.

In this simple system, the customers can get the rental car information and choose the type of cars to rent. At last, the system shows that how many people can these cars handle and also the cargo size. In addition, the system can calculate the total price.

## Examples ##
To play with this system, you may import the CanRental project to Eclipse/myEclipse form this directory.
Here is an example:
```
Welcome to MEIMENG car rent system:
Are you going to rent a car: 1. Yes   0. No
1
The rental cars' information:
ID	Name       	        Rental     	Container
1.	AudiA4   	        500$/day	manned:4person
2.	Mazda6   	        400$/day	manned:4person
3.	Chevy6   	        450$/day	manned:4person  cargo:2person
4.	KingLong   	        800$/day	manned:20person
5.	SonghuaRiver   	    400$/day	cargo:4ton
6.	Iveco   	        1000$/day	cargo:20ton
Please enter the number of cars you want to rent:
2
1.	Please enter the ID number:
4
2.	Please enter the ID number:
6
Your billing:
***Manned Car:
KingLong	Total: 20person
***Cargo Car:
Iveco	Total: 20tons
***Total Price:
Total: 1800$
```

