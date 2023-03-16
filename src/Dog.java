public class Dog extends Animal{
    private boolean isWild;

    public Dog(String name, int age, int legs, boolean canFly, boolean isWild) {
        super(name, age, legs, canFly);
        this.isWild = isWild;
    }

    public boolean isWild() {
        return isWild;
    }
    public void Play(){
        System.out.println(getClass().getSimpleName()+" plays with owner");

    }


    @Override
    public String toString() {
        return "Name : "+getName()+ "\n" + "Age : "+getAge() +"\n"+"Number Of Legs : " + getLegs()+ "\n"+"Can Fly ? = "+isCanFly()+ "\n"+"Is It Wild = : "+isWild();
    }
}
