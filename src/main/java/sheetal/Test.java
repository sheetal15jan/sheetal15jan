package sheetal;
import static io.restassured.RestAssured.given;

import gorest.APIs.User;
import reqres.RestAssured.Reqrespost;
import reqres.RestAssured.RestAssuredAPIs;
public class Test {
	
	public static void main(String[] args) {
		//int i;
 //RestAssuredAPIs reqres = new RestAssuredAPIs();
 //reqres.deleteUser();
//				reqres.singleUser();
			//	reqres.listUsers();
//				reqres.getSingleUser();
//				reqres.list();
//				reqres.singleList();
//				reqres.singleNotFound();
//				reqres.delayedResponse();
		//Reqrespost reqrespost = new Reqrespost();
		//reqrespost.createUser();
	//	reqrespost.updateUser();
	//	reqrespost.updatePatch();
				User user = new User();
				//user.getUser();
				user.deleteUserBySpecBuilder();
				
	}

}
