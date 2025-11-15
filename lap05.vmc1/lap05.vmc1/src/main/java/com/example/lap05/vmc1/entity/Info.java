package com.example.lap05.vmc1.entity;
import lombok.*;

@Data
@Builder
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Info {
    String name;
    String nickName;
    String email;
    String website;
}
