package com.example.demo.controllers;

import com.example.demo.services.CatFeatures;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatController
{
    // Rettet efter Rasmus' løsning
    private CatFeatures features = new CatFeatures();

    @GetMapping("/")
    @ResponseBody
    public String frontPage()
    {
        return features.catIntro();
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingleFact()
    {
        return features.singleCatFact();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String getTenFacts()
    {
        return features.tenCatFacts();
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public String getTenFactsSortByName()
    {
        return features.tenCatFactsSorted();
    }

    @GetMapping("/contains")
    @ResponseBody
    public String getDefinedFacts(@RequestParam char c, int amount)
    {
        return features.containsAndAmountCatFacts(c,amount);
    }
}
