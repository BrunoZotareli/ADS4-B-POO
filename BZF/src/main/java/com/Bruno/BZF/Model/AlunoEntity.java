package com.Bruno.BZF.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class AlunoEntity {
@Id
    @GeneratedValue()
    private long id;

}
