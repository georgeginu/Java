package lambda;

public class Lambda {

    public static void main(String[] args) {

        Compute compute=(a,b)->("Hello"+a+b);

       System.out.println(compute.sum(20,30));

        System.out.println(compute.sum("test","tes123"));

    }
}
