package reqres.RestAssured;

import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import sheetal.dto.Userdto;

public class Reqrespost {
	
	
	public void createUser()
	 {
		Userdto user= new Userdto();
		user.setName("koul");
		user.setJob("QA");
		 given()
//		 .body("{\r\n"
//		 		+ "    \"name\": \"morpheus\",\r\n"
//		 		+ "    \"job\": \"leader\"\r\n"
//		 		+ "}")
		 .body(user)
		 .contentType(ContentType.JSON)
		    .log().body()
			.when()
			.post("https://reqres.in/api/users")
			.then().log().all();
	
	}
	public void updateUser()
	 {
		 given()
		 .body("{\r\n"
		 		+ "    \"name\": \"morpheus\",\r\n"
		 		+ "    \"job\": \"manager\"\r\n"
		 		+ "}")
		 .contentType(ContentType.JSON)
		    .log().body()
			.when()
			.put("https://reqres.in/api/users/2")
			.then().log().body();
	
	}
	
	public void updatePatch()
	 {
		 given()
		 .body("{ \"job\": \"QA\"\r\n"
		 		+ "}")
		 .contentType(ContentType.JSON)
		    .log().body()
			.when()
			.patch("https://reqres.in/api/users/2")
			.then().log().body();
	
	}
}
