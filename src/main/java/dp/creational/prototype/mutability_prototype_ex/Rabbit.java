package dp.creational.prototype.mutability_prototype_ex;

// public class Rabbit implements Cloneable -> use clone() method
public class Rabbit {

    public enum Breed {
        HIMALAYAN,
        AMERICAN,
        MINI_REX,
        LIONHEAD,
        DUTCH
    }

    //Age in months
    private int age;
    private Breed breed;

    private Person owner;

    public Rabbit() {
    }

    public Rabbit(Rabbit other) {
        this.age = other.age;
        this.breed = other.breed;
        this.owner = new Person(other.owner);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Breed getBreed() {
        return breed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(String name) {
        this.owner = new Person(name);
    }

//    @Override
//    public Rabbit clone() {
//        try {
//            Rabbit cloneRabbit = (Rabbit) super.clone();
//            cloneRabbit.owner = owner.clone();
//            return cloneRabbit;
//        } catch (CloneNotSupportedException e) {
//            throw new AssertionError(e);
//        }
//    }
}
