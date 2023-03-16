public class Animal {
    private String name;
    private int age;
    private int legs;
    private boolean canFly;

    public Animal(String name, int age, int legs, boolean canFly) {
        this.name = name;
        this.age = age;
        this.legs = legs;
        this.canFly = canFly;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getLegs() {
        return legs;
    }

    public boolean isCanFly() {
        return canFly;
    }


    @Override
    public String toString() {
        return "Name : "+getName()+ "\n" + "Age : "+getAge() +"\n"+"Number Of Legs : " + getLegs()+ "\n"+"Can Fly ? = "+isCanFly()+ "\n";

    }
}
