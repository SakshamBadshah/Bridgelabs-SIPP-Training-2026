public class NumberChecker5 {

    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++)
            f*=i;
        return f;
    }

    public static void main(String[] args) {

        int n=145;

        int sum=0;

        for(int i=1;i<n;i++)
            if(n%i==0)
                sum+=i;

        int temp=n,strong=0;

        while(temp>0){
            strong+=fact(temp%10);
            temp/=10;
        }

        System.out.println("Perfect = "+(sum==n));
        System.out.println("Strong = "+(strong==n));
    }
}