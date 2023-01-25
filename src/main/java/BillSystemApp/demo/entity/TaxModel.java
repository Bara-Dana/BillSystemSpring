package BillSystemApp.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "tax")
public class TaxModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private int cost_per_unit;
    private int meter_rent;
    private int service_charge;
    private int service_tax;
    private int swatch_bharat_chess;
    private int fixed_tax;

    public TaxModel() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCost_per_unit() {
        return cost_per_unit;
    }

    public void setCost_per_unit(int cost_per_unit) {
        this.cost_per_unit = cost_per_unit;
    }

    public int getMeter_rent() {
        return meter_rent;
    }

    public void setMeter_rent(int meter_rent) {
        this.meter_rent = meter_rent;
    }

    public int getService_charge() {
        return service_charge;
    }

    public void setService_charge(int service_charge) {
        this.service_charge = service_charge;
    }

    public int getService_tax() {
        return service_tax;
    }

    public void setService_tax(int service_tax) {
        this.service_tax = service_tax;
    }

    public int getSwatch_bharat_chess() {
        return swatch_bharat_chess;
    }

    public void setSwatch_bharat_chess(int swatch_bharat_chess) {
        this.swatch_bharat_chess = swatch_bharat_chess;
    }

    public int getFixed_tax() {
        return fixed_tax;
    }

    public void setFixed_tax(int fixed_tax) {
        this.fixed_tax = fixed_tax;
    }
}
