package be.condorcet.helloworld2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView coucou=null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		//setContentView(R.layout.activity_main);
		coucou=new TextView(this);
		//String accueil=getResources().getString(0x7f050002);
		String accueil=getResources().getString(R.string.hello_world);
		coucou.setText(accueil);
		setContentView(coucou);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
