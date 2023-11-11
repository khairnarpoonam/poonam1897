package Assignment1;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
public class hamrcrestt {
    @Test
	public void get_call() {
		RestAssured.given()
		.contentType(ContentType.JSON)
		.when()
		.get("https://reqres.in/api/users?page=2")
		.then()
		.log().body();
		
		
	}
}
