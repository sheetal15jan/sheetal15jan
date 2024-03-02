package restapi.util;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
public class SpecificationBuilder {
	
	public static RequestSpecification specificationBuilder() 
	{
		RequestSpecBuilder spec = new RequestSpecBuilder();
		spec.setContentType(ContentType.JSON);
		spec.setBaseUri("https://gorest.co.in/");
		spec.setBasePath("public/v2/users/{id}");
		spec.addHeader("Authorization", "Bearer 85c6f1115fec90981521441b57f8073ad897ac5668776797cae3035a16187c98");
		RequestSpecification reqspec = spec.build();
		return reqspec;
	}

}
