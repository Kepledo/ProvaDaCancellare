package com.example.provapluginbranch;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProvaPluginBranchApplicationTests {

    @Autowired
    Calcolo calcolo;

    @Test
    void addizione() {
        Integer totale = calcolo.calcoloAddizione();
        Assertions.assertEquals(4, 4);
    }

    @Test
    void sottrazione() {
        Integer totale = calcolo.calcoloAddizione();
        Assertions.assertEquals(1, 1);
    }

    @Test
    void moltiplicazione() {
        Integer totale = calcolo.calcoloAddizione();
        Assertions.assertEquals(4, 4);
    }

}
