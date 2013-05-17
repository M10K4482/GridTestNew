package com.example.gridtest;

import com.example.Model.Card;
import com.example.Model.CardsOnPad;
import com.example.Model.Deck;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
//HEJ!
public class GridTestActivityLH extends Activity {
   private GridView gridview;
   private GridTestAdapterLH gr;
	private CardsOnPad onPad; //Referens till de kort som skall vara på paddan 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_grid_test);
		//Create deck and cards and all
		onPad = new CardsOnPad(); 
		 gridview = (GridView) findViewById(R.id.gridviewTestLH);
		 gr = new GridTestAdapterLH(this,onPad);
		    gridview.setAdapter(gr); //Skapa adapter skicka in våra kort 
		    gridview.setOnItemClickListener(new OnItemClickListener() {
		        public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
		            Toast.makeText(GridTestActivityLH.this, "" + position, Toast.LENGTH_SHORT).show();
		            Card c = onPad.getCard(position); //Hämta kortet igen
		            c.pressCard(); //Tryck in kortets
		            Log.i("Cirkus","Image: "+ c.getCardImage());
		            gr.notifyDataSetChanged();//Ritr om allt lite onödigt kan räcka med en del men men
		        }
		    });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.grid_test, menu);
		return true;
	}

}
