import java.util.Scanner;

public class UniqueFrequency {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String text=sc.nextLine();

        for(int i=0;i<text.length();i++){

            boolean unique=true;

            for(int j=0;j<i;j++){
                if(text.charAt(i)==text.charAt(j)){
                    unique=false;
                    break;
                }
            }

            if(unique){
                int count=0;

                for(int k=0;k<text.length();k++){
                    if(text.charAt(i)==text.charAt(k))
                        count++;
                }

                System.out.println(text.charAt(i)+" -> "+count);
            }
        }
    }
}