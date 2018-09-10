package com.example.asch_pan.testautoclick03;

import android.accessibilityservice.AccessibilityService;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;

import java.util.List;

public class MyAccessbilityService extends AccessibilityService {
    String nowPackageName;
    String targetPackage = "com.alibaba.android.rimet";
    String targetClickText= "target";

    String tabWordLayout = "home_bottom_tab_button_work";
    String tag = "testRmit";

    @Override
    public void onAccessibilityEvent(AccessibilityEvent event) {
//        clickByText(targetClickText,event);
        clickByText(targetClickText,event);
        String s = null;

    }


    void clickByText(String text,AccessibilityEvent event){
        nowPackageName = event.getPackageName().toString();
        if (nowPackageName.equals(targetPackage)){
            if(event.getEventType()==AccessibilityEvent.TYPE_WINDOW_STATE_CHANGED){

                AccessibilityNodeInfo rootNode = this.getRootInActiveWindow();
                List<AccessibilityNodeInfo> list = rootNode.findAccessibilityNodeInfosByText(targetClickText);
                Log.e(tag, "find By \""+text+"\" count:"+String.valueOf(list.size()));
                if (list.isEmpty())
                    return;
                AccessibilityNodeInfo node =  list.get(1);
                tryClickByLevel(node);
                for (AccessibilityNodeInfo info : list){

                }

            }
        }

    }

    void tryClickByLevel(AccessibilityNodeInfo info){
        if (info.isClickable()){
            info.performAction(AccessibilityNodeInfo.ACTION_CLICK);
            Log.e(tag,"click!！！ "+info.getClassName().toString());
        }else {
            Log.e(tag,"try parent :"+info.getParent().getClassName().toString());
            tryClickByLevel(info.getParent());
        }
    }

    @Override
    public void onInterrupt() {

    }
}
