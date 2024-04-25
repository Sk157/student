package com.student.student.mapper;

import com.student.student.dto.StudentDTO;
import com.student.student.entity.Student;
import jakarta.validation.Valid;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.validation.annotation.Validated;

@Mapper(componentModel = "spring")
@Validated
public interface StudentMapper {
    StudentMapper studentMapper = Mappers.getMapper(StudentMapper.class);
    Student toStudent(@Valid StudentDTO studentDTO);
}
