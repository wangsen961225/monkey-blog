package com.ws.monkeyblog.pojo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long id;
    private String name;
    private String pwd;
    private String sex;
    private String birthday;
}
