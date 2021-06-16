<h1 align="center"> 💻 Sobre o Projeto </h1> 

<div align="center" > 
    <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white"/>
    <img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"/>
    <img src="https://img.shields.io/badge/Insomnia-5849be?style=for-the-badge&logo=Insomnia&logoColor=white"/>
    <img src="https://img.shields.io/badge/Heroku-430098?style=for-the-badge&logo=heroku&logoColor=white"/>
    <img src="https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white"/>
</div>

<br> 


<h3><i>Olá, este é um projeto Web service criado com as tecnologias java, spring boot, JPA em conjunto com banco de dados relacional SQL, a aplicação está disponibilizada no Heroku.</i></h3>

##

### ⌛ <i>Status do Desafio: **`Concluido`** ✔</i>
 
##

## 🥇 <i>Aplicação disponivel no Heroku:</i>

https://amazonstore-api.herokuapp.com

## 🛠  <i>Serviços disponíveis</i> 

### 👨‍💻 <i>User:</i>

 **[GET]**  https://amazonstore-api.herokuapp.com/users
 <br>
 **[GET]**  https://amazonstore-api.herokuapp.com/users/id
 <br>
 **[POST]**  https://amazonstore-api.herokuapp.com/users
 <br>
 **[PUT]**  https://amazonstore-api.herokuapp.com/users/id
 <br>
 **[DELETE]** https://amazonstore-api.herokuapp.com/users/id

   ```
   {
     "id": 1,
     "email": "Maria Brown",
     "nome": "maria@gmail.com",
     "phone": "988888888",
     "password": "123456"
   }
   ``` 
   
### 🎁 <i>Product:</i>

 **[GET]**    https://amazonstore-api.herokuapp.com/products
 <br>
 **[GET]**    https://amazonstore-api.herokuapp.com/products/id

``` {
      "id": 1,
      "name": "The Lord of the Rings",
      "description": "Lorem ipsum dolor sit amet, consectetur.",
      "price": 90.5,
      "imgUrl": "",
      "categorias": [
         {
            "id": 2,
            "name": "Books"
         }
 ```

### 📌 <i>Category:</i>

 **[GET]**    https://amazonstore-api.herokuapp.com/categories
 <br>
 **[GET]**    https://amazonstore-api.herokuapp.com/categories/id

```
   {
      "id": 1,
      "name": "Electronics"
   },
   {
      "id": 2,
      "name": "Books"
   },
   {
      "id": 3,
      "name": "Computers"
   }
```

### 🛒 <i>Order:</i>

 **[GET]**    https://andrealvesdc-web-serve-sb-jpa.herokuapp.com/orders
 <br>
 **[GET]**    https://andrealvesdc-web-serve-sb-jpa.herokuapp.com/orders/id

```
 {
      "id": 1,
      "moment": "2019-06-20T19:53:07Z",
      "orderStatus": "PAID",
      "client": {
         "id": 2,
         "email": "Alex Green",
         "nome": "alex@gmail.com",
         "phone": "977777777",
         "password": "123456"
      },
      "items": [
         {
            "quantity": 2,
            "price": 90.5,
            "product": {
               "id": 1,
               "name": "The Lord of the Rings",
               "description": "Lorem ipsum dolor sit amet, consectetur.",
               "price": 90.5,
               "imgUrl": "",
               "categorias": [
                  {
                     "id": 2,
                     "name": "Books"
                  }
               ]
            },
            "subTotal": 181.0
         }
 ```
##
 
### 🎯 MODELO DE DOMÍNIO

![Domain model](https://user-images.githubusercontent.com/19534807/82755495-3ce71600-9daa-11ea-8641-d01bfcaf1720.png)

## 

### 🚀  MODELO DE INSTÂNCIA

![Domain Instance](https://user-images.githubusercontent.com/19534807/82755481-280a8280-9daa-11ea-9be0-44ce2affc36b.png)

## 

<p align="center">Feito com 💚 by Samuel Almeida</p>

<br>

<div align="rigth">
    <img src="https://img.shields.io/badge/STATUS-CONCLUIDO-<#12EAEA>.svg"/>
</div>
