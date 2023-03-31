package com.example.scoperetail.repository;

import com.example.scoperetail.entity.Quikpak;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuikpakRepo extends JpaRepository<Quikpak,Long> {
}
