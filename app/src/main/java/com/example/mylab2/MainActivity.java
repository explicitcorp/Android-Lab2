package com.example.mylab2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                CharSequence text = getResources().getString(R.string.Toast);
                int duration = Toast.LENGTH_LONG;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
            });
       @SuppressLint("WrongViewCast")
       Switch onOff = (Switch) findViewById(R.id.on_off_switch);
        final Snackbar mySnackbar = Snackbar.make(findViewById(R.id.linLay),R.string.SnackMessageOn , BaseTransientBottomBar.LENGTH_INDEFINITE);
        final Snackbar mySnackbar = Snackbar.make(findViewById(R.id.linLay),R.string.SnackMessageOff , BaseTransientBottomBar.LENGTH_INDEFINITE);
        onOff.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            public void onCheckedChanged(CompoundButton cb, boolean b) {
                mySnackbar.setAction( "Undo", click -> cb.setChecked(!b));
              if(!b){
                  mySnackbar.setText("off");
                  mySnackbar.show();
                  else{
                      mySnackbar.setText("on");
                      mySnackbar.show();
                  }
            }
        });
        }
    }
}