package com.example.demo.controllers;

import com.example.demo.models.CatModel;
import com.example.demo.services.CatFeatures;
import com.example.demo.services.CatGetFacts;
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
        CatGetFacts cgf = new CatGetFacts();
        return cgf.singleCatFact();
    }

    @GetMapping("/getTen")
    @ResponseBody
    public String getTenFacts()
    {
        CatGetFacts cgt = new CatGetFacts();

        return cgt.tenCatFacts();
    }

    @GetMapping("/getTenSortByDate")
    @ResponseBody
    public String getTenFactsSortByName()
    {
        return "";
    }

    @GetMapping("/contains")
    @ResponseBody
    public String getDefinedFacts(@RequestParam char c, int amount)
    {
        return "";
    }
}
