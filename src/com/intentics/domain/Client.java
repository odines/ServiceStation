package com.intentics.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;

@Entity
@Table(name = "Clients")
public class Client {
    @Column(name = "idClient")
    @GeneratedValue
    private Integer idClient;

    

}
