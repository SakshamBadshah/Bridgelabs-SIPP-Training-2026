public class Subsets {

    static void subset(String curr,
                       int[] arr,
                       int index) {

        if(index == arr.length) {
            System.out.println("[" + curr + "]");
            return;
        }

        subset(curr, arr, index+1);

        subset(curr +
               (curr.isEmpty() ? "" : ",")
               + arr[index],
               arr,
               index+1);
    }

    public static void main(String[] args) {

        int[] arr = {1,2};

        subset("", arr, 0);
    }
}