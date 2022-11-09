package com.example.provapluginbranch;

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
        Assertions.assertEquals(4, totale);
    }

    @Test
    void sottrazione() {
        Integer totale = calcolo.calcoloSottrazione();
        Assertions.assertEquals(1, totale);
    }

    @Test
    void moltiplicazione() {
        Integer totale = calcolo.calcoloMoltiplicazione();
        Assertions.assertEquals(4, totale);
    }

}
