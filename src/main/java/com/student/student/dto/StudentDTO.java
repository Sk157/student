package com.student.student.dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Valid
public class StudentDTO {
    @JsonProperty("firstName")
    @NotNull
    public String firstName;
    @JsonProperty("lastName")
    @NotNull
    public String lastName;
    @JsonProperty("age")
    @NotNull
    public int age;
    @JsonProperty("email")
    @NotNull
    public String email;
    @JsonProperty("phoneNumber")
    @NotNull
    public String phoneNumber;

}
