package com.wprotheus.pmd2a04atv02.util;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.wprotheus.pmd2a04atv02.R;
import com.wprotheus.pmd2a04atv02.model.Disciplina;

import java.util.List;

public class AdapterList extends BaseAdapter {
    private LayoutInflater inflater;
    private List<Disciplina> disciplinaList;

    public AdapterList(Context context, List<Disciplina> disciplinaList) {
        this.inflater = LayoutInflater.from(context);
        this.disciplinaList = disciplinaList;
    }

    @Override
    public int getCount() {
        return disciplinaList.size();
    }

    @Override
    public Object getItem(int position) {
        return disciplinaList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Disciplina disciplina = disciplinaList.get(position);

        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_layout, null);

        ((ImageView) convertView.findViewById(R.id.ivSentimento)).setImageResource(disciplina.getImage());
        ((TextView) convertView.findViewById(R.id.tvDisciplina)).setText(disciplina.getName());
        return convertView;
    }
}