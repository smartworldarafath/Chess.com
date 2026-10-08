package com.google.inputmethod;

import android.app.Notification;
import android.app.Person;
import android.app.RemoteInput;
import android.content.Context;
import android.content.LocusId;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
class xj8 implements tj8 {
    private final Context a;
    private final Notification.Builder b;
    private final vj8.f c;
    private RemoteViews d;
    private RemoteViews e;
    private final Bundle f = new Bundle();
    private int g;
    private RemoteViews h;

    static class a {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAllowGeneratedReplies(z);
        }

        static Notification.Builder b(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomBigContentView(remoteViews);
        }

        static Notification.Builder c(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomContentView(remoteViews);
        }

        static Notification.Builder d(Notification.Builder builder, RemoteViews remoteViews) {
            return builder.setCustomHeadsUpContentView(remoteViews);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence[] charSequenceArr) {
            return builder.setRemoteInputHistory(charSequenceArr);
        }
    }

    static class b {
        static Notification.Builder a(Context context, String str) {
            return new Notification.Builder(context, str);
        }

        static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setBadgeIconType(i);
        }

        static Notification.Builder c(Notification.Builder builder, boolean z) {
            return builder.setColorized(z);
        }

        static Notification.Builder d(Notification.Builder builder, int i) {
            return builder.setGroupAlertBehavior(i);
        }

        static Notification.Builder e(Notification.Builder builder, CharSequence charSequence) {
            return builder.setSettingsText(charSequence);
        }

        static Notification.Builder f(Notification.Builder builder, String str) {
            return builder.setShortcutId(str);
        }

        static Notification.Builder g(Notification.Builder builder, long j) {
            return builder.setTimeoutAfter(j);
        }
    }

    static class c {
        static Notification.Builder a(Notification.Builder builder, Person person) {
            return builder.addPerson(person);
        }

        static Notification.Action.Builder b(Notification.Action.Builder builder, int i) {
            return builder.setSemanticAction(i);
        }
    }

    static class d {
        static Notification.Builder a(Notification.Builder builder, boolean z) {
            return builder.setAllowSystemGeneratedContextualActions(z);
        }

        static Notification.Builder b(Notification.Builder builder, Notification.BubbleMetadata bubbleMetadata) {
            return builder.setBubbleMetadata(bubbleMetadata);
        }

        static Notification.Action.Builder c(Notification.Action.Builder builder, boolean z) {
            return builder.setContextual(z);
        }

        static Notification.Builder d(Notification.Builder builder, Object obj) {
            return builder.setLocusId((LocusId) obj);
        }
    }

    static class e {
        static Notification.Action.Builder a(Notification.Action.Builder builder, boolean z) {
            return builder.setAuthenticationRequired(z);
        }

        static Notification.Builder b(Notification.Builder builder, int i) {
            return builder.setForegroundServiceBehavior(i);
        }
    }

    static final class f {
        static Notification.Builder a(Notification.Builder builder, String str) {
            return builder.setShortCriticalText(str);
        }
    }

    xj8(vj8.f fVar) {
        int i;
        this.c = fVar;
        Context context = fVar.a;
        this.a = context;
        Notification.Builder builderA = b.a(context, fVar.L);
        this.b = builderA;
        Notification notification = fVar.U;
        builderA.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, fVar.j).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(fVar.e).setContentText(fVar.f).setContentInfo(fVar.l).setContentIntent(fVar.h).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(fVar.i, (notification.flags & 128) != 0).setNumber(fVar.m).setProgress(fVar.u, fVar.v, fVar.w);
        IconCompat iconCompat = fVar.k;
        builderA.setLargeIcon(iconCompat == null ? null : iconCompat.q(context));
        builderA.setSubText(fVar.r).setUsesChronometer(fVar.p).setPriority(fVar.n);
        vj8.j jVar = fVar.q;
        if (jVar instanceof vj8.g) {
            Iterator<vj8.b> it = ((vj8.g) jVar).h().iterator();
            while (it.hasNext()) {
                b(it.next());
            }
        } else {
            Iterator<vj8.b> it2 = fVar.b.iterator();
            while (it2.hasNext()) {
                b(it2.next());
            }
        }
        Bundle bundle = fVar.E;
        if (bundle != null) {
            this.f.putAll(bundle);
        }
        this.d = fVar.I;
        this.e = fVar.J;
        this.b.setShowWhen(fVar.o);
        this.b.setLocalOnly(fVar.A);
        this.b.setGroup(fVar.x);
        this.b.setSortKey(fVar.z);
        this.b.setGroupSummary(fVar.y);
        this.g = fVar.Q;
        this.b.setCategory(fVar.D);
        this.b.setColor(fVar.F);
        this.b.setVisibility(fVar.G);
        this.b.setPublicVersion(fVar.H);
        this.b.setSound(notification.sound, notification.audioAttributes);
        ArrayList<String> arrayList = fVar.X;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<String> it3 = arrayList.iterator();
            while (it3.hasNext()) {
                this.b.addPerson(it3.next());
            }
        }
        this.h = fVar.K;
        if (fVar.d.size() > 0) {
            Bundle bundle2 = fVar.d().getBundle("android.car.EXTENSIONS");
            bundle2 = bundle2 == null ? new Bundle() : bundle2;
            Bundle bundle3 = new Bundle(bundle2);
            Bundle bundle4 = new Bundle();
            for (int i2 = 0; i2 < fVar.d.size(); i2++) {
                bundle4.putBundle(Integer.toString(i2), yj8.a(fVar.d.get(i2)));
            }
            bundle2.putBundle("invisible_actions", bundle4);
            bundle3.putBundle("invisible_actions", bundle4);
            fVar.d().putBundle("android.car.EXTENSIONS", bundle2);
            this.f.putBundle("android.car.EXTENSIONS", bundle3);
        }
        Object obj = fVar.W;
        if (obj != null) {
            this.b.setSmallIcon((Icon) obj);
        }
        this.b.setExtras(fVar.E);
        a.e(this.b, fVar.t);
        RemoteViews remoteViews = fVar.I;
        if (remoteViews != null) {
            a.c(this.b, remoteViews);
        }
        RemoteViews remoteViews2 = fVar.J;
        if (remoteViews2 != null) {
            a.b(this.b, remoteViews2);
        }
        RemoteViews remoteViews3 = fVar.K;
        if (remoteViews3 != null) {
            a.d(this.b, remoteViews3);
        }
        b.b(this.b, fVar.M);
        b.e(this.b, fVar.s);
        b.f(this.b, fVar.N);
        b.g(this.b, fVar.P);
        b.d(this.b, fVar.Q);
        if (fVar.C) {
            b.c(this.b, fVar.B);
        }
        if (!TextUtils.isEmpty(fVar.L)) {
            this.b.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
        }
        Iterator<p89> it4 = fVar.c.iterator();
        while (it4.hasNext()) {
            c.a(this.b, it4.next().h());
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            d.a(this.b, fVar.S);
            d.b(this.b, vj8.e.j(fVar.T));
            x77 x77Var = fVar.O;
            if (x77Var != null) {
                d.d(this.b, x77Var.c());
            }
        }
        if (i3 >= 31 && (i = fVar.R) != 0) {
            e.b(this.b, i);
        }
        if (i3 >= 36) {
            f.a(this.b, fVar.g);
        }
        if (fVar.V) {
            if (this.c.y) {
                this.g = 2;
            } else {
                this.g = 1;
            }
            this.b.setVibrate(null);
            this.b.setSound(null);
            int i4 = notification.defaults & (-4);
            notification.defaults = i4;
            this.b.setDefaults(i4);
            if (TextUtils.isEmpty(this.c.x)) {
                this.b.setGroup("silent");
            }
            b.d(this.b, this.g);
        }
    }

    private void b(vj8.b bVar) {
        IconCompat iconCompatD = bVar.d();
        Notification.Action.Builder builder = new Notification.Action.Builder(iconCompatD != null ? iconCompatD.p() : null, bVar.h(), bVar.a());
        if (bVar.e() != null) {
            for (RemoteInput remoteInput : pfa.b(bVar.e())) {
                builder.addRemoteInput(remoteInput);
            }
        }
        Bundle bundle = bVar.c() != null ? new Bundle(bVar.c()) : new Bundle();
        bundle.putBoolean("android.support.allowGeneratedReplies", bVar.b());
        int i = Build.VERSION.SDK_INT;
        a.a(builder, bVar.b());
        bundle.putInt("android.support.action.semanticAction", bVar.f());
        c.b(builder, bVar.f());
        if (i >= 29) {
            d.c(builder, bVar.j());
        }
        if (i >= 31) {
            e.a(builder, bVar.i());
        }
        bundle.putBoolean("android.support.action.showsUserInterface", bVar.g());
        builder.addExtras(bundle);
        this.b.addAction(builder.build());
    }

    @Override // com.google.inputmethod.tj8
    public Notification.Builder a() {
        return this.b;
    }

    public Notification c() {
        Bundle bundleA;
        RemoteViews remoteViewsF;
        RemoteViews remoteViewsD;
        vj8.j jVar = this.c.q;
        if (jVar != null) {
            jVar.b(this);
        }
        RemoteViews remoteViewsE = jVar != null ? jVar.e(this) : null;
        Notification notificationD = d();
        if (remoteViewsE != null) {
            notificationD.contentView = remoteViewsE;
        } else {
            RemoteViews remoteViews = this.c.I;
            if (remoteViews != null) {
                notificationD.contentView = remoteViews;
            }
        }
        if (jVar != null && (remoteViewsD = jVar.d(this)) != null) {
            notificationD.bigContentView = remoteViewsD;
        }
        if (jVar != null && (remoteViewsF = this.c.q.f(this)) != null) {
            notificationD.headsUpContentView = remoteViewsF;
        }
        if (jVar != null && (bundleA = vj8.a(notificationD)) != null) {
            jVar.a(bundleA);
        }
        return notificationD;
    }

    protected Notification d() {
        return this.b.build();
    }

    Context e() {
        return this.a;
    }
}
