package com.example.demo.services;

import com.example.demo.models.CatFact;
import com.example.demo.models.CatModel;
import java.util.ArrayList;

public class CatGetFacts
{
    private ArrayList<CatFact> list = new ArrayList<CatFact>();

    public void retrieveCatFact(int amount)
    {
        CatModel cm = new CatModel();
        for(int i = 0;i < amount;i++)
        {
            list.add(cm.getCatFactData());
        }
    }

    public ArrayList<CatFact> getList()
    {
        return list;
    }

    public void resetArrayList()
    {
        list = new ArrayList<CatFact>();
    }
}
