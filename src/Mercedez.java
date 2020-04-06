public class Mercedez extends Car {

    private String modelName;
    private boolean nitro;

    public Mercedez(int maxSpeed, int year, float weight , String modelName , boolean nitro , week birthday) {
        super(maxSpeed, year, weight , birthday);
        this.modelName = modelName;
        this.nitro = nitro;
    }
    @Override
    void printAll(){
        System.out.println(this.modelName + "'s info : " );
        System.out.println("Max speed : " + this.maxSpeed );
        System.out.println("Age : " + (2020 - this.year) );
        System.out.println("Weight : " + this.weight );
        System.out.println("Nitro : " + this.nitro );
        System.out.println("Birthday : " + this.birthday );
    };
}
