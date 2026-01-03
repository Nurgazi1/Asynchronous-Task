public class VideoLecture extends ContentItem implements Downloadable {
    private String quality;
    public int age;
    private double cost;
    private int ageFactor;

    public VideoLecture(String title, int year, int durationMinutes, String quality) {
        super(title, year, durationMinutes);
        this.quality = quality;
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
        return "ID: " + getId() + ". Title: " + getTitle() + ". Year: " + getYear() + ". Duration Minute: " + getDurationMinutes() + ". Quality: " + quality;
    }

    @Override
    public void downloaded() {
        System.out.println("Downloading video in " +  quality + "...");
    }

    @Override
    public int getMaxDownloadsPerDay() {
        return 3;
    }
}
