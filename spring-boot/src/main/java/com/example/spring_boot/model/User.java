package com.example.spring_boot.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Имя не должно быть пустым")
    @Pattern(regexp = "^[a-zA-Zа-яА-ЯёЁ]+$", message = "Имя может содержать только русские или английские буквы")
    @Column(name = "name")
    private String name;

    @NotBlank(message = "Email не должен быть пустым")
    @Email(message = "Некорректный формат email")
    @Column(name = "Email")
    private String email;

    @NotBlank(message = "Телефон не должен быть пустым")
    @Pattern(regexp = "^[0-9\\-\\+]{11}$", message = "Телефон должен содержать 11 цифр")
    @Column(name = "Phone")
    private String phone;
}
