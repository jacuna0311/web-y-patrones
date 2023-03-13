package com.tienda_l.service.impl;

import com.tienda_l.domain.Cliente;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private Cliente clienteDao;
    
    @Override
    
    @Transactional (readOnly=true)
    public List<Cliente> getClientes() {
        return (List<Cliente>)clienteDao.findAll();
    }
    
}
