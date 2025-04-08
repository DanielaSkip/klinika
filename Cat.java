public class Cat extends Pet{

    private int eyes ;

    public Cat(String name,int age,int weight, boolean health,String species,int eyes ){

        super(name,age,weight,health,species);

        this.eyes =eyes;

    }

    public String toString() {

        return ("Pet's name: " + getName() + "\nPet's age: " + getAge() + "\nPet's weight: "

                + getWeight() + "kg" + "\nHealth: " + isHealth() + "\nspecies: " + getSpecies());

    }

    public int getEyes() {

        return eyes;

    }

    public void setEyes(int eyes) {

        this.eyes = eyes;

    }

}