package kristina_knezevic.helloworld;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button bFirst;
    private Button bSecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bFirst = (Button) findViewById(R.id.bFirst);
        bFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "First button is activated.", Toast.LENGTH_LONG).show();
                Log.i("MA", "First button pressed.");
            }
        });

        bSecond = (Button) findViewById(R.id.bSecond);
        bSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Second button is activated.", Toast.LENGTH_LONG).show();
            }
        });


    }

}
