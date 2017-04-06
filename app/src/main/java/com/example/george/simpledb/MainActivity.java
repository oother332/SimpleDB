package com.example.george.simpledb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.amazonaws.auth.CognitoCachingCredentialsProvider;
import com.amazonaws.regions.Regions;

import static android.provider.ContactsContract.CommonDataKinds.StructuredPostal.REGION;

public class MainActivity extends AppCompatActivity {

    private EditText storeValue;
    private EditText updateValue;
    private EditText pullValue;

    public void onButtonTap1(View v){
        storeValue = (EditText)findViewById(R.id.storeValue);
        Toast myToast = Toast.makeText(getApplicationContext(),storeValue.getText(), Toast.LENGTH_LONG);
        myToast.show();
    }
    public void onButtonTap2(View v){
        updateValue = (EditText)findViewById(R.id.updateValue);
        Toast myToast = Toast.makeText(getApplicationContext(),updateValue.getText(), Toast.LENGTH_LONG);
        myToast.show();
    }
    public void onButtonTap3(View v){
        pullValue = (EditText)findViewById(R.id.retrieveValue);
        Toast myToast = Toast.makeText(getApplicationContext(),pullValue.getText(), Toast.LENGTH_LONG);
        myToast.show();
    }
    // Initialize the Amazon Cognito credentials provider
    CognitoCachingCredentialsProvider credentialsProvider = new CognitoCachingCredentialsProvider(
            getApplicationContext(),
            "us-east-1:730c51fb-c847-479f-8b36-332e36645e49", // Identity Pool ID
            Regions.US_EAST_1 // Region
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
