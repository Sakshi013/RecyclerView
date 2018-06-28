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
        Movie movie = new Movie("Titanic", "romance--disaster", "1997");
        movie.setImage(R.drawable.titanic);
        movieList.add(movie);

        movie = new Movie("superman", "action", "2018");
        movie.setImage(R.drawable.superman);

        movieList.add(movie);
        movie = new Movie("baaghi", "Romantic", "2016");
        movie.setImage(R.drawable.baaghi);

        movieList.add(movie);

        movie = new Movie("Ek villen", "action", "2015");
        movie.setImage(R.drawable.ekvillian);

        movieList.add(movie);
    }
}
