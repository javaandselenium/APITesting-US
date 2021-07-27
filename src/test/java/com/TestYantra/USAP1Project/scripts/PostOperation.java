package com.TestYantra.USAP1Project.scripts;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import com.TestYantra.USAPIproject.genericLib.JavaUtility;
import com.TestYantra.USAPIproject.genericLib.PropertyFiledata;
import com.TestYantra.USAPIproject.pojoLib.Project;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class PostOperation  {
	public PropertyFiledata fileutilies=new PropertyFiledata();
	public String gitname;

@Test
public void tc2() throws FileNotFoundException, IOException {
	String name="apitestioi"+JavaUtility.getRanDomNum();
	Project p=new Project(name);
	
	Response resp = given()
	.auth().oauth2("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")
	.contentType(ContentType.JSON)
	.body(p)
	.post("https://api.github.com/user/repos");
	resp.then().log().all()
	.assertThat().statusCode(201);
	
 gitname = resp.jsonPath().get("name");
	System.out.println(gitname);

	

	Project p1=new Project(name,"Hello dummy project");
	given()
	.auth().oauth2("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")
	.contentType(ContentType.JSON)
	.body(p1)
	.pathParam("ownerName",fileutilies.getData("username"))
	.pathParam("repoName",gitname)
	.patch("https://api.github.com/repos/{ownerName}/{repoName}")
	.then().log().all();
	
	
	
	
	

		
	}
}
