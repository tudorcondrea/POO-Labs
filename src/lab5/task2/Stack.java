package lab5.task2;

import lab5.task1.Task;

import java.util.ArrayList;
import java.util.List;

public class Stack implements Container{
    private List<Task> tasks;

    public Stack() {
        this.tasks = new ArrayList<Task>();
    }

    @Override
    public Task pop() {
        Task top = this.tasks.get(this.tasks.size() - 1);
        this.tasks.remove(this.tasks.size() - 1);
        return top;
    }

    @Override
    public void push(Task task) {
        this.tasks.add(task);
    }

    @Override
    public int size() {
        return this.tasks.size();
    }

    @Override
    public boolean isEmpty() {
        return this.tasks.isEmpty();
    }

    @Override
    public void transferFrom(Container container) {
        while (container.size() > 0) {
            this.tasks.add(container.pop());
        }
    }

    public List<Task> getTasks() {
        return this.tasks;
    }
}
