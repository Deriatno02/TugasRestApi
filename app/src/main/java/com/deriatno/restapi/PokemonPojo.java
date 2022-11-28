package com.deriatno.restapi;

import java.util.ArrayList;


public class PokemonPojo {
    private String next;
    private Object previous;
    private int count;
    public ArrayList<ResultItem> results;

    public String getNext(){
        return next;
    }

    public Object getPrevious(){
        return previous;
    }

    public int getCount(){
        return count;
    }

    public ArrayList<ResultItem> getResults(){
        return results;
    }
}

