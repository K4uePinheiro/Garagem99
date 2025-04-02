/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package local.kaue.garagem.repositories;

import local.kaue.garagem.entities.Veiculos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author sesideva
 */
public interface GaragemRepository extends JpaRepository<Veiculos, Long>{
    
    
}
