package com.kodilla.stream;

import java.util.List;
import java.util.stream.Collectors;

public class UsersManager {
    public static void main(String[] args) {

        List<String> chemistsGroupUsernames = filterChemistGroupUsernames();
        System.out.println(chemistsGroupUsernames);

        List<User> usersOlderThan = filterUsersByAge(40);
        System.out.println(usersOlderThan);


    }

    public static List<String> filterChemistGroupUsernames() {
        List<String> usernames = UsersRepository.getUsersList()
                .stream()
                .filter(user -> user.getGroup().equals("Chemists"))
                .map(UsersManager::getUserName)
                .collect(Collectors.toList());

        return usernames;
    }

    public static String getUserName(User user) {
        return user.getUsername();
    }



    public static List<User> filterUsersByAge(int age){
        List<User> usersByAge = UsersRepository.getUsersList()
                .stream()
                .filter(user ->user.getAge() > age)
                .collect(Collectors.toList());

        return usersByAge;
    }

    public static List<User> filterUsersByPosts(int posts){
        List<User> usersByPosts = UsersRepository.getUsersList()
                .stream()
                .filter(user ->user.getNumberOfPosts() > posts)
                .collect(Collectors.toList());

        return usersByPosts;
    }
}
