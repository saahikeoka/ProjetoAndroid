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
        setTitle ("Filtro 100");

        ToggleButton toggle = (ToggleButton) findViewById(R.id.togglebutton);
        toggle.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener(){
        @Override
                public void onCheckedChanged (CompoundButton buttonView, boolean isChecked){
            if (isChecked){
                Toast.makeText(getApplicationContext(), "Tomada ativada", Toast.LENGTH_LONG).show();
            }else{
                Toast.makeText(getApplicationContext(), "Tomada desativada", Toast.LENGTH_LONG).show();
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
       if (id == R.id.action_settings) {
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
