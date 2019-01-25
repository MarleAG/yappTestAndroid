package com.example.lirio.mymaptestyapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class Inicio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
    }

    @Override
    public boolean onCreateOptionsMenu (Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.op1:
                Intent mymapa = new Intent(Inicio.this, MapsActivity.class);
                startActivity(mymapa);
                return false;

            case R.id.op3:
                Intent myjson = new Intent(Inicio.this, MainActivity.class);
                startActivity(myjson);
                // Action goes here
                return false;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
