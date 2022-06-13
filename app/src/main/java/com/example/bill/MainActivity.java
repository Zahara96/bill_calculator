package com.example.bill;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;

import java.text.BreakIterator;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    double input1 = 0, input2 = 0, output = 0;
    TextView edt1 , edt2, edt_op, total_amount, item_count;
    boolean Multiplication, decimal;
    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9,
            buttonMul,buttonDel, buttonDot,button_backspace, button_add, button_done;
    int counter=0;
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        listView = (ListView) findViewById(R.id.list_view1);


        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonMul = (Button) findViewById(R.id.buttonmul);
        buttonDel = (Button) findViewById(R.id.buttonDel);
        button_backspace = (Button) findViewById(R.id.button_backspace);
        button_add = (Button) findViewById(R.id.button_add);
        button_done = (Button) findViewById(R.id.button_done);

        edt1 = (TextView) findViewById(R.id.edt1);
        edt2 = (TextView) findViewById(R.id.edt2);
        edt_op = (TextView) findViewById(R.id.edt_op);
        total_amount= (TextView) findViewById(R.id.total_amount);
        item_count= (TextView) findViewById(R.id.item_count);


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
            public void onClick(View v) {;

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
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (Multiplication) {
                    input2 = Float.parseFloat(edt2.getText() + "");
                    output = input1 * input2;
                    total_amount.setText(output + "");
                    //edt1.setText(input1 + " x " + input2 );
                    Multiplication = false;

                    counter++;
                    item_count.setText(Integer.toString(counter));




                    ArrayList<Bill> bills = new ArrayList<Bill>();
                    BillAdapter adapter = new BillAdapter(this, bills);
                    ListView listView = (ListView) findViewById(R.id.list_view1);
                    listView.setAdapter(adapter);

                    /*




                    String item_no = item_count.getText().toString();
                    String cal = edt1.getText().toString();
                    String tot = total_amount.getText().toString();
                    Bill newBill = new Bill(item_no,cal,tot);
                    adapter.add(newBill);




                     */




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



    }


    public class Bill {
        public String item_no ;
        public   String cal;
        public   String tot;

        public Bill(String item_no, String cal, String tot) {

            String _item_no = item_count.getText().toString();
            String _cal = edt1.getText().toString();
            String _tot = total_amount.getText().toString();


            this.item_no = _item_no;
            this.cal = _cal;
            this.tot = _tot;

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

}