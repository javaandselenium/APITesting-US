package com.TestYantra.USAPIproject.genericLib;

public interface IEndPoints {

	public String getOperation="/repos/{owner}/{repo}";
	public String postOperation="/user/repos";
	public String patchOperation="/repos/{owner}/{repo}";
	public String deleeteOperation="/repos/{owner}/{repo}";
	
	
}
