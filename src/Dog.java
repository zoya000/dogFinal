import java.util.Scanner;

public class Dog {
    private int maturityLevel;
    private double age;
    private String breed;
    private String name;
    private String favoriteTreat;

    /**
     * Constructor that initializes all instance variables
     * @param maturityLevel maturity level from 1-10
     * @param age Age of the dog
     * @param breed Breed of the dog
     * @param name Dog's name
     * @param favoriteTreat The dog's ABSOLUTE favorite treat
     */
    public Dog(int maturityLevel, double age, String breed, String name, String favoriteTreat) {
        // sets all instance variables
        this.maturityLevel = maturityLevel;
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.favoriteTreat = favoriteTreat;
    }


    /**
     * Main method that takes user input to initialize a custom Dog object and stimulates
     * @param args System arguments
     */
    public static void main(String[] args) {
        Scanner scannie = new Scanner(System.in);
        System.out.print("How mature is your dog (1-10)? "); int mature = scannie.nextInt();
        System.out.print("How old is your dog? "); double age = scannie.nextDouble();
        scannie.nextLine();
        System.out.print("What breed is your dog? "); String breed = scannie.nextLine();
        System.out.print("What's you adorable pup's name? "); String name = scannie.nextLine();
        System.out.print("Lastly, what does your pup like to have as a treat? "); String treat = scannie.nextLine();
        Dog daDog = new Dog(mature, age, breed, name, treat);
        System.out.println("Someone's at the door!");
        // Knocks at door 4 times
        for (int i = 0; i < 4; i++) {
            System.out.println(daDog.knockAtDoor());
        }
        // Feeds Steak Jerky to Cleo
        daDog.feedTreats("Steak Jerky", 3);

    }

    /**
     * Method that determines the dog's response to a knock at the door based on qualities of the Dog
     * @return the bark the dog elicits
     */
    public String knockAtDoor() {
        // If dog is a poodle, has special bark
        if (this.breed.contains("poodle") ) { return "Arooooooo"; }
        // If the dog is middle-aged (5,10) or the dog is greatly mature for its age, it'll elicit a grown bark
        else if ( (this.age > 5 && this.age < 10) || (this.age > 1 && maturityLevel > 5 )) { return "BARKKKK!"; }
        // If dog is old or not super mature to actually bark
        else if ( this.age >= 10 || !(this.maturityLevel > 9)) { return "Bark."; }
        // Dog too tired to bark
        else { return "... *yawn*"; }

    }

    /**
     * Feeds a number of treats to a dog, eliciting a different response if the treat is the dog's favorite
     * @param treat type of treat fed to the dog
     * @param amount number of treats to be fed to the dog
     */
    public void feedTreats(String treat, int amount) {
        System.out.println("feeding treats...");
        // Loops through the number of treats to feed all of them to the dog
        for (int i = 0; i < amount; i++) {
            System.out.println("Treat #" + i + " is being fed!");
            // Different response if is favorite treat
            if (treat.equals(this.favoriteTreat)) {
                System.out.println("ARF. MMMM MMMMM MMMM");
            }
            // Regular, grateful response
            else {
                System.out.println("arf. mmm.");
            }
        }
    }

}
