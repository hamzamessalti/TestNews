package com.example.testnews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;


public class DataAdapter extends ArrayAdapter<data> {

    public DataAdapter(@NonNull Context context, List<data> data) {
        super(context, 0, data);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_view, parent, false);
        }

        data currentdata = getItem(position);

        TextView sectionName = (TextView) listItemView.findViewById(R.id.sectionName);
        sectionName.setText(currentdata.getmSectionName());

        TextView pillarName = (TextView) listItemView.findViewById(R.id.pillarName);
        pillarName.setText(currentdata.getPillarName());

        TextView title = (TextView) listItemView.findViewById(R.id.webTitle);
        title.setText(currentdata.getmTitle());

//        TextView type = (TextView) listItemView.findViewById(R.id.type);
//        type.setText(currentdata.getType());

//        TextView date = (TextView) listItemView.findViewById(R.id.webPublicationDate);
//        date.setText(currentdata.getDate());

        return listItemView;
    }
}
