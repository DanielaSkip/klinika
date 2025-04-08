import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

public class Pet {

    private String name;
    private int age;
    private double weight;
    private String species;
    private boolean health;

    // Change raw ArrayList to ArrayList<Pet> for type safety
    private static ArrayList<Pet> treatments = new ArrayList<>();

    public Pet(String name, int age, double weight, boolean health, String species) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.health = health;
        this.species = species;
        treatments.add(this);
    }

    public static void addPet(Pet pet) {
        treatments.add(pet);
    }

    public static void removePet(Pet pet) {
        treatments.remove(pet);
    }

    public String speak() {
        return "pet sound";
    }

    public void unexpectedIllnessOccurred() {
        this.health = false;
    }

    public void checkHealthStatus() {
        System.out.println("Checking health of " + name);
    }

    public void healing() {
        this.health = true;
    }

    public double acepromazine() {
        if (Objects.equals(species, "Dog")) {
            return (weight * 0.03);
        } else {
            return (weight) * (0.002);
        }
    }

    public double carprofen() {
        if (Objects.equals(species, "Dog")) {
            return (weight * 4) / (50);
        } else if (Objects.equals(species, "Cat")) {
            return (weight * 2) / (50);
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Pet's name: " + name + "\nPet's age: " + age + "\nPet's weight: "
                + weight + " kg" + "\nHealth: " + health + "\nSpecies: " + species;
    }

    public static void writeFile() {
        try (FileWriter fw = new FileWriter("klienti.txt")) {
            for (Pet pet : treatments) {  // Use Pet instead of raw Object type
                fw.write(pet.toString() + "\n");
                fw.write("Acepromazine dosage: " + pet.acepromazine() + " ml\n");
                fw.write("Carprofen dosage: " + pet.carprofen() + " ml\n\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public boolean isHealth() {
        return health;
    }

    public void setHealth(boolean health) {
        this.health = health;
    }

    public static ArrayList<Pet> getTreatments() {  // Specify the type in the return type
        return treatments;
    }

    public static void setTreatments(ArrayList<Pet> treatments) {  // Specify the type
        Pet.treatments = treatments;
    }
}
