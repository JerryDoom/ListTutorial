package com.jerry.listtutorial;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import java.util.ArrayList;



public class MainActivity extends Activity {

    private ArrayList <ListItem> mArraylist = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnHeader = (Button) findViewById(R.id.btn_header);
        ListView listView = (ListView) findViewById(R.id.list_test);
        mArraylist = new ArrayList<ListItem>();
        ListItem listItem = new ListItem();
        listItem.setImageUser(getResources().getDrawable(R.drawable.bart));
        listItem.setHeader("Gerardo");
        listItem.setSubHeader("González");
        mArraylist.add(listItem);
        final ListItemAdapter listItemAdapter = new ListItemAdapter(getBaseContext(), mArraylist);
        listView.setAdapter(listItemAdapter);

        //set on click listeners
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //show header of the item clicked on a toast
                Toast.makeText(getBaseContext(), mArraylist.get(i).getHeader() + " pressed", Toast.LENGTH_SHORT).show();
            }
        });
        btnHeader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //create new list item instance and pre-fill values
                ListItem listItem = new ListItem();
                listItem.setHeader("Item " + (mArraylist.size() + 1));
                listItem.setSubHeader("SubItem " + (mArraylist.size() + 1));
                listItem.setImageUser(getResources().getDrawable(R.drawable.bart));
                //add item to array list
                mArraylist.add(listItem);

                //create new list item instance and pre-fill values
                listItem = new ListItem();
                listItem.setHeader("Item " + (mArraylist.size() + 1));
                listItem.setSubHeader("SubItem " + (mArraylist.size() + 1));
                listItem.setImageUser(getResources().getDrawable(R.drawable.bart));
                //add item to array list
                mArraylist.add(listItem);

                //notify the adapter the list has changed with new data.
                listItemAdapter.notifyDataSetChanged();
            }
        });
    }



        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
