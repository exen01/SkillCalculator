package com.exen.skills.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
public class Vacancies {
    @Getter
    @Setter
    private List<Vacancy> items;
}
