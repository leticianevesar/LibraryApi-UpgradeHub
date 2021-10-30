# Library SpringBoot API with MySQL - Backend Bootcamp.

This document provides an example of a Library REST API.

Main features:
- Manage your books.
- Add/Update/Delete books by ID.
- Add/Update/Delete categories by ID.
- Add/Update/Delete users by ID.

# CRUD Methods

## book-controller



| HTTP METHOD | GET              |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | READ       
| ​/api/getBooks       		   	   | get all books       
| ​​/api​/getBooksById​/{id}  	 | get books by ID 

| HTTP METHOD | CREATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | POST          
| ​​/api​/createBook   		       | Create a new book

| HTTP METHOD | UPDATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | PUT          
| ​​​/api​/updateBook​/{id}    	 | Update book by ID

| HTTP METHOD | DELETE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | DELETE          
| ​​​​/api​/deleteBook​/{id}     | Delete book by ID



## category-controller



| HTTP METHOD | GET              |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | READ        
| ​/api/categories       		     | Get all categories
| /api/getCaregoriesById/{id}    | Get categories by ID        

| HTTP METHOD | CREATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | POST          
| ​​/api/createCategory   	     | Add new categories

| HTTP METHOD | UPDATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | PUT          
| ​​​/api/updateCategory/{id}    | Update category by ID

| HTTP METHOD | DELETE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | DELETE          
| ​​​​/api/deleteCategory/{id}   | Delete category by ID



## user-controller




| HTTP METHOD | GET              |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | READ        
| ​/api/getUsers              	 | Get all users
| /api/getUsersById/{id}         | Get users by ID        

| HTTP METHOD | CREATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | POST          
| ​​/api/createUsers    	       | Add new users

| HTTP METHOD | UPDATE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | PUT          
| ​​​/api/updateUsers/{id}       | Update users by ID

| HTTP METHOD | DELETE           |
| ----------- | ---------------  | 
| CRUD OP	  			 	             | DELETE          
| ​​​​/api/deleteUser/{id}    	 | Delete user by ID
