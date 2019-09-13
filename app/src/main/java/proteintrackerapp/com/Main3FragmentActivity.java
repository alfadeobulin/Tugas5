package proteintrackerapp.com;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.   FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3FragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3_fragment);
        Button btnpress=findViewById(R.id.btnpress);
        btnpress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ProteinFragment proteinFragment = ProteinFragment.newInstance("Hai","Para Progmobers");
                ft.replace(R.id.frameMain, proteinFragment);
                ft.commit();
            }
        });
    }
}
