public class NumberChecker1 {

    public static void main(String[] args) {

        int n=153,temp=n,count=0;

        while(temp>0){
            count++;
            temp/=10;
        }

        temp=n;
        int sum=0,largest=0;

        while(temp>0){
            int d=temp%10;

            if(d>largest)
                largest=d;

            sum+=(int)Math.pow(d,count);
            temp/=10;
        }

        System.out.println("Armstrong = "+(sum==n));
        System.out.println("Largest Digit = "+largest);
        System.out.println("Duck Number = "+(String.valueOf(n).contains("0")));
    }
}