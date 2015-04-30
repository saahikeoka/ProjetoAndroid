package com.example.sayuriikeoka.projetoandroid;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.lang.reflect.Field;


public class Main extends ActionBarActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] filtros = {"Filtro 100", "Filtro 200", "Filtro 300", "Filtro 400"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, filtros));
        listView.setOnClickListener((View.OnClickListener) this);

    }

    public void onItemClick(AdapterView<?> arg0, View arg1, int arg2, long arg3) {
        Intent intent;
       switch (arg2) {
            case 0:
                intent= new Intent(this,F100.class);
                startActivity(intent);
                break;
            default:
                break;
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
        } else if(id == R.id.action_Search){

            return true;
        } else if(id == R.id.action_new){
            Intent intent = new Intent(this, Activity2.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
