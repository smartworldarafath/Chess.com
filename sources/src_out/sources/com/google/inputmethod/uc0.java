package com.google.inputmethod;

import com.google.android.de8;
import com.google.android.jd8;
import com.google.android.md8;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"Lcom/google/android/uc0;", "", "Lcom/google/android/de8;", "info", "<init>", "(Lcom/google/android/de8;)V", "Lcom/google/android/tc0;", "event", "", "g", "(Lcom/google/android/tc0;)V", "f", "e", "()V", "d", "a", "Lcom/google/android/de8;", "getInfo", "()Lcom/google/android/de8;", "Lcom/google/android/eq8;", "b", "Lcom/google/android/eq8;", "()Lcom/google/android/eq8;", "onBackPressedCallback", "Lcom/google/android/md8;", "c", "Lcom/google/android/md8;", "()Lcom/google/android/md8;", "navigationEventHandler", "", "value", "()Z", "h", "(Z)V", "isBackEnabled", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class uc0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final de8 info;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final eq8 onBackPressedCallback = new b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final md8<de8> navigationEventHandler;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"com/google/android/uc0$a", "Lcom/google/android/md8;", "Lcom/google/android/de8;", "Lcom/google/android/jd8;", "event", "", "s", "(Lcom/google/android/jd8;)V", "r", "q", "()V", "p", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends md8<de8> {
        a(de8 de8Var) {
            super(de8Var, false);
        }

        protected void p() {
            uc0.this.d();
        }

        protected void q() {
            uc0.this.e();
        }

        protected void r(jd8 event) {
            uc0.this.f(new BackEventCompat(event));
        }

        protected void s(jd8 event) {
            uc0.this.g(new BackEventCompat(event));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"com/google/android/uc0$b", "Lcom/google/android/eq8;", "Lcom/google/android/tc0;", "backEvent", "", "handleOnBackStarted", "(Lcom/google/android/tc0;)V", "handleOnBackProgressed", "handleOnBackPressed", "()V", "handleOnBackCancelled", "activity-compose"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends eq8 {
        b() {
            super(false);
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackCancelled() {
            uc0.this.d();
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackPressed() {
            uc0.this.e();
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackProgressed(BackEventCompat backEvent) {
            uc0.this.f(backEvent);
        }

        @Override // com.google.inputmethod.eq8
        public void handleOnBackStarted(BackEventCompat backEvent) {
            uc0.this.g(backEvent);
        }
    }

    public uc0(de8 de8Var) {
        this.info = de8Var;
        this.navigationEventHandler = new a(de8Var);
    }

    public final md8<de8> a() {
        return this.navigationEventHandler;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final eq8 getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public boolean c() {
        return this.onBackPressedCallback.getIsEnabled() && this.navigationEventHandler.n();
    }

    public void d() {
    }

    public abstract void e();

    public void f(BackEventCompat event) {
    }

    public void g(BackEventCompat event) {
    }

    public void h(boolean z) {
        this.onBackPressedCallback.setEnabled(z);
        this.navigationEventHandler.y(z);
    }
}
