package com.example.demo.services;

import com.example.demo.models.CatFact;
import java.util.ArrayList;

public class CatPrintable
{
    public String convertArrayList(ArrayList<CatFact> list)
    {
        String result = "";

        for(int i = 0;i<list.size();i++)
        {
            result += list.get(i).toString() + "\n";
        }

        return result;
    }
}
