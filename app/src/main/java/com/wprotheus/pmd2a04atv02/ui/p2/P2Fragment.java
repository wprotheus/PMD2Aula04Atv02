package com.wprotheus.pmd2a04atv02.ui.p2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv02.databinding.FragmentP2Binding;

public class P2Fragment extends Fragment {

    private FragmentP2Binding p2Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        P2ViewModel p2ViewModel = new ViewModelProvider(this).get(P2ViewModel.class);
        p2Binding = FragmentP2Binding.inflate(inflater, container, false);
        View view = p2Binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }

}