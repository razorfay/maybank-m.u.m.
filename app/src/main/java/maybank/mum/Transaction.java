package maybank.mum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Transaction extends AppCompatActivity {

    private Button rightbutton;
    private Button leftbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        rightbutton = (Button) findViewById(R.id.rightbutton);

        rightbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                rightbutton();
            }
        });

        leftbutton = (Button) findViewById(R.id.leftbutton);

        leftbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                leftbutton();
            }
        });
    }

    private void rightbutton() {

        Intent intent = new Intent(this, Savings.class);
        startActivity(intent);
    }
    private void leftbutton() {

        finish();
    }
}
