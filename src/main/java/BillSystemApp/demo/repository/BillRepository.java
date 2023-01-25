package BillSystemApp.demo.repository;

import BillSystemApp.demo.entity.BillModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<BillModel, Long> {
}
