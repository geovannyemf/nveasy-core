package app.nveasy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.nveasy.entity.Investment;

@Repository
public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
