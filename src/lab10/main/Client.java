package lab10.main;

import lab10.commands.*;
import lab10.diagram.DiagramCanvas;

/**
 * Receives commands in clear text from the user and transforms them in DrawCommand objects. It uses the Invoker to
 * execute the given commands.
 */
public class Client {

    private Invoker invoker;
    private DiagramCanvas diagramCanvas;

    Client() {
        invoker = new Invoker();
        diagramCanvas = new DiagramCanvas();
    }

    public void showDiagram() {
        // TODO
        diagramCanvas.show();
    }

    public void newDiagram() {
        // TODO
        diagramCanvas = new DiagramCanvas();
    }

    public void executeAction(String commandName, String ...args) {
        // TODO - uncomment:
        DrawCommand command;
        try {
            CommandType commandType = CommandType.fromString(commandName);
            command = getCommand(commandType, args);
            if (command == null) {
                throw new IllegalArgumentException();
            }

        } catch(IllegalArgumentException ex) {
            System.out.println("Invalid command: " + commandName);
            System.out.println("Available commands:");
            for (CommandType type : CommandType.values()) {
                System.out.println("\t- " + type.text);
            }
            return;
        }

        // TODO - Execute the action
        invoker.execute(command);
    }

    private DrawCommand getCommand(CommandType type, String ...args) throws IllegalArgumentException {
        // TODO factory method to create DrawCommand subclasses.
        // If there is an exception when parsing the string arguments (NumberFormatException) catch it and
        // throw an IllegalArgumentException

        return switch (type) {
            case CHANGE_COLOR -> new ChangeColor(diagramCanvas, Integer.parseInt(args[0]), args[1]);
            case CHANGE_TEXT -> new ChangeText(diagramCanvas, Integer.parseInt(args[0]), args[1]);
            case CONNECT -> new ConnectComponents(diagramCanvas, Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            case RESIZE -> new Resize(diagramCanvas, Integer.parseInt(args[0]), Double.parseDouble(args[1]));
            case DRAW_RECTANGLE -> new DrawRectangle(diagramCanvas);
        };
    }

    public void undo(){
        // TODO
        invoker.undo();
    }

    public void redo() {
        // TODO
        invoker.redo();
    }
}
