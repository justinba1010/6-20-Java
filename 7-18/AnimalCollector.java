import java.util.*;
public class AnimalCollector {
  private ArrayList<Animal> animals;
  public AnimalCollector() {
    animals = new ArrayList<Animal>();
  }//AnimalCollector

  public void addAnimal(Animal anAnimal) {
    animals.add(anAnimal);
  }//addAnimal
  public void removeAnimal(Animal anAnimal) {
    animals.remove(anAnimal);
  }//removeAnimal

  public void print() {
    for(Animal animal : animals) {
      System.out.print(animal);
    }//for
  }//print
}//AnimalCollector
