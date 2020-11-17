package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.AdapterView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;

    String [] numberWord ("One", "Two", "Three", "Four");

    int[] numberImage = {R.drawable.Aly-Fila-Sands-Of-Time-FSOE-600-Anthem R.drawable.artworks-000488156976-d46ao4-t500x500 R.drawable.hqdefault R.drawable.R-333553-1420933322-5058.jpeg}


    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        gridView = fiewViewById(R.id.grid_view);

        MainAdapter: adapter = new MainAdapter (MainActivity.this,numberWord, numberImage);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener () {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText (getApplicationContext (), resld: "You Clicked" + numberWord postion],
                 Toast.LENGTH_SHORT ).show (); ());

            }
        }

    }
}
