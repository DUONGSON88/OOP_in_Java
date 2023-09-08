public class Theory {
    public String name;
    public int age;
    public boolean isHandSome;

    public Theory(String name , int age , boolean isHandSome){
        this.name=name;
        this.age=age;
        this.isHandSome=isHandSome;
    }
    public Theory(String name , int age){
        this.name=name;
        this.age=age;
        this.isHandSome=true;
    }
    public Theory(){

    }

    @Override
    public String toString() {
        return "Theory{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", isHandSome=" + isHandSome +
                '}';
    }
}
class main{
    public static void main(String[] args) {
        int a;
        Theory p = new Theory(); // có thể gọi ra thuộc tính không tham số
        Theory p1= new Theory("pink",22,true);// tùy theo tham số cửa thuộc tính mình truyền dối số vào
        System.out.println(p1);
        Theory p2 =new Theory("Black",11);
        System.out.println(p2);

    }


}
