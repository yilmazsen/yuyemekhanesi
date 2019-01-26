package com.ysen.yuyemekhanesi;

/**
 * Created by ysen on 23.11.2017.
 */
import com.google.firebase.database.Exclude;
import com.google.firebase.database.IgnoreExtraProperties;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by ysen on 23.11.2017.
 */

public class Menu {

    public String anayemek;
    public String corba;
    public String zcalori;
    public String yanindaki1;
    public String yanindaki2;



    public Menu() {
        // Default constructor required for calls to DataSnapshot.getValue(Post.class)
    }

    public Menu(String anayemek, String corba,String zcalori,String yanindaki1, String yanindaki2) {
        this.anayemek = anayemek;
        this.corba = corba;
        this.zcalori=zcalori;
        this.yanindaki1=yanindaki1;
        this.yanindaki2 = yanindaki2;
    }


    @Exclude
    public Map<String, Object> toMap() {
        HashMap<String, Object> result = new HashMap<>();
        result.put("Anayemek", anayemek);


        return result;
    }

}