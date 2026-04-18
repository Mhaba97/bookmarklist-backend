package Bookmarklist;

public class BookmarkEntry {
    private String title;
    private String url;

    public BookmarkEntry() {}

    public BookmarkEntry(String title) {
        this.title = title;
        this.url = "https://example.com";
    }

    // Getter und Setter
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }
}