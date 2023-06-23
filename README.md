# HostBooks_fullstack_app

<h2>Prerequisites</h2>
<ul>
  <li> Basic familiarity with HTML & CSS </li>

  
  <li> Basic knowledge of JavaScript and programming </li>

    
  <li> Spring Boot Basics </li> 

    
  <li> Angular basics </li>

    
  <li> Node.js and npm installed globally </li>
  
</ul>

    

<h2>Tools and technologies used
Server-side technologies</h2>

<ul>
    <li> Spring Boot </li>
    <li> JDK - 1.8 or later </li>
    <li> Spring Framework </li>
    <li> Spring Data JPA (Hibernate) </li>
</ul>

<h2>Front end technologies</h2>

<ul>
    <li> Angular (Latest version as of now) </li>
    <li> Bootstrap 4 </li>
    <li> Node and NPM </li>
    <li> JQuery</li>
</ul>

<h2>Tools</h2>

<ul>
    <li> Maven - 3.2+ </li>
    <li> IDE - Eclipse or Spring Tool Suite (STS)          // Spring boot API development </li>
    <li> Visual Studio 2017                               // Angular App development </li>
    <li> Angular CLI </li>
</ul>


<h2>Testing REST APIs</h2>


Use below Rest endpoints to test CRUD Rest APIs and in Angular application.



Get All Employees:


HTTP Method: GET

      http://localhost:8080/api/v1/employees

Get Employee By Id:
HTTP Method GET

      http://localhost:8080/api/v1/employees/{employeeId}

Create Employee:
HTTP Method - POST

      http://localhost:8080/api/v1/employees

Update Employee
HTTP Method - POST

        http://localhost:8080/api/v1/employees/{employeeId}

Delete Employee By Id:
HTTP Method - DELETE

      http://localhost:8080/api/v1/employees/{employeeId}


Or you can go to Swagger UI for test.

      http://localhost:8080/swagger-ui/index.html


<h2>How to run the application</h2>

<ul>
  <li> First download or clone this respository in your local system. </li>
  <li> After that open frontend directory from root directory in vsCode or similar code editor. </li>
  <li> Open backend direcotry in STS or similar IDE.</li>
  <li> First install necessary node modules in your frontend project by excuting following command in terminal</li>
  
            npm i

            
Or

    
            npm install


  <li> Run the src/main/java/com/HostBooks/HostBookFullStackApplication.java file as Spring Application from backend directory.</li>
  <li> Now run the frontend angular project using following command in terminal. </li>

            ng serve
  <li> Backend part will be listening to port localhost:8080 And Frontend will listening localhost:4200</li>
  <li> Base url</li>
                http://localhost:4200/employees
</ul>

*You can refer to this video if you having some issu. [link](https://drive.google.com/file/d/19LdK-zQT1vsGBLQ0kLrX4PimRQ2y-Jc2/view?usp=drive_link)
