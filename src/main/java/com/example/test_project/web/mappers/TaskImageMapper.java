package com.example.test_project.web.mappers;


import com.example.test_project.domain.task.TaskImage;
import com.example.test_project.web.dto.task.TaskImageDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TaskImageMapper extends Mappable<TaskImage, TaskImageDto> {
}
