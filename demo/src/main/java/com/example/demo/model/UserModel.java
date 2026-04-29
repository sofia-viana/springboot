package com.example.demo.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // já sobe como uma tabela para o banco de dados
@NoArgsConstructor  // cria automaticamente os construtores
@AllArgsConstructor
@Getter // cria automaticamente os getters
@Setter // cria automaticamente os setters

public class UserModel {

    @Id
    @GeneratedValue
    long id;
    String username;
    String password;
    int age;
    
}
