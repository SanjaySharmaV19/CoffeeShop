package com.example.coffeeshop;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    TextView countsa,countck,countcok,counttal;
    int counts=0,countc=0,countcoke=0,countall=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        countsa=findViewById(R.id.samosa);
        countck=findViewById(R.id.cake);
        countcok=findViewById(R.id.coke);
        counttal=findViewById(R.id.total);
    }
    public void upsamosa(View view)
    {
        counts++;
        countsa.setText(""+counts);
    }
    public void downsomosa (View view) {
        if (counts == 0) {
            Toast.makeText(this, "invaild input", Toast.LENGTH_SHORT).show();
            return;
        }
        counts--;
        countsa.setText("" + counts);

    }
    public void upcake(View view)
    {
        countc++;
        countck.setText(""+countc);
    }
        public void downcake (View view) {
            if (countc == 0) {
                Toast.makeText(this, "invaild input", Toast.LENGTH_SHORT).show();
                return;
            }
            countc--;
            countck.setText("" + countc);
        }
    public void upcoke(View view)
    {
        countcoke++;
        countcok.setText(""+countcoke);
    }
    public void downcoke (View view) {
        if (countcoke == 0) {
            Toast.makeText(this, "invaild input", Toast.LENGTH_SHORT).show();
            return;
        }
        countcoke--;
        countcok.setText("" + countcoke);
    }
    public void total(View view)
    {
        countall=countcoke + countc +counts;
        counttal.setText(""+countall);
    }
}
