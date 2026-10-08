package com.google.inputmethod;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Person;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.Log;
import android.widget.RemoteViews;
import androidx.core.graphics.drawable.IconCompat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
public class vj8 {

    public static class b {
        final Bundle a;
        private IconCompat b;
        private final pfa[] c;
        private final pfa[] d;
        private boolean e;
        boolean f;
        private final int g;
        private final boolean h;

        @Deprecated
        public int i;
        public CharSequence j;
        public PendingIntent k;
        private boolean l;

        public static final class a {
            private final IconCompat a;
            private final CharSequence b;
            private final PendingIntent c;
            private boolean d;
            private final Bundle e;
            private ArrayList<pfa> f;
            private int g;
            private boolean h;
            private boolean i;
            private boolean j;

            public a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
                this(iconCompat, charSequence, pendingIntent, new Bundle(), null, true, 0, true, false, false);
            }

            private void b() {
                if (this.i && this.c == null) {
                    throw new NullPointerException("Contextual Actions must contain a valid PendingIntent");
                }
            }

            public b a() {
                b();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList<pfa> arrayList3 = this.f;
                if (arrayList3 != null) {
                    for (pfa pfaVar : arrayList3) {
                        if (pfaVar.j()) {
                            arrayList.add(pfaVar);
                        } else {
                            arrayList2.add(pfaVar);
                        }
                    }
                }
                return new b(this.a, this.b, this.c, this.e, arrayList2.isEmpty() ? null : (pfa[]) arrayList2.toArray(new pfa[arrayList2.size()]), arrayList.isEmpty() ? null : (pfa[]) arrayList.toArray(new pfa[arrayList.size()]), this.d, this.g, this.h, this.i, this.j);
            }

            public a c(boolean z) {
                this.i = z;
                return this;
            }

            private a(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, pfa[] pfaVarArr, boolean z, int i, boolean z2, boolean z3, boolean z4) {
                this.d = true;
                this.h = true;
                this.a = iconCompat;
                this.b = f.e(charSequence);
                this.c = pendingIntent;
                this.e = bundle;
                this.f = pfaVarArr == null ? null : new ArrayList<>(Arrays.asList(pfaVarArr));
                this.d = z;
                this.g = i;
                this.h = z2;
                this.i = z3;
                this.j = z4;
            }
        }

        public b(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this(i != 0 ? IconCompat.f(null, "", i) : null, charSequence, pendingIntent);
        }

        public PendingIntent a() {
            return this.k;
        }

        public boolean b() {
            return this.e;
        }

        public Bundle c() {
            return this.a;
        }

        public IconCompat d() {
            int i;
            if (this.b == null && (i = this.i) != 0) {
                this.b = IconCompat.f(null, "", i);
            }
            return this.b;
        }

        public pfa[] e() {
            return this.c;
        }

        public int f() {
            return this.g;
        }

        public boolean g() {
            return this.f;
        }

        public CharSequence h() {
            return this.j;
        }

        public boolean i() {
            return this.l;
        }

        public boolean j() {
            return this.h;
        }

        public b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent) {
            this(iconCompat, charSequence, pendingIntent, new Bundle(), null, null, true, 0, true, false, false);
        }

        b(IconCompat iconCompat, CharSequence charSequence, PendingIntent pendingIntent, Bundle bundle, pfa[] pfaVarArr, pfa[] pfaVarArr2, boolean z, int i, boolean z2, boolean z3, boolean z4) {
            this.f = true;
            this.b = iconCompat;
            if (iconCompat != null && iconCompat.j() == 2) {
                this.i = iconCompat.h();
            }
            this.j = f.e(charSequence);
            this.k = pendingIntent;
            this.a = bundle == null ? new Bundle() : bundle;
            this.c = pfaVarArr;
            this.d = pfaVarArr2;
            this.e = z;
            this.g = i;
            this.f = z2;
            this.h = z3;
            this.l = z4;
        }
    }

    public static class c extends j {
        private IconCompat e;
        private IconCompat f;
        private boolean g;
        private CharSequence h;
        private boolean i;

        private static class a {
            static void a(Notification.BigPictureStyle bigPictureStyle, Icon icon) {
                bigPictureStyle.bigPicture(icon);
            }

            static void b(Notification.BigPictureStyle bigPictureStyle, CharSequence charSequence) {
                bigPictureStyle.setContentDescription(charSequence);
            }

            static void c(Notification.BigPictureStyle bigPictureStyle, boolean z) {
                bigPictureStyle.showBigPictureWhenCollapsed(z);
            }
        }

        @Override // com.google.android.vj8.j
        public void b(tj8 tj8Var) {
            Notification.BigPictureStyle bigContentTitle = new Notification.BigPictureStyle(tj8Var.a()).setBigContentTitle(this.b);
            IconCompat iconCompat = this.e;
            if (iconCompat != null) {
                if (Build.VERSION.SDK_INT >= 31) {
                    a.a(bigContentTitle, this.e.q(tj8Var instanceof xj8 ? ((xj8) tj8Var).e() : null));
                } else if (iconCompat.j() == 1) {
                    bigContentTitle = bigContentTitle.bigPicture(this.e.g());
                }
            }
            if (this.g) {
                if (this.f == null) {
                    bigContentTitle.bigLargeIcon((Bitmap) null);
                } else {
                    bigContentTitle.bigLargeIcon(this.f.q(tj8Var instanceof xj8 ? ((xj8) tj8Var).e() : null));
                }
            }
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            if (Build.VERSION.SDK_INT >= 31) {
                a.c(bigContentTitle, this.i);
                a.b(bigContentTitle, this.h);
            }
        }

        @Override // com.google.android.vj8.j
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigPictureStyle";
        }

        public c h(Bitmap bitmap) {
            this.f = bitmap == null ? null : IconCompat.d(bitmap);
            this.g = true;
            return this;
        }

        public c i(Bitmap bitmap) {
            this.e = bitmap == null ? null : IconCompat.d(bitmap);
            return this;
        }

        public c j(CharSequence charSequence) {
            this.b = f.e(charSequence);
            return this;
        }

        public c k(CharSequence charSequence) {
            this.c = f.e(charSequence);
            this.d = true;
            return this;
        }
    }

    public static class d extends j {
        private CharSequence e;

        @Override // com.google.android.vj8.j
        public void a(Bundle bundle) {
            super.a(bundle);
        }

        @Override // com.google.android.vj8.j
        public void b(tj8 tj8Var) {
            Notification.BigTextStyle bigTextStyleBigText = new Notification.BigTextStyle(tj8Var.a()).setBigContentTitle(this.b).bigText(this.e);
            if (this.d) {
                bigTextStyleBigText.setSummaryText(this.c);
            }
        }

        @Override // com.google.android.vj8.j
        protected String c() {
            return "androidx.core.app.NotificationCompat$BigTextStyle";
        }

        public d h(CharSequence charSequence) {
            this.e = f.e(charSequence);
            return this;
        }

        public d i(CharSequence charSequence) {
            this.b = f.e(charSequence);
            return this;
        }
    }

    public static final class e {
        private PendingIntent a;
        private PendingIntent b;
        private IconCompat c;
        private int d;
        private int e;
        private int f;
        private String g;

        private static class a {
            static Notification.BubbleMetadata a(e eVar) {
                if (eVar == null || eVar.f() == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder suppressNotification = new Notification.BubbleMetadata.Builder().setIcon(eVar.e().p()).setIntent(eVar.f()).setDeleteIntent(eVar.b()).setAutoExpandBubble(eVar.a()).setSuppressNotification(eVar.h());
                if (eVar.c() != 0) {
                    suppressNotification.setDesiredHeight(eVar.c());
                }
                if (eVar.d() != 0) {
                    suppressNotification.setDesiredHeightResId(eVar.d());
                }
                return suppressNotification.build();
            }
        }

        private static class b {
            static Notification.BubbleMetadata a(e eVar) {
                if (eVar == null) {
                    return null;
                }
                Notification.BubbleMetadata.Builder builder = eVar.g() != null ? new Notification.BubbleMetadata.Builder(eVar.g()) : new Notification.BubbleMetadata.Builder(eVar.f(), eVar.e().p());
                builder.setDeleteIntent(eVar.b()).setAutoExpandBubble(eVar.a()).setSuppressNotification(eVar.h());
                if (eVar.c() != 0) {
                    builder.setDesiredHeight(eVar.c());
                }
                if (eVar.d() != 0) {
                    builder.setDesiredHeightResId(eVar.d());
                }
                return builder.build();
            }
        }

        public static final class c {
            private PendingIntent a;
            private IconCompat b;
            private int c;
            private int d;
            private int e;
            private PendingIntent f;
            private String g;

            public c(PendingIntent pendingIntent, IconCompat iconCompat) {
                if (pendingIntent == null) {
                    throw new NullPointerException("Bubble requires non-null pending intent");
                }
                if (iconCompat == null) {
                    throw new NullPointerException("Bubbles require non-null icon");
                }
                this.a = pendingIntent;
                this.b = iconCompat;
            }

            private c c(int i, boolean z) {
                if (z) {
                    this.e = i | this.e;
                    return this;
                }
                this.e = (~i) & this.e;
                return this;
            }

            public e a() {
                String str = this.g;
                if (str == null && this.a == null) {
                    throw new NullPointerException("Must supply pending intent or shortcut to bubble");
                }
                if (str == null && this.b == null) {
                    throw new NullPointerException("Must supply an icon or shortcut for the bubble");
                }
                e eVar = new e(this.a, this.f, this.b, this.c, this.d, this.e, str);
                eVar.i(this.e);
                return eVar;
            }

            public c b(int i) {
                this.c = Math.max(i, 0);
                this.d = 0;
                return this;
            }

            public c d(boolean z) {
                c(2, z);
                return this;
            }
        }

        public static Notification.BubbleMetadata j(e eVar) {
            if (eVar == null) {
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i >= 30) {
                return b.a(eVar);
            }
            if (i == 29) {
                return a.a(eVar);
            }
            return null;
        }

        public boolean a() {
            return (this.f & 1) != 0;
        }

        public PendingIntent b() {
            return this.b;
        }

        public int c() {
            return this.d;
        }

        public int d() {
            return this.e;
        }

        public IconCompat e() {
            return this.c;
        }

        public PendingIntent f() {
            return this.a;
        }

        public String g() {
            return this.g;
        }

        public boolean h() {
            return (this.f & 2) != 0;
        }

        public void i(int i) {
            this.f = i;
        }

        private e(PendingIntent pendingIntent, PendingIntent pendingIntent2, IconCompat iconCompat, int i, int i2, int i3, String str) {
            this.a = pendingIntent;
            this.c = iconCompat;
            this.d = i;
            this.e = i2;
            this.b = pendingIntent2;
            this.f = i3;
            this.g = str;
        }
    }

    public static class g extends j {
        private int e;
        private p89 f;
        private PendingIntent g;
        private PendingIntent h;
        private PendingIntent i;
        private boolean j;
        private Integer k;
        private Integer l;
        private IconCompat m;
        private CharSequence n;

        static class a {
            static Notification.Builder a(Notification.Builder builder, Person person) {
                return builder.addPerson(person);
            }

            static Parcelable b(Person person) {
                return person;
            }
        }

        static class b {
            static Notification.CallStyle a(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forIncomingCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle b(Person person, PendingIntent pendingIntent) {
                return Notification.CallStyle.forOngoingCall(person, pendingIntent);
            }

            static Notification.CallStyle c(Person person, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
                return Notification.CallStyle.forScreeningCall(person, pendingIntent, pendingIntent2);
            }

            static Notification.CallStyle d(Notification.CallStyle callStyle, int i) {
                return callStyle.setAnswerButtonColorHint(i);
            }

            static Notification.CallStyle e(Notification.CallStyle callStyle, int i) {
                return callStyle.setDeclineButtonColorHint(i);
            }

            static Notification.CallStyle f(Notification.CallStyle callStyle, boolean z) {
                return callStyle.setIsVideo(z);
            }

            static Notification.CallStyle g(Notification.CallStyle callStyle, Icon icon) {
                return callStyle.setVerificationIcon(icon);
            }

            static Notification.CallStyle h(Notification.CallStyle callStyle, CharSequence charSequence) {
                return callStyle.setVerificationText(charSequence);
            }
        }

        private String i() {
            int i = this.e;
            if (i == 1) {
                return this.a.a.getResources().getString(yz9.e);
            }
            if (i == 2) {
                return this.a.a.getResources().getString(yz9.f);
            }
            if (i != 3) {
                return null;
            }
            return this.a.a.getResources().getString(yz9.g);
        }

        private boolean j(b bVar) {
            return bVar != null && bVar.c().getBoolean("key_action_priority");
        }

        private b k(int i, int i2, Integer num, int i3, PendingIntent pendingIntent) {
            if (num == null) {
                num = Integer.valueOf(s02.d(this.a.a, i3));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) this.a.a.getResources().getString(i2));
            spannableStringBuilder.setSpan(new ForegroundColorSpan(num.intValue()), 0, spannableStringBuilder.length(), 18);
            b bVarA = new b.a(IconCompat.e(this.a.a, i), spannableStringBuilder, pendingIntent).a();
            bVarA.c().putBoolean("key_action_priority", true);
            return bVarA;
        }

        private b l() {
            int i = ux9.b;
            int i2 = ux9.a;
            PendingIntent pendingIntent = this.g;
            if (pendingIntent == null) {
                return null;
            }
            boolean z = this.j;
            return k(z ? i : i2, z ? yz9.b : yz9.a, this.k, ex9.a, pendingIntent);
        }

        private b m() {
            int i = ux9.c;
            PendingIntent pendingIntent = this.h;
            return pendingIntent == null ? k(i, yz9.d, this.l, ex9.b, this.i) : k(i, yz9.c, this.l, ex9.b, pendingIntent);
        }

        @Override // com.google.android.vj8.j
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putInt("android.callType", this.e);
            bundle.putBoolean("android.callIsVideo", this.j);
            p89 p89Var = this.f;
            if (p89Var != null) {
                bundle.putParcelable("android.callPerson", a.b(p89Var.h()));
            }
            IconCompat iconCompat = this.m;
            if (iconCompat != null) {
                bundle.putParcelable("android.verificationIcon", iconCompat.q(this.a.a));
            }
            bundle.putCharSequence("android.verificationText", this.n);
            bundle.putParcelable("android.answerIntent", this.g);
            bundle.putParcelable("android.declineIntent", this.h);
            bundle.putParcelable("android.hangUpIntent", this.i);
            Integer num = this.k;
            if (num != null) {
                bundle.putInt("android.answerColor", num.intValue());
            }
            Integer num2 = this.l;
            if (num2 != null) {
                bundle.putInt("android.declineColor", num2.intValue());
            }
        }

        @Override // com.google.android.vj8.j
        public void b(tj8 tj8Var) {
            CharSequence charSequenceI = null;
            callStyleA = null;
            Notification.CallStyle callStyleA = null;
            charSequenceI = null;
            if (Build.VERSION.SDK_INT < 31) {
                Notification.Builder builderA = tj8Var.a();
                p89 p89Var = this.f;
                builderA.setContentTitle(p89Var != null ? p89Var.d() : null);
                Bundle bundle = this.a.E;
                if (bundle != null && bundle.containsKey("android.text")) {
                    charSequenceI = this.a.E.getCharSequence("android.text");
                }
                if (charSequenceI == null) {
                    charSequenceI = i();
                }
                builderA.setContentText(charSequenceI);
                p89 p89Var2 = this.f;
                if (p89Var2 != null) {
                    if (p89Var2.b() != null) {
                        builderA.setLargeIcon(this.f.b().q(this.a.a));
                    }
                    a.a(builderA, this.f.h());
                }
                builderA.setCategory("call");
                return;
            }
            int i = this.e;
            if (i == 1) {
                callStyleA = b.a(this.f.h(), this.h, this.g);
            } else if (i == 2) {
                callStyleA = b.b(this.f.h(), this.i);
            } else if (i == 3) {
                callStyleA = b.c(this.f.h(), this.i, this.g);
            } else if (Log.isLoggable("NotifCompat", 3)) {
                String.valueOf(this.e);
            }
            if (callStyleA != null) {
                callStyleA.setBuilder(tj8Var.a());
                Integer num = this.k;
                if (num != null) {
                    b.d(callStyleA, num.intValue());
                }
                Integer num2 = this.l;
                if (num2 != null) {
                    b.e(callStyleA, num2.intValue());
                }
                b.h(callStyleA, this.n);
                IconCompat iconCompat = this.m;
                if (iconCompat != null) {
                    b.g(callStyleA, iconCompat.q(this.a.a));
                }
                b.f(callStyleA, this.j);
            }
        }

        @Override // com.google.android.vj8.j
        protected String c() {
            return "androidx.core.app.NotificationCompat$CallStyle";
        }

        public ArrayList<b> h() {
            b bVarM = m();
            b bVarL = l();
            ArrayList<b> arrayList = new ArrayList<>(3);
            arrayList.add(bVarM);
            ArrayList<b> arrayList2 = this.a.b;
            int i = 2;
            if (arrayList2 != null) {
                for (b bVar : arrayList2) {
                    if (bVar.j()) {
                        arrayList.add(bVar);
                    } else if (!j(bVar)) {
                        arrayList.add(bVar);
                        i--;
                    }
                    if (bVarL != null && i == 1) {
                        arrayList.add(bVarL);
                        i--;
                    }
                }
            }
            if (bVarL != null && i >= 1) {
                arrayList.add(bVarL);
            }
            return arrayList;
        }
    }

    public static class h extends j {
        private ArrayList<CharSequence> e = new ArrayList<>();

        @Override // com.google.android.vj8.j
        public void b(tj8 tj8Var) {
            Notification.InboxStyle bigContentTitle = new Notification.InboxStyle(tj8Var.a()).setBigContentTitle(this.b);
            if (this.d) {
                bigContentTitle.setSummaryText(this.c);
            }
            Iterator<CharSequence> it = this.e.iterator();
            while (it.hasNext()) {
                bigContentTitle.addLine(it.next());
            }
        }

        @Override // com.google.android.vj8.j
        protected String c() {
            return "androidx.core.app.NotificationCompat$InboxStyle";
        }

        public h h(CharSequence charSequence) {
            if (charSequence != null) {
                this.e.add(f.e(charSequence));
            }
            return this;
        }

        public h i(CharSequence charSequence) {
            this.b = f.e(charSequence);
            return this;
        }
    }

    public static class i extends j {
        private final List<d> e = new ArrayList();
        private final List<d> f = new ArrayList();
        private p89 g;
        private CharSequence h;
        private Boolean i;

        static class a {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addMessage(message);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, CharSequence charSequence) {
                return messagingStyle.setConversationTitle(charSequence);
            }
        }

        static class b {
            static Notification.MessagingStyle a(Notification.MessagingStyle messagingStyle, Notification.MessagingStyle.Message message) {
                return messagingStyle.addHistoricMessage(message);
            }
        }

        static class c {
            static Notification.MessagingStyle a(Person person) {
                return new Notification.MessagingStyle(person);
            }

            static Notification.MessagingStyle b(Notification.MessagingStyle messagingStyle, boolean z) {
                return messagingStyle.setGroupConversation(z);
            }
        }

        public static final class d {
            private final CharSequence a;
            private final long b;
            private final p89 c;
            private Bundle d = new Bundle();
            private String e;
            private Uri f;

            static class a {
                static Notification.MessagingStyle.Message a(Notification.MessagingStyle.Message message, String str, Uri uri) {
                    return message.setData(str, uri);
                }
            }

            static class b {
                static Parcelable a(Person person) {
                    return person;
                }

                static Notification.MessagingStyle.Message b(CharSequence charSequence, long j, Person person) {
                    return new Notification.MessagingStyle.Message(charSequence, j, person);
                }
            }

            public d(CharSequence charSequence, long j, p89 p89Var) {
                this.a = charSequence;
                this.b = j;
                this.c = p89Var;
            }

            static Bundle[] a(List<d> list) {
                Bundle[] bundleArr = new Bundle[list.size()];
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bundleArr[i] = list.get(i).i();
                }
                return bundleArr;
            }

            private Bundle i() {
                Bundle bundle = new Bundle();
                CharSequence charSequence = this.a;
                if (charSequence != null) {
                    bundle.putCharSequence("text", charSequence);
                }
                bundle.putLong("time", this.b);
                p89 p89Var = this.c;
                if (p89Var != null) {
                    bundle.putCharSequence("sender", p89Var.d());
                    bundle.putParcelable("sender_person", b.a(this.c.h()));
                }
                String str = this.e;
                if (str != null) {
                    bundle.putString("type", str);
                }
                Uri uri = this.f;
                if (uri != null) {
                    bundle.putParcelable("uri", uri);
                }
                Bundle bundle2 = this.d;
                if (bundle2 != null) {
                    bundle.putBundle("extras", bundle2);
                }
                return bundle;
            }

            public String b() {
                return this.e;
            }

            public Uri c() {
                return this.f;
            }

            public p89 d() {
                return this.c;
            }

            public CharSequence e() {
                return this.a;
            }

            public long f() {
                return this.b;
            }

            public d g(String str, Uri uri) {
                this.e = str;
                this.f = uri;
                return this;
            }

            Notification.MessagingStyle.Message h() {
                p89 p89VarD = d();
                Notification.MessagingStyle.Message messageB = b.b(e(), f(), p89VarD == null ? null : p89VarD.h());
                if (b() != null) {
                    a.a(messageB, b(), c());
                }
                return messageB;
            }
        }

        public i(p89 p89Var) {
            if (TextUtils.isEmpty(p89Var.d())) {
                throw new IllegalArgumentException("User's name must not be empty.");
            }
            this.g = p89Var;
        }

        @Override // com.google.android.vj8.j
        public void a(Bundle bundle) {
            super.a(bundle);
            bundle.putCharSequence("android.selfDisplayName", this.g.d());
            bundle.putBundle("android.messagingStyleUser", this.g.i());
            bundle.putCharSequence("android.hiddenConversationTitle", this.h);
            if (this.h != null && this.i.booleanValue()) {
                bundle.putCharSequence("android.conversationTitle", this.h);
            }
            if (!this.e.isEmpty()) {
                bundle.putParcelableArray("android.messages", d.a(this.e));
            }
            if (!this.f.isEmpty()) {
                bundle.putParcelableArray("android.messages.historic", d.a(this.f));
            }
            Boolean bool = this.i;
            if (bool != null) {
                bundle.putBoolean("android.isGroupConversation", bool.booleanValue());
            }
        }

        @Override // com.google.android.vj8.j
        public void b(tj8 tj8Var) {
            j(i());
            Notification.MessagingStyle messagingStyleA = c.a(this.g.h());
            Iterator<d> it = this.e.iterator();
            while (it.hasNext()) {
                a.a(messagingStyleA, it.next().h());
            }
            Iterator<d> it2 = this.f.iterator();
            while (it2.hasNext()) {
                b.a(messagingStyleA, it2.next().h());
            }
            this.i.booleanValue();
            a.b(messagingStyleA, this.h);
            c.b(messagingStyleA, this.i.booleanValue());
            messagingStyleA.setBuilder(tj8Var.a());
        }

        @Override // com.google.android.vj8.j
        protected String c() {
            return "androidx.core.app.NotificationCompat$MessagingStyle";
        }

        public i h(d dVar) {
            if (dVar != null) {
                this.e.add(dVar);
                if (this.e.size() > 25) {
                    this.e.remove(0);
                }
            }
            return this;
        }

        public boolean i() {
            f fVar = this.a;
            if (fVar != null && fVar.a.getApplicationInfo().targetSdkVersion < 28 && this.i == null) {
                return this.h != null;
            }
            Boolean bool = this.i;
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        public i j(boolean z) {
            this.i = Boolean.valueOf(z);
            return this;
        }
    }

    public static abstract class j {
        protected f a;
        CharSequence b;
        CharSequence c;
        boolean d = false;

        public void a(Bundle bundle) {
            if (this.d) {
                bundle.putCharSequence("android.summaryText", this.c);
            }
            CharSequence charSequence = this.b;
            if (charSequence != null) {
                bundle.putCharSequence("android.title.big", charSequence);
            }
            String strC = c();
            if (strC != null) {
                bundle.putString("androidx.core.app.extra.COMPAT_TEMPLATE", strC);
            }
        }

        public abstract void b(tj8 tj8Var);

        protected abstract String c();

        public RemoteViews d(tj8 tj8Var) {
            return null;
        }

        public RemoteViews e(tj8 tj8Var) {
            return null;
        }

        public RemoteViews f(tj8 tj8Var) {
            return null;
        }

        public void g(f fVar) {
            if (this.a != fVar) {
                this.a = fVar;
                if (fVar != null) {
                    fVar.C(this);
                }
            }
        }
    }

    @Deprecated
    public static Bundle a(Notification notification) {
        return notification.extras;
    }

    public static Bitmap b(Context context, Bitmap bitmap) {
        return bitmap;
    }

    public static class f {
        boolean A;
        boolean B;
        boolean C;
        String D;
        Bundle E;
        int F;
        int G;
        Notification H;
        RemoteViews I;
        RemoteViews J;
        RemoteViews K;
        String L;
        int M;
        String N;
        x77 O;
        long P;
        int Q;
        int R;
        boolean S;
        e T;
        Notification U;
        boolean V;
        Object W;

        @Deprecated
        public ArrayList<String> X;
        public Context a;
        public ArrayList<b> b;
        public ArrayList<p89> c;
        ArrayList<b> d;
        CharSequence e;
        CharSequence f;
        String g;
        PendingIntent h;
        PendingIntent i;
        RemoteViews j;
        IconCompat k;
        CharSequence l;
        int m;
        int n;
        boolean o;
        boolean p;
        j q;
        CharSequence r;
        CharSequence s;
        CharSequence[] t;
        int u;
        int v;
        boolean w;
        String x;
        boolean y;
        String z;

        public f(Context context, String str) {
            this.b = new ArrayList<>();
            this.c = new ArrayList<>();
            this.d = new ArrayList<>();
            this.o = true;
            this.A = false;
            this.F = 0;
            this.G = 0;
            this.M = 0;
            this.Q = 0;
            this.R = 0;
            Notification notification = new Notification();
            this.U = notification;
            this.a = context;
            this.L = str;
            notification.when = System.currentTimeMillis();
            this.U.audioStreamType = -1;
            this.n = 0;
            this.X = new ArrayList<>();
            this.S = true;
        }

        protected static CharSequence e(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }

        private void o(int i, boolean z) {
            if (z) {
                Notification notification = this.U;
                notification.flags = i | notification.flags;
            } else {
                Notification notification2 = this.U;
                notification2.flags = (~i) & notification2.flags;
            }
        }

        public f A(int i) {
            this.U.icon = i;
            return this;
        }

        public f B(Uri uri) {
            Notification notification = this.U;
            notification.sound = uri;
            notification.audioStreamType = -1;
            AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(4).setUsage(5);
            this.U.audioAttributes = usage.build();
            return this;
        }

        public f C(j jVar) {
            if (this.q != jVar) {
                this.q = jVar;
                if (jVar != null) {
                    jVar.g(this);
                }
            }
            return this;
        }

        public f D(CharSequence charSequence) {
            this.U.tickerText = e(charSequence);
            return this;
        }

        public f E(long j) {
            this.P = j;
            return this;
        }

        public f F(long[] jArr) {
            this.U.vibrate = jArr;
            return this;
        }

        public f G(int i) {
            this.G = i;
            return this;
        }

        public f H(long j) {
            this.U.when = j;
            return this;
        }

        public f a(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.b.add(new b(i, charSequence, pendingIntent));
            return this;
        }

        public f b(b bVar) {
            if (bVar != null) {
                this.b.add(bVar);
            }
            return this;
        }

        public Notification c() {
            return new xj8(this).c();
        }

        public Bundle d() {
            if (this.E == null) {
                this.E = new Bundle();
            }
            return this.E;
        }

        public f f(boolean z) {
            o(16, z);
            return this;
        }

        public f g(e eVar) {
            this.T = eVar;
            return this;
        }

        public f h(String str) {
            this.L = str;
            return this;
        }

        public f i(int i) {
            this.F = i;
            return this;
        }

        public f j(PendingIntent pendingIntent) {
            this.h = pendingIntent;
            return this;
        }

        public f k(CharSequence charSequence) {
            this.f = e(charSequence);
            return this;
        }

        public f l(CharSequence charSequence) {
            this.e = e(charSequence);
            return this;
        }

        public f m(int i) {
            Notification notification = this.U;
            notification.defaults = i;
            if ((i & 4) != 0) {
                notification.flags |= 1;
            }
            return this;
        }

        public f n(PendingIntent pendingIntent) {
            this.U.deleteIntent = pendingIntent;
            return this;
        }

        public f p(String str) {
            this.x = str;
            return this;
        }

        public f q(boolean z) {
            this.y = z;
            return this;
        }

        public f r(Bitmap bitmap) {
            this.k = bitmap == null ? null : IconCompat.d(vj8.b(this.a, bitmap));
            return this;
        }

        public f s(int i, int i2, int i3) {
            Notification notification = this.U;
            notification.ledARGB = i;
            notification.ledOnMS = i2;
            notification.ledOffMS = i3;
            notification.flags = ((i2 == 0 || i3 == 0) ? 0 : 1) | (notification.flags & (-2));
            return this;
        }

        public f t(boolean z) {
            this.A = z;
            return this;
        }

        public f u(int i) {
            this.m = i;
            return this;
        }

        public f v(boolean z) {
            o(2, z);
            return this;
        }

        public f w(int i) {
            this.n = i;
            return this;
        }

        public f x(znb znbVar) {
            if (znbVar != null) {
                this.N = znbVar.c();
                if (this.O == null) {
                    if (znbVar.d() != null) {
                        this.O = znbVar.d();
                    } else if (znbVar.c() != null) {
                        this.O = new x77(znbVar.c());
                    }
                }
                if (this.e == null) {
                    l(znbVar.i());
                }
            }
            return this;
        }

        public f y(boolean z) {
            this.o = z;
            return this;
        }

        public f z(boolean z) {
            this.V = z;
            return this;
        }

        @Deprecated
        public f(Context context) {
            this(context, null);
        }
    }
}
