package com.oyurtseven.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DtoUserIU {

    @NotEmpty(message = "First name is required")
    private String firstName;


    @NotEmpty(message = "Last name is required")
    @Size(min = 2, max = 50, message = "Last name must be between 2 and 50 characters")
    private String lastName;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date birthDate;
}
