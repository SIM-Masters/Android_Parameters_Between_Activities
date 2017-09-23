package sim.hecmundo.passing_parameters;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void open_act2(View view){
        Intent i= new Intent(this,Main2Activity.class);
        EditText name = (EditText)findViewById(R.id.editText);
        String param = (String) name.getText().toString();
        i.putExtra("name",param);
        startActivity(i);
    }
}
