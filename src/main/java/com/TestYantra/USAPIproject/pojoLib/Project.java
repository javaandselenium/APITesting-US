package com.TestYantra.USAPIproject.pojoLib;

public class Project {
	
	private String name;
	private String description;
	
	public Project(String name,String description) {
		super();
		this.name = name;
		this.description=description;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Project(String name) {
		super();
		this.name = name;
	}
	
	Project(){
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
