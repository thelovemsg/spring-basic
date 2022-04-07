package me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code.mydata;

public class IDInfoHandler {

    IDInfoService idInfoService;

    public IDInfoHandler(IDInfoService idInfoService) {
        this.idInfoService = idInfoService;
    }

    public String findUser(String name, String country){
        IDInfo idInfo = idInfoService.loadIDInfo(name);
        if (idInfo.getCountry().equals(country)){
            return idInfo.getName();
        } else{
            throw new IllegalArgumentException();
        }
    }
}
