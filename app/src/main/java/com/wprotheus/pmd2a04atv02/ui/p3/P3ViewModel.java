package com.wprotheus.pmd2a04atv02.ui.p3;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv02.model.DataSetDisciplinas;
import com.wprotheus.pmd2a04atv02.model.Disciplina;

import java.util.List;

public class P3ViewModel extends ViewModel {
    private final MutableLiveData<List<Disciplina>> mutableLiveData;

    public P3ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(DataSetDisciplinas._3Periodo());
    }

    public MutableLiveData<List<Disciplina>> getMutableLiveData() {
        return mutableLiveData;
    }
}