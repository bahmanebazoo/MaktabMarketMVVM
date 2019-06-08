package com.maktab.maktabmarketmvvm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mTextViewBrand;
    private TextView mTextViewads;
    private ProgressBar mProgressBarCheckNet;

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context,MainActivity.class);

        return intent;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mProgressBarCheckNet=findViewById(R.id.idWaitForNet);
        mTextViewBrand=findViewById(R.id.idBrandName);
        mTextViewads = findViewById(R.id.idAds);

    }
}
