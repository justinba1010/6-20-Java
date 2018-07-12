
public class Animal {
  private String type;
  private boolean male;
  private int age;
  private String name;
  public Animal(String type, boolean male, int age, String name) {
    this.type = type;
    this.male = male;
    this.age = age;
    this.name = name;
  }


	/**
	* Returns value of type
	* @return
	*/
	public String getType() {
		return type;
	}

	/**
	* Sets new value of type
	* @param
	*/
	public void setType(String type) {
		this.type = type;
	}

	/**
	* Returns value of male
	* @return
	*/
	public boolean isMale() {
		return male;
	}

	/**
	* Sets new value of male
	* @param
	*/
	public void setMale(boolean male) {
		this.male = male;
	}

	/**
	* Returns value of age
	* @return
	*/
	public int getAge() {
		return age;
	}

	/**
	* Sets new value of age
	* @param
	*/
	public void setAge(int age) {
		this.age = age;
	}

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}
}
