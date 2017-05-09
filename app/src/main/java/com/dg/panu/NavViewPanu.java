package com.dg.panu;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

/**
 * Created by Carlos on 08/05/2017.
 */

public class NavViewPanu  extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{
    NavigationView navigationView;

    public NavViewPanu(NavigationView navigationView){

        this.navigationView = navigationView;
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

        }

        return true;
    }

}
