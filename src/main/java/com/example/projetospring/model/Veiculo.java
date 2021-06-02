package com.example.projetospring.model;

import javax.persistence.*;

@Entity
@Table(name = "veiculo")
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVeiculos;
    private String marca;
    @Column(name = "placa", unique = true)
    private String placaDoVeiculo;
    private int ano;

    @ManyToOne
    @JoinColumn(name = "veiculo")
    private Cliente cliente;

    public Veiculo () {
    }

    public Veiculo (int idVeiculos, String marca, String placaDoVeiculo, int ano, Cliente cliente) {
        this.idVeiculos = idVeiculos;
        this.marca = marca;
        this.placaDoVeiculo = placaDoVeiculo;
        this.ano = ano;
        this.cliente = cliente;
    }

    public int getIdVeiculos () {
        return idVeiculos;
    }

    public void setIdVeiculos (int idVeiculos) {
        this.idVeiculos = idVeiculos;
    }

    public String getMarca () {
        return marca;
    }

    public void setMarca (String marca) {
        this.marca = marca;
    }

    public String getPlacaDoVeiculo () {
        return placaDoVeiculo;
    }

    public void setPlacaDoVeiculo (String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public int getAno () {
        return ano;
    }

    public void setAno (int ano) {
        this.ano = ano;
    }

    public Cliente getCliente () {
        return cliente;
    }

    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString () {
        return "Veiculo{" +
                "idVeiculos=" + idVeiculos +
                ", marca='" + marca + '\'' +
                ", placaDoVeiculo='" + placaDoVeiculo + '\'' +
                ", ano=" + ano +
                ", cliente=" + cliente +
                '}';
    }
}
