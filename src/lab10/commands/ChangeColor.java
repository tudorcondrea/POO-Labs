package lab10.commands;

import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class ChangeColor implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int id;
    private String color, oldColor;

    public ChangeColor(DiagramCanvas diagramCanvas, int id, String color) {
        this.diagramCanvas = diagramCanvas;
        this.id = id;
        this.color = color;
    }

    @Override
    public void execute() {
        oldColor = diagramCanvas.getComponent(id).getColor();
        diagramCanvas.getComponent(id).setColor(color);
    }

    @Override
    public void undo() {
        color = oldColor;
        oldColor = diagramCanvas.getComponent(id).getColor();
        diagramCanvas.getComponent(id).setColor(color);
    }

    @Override
    public String toString() {
        return "ChangeColor{" +
                "diagramCanvas=" + diagramCanvas +
                ", id=" + id +
                ", color='" + color + '\'' +
                '}';
    }
}
