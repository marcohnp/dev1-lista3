package com.marcohnp.dev1lista3.repository;

import com.marcohnp.dev1lista3.entity.ContatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<ContatoEntity, Integer> {
}
