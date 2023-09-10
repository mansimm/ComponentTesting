package authenticationtechniques;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class BearerTokenAuth {
	
	@Test
	public void bearerTokenAuthTest() {
		
		String bearerToken = "your_github_bearer_token";
		given()
			.headers("Authorization", "Bearer " + bearerToken)
		.when()
			.get("https://api.github.com/user/repos")				
		.then()
			.statusCode(200)
			.log().all();
	}

}
