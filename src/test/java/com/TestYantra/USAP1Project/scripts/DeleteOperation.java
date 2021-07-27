package com.TestYantra.USAP1Project.scripts;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.TestYantra.USAPIproject.genericLib.BaseClass;

public class DeleteOperation extends PostOperation{
	@Test
	public void tc3() throws FileNotFoundException, IOException {
		given()
		.auth().oauth2("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")
		.pathParam("ownerName",fileutilies.getData("username"))
		.pathParam("repoName",gitname)
		.delete("https://api.github.com/repos/{ownerName}/{repoName}")
		.then().log().all();
	}

}
