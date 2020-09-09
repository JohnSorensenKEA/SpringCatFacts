package com.example.demo.services;

import com.example.demo.models.CatFact;
import java.util.ArrayList;

public class CatContains
{
    public ArrayList<CatFact> listContainsCharInText(ArrayList<CatFact> list, char c, int amount)
    {
        ArrayList<CatFact> result = new ArrayList<CatFact>();

        for (int i = 0;i<list.size();i++)
        {
            int count = 0;
            char[] sentence = list.get(i).getText().toCharArray();

            for(int j=0;j<sentence.length;j++)
            {
                if(sentence[j] == c)
                {
                    count++;
                }
            }

            if(count >= amount)
            {
                result.add(list.get(i));
            }
        }

        return result;
    }
}
