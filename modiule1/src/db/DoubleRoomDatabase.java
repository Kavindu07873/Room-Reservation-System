package db;

import model.DoubleRoom;

import java.util.ArrayList;

public class DoubleRoomDatabase {
        public static ArrayList<DoubleRoom> DoubleTable= new ArrayList<DoubleRoom>();


        static {

                DoubleTable.add(
            new DoubleRoom("S1",10000.00 ,"Non A/C")
    );

     }

}
