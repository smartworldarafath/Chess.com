package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u001a\u001d\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a'\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u001e\u0010\u001d\u001a\u00020\u0004*\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001b\u0010\u0017\"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010!\u001a\u0004\b\u001f\u0010 \"\u001e\u0010\u001d\u001a\u00020\u0004*\u00020\u001e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010!\u001a\u0004\b\"\u0010 \"\u001e\u0010\u001a\u001a\u00020\u0004*\u00020#8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0018\u0010&\u001a\u0004\b$\u0010%\"\u001e\u0010\u001d\u001a\u00020\u0004*\u00020#8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010%¨\u0006("}, d2 = {"", "value", "Lcom/google/android/d0d;", "type", "Lcom/google/android/b0d;", "a", "(FJ)J", "", "unitType", "v", "k", "(JF)J", "", "b", "(J)V", "c", "(JJ)V", "start", "stop", "fraction", "j", "(JJF)J", "h", "(F)J", "getSp$annotations", "(F)V", "sp", "e", "getEm$annotations", "em", "", "g", "(D)J", "(D)V", "d", "", "i", "(I)J", "(I)V", "f", "ui-unit"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0d {
    public static final long a(float f, long j) {
        return k(j, f);
    }

    public static final void b(long j) {
        if (b0d.f(j) == 0) {
            bx5.a("Cannot perform operation for Unspecified type.");
        }
    }

    public static final void c(long j, long j2) {
        if (!((b0d.f(j) == 0 || b0d.f(j2) == 0) ? false : true)) {
            bx5.a("Cannot perform operation for Unspecified type.");
        }
        if (d0d.g(b0d.g(j), b0d.g(j2))) {
            return;
        }
        bx5.a("Cannot perform operation for " + ((Object) d0d.i(b0d.g(j))) + " and " + ((Object) d0d.i(b0d.g(j2))));
    }

    public static final long d(double d) {
        return k(8589934592L, (float) d);
    }

    public static final long e(float f) {
        return k(8589934592L, f);
    }

    public static final long f(int i) {
        return k(8589934592L, i);
    }

    public static final long g(double d) {
        return k(4294967296L, (float) d);
    }

    public static final long h(float f) {
        return k(4294967296L, f);
    }

    public static final long i(int i) {
        return k(4294967296L, i);
    }

    public static final long j(long j, long j2, float f) {
        c(j, j2);
        return k(b0d.f(j), rh7.b(b0d.h(j), b0d.h(j2), f));
    }

    public static final long k(long j, float f) {
        return b0d.c(j | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
    }
}
