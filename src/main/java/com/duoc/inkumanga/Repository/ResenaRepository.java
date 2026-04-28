package com.duoc.inkumanga.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.duoc.inkumanga.model.Resena;

@Repository
public interface ResenaRepository extends JpaRepository<Resena, Integer> {

}
