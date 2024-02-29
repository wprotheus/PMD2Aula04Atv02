package com.wprotheus.pmd2a04atv02.ui.p5;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class P5ViewModel extends ViewModel {
    private final MutableLiveData<String> mutableLiveData;

    public P5ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue("teste");
    }

    public MutableLiveData<String> getMutableLiveData() {
        return mutableLiveData;
    }
}