package db;

import model.ChineseMeal;
import model.LocalMeal;

import java.util.ArrayList;

public class ChineseMealDatabase {
    public static ArrayList<ChineseMeal> ChineseMealTable= new ArrayList<ChineseMeal>();

    static {
        ChineseMealTable.add(
                new ChineseMeal("s1", 12000.00)
        );
    }
}
