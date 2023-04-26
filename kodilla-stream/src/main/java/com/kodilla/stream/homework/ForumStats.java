package com.kodilla.stream.homework;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

import java.util.List;

public class ForumStats {
    public static void main(String[] args) {

        System.out.println(avgPostsOverEqual40Age(UsersRepository.getUsersList()));



    }



    public static double avgPostsOverEqual40Age(List<User> userList) {

        double avgOverEqual40 = userList
                .stream()
                .filter(user -> user.getAge() >= 40)
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .getAsDouble();

        return avgOverEqual40;
    }

    public static double avgPostsUnder40Age(List<User> userList){
        double avgLess40 = userList
                .stream()
                .filter(user -> user.getAge() < 40)
                .mapToInt(user -> user.getNumberOfPosts())
                .average()
                .getAsDouble();

        return avgLess40;
    }

}
