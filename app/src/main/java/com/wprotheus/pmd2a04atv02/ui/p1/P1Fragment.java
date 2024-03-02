package com.wprotheus.pmd2a04atv02.ui.p1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv02.databinding.FragmentP1Binding;
import com.wprotheus.pmd2a04atv02.util.AdapterList;

public class P1Fragment extends Fragment {
    private FragmentP1Binding p1Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        P1ViewModel p1ViewModel = new ViewModelProvider(this).get(P1ViewModel.class);
        p1Binding = FragmentP1Binding.inflate(inflater, container, false);
        View view = p1Binding.getRoot();

        final ListView listView = p1Binding.lvPone;
        p1ViewModel.getMutableLiveData().observe(getViewLifecycleOwner(), disciplinas -> {
            AdapterList adapterList = new AdapterList(getContext(), disciplinas);
            listView.setAdapter(adapterList);
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        p1Binding = null;
    }
}