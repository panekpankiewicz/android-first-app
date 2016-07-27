package com.example.patryk.flagi;
import android.widget.ToggleButton;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    private ToggleButton jemenA;
    private ToggleButton jemenB;
    private ToggleButton jemenC;

    private ToggleButton austriaA;
    private ToggleButton austriaB;
    private ToggleButton austriaC;

    private ToggleButton estoniaA;
    private ToggleButton estoniaB;
    private ToggleButton estoniaC;

    private ToggleButton rosjaA;
    private ToggleButton rosjaB;
    private ToggleButton rosjaC;

    private ToggleButton gabonA;
    private ToggleButton gabonB;
    private ToggleButton gabonC;

    int quantity =0;
    boolean mBool = false;
    Boolean jem = false;
    Boolean aus = false;
    Boolean est = false;
    Boolean ros = false;
    Boolean gab = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void incrementjem(View view) {
        if (jem==false){
            jem=true;
            quantity=quantity+1;
        }
        else {
            jem=false;
            quantity=quantity-1;
        }
    }


    public void incrementaus(View view) {
        if (aus==false){
            aus=true;
            quantity=quantity+1;
        }
        else {
            aus=false;
            quantity=quantity-1;
        }
    }

    public void incrementest(View view) {
        if (est==false){
            est=true;
            quantity=quantity+1;
        }
        else {
            est=false;
            quantity=quantity-1;
        }
    }

    public void incrementros(View view) {
        if (ros==false){
            ros=true;
            quantity=quantity+1;
        }
        else{
            ros=false;
            quantity=quantity-1;
        }
    }

    public void incrementgab(View view) {
        if (gab==false){
            gab=true;
            quantity=quantity+1;
        }
        else {
            gab=false;
            quantity=quantity-1;
        }
    }

    public void submitResult(View view) {
        display(quantity);
    }

    public void resetResult(View view) {

        jemenA= (ToggleButton) findViewById(R.id.jemenA);
        jemenB= (ToggleButton) findViewById(R.id.jemenB);
        jemenC= (ToggleButton) findViewById(R.id.jemenC);

        austriaA= (ToggleButton) findViewById(R.id.austriaA);
        austriaB= (ToggleButton) findViewById(R.id.austriaB);
        austriaC= (ToggleButton) findViewById(R.id.austriaC);

        estoniaA= (ToggleButton) findViewById(R.id.estoniaA);
        estoniaB= (ToggleButton) findViewById(R.id.estoniaB);
        estoniaC= (ToggleButton) findViewById(R.id.estoniaC);

        rosjaA= (ToggleButton) findViewById(R.id.rosjaA);
        rosjaB= (ToggleButton) findViewById(R.id.rosjaB);
        rosjaC= (ToggleButton) findViewById(R.id.rosjaC);

        gabonA= (ToggleButton) findViewById(R.id.gabonA);
        gabonB= (ToggleButton) findViewById(R.id.gabonB);
        gabonC= (ToggleButton) findViewById(R.id.gabonC);

        jemenA.setChecked(mBool);
        jemenB.setChecked(mBool);
        jemenC.setChecked(mBool);

        austriaA.setChecked(mBool);
        austriaB.setChecked(mBool);
        austriaC.setChecked(mBool);

        estoniaA.setChecked(mBool);
        estoniaB.setChecked(mBool);
        estoniaC.setChecked(mBool);

        rosjaA.setChecked(mBool);
        rosjaB.setChecked(mBool);
        rosjaC.setChecked(mBool);

        gabonA.setChecked(mBool);
        gabonB.setChecked(mBool);
        gabonC.setChecked(mBool);

        quantity=0;
        jem = false;
        aus = false;
        est = false;
        ros = false;
        gab = false;
        display(0);
    }

    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(
                R.id.quantity_text_view);

        switch(number){
            case 0: quantityTextView.setText(number+"");
                break;
            case 1: quantityTextView.setText(number+" poprawna odpowiedz");
                break;
            case 2: quantityTextView.setText(number+" poprawne odpowiedzi");
                break;
            case 3: quantityTextView.setText(number+" poprawne odpowiedzi");
                break;
            case 4: quantityTextView.setText(number+" poprawne odpowiedzi");
                break;
            case 5: quantityTextView.setText("Gratulacje!");
                break;
        }






    }}