package com.wprotheus.pmd2a04atv02.ui.optativa;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wprotheus.pmd2a04atv02.model.DataSetDisciplinas;
import com.wprotheus.pmd2a04atv02.model.Disciplina;

import java.util.List;

public class OptativaViewModel extends ViewModel {
    private final MutableLiveData<List<Disciplina>> mutableLiveData;

    public OptativaViewModel() {
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(DataSetDisciplinas.optativa());
    }

    public MutableLiveData<List<Disciplina>> getMutableLiveData() {
        return mutableLiveData;
    }
}