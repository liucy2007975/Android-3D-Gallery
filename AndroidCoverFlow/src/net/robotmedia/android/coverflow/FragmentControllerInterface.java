package net.robotmedia.android.coverflow;

import android.view.View;
import android.widget.AdapterView;

public interface FragmentControllerInterface {

	void onItemClick(AdapterView<?> parent, View v, int position,
			long id);
	
	void onItemSelected(AdapterView<?> parent, View v, int position, long id);
}
