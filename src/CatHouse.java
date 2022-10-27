public class CatHouse
{
    private Cat cat1;
    private Cat cat2;
    private String owner;

    public CatHouse(Cat cat1, Cat cat2, String owner)
    {
        this.cat1 = cat1;
        this.cat2 = cat2;
        this.owner = owner;
    }

    public void rollCall()
    {
        if ((cat1.getAge() > cat2.getAge()) || ((cat1.getAge() == cat2.getAge()) && (cat1.getName() == cat2.getName()))) {
            cat1.introduce();
            cat2.introduce();
        } else if (cat1.getAge() < cat2.getAge()){
            cat2.introduce();
            cat1.introduce();
        } else {
            String cat1Letter = cat1.getName().substring(0, 1);
            String cat2Letter = cat2.getName().substring(0, 1);
            if (cat1Letter.compareTo(cat2Letter) < 0) {
                cat1.introduce();
                cat2.introduce();
            } else  {
                cat2.introduce();
                cat1.introduce();
            }
        }
    }

    public void catNoise()
    {
        cat1.speak();
        cat2.speak();
    }

    public String toString()
    {
        String str = "Welcome to " + owner + "'s Cat House!\n";
        str += "Cat 1's Name: " + cat1.getName() + ", Age: " + cat1.getAge() + "\n";
        str += "Cat 2's Name: " + cat2.getName() + ", Age: " + cat2.getAge() + "\n";

        return str;
    }
}