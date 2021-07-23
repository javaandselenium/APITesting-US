package com.TestYantra.USAP1Project.scripts;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

import com.TestYantra.USAPIproject.genericLib.BaseClass;
import com.TestYantra.USAPIproject.genericLib.IEndPoints;

import io.restassured.http.ContentType;

public class GetOperation extends BaseClass{
@Test
public void tc1() throws FileNotFoundException, IOException {
	given()
	.pathParam("ownerName",fileutilies.getData("username"))
	.pathParam("repoName","Gitproject")
	.get("https://api.github.com/repos/{ownerName}/{repoName}")
	.then().log().all()
	.assertThat().statusCode(200)
	.contentType(ContentType.JSON);
	
}
}
