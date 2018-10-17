package defaultmethods;

interface DefaultInterface{
    default void defaultMethod(){
        System.out.println("Hello");
    }
}

public class DefaultMethodTemplate implements DefaultInterface{
    public static void main(String[] args) {
        DefaultMethodTemplate obj =new DefaultMethodTemplate();
        obj.defaultMethod();
    }
}
