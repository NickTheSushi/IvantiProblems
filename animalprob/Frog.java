package ivanti.animalprob;

public class Frog extends Animal {

    boolean isPoisonous;
    String color;

    // Constructors
    public Frog(String name) {
        super(name);
    }

    public Frog(String name, boolean isPoisonous, String color) {
        super(name);
        this.isPoisonous = isPoisonous;
        this.color = color;
    }

    // Methods
    public String croak() {
        return "Ribbit! Ribbit!";
    }

    // Getters and Setters
    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
