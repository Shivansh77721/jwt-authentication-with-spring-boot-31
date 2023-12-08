package com.jwtcode.imple.models;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class JwtResponse {
    private String jwtToken;
    private String username;

    public static Object builder() {
        return builder();
    }

//    public static Object builder() {
//    }
}
