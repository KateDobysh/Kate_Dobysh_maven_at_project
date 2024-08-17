package classwork_webservice;

import java.util.List;
import java.util.stream.Collectors;

public class UserService {

    private List<User> users;

    public UserService(List<User> users) {
        this.users = users;
    }

    public List<User> searchByFullUsername(String username) {
        return users.stream()
                .filter(user -> user.getUsername().equalsIgnoreCase(username))
                .collect(Collectors.toList());
    }

    public List<User> searchByPartialUsername(String partialUsername) {
        return users.stream()
                .filter(user -> user.getUsername().toLowerCase().contains(partialUsername.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<User> getAllUsers() {
        return users;
    }
}
