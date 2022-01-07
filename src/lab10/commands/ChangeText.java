package lab10.commands;

import lab10.diagram.DiagramCanvas;

public class ChangeText implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int id;
    private String text, oldText;

    public ChangeText(DiagramCanvas diagramCanvas, int id, String text) {
        this.diagramCanvas = diagramCanvas;
        this.id = id;
        this.text = text;
    }

    @Override
    public void execute() {
        oldText = diagramCanvas.getComponent(id).getText();
        diagramCanvas.getComponent(id).setText(text);
    }

    @Override
    public void undo() {
        text = oldText;
        oldText = diagramCanvas.getComponent(id).getText();
        diagramCanvas.getComponent(id).setText(text);
    }

    @Override
    public String toString() {
        return "ChangeText{" +
                "diagramCanvas=" + diagramCanvas +
                ", id=" + id +
                ", text='" + text + '\'' +
                '}';
    }
}
