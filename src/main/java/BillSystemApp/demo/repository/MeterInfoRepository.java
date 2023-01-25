package BillSystemApp.demo.repository;

import BillSystemApp.demo.entity.MeterInfoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MeterInfoRepository extends JpaRepository<MeterInfoModel, Long> {
}
