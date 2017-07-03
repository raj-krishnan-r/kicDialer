package com.example.raj.notesdialer;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.raj.notesdialer.modle.histCont;

import java.util.ArrayList;

/**
 * Created by raj on 2/7/17.
 */

public class MyClassAdapter extends ArrayAdapter<histCont> {
    private static class ViewHolder{
        private TextView itemView;
        private TextView phone;
        private TextView direction;
        private TextView duration;
        private TextView ddate;
        private TextView contName;


    }
    public MyClassAdapter(Context context, int textViewResourceId, ArrayList<histCont> items)
    {
        super(context,textViewResourceId,items);

    }
    public View getView(int position, View convertview, ViewGroup parent)
    {
        ViewHolder viewHolder = new ViewHolder();

        if(convertview==null) {
            convertview = LayoutInflater.from(this.getContext()).inflate(R.layout.row, parent, false);
            //viewHolder.itemView = (TextView) convertview.findViewById(R.id.rowText);
            viewHolder.phone=(TextView) convertview.findViewById(R.id.rowPhone);
            viewHolder.direction=(TextView) convertview.findViewById(R.id.rowDirection);
            viewHolder.duration=(TextView) convertview.findViewById(R.id.rowDuration);
            viewHolder.ddate=(TextView) convertview.findViewById(R.id.rowDate);
            viewHolder.contName=(TextView) convertview.findViewById(R.id.rowName);

            convertview.setTag(viewHolder);
        }
        else {
            viewHolder = (ViewHolder) convertview.getTag();
        }
        histCont item = getItem(position);
        if(item!=null)
        {
            //viewHolder.itemView.setText(item.getPhone());
            viewHolder.phone.setText(item.getPhone());
            viewHolder.direction.setText(item.getDirection());
            viewHolder.duration.setText(item.getDuration());
            viewHolder.ddate.setText(item.getD());
            viewHolder.contName.setText(item.getName());

        }
        return convertview;
    }
}
