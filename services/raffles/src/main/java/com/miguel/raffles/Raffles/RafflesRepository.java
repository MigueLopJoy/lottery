package com.miguel.raffles.Raffles;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RafflesRepository extends JpaRepository<Raffle, Integer> {
}
