/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package local.kaue.garagem.service;

import java.util.List;
import local.kaue.garagem.entities.Veiculos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import local.kaue.garagem.repositories.GaragemRepository;

/**
 *
 * @author sesideva
 */
@Service
public class GaragemService {
    @Autowired
    private GaragemRepository garagemRepository;
    
    public  List<Veiculos> findAll(){
        
        List<Veiculos> result  = garagemRepository.findAll();
        return result;
    }
}
