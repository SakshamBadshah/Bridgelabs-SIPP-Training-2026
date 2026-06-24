public class SkillAssignment {

    static void findTeams(int[] arr,
                          int index,
                          int target,
                          String team) {

        if (target == 0) {
            System.out.println("[" + team + "]");
            return;
        }

        if (index == arr.length || target < 0)
            return;

        findTeams(arr,
                  index + 1,
                  target - arr[index],
                  team + (team.isEmpty() ? "" : ",") + arr[index]);

        findTeams(arr,
                  index + 1,
                  target,
                  team);
    }

    public static void main(String[] args) {

        int[] skills = {2, 3, 5, 7};

        findTeams(skills, 0, 10, "");
    }
}