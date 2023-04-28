package com.example.projet_mo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Bibliotheque")
@Data
@NoArgsConstructor
public class Bibliotheque extends Batiment{
    @Column
    private String nomcomplait;
    @Column
    private String siteWeb;

}
