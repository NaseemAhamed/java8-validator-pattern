package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class Employee {
    private String  firstName;
    private String  lastName;
    private Integer age;
    private String  email;
}
