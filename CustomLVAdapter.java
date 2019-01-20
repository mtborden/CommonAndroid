package /*com.example.mypackage*/;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class /*CustomListViewAdapter*/ extends ArrayAdapter</*CustomDataClass*/>
{
	private LayoutInflater li;
	ArrayList</*CustomDataClass*/> myList;
	
	public class /*CustomViewsClass*/
	{
		/* PUT VIEWS (TextView, EditText, etc) here
           public TextView textView;
           public EditText editText;*/
	}
	
	public /*CustomListViewAdapter*/(Context context, int resource, ArrayList</*CustomDataClass*/> objects)
	{
		super(context, resource, objects);
		li = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
		this.myList = objects;
	}
	
	@Override
	public View getView(int position, View convertView, ViewGroup parent)
	{
		View v = convertView;
		
		if(v == null)
		{
			v = li.inflate(R.layout./*customlayout*/, null);
			
			final /*CustomViewsClass*/ holder = new /*CustomViewsClass*/();
			holder.textView = (TextView)v.findViewById(R.id./*nameTV*/);
			holder.editText = (EditText)v.findViewById(R.id./*timeET*/);
			v.setTag(holder);
		}
		
		final /*CustomViewsClass*/ myRow = (/*CustomViewsClass*/)v.getTag();
		final /*CustomDataClass*/ rowOfData = myList.get(position);
		myRow.textView.setText(rowOfData.name);
		myRow.editText.setHint("Enter text here");
		
		return v;
	}
}
