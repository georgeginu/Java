package lambda;

public class MethodReference {

    public static void main(String[] args) {


        ComputeMethodReference mr=new ComputeMethodReference();

        Compute comp=mr::computeMethod;

        System.out.println(comp.sum(60,60));

    }
}
