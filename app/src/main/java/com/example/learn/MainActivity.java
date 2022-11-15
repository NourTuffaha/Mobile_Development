package com.example.learn;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btnAdd;
    private TextView txtHobbies;
    private EditText editHobbies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupViews();
    }
    private void setupViews(){
        btnAdd =findViewById(R.id.btnAdd);
        txtHobbies =findViewById(R.id.txtHobbies);
        editHobbies =findViewById(R.id.editHobbies);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String hobbies = editHobbies.getText().toString();
                if (!hobbies.isEmpty()){
                    txtHobbies.setText(hobbies);
                    txtHobbies.setVisibility(view.VISIBLE);
                }


            }
        });


    }
}