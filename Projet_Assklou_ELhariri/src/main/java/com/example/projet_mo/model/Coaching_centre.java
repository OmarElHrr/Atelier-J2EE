package com.example.projet_mo.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "Coaching_centre")
@Data
@NoArgsConstructor
public class Coaching_centre extends Batiment{
    @Column
    private String siteWeb;
    @ElementCollection
    private List<String> services;
}
