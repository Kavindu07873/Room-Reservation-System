package db;

import model.Quadroom;
import model.Rooms;

import java.util.ArrayList;

public class QuadroomDatabase {
    public static ArrayList<Quadroom> QuadRoomTable = new ArrayList<Quadroom>();
        static {
               QuadRoomTable.add(
            new Quadroom("S1",10000.00 ,"Non A/C")
    );
        }
}
