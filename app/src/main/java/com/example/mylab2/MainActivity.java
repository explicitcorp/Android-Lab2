package com.example.mylab2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_layout);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(v -> {
            Context context = getApplicationContext();
            CharSequence text = getResources().getString(R.string.Toast);
            int duration = Toast.LENGTH_LONG;

            Toast toast = Toast.makeText(context, text, duration);
            toast.show();
        });

       SwitchCompat onOff = (SwitchCompat) findViewById(R.id.on_off_switch);
        final Snackbar snackOn = Snackbar.make(findViewById(R.id.GridLayout),R.string.SnackMessageOn , BaseTransientBottomBar.LENGTH_INDEFINITE);
        final Snackbar snackOff = Snackbar.make(findViewById(R.id.GridLayout),R.string.SnackMessageOff , BaseTransientBottomBar.LENGTH_INDEFINITE);
        onOff.setOnCheckedChangeListener((cb, b) -> {
            snackOn.setAction( "Undo", click -> cb.setChecked(!b));
            snackOff.setAction( "Undo", click -> cb.setChecked(!b));
          if(b){
              snackOn.show();}
              else{
                  snackOff.show();
              }
        });
        }
    }
