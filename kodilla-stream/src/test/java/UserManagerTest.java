import com.kodilla.stream.User;
import com.kodilla.stream.UsersManager;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

public class UserManagerTest {
    @Test
    public void testFilterChemistGroupUsernames(){

        //when
        List<String> actualChemistsGroupUsernames = UsersManager.filterChemistGroupUsernames();
        //then
        assertEquals(2,actualChemistsGroupUsernames.size());
    }

    @Test
    public void testFilterUsersByAge(){
        //when

        List<User> actualUsersByAge = UsersManager.filterUsersByAge(40);

        //then

        List<User> expectedUsersByAge = new ArrayList<>();

        expectedUsersByAge.add(new User("Walter White", 50, 7, "Chemists"));
        expectedUsersByAge.add(new User("Gus Fring", 49, 0, "Board"));
        expectedUsersByAge.add(new User("GaleBoetticher", 44, 2, "Chemists"));
        expectedUsersByAge.add(new User("Mike Ehrmantraut", 57, 0, "Security"));

        assertEquals(expectedUsersByAge,actualUsersByAge);


    }
    @Test
    public void testFilterUsersByPosts(){
        //when
        List<User> actualUsersByAge = UsersManager.filterUsersByPosts(100);

        //then
        List<User> expectedUsersByPosts = new ArrayList<>();

        expectedUsersByPosts.add(new User("Jessie Pinkman", 25, 4648, "Sales"));
        expectedUsersByPosts.add(new User("Tuco Salamanca", 34, 116, "Manager"));

        assertEquals(expectedUsersByPosts,actualUsersByAge);

    }
}
