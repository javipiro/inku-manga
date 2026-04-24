package com.duoc.inkumanga.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.duoc.inkumanga.Model.Autor;
@Repository
public interface AutorRepository extends JpaRepository<Autor, Integer> {

}
