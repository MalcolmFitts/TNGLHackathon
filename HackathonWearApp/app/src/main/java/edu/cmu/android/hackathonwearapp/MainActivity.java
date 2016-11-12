package edu.cmu.android.hackathonwearapp;

import android.app.Activity;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    private TextView mTextView;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mTextView = (TextView) stub.findViewById(R.id.text);
            }
        });

        button = (Button) findViewById(R.id.button_id);

        Context context = getApplicationContext();
        CharSequence text = "Hello toast!";
        int duration = Toast.LENGTH_SHORT;
    }

    public void doSomething(View view){
        //do something
    }

}
