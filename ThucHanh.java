public class ThucHanh {
    public String car;
    public int weight;
    public String color;
    public int banh;

    public ThucHanh(String car, int weight, String color, int banh){
        this.car=car;
        this.weight=weight;
        this.color=color;
        this.banh=banh;
    }
    public void go(){
        System.out.println(this.car + " is running");
    }

    @Override
    public String toString() {
        return "ThucHanh{" +
                "car='" + car + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                ",so banh=" + banh + " is running"+
                '}';
    }
}
class main1{
    public static void main(String[] args) {
        ThucHanh car1= new ThucHanh("BMV",100,"red",4);
        car1.go();
        System.out.println(car1);
        ThucHanh car2 = new ThucHanh("LX",99 , "black",3);
        car2.go();
        System.out.println(car2);
        ThucHanh car3 = new ThucHanh("RR" , 1000,"Green",2);
        car3.go();
        System.out.println(car3);

    }
}
