
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

  public String getType() {
    return type;
  }//getType

  public void setType(String type) {
    this.type = type;
  }//setType

  public boolean isMale() {
    return male;
  }//isMale

  public void setMale(boolean male) {
    this.male = male;
  }//setMale

  public int getAge() {
    return age;
  }//getAge

  public void setAge(int age) {
    this.age = age;
  }//setAge

  public String getName() {
    return name;
  }//getName

  public void setName(String name) {
    this.name = name;
  }//setName

  public String toString() {
    return "Animal [type=" + type + ", male=" + male + ", age=" + age + ", name=" + name + "]";
  }//toString

  public boolean equals(Animal anAnimal) {//Returns true when the two animals are equal
    //We need this for our Collector
    return anAnimal.getName().equals(this.name) && anAnimal.getType().equals(this.type) && anAnimal.getAge() == this.age && anAnimal.isMale() == this.male;
  }//equals
}
