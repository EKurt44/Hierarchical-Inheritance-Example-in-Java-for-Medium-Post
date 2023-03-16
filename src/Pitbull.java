public class Pitbull extends Dog{
    public Pitbull(String name, int age, int legs, boolean canFly, boolean isWild) {
        super(name, age, legs, canFly, isWild);
    }

    @Override
    public String toString() {
        return  super.toString();
    }

    @Override
    public void Play() {
        System.out.println("Pitbull does not play");
    }
}
