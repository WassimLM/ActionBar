package com.brains404.actionbar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.SearchView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    TextView helloWorld ;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        helloWorld= findViewById(R.id.tv_hello);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        MenuItem searchItem = menu.findItem(R.id.app_bar_search);
         searchView =
                (SearchView) searchItem.getActionView();

        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.itemSettings:
                helloWorld.setText(getResources().getString(R.string.itemSettings));
                return true;
            case R.id.itemHome:
                helloWorld.setText(getResources().getString(R.string.itemHome));
                return true;
            case R.id.itemA:
                helloWorld.setText(getResources().getString(R.string.itemA));
                return true;
            case R.id.itemB:
                helloWorld.setText(getResources().getString(R.string.itemB));
                return true;
            case R.id.app_bar_search:
                helloWorld.setText(getResources().getString(R.string.itemSearch));
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
