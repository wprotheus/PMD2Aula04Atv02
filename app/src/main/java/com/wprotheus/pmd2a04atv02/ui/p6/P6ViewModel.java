package com.wprotheus.pmd2a04atv02.ui.p6;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv02.model.DataSetDisciplinas;
import com.wprotheus.pmd2a04atv02.model.Disciplina;

import java.util.List;

public class P6ViewModel extends ViewModel {
    private final MutableLiveData<List<Disciplina>> mutableLiveData;

    public P6ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(DataSetDisciplinas._6Periodo());
    }

    public MutableLiveData<List<Disciplina>> getMutableLiveData() {
        return mutableLiveData;
    }
}