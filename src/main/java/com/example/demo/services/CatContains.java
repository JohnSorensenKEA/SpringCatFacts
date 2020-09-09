package com.example.demo.services;

import com.example.demo.models.CatFact;

import java.util.ArrayList;

public class CatContains
{
    public ArrayList<CatFact> listContainsCharInText(ArrayList<CatFact> list, char c)
    {
        ArrayList<CatFact> result = new ArrayList<CatFact>();

        for (int i = 0;i<list.size();i++)
        {
            if(list.get(i).getText().contains(c))
            {
                result.add(list.get(i));
            }
        }

        return result;
    }
}
