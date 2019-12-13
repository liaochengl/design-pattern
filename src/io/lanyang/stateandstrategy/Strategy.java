package io.lanyang.stateandstrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @author lanyang
 * @description:
 * @create: 2019-12-10 10:06
 **/
public class Strategy {

    private static Map<String, StateInterface> map = new HashMap<>();

    static {
        map.put("1", new State1());
        map.put("2", new State2());
        map.put("3", new State3());
    }

    public static StateInterface getStateInterface(String status){
        return map.get(status);
    }
}
