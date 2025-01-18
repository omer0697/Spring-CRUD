package com.oyurtseven.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.*;

@ControllerAdvice
public class GlobalExceptionHandler {

    private List<String> addValueMap(List<String> list, String newValue) {
        list.add(newValue);
        return list;
    }

    @ExceptionHandler(value = MethodArgumentNotValidException.class)
    public ResponseEntity<ApiError> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        Map<String, List<String>> errorsMap = new HashMap<>();

        for (ObjectError objError : e.getBindingResult().getAllErrors()) {
            String fieldName = ((FieldError) objError).getField();
            if (errorsMap.containsKey(fieldName)) {
                errorsMap.put(fieldName, addValueMap(errorsMap.get(fieldName), objError.getDefaultMessage()));
            } else {
                errorsMap.put(fieldName, addValueMap(new ArrayList<>(), objError.getDefaultMessage()));
            }
        }

        createApiError(errorsMap) ;

        return ResponseEntity.badRequest().body(createApiError(errorsMap));
    }

    private <T> ApiError <T> createApiError(T errors) {
        ApiError<T> apiError = new ApiError<T>();
        apiError.setId(UUID.randomUUID().toString());
        // date will be like "19.11.2025 12:30:45"
        apiError.setErrorTime(new Date());
        apiError.setErrors(errors);

        return apiError;
    }
}
