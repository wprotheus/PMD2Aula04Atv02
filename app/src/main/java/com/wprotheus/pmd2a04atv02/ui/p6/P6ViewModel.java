package com.wprotheus.pmd2a04atv02.ui.p6;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class P6ViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData;

    public P6ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("teste");
    }

    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }
}