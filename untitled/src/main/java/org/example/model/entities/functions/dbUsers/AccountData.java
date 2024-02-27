package org.example.model.entities.functions.dbUsers;

import java.util.UUID;

public class AccountData {

    public String nameUser;

    public AccountData(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }
}
