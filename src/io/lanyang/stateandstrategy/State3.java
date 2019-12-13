package io.lanyang.stateandstrategy;

/**
 * @author lanyang
 * @description:
 * @create: 2019-12-10 10:00
 **/
public class State3 implements StateInterface {

    @Override
    public void switchState() {
        System.out.println("当前状态state3");
        System.out.println("切换至状态state4");
    }
}
