package test.managerTest;

import main.logic.HistoryManager;
import main.logic.Managers;
import main.logic.TaskManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class ManagersTest {
    @Test
    void getDefaultShouldReturnInitializedTaskManager() {
        TaskManager manager = Managers.getDefault();
        assertNotNull(manager, "Диспетчер задач по умолчанию не должен иметь значения null");
    }

    @Test
    void getDefaultHistoryShouldReturnInitializedHistoryManager() {
        HistoryManager historyManager = Managers.getDefaultHistory();
        assertNotNull(historyManager, "Значение диспетчера истории по умолчанию не должно быть равно null");
    }
}