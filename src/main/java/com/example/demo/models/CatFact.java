package com.example.demo.models;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import com.example.demo.models.CatFact;

public class CatFact implements Comparable<CatFact>
{
    private String text;
    private Date createdAt;
    private Date updatedAt;

    public String getText()
    {
        return text;
    }

    public void setText(String text)
    {
        this.text = text;
    }

    public Date getCreatedAt()
    {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt)
    {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt()
    {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt)
    {
        this.updatedAt = updatedAt;
    }

    @Override
    public String toString(){
        return text;
        //return text + " \n(Created: "+createdAt+", updated: "+updatedAt+")";
    }

    @Override
    public int compareTo(CatFact cf)
    {
        DateFormat formatter = new SimpleDateFormat("yyyyMMdd");

        if(Integer.parseInt(formatter.format(createdAt)) > Integer.parseInt(formatter.format(cf.getCreatedAt())))
        {
            return -1;
        }
        else if (Integer.parseInt(formatter.format(createdAt)) < Integer.parseInt(formatter.format(cf.getCreatedAt())))
        {
            return 1;
        }
        return 0;
    }
}
