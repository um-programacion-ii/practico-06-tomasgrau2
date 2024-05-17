package com.tomas_grau.Dao;

import com.tomas_grau.Entidades.Medicamento;

import java.util.HashMap;

public class MedicamentoDao {

    private HashMap<Integer, Medicamento> medicamentos = new HashMap<Integer, Medicamento>();

    private static MedicamentoDao instance;

    private MedicamentoDao() {
    }

    public static MedicamentoDao getInstance() {
        if (instance == null) {
            instance = new MedicamentoDao();
        }
        return instance;
    }

    public void create(int medicamento_id, Medicamento medicamento) {
        medicamentos.put(medicamento_id, medicamento);
    }

    public void update(int medicamento_id, Medicamento medicamento) {
        if (medicamentos.get(medicamento_id) == null) {
            medicamentos.put(medicamento_id, medicamento);
        } else {
            System.out.println("Este id ya es utilizado por otro medicamento");
        }
    }

    public boolean get_one(String medicamento_nombre) {
        return medicamentos.containsValue(medicamento_nombre);
    }

    public HashMap<Integer, Medicamento> get_all() {
        return medicamentos;
    }

    public void delete(int medicamento_id) {
        medicamentos.remove(medicamento_id);
    }
}
