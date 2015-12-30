package cn.plu.testwebviewjs;

import android.app.Activity;
import android.webkit.JavascriptInterface;



/**
 * Created by lily on 15-11-30.
 * <p/>
 * 绑定手机H5页面的JS操作
 */
public class JSInvoke {
    Activity activity;

    public JSInvoke(Activity activity) {
        this.activity = activity;
    }

    // WebView的安全性问题：http://www.jianshu.com/p/93cea79a2443
    @JavascriptInterface
    public void finishWebPage() {
        activity.finish();
    }


    @JavascriptInterface
    public void clickOnAndroid() {
        ((MainActivity)activity).finish();
    }




    @JavascriptInterface
    public void logout() {
        //TODO 保留登出接口
    }
}
