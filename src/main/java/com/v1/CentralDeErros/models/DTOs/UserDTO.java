package com.v1.CentralDeErros.models.DTOs;

import lombok.*;

@Data
@NoArgsConstructor
public class UserDTO {

    @NonNull
    private String username;

    @NonNull
    private String password;
}
