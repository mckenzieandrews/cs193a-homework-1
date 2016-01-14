//This is an app designed for my friend, Sukrit, who has an Android phone. He goes to hell, MI when he
//decides to work for Goldman Sachs. His nickname is Soxs, so it is titled Goldman Sox.


package com.example.mckenzieandrews.myapplication2;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    int score;
    private final int GSPENALTY= 100;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

    }

    public void selfDestruct(View view){
        //Kabloey
        System.out.println("Destruct click");
        view.setVisibility(View.GONE);
        score++;
        if (view.getId()==R.id.WorkAtGS){
            score= score-GSPENALTY;

            Intent goingToHell = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.gotohellmi.com"));
            startActivity(goingToHell);
        }

        TextView label= (TextView)findViewById(R.id.scoreLabel);
        label.setText("The score is " + score);
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
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
