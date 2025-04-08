public class Parrot extends Pet {
    private boolean canSpeak;
    public Parrot(String name, int age, int weight, boolean health, String species, boolean canSpeak) {
        super(name, age, weight, health, species);
        this.canSpeak = canSpeak;

    }

    public String toString() {
        return super.toString() + "\nClassification" + canSpeak;
    }
}
