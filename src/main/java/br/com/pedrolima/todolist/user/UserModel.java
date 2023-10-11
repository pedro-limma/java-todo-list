package br.com.pedrolima.todolist.user;

import lombok.Data;

@Data // lombok
public class UserModel {
    private String username;
    private String name;
    private String password;
}
