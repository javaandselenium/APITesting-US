package com.TestYantra.USAP1Project.scripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;


public class DeleteOperation extends com.TestYantra.USAP1Project.scripts.BaseClass {
	@Test
	public void tc3() throws FileNotFoundException, IOException {
		given()
		.auth().oauth2("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")
		.pathParam("ownerName",fileutilies.getData("username"))
		.pathParam("repoName","GitProject")
		.delete("https://api.github.com/repos/{ownerName}/{repoName}")
		.then().log().all();
	}

}
