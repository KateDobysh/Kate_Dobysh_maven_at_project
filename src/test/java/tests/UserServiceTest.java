package tests;

import classwork.webservice.User;
import classwork.webservice.UserService;
import classwork.webservice.UserWrapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Before;
import org.junit.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class UserServiceTest {
    private UserService userService;

    @Before
    public void setup() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        UserWrapper userWrapper = objectMapper.readValue(new File("src/test/resources/users.json"), UserWrapper.class);
        List<User> users = userWrapper.getData();
        userService = new UserService(users);
    }

    @Test
    public void testSearchByFullUsername_Short() {
        List<User> results = userService.searchByFullUsername("a");
        assertEquals(1, results.size());
        assertEquals("Alberto Boo", results.get(0).getRealName());
    }

    @Test
    public void testSearchByFullUsername_Long() {
        List<User> results = userService.searchByFullUsername("rangaradjango");
        assertEquals(1, results.size());
        assertEquals("Rangaradjan Radjesh", results.get(0).getRealName());
    }

    @Test
    public void testSearchByPartialUsername_Short() {
        List<User> results = userService.searchByPartialUsername("a");
        assertTrue(results.size() > 1);
    }

    @Test
    public void testSearchByPartialUsername_Long() {
        List<User> results = userService.searchByPartialUsername("rangarad");
        assertEquals(1, results.size());
        assertEquals("Rangaradjan Radjesh", results.get(0).getRealName());
    }

    @Test
    public void testGetAllUsers() {
        List<User> results = userService.getAllUsers();
        assertEquals(6, results.size());
    }
}
