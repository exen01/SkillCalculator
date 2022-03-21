package com.exen.skills.entity;


import lombok.Getter;
import lombok.Setter;

public class SearchParametersVacancy {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String specializationId;

    @Getter
    @Setter
    private String employmentId;

    @Getter
    @Setter
    private String experienceId;

    @Getter
    @Setter
    private String scheduleId;

    @Getter
    @Setter
    private Integer salary;

    @Getter
    @Setter
    private Integer page;
}
