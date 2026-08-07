// ---------- Feature classes: each handles exactly one capability ----------
class CreateStory {
    public void uploadStory(String storyText) {
        System.out.println("Story uploaded: \"" + storyText + "\"");
    }
}

class PostImage {
    public void uploadImage(String imageName) {
        System.out.println("Image posted: " + imageName);
    }
}

class MakeReel {
    public void createReel(String reelTitle) {
        System.out.println("Reel created: \"" + reelTitle + "\"");
    }
}

// ---------- InstagramUser: uses the features via composition (HAS-A), ----------
// ---------- not inheritance. Each feature is only wired in if the user ----------
// ---------- actually uses that feature, keeping the "different combination" ----------
// ---------- requirement meaningful rather than just always having all three. ----------
class InstagramUser {
    private String username;
    private CreateStory storyFeature;
    private PostImage imageFeature;
    private MakeReel reelFeature;

    public InstagramUser(String username, CreateStory storyFeature,
                          PostImage imageFeature, MakeReel reelFeature) {
        this.username = username;
        this.storyFeature = storyFeature;
        this.imageFeature = imageFeature;
        this.reelFeature = reelFeature;
    }

    public void shareStory(String storyText) {
        if (this.storyFeature == null) {
            System.out.println(this.username + " does not use the Story feature.");
            return;
        }
        System.out.print(this.username + " -> ");
        this.storyFeature.uploadStory(storyText);
    }

    public void sharePhoto(String imageName) {
        if (this.imageFeature == null) {
            System.out.println(this.username + " does not use the Image feature.");
            return;
        }
        System.out.print(this.username + " -> ");
        this.imageFeature.uploadImage(imageName);
    }

    public void shareReel(String reelTitle) {
        if (this.reelFeature == null) {
            System.out.println(this.username + " does not use the Reel feature.");
            return;
        }
        System.out.print(this.username + " -> ");
        this.reelFeature.createReel(reelTitle);
    }
}

// ---------- Demonstration ----------
public class InstagramApp {
    public static void main(String[] args) {
        // User 1: uses Story + Image only (no Reel feature)
        InstagramUser priya = new InstagramUser("priya_23",
                new CreateStory(), new PostImage(), null);

        // User 2: uses Reel only (no Story or Image feature)
        InstagramUser rahul = new InstagramUser("rahul.codes",
                null, null, new MakeReel());

        // User 3: uses all three features
        InstagramUser divy = new InstagramUser("divy_dev",
                new CreateStory(), new PostImage(), new MakeReel());

        System.out.println("=== priya_23 (Story + Image) ===");
        priya.shareStory("Studying at the library today!");
        priya.sharePhoto("library_desk.jpg");
        priya.shareReel("Not used by this user"); // will print the "does not use" message

        System.out.println("\n=== rahul.codes (Reel only) ===");
        rahul.shareReel("Weekend coding sprint highlights");
        rahul.shareStory("Not used by this user");
        rahul.sharePhoto("Not used by this user");

        System.out.println("\n=== divy_dev (All features) ===");
        divy.shareStory("Hackathon prep in full swing");
        divy.sharePhoto("nexcore_team.jpg");
        divy.shareReel("BAH2026 submission walkthrough");
    }
}