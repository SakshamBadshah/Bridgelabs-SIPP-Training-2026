import java.util.Scanner;

public class FriendsInfo {

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            String[] names = {"Amar","Akbar","Anthony"};

            int[] ages = new int[3];
            double[] heights = new double[3];

            for(int i=0;i<3;i++){
                ages[i] = sc.nextInt();
                heights[i] = sc.nextDouble();
            }

            int young = 0, tall = 0;

            for(int i=1;i<3;i++){
                if(ages[i] < ages[young]) young = i;
                if(heights[i] > heights[tall]) tall = i;
            }

            System.out.println("Youngest = " + names[young]);
            System.out.println("Tallest = " + names[tall]);
        }
    }
}