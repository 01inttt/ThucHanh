package com.example.thuchanh2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Hero> mHeros ;
    private RecyclerView mRecyclerHero;
    private HeroAdapter mHeroAdapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mRecyclerHero = findViewById(R.id.recyclerHero);
        mHeros = new ArrayList<>();
        createHeroList();
        mHeroAdapter = new HeroAdapter(this,mHeros);
        mRecyclerHero.setAdapter(mHeroAdapter);
        mRecyclerHero.setLayoutManager(new LinearLayoutManager(this));
    }

    private void createHeroList() {
        mHeros.add(new Hero("Thor",R.drawable.thor));
        mHeros.add(new Hero("IronMan",R.drawable.ironman));
        mHeros.add(new Hero("Hulk",R.drawable.hulk));
        mHeros.add(new Hero("CapTain America",R.drawable.cap));
        mHeros.add(new Hero("Thanos",R.drawable.thanos));

        mHeros.add(new Hero("Ant Man",R.drawable.antman));
        mHeros.add(new Hero("Black Panther",R.drawable.blackpather));
        mHeros.add(new Hero("Wanda Maximoff",R.drawable.wanda));
    }

}