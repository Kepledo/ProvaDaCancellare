package com.example.provapluginbranch;

import org.springframework.stereotype.Service;

@Service
public class Calcolo {

    public Integer calcoloAddizione(){
        return 2+2;
    }

    public Integer calcoloSottrazione(){
        return 2-1;
    }

    public Integer calcoloMoltiplicazione(){
        return 2*2;
    }
}
