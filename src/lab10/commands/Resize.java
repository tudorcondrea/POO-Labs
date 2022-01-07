package lab10.commands;

import lab10.diagram.DiagramCanvas;
import lab10.diagram.DiagramComponent;

public class Resize implements DrawCommand {
    private DiagramCanvas diagramCanvas;
    private int id;
    private Double percent;

    public Resize(DiagramCanvas diagramCanvas, int id, Double percent) {
        this.diagramCanvas = diagramCanvas;
        this.id = id;
        this.percent = percent;
    }

    @Override
    public void execute() {
        diagramCanvas.getComponent(id).setHeight((int)Math.round(diagramCanvas.getComponent(id).getHeight() * percent / 100));
        diagramCanvas.getComponent(id).setWeight((int)Math.round(diagramCanvas.getComponent(id).getWeight() * percent / 100));
    }

    @Override
    public void undo() {
        diagramCanvas.getComponent(id).setHeight((int)Math.round(diagramCanvas.getComponent(id).getHeight() / percent * 100));
        diagramCanvas.getComponent(id).setWeight((int)Math.round(diagramCanvas.getComponent(id).getWeight() / percent * 100));
    }

    @Override
    public String toString() {
        return "Resize{" +
                "diagramCanvas=" + diagramCanvas +
                ", id=" + id +
                ", percent=" + percent +
                '}';
    }
}
