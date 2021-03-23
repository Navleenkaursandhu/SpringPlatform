package io.spring.learning.spring02.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component

public class TorontoRaptors implements ITeam{

    @Value("${team.raptors.name}")
    private String name;



    @Override
    public String getTeamName(){
        return name;
    }

}
