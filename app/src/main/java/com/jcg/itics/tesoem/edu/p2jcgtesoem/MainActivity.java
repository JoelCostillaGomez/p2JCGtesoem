package com.jcg.itics.tesoem.edu.p2jcgtesoem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView btnsig = (TextView) findViewById(R.id.btnsiguiente);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsing.setOnClickListener((View.OnClickListener)this);
    }
    public void OnClick(View v){
        Intent frm2 = new Intent(packageContext.this, fmr2Activity.class);
        starActivity(frm2);
        finish();
    }
}
