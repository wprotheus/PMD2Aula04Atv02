package com.wprotheus.pmd2a04atv02.ui.p6;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wprotheus.pmd2a04atv02.databinding.FragmentP5Binding;
import com.wprotheus.pmd2a04atv02.databinding.FragmentP6Binding;
import com.wprotheus.pmd2a04atv02.ui.p5.P5ViewModel;

public class P6Fragment extends Fragment {

    private FragmentP6Binding p6Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        P6ViewModel p5ViewModel = new ViewModelProvider(this).get(P6ViewModel.class);
        p6Binding = FragmentP6Binding.inflate(inflater, container, false);
        View view = p6Binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }

}