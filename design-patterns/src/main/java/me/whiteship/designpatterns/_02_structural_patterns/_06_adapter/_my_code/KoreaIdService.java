package me.whiteship.designpatterns._02_structural_patterns._06_adapter._my_code;

public class KoreaIdService {

    public KoreaId findKoreaIdByName(String name){
        KoreaId koreaId = new KoreaId();
        koreaId.setKoreanName(name);
        koreaId.setCountry(name);
        koreaId.setAddress(name);
        return koreaId;
    }

    public void updateKoreaId(KoreaId koreaId){

    }
    public void makeKoreaId(KoreaId koreaId){

    }

}
