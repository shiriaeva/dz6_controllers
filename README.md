# dz6_controllers
ДЗ:  
реализовать два контроллера.  
* Один контроллер должен в качестве ответа на GET запрос отдавать шаблон, в котором выводится список всех заголовков запроса - [HeadersController.java:14-23](https://github.com/shiriaeva/dz6_controllers/blob/main/dz6_controllers/src/main/java/com/instance/controllers/HeadersController.java)  
![](https://github.com/shiriaeva/dz6_controllers/blob/main/dz6_controllers/screenshots/get.png)
* Второй контроллер должен принимать на вход JSON вида:
{  
    "price": 125.0,  
    "info": {  
        "date": "2022-01-01"  
    }   
}  
и отдавать его обратно при этом добавить в ответ свойство id:  
{  
    "price": 125.0,  
    "info": {  
        "id": 123,  
        "date": "2022-01-01"
    }   
}  
-[HeadersController.java:25-29](https://github.com/shiriaeva/dz6_controllers/blob/main/dz6_controllers/src/main/java/com/instance/controllers/HeadersController.java)
![](https://github.com/shiriaeva/dz6_controllers/blob/main/dz6_controllers/screenshots/set.png)
	
* написать обработчик ошибок, который будет возвращать кастомную 502 ошибку - [Exception.java](https://github.com/shiriaeva/dz6_controllers/blob/main/dz6_controllers/src/main/java/com/instance/controllers/Exception.java)
![](https://github.com/shiriaeva/dz6_controllers/blob/main/dz6_controllers/screenshots/502.png)
