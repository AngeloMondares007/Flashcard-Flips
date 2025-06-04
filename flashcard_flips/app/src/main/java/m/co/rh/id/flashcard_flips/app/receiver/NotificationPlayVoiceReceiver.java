package m.co.rh.id.flashcard_flips.app.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import m.co.rh.id.flashcard_flips.base.BaseApplication;
import m.co.rh.id.flashcard_flips.base.component.IAppNotificationHandler;
import m.co.rh.id.aprovider.Provider;

public class NotificationPlayVoiceReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        Provider provider = BaseApplication.of(context).getProvider();
        IAppNotificationHandler appNotificationHandler = provider.get(IAppNotificationHandler.class);
        appNotificationHandler.playVoice(intent);
    }
}
