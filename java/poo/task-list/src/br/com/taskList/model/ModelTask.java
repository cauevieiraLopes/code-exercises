package br.com.taskList.model;

public class ModelTask {
    private String task;
    private boolean status;

    public ModelTask(String task) {
        this.task = task.trim();
        this.status = false;
    }

    public String getTask() {
        return task;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
