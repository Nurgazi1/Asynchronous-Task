import java.util.ArrayList;

public class ContentDemo {

    static void main(String[] args) {
        ArrayList<ContentItem> items = new ArrayList<>();

        items.add(new VideoLecture("OOP", 2025, 30, "HD"));
        items.add(new VideoLecture("Assembly Programming", 2025, 25, "HD"));
        items.add(new PodcastEpisode("Tech Talk", 2020, 60, "James"));
        items.add(new PodcastEpisode("Java Daily", 2022, 15, "Bob"));

        int currentYear = java.time.Year.now().getValue();

        for (ContentItem i : items) {
            System.out.println(
                    i.toString() +
                            " | licenseCost=" +
                            i.getLicenseCost(currentYear)
            );

            if (i instanceof Downloadable) {
                Downloadable d = (Downloadable) i;
                d.getMaxDownloadsPerDay();
                System.out.println("Max downloads/day: " + d.getMaxDownloadsPerDay());
            }
        }
    }
}
