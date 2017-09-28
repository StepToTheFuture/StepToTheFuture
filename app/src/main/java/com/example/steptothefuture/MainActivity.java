package com.example.steptothefuture;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public Button search;
    public static final String EXTRA_MESSAGE = "com.example.steptothefuture.MESSAGE";

   /* public void go_to_second () {

        search = (Button)findViewById(R.id.button_search);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent abc = new Intent(MainActivity.this, second_screen.class);
                startActivity(abc);
            }
        });
    }*/


    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        System.out.println(3333 + message);
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        go_to_second ();

    }
}
