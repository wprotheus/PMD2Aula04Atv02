package com.wprotheus.pmd2a04atv02.ui.p3;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class P3ViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData;

    public P3ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("teste");
    }

    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }
}