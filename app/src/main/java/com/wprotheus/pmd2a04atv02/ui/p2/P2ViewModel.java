package com.wprotheus.pmd2a04atv02.ui.p2;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv02.model.DataSetDisciplinas;
import com.wprotheus.pmd2a04atv02.model.Disciplina;

import java.util.List;

public class P2ViewModel extends ViewModel {
    private final MutableLiveData<List<Disciplina>> mutableLiveData;

    public P2ViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(DataSetDisciplinas._2Periodo());
    }

    public MutableLiveData<List<Disciplina>> getMutableLiveData() {
        return mutableLiveData;
    }
}