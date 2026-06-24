public class NumberChecker4 {

    public static void main(String[] args) {

        int n=9;

        boolean prime=true;

        for(int i=2;i<n;i++)
            if(n%i==0) prime=false;

        int sq=n*n,sum=0;

        while(sq>0){
            sum+=sq%10;
            sq/=10;
        }

        System.out.println("Prime = "+prime);
        System.out.println("Neon = "+(sum==n));
        System.out.println("Buzz = "+(n%7==0 || n%10==7));
    }
}