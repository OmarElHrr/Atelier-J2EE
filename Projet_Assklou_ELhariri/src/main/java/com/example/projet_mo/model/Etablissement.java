package com.example.projet_mo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Etablissement")
@Data
@NoArgsConstructor
public class Etablissement  extends  Batiment{
    @Column
    private String nomcomplait;
    @Column
    private String type;
    @Column
    private String siteWeb;
    @OneToMany(mappedBy = "etablissement")
    private List<Formation> formations;
    @OneToMany(mappedBy = "etablissement")
    private List<Etudiant> etudiants;


}
