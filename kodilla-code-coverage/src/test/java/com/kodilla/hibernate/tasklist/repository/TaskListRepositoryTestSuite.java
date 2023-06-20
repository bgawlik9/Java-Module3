package com.kodilla.hibernate.tasklist.repository;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class TaskListRepositoryTestSuite {

    private static final String DESCRIPTION = "Random text, just to fill this field";
    private static final String listName = "asfgdfasg";

    @Autowired

    private TaskListRepository taskListRepository;

    @Test

    public void testFindByListName() {
        //Given
        TaskList taskList = new TaskList(listName, DESCRIPTION);
        taskListRepository.save(taskList);
        String listName = taskList.getListName();

        //When
        List<TaskList> readTaskList = taskListRepository.findByListName(listName);

        //Then
        Assertions.assertEquals(1, readTaskList.size());

        //CleanUp
        taskListRepository.delete(taskList);
    }
}
