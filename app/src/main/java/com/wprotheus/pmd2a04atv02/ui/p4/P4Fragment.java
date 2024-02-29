package com.wprotheus.pmd2a04atv02.ui.p4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv02.databinding.FragmentP4Binding;

public class P4Fragment extends Fragment {

    private FragmentP4Binding p4Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        P4ViewModel p4ViewModel = new ViewModelProvider(this).get(P4ViewModel.class);
        p4Binding = FragmentP4Binding.inflate(inflater, container, false);
        View view = p4Binding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }
}