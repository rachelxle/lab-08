package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));

        assertFalse(list.hasCity(edmonton));
    }

    @Test
    public void testCountCities() {
        CustomList list = new CustomList();

        assertEquals(0, list.countCities());

        list.addCity(new City("Calgary", "AB"));
        assertEquals(1, list.countCities());

        list.addCity(new City("Edmonton", "AB"));
        assertEquals(2, list.countCities());
    }

    @Test
    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        assertEquals(2, list.countCities());

        list.deleteCity(calgary);

        assertEquals(1, list.countCities());
        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));

    }

}
