package org.restapi.BookCrud.crud.model;

public class crudmodel {
	private int bid;
	private String name;

	public crudmodel() {

	}

	public crudmodel(int bid, String name) {
		super();
		this.bid = bid;
		this.name = name;
	}

	public int getId() {
		return bid;
	}

	public void setId(int id) {
		this.bid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}	
}
