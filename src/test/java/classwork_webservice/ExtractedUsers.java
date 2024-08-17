package classwork_webservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class ExtractedUsers {
    private ObjectMapper objectMapper = new ObjectMapper();

    public void fromJson() throws IOException {
        UserWrapper userWrapper = objectMapper.readValue(new File("src/test/resources/users.json"), UserWrapper.class);

        List<User> users = userWrapper.getData();

        for (User user : users) {
            System.out.println(user);
        }
    }

    public static void main(String[] args) throws IOException {
        ExtractedUsers extractedUsers= new ExtractedUsers();

        extractedUsers.fromJson();
    }
}