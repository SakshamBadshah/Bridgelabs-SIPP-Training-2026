interface TextModeration {

    boolean checkText(String post);

    default void displayModerationPolicy() {

        System.out.println(
        "No offensive content");
    }

    static boolean containsRestrictedWords(
            String post) {

        return post.contains("bad");
    }
}

interface SpamDetection {

    boolean checkSpam(String post);

    default void displayModerationPolicy() {

        System.out.println(
        "No spam allowed");
    }
}

class ContentModerator
implements TextModeration,
           SpamDetection {

    @Override
    public boolean checkText(
            String post) {

        return TextModeration
                .containsRestrictedWords(post);
    }

    @Override
    public boolean checkSpam(
            String post) {

        return post.contains("buy now");
    }

    @Override
    public void displayModerationPolicy() {

        System.out.println(
        "Content Moderation Active");
    }
}

public class ContentModeratorDemo {

    public static void main(String[] args) {

        String posts[] = {
                "hello everyone",
                "buy now and win",
                "this is bad"
        };

        ContentModerator c =
        new ContentModerator();

        for(String post : posts) {

            if(c.checkSpam(post))
                System.out.println(
                post + " -> Spam");

            else if(c.checkText(post))
                System.out.println(
                post + " -> Offensive");

            else
                System.out.println(
                post + " -> Valid");
        }
    }
}