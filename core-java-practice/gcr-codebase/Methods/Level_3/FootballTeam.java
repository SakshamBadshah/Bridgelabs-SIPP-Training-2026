public class FootballTeam {

    public static void main(String[] args) {

        int[] h = new int[11];

        for(int i=0;i<h.length;i++)
            h[i]=(int)(Math.random()*101)+150;

        int sum=0,min=h[0],max=h[0];

        for(int x:h){
            sum+=x;
            if(x<min) min=x;
            if(x>max) max=x;
        }

        System.out.println("Mean = "+sum/h.length);
        System.out.println("Shortest = "+min);
        System.out.println("Tallest = "+max);
    }
}