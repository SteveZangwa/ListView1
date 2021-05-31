package com.example.listview1;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ProgramViewHolder {

    ImageView itemImage;
    TextView programTitle;
    TextView getProgramDescription;

    ProgramViewHolder(View v){
        itemImage = v.findViewById(R.id.imageView);
        programTitle = v.findViewById(R.id.textView1);
        getProgramDescription = v.findViewById(R.id.textView2);
    }

}
