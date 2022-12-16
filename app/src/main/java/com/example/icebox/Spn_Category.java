package com.example.icebox;

public class Spn_Category implements Spn
{
    private String category;

    public Spn_Category(String category)
    {
        this.category = category;
    }
    public String get()
    {
        return category;
    }
}
