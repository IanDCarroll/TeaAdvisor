package com.hfad.teaadvisor;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;


public class FindTeaActivity extends Activity {
    private TeaExpert expert = new TeaExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_find_tea);
    }
    //call when user taps the button
    public void onClickFindTea(View view) {
        //get a reference to textview
        TextView types = (TextView) findViewById(R.id.types);
        //get a reference to the spinner
        Spinner color = (Spinner) findViewById(R.id.color);
        //get the selected item in the spinner
        String teaType = String.valueOf(color.getSelectedItem());
        //get recommendations from the TeaExpert class!
        List<String> typesList = expert.getTypes(teaType);
        StringBuilder typesFormatted = new StringBuilder();
        for (String type : typesList) {
            typesFormatted.append(type).append('\n');
        }
        //display the teas
        types.setText(typesFormatted);
    }
}
