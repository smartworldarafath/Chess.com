package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.bqd;
import com.google.android.mq9;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000 O2\u00020\u0001:\u0001RB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bJ\u001b\u0010\r\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J+\u0010\u0016\u001a\u00020\t2\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001a\u001a\u00060\tj\u0002`\u00182\n\u0010\u0019\u001a\u00060\tj\u0002`\u00182\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001a\u0010\u0017J/\u0010\u001b\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u0017J\u001b\u0010\u001d\u001a\u00020\f2\n\u0010\u001c\u001a\u00060\tj\u0002`\u0018H\u0002¢\u0006\u0004\b\u001d\u0010\u000eJ\u001f\u0010\u001e\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\fH\u0002¢\u0006\u0004\b \u0010\bJ\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u000eJ\u0019\u0010#\u001a\u00020\f2\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b#\u0010\u000eJ\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001d\u0010)\u001a\u00020\f2\u0006\u0010'\u001a\u00020\t2\u0006\u0010(\u001a\u00020\t¢\u0006\u0004\b)\u0010\u001fJ\u001d\u0010*\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b*\u0010\u001fJ/\u0010-\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010+\u001a\u00020\t2\b\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\u0004\u0018\u00010/2\n\u0010\u0013\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b0\u00101J/\u00105\u001a\u00020/2\n\u00102\u001a\u00060\tj\u0002`\n2\b\u00104\u001a\u0004\u0018\u0001032\n\u0010\u0013\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b5\u00106J-\u00107\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b7\u0010\u0017J%\u00108\u001a\u00060\tj\u0002`\u00182\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\u0006\u0010\u0015\u001a\u00020\t¢\u0006\u0004\b8\u00109J%\u0010<\u001a\u00060\tj\u0002`\n2\u0006\u0010:\u001a\u00020\u00002\n\u0010;\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b<\u0010=J%\u0010?\u001a\u00020\f2\n\u0010\u0013\u001a\u00060\tj\u0002`\n2\n\u0010>\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b?\u0010\u001fJ\u0019\u0010A\u001a\u00020@2\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\bA\u0010BJ\u0015\u0010E\u001a\u00020D2\u0006\u0010C\u001a\u00020@¢\u0006\u0004\bE\u0010FJ/\u0010I\u001a\u0004\u0018\u00010@2\u0006\u0010:\u001a\u00020\u00002\n\u0010G\u001a\u00060\tj\u0002`\n2\n\u0010H\u001a\u00060\tj\u0002`\n¢\u0006\u0004\bI\u0010JJ\u001f\u0010K\u001a\u00020\f2\u0006\u0010:\u001a\u00020\u00002\b\u0010C\u001a\u0004\u0018\u00010@¢\u0006\u0004\bK\u0010LJ'\u0010O\u001a\u00020\t2\n\u0010M\u001a\u00060\tj\u0002`\n2\n\u0010N\u001a\u00060\tj\u0002`\nH\u0000¢\u0006\u0004\bO\u00109J\u001c\u0010P\u001a\u00020D2\n\u0010\u0013\u001a\u00060\tj\u0002`\nH\u0086\u0002¢\u0006\u0004\bP\u0010QR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0018\u0010`\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010_R\u0016\u0010b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010aR\u0016\u0010c\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010aR\u0016\u0010d\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010aR\u001c\u0010g\u001a\b\u0012\u0004\u0012\u00020@0e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010fR6\u0010p\u001a\u0010\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020/\u0018\u00010h8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\bi\u0010j\u0012\u0004\bo\u0010\b\u001a\u0004\bk\u0010l\"\u0004\bm\u0010nR\u0014\u0010s\u001a\u00020^8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010r¨\u0006t"}, d2 = {"Lcom/google/android/hub;", "", "", "groups", "", "slots", "<init>", "([I[Ljava/lang/Object;)V", "()V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "address", "", "y", "(I)V", "j", "size", "c", "(I)I", "group", "currentSize", "newSize", "r", "(III)I", "Landroidx/compose/runtime/composer/linkbuffer/SlotRange;", "range", "D", "E", "slotRange", "l", "m", "(II)V", "q", "required", "e", "k", "", "z", "()J", "start", "end", "C", "v", "offset", "value", "G", "(IILjava/lang/Object;)I", "Lcom/google/android/d37;", "F", "(I)Lcom/google/android/d37;", "parent", "", "sourceInformation", "x", "(ILjava/lang/String;I)Lcom/google/android/d37;", "B", "A", "(II)I", "sourceSpace", "sourceAddress", "g", "(Lcom/google/android/hub;I)I", "previous", "w", "Lcom/google/android/t27;", "d", "(I)Lcom/google/android/t27;", "anchor", "", "u", "(Lcom/google/android/t27;)Z", "oldAddress", "newAddress", "s", "(Lcom/google/android/hub;II)Lcom/google/android/t27;", "t", "(Lcom/google/android/hub;Lcom/google/android/t27;)V", "groupAddress", "common", "i", "f", "(I)Z", "a", "[I", "n", "()[I", "setGroups", "([I)V", "b", "[Ljava/lang/Object;", "p", "()[Ljava/lang/Object;", "setSlots", "([Ljava/lang/Object;)V", "Lcom/google/android/m48;", "Lcom/google/android/m48;", "_largeSizes", "I", "unallocatedStart", "unallocatedEnd", "freeSlotCount", "Lcom/google/android/o48;", "Lcom/google/android/o48;", "anchors", "Lcom/google/android/k58;", "h", "Lcom/google/android/k58;", "getSourceInformationMap", "()Lcom/google/android/k58;", "setSourceInformationMap", "(Lcom/google/android/k58;)V", "getSourceInformationMap$annotations", "sourceInformationMap", "o", "()Lcom/google/android/m48;", "largeSizes", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hub {
    public static final int j = 8;
    private static final int[] k = gub.i(6);
    private static final Object[] l = gub.j(0);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int[] groups;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private m48 _largeSizes;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int unallocatedStart;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int unallocatedEnd;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int freeSlotCount;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private o48<t27> anchors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private k58<t27, d37> sourceInformationMap;

    public hub(int[] iArr, Object[] objArr) {
        this.groups = iArr;
        this.slots = objArr;
        this.unallocatedEnd = objArr.length;
        this.anchors = f16.c();
    }

    private final int D(int range, int currentSize, int newSize) {
        int i = range >> 4;
        if (newSize == 0) {
            if (range != -1) {
                m(i, currentSize);
            }
            return -1;
        }
        int i2 = currentSize - newSize;
        int i3 = i + newSize;
        if (i2 > 0) {
            m(i3, i2);
        }
        if (newSize > 15) {
            o().u(i, newSize);
        }
        return gub.k(i, newSize);
    }

    private final int E(int group, int currentSize, int newSize) {
        int i = group + 5;
        int iD = D(this.groups[i], currentSize, newSize);
        this.groups[i] = iD;
        return iD;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final int c(int size) throws KotlinNothingValueException {
        int i = this.unallocatedStart;
        int i2 = i + size;
        if (i2 <= this.unallocatedEnd) {
            this.unallocatedStart = i2;
            if (size > 15) {
                o().u(i, size);
            }
            f.A(this.slots, d.INSTANCE.a(), i, i2);
            return gub.k(i, size);
        }
        e(size);
        int i3 = this.unallocatedStart;
        int i4 = i3 + size;
        if (i4 > this.unallocatedEnd) {
            e.c("compactAndMaybeGrow did not grow enough");
            throw new KotlinNothingValueException();
        }
        this.unallocatedStart = i4;
        if (size > 15) {
            o().u(i3, size);
        }
        f.A(this.slots, d.INSTANCE.a(), i3, i4);
        return gub.k(i3, size);
    }

    private final void e(int required) {
        Object[] objArr = this.slots;
        int length = objArr.length;
        int length2 = objArr.length - ((this.unallocatedEnd - this.unallocatedStart) + this.freeSlotCount);
        int iNumberOfLeadingZeros = 1 << (32 - Integer.numberOfLeadingZeros((required + length2) + (objArr.length >> 5)));
        if (iNumberOfLeadingZeros < length) {
            iNumberOfLeadingZeros = length;
        }
        Object[] objArrJ = iNumberOfLeadingZeros != length ? gub.j(g.e(iNumberOfLeadingZeros, 256)) : objArr;
        m48 m48VarA = s06.a();
        int i = this.groups[3];
        aub aubVar = new aub(objArr, objArrJ);
        int i2 = 6;
        int iC = mq9.c(6, i - 1, 6);
        int i3 = 0;
        if (6 <= iC) {
            while (true) {
                int i4 = i2 + 5;
                int i5 = this.groups[i4];
                if (i5 != -1) {
                    int iC2 = (i5 & 15) + 1;
                    int i6 = i5 >> 4;
                    if (iC2 > 15) {
                        iC2 = o().c(i6);
                    }
                    aubVar.c(i3, i6, i6 + iC2);
                    if (iC2 > 15) {
                        m48VarA.u(i3, iC2);
                    }
                    this.groups[i4] = gub.k(i3, iC2);
                    i3 += iC2;
                }
                if (i2 == iC) {
                    break;
                } else {
                    i2 += 6;
                }
            }
        }
        if (!(i3 == length2)) {
            e.b("Unexpected slot compaction result, computed we had " + length2 + " slots, but copied " + i3 + " slots");
        }
        this.slots = aubVar.a();
        if (!m48VarA.h()) {
            m48VarA = null;
        }
        this._largeSizes = m48VarA;
        this.unallocatedStart = i3;
        this.unallocatedEnd = objArrJ.length;
        this.freeSlotCount = 0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private static final int h(hub hubVar, hub hubVar2, int i, int i2) throws KotlinNothingValueException {
        int[] iArr = hubVar.groups;
        Object[] objArr = hubVar.slots;
        int i3 = iArr[i2 + 4];
        int i4 = iArr[i2];
        int iG = gub.g(hubVar2.getGroups(), i4, i, i3);
        if (iG < 0) {
            hubVar2.q();
            iG = gub.g(hubVar2.getGroups(), i4, i, i3);
        }
        hubVar2.t(hubVar, hubVar2.s(hubVar, i2, iG));
        int i5 = iArr[i2 + 5];
        if (i5 != -1) {
            int iC = (i5 & 15) + 1;
            int i6 = i5 >> 4;
            if (iC > 15) {
                iC = hubVar.o().c(i6);
            }
            int iC2 = hubVar2.c(iC);
            f.n(objArr, hubVar2.slots, iC2 >> 4, i6, iC + i6);
            hubVar2.groups[iG + 5] = iC2;
        }
        int i7 = iArr[i2 + 3];
        int i8 = -1;
        while (i7 != -1) {
            int iH = h(hubVar, hubVar2, iG, i7);
            if (i8 == -1) {
                hubVar2.groups[iG + 3] = iH;
            } else {
                hubVar2.groups[i8 + 1] = iH;
            }
            i7 = iArr[i7 + 1];
            i8 = iH;
        }
        return iG;
    }

    private final void j(int address) {
        int[] iArr = this.groups;
        if (address + 6 > iArr.length) {
            return;
        }
        int i = address + 4;
        if ((iArr[i] & 8388607) == 8388607) {
            e.b("Recursive loop in group structure detected at " + address);
        }
        t27 t27VarB = this.anchors.b(address);
        if (t27VarB != null) {
            t27VarB.c(-1);
            this.anchors.o(address);
            k58<t27, d37> k58Var = this.sourceInformationMap;
            if (k58Var != null) {
                k58Var.u(t27VarB);
            }
        }
        int i2 = address + 5;
        l(iArr[i2]);
        iArr[i2] = -1;
        int i3 = iArr[address + 3];
        while (i3 != -1) {
            if (i3 + 6 > iArr.length) {
                return;
            }
            int i4 = iArr[i3 + 1];
            j(i3);
            i3 = i4;
        }
        iArr[address + 1] = iArr[1];
        iArr[address + 2] = -1;
        iArr[1] = address;
        iArr[i] = 8388607;
    }

    private final void l(int slotRange) {
        if (slotRange != -1) {
            int iC = (slotRange & 15) + 1;
            int i = slotRange >> 4;
            if (iC > 15) {
                iC = o().c(i);
            }
            m(i, iC);
        }
    }

    private final void m(int address, int size) {
        Object[] objArr = this.slots;
        int i = address + size;
        if (i == address + 1) {
            objArr[address] = gub.a;
        } else {
            f.A(objArr, gub.a, address, i);
        }
        this.freeSlotCount += size;
        if (size > 15) {
            o().r(address);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m48 o() {
        m48 m48Var = this._largeSizes;
        if (m48Var != null) {
            return m48Var;
        }
        m48 m48VarA = s06.a();
        this._largeSizes = m48VarA;
        return m48VarA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        int[] iArr = this.groups;
        int length = iArr.length;
        int[] iArrCopyOf = Arrays.copyOf(this.groups, g.e(iArr.length * 2, 768));
        Intrinsics.checkNotNullExpressionValue(iArrCopyOf, "copyOf(...)");
        this.groups = iArrCopyOf;
        gub.h(iArrCopyOf, length);
    }

    private final int r(int group, int currentSize, int newSize) {
        int i;
        int i2 = this.unallocatedStart;
        int i3 = this.unallocatedEnd;
        int i4 = group + 5;
        int i5 = this.groups[i4] >> 4;
        int i6 = i5 + currentSize;
        if (i6 == i2 && (i = i5 + newSize) <= i3) {
            this.unallocatedStart = i2 + (newSize - currentSize);
            if (newSize > 15) {
                o().u(i5, newSize);
            }
            int iK = gub.k(i5, newSize);
            Object[] objArr = this.slots;
            if (i == i6 + 1) {
                objArr[i6] = gub.a;
            } else {
                f.A(objArr, gub.a, i6, i);
            }
            this.groups[i4] = iK;
            return iK;
        }
        int i7 = newSize - currentSize;
        Object[] objArr2 = this.slots;
        int i8 = i6 + i7;
        if (i8 < objArr2.length) {
            int i9 = i6;
            while (true) {
                if (i9 >= i8) {
                    if (newSize > 15) {
                        o().u(i5, newSize);
                    }
                    int iK2 = gub.k(i5, newSize);
                    Object[] objArr3 = this.slots;
                    int i10 = i5 + newSize;
                    if (i10 == i6 + 1) {
                        objArr3[i6] = gub.a;
                    } else {
                        f.A(objArr3, gub.a, i6, i10);
                    }
                    this.groups[i4] = iK2;
                    this.freeSlotCount -= i7;
                    return iK2;
                }
                if (objArr2[i9] != gub.a) {
                    break;
                }
                i9++;
            }
        }
        int i11 = newSize + 8;
        int iD = D(c(i11), i11, newSize);
        int i12 = iD >> 4;
        int i13 = this.groups[i4] >> 4;
        if (i12 != i13) {
            Object[] objArr4 = this.slots;
            f.n(objArr4, objArr4, i12, i13, i13 + currentSize);
            m(i13, currentSize);
        }
        this.groups[i4] = iD;
        return iD;
    }

    private final void y(int address) {
        t27 t27VarB;
        t27 t27VarB2;
        d37 d37VarE;
        k58<t27, d37> k58Var = this.sourceInformationMap;
        if (k58Var == null || (t27VarB = this.anchors.b(address)) == null || (t27VarB2 = this.anchors.b(this.groups[address + 2])) == null || (d37VarE = k58Var.e(t27VarB2)) == null) {
            return;
        }
        d37VarE.i(t27VarB);
    }

    public final int A(int group, int newSize) {
        int iC;
        int i = this.groups[group + 5];
        if (i == -1 && newSize == 0) {
            return i;
        }
        if (i == -1) {
            iC = 0;
        } else {
            int i2 = (i & 15) + 1;
            iC = i2 > 15 ? o().c(i >> 4) : i2;
        }
        return B(group, iC, newSize);
    }

    public final int B(int group, int size, int newSize) {
        if (newSize == size) {
            return this.groups[group + 5];
        }
        return newSize > size ? r(group, size, newSize) : E(group, size, newSize);
    }

    public final void C(int start, int end) {
        if (end == this.unallocatedEnd) {
            this.unallocatedStart = start;
        }
    }

    public final d37 F(int group) {
        t27 t27VarB;
        k58<t27, d37> k58Var = this.sourceInformationMap;
        if (k58Var == null || (t27VarB = this.anchors.b(group)) == null) {
            return null;
        }
        return k58Var.e(t27VarB);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final int G(int group, int offset, Object value) throws KotlinNothingValueException {
        int iC;
        int[] iArr = this.groups;
        int i = group + 5;
        int iR = iArr[i];
        if (iR == -1) {
            iC = c(offset + 1);
            iArr[i] = iC;
        } else {
            int iC2 = (iR & 15) + 1;
            int i2 = iR >> 4;
            if (iC2 > 15) {
                iC2 = o().c(i2);
            }
            if (offset >= iC2) {
                iR = r(group, iC2, offset + 1);
            }
            iC = iR;
        }
        this.slots[(iC >> 4) + offset] = value;
        return iC;
    }

    public final t27 d(int address) {
        if (address == -1) {
            return u27.e();
        }
        if (address == 0) {
            return u27.d();
        }
        if (!(address >= 0)) {
            e.b("Invalid anchor address " + address);
        }
        o48<t27> o48Var = this.anchors;
        t27 t27VarB = o48Var.b(address);
        if (t27VarB == null) {
            t27VarB = new t27(address);
            o48Var.r(address, t27VarB);
        }
        return t27VarB;
    }

    public final boolean f(int group) {
        return group > 0 && group < this.groups[3];
    }

    public final int g(hub sourceSpace, int sourceAddress) {
        return h(sourceSpace, this, -1, sourceAddress);
    }

    public final int i(int groupAddress, int common) {
        int[] iArr = this.groups;
        int i = 0;
        while (groupAddress != common && groupAddress >= 0) {
            i++;
            groupAddress = iArr[groupAddress + 2];
        }
        return i;
    }

    public final void k(int address) {
        y(address);
        j(address);
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    public final t27 s(hub sourceSpace, int oldAddress, int newAddress) {
        this.anchors.a(newAddress);
        t27 t27VarO = sourceSpace.anchors.o(oldAddress);
        if (t27VarO == null) {
            return null;
        }
        t27VarO.c(newAddress);
        this.anchors.r(newAddress, t27VarO);
        return t27VarO;
    }

    public final void t(hub sourceSpace, t27 anchor) {
        k58<t27, d37> k58Var;
        d37 d37VarE;
        if (anchor == null || (k58Var = sourceSpace.sourceInformationMap) == null || (d37VarE = k58Var.e(anchor)) == null) {
            return;
        }
        k58<t27, d37> k58VarC = this.sourceInformationMap;
        if (k58VarC == null) {
            k58VarC = k4b.c();
            this.sourceInformationMap = k58VarC;
        } else {
            k58VarC.b(anchor);
        }
        k58VarC.x(anchor, d37VarE);
        k58Var.u(anchor);
    }

    public final boolean u(t27 anchor) {
        return this.anchors.b(anchor.getAddress()) == anchor;
    }

    public final void v(int address, int size) {
        o().u(address, size);
    }

    public final void w(int group, int previous) {
        d37 d37VarE;
        k58<t27, d37> k58Var = this.sourceInformationMap;
        if (k58Var == null) {
            return;
        }
        t27 t27VarB = this.anchors.b(this.groups[group + 2]);
        if (t27VarB == null || (d37VarE = k58Var.e(t27VarB)) == null) {
            return;
        }
        d37VarE.f(previous != -1 ? d(previous) : null, d(group));
    }

    public final d37 x(int parent, String sourceInformation, int group) {
        k58<t27, d37> k58VarC = this.sourceInformationMap;
        if (k58VarC == null) {
            k58VarC = k4b.c();
            this.sourceInformationMap = k58VarC;
        }
        t27 t27VarD = d(parent);
        d37 d37VarE = k58VarC.e(t27VarD);
        if (d37VarE == null) {
            d37VarE = new d37(0, sourceInformation, 0);
            if (sourceInformation == null) {
                int i = this.groups[parent + 3];
                while (i != group && i != -1) {
                    d37VarE.j(d(i));
                    i = this.groups[i + 1];
                }
            }
            k58VarC.x(t27VarD, d37VarE);
        }
        return d37VarE;
    }

    public final long z() {
        int i = this.unallocatedStart;
        int i2 = this.unallocatedEnd;
        this.unallocatedStart = i2;
        return ((((long) bqd.c(i2)) & 4294967295L) << 32) | (((long) bqd.c(i)) & 4294967295L);
    }

    public hub() {
        this(k, l);
        int[] iArr = this.groups;
        if (iArr[0] == 0 && iArr[1] == -1 && iArr[2] == 0 && iArr[3] == 6 && iArr[4] == 0) {
            int i = iArr[5];
        }
    }
}
