package com.example.bill;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.Serializable;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    double input1 = 0.00, input2 = 0.00, output = 0.00, sum = 0.00;
    TextView edt1 , edt2, edt_op, total_amount, item_count;
    boolean Multiplication, decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonMul,buttonDel, buttonDot,button_backspace, button_add, button_done;
    int counter=0;
    ListView listView;
    BillAdapter adapter;
    ArrayList<Bill> bills = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // Action Bar

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle("Bill Calculator");
        actionBar.setDisplayUseLogoEnabled(true);
        actionBar.setDisplayShowHomeEnabled(true);





        listView = findViewById(R.id.list_view1);


        button0 = findViewById(R.id.button0);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        buttonDot = findViewById(R.id.buttonDot);
        buttonMul = findViewById(R.id.buttonmul);
        buttonDel = findViewById(R.id.buttonDel);
        button_backspace = findViewById(R.id.button_backspace);
        button_add = findViewById(R.id.button_add);
        button_done = findViewById(R.id.button_done);

        edt1 = findViewById(R.id.edt1);
        edt2 = findViewById(R.id.edt2);
        edt_op = findViewById(R.id.edt_op);
        total_amount= findViewById(R.id.total_amount);
        item_count= findViewById(R.id.item_count);


        adapter = new BillAdapter(MainActivity.this, bills);
        ListView listView = findViewById(R.id.list_view1);
        listView.setAdapter(adapter);

        button1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "1");
                }
                else {
                    edt2.setText(edt2.getText() + "1");

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {

                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "2");
                }
                else {
                    edt2.setText(edt2.getText() + "2");

                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "3");
                }
                else {
                    edt2.setText(edt2.getText() + "3");

                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "4");
                }
                else {
                    edt2.setText(edt2.getText() + "4");

                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "5");
                }
                else {
                    edt2.setText(edt2.getText() + "5");

                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "6");
                }
                else {
                    edt2.setText(edt2.getText() + "6");

                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "7");
                }
                else {
                    edt2.setText(edt2.getText() + "7");

                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "8");
                }
                else {
                    edt2.setText(edt2.getText() + "8");

                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "9");
                }
                else {
                    edt2.setText(edt2.getText() + "9");

                }
            }
        });

        button0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText() + "0");
                }
                else {
                    edt2.setText(edt2.getText() + "0");

                }

            }
        });







        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt1.getText().length() != 0) {
                    input1 = Float.parseFloat(edt1.getText() + "");
                    Multiplication = true;
                    decimal = false;
                    edt_op.setText("x");
                }
            }
        });



        button_add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint({"SetTextI18n", "DefaultLocale"})
            @Override
            public void onClick(View v) {
                if (Multiplication) {
                    input2 = Float.parseFloat(edt2.getText() + "");
                    output = input1 * input2;
                    sum = sum + output;
                    total_amount.setText(String.format("%.2f", output));
                    Multiplication = false;

                    counter++;
                    item_count.setText(Integer.toString(counter));

                    Bill bill = new Bill(String.valueOf(bills.size()+1),edt1.getText().toString()+edt_op.getText().toString()+edt2.getText().toString(),total_amount.getText().toString());
                    bills.add(bill);
                    adapter.notifyDataSetChanged();


                }



            }
        });



        button_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(edt_op.length() == 0) {
                    edt1.setText(edt1.getText().subSequence(0,edt1.length()-1));
                }
                else if (edt2.length() == 0 && edt_op.length() != 0 ){
                    edt_op.setText(edt_op.getText().subSequence(0,edt_op.length()-1));

                }
                else {
                    edt2.setText(edt2.getText().subSequence(0,edt2.length()-1));

                }
            }
        });

        buttonDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText("");
                edt2.setText("");
                edt_op.setText("");
                input1 = 0.0;
                input2 = 0.0;
            }
        });



        buttonDot.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (decimal) {
                    //do nothing or you can show the error
                } else if(edt_op.length() ==0) {
                    edt1.setText(edt1.getText() + ".");
                    decimal = true;
                }

            }
        });

        button_done.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FinalBillActivity.class);
                intent.putExtra("bills", bills);
                intent.putExtra("sum",sum);
                startActivity(intent);

            }
        });



    }


    public static class Bill implements Serializable {
        public String item_no ;
        public   String cal;
        public   String tot;

        public Bill(String item_no, String cal, String tot) {




            this.item_no = item_no;
            this.cal = cal;
            this.tot = tot;

        }




        public String getItem_no() {
            return item_no;
        }

        public void setItem_no(String item_no) {
            this.item_no = item_no;
        }

        public String getCal() {
            return cal;
        }

        public void setCal(String cal) {
            this.cal = cal;
        }

        public String getTot() {
            return tot;
        }

        public void setTot(String tot) {
            this.tot = tot;
        }
    }


    // method to inflate the options menu when
    // the user opens the menu for the first time
    @Override
    public boolean onCreateOptionsMenu( Menu menu ) {

        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // methods to control the operations that will
    // happen when user clicks on the action buttons
    @Override
    public boolean onOptionsItemSelected( @NonNull MenuItem item ) {

        switch (item.getItemId()){
            case R.id.refresh:
                Toast.makeText(this, "Refresh Clicked", Toast.LENGTH_SHORT).show();
                bills.clear();
                adapter.notifyDataSetChanged();
                edt2.setText(R.string.empty);
                edt1.setText(R.string.empty);
                edt_op.setText(R.string.empty);
                item_count.setText(R.string.empty);
                total_amount.setText(R.string.empty);
                sum = 0.00;
                break;
        }
        return super.onOptionsItemSelected(item);
    }

}