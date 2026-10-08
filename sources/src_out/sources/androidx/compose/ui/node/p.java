package androidx.compose.ui.node;

import androidx.compose.ui.layout.s;
import com.google.inputmethod.dee;
import com.google.inputmethod.k58;
import com.google.inputmethod.l4b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002¢\u0006\u0004\b\u000f\u0010\u0010J?\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u0004\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u0015\u0018\u00010\u0014¢\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000b¢\u0006\u0004\b\u001b\u0010\u0003R\u0016\u0010\u001e\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001dR\u001e\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010#R\u0016\u0010'\u001a\u00020%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&R\"\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00160\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010(R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(¨\u0006,"}, d2 = {"Landroidx/compose/ui/node/p;", "", "<init>", "()V", "Landroidx/compose/ui/layout/s;", "ruler", "", "defaultValue", "c", "(Landroidx/compose/ui/layout/s;F)F", "value", "", "e", "(Landroidx/compose/ui/layout/s;F)V", "", "b", "(Landroidx/compose/ui/layout/s;)Z", "isLookingAhead", "Landroidx/compose/ui/node/LookaheadCapablePlaceable;", "node", "Lcom/google/android/k58;", "Landroidx/collection/d;", "Lcom/google/android/dee;", "Landroidx/compose/ui/node/LayoutNode;", "rulerReaders", "d", "(ZLandroidx/compose/ui/node/LookaheadCapablePlaceable;Lcom/google/android/k58;)V", "a", "", "I", "size", "", "[Landroidx/compose/ui/layout/s;", "rulers", "", "[F", "values", "", "[B", "accessFlags", "Landroidx/collection/d;", "layoutNodes", "f", "newRulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private s[] rulers = new s[32];

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private float[] values = new float[32];

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private byte[] accessFlags = new byte[32];

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private androidx.collection.d<dee<LayoutNode>> layoutNodes = l4b.b();

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final androidx.collection.d<s> newRulers = l4b.b();

    public final void a() {
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            this.rulers[i2] = null;
            this.values[i2] = Float.NaN;
            this.accessFlags[i2] = 0;
        }
        this.size = 0;
    }

    public final boolean b(s ruler) {
        return kotlin.collections.f.h0(this.rulers, ruler);
    }

    public final float c(s ruler, float defaultValue) {
        int iE0 = kotlin.collections.f.E0(this.rulers, ruler);
        return iE0 < 0 ? defaultValue : this.values[iE0];
    }

    /* JADX WARN: Code duplicated, block: B:64:0x012a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x012c A[LOOP:5: B:51:0x00f1->B:65:0x012c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x012f A[EDGE_INSN: B:84:0x012f->B:66:0x012f BREAK  A[LOOP:5: B:51:0x00f1->B:65:0x012c], SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    public final void d(boolean isLookingAhead, LookaheadCapablePlaceable node, k58<s, androidx.collection.d<dee<LayoutNode>>> rulerReaders) {
        char c;
        char c2;
        long j;
        long j2;
        LayoutNode layoutNode;
        char c3;
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            byte b = this.accessFlags[i2];
            if (b == 3) {
                androidx.collection.d<s> dVar = this.newRulers;
                s sVar = this.rulers[i2];
                Intrinsics.g(sVar);
                dVar.x(sVar);
            } else if (b != 0 && rulerReaders != null) {
                s sVar2 = this.rulers[i2];
                Intrinsics.g(sVar2);
                androidx.collection.d<dee<LayoutNode>> dVarU = rulerReaders.u(sVar2);
                if (dVarU != null) {
                    this.layoutNodes.v(dVarU);
                }
            }
        }
        int i3 = this.size;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            c = 2;
            if (i4 >= i3) {
                break;
            }
            byte[] bArr = this.accessFlags;
            if (bArr[i4] == 2) {
                i5++;
            } else if (i5 > 0) {
                s[] sVarArr = this.rulers;
                sVarArr[i4 - i5] = sVarArr[i4];
            }
            bArr[i4] = 2;
            i4++;
        }
        int i6 = this.size;
        for (int i7 = i6 - i5; i7 < i6; i7++) {
            this.rulers[i7] = null;
        }
        this.size -= i5;
        LookaheadCapablePlaceable lookaheadCapablePlaceableB1 = node.B1();
        androidx.collection.d<s> dVar2 = this.newRulers;
        Object[] objArr = dVar2.elements;
        long[] jArr = dVar2.metadata;
        int length = jArr.length - 2;
        char c4 = 7;
        if (length >= 0) {
            int i8 = 0;
            j = 128;
            while (true) {
                long j3 = jArr[i8];
                j2 = 255;
                if ((((~j3) << c4) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    int i10 = 0;
                    while (i10 < i9) {
                        if ((j3 & 255) < 128) {
                            (lookaheadCapablePlaceableB1 == null ? node : lookaheadCapablePlaceableB1).N1((s) objArr[(i8 << 3) + i10]);
                        }
                        j3 >>= 8;
                        i10++;
                        c = c;
                        c4 = c4;
                    }
                    c3 = c;
                    c2 = c4;
                    if (i9 != 8) {
                        break;
                    }
                } else {
                    c3 = c;
                    c2 = c4;
                }
                if (i8 == length) {
                    break;
                }
                i8++;
                c = c3;
                c4 = c2;
            }
        } else {
            c2 = 7;
            j = 128;
            j2 = 255;
        }
        this.newRulers.m();
        androidx.collection.d<dee<LayoutNode>> dVar3 = this.layoutNodes;
        Object[] objArr2 = dVar3.elements;
        long[] jArr2 = dVar3.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i11 = 0;
            while (true) {
                long j4 = jArr2[i11];
                if ((((~j4) << c2) & j4 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i11 != length2) {
                        break;
                        break;
                    }
                    i11++;
                } else {
                    int i12 = 8 - ((~(i11 - length2)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((j4 & j2) < j && (layoutNode = (LayoutNode) ((dee) objArr2[(i11 << 3) + i13]).get()) != null) {
                            if (isLookingAhead) {
                                layoutNode.D1(false);
                            } else {
                                layoutNode.H1(false);
                            }
                        }
                        j4 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    } else if (i11 != length2) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
        }
        this.layoutNodes.m();
    }

    public final void e(s ruler, float value) {
        int iE0 = kotlin.collections.f.E0(this.rulers, ruler);
        if (iE0 >= 0) {
            float[] fArr = this.values;
            if (fArr[iE0] != value) {
                fArr[iE0] = value;
                this.accessFlags[iE0] = 1;
                return;
            } else {
                byte[] bArr = this.accessFlags;
                if (bArr[iE0] == 2) {
                    bArr[iE0] = 0;
                    return;
                }
                return;
            }
        }
        int i = this.size;
        s[] sVarArr = this.rulers;
        if (i == sVarArr.length) {
            int i2 = i * 2;
            Object[] objArrCopyOf = Arrays.copyOf(sVarArr, i2);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
            this.rulers = (s[]) objArrCopyOf;
            float[] fArrCopyOf = Arrays.copyOf(this.values, i2);
            Intrinsics.checkNotNullExpressionValue(fArrCopyOf, "copyOf(...)");
            this.values = fArrCopyOf;
            byte[] bArrCopyOf = Arrays.copyOf(this.accessFlags, i2);
            Intrinsics.checkNotNullExpressionValue(bArrCopyOf, "copyOf(...)");
            this.accessFlags = bArrCopyOf;
        }
        this.rulers[i] = ruler;
        this.accessFlags[i] = 3;
        this.values[i] = value;
        this.size++;
    }
}
