import java.util.Scanner;

public class Dog {
    private int maturityLevel;
    private double age;
    private String breed;
    private String name;
    private String favoriteTreat;

    public Dog(int maturityLevel, double age, String breed, String name, String favoriteTreat) {
        this.maturityLevel = maturityLevel;
        this.age = age;
        this.breed = breed;
        this.name = name;
        this.favoriteTreat = favoriteTreat;
    }

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
        for (int i = 0; i < 4; i++) {
            System.out.println(daDog.knockAtDoor());
        }
        daDog.feedTreats("Steak Jerky", 3);

    }
    public String knockAtDoor() {
        if (this.breed.contains("poodle") ) { return "Arooooooo"; }
        else if ( (this.age > 5 && this.age < 10) || (this.age > 1 && maturityLevel > 5 )) { return "BARKKKK!"; }
        else if ( this.age >= 10 || !(this.maturityLevel > 9)) { return "Bark."; }
        else { return "... *yawn*"; }

    }

    public void feedTreats(String treat, int amount) {
        System.out.println("feeding treats...");
        for (int i = 0; i < amount; i++) {
            System.out.println("Treat #" + i + " is being fed!");
            if (treat.equals(this.favoriteTreat)) {
                System.out.println("ARF. MMMM MMMMM MMMM");
            }
            else {
                System.out.println("arf. mmm.");
            }
        }
    }

}
