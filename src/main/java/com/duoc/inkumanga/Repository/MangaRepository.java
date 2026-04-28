package com.duoc.inkumanga.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.duoc.inkumanga.model.Manga;
@Repository
public interface MangaRepository extends JpaRepository<Manga, Integer> {
}