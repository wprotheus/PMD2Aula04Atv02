package com.wprotheus.pmd2a04atv02.ui.p2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class P2ViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData;

    public P2ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("teste");
    }

    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }
}