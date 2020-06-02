package com.example.busanapp.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.busanapp.R;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {
    private ImageAdapter adapter = new ImageAdapter();
    private RecyclerView recyclerView;
    //추가
    List<Course> first_Course;


    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        /*LinearLayoutManager horizonalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        recyclerView.setLayoutManager(horizonalLayoutManager);
        recyclerView.setAdapter(adapter);

        adapter.setItems(new ImageData().getItems());*/


        //course

        first_Course = new ArrayList<>();
        first_Course.add(new Course("2박 3일에 완성하는 부산 완전정복", "2박 3일", "내용", R.drawable.two_three_first));
        first_Course.add(new Course("부산 낭만카페 35선 1편", "카페 투어", "내용", R.drawable.cafe1_1));


        RecyclerView myrv = view.findViewById(R.id.recyclerView);

        RecyclerView.Adapter myAdapter = new RecyclerViewAdapter(getActivity(), first_Course);

        //myrv.setLayoutManager(new GridLayoutManager(this, 3));

        // 가로 레이아웃
        LinearLayoutManager horizontalLayoutManager = new LinearLayoutManager(getActivity(), RecyclerView.HORIZONTAL, false);

        // 레이아웃 매니저 연결
        myrv.setLayoutManager(horizontalLayoutManager);

        myrv.setAdapter(myAdapter);

        return view;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
    }

}

