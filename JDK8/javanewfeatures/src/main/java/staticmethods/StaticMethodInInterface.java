package staticmethods;

interface Interface{
    static void hello(){
        System.out.println("Hello");
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        //StaticMethodInInterface obj = new StaticMethodInInterface();
        //obj.hello();//Compile Error
        Interface.hello();
    }
}
