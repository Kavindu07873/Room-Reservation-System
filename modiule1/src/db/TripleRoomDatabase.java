package db;

import javafx.scene.control.Button;
import model.TripleRoom;

import java.util.ArrayList;

public class TripleRoomDatabase {
    public static ArrayList<TripleRoom> TripleTable = new ArrayList<TripleRoom>() ;

    private static final Button btn = null;

    static {

               TripleTable.add(
            new TripleRoom("S1",10000.00 ,"Non A/C")
    );

    }


}
