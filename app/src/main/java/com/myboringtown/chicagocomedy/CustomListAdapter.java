package com.myboringtown.chicagocomedy;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by sdalton on 10/9/2017.
 */

public class CustomListAdapter extends ArrayAdapter {

    //to reference the Activity
    private final Activity context;

    //to store the list of countries
    private final String[] nameArray;

    //to store the list of countries
    private final String[] venuenameArray;

    public CustomListAdapter(Activity context, String[] nameArrayParam, String[] venuenameArrayParam){

        super(context,R.layout.list_row , nameArrayParam);

        this.context=context;
        this.nameArray = nameArrayParam;
        this.venuenameArray = venuenameArrayParam;

    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.list_row, null,true);

        //this code gets references to objects in the listview_row.xml file
        TextView nameTextField = (TextView) rowView.findViewById(R.id.name);
        TextView infoTextField = (TextView) rowView.findViewById(R.id.venuename);

        //this code sets the values of the objects to values from the arrays
        nameTextField.setText(nameArray[position]);
        infoTextField.setText(venuenameArray[position]);

        return rowView;

    };

}