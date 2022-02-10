package com.exen.skills.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

public class Programmer {

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private List<Language> languageList;

    @Getter
    @Setter
    private List<Skill> skillList;


}
