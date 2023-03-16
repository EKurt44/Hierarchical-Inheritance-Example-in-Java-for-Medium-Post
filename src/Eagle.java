public class Eagle extends Bird{
    public Eagle(String name, int age, int legs, boolean canFly, boolean isVegeterian) {
        super(name, age, legs, canFly, isVegeterian);
    }

    @Override
    public void sings() {
        System.out.println("Eagle does not signs");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
