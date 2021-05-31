package com.example.listview1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class ProgramAdapter extends ArrayAdapter<String> {
    Context context;
    int[] images;
    String[] programName;
    String[] programDescription;

    public ProgramAdapter(Context context, String[] programName, int[] images, String[] programDescription) {
        super(context, R.layout.activity_single_item, R.id.textView1, programName);
        this.context = context;
        this.images = images;
        this.programName = programName;
        this.programDescription = programDescription;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View SingleItem = convertView;
        ProgramViewHolder holder = null;
        if(SingleItem == null){
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            SingleItem = layoutInflater.inflate(R.layout.activity_single_item, parent, false);
            holder =new ProgramViewHolder(SingleItem);
            SingleItem.setTag(holder);

        }
        else{
            holder = (ProgramViewHolder) SingleItem.getTag();

        }
        holder.itemImage.setImageResource(images[position]);
        holder.programTitle.setText(programName[position]);
        holder.getProgramDescription.setText(programDescription[position]);
        SingleItem.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(), "You clicked: "+ programName[position], Toast.LENGTH_SHORT).show();
            }
        });
        return SingleItem;
    }
}

