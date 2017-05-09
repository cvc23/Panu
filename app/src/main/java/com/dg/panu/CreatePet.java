package com.dg.panu;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

public class CreatePet extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_pet);
        NavigationView navigationView = (NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(this);


    }





    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.eventos) {
            // Handle the camera action
        } else if (id == R.id.adopcion) {

        } else if (id == R.id.mascotas) {
            Intent intent= new Intent(this, CreatePet.class );
            startActivity(intent);


        } else if (id == R.id.configuracion) {

        } else if (id == R.id.inicio) {
            Intent intent= new Intent(this, MainActivity.class );
            startActivity(intent);
        }

        return true;
    }
}
