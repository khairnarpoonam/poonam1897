package Assignment1;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
public class CRUD {
	@Test
	public void get_call() {
		RestAssured.given()
		   .baseUri("https://reqres.in")
		   .basePath("/api/{env}")
		   .queryParam("id",2)
		   .pathParam("env","users?page")
	.when().log().all()
		  .get()
	.then()
		  .log().body();
		
	}

}
