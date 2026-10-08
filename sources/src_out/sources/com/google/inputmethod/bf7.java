package com.google.inputmethod;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0003J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\u0003J\u000f\u0010\t\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\u0003R\u0016\u0010\f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\"\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012R\u0011\u0010\u0015\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0014¨\u0006\u0016"}, d2 = {"Lcom/google/android/bf7;", "Lcom/google/android/pma;", "<init>", "()V", "", "f", "a", "b", "e", "d", "", "Z", "isEnabled", "isDisposed", "c", "isContentComposed", "Lcom/google/android/hxa;", "", "Lcom/google/android/k58;", "keptExitedValues", "()Z", "isRetainingExitedValues", "runtime-retain"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class bf7 implements pma {
    public static final int e = 8;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean isContentComposed;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean isEnabled = true;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final k58<Object, Object> keptExitedValues = hxa.c(null, 1, null);

    /* JADX WARN: Code duplicated, block: B:24:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0068 A[LOOP:0: B:5:0x000d->B:25:0x0068, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006b A[EDGE_INSN: B:29:0x006b->B:26:0x006b BREAK  A[LOOP:0: B:5:0x000d->B:25:0x0068], SYNTHETIC] */
    private final void f() {
        k58<Object, Object> k58Var = this.keptExitedValues;
        Object[] objArr = k58Var.values;
        long[] jArr = k58Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            Object obj = objArr[(i << 3) + i3];
                            if (obj instanceof e58) {
                                Intrinsics.h(obj, "null cannot be cast to non-null type androidx.collection.MutableObjectList<V of androidx.compose.runtime.retain.impl.SafeMultiValueMap>");
                                e58 e58Var = (e58) obj;
                                Object[] objArr2 = e58Var.content;
                                int i4 = e58Var._size;
                                for (int i5 = 0; i5 < i4; i5++) {
                                    Object obj2 = objArr2[i5];
                                    if (obj2 instanceof mma) {
                                        ((mma) obj2).a();
                                    }
                                }
                            } else if (obj instanceof mma) {
                                ((mma) obj).a();
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    } else if (i != length) {
                        break;
                    } else {
                        i++;
                    }
                }
            }
        }
        hxa.a(this.keptExitedValues);
    }

    public final void a() {
        this.isEnabled = false;
        f();
    }

    public final void b() {
        this.isDisposed = true;
        a();
    }

    public final boolean c() {
        return this.isEnabled && !this.isContentComposed;
    }

    public void d() {
        if (this.isDisposed) {
            return;
        }
        if (this.isContentComposed) {
            fi9.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
        }
        f();
        this.isContentComposed = true;
    }

    public void e() {
        if (this.isDisposed) {
            return;
        }
        if (!this.isContentComposed) {
            fi9.a("ManagedValuesStore tried to leave composition twice. Is the store installed in multiple places?");
        }
        if (!hxa.d(this.keptExitedValues)) {
            fi9.a("Attempted to start retaining exited values with pending exited values");
        }
        this.isContentComposed = false;
    }
}
