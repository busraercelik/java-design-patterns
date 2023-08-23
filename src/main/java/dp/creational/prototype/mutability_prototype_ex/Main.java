package dp.creational.prototype.mutability_prototype_ex;


public class Main {
  public static void main(String[] args) {
    Rabbit originalRabbit = new Rabbit();
    originalRabbit.setOwner("Sally");
//    Rabbit copyRabbit = originalRabbit.clone();
    Rabbit copyRabbit = new Rabbit(originalRabbit);

    System.out.println("Original Owner Name " + originalRabbit.getOwner().getName());
    System.out.println("Copy Owner Name " + copyRabbit.getOwner().getName());

    // this changes the name of the original originalRabbit owner as well.
    copyRabbit.getOwner().setName("Steve");
    System.out.println("Original Owner Name " + originalRabbit.getOwner().getName());
    System.out.println("Copy Owner Name " + copyRabbit.getOwner().getName());
  }
}
