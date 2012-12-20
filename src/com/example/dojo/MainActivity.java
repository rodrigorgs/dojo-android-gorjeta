package com.example.dojo;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {
	
	private EditText total;
	private EditText gorjeta;
	private EditText nPessoas;
	private Button calcular;
	private Double result;
	private TextView resultado;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		total = (EditText) findViewById(R.id.edt_Total);
		gorjeta = (EditText) findViewById(R.id.edt_gorjeta);
		nPessoas = (EditText) findViewById(R.id.edt_nPessoas);
		calcular = (Button) findViewById(R.id.btn_calcular);
		resultado = (TextView) findViewById(R.id.labelResult);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	public void OnClickCalcular(View view){
		Log.i("teste", total.getText().toString());
		result = Double.parseDouble(total.getText().toString()) * (Double.parseDouble(gorjeta.getText().toString())/100); 
		resultado.setText(result.toString());
	}

}
