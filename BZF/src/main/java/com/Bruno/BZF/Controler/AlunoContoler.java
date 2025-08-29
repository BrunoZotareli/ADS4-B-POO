package com.Bruno.BZF.Controler;

import com.Bruno.BZF.Model.AlunoEntity;
import com.Bruno.BZF.Repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoContoler {

    @Autowired
    private AlunoRepository alunoRepository;

    @GetMapping
    public List<AlunoEntity> getAllAlunos(){
        return AlunoRepository.findAll();
    }
}
