package classwork.webservice;

import java.util.List;

public class UserWrapper {
    private String code;
    private List<User> data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }
}
