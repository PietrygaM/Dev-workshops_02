package model;

public class UserGroup {

	private int id;
	private String name;

	public UserGroup(String name) {
		this.id = 0;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
