
class Dog extends Animal {
  private String breed;
  public Dog(boolean male, int age, String name, String breed) {
    super(male, age, name);
    this.breed = breed;
  }

  public void woof() {
    System.out.println(this.getName() + ", the " + this.getBreed() + ", barks.");
  }
  /**
  * Returns value of breed
  * @return
  */
  public String getBreed() {
  	return breed;
  }

  /**
  * Sets new value of breed
  * @param
  */
  public void setBreed(String breed) {
  	this.breed = breed;
  }
}
