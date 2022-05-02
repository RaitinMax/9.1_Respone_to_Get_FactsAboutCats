import com.fasterxml.jackson.annotation.JsonProperty;

public class CatFacts {
    private final String id;
    private final String text;
    private final String type;
    private final String user;
    private final Integer upvotes;

    public CatFacts(
            @JsonProperty("userId") String id,
            @JsonProperty("text") String text,
            @JsonProperty("type") String type,
            @JsonProperty("user") String user,
            @JsonProperty("upvotes") Integer upvotes
    ){
        this.id = id;
        this.text = text;
        this.type = type;
        this.user = user;
        this.upvotes = upvotes;
    }


    public String getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public String getType() {
        return type;
    }

    public String getUser() {
        return user;
    }

    public Integer getUpvotes() {
        return upvotes;
    }

    // … все getters
    @Override
    public String toString() {
        return "CatFacts" +
                "\n userId=" + id+
                "\n id=" + text +
                "\n id=" + type +
                "\n title=" + user +
                "\n body=" + upvotes;
    }
}

