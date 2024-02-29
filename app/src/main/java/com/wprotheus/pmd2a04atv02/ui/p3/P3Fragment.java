package com.wprotheus.pmd2a04atv02.ui.p3;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wprotheus.pmd2a04atv02.databinding.FragmentP1Binding;
import com.wprotheus.pmd2a04atv02.databinding.FragmentP3Binding;
import com.wprotheus.pmd2a04atv02.ui.p1.P1ViewModel;

public class P3Fragment extends Fragment {

    private FragmentP3Binding p3Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        P3ViewModel p3ViewModel = new ViewModelProvider(this).get(P3ViewModel.class);
        p3Binding = FragmentP3Binding.inflate(inflater, container, false);
        View view = p3Binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }

}