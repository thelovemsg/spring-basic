package me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code.mydata.IDInfo;
import me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code.mydata.IDInfoService;

public class KoreaIdAndIdInfoService implements IDInfoService {

    KoreaIdService koreaIdService;

    public KoreaIdAndIdInfoService(KoreaIdService koreaIdService) {
        this.koreaIdService = koreaIdService;
    }

    @Override
    public IDInfo loadIDInfo(String name) {
        return new KoreaIdAndIDInfo(koreaIdService.findKoreaIdByName(name));
    }
}
