package com.example.bill;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class FinalBillActivity extends AppCompatActivity {

    FinalBillAdapter adapter;
    ListView listViewFinal;
    TextView sum_total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final_bill);

        sum_total = findViewById(R.id.total);
        listViewFinal = findViewById(R.id.list_view_final);

        ArrayList<MainActivity.Bill> bills;
        bills = (ArrayList<MainActivity.Bill>) getIntent().getSerializableExtra("bills");
        double sum =  getIntent().getDoubleExtra("sum", 0.00);



        adapter = new FinalBillAdapter(FinalBillActivity.this, bills);
        adapter.notifyDataSetChanged();
        listViewFinal.setAdapter(adapter);

        if (sum == 0.00){
            sum_total.setText("0.00 \n No Items Added. Please add items!!!");
        } else {
            sum_total.setText(String.format("%.2f", sum));
        }

        // Action Bar

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Bill Calculator");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);


    }

    // method to inflate the options menu when
    // the user opens the menu for the first time
    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {

        getMenuInflater().inflate(R.menu.menu2, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // methods to control the operations that will
    // happen when user clicks on the action buttons
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {

        switch (item.getItemId()){
            case R.id.back:
                Intent intent = new Intent(FinalBillActivity.this, MainActivity.class);
                startActivity(intent);
                break;
        }
        return super.onOptionsItemSelected(item);
    }


}