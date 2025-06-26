/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.farmacia.service.impl;

import com.farmacia.dao.CategoriaDao;
import com.farmacia.domain.Categoria;
import com.farmacia.service.CategoriaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    @Autowired
    private CategoriaDao categoriaDao;

    /*@Override
    @Transactional(readOnly=true)
    public List<Categoria> getCategorias(String nombre) {
        var lista=categoriaDao.findAll();
        if (nombre) {
           lista.removeIf(e -> !e.isNombre());
        }
        return lista;
    }*/
}
 
