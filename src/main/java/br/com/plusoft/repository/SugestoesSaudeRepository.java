package br.com.plusoft.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.plusoft.entity.SugestoesSaude;

@Repository
public interface SugestoesSaudeRepository extends JpaRepository<SugestoesSaude, Long> {

}