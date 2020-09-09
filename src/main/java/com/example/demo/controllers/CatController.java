package com.example.demo.controllers;

import com.example.demo.services.CatFeatures;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CatController
{

    @GetMapping("/")
    @ResponseBody
    public String frontPage()
    {
        CatFeatures features = new CatFeatures();
        return features.catIntro();
    }

    @GetMapping("/getSingle")
    @ResponseBody
    public String getSingleFact()
    {
        CatFeatures features = new CatFeatures();
        return features.singleCatFact();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String getTenFacts()
    {
        CatFeatures features = new CatFeatures();
        return features.tenCatFacts();
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public String getTenFactsSortByName()
    {
        CatFeatures features = new CatFeatures();
        return features.tenCatFactsSorted();
    }

    @GetMapping("/contains")
    @ResponseBody
    public String getDefinedFacts(@RequestParam char c, int amount)
    {
        CatFeatures features = new CatFeatures();
        return features.containsAndAmountCatFacts(c,amount);
    }
}
