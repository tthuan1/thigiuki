package com.example.thigiuki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText sothu1, sothu2;
    TextView ketqua;
    Button button;
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sothu1 = findViewById(R.id.editText);
        sothu2 = findViewById(R.id.editText3);
        ketqua = findViewById(R.id.textView2);
        button = findViewById(R.id.button);
        list = findViewById(R.id.listview);

        //
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String so1 = sothu1.getText().toString();
                float s1 = Float.parseFloat(so1);
                String so2 = sothu2.getText().toString();
                float s2 = Float.parseFloat(so2);
                float pheptinh = (s1 / s2);
                String s = String.valueOf(pheptinh);
                String kq = (so1 + "/" + so2 + "=" + s);
                ketqua.setText(kq);
            }
        });
    }

    ;
}