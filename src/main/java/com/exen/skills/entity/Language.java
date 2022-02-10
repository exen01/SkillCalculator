package com.exen.skills.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Language {

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String description;

    @Getter
    @Setter
    private List<Skill> skillList;
}
