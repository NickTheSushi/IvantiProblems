package ivanti.animalprob;

abstract class Animal {

    String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Methods
    public String jump() {
        return "I jump!";
    }


    // Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

