package com.google.inputmethod;

import android.app.Notification;
import android.app.NotificationChannel;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class uj8 {
    final String a;
    CharSequence b;
    int c;
    String d;
    String e;
    boolean i;
    boolean k;
    long[] l;
    String m;
    String n;
    boolean f = true;
    Uri g = Settings.System.DEFAULT_NOTIFICATION_URI;
    int j = 0;
    AudioAttributes h = Notification.AUDIO_ATTRIBUTES_DEFAULT;

    static class a {
        static NotificationChannel a(String str, CharSequence charSequence, int i) {
            return new NotificationChannel(str, charSequence, i);
        }

        static void b(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableLights(z);
        }

        static void c(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.enableVibration(z);
        }

        static void d(NotificationChannel notificationChannel, String str) {
            notificationChannel.setDescription(str);
        }

        static void e(NotificationChannel notificationChannel, String str) {
            notificationChannel.setGroup(str);
        }

        static void f(NotificationChannel notificationChannel, int i) {
            notificationChannel.setLightColor(i);
        }

        static void g(NotificationChannel notificationChannel, boolean z) {
            notificationChannel.setShowBadge(z);
        }

        static void h(NotificationChannel notificationChannel, Uri uri, AudioAttributes audioAttributes) {
            notificationChannel.setSound(uri, audioAttributes);
        }

        static void i(NotificationChannel notificationChannel, long[] jArr) {
            notificationChannel.setVibrationPattern(jArr);
        }
    }

    static class b {
        static void a(NotificationChannel notificationChannel, String str, String str2) {
            notificationChannel.setConversationId(str, str2);
        }
    }

    public static class c {
        private final uj8 a;

        public c(String str, int i) {
            this.a = new uj8(str, i);
        }

        public uj8 a() {
            return this.a;
        }

        public c b(String str) {
            this.a.d = str;
            return this;
        }

        public c c(CharSequence charSequence) {
            this.a.b = charSequence;
            return this;
        }
    }

    uj8(String str, int i) {
        this.a = (String) di9.g(str);
        this.c = i;
    }

    NotificationChannel a() {
        String str;
        String str2;
        int i = Build.VERSION.SDK_INT;
        NotificationChannel notificationChannelA = a.a(this.a, this.b, this.c);
        a.d(notificationChannelA, this.d);
        a.e(notificationChannelA, this.e);
        a.g(notificationChannelA, this.f);
        a.h(notificationChannelA, this.g, this.h);
        a.b(notificationChannelA, this.i);
        a.f(notificationChannelA, this.j);
        a.i(notificationChannelA, this.l);
        a.c(notificationChannelA, this.k);
        if (i >= 30 && (str = this.m) != null && (str2 = this.n) != null) {
            b.a(notificationChannelA, str, str2);
        }
        return notificationChannelA;
    }
}
