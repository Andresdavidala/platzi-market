package com.platzimarket.persistence.crud;

import com.platzimarket.persistence.ProductoRepository;
import com.platzimarket.persistence.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto, Integer> {//recibe dos parametros "la tabla" y "el tipo de la llave primaria"



    //querymethos
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria);
    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado);

//    Producto findProductoByIdCategoria(int idCategoria);

}
