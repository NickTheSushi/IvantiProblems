package ivanti.animalprob;

public class Main {

    // Class to test my implementation
    public static void main(String[] args) {
        // Create a dog and frog using the super constructors
        Dog dogOne = new Dog("Stan");
        Frog frogOne = new Frog("Charlie");

        System.out.println("Meet my dog "+dogOne.getName()+" and my frog "+frogOne.getName());
        System.out.println(dogOne.getName()+": "+dogOne.jump());
        System.out.println(dogOne.getName()+": "+dogOne.bark());
        System.out.println(frogOne.getName()+": "+dogOne.jump());
        System.out.println(frogOne.getName()+": "+frogOne.croak());

        System.out.println("");

        // Create a dog and frog defining other fields
        Dog dogTwo = new Dog("Terra","Black","Shiba Inu");
        Frog frogTwo = new Frog("Hops",true,"Blue");

        System.out.println("Meet my neighbor's dog "+dogTwo.getName()+" and frog "+frogTwo.getName());
        System.out.println(dogTwo.getName()+" is a "+dogTwo.getBreed()+" and has "+dogTwo.getFurColor()+" fur.");

        System.out.println("We're not sure if it's "+frogTwo.isPoisonous()+" if "+frogTwo.getName()+ " is poisonous. Lets look it up.");
        frogTwo.setPoisonous(false);
        System.out.println("Turns out it's "+frogTwo.isPoisonous()+" so its safe to pet "+frogTwo.getName());
    }
}
