import java.util.*;
public class AnimalCollector {
  private LinkedList<Animal> animals;
  public AnimalCollector() {
    this.animals = new LinkedList<Animal>();
  }//AnimalCollector

  public void addAnimal(Animal anAnimal) {
    this.animals.add(anAnimal);
  }//addAnimal
  public void removeAnimal(Animal anAnimal) {
    this.animals.remove(anAnimal);
  }//removeAnimal

  public void print() {
    for(Animal animal : this.animals) {
      System.out.print(animal);
    }//for
  }//print
}//AnimalCollector
