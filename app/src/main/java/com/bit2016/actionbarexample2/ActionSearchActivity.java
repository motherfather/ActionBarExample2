package com.bit2016.actionbarexample2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.TextView;

public class ActionSearchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView( R.layout.activity_action_search );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        menu.
                add( Menu.NONE, 0, 0, "Search").
                setIcon( android.R.drawable.ic_menu_search ).
                setActionView( R.layout.collapsible_edittext ).
                setShowAsAction( MenuItem.SHOW_AS_ACTION_ALWAYS | MenuItem.SHOW_AS_ACTION_COLLAPSE_ACTION_VIEW );

        MenuItem menuItem = menu.getItem(0);
        final EditText editText = (EditText)menuItem.getActionView();
        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                if (actionId == EditorInfo.IME_ACTION_SEARCH) {

                    String keyword = editText.getText().toString();
                    Log.d("------------>", keyword);
                    editText.setText("");

                    return true;
                }

                return false;
            }
        });
        return true;
    }


}
