package com.example.projet_mo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Cafeteria")
@Data
@NoArgsConstructor
public class Cafeteria extends Batiment{
}
