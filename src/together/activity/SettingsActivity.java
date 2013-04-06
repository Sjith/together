package together.activity;import together.activity.SendMessageActivity.SpinnerSelectedListener;import android.app.Activity;import android.content.Context;import android.content.pm.ActivityInfo;import android.os.Bundle;import android.view.View;import android.widget.AdapterView;import android.widget.ArrayAdapter;import android.widget.Spinner;import android.widget.AdapterView.OnItemSelectedListener;public class SettingsActivity extends Activity{	Context context;		private String UID;		private Spinner mySpinner;	public void onCreate(Bundle savedInstanceState) {		super.onCreate(savedInstanceState);		setContentView(R.layout.settings);		setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);		context = this;		//获取UID		UID = getSharedPreferences("user", Context.MODE_PRIVATE).getString("uid", null);  		initUI();	}	private void initUI() {		String[] distances = { getString(R.string.distance_less), getString(R.string.distance_50), 				getString(R.string.diestace_100),getString(R.string.distance_200),getString(R.string.distance_1000),						getString(R.string.distance_2000),getString(R.string.distance_more)}; 		mySpinner = (Spinner) findViewById(R.id.event_spinner); 		ArrayAdapter<String> adapter = new ArrayAdapter<String>( this, android.R.layout.simple_spinner_item,distances); 		adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item); 		mySpinner.setAdapter(adapter);		mySpinner.setOnItemSelectedListener(new SpinnerSelectedListener());  	}		class SpinnerSelectedListener implements OnItemSelectedListener{  		          public void onItemSelected(AdapterView<?> arg0, View arg1, int arg2,                  long arg3) {  //        	view.setText("你的血型是："+m[arg2]);          }            public void onNothingSelected(AdapterView<?> arg0) {          }      }  }