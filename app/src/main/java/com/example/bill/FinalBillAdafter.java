package com.example.bill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
class FinalBillAdapter extends ArrayAdapter<MainActivity.Bill> {



    private static class ViewHolder {
        TextView item_no;
        TextView cal;
        TextView tot;


    }

    public FinalBillAdapter(Context context, ArrayList<MainActivity.Bill> bills) {
        super( context, 0, bills);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        MainActivity.Bill bills = getItem(position);
        ViewHolder viewHolder;
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            viewHolder = new ViewHolder();
            //convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_view, parent, false);
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.final_bill_list_view, parent, false);
            viewHolder.item_no = (TextView) convertView.findViewById(R.id.item);
            viewHolder.cal = (TextView) convertView.findViewById(R.id.calculation);
            viewHolder.tot = (TextView) convertView.findViewById(R.id.total);
            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);

        }
        else {
            // View is being recycled, retrieve the viewHolder object from tag
            viewHolder = (ViewHolder) convertView.getTag();
        }


        viewHolder.item_no.setText(bills.item_no);
        viewHolder.cal.setText(bills.cal);
        viewHolder.tot.setText(bills.tot);
        return convertView;
    }


}