package sim.hecmundo.passing_parameters;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView nombre = (TextView)findViewById(R.id.textView3);
        String param = getIntent().getStringExtra("name");
        nombre.setText(param);
    }



    public void open_act1(View view) {
        //Intent i= new Intent(this,MainActivity.class);
        //startActivity(i);
        finish();
    }
}
