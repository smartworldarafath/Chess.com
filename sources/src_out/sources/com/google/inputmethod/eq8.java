package com.google.inputmethod;

import com.google.android.de8;
import com.google.android.jd8;
import com.google.android.md8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001)B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u001b\u0010\u0015\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0000¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R*\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00028\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$\"\u0004\b%\u0010\u0005R\u001e\u0010'\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lcom/google/android/eq8;", "", "", "enabled", "<init>", "(Z)V", "", "remove", "()V", "Lcom/google/android/tc0;", "backEvent", "handleOnBackStarted", "(Lcom/google/android/tc0;)V", "handleOnBackProgressed", "handleOnBackPressed", "handleOnBackCancelled", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "addCloseable$activity", "(Ljava/lang/AutoCloseable;)V", "addCloseable", "removeCloseable$activity", "removeCloseable", "Lcom/google/android/de8;", "info", "Lcom/google/android/eq8$a;", "createNavigationEventHandler$activity", "(Lcom/google/android/de8;)Lcom/google/android/eq8$a;", "createNavigationEventHandler", "", "eventHandlers", "Ljava/util/List;", "value", "isEnabled", "Z", "()Z", "setEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "closeables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "a", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class eq8 {
    private boolean isEnabled;
    private final List<a> eventHandlers = new ArrayList();
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/google/android/eq8$a;", "Lcom/google/android/md8;", "Lcom/google/android/de8;", "Lcom/google/android/eq8;", "onBackPressedCallback", "info", "<init>", "(Lcom/google/android/eq8;Lcom/google/android/de8;)V", "Lcom/google/android/jd8;", "event", "", "s", "(Lcom/google/android/jd8;)V", "r", "q", "()V", "p", "h", "Lcom/google/android/eq8;", "", "value", "i", "Z", "C", "()Z", "D", "(Z)V", "isLifecycleActive", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends md8<de8> {

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        private final eq8 onBackPressedCallback;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        private boolean isLifecycleActive;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(eq8 eq8Var, de8 de8Var) {
            super(de8Var, eq8Var.getIsEnabled());
            Intrinsics.checkNotNullParameter(eq8Var, "onBackPressedCallback");
            Intrinsics.checkNotNullParameter(de8Var, "info");
            this.onBackPressedCallback = eq8Var;
            this.isLifecycleActive = true;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getIsLifecycleActive() {
            return this.isLifecycleActive;
        }

        public final void D(boolean z) {
            this.isLifecycleActive = z;
            y(z && this.onBackPressedCallback.getIsEnabled());
        }

        protected void p() {
            this.onBackPressedCallback.handleOnBackCancelled();
        }

        protected void q() {
            this.onBackPressedCallback.handleOnBackPressed();
        }

        protected void r(jd8 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.onBackPressedCallback.handleOnBackProgressed(new BackEventCompat(event));
        }

        protected void s(jd8 event) {
            Intrinsics.checkNotNullParameter(event, "event");
            this.onBackPressedCallback.handleOnBackStarted(new BackEventCompat(event));
        }
    }

    public eq8(boolean z) {
        this.isEnabled = z;
    }

    public final void addCloseable$activity(AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        this.closeables.add(closeable);
    }

    public final a createNavigationEventHandler$activity(de8 info) {
        Intrinsics.checkNotNullParameter(info, "info");
        a aVar = new a(this, info);
        this.eventHandlers.add(aVar);
        return aVar;
    }

    public void handleOnBackCancelled() {
    }

    public abstract void handleOnBackPressed();

    public void handleOnBackProgressed(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    public void handleOnBackStarted(BackEventCompat backEvent) {
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void remove() throws Exception {
        Iterator<AutoCloseable> it = this.closeables.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            bq8.a(it.next());
        }
        this.closeables.clear();
        Iterator<a> it2 = this.eventHandlers.iterator();
        while (it2.hasNext()) {
            it2.next().x();
        }
        this.eventHandlers.clear();
    }

    public final void removeCloseable$activity(AutoCloseable closeable) {
        Intrinsics.checkNotNullParameter(closeable, "closeable");
        this.closeables.remove(closeable);
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        for (a aVar : this.eventHandlers) {
            aVar.y(aVar.getIsLifecycleActive() && z);
        }
    }
}
