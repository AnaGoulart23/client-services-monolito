package com.br.serviceclient.repository;

import com.br.serviceclient.domain.ClienteDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDomain, UUID> {
}