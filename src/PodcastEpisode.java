public class PodcastEpisode extends ContentItem implements Downloadable {
    private String hostName;
    public int age;
    private double cost;
    private int ageFactor;

    public PodcastEpisode(String title, int year, int durationMinutes, String hostName) {
        super(title, year, durationMinutes);
        this.hostName = hostName;
    }


    @Override
    public double getLicenseCost(int currentYear) {
        if (age <= 2) {
            ageFactor = 5;
        }
        else {
            ageFactor = 2;
        }
        cost = 0.03 * getDurationMinutes() + ageFactor;

        return cost;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + ". Title: " + getTitle() + ". Year: " + getYear() + ". Duration Minute: " + getDurationMinutes() + ". Host Name: " + hostName;
    }

    @Override
    public void downloaded() {
        System.out.println("Downloading podcast hosted by " +  hostName + "...");
    }

    @Override
    public int getMaxDownloadsPerDay() {
        return 10;
    }
}
