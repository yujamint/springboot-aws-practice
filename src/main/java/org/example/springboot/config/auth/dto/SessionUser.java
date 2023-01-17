package org.example.springboot.config.auth.dto;

import java.io.Serializable;
import lombok.Getter;
import org.example.springboot.domain.user.User;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String picture;

    public SessionUser(User user) {
        this.name = user.getName();
        this.email = user.getEmail();
        this.picture = user.getPicture();
    }
}
