package com.example.springbootapi.Controller;

import com.example.springbootapi.Entity.ChuyenBay;
import com.example.springbootapi.Entity.MayBay;
import com.example.springbootapi.Service.ChuyenBayRepository;
import com.example.springbootapi.Service.MayBayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    ChuyenBayRepository chuyenBayRepository;

    @Autowired
    MayBayRepository mayBayRepository;
    @RequestMapping(value = "/timchuyenbayboigaden/{gaden}", method = RequestMethod.GET)
    public List<ChuyenBay> timChuyenBayBoiGaDen(@PathVariable("gaden") String gaDen){
        List<ChuyenBay> chuyenBays = chuyenBayRepository.findChuyenBayByGaDen(gaDen);
        if(chuyenBays == null){
            ResponseEntity.notFound().build();
        }
        return chuyenBays;
    }

    @RequestMapping(value = "/maybaycotambaylonhon10000", method = RequestMethod.GET)
    public List<String> mayBayCoTamBayLonHon10000(){
        List<String> mayBays = mayBayRepository.findLoaiMayBayByTamBay();
        if(mayBays == null){
            ResponseEntity.notFound().build();
        }
        return mayBays;
    }
}
