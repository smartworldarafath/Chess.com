package androidx.compose.ui.platform;

import com.google.inputmethod.e58;
import com.google.inputmethod.f16;
import com.google.inputmethod.o41;
import com.google.inputmethod.o48;
import com.google.inputmethod.pma;
import com.google.inputmethod.u17;
import com.google.inputmethod.w8e;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0010\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u0003R \u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner;", "Lcom/google/android/w8e;", "<init>", "()V", "", "viewId", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "C6", "(I)Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "", "onCleared", "Lcom/google/android/o48;", "Lcom/google/android/e58;", "a", "Lcom/google/android/o48;", "scopes", "RetainedValuesStoreEntry", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LifecycleRetainedValuesStoreOwner extends w8e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final o48<e58<RetainedValuesStoreEntry>> scopes = f16.c();

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\"\u0010\u001b\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010!\u001a\u0004\u0018\u00010\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\n\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry;", "", "<init>", "()V", "", "h", "Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$a;", "frameEndScheduler", "i", "(Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$a;)V", "d", "e", "Lcom/google/android/u17;", "a", "Lcom/google/android/u17;", "_retainedValuesStore", "Lcom/google/android/pma;", "b", "Lcom/google/android/pma;", "()Lcom/google/android/pma;", "retainedValuesStore", "", "c", "Z", "()Z", "g", "(Z)V", "isInUse", "Lcom/google/android/o41;", "value", "Lcom/google/android/o41;", "f", "(Lcom/google/android/o41;)V", "endRetainCancellationHandle", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class RetainedValuesStoreEntry {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final u17 _retainedValuesStore;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final pma retainedValuesStore;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean isInUse;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private o41 endRetainCancellationHandle;

        public RetainedValuesStoreEntry() {
            u17 u17Var = new u17(null, 1, null);
            this._retainedValuesStore = u17Var;
            this.retainedValuesStore = u17Var;
        }

        private final void f(o41 o41Var) {
            o41 o41Var2 = this.endRetainCancellationHandle;
            if (o41Var2 != null) {
                o41Var2.cancel();
            }
            this.endRetainCancellationHandle = o41Var;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final pma getRetainedValuesStore() {
            return this.retainedValuesStore;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsInUse() {
            return this.isInUse;
        }

        public final void d() {
            f(null);
            this._retainedValuesStore.a();
        }

        public final void e() {
            this.isInUse = false;
        }

        public final void g(boolean z) {
            this.isInUse = z;
        }

        public final void h() {
            if (this._retainedValuesStore.c()) {
                f(null);
            } else {
                this._retainedValuesStore.d();
            }
        }

        public final void i(a frameEndScheduler) {
            o41 o41VarA;
            if (this._retainedValuesStore.c()) {
                try {
                    o41VarA = frameEndScheduler.a(new Function0<Unit>() { // from class: androidx.compose.ui.platform.LifecycleRetainedValuesStoreOwner$RetainedValuesStoreEntry$stopRetainingExitedValues$1
                        {
                            super(0);
                        }

                        public /* bridge */ /* synthetic */ Object invoke() {
                            m54invoke();
                            return Unit.a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                        public final void m54invoke() {
                            this.this$0._retainedValuesStore.b();
                        }
                    });
                } catch (CancellationException unused) {
                    this._retainedValuesStore.b();
                    o41VarA = null;
                }
                f(o41VarA);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/platform/LifecycleRetainedValuesStoreOwner$a;", "", "Lkotlin/Function0;", "", "action", "Lcom/google/android/o41;", "a", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/o41;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        o41 a(Function0<Unit> action);
    }

    public final RetainedValuesStoreEntry C6(int viewId) {
        Object obj;
        o48<e58<RetainedValuesStoreEntry>> o48Var = this.scopes;
        e58<RetainedValuesStoreEntry> e58VarB = o48Var.b(viewId);
        if (e58VarB == null) {
            e58VarB = new e58<>(1);
            o48Var.r(viewId, e58VarB);
        }
        e58<RetainedValuesStoreEntry> e58Var = e58VarB;
        Object[] objArr = e58Var.content;
        int i = e58Var._size;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                obj = null;
                break;
            }
            obj = objArr[i2];
            if (!((RetainedValuesStoreEntry) obj).getIsInUse()) {
                break;
            }
            i2++;
        }
        RetainedValuesStoreEntry retainedValuesStoreEntry = (RetainedValuesStoreEntry) obj;
        if (retainedValuesStoreEntry == null) {
            retainedValuesStoreEntry = new RetainedValuesStoreEntry();
            e58Var.n(retainedValuesStoreEntry);
        }
        retainedValuesStoreEntry.g(true);
        return retainedValuesStoreEntry;
    }

    @Override // com.google.inputmethod.w8e
    protected void onCleared() {
        o48<e58<RetainedValuesStoreEntry>> o48Var = this.scopes;
        int[] iArr = o48Var.keys;
        Object[] objArr = o48Var.values;
        long[] jArr = o48Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        int i4 = (i << 3) + i3;
                        int i5 = iArr[i4];
                        e58 e58Var = (e58) objArr[i4];
                        Object[] objArr2 = e58Var.content;
                        int i6 = e58Var._size;
                        for (int i7 = 0; i7 < i6; i7++) {
                            ((RetainedValuesStoreEntry) objArr2[i7]).d();
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }
}
