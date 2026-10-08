package com.google.inputmethod;

import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0004\u001a\u0019\u0010\t\u001a\u00020\u00022\b\b\u0001\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\" \u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u000b\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/google/android/ff3;", "size", "Lcom/google/android/ea2;", "c", "(F)Lcom/google/android/ea2;", "", "a", "", "percent", "b", "(I)Lcom/google/android/ea2;", "Lcom/google/android/ea2;", "getZeroCornerSize", "()Lcom/google/android/ea2;", "getZeroCornerSize$annotations", "()V", "ZeroCornerSize", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class fa2 {
    private static final ea2 a = new a();

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/google/android/fa2$a", "Lcom/google/android/ea2;", "", "Lcom/google/android/tsb;", "shapeSize", "Lcom/google/android/f43;", "density", "", "a", "(JLcom/google/android/f43;)F", "", "toString", "()Ljava/lang/String;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements ea2 {
        a() {
        }

        @Override // com.google.inputmethod.ea2
        public float a(long shapeSize, f43 density) {
            return 0.0f;
        }

        public String toString() {
            return "ZeroCornerSize";
        }
    }

    public static final ea2 a(float f) {
        return new CornerSize(f);
    }

    public static final ea2 b(int i) {
        return new CornerSize(i);
    }

    public static final ea2 c(float f) {
        return new CornerSize(f, null);
    }
}
