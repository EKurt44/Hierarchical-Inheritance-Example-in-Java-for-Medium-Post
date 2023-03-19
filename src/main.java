


public class main {
    public static void main(String[] args) {
        Pitbull pitbull=new Pitbull("Atılgan",4,4,false,true);
        System.out.println(pitbull.toString());
        pitbull.Play();
        System.out.println("\n");
        Golden golden=new Golden("Arya",2,4,false,false);
        System.out.println(golden.toString());
        golden.Play();
        System.out.println("\n");
        Parrot parrot = new Parrot("mike",8,2,true,true);
        System.out.println(parrot.toString());
        parrot.sings();
        System.out.println("\n");
        Eagle eagle=new Eagle("Sam",12,2,true,false);
        System.out.println(eagle.toString());
        eagle.sings();


    }
}