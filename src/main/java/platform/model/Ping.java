package platform.model;

public class Ping {

    private final long id;
    private final String content;

    public Ping(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
