public class OTPGenerator {

    static int otp(){
        return (int)(Math.random()*900000)+100000;
    }

    public static void main(String[] args) {

        int[] arr=new int[10];

        for(int i=0;i<10;i++){
            arr[i]=otp();
            System.out.println(arr[i]);
        }

        boolean unique=true;

        for(int i=0;i<10;i++){
            for(int j=i+1;j<10;j++){
                if(arr[i]==arr[j])
                    unique=false;
            }
        }

        System.out.println("All Unique = "+unique);
    }
}