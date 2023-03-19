public class Bird extends  Animal{
    private boolean isVegeterian;

    public Bird(String name, int age, int legs, boolean canFly, boolean isVegeterian) {
        super(name, age, legs, canFly);
        this.isVegeterian = isVegeterian;
    }

    public  void sings(){
        System.out.println(getClass().getSimpleName()+" sings");
    }

    public boolean isVegeterian() {
        return isVegeterian;
    }

    @Override
    public String toString() {
        return super.toString()+ "Is It Vegeterian ? : "+isVegeterian();
    }
}
