package rate.app.com.ratingbarapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    private Button b1, b2, b3, b4, b5;

    static final int[] idArray = {R.id.push_button, R.id.push_button1, R.id.push_button2, R.id.push_button3, R.id.push_button4};

    private Button[] bt = new Button[idArray.length];

    int mselectedIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.push_button);
        b2 = (Button) findViewById(R.id.push_button1);
        b3 = (Button) findViewById(R.id.push_button2);
        b4 = (Button) findViewById(R.id.push_button3);
        b5 = (Button) findViewById(R.id.push_button4);


        for (int i = 0; i < idArray.length; i++) {
            final int b = i; //
            bt[b] = (Button) findViewById(idArray[b]); // fetch the view id from array


            bt[b].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    // for(int j =i;j<6;i++){

                    switch (v.getId()) {

                        case R.id.push_button:
                            b1.setBackground(getResources().getDrawable(R.drawable.button_round));

                            b2.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            b3.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            b4.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            b5.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            Toast.makeText(MainActivity.this, "1 star", Toast.LENGTH_SHORT).show();
                            break;


                        case R.id.push_button1:
                            b1.setBackground(getResources().getDrawable(R.drawable.button_round));

                            b2.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b3.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            b4.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            b5.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            Toast.makeText(MainActivity.this, "2 star", Toast.LENGTH_SHORT).show();

                            break;


                        case R.id.push_button2:
                            b1.setBackground(getResources().getDrawable(R.drawable.button_round));

                            b2.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b3.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b4.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            b5.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            Toast.makeText(MainActivity.this, "03 star", Toast.LENGTH_SHORT).show();

                            break;


                        case R.id.push_button3:
                            b1.setBackground(getResources().getDrawable(R.drawable.button_round));

                            b2.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b3.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b4.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b5.setBackground(getResources().getDrawable(R.drawable.button_round_white));
                            Toast.makeText(MainActivity.this, "04 Star", Toast.LENGTH_SHORT).show();

                            break;


                        case R.id.push_button4:
                            b1.setBackground(getResources().getDrawable(R.drawable.button_round));

                            b2.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b3.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b4.setBackground(getResources().getDrawable(R.drawable.button_round));
                            b5.setBackground(getResources().getDrawable(R.drawable.button_round));
                            Toast.makeText(MainActivity.this, "05 star", Toast.LENGTH_SHORT).show();

                            break;


                    }


                }
            });


        }
    }
}
















