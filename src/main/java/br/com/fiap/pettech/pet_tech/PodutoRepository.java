package br.com.fiap.pettech.pet_tech;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PodutoRepository extends JpaRepository<Produto, UUID> {
}
