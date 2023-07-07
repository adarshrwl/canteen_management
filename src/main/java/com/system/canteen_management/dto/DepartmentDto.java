package com.system.canteen_management.dto;

import com.system.canteen_management.entity.user_management.Department;
import jakarta.annotation.Nullable;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.ui.Model;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class DepartmentDto {
    private Integer id;

    @NotNull(message = "this is required field")
    @NotEmpty(message = "this is required field")
    private String departmentName;

    public DepartmentDto(Department department){
        this.id=department.getId();
        this.departmentName=department.getDepartmentName();
    }
}
