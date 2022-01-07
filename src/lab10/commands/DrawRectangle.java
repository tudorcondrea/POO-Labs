package lab10.commands;

import lab10.commands.DrawCommand;
import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class DrawRectangle implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private DiagramComponent diagramComponent;

    public DrawRectangle(DiagramCanvas diagramCanvas) {
        this.diagramCanvas = diagramCanvas;
    }

    @Override
    public void execute() {
        diagramComponent = new DiagramComponent();
        diagramCanvas.addComponent(diagramComponent);
    }

    @Override
    public void undo() {
        diagramCanvas.removeComponent(diagramComponent);
    }

    @Override
    public String toString() {
        return "DrawRectangle{" +
                "diagramCanvas=" + diagramCanvas +
                '}';
    }
}
