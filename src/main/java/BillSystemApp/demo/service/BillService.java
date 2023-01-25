package BillSystemApp.demo.service;

import BillSystemApp.demo.entity.BillModel;
import BillSystemApp.demo.repository.BillRepository;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class BillService {

    private BillRepository billRepository;

    public void addBill(BillModel billModel) {
        billRepository.save(billModel);
    }

    public void editBill(BillModel billModel) {
        billRepository.save(billModel);
    }

    public List<BillModel> getBills() {
        return billRepository.findAll();
    }

    public void deleteBill(Long meter) {
        billRepository.deleteById(meter);
    }
}
