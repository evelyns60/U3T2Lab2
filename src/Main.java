/* import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = myScanner.nextInt();

        if (num <= 0) {
            System.out.println("That's not positive!");
        } else if (num % 2 == 0) {
            if (num > 1000) {
                System.out.println("Big even number!");
            } else if (num > 100) {
                System.out.println("Medium even number!");
            } else {
                System.out.println("Small even number!");
            }
        } else {
            if (num % 5 == 0 && num % 7 == 0) {
                System.out.println("Divisible by 5!\nDivisible by 7!");
            } else if (num % 5 == 0) {
                System.out.println("Divisible by 5!");
            } else if (num % 7 == 0) {
                System.out.println("Divisible by 7!");
            } else {
                System.out.println("Not divisible by 5 or 7!");
            }
        }

    }
}
*/
public class Main
{
    public static void main(String[] args)
    {
        // here is some that will run right away, just to play around
        // (make sure to compile both your Cat and Cathouse classes first!)
        Cat daisy = new Cat("Daisy", 3);
        Cat eleanor = new Cat("Eleanor", 8);

        CatHouse cats = new CatHouse(daisy, eleanor, "Max");

        // print CatHouse info
        System.out.println(cats);
        cats.rollCall();


    // ------- Test set 1 -------
    Cat garfield = new Cat("Garfield", 5);
    Cat crookshanks = new Cat("Crookshanks", 6);

    CatHouse myCats = new CatHouse(garfield, crookshanks, "Mr. Miller");

    // print CatHouse info
    System.out.println(myCats);

    // older cat, Crookshanks, speaks first!
    myCats.rollCall();

    // cat1 then cat2 each says a random thing
    myCats.catNoise();

    System.out.println("----------------------------");

    // ------- Test set 2 -------
    Cat toby = new Cat("Toby", 10);
    Cat ziggy = new Cat("Ziggy", 8);

    CatHouse yourCats = new CatHouse(toby, ziggy, "Alex");

    // print CatHouse info
    System.out.println(yourCats);

    // older cat, Toby, speaks first!
    yourCats.rollCall();

    yourCats.catNoise();

    System.out.println("----------------------------");

    // ------- Test set 3 -------
    Cat katie = new Cat("Katie", 12);
    Cat billy = new Cat("Billy", 12);

    CatHouse neighborsCats = new CatHouse(katie, billy, "Ms. Thompson");

    // print CatHouse info
    System.out.println(neighborsCats);

    // same age, so Billy speaks first because B before K
    neighborsCats.rollCall();

    neighborsCats.catNoise();

    System.out.println("----------------------------");

    // ------- Test set 4 -------
    Cat autumn1 = new Cat("Autumn", 15);
    Cat autumn2 = new Cat("Autumn", 15);

    CatHouse sameCats = new CatHouse(autumn1, autumn2, "ASPCA");

    // print CatHouse info
    System.out.println(sameCats);

    // same age, same name, so autumn1 speaks first...
    // although you can't really tell :p
    sameCats.rollCall();

    sameCats.catNoise();


    }
}