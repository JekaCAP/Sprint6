package main.logic;

import main.tasks.Epic;
import main.tasks.Subtask;
import main.tasks.Task;

import java.util.HashMap;
import java.util.List;

public interface TaskManager {

    void taskCreator(Task task);

    void subtaskCreator(Subtask subtask);

    void epicCreator(Epic epic);

    HashMap<Integer, Task> getTasks();

    HashMap<Integer, Subtask> getSubtasks();

    HashMap<Integer, Epic> getEpics();

    void deleteTaskList();

    void deleteSubtaskList();

    void deleteEpicList();

    Task getTaskById(int id);

    Subtask getSubtaskById(int id);

    Epic getEpicById(int id);

    void deleteTask(int id);

    void deleteSubtask(int id);

    void deleteEpic(int id);

    void updateTask(Task task);

    void updateSubtask(Subtask subtask);

    void updateEpic(Epic epic);

    List<Task> history();

}


