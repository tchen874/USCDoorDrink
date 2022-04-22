package com.example.uscdoordrink;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link frag1_overview#newInstance} factory method to
 * create an instance of this fragment.
 */
public class frag1_overview extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "intro";
    private static final String ARG_PARAM2 = "directions";

    // TODO: Rename and change types of parameters
    private String intro;
    private String directions;

    public frag1_overview() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param intro Parameter 1.
     * @param directions Parameter 2.
     * @return A new instance of fragment frag1_overview.
     */
    // TODO: Rename and change types and number of parameters
    public static frag1_overview newInstance(String intro, String directions) {
        frag1_overview fragment = new frag1_overview();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, intro);
        args.putString(ARG_PARAM2, directions);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            intro = getArguments().getString(ARG_PARAM1);
            directions = getArguments().getString(ARG_PARAM2);
        }
        //just display text welcoming the user
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag1_overview, container, false);
    }
}