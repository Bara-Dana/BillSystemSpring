package BillSystemApp.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "meter_info")
public class MeterInfoModel {

    @Id
    private Long meter;

    private String meterLocation;
    private String meterType;
    private Long phaseCode;
    private String billType;
    private Integer days;

    public MeterInfoModel() {
    }

    public Long getMeter() {
        return meter;
    }

    public void setMeter(Long meter) {
        this.meter = meter;
    }

    public String getMeterLocation() {
        return meterLocation;
    }

    public void setMeterLocation(String meterLocation) {
        this.meterLocation = meterLocation;
    }

    public String getMeterType() {
        return meterType;
    }

    public void setMeterType(String meterType) {
        this.meterType = meterType;
    }

    public Long getPhaseCode() {
        return phaseCode;
    }

    public void setPhaseCode(Long phaseCode) {
        this.phaseCode = phaseCode;
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType;
    }

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }
}
