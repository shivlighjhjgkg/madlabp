package com.example.myapplication;

import android.os.Bundle;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class TopStoriesFragment extends Fragment {

    String[] news = {
            "Government announces new AI policy",
            "Stock market hits record high",
            "Space agency plans Mars mission",
            "New education reforms introduced"
    };

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_news, container, false);

        ListView listView = view.findViewById(R.id.newsList);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                getContext(),
                R.layout.news_item,
                R.id.newsText,
                news
        );


        listView.setAdapter(adapter);
        listView.setSelector(android.R.color.transparent);

        return view;
    }
}
