package db;

import model.LocalMeal;

import java.util.ArrayList;

public class LocalMealDatabase {

    public static ArrayList<LocalMeal> LocalMealTable= new ArrayList<LocalMeal>();

static {
    LocalMealTable.add(
            new LocalMeal("s1",12000.00)
    );
}
}
