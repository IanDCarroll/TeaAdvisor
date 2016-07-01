package com.hfad.teaadvisor;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;


public class FindTeaActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_find_tea);
    }
    //call when user taps the button
    public void onClickFindTea(View view) {
        TextView types = (TextView) findViewById(R.id.types);
        types.setText("Gup of gea");
        Spinner color = (Spinner) findViewById(R.id.color);
        String.valueOf(color.getSelectedItem());
    }
}
