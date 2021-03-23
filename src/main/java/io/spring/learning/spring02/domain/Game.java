package io.spring.learning.spring02.domain;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Data
public class Game {

//      @Autowired
//      @Qualifier("goldenWarriors")
      private ITeam team1;

//      @Autowired
//      @Qualifier("torontoRaptors")
      private ITeam team2;

      public Game(@Qualifier ("torontoRaptors") ITeam team1, @Qualifier ("goldenWarriors") ITeam team2) {
            this.team1 = team1;
            this.team2 = team2;
      }

      public ITeam playGame(){
          return Math.random() < 0.2 ? team1 : team2;
      }


}
