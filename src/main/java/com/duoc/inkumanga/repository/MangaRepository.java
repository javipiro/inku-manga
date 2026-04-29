package com.duoc.inkumanga.repository;

import org.springframework.stereotype.Repository;

import com.duoc.inkumanga.model.Manga;

import org.springframework.data.jpa.repository.JpaRepository;
@Repository
public interface MangaRepository extends JpaRepository<Manga, Integer> {
}