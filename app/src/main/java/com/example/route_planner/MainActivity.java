package com.example.route_planner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import static com.example.route_planner.algo.travllingSalesmanProblem;

public class MainActivity extends AppCompatActivity {

    TextView test;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test = (TextView) findViewById(R.id.test);
        int graph[][] = {{0, 10, 15, 20},
                {10, 0, 35, 25},
                {15, 35, 0, 30},
                {20, 25, 30, 0}};
        int s = 0;
        int[] ans = travllingSalesmanProblem(graph, s);
        String value="";
        for (int i=0;i<graph.length;i++){
            value += (ans[i]+1);
            value+="--";
        }

        test.setText(value);
    }
}