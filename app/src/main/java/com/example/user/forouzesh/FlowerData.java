package com.example.user.forouzesh;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 7/4/2015.
 */
public class FlowerData {

    private List<Flower> flowers=new ArrayList<Flower>();

    public List<Flower> getFlower(){

        return flowers;
    }
    public FlowerData(){
       new Flower("yas",R.drawable.hydrangeas,"this floer has a good smill and same with my name");
       new Flower("nilofar",R.drawable.chrysanthemum,"this flower is beautiful");
    }
}
