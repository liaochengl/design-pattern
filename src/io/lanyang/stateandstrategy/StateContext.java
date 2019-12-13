package io.lanyang.stateandstrategy;

/**
 * @author lanyang
 * @description:
 * @create: 2019-12-10 10:02
 **/
public class StateContext {

    private StateInterface state;

    public StateContext(StateInterface state){
        this.state = state;
    }

    public void switchState(){
        state.switchState();
    }
}
