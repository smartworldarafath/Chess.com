package com.google.inputmethod;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J?\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\u000e¢\u0006\u0004\b\u000f\u0010\u0010R*\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/google/android/y39;", "", "<init>", "()V", "", "pathData", "a", "(Ljava/lang/String;)Lcom/google/android/y39;", "Ljava/util/ArrayList;", "Lcom/google/android/u39;", "Lkotlin/collections/ArrayList;", "nodes", "b", "(Ljava/lang/String;Ljava/util/ArrayList;)Ljava/util/ArrayList;", "", "d", "()Ljava/util/List;", "Ljava/util/ArrayList;", "", "[F", "nodeData", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class y39 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private ArrayList<u39> nodes;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private float[] nodeData = new float[64];

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ArrayList c(y39 y39Var, String str, ArrayList arrayList, int i, Object obj) {
        if ((i & 2) != 0) {
            arrayList = new ArrayList();
        }
        return y39Var.b(str, arrayList);
    }

    public final y39 a(String pathData) {
        ArrayList<u39> arrayList = this.nodes;
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.nodes = arrayList;
        } else {
            arrayList.clear();
        }
        b(pathData, arrayList);
        return this;
    }

    public final ArrayList<u39> b(String pathData, ArrayList<u39> nodes) {
        int i;
        char cCharAt;
        float fIntBitsToFloat;
        int length = pathData.length();
        int i2 = 0;
        while (i2 < length && Intrinsics.i(pathData.charAt(i2), 32) <= 0) {
            i2++;
        }
        while (length > i2 && Intrinsics.i(pathData.charAt(length - 1), 32) <= 0) {
            length--;
        }
        int i3 = 0;
        while (i2 < length) {
            while (true) {
                i = i2 + 1;
                cCharAt = pathData.charAt(i2);
                int i4 = cCharAt | ' ';
                if ((i4 - 97) * (i4 - 122) <= 0 && i4 != 101) {
                    break;
                }
                if (i >= length) {
                    cCharAt = 0;
                    break;
                }
                i2 = i;
            }
            if (cCharAt != 0) {
                int i5 = cCharAt | ' ';
                if (i5 != 122) {
                    while (i < length && Intrinsics.i(pathData.charAt(i), 32) <= 0) {
                        i++;
                    }
                    boolean z = i5 == 97;
                    int i6 = 0;
                    do {
                        long jA = (!z || 3 > i6 || i6 >= 5) ? n54.a(pathData, i, length) : n54.a(pathData, i, Math.min(i + 1, length));
                        i = (int) (jA >>> 32);
                        fIntBitsToFloat = Float.intBitsToFloat((int) (jA & 4294967295L));
                        if (!Float.isNaN(fIntBitsToFloat)) {
                            float[] fArr = this.nodeData;
                            int i7 = i6 + 1;
                            fArr[i6] = fIntBitsToFloat;
                            if (i7 >= fArr.length) {
                                float[] fArr2 = new float[i7 * 2];
                                this.nodeData = fArr2;
                                f.k(fArr, fArr2, 0, 0, fArr.length);
                            }
                            i6 = i7;
                        }
                        while (i < length && (Intrinsics.i(pathData.charAt(i), 32) <= 0 || pathData.charAt(i) == ',')) {
                            i++;
                        }
                        if (i >= length) {
                            break;
                        }
                    } while (!Float.isNaN(fIntBitsToFloat));
                    i3 = i6;
                }
                v39.a(cCharAt, nodes, this.nodeData, i3);
            }
            i2 = i;
        }
        return nodes;
    }

    public final List<u39> d() {
        ArrayList<u39> arrayList = this.nodes;
        return arrayList != null ? arrayList : m.p();
    }
}
