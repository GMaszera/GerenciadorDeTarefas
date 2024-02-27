package org.example.model.entities.functions.listEdit;

public class EditTasks {

    public String getName;

    public EditTasks(String getName) {
        this.getName = getName;
    }

    public String getGetName() {
        return getName;
    }

    public void setGetName(String getName) {
        this.getName = getName;
        editTask();
    }

    public void editTask() {

        ListTasks.listarItensPasta();
    }


}
