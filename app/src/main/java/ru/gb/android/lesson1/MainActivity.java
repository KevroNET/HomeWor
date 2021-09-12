package ru.gb.android.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
       // setSupportActionBar(toolbar);
        txt = (TextView) findViewById(R.id.txt);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();
        switch (id) {
            case R.id.action_1:
                txt.setText(R.string.item1);
                return true;
            case R.id.action_2:
                txt.setText(R.string.item2);
                return true;
            case R.id.action_3:
                txt.setText(R.string.item3);
                return true;
            case R.id.action_4:
                txt.setText(R.string.item4);
                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}