package dp.creational.prototype.simple_prototype_ex;

import static dp.creational.prototype.simple_prototype_ex.Rabbit.Breed.HIMALAYAN;

public class Main {
  public static void main(String[] args) {
    Rabbit rabbit = new Rabbit();
    rabbit.setAge(8);
    rabbit.setBreed(HIMALAYAN);

    // clone method takes a snapshot of object at creation time, if any variable has changed after clone of original object
    // copy object won't have that variable.
    Rabbit copyRabbit = rabbit.clone();
//    rabbit.setBreed(HIMALAYAN); // NullPointerException
    System.out.println("original rabbit, age -> " + rabbit.getAge() + " breed -> " + rabbit.getBreed().name());
    System.out.println("copy rabbit, age -> " + copyRabbit.getAge() + " breed -> " + copyRabbit.getBreed().name());
  }
}
