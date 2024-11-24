package com.example.sistemadeportaria.model;

import com.example.sistemadeportaria.Enums.Marca;
import com.example.sistemadeportaria.Enums.Modelo;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Veiculos {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nomeMotorista")
    private String nome;

    @Column(name = "placa")
    private String placa;

    @Column(name = "modelo")
    private Modelo modelo;

    @Column(name = "marca")
    private Marca marca;

    @Column(name = "horaEntrada")
    private LocalDateTime dataHoraEntrada;

    @Column(name = "horaSaida")
    private LocalDateTime dataHoraSaida;

    public Veiculos() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }
}
