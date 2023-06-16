package com.example.cryptovalue.watchlist;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cryptovalue.R;
import com.example.cryptovalue.databinding.FragmentWatchListBinding;


public class WatchListFragment extends Fragment {

    FragmentWatchListBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentWatchListBinding.inflate(inflater);
        return binding.getRoot();
    }

}