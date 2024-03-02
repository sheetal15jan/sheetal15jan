package reqres.RestAssured;

import static io.restassured.RestAssured.given;

public class RestAssuredAPIs {
	public void singleUser()
	{
		//url: https://reqres.in/api/users/2
				//method: Get
				given()
				.when()
				.get("https://reqres.in/api/users/2")
				.then().log().all();
			
	}
	 public void listUsers()
	 {
		 given()
			.when()
			.get("https://reqres.in/api/users/23")
			.then().log().all();
	 }
	 public void getSingleUser()
	 {
		 given()
			.when()
			.get("https://reqres.in/api/users?page=2")
			.then().log().all();
	
	}
	 
	 public void list()
	 {
		 given()
			.when()
			.get("https://reqres.in/api/unknown")
			.then().log().all();
	
	}
	 public void singleList()
	 {
		 given()
			.when()
			.get("https://reqres.in/api/unknown/2")
			.then().log().all();
	
	}
	 public void singleNotFound()
	 {
		 given()
			.when()
			.get("https://reqres.in/api/unknown/23")
			.then().log().all();
	
	}
	 public void delayedResponse()
	 {
		 given()
			.when()
			.get("https://reqres.in/api/users?delay=3")
			.then().log().all();
	 }
    public void deleteUser()
    {
    	given()
		.when()
		.delete("https://reqres.in/api/users/2")
		.then().log().all();
    }
}