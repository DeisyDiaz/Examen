package mx.edu.tesoem.itics.diana.examen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity {

    EditText num1, num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);

        num1 = (EditText) findViewById(R.id.editText1);
        num2 = (EditText) findViewById(R.id.editText2);
        Button SUMAR = (Button) findViewById(R.id.SUMAR);
        final EditText resultado = (TextView) findViewById(R.id.textViewresultado);

    }

    public void calculaSuma(View v){
        int a,b,r;
        a = Integer.parseInt(num1.getText().toString());
        b = Integer.parseInt(num2.getText().toString());
        r = a+b;
        resultado.setText(String.valueOf(r));

    }
}
