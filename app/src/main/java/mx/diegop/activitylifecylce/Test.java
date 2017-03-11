package mx.diegop.activitylifecylce;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class Test extends AppCompatActivity {

    private TextView view;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        view = (TextView) findViewById(R.id.test_text);

        view.setEnabled(false);
        view.setText(R.string.second_text_test);

        button = (Button) findViewById(R.id.test_button);
        button.setText("Aprietame!");

    }
}
