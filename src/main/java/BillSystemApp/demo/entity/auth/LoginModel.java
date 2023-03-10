package BillSystemApp.demo.entity.auth;

import org.springframework.lang.NonNull;

public class LoginModel {
    @NonNull
    private String username;
    @NonNull
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
