package me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code;

import me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code.mydata.IDInfo;

public class KoreaIdAndIDInfo implements IDInfo {

    private KoreaId koreaId;

    public KoreaIdAndIDInfo(KoreaId koreaId) {
        this.koreaId = koreaId;
    }

    @Override
    public String getName() {
        return koreaId.getKoreanName();
    }

    @Override
    public String getCountry() {
        return koreaId.getCountry();
    }
}
