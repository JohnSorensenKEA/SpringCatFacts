package com.example.demo.services;

import com.example.demo.models.CatFact;

import java.util.ArrayList;
import java.util.Collections;

public class CatSort
{
    public ArrayList<CatFact> sortCatFactsList(ArrayList<CatFact> list)
    {
        Collections.sort(list);
        return list;
    }
}
