package com.system.canteen_management.dto;

import com.system.canteen_management.entity.user_management.Test;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class TestDto {

    private Integer id;

    @NotNull(message = "Please enter valid age")
    private Integer age;

    @NotNull
    private String name;
}
