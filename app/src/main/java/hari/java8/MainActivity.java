package hari.java8;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button btn_new_java;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_new_java = (Button) findViewById(R.id.btn_new_java);

        // General
        btn_new_java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Hello! Method References..", Toast.LENGTH_SHORT).show();
            }
        });

        //Lambda Expressions
        btn_new_java.setOnClickListener(view -> {
            Toast.makeText(MainActivity.this, "Hello! Lambda Expressions..", Toast.LENGTH_SHORT).show();

        });

        btn_new_java.setOnClickListener(this::newJava);
    }

    private void newJava(View view) {
        Toast.makeText(MainActivity.this, "Hello! Method References..", Toast.LENGTH_SHORT).show();
    }
}
