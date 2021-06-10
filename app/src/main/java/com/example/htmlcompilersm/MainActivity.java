package com.example.htmlcompilersm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txt ;
    Intent intent;
    String  html = "";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt = (EditText) findViewById(R.id.txtHTML);

        html = getIntent().getStringExtra("EdiTtEXTvALUE");
        txt.setText(html);




    }



    public void Generate(View view) {


        txt.setText("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n" +
                "    <title>Document</title>\n" +
                "    <style>\n" +
                "        \n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "    \n" +
                "    ....\n" +
                "\n" +
                "    <script>\n" +
                "        \n" +
                "    </script>\n" +
                "</body>\n" +
                "</html>");
    }

    public void Run(View view) {
        try {
            Intent intent = new Intent(this, webView_html.class);
            intent.putExtra("EdiTtEXTvALUE", txt.getText().toString());
            startActivity(intent);
        }
        catch (Exception e)
        {
            Toast.makeText(getApplicationContext(), "Erreur!", Toast.LENGTH_SHORT).show();
        }
        /*intent = new Intent(getApplicationContext(),webView_html.class);
        intent.putExtra("EdiTtEXTvALUE", txt.getText().toString());
        startActivity(intent);*/
    }
}