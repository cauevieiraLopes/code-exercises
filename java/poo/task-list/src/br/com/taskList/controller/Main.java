package br.com.taskList.controller;

import br.com.taskList.service.ServiceTask;

public class Main {
    public static void main(String[] args) {

        ServiceTask serviceTask = new ServiceTask();
        serviceTask.menu();
    }
}
