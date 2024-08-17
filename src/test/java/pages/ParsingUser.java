package pages;

import classwork_webservice.User;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

public class ParsingUser {
    public void fromJson() throws IOException {

        Gson gson = new Gson();

        try (FileReader reader = new FileReader("src/test/resources/users.json")) {
            Type userListType = new TypeToken<List<User>>() {
            }.getType();
            List<User> users = gson.fromJson(reader, userListType);

            for (User user : users) {
                System.out.println(user);
            }
        }
    }
}