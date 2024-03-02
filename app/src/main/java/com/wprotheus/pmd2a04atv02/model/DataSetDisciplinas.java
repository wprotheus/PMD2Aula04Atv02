package com.wprotheus.pmd2a04atv02.model;

import androidx.annotation.NonNull;

import com.wprotheus.pmd2a04atv02.R;

import java.util.ArrayList;
import java.util.List;

public class DataSetDisciplinas {
    @NonNull
    public static List<Disciplina> _1Periodo() {
        List<Disciplina> _1Periodo = new ArrayList<>();
        _1Periodo.add(new Disciplina(R.drawable.thinking, "Fundamentos de Redes de Computadores"));
        _1Periodo.add(new Disciplina(R.drawable.happy, "Informática Instrumental"));
        _1Periodo.add(new Disciplina(R.drawable.happy, "Inglês Técnico"));
        _1Periodo.add(new Disciplina(R.drawable.happy, "Introdução À Computação"));
        _1Periodo.add(new Disciplina(R.drawable.happy, "Introdução À Lógica"));
        _1Periodo.add(new Disciplina(R.drawable.happy, "Tendências Tecnológicas Para O Mercado de Ti"));

        return _1Periodo;
    }

    @NonNull
    public static List<Disciplina> _2Periodo() {
        List<Disciplina> _2Periodo = new ArrayList<>();
        _2Periodo.add(new Disciplina(R.drawable.thinking, "Análise de Sistemas"));
        _2Periodo.add(new Disciplina(R.drawable.happy, "Fundamentos e Projeto de Banco de Dados"));
        _2Periodo.add(new Disciplina(R.drawable.happy, "Introdução À Programação"));
        _2Periodo.add(new Disciplina(R.drawable.tired, "Programação Básica Para Web"));
        _2Periodo.add(new Disciplina(R.drawable.thinking, "Programação Orientada À Objetos"));
        return _2Periodo;
    }

    @NonNull
    public static List<Disciplina> _3Periodo() {
        List<Disciplina> _3Periodo = new ArrayList<>();
        _3Periodo.add(new Disciplina(R.drawable.thinking, "Administração de Sistemas Proprietários"));
        _3Periodo.add(new Disciplina(R.drawable.tired, "Gerenciamento de Dados Para Web"));
        _3Periodo.add(new Disciplina(R.drawable.thinking, "Introdução À Conectividade"));
        _3Periodo.add(new Disciplina(R.drawable.happy, "Programação Para Banco de Dados"));
        _3Periodo.add(new Disciplina(R.drawable.thinking, "Programação Para Web Designers"));
        _3Periodo.add(new Disciplina(R.drawable.tired, "Programação Para Web I"));
        return _3Periodo;
    }

    @NonNull
    public static List<Disciplina> _4Periodo() {
        List<Disciplina> _4Periodo = new ArrayList<>();
        _4Periodo.add(new Disciplina(R.drawable.happy, "Programação Para Web II"));
        _4Periodo.add(new Disciplina(R.drawable.thinking, "Projeto de Interface Web"));
        _4Periodo.add(new Disciplina(R.drawable.thinking, "Projeto de Sistemas"));
        _4Periodo.add(new Disciplina(R.drawable.thinking, "Sistemas Distribuídos e Soa"));
        _4Periodo.add(new Disciplina(R.drawable.thinking, "Testes de Software"));
        return _4Periodo;
    }

    @NonNull
    public static List<Disciplina> _5Periodo() {
        List<Disciplina> _5Periodo = new ArrayList<>();
        _5Periodo.add(new Disciplina(R.drawable.happy, "Administração de Banco de Dados"));
        _5Periodo.add(new Disciplina(R.drawable.happy, "Infraestrutura Para Sistemas Web"));
        _5Periodo.add(new Disciplina(R.drawable.happy, "Metodologias de Desenvolvimento"));
        _5Periodo.add(new Disciplina(R.drawable.happy, "Novas Tecnologias em Banco de Dados"));
        _5Periodo.add(new Disciplina(R.drawable.thinking, "Programação Para Dispositivos Móveis I"));
        _5Periodo.add(new Disciplina(R.drawable.tired, "Segurança de Sistemas"));
        return _5Periodo;
    }

    @NonNull
    public static List<Disciplina> _6Periodo() {
        List<Disciplina> _6Periodo = new ArrayList<>();
        _6Periodo.add(new Disciplina(R.drawable.happy, "Gerência de Configuração"));
        _6Periodo.add(new Disciplina(R.drawable.thinking, "Novas Tecnologias em Desenvolvimento Para Web"));
        _6Periodo.add(new Disciplina(R.drawable.thinking, "Padrões de Projeto"));
        _6Periodo.add(new Disciplina(R.drawable.tired, "Programação Para Dispositivos Móveis II"));
        return _6Periodo;
    }

    @NonNull
    public static List<Disciplina> optativa() {
        List<Disciplina> optativa = new ArrayList<>();
        optativa.add(new Disciplina(R.drawable.happy, "Direito Aplicado À Informática"));
        return optativa;
    }
}