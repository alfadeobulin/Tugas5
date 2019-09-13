package proteintrackerapp.com;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button proteinBtn = (Button)findViewById(R.id.proteinButton);
        proteinBtn.setOnClickListener(proteinButtonListener);
        Button tableBtn = (Button)findViewById(R.id.tableButton);
        tableBtn.setOnClickListener(tableButtonListener);

    }
    private View.OnClickListener proteinButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, ProteinActivity.class);
            startActivity(intent);
        }
    };
    private View.OnClickListener tableButtonListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, TableActivity.class);
            startActivity(intent);
        }
    };

}
