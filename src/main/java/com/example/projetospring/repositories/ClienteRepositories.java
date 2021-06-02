package com.example.projetospring.repositories;

import com.example.projetospring.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ClienteRepositories extends JpaRepository<Cliente , Integer>{

}
