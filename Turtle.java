public class Turtle extends Pet {

    private String shell;

    public Turtle(String name, int age, int weight, boolean health, String species,String shell) {

        super(name, age, weight, health, species);

        this.shell = shell;

    }

    public String toString() {

        return ("Pet's name: " + getName() + "\nPet's age: " + getAge() + "\nPet's weight: "

                + getWeight() + "kg" + "\nHealth: " + isHealth() + "\nspecies: " + getSpecies());

    }

    public String getShell() {

        return shell;

    }

    public void setShell(String shell) {

        this.shell = shell;

    }

}