package com.oyurtseven.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoUserIU {
    private String firstName;
    private String lastName;
    private Date birthDate;
}
