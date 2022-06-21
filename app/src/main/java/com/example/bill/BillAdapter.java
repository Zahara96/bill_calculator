package com.example.bill;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;


class BillAdapter extends ArrayAdapter<MainActivity.Bill> {

    ArrayList<MainActivity.Bill> bills;

    private static class ViewHolder {
        TextView item_no;
        TextView cal;
        TextView tot;
        ImageButton btn_delete;


    }

    public BillAdapter(Context context, ArrayList<MainActivity.Bill> bills) {
        super( context, 0, bills);
        this.bills =bills;

    }



    public void remove(int index) {
        bills.remove(index);
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
            convertView = inflater.inflate(R.layout.bill_list_view, parent, false);
            viewHolder.item_no = (TextView) convertView.findViewById(R.id.item);
            viewHolder.cal = (TextView) convertView.findViewById(R.id.calculation);
            viewHolder.tot = (TextView) convertView.findViewById(R.id.total);



            // Cache the viewHolder object inside the fresh view
            convertView.setTag(viewHolder);

            viewHolder.btn_delete = (ImageButton) convertView.findViewById(R.id.btn_delete);
            viewHolder.btn_delete.setTag(position);
            viewHolder.btn_delete.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    int index = (int) v.getTag();
                    remove(index);
                   // billRemoveListner.onItemRemoved(index);
                    Toast.makeText(getContext(),"delete", Toast.LENGTH_SHORT).show();
                }
            });


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