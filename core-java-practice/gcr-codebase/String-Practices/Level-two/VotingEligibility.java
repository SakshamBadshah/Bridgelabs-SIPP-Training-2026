public class VotingEligibility {

    public static void main(String[] args) {

        int[] age = new int[10];

        for (int i = 0; i < age.length; i++) {
            age[i] = (int)(Math.random() * 50);
        }

        System.out.println("Age\tCan Vote");

        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i] + "\t" + (age[i] >= 18));
        }
    }
}