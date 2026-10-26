package br.com.taskList.model;

import java.time.LocalDateTime;

public class ModelTask {
    private String task, creationDay, completionDay;
    private boolean status;


    public ModelTask(String task, String creationDay) {
        this.task = task.trim();
        this.status = false;
        this.creationDay = creationDay;
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

    public void setCompletionDay(String completionDay) {
        this.completionDay = completionDay;
    }

    public String getCompletionDay() {
        return completionDay;
    }

    public String getCreationDay() {
        return creationDay;
    }
}
