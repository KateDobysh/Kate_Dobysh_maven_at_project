package classwork_webservice;

public class Search {
    String user = "";
    boolean strict;

    public Search(String user, boolean strict) {
        this.user = user;
        this.strict = strict;
    }

    public Search() {

    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public boolean isStrict() {
        return strict;
    }

    public void setStrict(boolean strict) {
        this.strict = strict;
    }
}