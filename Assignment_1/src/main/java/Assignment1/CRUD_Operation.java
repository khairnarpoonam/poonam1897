package Assignment1;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.*;
public class CRUD_Operation {
	@Test
	public void post_call() {
		RestAssured.given()
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"leader\"\r\n"
				+ "}")
		.contentType("application/json")
		.when()
		   .post("https://reqres.in/api/users")
		.then()
		   .log().body()
		   .log().all();
	    }
    @Test
	public void get_call() {
		RestAssured.given()
		.when()
		   .get("https://reqres.in/api/users")
		.then()
		   .log().body()
		   .log().all();
	}
    @Test
    public void put_call() {
    	
    	
    	RestAssured.given()
		.body("{\r\n"
				+ "    \"name\": \"morpheus\",\r\n"
				+ "    \"job\": \"zion resident\"\r\n"
				+ "}")
		.contentType("application/json")
		.when()
		   .put("https://reqres.in/api/users/2")
		.then()
		   .log().body()
		   .log().all();
    	}
    @Test
    public void delete_call() {
    	
    	RestAssured.given()
		.when()
		   .delete("https://reqres.in/api/users/2")
		.then()
		   .log().body()
		   .log().all();
    }
    
}
