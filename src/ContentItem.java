public abstract class ContentItem {
    private int id;
    private static int idGen;
    private String title;
    private int year;
    private int durationMinutes;

    public ContentItem(String title, int year, int durationMinutes) {
        id = idGen++;
        setTitle(title);
        setYear(year);
    }

    public void setTitle(String title) {
        if(title.isEmpty() || title == null) {
            throw new IllegalArgumentException();
        }
        else {
            this.title = title;
        }
    }

    public void setYear(int year) {
        if (year < 1990 || year > 2026) {
            throw new IllegalArgumentException();
        }
        else {
            this.year = year;
        }
    }

    public void setDuration() {
        if (durationMinutes <= 0) {
            throw new IllegalArgumentException();
        }
        else {
            this.durationMinutes = durationMinutes;
        }
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }
    public int getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }

    public int getAge(int currentYear) {
        return currentYear - year;
    }

    public abstract double getLicenseCost(int currentYear);

    @Override
    public String toString() {
        return "ID: " + id + ". Title: " + title + ". Year: " + year + ". Duration Minute: " + durationMinutes;
    }

}
