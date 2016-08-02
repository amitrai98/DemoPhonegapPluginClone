package android.com.videocalling;

import android.util.Log;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

/**
 * Created by amitrai on 29/7/16.
 */
public class InitiateVideoCall extends CordovaPlugin{

    private String TAG = getClass().getSimpleName();

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        Log.e(TAG, "call received");

        return super.execute(action, args, callbackContext);
    }
}
