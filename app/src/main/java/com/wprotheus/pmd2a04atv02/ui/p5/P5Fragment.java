package com.wprotheus.pmd2a04atv02.ui.p5;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv02.databinding.FragmentP5Binding;

public class P5Fragment extends Fragment {

    private FragmentP5Binding p5Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        P5ViewModel p5ViewModel = new ViewModelProvider(this).get(P5ViewModel.class);
        p5Binding = FragmentP5Binding.inflate(inflater, container, false);
        View view = p5Binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }
}