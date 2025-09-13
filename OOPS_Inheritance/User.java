package OOPS_Inheritance;

public class User {
    public static void main(String[] args) {
        Guest g1 = new Guest();
        g1.WatchVideos();

        VideoAdmin v1 = new VideoAdmin();
        v1.watchVideos();
        v1.addVideos();

        Admin a1 = new Admin();
        a1.watchVideos();
        a1.addVideos();
        a1.deleteVideos();

    }
}
