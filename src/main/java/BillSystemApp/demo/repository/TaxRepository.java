package BillSystemApp.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import BillSystemApp.demo.entity.TaxModel;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxRepository extends JpaRepository<TaxModel, Long> {
}
