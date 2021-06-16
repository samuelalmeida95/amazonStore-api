# WebServices-SpringBoot-JPA

![spring-boot](https://user-images.githubusercontent.com/19534807/82755512-54be9a00-9daa-11ea-8e76-5190e0a0074d.png)

## Projero web service com Spring boot, JPA e Banco de dados SQL

Web service criado com as tecnologias java, spring boot, JPA em conjunto com banco de dados relacional SQL,
a aplicação se encontra disponivel do heroku.


## Aplicação disponivel em:

https://ifoodclone-api.herokuapp.com/

## Serviços disponíveis

##  USER:
#### [GET]    https://ifoodclone-api.herokuapp.com//users
#### [GET]    https://ifoodclone-api.herokuapp.com//users/id
#### [POST]   https://ifoodclone-api.herokuapp.com/users
	{
	  "name": "Maria sales",
	  "email": "msales@gmail.com",
	  "phone": "9775979797",
	  "password": 123456
	 }
#### [PUT]    https://ifoodclone-api.herokuapp.com/users/id
	{
	  "name": "Bob",
	  "email": "bob@gmail.com",
	  "phone": "9775979797"
         }
#### [DELETE] https://ifoodclone-api.herokuapp.com/users/id

## PRODUCT:
#### [GET]    https://ifoodclone-api.herokuapp.com/products
#### [GET]    https://ifoodclone-api.herokuapp.com/products/id

## CATEGORY:
#### [GET]    https://ifoodclone-api.herokuapp.com/categories
#### [GET]    https://ifoodclone-api.herokuapp.com/categories/id

## ORDER:
#### [GET]    https://ifoodclone-api.herokuapp.com/orders
#### [GET]    https://ifoodclone-api.herokuapp.com/orders/id

## MODELO DE DOMÍNIO

![Domain model](https://user-images.githubusercontent.com/19534807/82755495-3ce71600-9daa-11ea-8641-d01bfcaf1720.png)

## MODELO DE INSTÂNCIA

![Domain Instance](https://user-images.githubusercontent.com/19534807/82755481-280a8280-9daa-11ea-9be0-44ce2affc36b.png)

