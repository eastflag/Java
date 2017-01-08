package $A.$A;

import $A.$A.dto.Control.STATE;

public class EnumSwitch {
    


    /**
     * @param args
     * @author 	dongkee.lee(dongkee.lee@lge.com)
     * @date		2013. 10. 14.
     */
    public static void main(String[] args) {

        //switch 사용 예
        STATE state = STATE.STATE1;
        
        switch(state) {
        
        case STATE1:
            
            break;
            
        case STATE2:
            
            break;
        
        }
        
        //네트웍 혹은 핸들러를 통해서 주고 받을때 사용 예1
        int arg1 = 1;
        STATE [] mState = STATE.values();
        
        switch(mState[arg1]) {
        
        case STATE1:
            //do
            break;
        case STATE2:
            //do
            break;
        }

    }

}
