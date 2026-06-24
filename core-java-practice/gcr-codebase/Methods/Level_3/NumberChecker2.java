public class NumberChecker2 {

    public static void main(String[] args) {

        int n=21,temp=n,sum=0;

        while(temp>0){
            sum+=temp%10;
            temp/=10;
        }

        System.out.println("Digit Sum = "+sum);
        System.out.println("Harshad = "+(n%sum==0));
    }
}