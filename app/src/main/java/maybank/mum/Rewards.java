package maybank.mum;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Rewards extends AppCompatActivity {

    private Button leftbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rewards);


        leftbutton = (Button) findViewById(R.id.leftbutton);

        leftbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                leftbutton();
            }
        });
    }

    private void leftbutton() {

        finish();
    }

}
