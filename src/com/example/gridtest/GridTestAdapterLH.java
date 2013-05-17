package com.example.gridtest;

import com.example.Model.Card;
import com.example.Model.CardsOnPad;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class GridTestAdapterLH extends BaseAdapter{
	Context context;
	private CardsOnPad onPad; //Referens till de kort som skall vara på paddan 
    public GridTestAdapterLH(Context c, CardsOnPad onPad) {
    	Log.i("Cirkus","In Adapter ");
    	this.context = c;
    	this.onPad = onPad; //Samma lista som i GridTestActivity.
	// TODO Auto-generated constructor stub
    }

	@Override
	public int getCount() {
		// TODO ANge hur många grejor som skall snurras
		Log.i("Cirkus","Antal kort: "+ onPad.getCards().size());
		return onPad.getCards().size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		Log.i("Cirkus","In getItem" + position);
		return 0;
	}

	@Override
	public long getItemId(int position) {
		Log.i("Cirkus","In getItemId");
		return 0;
	}

	@Override  //anropas för varje ruta
	public View getView(int position, View convertView, ViewGroup parent) {
		//Here is were it happens position är det som är intressant.;
		Log.i("Cirkus","Position: "+position);
		ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(context);
            imageView.setLayoutParams(new GridView.LayoutParams(85, 85)); //Här skapar vi det nya elementet
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);  //I mitten av rutan
            imageView.setPadding(2, 2, 2, 2);
        } else {
            imageView = (ImageView) convertView; // Om inget har ändrats återanvänder vi gammal bild
        }
        
         Card c = onPad.getCard(position);
         if (c != null){
        	 Log.i("Cirkus","ImageNbr: "+c.getCardImage());
        	 imageView.setImageResource(c.getCardImage()); 
         }else{
        	 Log.i("Cirkus","DummyImage: "+ R.drawable.lion);
        	 imageView.setImageResource(R.drawable.lion); //OM platsen är tom
         }
         
         return imageView;

	}

}
