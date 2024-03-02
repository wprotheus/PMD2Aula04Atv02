package com.wprotheus.pmd2a04atv02.ui.p3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.wprotheus.pmd2a04atv02.databinding.FragmentP3Binding;
import com.wprotheus.pmd2a04atv02.util.AdapterList;

public class P3Fragment extends Fragment {
    private FragmentP3Binding p3Binding;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {

        P3ViewModel p3ViewModel = new ViewModelProvider(this).get(P3ViewModel.class);
        p3Binding = FragmentP3Binding.inflate(inflater, container, false);
        View view = p3Binding.getRoot();

        final ListView listView = p3Binding.lvPthree;
        p3ViewModel.getMutableLiveData().observe(getViewLifecycleOwner(), disciplinas -> {
            AdapterList adapterList = new AdapterList(getContext(), disciplinas);
            listView.setAdapter(adapterList);
        });
        return view;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        p3Binding = null;
    }
}