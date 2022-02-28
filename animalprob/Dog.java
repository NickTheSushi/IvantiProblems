package ivanti.animalprob;

public class Dog extends Animal {

    String furColor;
    String breed;

    // Constructors
    public Dog(String name) {
        super(name);
    }

    public Dog(String name, String furColor, String breed) {
        super(name);
        this.furColor = furColor;
        this.breed = breed;
    }

    // Methods
    public String bark() {
        return "Woof! Woof!";
    }

    // Getters and Setters
    public String getFurColor() {
        return furColor;
    }

    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
