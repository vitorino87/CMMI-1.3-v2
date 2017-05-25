package cmmi;

import com.cmmi.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Menu;
import android.widget.Button;


public class MainActivity extends Activity{
	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.tela1);
		
		Button botao = (Button)findViewById(R.id.btnAvancar);
		botao.setOnClickListener( new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				teta(v);
			}
		});
	}

	
	public void teta(View v) {
		// TODO Auto-generated method stub
		Intent it = new Intent(this, Tela2.class);
		startActivity(it);
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu)
	{
		getMenuInflater().inflate(R.menu.lista, menu);
		return true;
	}
}
