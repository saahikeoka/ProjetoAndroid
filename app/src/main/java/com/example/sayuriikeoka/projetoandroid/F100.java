package com.example.sayuriikeoka.projetoandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Toast;
import android.widget.ToggleButton;


public class F100 extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f100);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle ("Filter 100");

        ToggleButton toggle1 = (ToggleButton) findViewById(R.id.togglebutton1);
        toggle1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
        @Override
                public void onCheckedChanged (CompoundButton buttonView, boolean isChecked){
            if (isChecked){
                Toast.makeText(getApplicationContext(), "Socket 1 enabled", Toast.LENGTH_LONG).show();
                buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.DodgerBlue));
                buttonView.setTextColor(F100.this.getResources().getColor(R.color.White));
            }else{
                Toast.makeText(getApplicationContext(), "Socket 1 disabled", Toast.LENGTH_LONG).show();
                buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.Gray));
                buttonView.setTextColor(F100.this.getResources().getColor(R.color.Black));
            }
        }
        });

        ToggleButton toggle2 = (ToggleButton) findViewById(R.id.togglebutton2);
        toggle2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked){
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "Socket 3 enabled", Toast.LENGTH_LONG).show();
                    buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.DodgerBlue));
                    buttonView.setTextColor(F100.this.getResources().getColor(R.color.White));
                }else{
                    Toast.makeText(getApplicationContext(), "Socket 2 disabled", Toast.LENGTH_LONG).show();
                    buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.Gray));
                    buttonView.setTextColor(F100.this.getResources().getColor(R.color.Black));
                }
            }
        });

        ToggleButton toggle3 = (ToggleButton) findViewById(R.id.togglebutton3);
        toggle3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked){
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "Socket 3 enabled", Toast.LENGTH_LONG).show();
                    buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.DodgerBlue));
                    buttonView.setTextColor(F100.this.getResources().getColor(R.color.White));
                }else{
                    Toast.makeText(getApplicationContext(), "Socket 3 disabled", Toast.LENGTH_LONG).show();
                    buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.Gray));
                    buttonView.setTextColor(F100.this.getResources().getColor(R.color.Black));
                }
            }
        });

        ToggleButton toggle4 = (ToggleButton) findViewById(R.id.togglebutton4);
        toggle4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged (CompoundButton buttonView, boolean isChecked){
                if (isChecked){
                    Toast.makeText(getApplicationContext(), "Socket 4 enabled", Toast.LENGTH_LONG).show();
                    buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.DodgerBlue));
                    buttonView.setTextColor(F100.this.getResources().getColor(R.color.White));
                }else{
                    Toast.makeText(getApplicationContext(), "Socket 4 disabled", Toast.LENGTH_LONG).show();
                    buttonView.setBackgroundColor(F100.this.getResources().getColor(R.color.Gray));
                    buttonView.setTextColor(F100.this.getResources().getColor(R.color.Black));
                }
            }
        });
    }

    public void onToggleClicked(View view) {
        boolean on = ((ToggleButton) view).isChecked();

        if (on) {
            // Enable
        } else {
            // Disable
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_f100, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
       if (id == R.id.action_Search) {
            Intent intent = new Intent(this, Activity3.class);
            startActivity(intent);
            return true;
        } else if(id == R.id.action_enable){

            return true;
        } else if(id == R.id.action_disable){

            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
