package db;

import model.AddCustomer;

import java.util.ArrayList;

public class AddCustomerDatabase {

    public static ArrayList<AddCustomer> AddCustomerTable;

    static {
        AddCustomerTable = new ArrayList<AddCustomer>();
        AddCustomerTable.add(
                new AddCustomer("kavi", "200200", "119", "kavik", "Galle")
        );
    }
}
