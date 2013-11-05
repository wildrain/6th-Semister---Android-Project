package com.bright.calculator;

import android.app.Activity;
import android.app.AlertDialog;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import android.webkit.WebView;

public class Main extends Activity {
	
	
	private EditText input1;
	private EditText input2;
	private EditText solution;
	private TextView operator;
	private Main mcontext;
	
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	
    	super.onCreate(savedInstanceState);
    	mcontext=this;
        setContentView(R.layout.main);
        
        
        input1= (EditText) findViewById(R.id.input1);
        input2= (EditText) findViewById(R.id.input2);
        solution= (EditText) findViewById(R.id.solution);
        operator=(TextView) findViewById(R.id.operator);
        
        
        Button plusbutton=(Button) findViewById(R.id.plusbutton);
        Button minusbutton=(Button) findViewById(R.id.minusbutton);
        Button prodbutton=(Button) findViewById(R.id.prodbutton);
        Button divbutton=(Button) findViewById(R.id.divbutton);
        Button equalbutton=(Button) findViewById(R.id.equalbutton);
        Button clearbutton=(Button) findViewById(R.id.clear);
        //Button squarbutton=(Button) findViewById(R.id.squar);
       
        plusbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				operator.setText("+");
				
			}
		});
        
        
        
        minusbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				operator.setText("-");
				
			}
		});
        
        
        
        prodbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				operator.setText("*");
				
			}
		});
        
        
        
        divbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				operator.setText("/");
				
			}
		});
        
        
        /*squarbutton.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
				operator.setText("squar");
				
			}
		});*/
        
        
        
        
        equalbutton.setOnClickListener(new View.OnClickListener() {
        	
        	private AlertDialog show;
        	
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				
				
				/*if(!(input1.getText().length()==0)){
					if(operator.getText().equals("squar")){
						double result=new Double(input1.getText().toString())*new Double(input1.getText().toString());
						solution.setText(Double.toString(result));
					}
				}*/
				
				
				
				
				
			    if((input1.getText().length()==0)||(input1.toString()=="")
						||(input2.getText().length()==0)||(input2.toString()=="")){
					
					show=new AlertDialog.Builder(mcontext).setTitle("Error")
							.setMessage("some fields are incomplete")
							.setPositiveButton("OK", null).show();
					
					
				}
				
				else if(operator.getText().equals("")){
					
					show=new AlertDialog.Builder(mcontext).setTitle("Error")
							.setMessage("operator is null")
							.setPositiveButton("OK", null).show();
				}
				
				else if(operator.getText().equals("+")){
					
					double result=new Double(input1.getText().toString())+new Double(input2.getText().toString());
					solution.setText(Double.toString(result));
				}
				
				else if(operator.getText().equals("-")){
					
					double result=new Double(input1.getText().toString())-new Double(input2.getText().toString());
					solution.setText(Double.toString(result));
				}
				
				else if(operator.getText().equals("*")){
					
					double result=new Double(input1.getText().toString())*new Double(input2.getText().toString());
					solution.setText(Double.toString(result));
				}
				
                else if(operator.getText().equals("/")){
					
					double result=new Double(input1.getText().toString())/new Double(input2.getText().toString());
					solution.setText(Double.toString(result));
				}
				
				
			}
		});
        
        
  }
   

	/*protected String parseDouble(String string) {
		// TODO Auto-generated method stub
		return null;
	}*/
}