package com.looppedal.first;
import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LoopPedalActivity extends Activity implements OnClickListener {
	Button buttonRecord;
	Button button2;
	Button button3;
	Button button4;
	Button buttonStop;
	Button buttonSave;
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.loop);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        
        
        buttonRecord = (Button) findViewById(R.id.buttonRecord);
        buttonStop = (Button) findViewById(R.id.buttonStop);
        buttonSave = (Button) findViewById(R.id.buttonSave);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        
        buttonRecord.setOnClickListener(this);
    }

	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}