package com.oyurtseven.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name = "\"user\"") // Escaping the reserved keyword
@Data
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "first_name", nullable = true)
    private String firstName;

    @Column(name = "last_name", nullable = true)
    private String lastName;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @Column(name = "birth_date", nullable = true)
    private Date birthDate;
}
