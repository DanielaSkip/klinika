public class Dog extends Pet {

    private String tail;

    public Dog(String name, int age, int weight, boolean health, String species,String tail) {

        super(name, age, weight, health, species);

        this.tail = tail;

    }

    public String toString() {

        return ("Pet's name: " + getName() + "\nPet's age: " + getAge() + "\nPet's weight: "

                + getWeight() + "kg" + "\nHealth: " + isHealth() + "\nspecies: " + getSpecies());

    }

    public String getTail() {

        return tail;

    }

    public void setTail(String tail) {

        this.tail = tail;

    }

}