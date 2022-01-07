package lab10.main;

import lab10.commands.*;

import java.util.LinkedList;
import java.util.List;

/**
 * The layer between the client and the commands that need to be executed on the receivers (DiagramCanvas and DiagramComponent).
 * <br>
 * It is independent of the subtypes of commands, it just receives a command, runs it and implements a redo/undo mechanism.
 */
public class Invoker {
    private List<DrawCommand> commandsHistory, undoHistory;

    public Invoker() {
        commandsHistory = new LinkedList<>();
        undoHistory = new LinkedList<>();
    }

    /**
     * Clear up all the used resources, start fresh :D
     */
    public void restart() {
      // TODO
        int n = commandsHistory.size();
        for (int i = 0; i < n; i++) {
            undo();
        }
        undoHistory = new LinkedList<>();
    }

    /**
     * Executes a given command
     * @param command
     */
    public void execute(DrawCommand command) {
        commandsHistory.add(command);
        command.execute();
        undoHistory = new LinkedList<>();
    }

    /**
     * Undo the latest command
     */
    public void undo() {
        // TODO
        // Hint: use data structures to keep track of commands
        // Do not use the java.util.Stack, its implementation is based on vector which is inefficient and deprecated.
        // Use a class that implements the Deque interface, e.g. LinkedList https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Deque.html
        DrawCommand command = commandsHistory.get(commandsHistory.size() - 1);
        commandsHistory.remove(commandsHistory.size() - 1);
        undoHistory.add(command);
        command.undo();
    }

    /**
     * Redo command previously undone. Cannot perform a redo after an execute, only after at least one undo.
     */
    public void redo() {
        // TODO
        if (undoHistory.isEmpty()) {
            return;
        }
        DrawCommand command = undoHistory.get(undoHistory.size() - 1);
        undoHistory.remove(undoHistory.size() - 1);
        commandsHistory.add(command);
        command.execute();
    }
}
