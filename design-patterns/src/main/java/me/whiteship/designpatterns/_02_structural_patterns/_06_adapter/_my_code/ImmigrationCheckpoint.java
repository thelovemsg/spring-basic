package me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code.mydata.IDInfoHandler;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code.mydata.IDInfoService;

public class ImmigrationCheckpoint {

    public static void main(String[] args) {
        KoreaIdService koreaIdService = new KoreaIdService();
        IDInfoService idInfoService = new KoreaIdAndIdInfoService(koreaIdService);
        IDInfoHandler idInfoHandler = new IDInfoHandler(idInfoService);
        String user = idInfoHandler.findUser("bangal", "bangal");
        System.out.println("user = " + user);
    }

}
