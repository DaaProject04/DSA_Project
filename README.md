Install Java.
Spring Boot is a Java framework, so you will need to have Java installed on your computer. You can download Java from the Oracle website.
Install Maven or Gradle.
Spring Boot can be used with either Maven or Gradle as the build tool. If you do not have either of these tools installed, you can download them from their respective websites.
Create a new Spring Boot project.
You can use the Spring Initializr to create a new Spring Boot project. The Spring Initializr is a web-based tool that allows you to select the dependencies you want to include in your project.
Import the project into your IDE.
Once you have created a new Spring Boot project, you can import it into your IDE. If you are using Eclipse, you can use the Maven Import wizard to import the project. If you are using IntelliJ IDEA, you can use the Gradle Import wizard to import the project.
Run the project.
Once you have imported the project into your IDE, you can run it by clicking the Run button. Spring Boot will start the embedded Tomcat server and deploy your application.
Here is an example of how to run a Spring Boot project in Eclipse:
Right-click on the project and select Run As > Maven build.
Select the spring-boot:run goal.
Click the Run button.
Spring Boot will start the embedded Tomcat server and deploy your application. You can then access your application in a web browser at 
http://localhost:8080

http://localhost:8080/getall -- get all the info 

http://localhost:8080/heapbyid --- get all the info using heap sort

http://localhost:8080/mergebyid --- get all the info using merge sort

http://localhost:8080/insertionbyId --- get all the info using insertion sort

http://localhost:8080/mergebyname  --- get all info using mergename

http://localhost:8080/mergebysalery --- get all info using mergebysalery

http://localhost:8080/insertionbyname ---  get all info using  insertionbyname

http://localhost:8080/insertionbysalery --- get all info using insertionbysalery

    @Test
	void testInsertionSortById(){
		comparing(personService.insertionSortById().getPersons(), testData.sortById());
	}

	//used to test insertionsortbyname
	@Test
	void testInsertionSortByName(){
		comparing(personService.insertionSortByName().getPersons(), testData.sortByName());
	}

	//used to test inertionsortbysalery
	@Test
	void testInsertionSortBySalery(){
		comparing(personService.insertionSortBySalery().getPersons(), testData.sortBySalery());
	}