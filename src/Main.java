
public class Main {

    public static void main(String[] args) {

        Mercedez benz = new Mercedez(300 , 1999 , 2000f , "benz" , true );
        int i = 1 + benz.maxSpeed;
        System.out.println(i);
        benz.printAll();
    }
}
