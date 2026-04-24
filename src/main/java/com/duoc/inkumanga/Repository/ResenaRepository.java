package com.duoc.inkumanga.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.duoc.inkumanga.Model.Resena;

@Repository
public interface ResenaRepository extends JpaRepository<Resena, Integer> {

}
