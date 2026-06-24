import java.util.*;

public class FactorsArray {

    public static void main(String[] args) {

        int n=12;

        ArrayList<Integer> factors=new ArrayList<>();

        for(int i=1;i<=n;i++)
            if(n%i==0)
                factors.add(i);

        int sum=0,product=1;

        for(int x:factors){
            sum+=x;
            product*=x;
        }

        System.out.println("Factors = "+factors);
        System.out.println("Greatest Factor = "+factors.get(factors.size()-2));
        System.out.println("Sum = "+sum);
        System.out.println("Product = "+product);
    }
}