# CRUD operation using Spring,Jersey Rest Services, JPA 

# Technologies
Java, 
Spring-core, Spring-Security, 
MySql (for rest authentication & insert data),
JPA(Hibernate ORM),
Html, CSS, Maven

# Use below REST services for CRUD Operation
# 1. CREATE Method:POST 
http://localhost:8080/jersey-spring-jpa-mysql/user/create-user </br>
{
	"lastName": "ooasssssss",
	"firstName": "aaaaaaaa",
	"email":"acd@ggg.com",
  "sex":"male"
} 
# 2. GET By Id Method:GET
http://localhost:8080/jersey-spring-jpa-mysql/user/user-info/1
