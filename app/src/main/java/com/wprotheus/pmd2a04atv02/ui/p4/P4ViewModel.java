package com.wprotheus.pmd2a04atv02.ui.p4;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class P4ViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData;

    public P4ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("teste");
    }

    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }
}