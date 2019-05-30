package com.example.sabbath_mode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Switch sabbathSwitch;
    Toast notifyUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sabbathSwitch = findViewById(R.id.sabbathSwitch);

        sabbathSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    notifyUser = Toast.makeText(getApplicationContext(),"Sabbath Mode On",Toast.LENGTH_LONG);
                    notifyUser.show();
                } else {
                    notifyUser = Toast.makeText(getApplicationContext(),"Sabbath Mode Off",Toast.LENGTH_SHORT);
                    notifyUser.show();
                }
            }
        });


    }
}
