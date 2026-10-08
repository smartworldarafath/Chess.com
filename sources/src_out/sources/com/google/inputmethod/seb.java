package com.google.inputmethod;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import com.google.android.fh6;
import com.google.android.ws4;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0002B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u000e\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\f¢\u0006\u0004\b\u0010\u0010\u000fJ(\u0010\u0012\u001a\u001a\u0012\u0016\u0012\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00030\u0011H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u0016\u001a\u00020\u0015\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0014\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J$\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0086\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001d\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u00152\u0006\u0010 \u001a\u00020\u0000H\u0000¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u0000¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00182\b\u0010$\u001a\u0004\u0018\u00010\u0005H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R,\u00102\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00050-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R*\u00105\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u00104R\"\u00108\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00107R\"\u0010=\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00109\u001a\u0004\b:\u0010\u001c\"\u0004\b;\u0010<R\"\u0010@\u001a\u00020\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u00109\u001a\u0004\b>\u0010\u001c\"\u0004\b?\u0010<R \u0010D\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0004\u0018\u00010A8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/google/android/seb;", "Lcom/google/android/nfb;", "", "", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "<init>", "()V", "T", "key", "i", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Ljava/lang/Object;", "Lkotlin/Function0;", "defaultValue", "n", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "o", "", "iterator", "()Ljava/util/Iterator;", "value", "", "b", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "d", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;)Z", "e", "()Z", "child", "t", "(Lcom/google/android/seb;)V", "peer", "c", "f", "()Lcom/google/android/seb;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/google/android/k58;", "a", "Lcom/google/android/k58;", "q", "()Lcom/google/android/k58;", "props", "", "Ljava/util/Map;", "mapWrapper", "Landroidx/collection/d;", "Landroidx/collection/d;", "_accessibilityExtraKeys", "Z", "s", "v", "(Z)V", "isMergingSemanticsOfDescendants", "r", "u", "isClearingSemantics", "Landroidx/collection/ScatterSet;", "j", "()Landroidx/collection/ScatterSet;", "accessibilityExtraKeys", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class seb implements nfb, Iterable<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>>, fh6 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k58<SemanticsPropertyKey<?>, Object> props = k4b.c();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Map<SemanticsPropertyKey<?>, ? extends Object> mapWrapper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private d<SemanticsPropertyKey<?>> _accessibilityExtraKeys;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean isMergingSemanticsOfDescendants;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isClearingSemantics;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.nfb
    public <T> void b(SemanticsPropertyKey<T> key, T value) {
        if ((value instanceof AccessibilityAction) && d(key)) {
            Object objE = this.props.e(key);
            Intrinsics.h(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
            AccessibilityAction accessibilityAction = (AccessibilityAction) objE;
            k58<SemanticsPropertyKey<?>, Object> k58Var = this.props;
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) value;
            String label = accessibilityAction2.getLabel();
            if (label == null) {
                label = accessibilityAction.getLabel();
            }
            ws4 ws4VarA = accessibilityAction2.a();
            if (ws4VarA == null) {
                ws4VarA = accessibilityAction.a();
            }
            k58Var.x(key, new AccessibilityAction(label, ws4VarA));
        } else {
            this.props.x(key, value);
        }
        if (key.getAccessibilityExtraKey() != null) {
            if (this._accessibilityExtraKeys == null) {
                this._accessibilityExtraKeys = l4b.b();
            }
            d<SemanticsPropertyKey<?>> dVar = this._accessibilityExtraKeys;
            if (dVar != null) {
                dVar.h(key);
            }
        }
    }

    public final void c(seb peer) {
        if (peer.isMergingSemanticsOfDescendants) {
            this.isMergingSemanticsOfDescendants = true;
        }
        if (peer.isClearingSemantics) {
            this.isClearingSemantics = true;
        }
        k58<SemanticsPropertyKey<?>, Object> k58Var = peer.props;
        Object[] objArr = k58Var.keys;
        Object[] objArr2 = k58Var.values;
        long[] jArr = k58Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8;
                int i3 = 8 - ((~(i - length)) >>> 31);
                int i4 = 0;
                while (i4 < i3) {
                    if ((255 & j) < 128) {
                        int i5 = (i << 3) + i4;
                        Object obj = objArr[i5];
                        Object obj2 = objArr2[i5];
                        SemanticsPropertyKey<?> semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        if (!this.props.b(semanticsPropertyKey)) {
                            this.props.x(semanticsPropertyKey, obj2);
                        } else if (obj2 instanceof AccessibilityAction) {
                            Object objE = this.props.e(semanticsPropertyKey);
                            Intrinsics.h(objE, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            AccessibilityAction accessibilityAction = (AccessibilityAction) objE;
                            k58<SemanticsPropertyKey<?>, Object> k58Var2 = this.props;
                            String label = accessibilityAction.getLabel();
                            if (label == null) {
                                label = ((AccessibilityAction) obj2).getLabel();
                            }
                            String str = label;
                            ws4 ws4VarA = accessibilityAction.a();
                            if (ws4VarA == null) {
                                ws4VarA = ((AccessibilityAction) obj2).a();
                            }
                            k58Var2.x(semanticsPropertyKey, new AccessibilityAction(str, ws4VarA));
                        }
                    }
                    j >>= i2;
                    i4++;
                    i2 = i2;
                }
                if (i3 != i2) {
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

    public final <T> boolean d(SemanticsPropertyKey<T> key) {
        return this.props.c(key);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x004d A[LOOP:0: B:5:0x000f->B:18:0x004d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0050 A[SYNTHETIC] */
    public final boolean e() {
        k58<SemanticsPropertyKey<?>, Object> k58Var = this.props;
        Object[] objArr = k58Var.keys;
        Object[] objArr2 = k58Var.values;
        long[] jArr = k58Var.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            if (((SemanticsPropertyKey) obj).getIsImportantForAccessibility()) {
                                return true;
                            }
                        }
                        j >>= 8;
                    }
                    if (i2 == 8) {
                        if (i != length) {
                            i++;
                        }
                    }
                } else if (i != length) {
                    i++;
                }
            }
        }
        return false;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof seb)) {
            return false;
        }
        seb sebVar = (seb) other;
        return Intrinsics.e(this.props, sebVar.props) && this.isMergingSemanticsOfDescendants == sebVar.isMergingSemanticsOfDescendants && this.isClearingSemantics == sebVar.isClearingSemantics;
    }

    public final seb f() {
        seb sebVar = new seb();
        sebVar.isMergingSemanticsOfDescendants = this.isMergingSemanticsOfDescendants;
        sebVar.isClearingSemantics = this.isClearingSemantics;
        sebVar.props.s(this.props);
        return sebVar;
    }

    public int hashCode() {
        return (((this.props.hashCode() * 31) + Boolean.hashCode(this.isMergingSemanticsOfDescendants)) * 31) + Boolean.hashCode(this.isClearingSemantics);
    }

    public final <T> T i(SemanticsPropertyKey<T> key) {
        T t = (T) this.props.e(key);
        if (t != null) {
            return t;
        }
        throw new IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<? extends SemanticsPropertyKey<?>, ? extends Object>> iterator() {
        Map<SemanticsPropertyKey<?>, ? extends Object> mapA = this.mapWrapper;
        if (mapA == null) {
            mapA = this.props.a();
            this.mapWrapper = mapA;
        }
        return mapA.entrySet().iterator();
    }

    public final ScatterSet<SemanticsPropertyKey<?>> j() {
        return this._accessibilityExtraKeys;
    }

    public final <T> T n(SemanticsPropertyKey<T> key, Function0<? extends T> defaultValue) {
        T t = (T) this.props.e(key);
        return t == null ? (T) defaultValue.invoke() : t;
    }

    public final <T> T o(SemanticsPropertyKey<T> key, Function0<? extends T> defaultValue) {
        T t = (T) this.props.e(key);
        return t == null ? (T) defaultValue.invoke() : t;
    }

    public final k58<SemanticsPropertyKey<?>, Object> q() {
        return this.props;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsClearingSemantics() {
        return this.isClearingSemantics;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final boolean getIsMergingSemanticsOfDescendants() {
        return this.isMergingSemanticsOfDescendants;
    }

    public final void t(seb child) {
        k58<SemanticsPropertyKey<?>, Object> k58Var = child.props;
        Object[] objArr = k58Var.keys;
        Object[] objArr2 = k58Var.values;
        long[] jArr = k58Var.metadata;
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
                        Object obj = objArr[i4];
                        Object obj2 = objArr2[i4];
                        SemanticsPropertyKey<?> semanticsPropertyKey = (SemanticsPropertyKey) obj;
                        Object objE = this.props.e(semanticsPropertyKey);
                        Intrinsics.h(semanticsPropertyKey, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsPropertyKey<kotlin.Any?>");
                        Object objD = semanticsPropertyKey.d(objE, obj2);
                        if (objD != null) {
                            this.props.x(semanticsPropertyKey, objD);
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

    /* JADX WARN: Code duplicated, block: B:20:0x007b A[DONT_INVERT, PHI: r4
  0x007b: PHI (r4v4 java.lang.String) = (r4v3 java.lang.String), (r4v5 java.lang.String) binds: [B:12:0x0042, B:19:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x007d A[LOOP:0: B:11:0x0034->B:21:0x007d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0080 A[EDGE_INSN: B:25:0x0080->B:22:0x0080 BREAK  A[LOOP:0: B:11:0x0034->B:21:0x007d], SYNTHETIC] */
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.isMergingSemanticsOfDescendants) {
            sb.append("");
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.isClearingSemantics) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        k58<SemanticsPropertyKey<?>, Object> k58Var = this.props;
        Object[] objArr = k58Var.keys;
        Object[] objArr2 = k58Var.values;
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
                            int i4 = (i << 3) + i3;
                            Object obj = objArr[i4];
                            Object obj2 = objArr2[i4];
                            sb.append(str);
                            sb.append(((SemanticsPropertyKey) obj).getName());
                            sb.append(" : ");
                            sb.append(obj2);
                            str = ", ";
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return af6.a(this, null) + "{ " + ((Object) sb) + " }";
    }

    public final void u(boolean z) {
        this.isClearingSemantics = z;
    }

    public final void v(boolean z) {
        this.isMergingSemanticsOfDescendants = z;
    }
}
