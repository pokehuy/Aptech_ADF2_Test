public class Track {
    private String name;
    private int viewCount;

    public Track(){

    }

    public Track(String name, int viewCount) {
        this.name = name;
        this.viewCount = viewCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
