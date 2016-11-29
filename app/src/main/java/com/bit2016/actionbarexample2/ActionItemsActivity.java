package com.bit2016.actionbarexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class ActionItemsActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState ) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_action_items );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

//        inflate menu resource(xml)
//        getMenuInflater().inflate(R.menu.menu_main, menu);
//        return true;

        menu.add("Save").setIcon( android.R.drawable.ic_menu_edit ).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add("Search").setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add("Refresh").setIcon( android.R.drawable.ic_popup_sync ).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);

        return true;
    }
}
