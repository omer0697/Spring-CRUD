package com.oyurtseven.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ApiError<T> {

    private String id;

    @JsonFormat(pattern = "dd-MM-yyyy hh:mm:ss")
    private Date errorTime;

    private T errors;
}
