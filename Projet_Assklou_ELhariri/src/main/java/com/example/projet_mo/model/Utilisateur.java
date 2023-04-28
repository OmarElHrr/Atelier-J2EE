package com.example.projet_mo.model;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Entity
@Table(name = "utilisateur")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type_utilisateur", discriminatorType = DiscriminatorType.STRING)
@Data
@NoArgsConstructor
public class Utilisateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;
    @Column
    private String nom;
    @Column
    private String prenom;
    @Column
    private String nationalite;
    @Column
    private String genre;
    @Column
    @Temporal(TemporalType.DATE)
    private Date date_de_naissance;
    @Column
    @Temporal(TemporalType.DATE)
    private Date date_inscription;
    @Column
    private String telephone;
    @Column
    private String email;
    @Column
    private String adresse;

    @OneToOne(mappedBy = "utilisateur")
    private Log log;

    @OneToMany(mappedBy = "utilisateur")
    private List<Message> messages;

}
