package local.kaue.garagem.controller;


import java.util.List;
import local.kaue.garagem.entities.Veiculos;
import local.kaue.garagem.service.GaragemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GaragemController {
    
    @Autowired
    private GaragemService garagemService;
    // endpoint / garagem/ veiculos eu acho
    // retorna os dados do banco
    
     /**
     * *
     * * Endpoint / garagem /forsale Retorna todos os aeroportos da base de
     * dados
     *
     * @return
     */

    @GetMapping("/forsale")
    public List<Veiculos> findAll(){
        List<Veiculos> result = garagemService.findAll();
        return result;
    }
}
