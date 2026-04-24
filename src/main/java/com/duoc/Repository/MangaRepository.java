package com.duoc.Repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.duoc.inkumanga.Model.Manga;
@Repository
public interface MangaRepository extends JpaRepository<Manga, Integer> {
}
