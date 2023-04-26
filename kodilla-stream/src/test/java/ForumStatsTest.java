import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;
import com.kodilla.stream.homework.ForumStats;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ForumStatsTest {

@Test
    public void shouldPostsOverEqual40Age(){
    List<User> users = new ArrayList<>();
    users.add(new User("Joe",40,10,"Test"));
    users.add(new User("Tom",41,10,"Test"));
    double test = ForumStats.avgPostsOverEqual40Age(users);
    assertEquals(10.0,test);
}

@Test
    public void shouldPostsUnder40Age(){
    List<User> users = new ArrayList<>();
    users.add(new User("Joe",39,1,"Test"));
    users.add(new User("Hank",31,1,"Test"));
    double test = ForumStats.avgPostsUnder40Age(users);
    assertEquals(1,test);

}
}
