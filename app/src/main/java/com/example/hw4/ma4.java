package com.example.hw4;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class ma4 extends AppCompatActivity {
    private static final String TEXT_STATE = "현재 택스트";
    private TextView tv = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ma4);
        tv = (TextView)findViewById(R.id.text);

        if(savedInstanceState != null)
           tv.setText(savedInstanceState.getString(TEXT_STATE));
    }

    public void startTask (View view) {
        tv.setText(R.string.napping);

        new hw4(tv).execute();
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(TEXT_STATE, tv.getText().toString());
    }

}