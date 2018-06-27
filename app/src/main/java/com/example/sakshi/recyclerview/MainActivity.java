package com.example.sakshi.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Movie> movieList = new ArrayList<>();
    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycler_view);

        movieAdapter = new MovieAdapter(movieList);


        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(movieAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {
        Movie movie = new Movie("abc", "action", "2010");
        movieList.add(movie);

        movie = new Movie("xyz", "action", "2011");
        movieList.add(movie);
        movie = new Movie("cds", "classical", "2012");
        movieList.add(movie);

        movie = new Movie("ghs", "action", "2013");
        movieList.add(movie);

        movie = new Movie("jhg", "action", "2014");
        movieList.add(movie);

        movie = new Movie("hdg", "action", "2015");
        movieList.add(movie);

        movie = new Movie("hgf", "action", "2016");
        movieList.add(movie);
    }
}
