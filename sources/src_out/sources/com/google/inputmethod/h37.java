package com.google.inputmethod;

import com.google.android.q22;
import com.google.android.ui4;
import kotlin.Metadata;
import kotlin.Unit;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u001b\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0011\u0010\u001d\u001a\u00020\u00168F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018¨\u0006\u001e"}, d2 = {"Lcom/google/android/h37;", "", "Lcom/google/android/j26;", "interactionSource", "<init>", "(Lcom/google/android/j26;)V", "", "e", "(Lcom/google/android/q22;)Ljava/lang/Object;", "a", "Lcom/google/android/j26;", "", "b", "I", "Focused", "c", "Hovered", "d", "Pressed", "Lcom/google/android/q48;", "Lcom/google/android/q48;", "interactionState", "", "f", "()Z", "isFocused", "g", "isHovered", "h", "isPressed", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h37 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final j26 interactionSource;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int Focused = 1;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int Hovered = 2;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int Pressed = 4;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final q48 interactionState = mwb.a(0);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a<T> implements ui4 {
        final /* synthetic */ e58<i26> a;
        final /* synthetic */ h37 b;

        a(e58<i26> e58Var, h37 h37Var) {
            this.a = e58Var;
            this.b = h37Var;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(i26 i26Var, q22<? super Unit> q22Var) {
            int i;
            if ((i26Var instanceof yf5) || (i26Var instanceof lk4) || (i26Var instanceof androidx.compose.foundation.interaction.a.b)) {
                this.a.n(i26Var);
            } else if (i26Var instanceof zf5) {
                this.a.z(((zf5) i26Var).getEnter());
            } else if (i26Var instanceof mk4) {
                this.a.z(((mk4) i26Var).getFocus());
            } else if (i26Var instanceof androidx.compose.foundation.interaction.a.c) {
                this.a.z(((androidx.compose.foundation.interaction.a.c) i26Var).getPress());
            } else if (i26Var instanceof androidx.compose.p001foundation.interaction.a.C0016a) {
                this.a.z(((androidx.compose.p001foundation.interaction.a.C0016a) i26Var).getPress());
            }
            e58<i26> e58Var = this.a;
            h37 h37Var = this.b;
            Object[] objArr = e58Var.content;
            int i2 = e58Var._size;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i26 i26Var2 = (i26) objArr[i4];
                if (i26Var2 instanceof yf5) {
                    i = h37Var.Hovered;
                } else if (i26Var2 instanceof lk4) {
                    i = h37Var.Focused;
                } else {
                    if (i26Var2 instanceof androidx.compose.foundation.interaction.a.b) {
                        i = h37Var.Pressed;
                    }
                }
                i3 |= i;
            }
            this.b.interactionState.f(i3);
            return Unit.a;
        }
    }

    public h37(j26 j26Var) {
        this.interactionSource = j26Var;
    }

    public final Object e(q22<? super Unit> q22Var) {
        Object objCollect = this.interactionSource.c().collect(new a(new e58(0, 1, null), this), q22Var);
        return objCollect == kotlin.coroutines.intrinsics.a.g() ? objCollect : Unit.a;
    }

    public final boolean f() {
        return (this.interactionState.getIntValue() & this.Focused) != 0;
    }

    public final boolean g() {
        return (this.interactionState.getIntValue() & this.Hovered) != 0;
    }

    public final boolean h() {
        return (this.interactionState.getIntValue() & this.Pressed) != 0;
    }
}
