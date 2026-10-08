package androidx.compose.p002material3;

import androidx.compose.p002material3.o2;
import androidx.compose.p004runtime.s0;
import com.google.inputmethod.j7d;
import com.google.inputmethod.k0b;
import com.google.inputmethod.mwb;
import com.google.inputmethod.n0b;
import com.google.inputmethod.o0b;
import com.google.inputmethod.o58;
import com.google.inputmethod.q48;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u0000 \"2\u00020\u0001:\u0001\tB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\u00058\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR+\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u008e\u0002¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0012\u0010\u0016R\u0017\u0010\u001c\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001f\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR$\u0010#\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0015\"\u0004\b\"\u0010\u0016R$\u0010$\u001a\u00020\u00022\u0006\u0010 \u001a\u00020\u00028V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0015\"\u0004\b\u001d\u0010\u0016¨\u0006%"}, d2 = {"Landroidx/compose/material3/o2;", "Lcom/google/android/j7d;", "", "initialHour", "initialMinute", "", "is24Hour", "<init>", "(IIZ)V", "a", "Z", "g", "()Z", "set24hour", "(Z)V", "is24hour", "Landroidx/compose/material3/m2;", "<set-?>", "b", "Lcom/google/android/o58;", "c", "()I", "(I)V", "selection", "Lcom/google/android/q48;", "Lcom/google/android/q48;", "getHourState", "()Lcom/google/android/q48;", "hourState", "d", "getMinuteState", "minuteState", "value", "f", "e", "minute", "hour", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class o2 implements j7d {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean is24hour;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final o58 selection;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final q48 hourState;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final q48 minuteState;

    /* JADX INFO: renamed from: androidx.compose.material3.o2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\f\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/material3/o2$a;", "", "<init>", "()V", "Lcom/google/android/k0b;", "Landroidx/compose/material3/o2;", "c", "()Lcom/google/android/k0b;", "material3"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(o0b o0bVar, o2 o2Var) {
            return m.s(new Object[]{Integer.valueOf(o2Var.a()), Integer.valueOf(o2Var.f()), Boolean.valueOf(o2Var.getIs24hour())});
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final o2 e(List list) {
            Object obj = list.get(0);
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue = ((Integer) obj).intValue();
            Object obj2 = list.get(1);
            Intrinsics.h(obj2, "null cannot be cast to non-null type kotlin.Int");
            int iIntValue2 = ((Integer) obj2).intValue();
            Object obj3 = list.get(2);
            Intrinsics.h(obj3, "null cannot be cast to non-null type kotlin.Boolean");
            return new o2(iIntValue, iIntValue2, ((Boolean) obj3).booleanValue());
        }

        public final k0b<o2, ?> c() {
            return n0b.e(new Function2() { // from class: androidx.compose.material3.n2
                public final Object invoke(Object obj, Object obj2) {
                    return o2.Companion.d((o0b) obj, (o2) obj2);
                }
            }, new Function1() { // from class: com.google.android.k7d
                public final Object invoke(Object obj) {
                    return o2.Companion.e((List) obj);
                }
            });
        }

        private Companion() {
        }
    }

    public o2(int i, int i2, boolean z) {
        if (i < 0 || i >= 24) {
            throw new IllegalArgumentException("initialHour should in [0..23] range");
        }
        if (i2 < 0 || i2 >= 60) {
            throw new IllegalArgumentException("initialMinute should be in [0..59] range");
        }
        this.is24hour = z;
        this.selection = s0.e(m2.c(m2.INSTANCE.a()), null, 2, null);
        this.hourState = mwb.a(i);
        this.minuteState = mwb.a(i2);
    }

    @Override // com.google.inputmethod.j7d
    public int a() {
        return this.hourState.getIntValue();
    }

    @Override // com.google.inputmethod.j7d
    public void b(int i) {
        this.selection.setValue(m2.c(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.j7d
    public int c() {
        return ((m2) this.selection.getValue()).getValue();
    }

    @Override // com.google.inputmethod.j7d
    public void d(int i) {
        this.hourState.f(i);
    }

    @Override // com.google.inputmethod.j7d
    public void e(int i) {
        this.minuteState.f(i);
    }

    @Override // com.google.inputmethod.j7d
    public int f() {
        return this.minuteState.getIntValue();
    }

    @Override // com.google.inputmethod.j7d
    /* JADX INFO: renamed from: g, reason: from getter */
    public boolean getIs24hour() {
        return this.is24hour;
    }
}
