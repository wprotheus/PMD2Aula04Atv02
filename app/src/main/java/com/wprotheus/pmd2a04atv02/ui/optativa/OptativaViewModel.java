package com.wprotheus.pmd2a04atv02.ui.optativa;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class OptativaViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData;

    public OptativaViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("teste");
    }

    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }
}