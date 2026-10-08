package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.tooling.b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\b!\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000bJ-\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\r0\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ3\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\u0010\u0016\u001a\u0004\u0018\u00010\u00062\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H&¢\u0006\u0004\b%\u0010&R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(¨\u0006*"}, d2 = {"Lcom/google/android/gq1;", "", "<init>", "()V", "", "groupKey", "Lcom/google/android/a25;", "groupSourceInformation", "child", "", "b", "(ILcom/google/android/a25;Ljava/lang/Object;)V", "targetChild", "Lcom/google/android/iq1;", "c", "(ILcom/google/android/a25;Ljava/lang/Object;)Lcom/google/android/iq1;", "group", "h", "(Ljava/lang/Object;)Lcom/google/android/a25;", "", "e", "(Lcom/google/android/a25;)Z", "sourceInformation", "target", "a", "(ILcom/google/android/a25;Ljava/lang/Object;)Z", "", "i", "()Ljava/util/List;", "objectKey", "childData", "f", "(ILjava/lang/Object;Lcom/google/android/a25;Ljava/lang/Object;)V", "Lcom/google/android/mg;", "anchor", "g", "(Lcom/google/android/mg;)Lcom/google/android/a25;", "d", "(Lcom/google/android/mg;)I", "", "Ljava/util/List;", "_trace", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class gq1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final List<ComposeStackTraceFrame> _trace = new ArrayList();

    private final boolean a(int groupKey, a25 sourceInformation, Object target) {
        ArrayList<Object> arrayListA = sourceInformation.a();
        boolean z = false;
        if (arrayListA == null) {
            if (!sourceInformation.getClosed()) {
                b(groupKey, sourceInformation, null);
                return true;
            }
            int dataStartOffset = sourceInformation.getDataStartOffset();
            int dataEndOffset = sourceInformation.getDataEndOffset();
            if (target instanceof Integer) {
                Number number = (Number) target;
                int iIntValue = number.intValue();
                if ((dataStartOffset <= iIntValue && iIntValue < dataEndOffset) || (dataStartOffset == dataEndOffset && dataStartOffset == number.intValue())) {
                    z = true;
                }
                if (z) {
                    b(sourceInformation.getKey(), sourceInformation, null);
                }
            }
            return z;
        }
        int size = arrayListA.size();
        for (int i = 0; i < size; i++) {
            Object obj = arrayListA.get(i);
            if (obj instanceof mg) {
                if (Intrinsics.e(obj, target)) {
                    b(sourceInformation.getKey(), sourceInformation, obj);
                    return true;
                }
            } else {
                if (!(obj instanceof a25)) {
                    throw new IllegalStateException(("Unexpected child source info " + obj).toString());
                }
                if (a(groupKey, (a25) obj, target)) {
                    b(sourceInformation.getKey(), sourceInformation, obj);
                    return true;
                }
            }
        }
        return false;
    }

    private final void b(int groupKey, a25 groupSourceInformation, Object child) {
        ComposeStackTraceFrame composeStackTraceFrameC = c(groupKey, groupSourceInformation, child);
        if (composeStackTraceFrameC != null) {
            this._trace.add(composeStackTraceFrameC);
        }
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    private final ComposeStackTraceFrame c(int groupKey, a25 groupSourceInformation, Object targetChild) {
        ArrayList<Object> arrayListA;
        String sourceInformation;
        gzb gzbVarE = (groupSourceInformation == null || (sourceInformation = groupSourceInformation.getSourceInformation()) == null) ? null : b.e(sourceInformation);
        if (gzbVarE == null) {
            return new ComposeStackTraceFrame(groupKey, null, null);
        }
        if (targetChild == null) {
            return new ComposeStackTraceFrame(groupKey, gzbVarE, null);
        }
        ArrayList<Object> arrayListA2 = groupSourceInformation.a();
        int i = 0;
        if (arrayListA2 != null) {
            int size = arrayListA2.size();
            int i2 = 0;
            for (int i3 = 0; i3 < size; i3++) {
                Object obj = arrayListA2.get(i3);
                if (Intrinsics.e(obj, targetChild)) {
                    break;
                }
                a25 a25VarH = h(obj);
                if (a25VarH != null && (a25VarH.getKey() == -127 || (a25VarH.getKey() == 0 && (obj instanceof mg) && d((mg) obj) == -127))) {
                    if ((a25VarH != null ? a25VarH.getSourceInformation() : null) == null) {
                        if (a25VarH != null && (arrayListA = a25VarH.a()) != null) {
                            int size2 = arrayListA.size();
                            for (int i4 = 0; i4 < size2; i4++) {
                                a25 a25VarH2 = h(arrayListA.get(i4));
                                if (a25VarH2 != null && e(a25VarH2)) {
                                    i2++;
                                }
                            }
                        }
                    } else if (a25VarH == null) {
                    }
                } else if (a25VarH == null && e(a25VarH)) {
                    i2++;
                }
            }
            i = i2;
        }
        return new ComposeStackTraceFrame(groupKey, gzbVarE, Integer.valueOf(i));
    }

    private final boolean e(a25 a25Var) {
        String sourceInformation = a25Var.getSourceInformation();
        return sourceInformation != null && h.Z(sourceInformation, "C", false, 2, (Object) null);
    }

    private final a25 h(Object group) {
        if (group instanceof mg) {
            return g((mg) group);
        }
        if (group instanceof a25) {
            return (a25) group;
        }
        throw new IllegalStateException(("Unexpected child source info " + group).toString());
    }

    public abstract int d(mg anchor);

    public final void f(int groupKey, Object objectKey, a25 sourceInformation, Object childData) {
        if (sourceInformation != null || Intrinsics.e(objectKey, d.INSTANCE.a())) {
            if (childData == null || sourceInformation == null) {
                b(groupKey, sourceInformation, null);
            } else {
                if (a(groupKey, sourceInformation, childData) || sourceInformation.getClosed()) {
                    return;
                }
                b(groupKey, sourceInformation, childData);
            }
        }
    }

    public abstract a25 g(mg anchor);

    public final List<ComposeStackTraceFrame> i() {
        return this._trace;
    }
}
