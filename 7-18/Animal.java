
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
  }//Animal


	/**
	* Returns value of type
	* @return
	*/
	public String getType() {
		return type;
	}//getType

	/**
	* Sets new value of type
	* @param
	*/
	public void setType(String type) {
		this.type = type;
	}//setType

	/**
	* Returns value of male
	* @return
	*/
	public boolean isMale() {
		return male;
	}//isMale

	/**
	* Sets new value of male
	* @param
	*/
	public void setMale(boolean male) {
		this.male = male;
	}//setMale

	/**
	* Returns value of age
	* @return
	*/
	public int getAge() {
		return age;
	}//getAge

	/**
	* Sets new value of age
	* @param
  */
	public void setAge(int age) {
		this.age = age;
	}//setAge

	/**
	* Returns value of name
	* @return
	*/
	public String getName() {
		return name;
	}//getName

	/**
	* Sets new value of name
	* @param
	*/
	public void setName(String name) {
		this.name = name;
	}//setName



	/**
	* Create string representation of Animal for printing
	* @return
	*/
	public String toString() {
		return "Animal [type=" + type + ", male=" + male + ", age=" + age + ", name=" + name + "]";
	}//toString

  public boolean equals(Animal anAnimal) {//Returns true when the two animals are equal
    //We need this for our Collector
    return anAnimal.getName().equals(this.name) && anAnimal.getType().equals(this.type) && anAnimal.getAge() == this.age && anAnimal.isMale() == this.male;
  }//equals
}
