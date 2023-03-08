package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class CustomListTest {

    private ArrayList<City> citylist = new ArrayList<>();

    @Test
    public void testAddCity(){

        CustomList list = new CustomList(null,citylist);
        City city = new City("Edmonton","AB");

        list.addCity(city);
        assertEquals(1, list.getCount());

    }

    @Test
    public void testHasCity(){

        CustomList list = new CustomList(null,citylist);
        City city = new City("Calgary","Alberta");
        list.addCity(city);
        assertFalse(list.hasCity(city));

    }


}
