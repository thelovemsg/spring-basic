package twosixtwo.section4.parity;

public class Parity {
    public static void main(String[] args) {
        //xor 연산 테스트
        System.out.println("2^1 :: " + (2^1));
        System.out.println("1^1 :: " + (1^1));
        System.out.println("4^1 :: " + (4^1));

        // xor연산(베타적 논리합)은 같으면 false, 다르면 true이다.

        System.out.println("1<<0 :: " + (1<<0));
        System.out.println("1<<1 :: " + (1<<1));
        System.out.println("1<<2 :: " + (1<<2));

        short parity = parity(10);
        System.out.println("parity = " + parity);

        short i = parity1(46);
        System.out.println("parity1 = " + i);

        short i1 = parity2(10);
        System.out.println("i1 = " + i1);

        short i2 = apply1(10);
        System.out.println("i2 = " + i2);
    }

    /**
     * 베타적 논리합을 이용해 무차별 대입으로 패리티 체크
     * @param x
     * @return
     */
    public static short parity(long x){
        /**
         * 어떻게 해서 하나의 숫자마다 xor 연산을 한걸로 패리티 계산을 할 수 있나?
         *
         */
        short result = 0;
        while (x!=0){
            result ^= (x&1);
            x>>>=1;
        }

        return result;
    }

    public static short parity1(long x){
        short result = 0;
        while (x != 0){
            result ^= 1;
            x &= (x-1); //x의 하위 비트를 지운다.
        }
        return result;
    }

    public static short parity2(long x){
        x ^= x>>>32;
        x ^= x>>>16;
        x ^= x>>>8;
        x ^= x>>>4;
        x ^= x>>>2;
        x ^= x>>>1;
        return (short) (x & 0x1);

    }

    //brute force
    public static short apply1(long x){
        short origin = (short) x;
        short result = 0;
        short answer = 0;
        while(true){
            result = (short)(x&1);
            if(result==1)
                break;
            else{
                answer  = (short)((short)1<<answer);
                x >>>=1;
            }

        }
        return (short) (origin + answer);
    }
}
