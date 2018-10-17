package lambdas;

interface FunctionalInterface{
    int methodTest(int a, int b);
}

public class LambdasTemplate {
    public static void main(String[] args) {
        FunctionalInterface funInt =  (a,b)-> (a+b);
        System.out.println(funInt.methodTest(4,5));
    }
}
