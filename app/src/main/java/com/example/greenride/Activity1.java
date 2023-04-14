package com.example.greenride;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Activity1 extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

        final String smallCars[]= new String[]{"'Tesla 1","'Tesla 2","'Tesla 3","'Tesla 4","'Tesla 5",
                "'Tesla 6","'polestar 1","'polestar 2","'polestar 3","'Nissan Zero"};


        listView=(ListView)findViewById(R.id.listView1);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout. simple_list_item_1, smallCars);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //TODO Auto-generated method stub

                // Getting listview click value into String variable.
                String TempListViewClickedValue = smallCars[i].toString();

                Intent intent = new Intent(Activity1.this, Activity2.class);

                // Sending value to another activity using intent.
                intent.putExtra("ListViewClickedValue", TempListViewClickedValue);

                startActivity(intent);
            }
        });
    }
}
