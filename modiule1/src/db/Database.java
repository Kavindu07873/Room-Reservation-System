package db;

import java.util.ArrayList;
import model.Rooms;
public class Database {
    public static ArrayList<Rooms> Roomtable = new ArrayList<Rooms>();

static {

   Roomtable.add(
            new Rooms("S1",10000.00 ,"Non A/C")
    );
    Roomtable.add(
            new Rooms("S2",12000.00 ,"A/c" )
    );
    Roomtable.add(
            new Rooms("S3",10000.00 ,"Non A/C")
    );
    Roomtable.add(
            new Rooms("S4",12000.00 ,"A/c")
    );
    Roomtable.add(
            new Rooms("S5",12000.00 ,"A/c")
    );


}



}

