public class RandomStats {

    public static void main(String[] args){

        int[] arr = new int[5];

        int min = 9999;
        int max = 1000;
        int sum = 0;

        for(int i=0;i<5;i++){

            arr[i] = 1000 + (int)(Math.random()*9000);

            System.out.println(arr[i]);

            sum += arr[i];
            min = Math.min(min, arr[i]);
            max = Math.max(max, arr[i]);
        }

        double avg = (double)sum/5;

        System.out.println("Average = " + avg);
        System.out.println("Min = " + min);
        System.out.println("Max = " + max);
    }
}