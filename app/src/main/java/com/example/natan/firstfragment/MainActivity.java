package com.example.natan.firstfragment;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);





    }

    public void clickHandler(View view) {


        SimpleFragment fragment = new SimpleFragment();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragmentContainer,fragment)
                .commit();

    }

    public void clickHandlerRm(View view) {
        Fragment fragment=getSupportFragmentManager().findFragmentById(R.id.fragmentContainer);

        if(fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .remove(fragment)
                    .commit();
        }



    }
}
