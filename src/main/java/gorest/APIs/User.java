package gorest.APIs;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import restapi.util.SpecificationBuilder;
import sheetal.dto.Goresdto;
import sheetal.dto.Userdto;
public class User {
    
	   public void createUser()
	   {
			Goresdto godto = new Goresdto();
			godto.setName("sheetal");
			godto.setEmail("sheetal@gmail.com");
			godto.setGender("female");
			godto.setStatus("active");
		   given()
//			 .body("{\r\n"
//			 		+ "    \"id\":2138539,\r\n"
//			 		+ "    \"name\":\"N koul\",\r\n"
//			 		+ "    \"email\":\"nkoul@stoltenberg-friesen.test\",\r\n"
//			 		+ "    \"gender\":\"female\",\r\n"
//			 		+ "    \"status\":\"active\"\r\n"
//			 		+ "}")
		   
             .body(godto)
			 .contentType(ContentType.JSON)
			 .header("Authorization","Bearer 85c6f1115fec90981521441b57f8073ad897ac5668776797cae3035a16187c98")
			  .log().body()
				.when()
				.post("https://gorest.co.in/public/v2/users")
				.then().log().all();
	   }  
		   public void getUser()
		   {
			    given()
				.when()
				.get("https://gorest.co.in/public/v2/users/5914175")
				.then().log().all();
		   }
		   public void deleteUserBySpecBuilder()
		   {
			   given(SpecificationBuilder.specificationBuilder())
			   .pathParam("id", "5914179")
			   .when()
			   .delete()
			   .then()
			   .log().all();
		   }
	   }


