package BillSystemApp.demo.Dto;

public class BillDto {
    private Long meter;

    private String month;
    private String units;
    private String total_bill;
    private String status;

    public Long getMeter() {
        return meter;
    }

    public void setMeter(Long meter) {
        this.meter = meter;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public String getTotal_bill() {
        return total_bill;
    }

    public void setTotal_bill(String total_bill) {
        this.total_bill = total_bill;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
