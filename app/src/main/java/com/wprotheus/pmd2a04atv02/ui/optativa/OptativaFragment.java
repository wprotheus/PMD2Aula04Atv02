package com.wprotheus.pmd2a04atv02.ui.optativa;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv02.databinding.FragmentOptativaBinding;

public class OptativaFragment extends Fragment {

    private FragmentOptativaBinding optativaBinding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        OptativaViewModel optativaViewModel = new ViewModelProvider(this).get(OptativaViewModel.class);
        optativaBinding = FragmentOptativaBinding.inflate(inflater, container, false);
        View view = optativaBinding.getRoot();

//        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), textView::setText);

        return view;
    }

}