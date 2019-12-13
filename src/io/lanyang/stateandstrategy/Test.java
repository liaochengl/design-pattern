package io.lanyang.stateandstrategy;


/**
 * @author lanyang
 * @description:
 * @create: 2019-12-10 10:05
 **/
public class Test {


    public static void main(String[] args){
        String status = "1";//这里根据实际业务需要读取数据库，取到不同状态
        StateInterface state = Strategy.getStateInterface(status);
        StateContext context = new StateContext(state);
        context.switchState();
    }
}
