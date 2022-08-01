package db;

import model.FrenchMeal;
import model.LocalMeal;

import java.util.ArrayList;

public class FrenchMealDatabase {

    public static ArrayList<FrenchMeal> FrenchMealTable= new ArrayList<FrenchMeal>();

static {

    FrenchMealTable.add(
            new FrenchMeal("ok",1200.00)
    );

}

}
