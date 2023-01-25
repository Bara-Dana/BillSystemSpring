package BillSystemApp.demo.Controller;

import BillSystemApp.demo.Dto.BillDto;
import BillSystemApp.demo.entity.BillModel;
import BillSystemApp.demo.entity.UserModel;
import BillSystemApp.demo.service.BillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BillController {
    @Autowired
    BillService billService;

    @PostMapping("/bill/addBill")
        public ResponseEntity addBill(@RequestBody BillDto billDto){
        BillModel newBill = new BillModel();
        newBill.setMonth(billDto.getMonth());
        newBill.setUnits(billDto.getUnits());
        newBill.setTotal_bill(billDto.getTotal_bill());
        newBill.setStatus(billDto.getStatus());
        billService.addBill(newBill);
        return new ResponseEntity(newBill, HttpStatus.OK);
    }
    @PutMapping("/editBill/{meter}")
    public ResponseEntity editBill(@PathVariable("meter") Long meter,@RequestBody BillDto billDto){
         BillModel bill = new BillModel();
         bill.setMeter(meter);
         bill.setStatus(bill.getStatus());
         bill.setMonth(bill.getMonth());
         bill.setUnits(billDto.getUnits());
         bill.setTotal_bill(billDto.getTotal_bill());
         billService.editBill(bill);
         return new ResponseEntity(bill, HttpStatus.OK);
    }
    @GetMapping("/bill/getBill")
    public ResponseEntity getBill(){
        List<BillModel> bills = billService.getBills();
        return new ResponseEntity(bills, HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity deleteBill(@PathVariable("meter") Long meter){
        billService.deleteBill(meter);
        return new ResponseEntity (HttpStatus.OK);
    }

}
