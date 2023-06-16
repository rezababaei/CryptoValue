package com.example.cryptovalue.market;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cryptovalue.R;
import com.example.cryptovalue.databinding.FragmentMarketBinding;

public class MarketFragment extends Fragment {

    FragmentMarketBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentMarketBinding.inflate(inflater);
        return binding.getRoot();
    }

}