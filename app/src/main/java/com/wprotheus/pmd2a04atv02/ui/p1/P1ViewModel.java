package com.wprotheus.pmd2a04atv02.ui.p1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class P1ViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData;

    public P1ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("teste");
    }

    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }
}