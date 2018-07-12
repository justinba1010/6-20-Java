public class Cat extends Animal {
  public Cat(boolean male, int age, String name) {
    super(male, age, name);
  }
  public void meow() {
    System.out.println(this.getName()+" meows.");
  }
}
