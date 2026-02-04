package com.example.myapplication;

import android.os.Bundle;
import android.view.*;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

public class EntertainmentFragment extends Fragment {

    String[] news = {
            "New blockbuster movie released",
            "Music awards winners announced",
            "Famous actor signs new series",
            "Streaming platform releases new shows"
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
