package com.tomas_grau.Servicios;

import com.tomas_grau.Dao.MedicamentoDao;
import com.tomas_grau.Dao.RecetaDao;
import com.tomas_grau.Entidades.Receta;

import java.util.List;

public class GestionFarmaciaService {

    private RecetaDao recetaDao = RecetaDao.getInstance();
    private MedicamentoDao medicamentoDao = MedicamentoDao.getInstance();

    public GestionFarmaciaService() {
    }

    public void comprar_medicamentos(Receta receta) {
        // Chequear el stock de los medicamentos
        List<String> lista_medicamentos = receta.getMedicamentos();
        int cantidad_receta = lista_medicamentos.size();
        int cantidad_disponible = 0;

        for (String medicamento : lista_medicamentos) {
            if (medicamentoDao.get_one(medicamento)){
                cantidad_disponible++;
            }
            else {
                pedido_drogueria(medicamento);
            }
        }
        if (cantidad_receta == cantidad_disponible) {
            System.out.println("Todos los medicamentos de la receta estan disponibles");
        }
        else{
            System.out.println("No se consiguieron todos los medicamentos de la receta");
        }

    }

    public void pedido_drogueria(String medicamento){
        medicamentoDao
    }
}
