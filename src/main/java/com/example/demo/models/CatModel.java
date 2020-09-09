package com.example.demo.models;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class CatModel
{
    public CatFact getCatFactData()
    {
        try
        {

            URL catURL = new URL("https://cat-fact.herokuapp.com/facts/random");

            BufferedReader inputFromCatURL = new BufferedReader(new InputStreamReader(catURL.openStream()));

            CatFact data = new Gson().fromJson(inputFromCatURL, CatFact.class);

            inputFromCatURL.close();

            return data;
        }
        catch (IOException e)
        {
            System.out.println(e);
            return new CatFact();
        }
    }
}
