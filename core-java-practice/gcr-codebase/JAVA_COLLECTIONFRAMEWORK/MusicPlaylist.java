import java.util.*;

public class MusicPlaylist {

    public static void main(String[] args) {

        LinkedList<String> songs = new LinkedList<>();

        String[] play = {"A","B","C","D","E","F","G","H","I","J","K"};

        for (String s : play) {

            songs.addFirst(s);

            if (songs.size() > 10)
                songs.removeLast();
        }

        System.out.println(songs);

        System.out.println("Search C : " + songs.contains("C"));

    }
}