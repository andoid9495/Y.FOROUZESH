package com.example.user.forouzesh;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by User on 7/4/2015.
 */
public class DetailActivity extends MainActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Intent intent=getIntent();
       String flowername=intent.getStringExtra("flowername");
        int imageresource=intent.getIntExtra("imageresource",0);
        String instructions=intent.getStringExtra("instructions");
        TextView tv=(TextView)findViewById(R.id.textview1);
        tv.setText(flowername);
        tv=(TextView)findViewById(R.id.textview2);
        tv.setText(instructions);
        ImageView image=(ImageView)findViewById(R.id.imageview1);
        image.setImageResource(imageresource);
        startActivity(intent);

    }
}
