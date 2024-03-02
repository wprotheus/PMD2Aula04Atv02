package com.wprotheus.pmd2a04atv02.ui.p1;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv02.model.DataSetDisciplinas;
import com.wprotheus.pmd2a04atv02.model.Disciplina;

import java.util.List;

public class P1ViewModel extends ViewModel {
    private final MutableLiveData<List<Disciplina>> mutableLiveData;

    public P1ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(DataSetDisciplinas._1Periodo());
    }

    public MutableLiveData<List<Disciplina>> getMutableLiveData() {
        return mutableLiveData;
    }
}