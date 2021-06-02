package com.example.projetospring.repositories;

import com.example.projetospring.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VeiculoRepositories extends JpaRepository<Veiculo, Integer> {
}
