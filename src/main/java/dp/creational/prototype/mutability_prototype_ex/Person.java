package dp.creational.prototype.mutability_prototype_ex;

public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  // Copy constructor
  public Person(Person other) {
    this.name = other.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

//  Copy factory
//  @Override
//  public Person clone() {
//    try {
//      return (Person) super.clone();
//    } catch (CloneNotSupportedException e) {
//      throw new AssertionError();
//    }
//  }
}
