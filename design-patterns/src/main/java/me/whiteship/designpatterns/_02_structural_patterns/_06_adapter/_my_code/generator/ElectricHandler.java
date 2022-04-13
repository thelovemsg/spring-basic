package me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code.generator;

public class ElectricHandler {

    ElectricDetailsService electricDetailsService;

    public ElectricHandler(ElectricDetailsService electricDetailsService) {
        this.electricDetailsService = electricDetailsService;
    }

    public String generateElectric(String code, String type) {
        ElectricDetails electricDetails = electricDetailsService.generateElectric(code);
        if (electricDetails.getElectricCode().equals(code)){
            return electricDetails.getElectricType();
        } else{
            throw new IllegalArgumentException();
        }
    }

}
