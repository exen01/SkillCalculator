package com.exen.skills.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
public class Vacancy {
    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private Schedule schedule;

    @Getter
    @Setter
    private Salary salary;

    @NoArgsConstructor
    public class Salary{
        @Getter
        @Setter
        public Integer from;

        @Getter
        @Setter
        public Integer to;
    }

    @NoArgsConstructor
    public class Schedule{
        @Getter
        @Setter
        public String id;

        @Getter
        @Setter
        public String name;
    }
}


