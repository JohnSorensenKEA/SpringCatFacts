package com.example.demo.services;

import com.example.demo.models.CatFact;
import java.util.ArrayList;

// Ojbekter instantieres efter behov og "genbruges" ikke i de forskellige metoder
// Forsøg på at splitte funktioner op i flere klasser
public class CatFeatures
{
    public String catIntro()
    {
        return "Welcome to localhost:8080\n" +
                "At this site we ripoff catfacts and show them to you.\n" +
                "PUURRRRty awesome yes?\n\n" +
                "Try:\n" +
                "/getSingle\n" +
                "/getTen\n" +
                "/getTenSortByDate\n" +
                "/contains";
    }

    public String singleCatFact()
    {
        CatGetFacts cgf = new CatGetFacts();
        cgf.retrieveCatFact(1);
        ArrayList<CatFact> list = cgf.getList();

        CatPrintable cp = new CatPrintable();

        return cp.convertArrayList(list);
    }

    public String tenCatFacts()
    {
        CatGetFacts cgf = new CatGetFacts();
        cgf.retrieveCatFact(10);
        ArrayList<CatFact> list = cgf.getList();

        CatPrintable cp = new CatPrintable();

        return cp.convertArrayList(list);
    }

    public String tenCatFactsSorted()
    {
        CatGetFacts cgf = new CatGetFacts();
        cgf.retrieveCatFact(10);
        ArrayList<CatFact> list = cgf.getList();

        CatSort cs = new CatSort();
        list = cs.sortCatFactsList(list);

        CatPrintable cp = new CatPrintable();

        return cp.convertArrayList(list);
    }

    public String containsAndAmountCatFacts(char character, int amount)
    {
        CatGetFacts cgf = new CatGetFacts();
        cgf.retrieveCatFact(1);
        ArrayList<CatFact> list = cgf.getList();

        CatContains cc = new CatContains();
        list = cc.listContainsCharInText(list,character,amount);

        CatPrintable cp = new CatPrintable();

        if(list.size() == 0)
        {
            return "Sorry no luck";
        }

        return cp.convertArrayList(list);
    }
}
