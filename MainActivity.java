package com.example.sqlitecrud;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity
{
    TextInputLayout sys, dias, hr;

    Button sbmt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        sys = (TextInputLayout) findViewById(R.id.sysPress);
        dias = (TextInputLayout) findViewById(R.id.diasPress);
        hr = (TextInputLayout) findViewById(R.id.hrtRate);

        sbmt = (Button) findViewById(R.id.sbmt_add);


            sbmt.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    processinsert(sys.getEditText().getText().toString(),dias.getEditText().getText().toString(),hr.getEditText().getText().toString());
                }
            });





    }

    private void processinsert(String n, String c, String e)
    {
       String res=new dbmanager(this).addrecord(n,c,e);
       sys.getEditText().setText("");
       dias.getEditText().setText("");
       hr.getEditText().setText("");
       Toast.makeText(getApplicationContext(),res,Toast.LENGTH_SHORT).show();
    }


}