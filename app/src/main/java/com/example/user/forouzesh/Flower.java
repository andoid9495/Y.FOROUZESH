package com.example.user.forouzesh;

/**
 * Created by User on 7/4/2015.
 */
public class Flower {
    public String flowername;
    public int imageresource;
    public String instructions;

    public Flower(String id, int imageresource, String instructions){
        this.flowername=id;
        this.imageresource=imageresource;
        this.instructions=instructions;
    }
      public String ToString(){
          return flowername;
      }
}
