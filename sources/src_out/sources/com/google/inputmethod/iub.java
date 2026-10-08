package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.bqd;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB!\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u000bJA\u0010\u0014\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\f2\n\u0010\u000f\u001a\u00060\fj\u0002`\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\b\u0010\u0011\u001a\u0004\u0018\u00010\u00012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001c\u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\fj\u0002`\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0017J\u000f\u0010\u001f\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001f\u0010\u0017J\u0019\u0010!\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\f2\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b$\u0010\u001aJ\u001b\u0010%\u001a\u0004\u0018\u00010\u00012\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010\u00012\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u0011\u0010,\u001a\u00060*j\u0002`+¢\u0006\u0004\b,\u0010-J\u0019\u0010.\u001a\u00020\f2\n\u0010#\u001a\u00060\fj\u0002`\u001b¢\u0006\u0004\b.\u0010\u001aJ\r\u0010/\u001a\u00020\u0013¢\u0006\u0004\b/\u0010\u0017J\r\u00100\u001a\u00020\u0013¢\u0006\u0004\b0\u0010\u0017J\r\u00101\u001a\u00020\f¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u00132\b\u0010 \u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b3\u0010\"J\u0019\u00104\u001a\u00020\u00132\n\u0010\u000f\u001a\u00060\fj\u0002`\u000e¢\u0006\u0004\b4\u0010\u001dJ!\u00108\u001a\u00020\u00132\u0006\u00106\u001a\u0002052\n\u00107\u001a\u00060*j\u0002`+¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020\u0013¢\u0006\u0004\b:\u0010\u0017J\r\u0010;\u001a\u00020\u0002¢\u0006\u0004\b;\u0010<R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010<R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010@\u001a\u0004\bA\u0010)\"\u0004\bB\u0010CR\"\u0010\u0006\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u0010@\u001a\u0004\bD\u0010)\"\u0004\bE\u0010CR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010FR\u0016\u0010H\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010GR\u0014\u0010K\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010JR\u001a\u0010L\u001a\u00060\fj\u0002`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010GR\u0014\u0010M\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010JR\u0016\u0010N\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010GR\u001e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010T\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010GR\u0016\u0010V\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010GR\u0016\u0010X\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010GR\u0016\u0010Y\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010Z\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010GR\u0016\u0010[\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010GR\u0016\u0010\\\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010GR$\u0010^\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00048\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b]\u0010@\u001a\u0004\b]\u0010)R\u0011\u0010`\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b_\u0010)R\u0011\u0010a\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u00102R\u0011\u0010d\u001a\u00020b8F¢\u0006\u0006\u001a\u0004\bP\u0010cR\u0011\u0010e\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bW\u00102R\u0015\u0010f\u001a\u00060*j\u0002`+8F¢\u0006\u0006\u001a\u0004\bU\u0010-¨\u0006g"}, d2 = {"Lcom/google/android/iub;", "", "Lcom/google/android/eub;", "table", "", "recordSourceInformation", "recordCallByInformation", "<init>", "(Lcom/google/android/eub;ZZ)V", "Lcom/google/android/hub;", "addressSpace", "(Lcom/google/android/hub;ZZ)V", "", "key", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "objectKey", "aux", "node", "", "C", "(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "e", "()V", "group", "A", "(I)I", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "y", "(I)V", "x", "z", "value", "B", "(Ljava/lang/Object;)V", "address", "p", "q", "(I)Ljava/lang/Object;", "o", "t", "()Z", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "u", "()J", "w", "f", "h", "i", "()I", "c", "b", "Lcom/google/android/kub;", "sourceEditor", "sourceHandle", "v", "(Lcom/google/android/kub;J)V", "g", "d", "()Lcom/google/android/eub;", "a", "Lcom/google/android/eub;", "n", "Z", "getRecordSourceInformation", "setRecordSourceInformation", "(Z)V", "getRecordCallByInformation", "setRecordCallByInformation", "Lcom/google/android/hub;", "I", "parent", "Lcom/google/android/t16;", "Lcom/google/android/t16;", "parentStack", "previousSibling", "previousSiblingStack", "nodeCount", "", "j", "[Ljava/lang/Object;", "slots", "k", "slotStart", "l", "slotCurrent", "m", "slotEnd", "inReservedRange", "slotReserveStart", "slotReserveEnd", "slotReserveUsedUpTo", "r", "isClosed", "s", "isEmpty", "parentGroup", "Lcom/google/android/t27;", "()Lcom/google/android/t27;", "parentAnchor", "slotIndex", "parentHandle", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class iub {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final eub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private boolean recordSourceInformation;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean recordCallByInformation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hub addressSpace;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int parent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final t16 parentStack;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int previousSibling;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final t16 previousSiblingStack;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int nodeCount;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int slotStart;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int slotCurrent;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int slotEnd;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean inReservedRange;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int slotReserveStart;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private int slotReserveEnd;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private int slotReserveUsedUpTo;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private boolean isClosed;

    public iub(eub eubVar, boolean z, boolean z2) {
        int i;
        this.table = eubVar;
        this.recordSourceInformation = z;
        this.recordCallByInformation = z2;
        hub addressSpace = eubVar.getAddressSpace();
        this.addressSpace = addressSpace;
        int i2 = -1;
        this.parent = -1;
        this.parentStack = new t16();
        int root = eubVar.getRoot();
        if (root != -1) {
            int[] groups = addressSpace.getGroups();
            while (true) {
                i = i2;
                i2 = root;
                if (i2 < 0) {
                    break;
                } else {
                    root = groups[i2 + 1];
                }
            }
            i2 = i;
        }
        this.previousSibling = i2;
        this.previousSiblingStack = new t16();
        this.slots = this.addressSpace.getSlots();
    }

    private final int A(int group) {
        if (group < 0) {
            return 0;
        }
        int[] groups = this.addressSpace.getGroups();
        int i = this.slotCurrent;
        int i2 = this.slotStart;
        if (i <= i2) {
            groups[group + 5] = -1;
            return 0;
        }
        if (!this.inReservedRange) {
            int i3 = i - i2;
            int i4 = this.slotEnd - i2;
            if (i4 != i3) {
                this.addressSpace.B(group, i4, i3);
            }
            return i3;
        }
        int i5 = i - i2;
        int iK = gub.k(i2, i5);
        if (i5 > 15) {
            this.addressSpace.v(i2, i5);
        }
        this.slotReserveUsedUpTo = i;
        groups[group + 5] = iK;
        return i5;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void B(Object value) throws KotlinNothingValueException {
        int i = this.parent;
        int iA = A(i);
        z();
        this.addressSpace.G(i, iA, value);
        this.slots = this.addressSpace.getSlots();
        x();
        y(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void C(int key, int flags, Object objectKey, Object aux, Object node) throws KotlinNothingValueException {
        int i = this.parent;
        hub hubVar = this.addressSpace;
        int iG = gub.g(hubVar.getGroups(), key, i, flags);
        if (iG < 0) {
            hubVar.q();
            iG = gub.g(hubVar.getGroups(), key, i, flags);
        }
        int[] groups = this.addressSpace.getGroups();
        int i2 = this.previousSibling;
        if (i2 != -1) {
            groups[i2 + 1] = iG;
        } else if (i == -1) {
            this.table.R(iG);
        } else {
            groups[i + 3] = iG;
        }
        this.parentStack.i(i);
        this.previousSiblingStack.i(i2);
        this.parent = iG;
        this.previousSibling = -1;
        if (i != -1) {
            int i3 = i + 4;
            groups[i3] = this.nodeCount | (groups[i3] & (-8388608));
        }
        this.nodeCount = 0;
        A(i);
        int i4 = this.slotReserveUsedUpTo;
        this.slotStart = i4;
        this.slotCurrent = i4;
        this.slotEnd = this.slotReserveEnd;
        this.inReservedRange = true;
        if ((flags & 8388608) == 8388608) {
            c(node);
        }
        if ((flags & 16777216) == 16777216) {
            c(objectKey);
        }
        if ((flags & 33554432) == 33554432) {
            c(aux);
        }
        int i5 = this.slotCurrent;
        int i6 = this.slotStart;
        if (i5 > i6) {
            groups[iG + 5] = gub.k(i6, i5 - i6);
        }
        if (!this.recordSourceInformation || i < 0) {
            return;
        }
        this.addressSpace.x(i, null, iG).j(this.addressSpace.d(iG));
    }

    private final void e() {
        int i = this.parent;
        if (i != -1) {
            A(i);
        }
        z();
    }

    private final void x() {
        long jZ = this.addressSpace.z();
        int i = (int) jZ;
        this.slotReserveStart = i;
        this.slotReserveUsedUpTo = i;
        this.slotReserveEnd = (int) (jZ >>> 32);
    }

    private final void y(int group) {
        int i = this.addressSpace.getGroups()[group + 5];
        if (i == -1) {
            int i2 = this.slotReserveUsedUpTo;
            this.slotStart = i2;
            this.slotCurrent = i2;
            this.slotEnd = this.slotReserveEnd;
            this.inReservedRange = true;
            return;
        }
        hub hubVar = this.addressSpace;
        int iC = (i & 15) + 1;
        int i3 = i >> 4;
        if (iC > 15) {
            iC = hubVar.o().c(i3);
        }
        this.slotStart = i3;
        int i4 = i3 + iC;
        this.slotEnd = i4;
        this.slotCurrent = i4;
        this.inReservedRange = false;
    }

    private final void z() {
        int i = this.slotReserveStart;
        int i2 = this.slotReserveEnd;
        if (i != i2) {
            this.addressSpace.C(this.slotReserveUsedUpTo, i2);
            this.slotReserveStart = 0;
            this.slotReserveUsedUpTo = 0;
            this.slotReserveEnd = 0;
        }
    }

    public final void b(int flags) {
        int[] groups = this.addressSpace.getGroups();
        int i = this.parent;
        int i2 = flags | groups[i + 4];
        groups[i + 4] = i2;
        int iA = u15.a(i2);
        if (iA != 0) {
            hub hubVar = this.addressSpace;
            int i3 = this.parent;
            int[] groups2 = hubVar.getGroups();
            int i4 = groups2[i3 + 2];
            while (i4 > 0) {
                int i5 = i4 + 4;
                int i6 = groups[i5];
                if ((iA & i6) == iA) {
                    return;
                }
                groups[i5] = i6 | iA;
                i4 = groups2[i4 + 2];
            }
            if (i4 != 0) {
                return;
            }
            e.b("Traversing parent of group not in the slot table: " + i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void c(Object value) throws KotlinNothingValueException {
        int i = this.slotCurrent;
        if (i >= this.slotEnd) {
            B(value);
            return;
        }
        Object[] objArr = this.slots;
        this.slotCurrent = i + 1;
        objArr[i] = value;
    }

    public final eub d() {
        e();
        g();
        return this.table;
    }

    public final void f() {
        x();
    }

    public final void g() {
        this.isClosed = true;
    }

    public final void h() {
        this.recordSourceInformation = true;
        this.table.Q(true);
    }

    public final int i() {
        int root;
        int i = this.parent;
        int[] groups = this.addressSpace.getGroups();
        int i2 = i + 4;
        groups[i2] = this.nodeCount | (groups[i2] & (-8388608));
        A(i);
        int iG = this.parentStack.g();
        this.parent = iG;
        int iG2 = this.previousSiblingStack.g();
        if (iG2 == -1) {
            root = iG == -1 ? this.table.getRoot() : groups[iG + 3];
        } else {
            root = groups[iG2 + 1];
        }
        this.previousSibling = root;
        y(this.parent);
        int i3 = groups[i2];
        int i4 = (i3 & 8388608) != 8388608 ? i3 & 8388607 : 1;
        this.nodeCount = (groups[this.parent + 4] & 8388607) + i4;
        return i4;
    }

    public final t27 j() {
        return this.addressSpace.d(getParent());
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final long l() {
        t16 t16Var = this.previousSiblingStack;
        return (((long) bqd.c(this.parent)) & 4294967295L) | (((long) (t16Var.tos == 0 ? -1 : t16Var.c())) << 32);
    }

    public final int m() {
        return this.slotCurrent - this.slotStart;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final eub getTable() {
        return this.table;
    }

    public final Object o(int address) {
        int[] groups = this.addressSpace.getGroups();
        int i = groups[address + 4];
        return (i & 33554432) == 33554432 ? this.slots[(groups[address + 5] >> 4) + Integer.bitCount(25165824 & i)] : d.INSTANCE.a();
    }

    public final int p(int address) {
        return this.addressSpace.getGroups()[address];
    }

    public final Object q(int address) {
        int[] groups = this.addressSpace.getGroups();
        int i = groups[address + 4];
        if ((i & 16777216) == 16777216) {
            return this.slots[(groups[address + 5] >> 4) + Integer.bitCount(8388608 & i)];
        }
        return null;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final boolean s() {
        return this.parent == -1;
    }

    public final boolean t() {
        int i = this.parent;
        return i != -1 && (this.addressSpace.getGroups()[i + 4] & 8388608) == 8388608;
    }

    public final long u() {
        int i;
        int root = this.table.getRoot();
        int i2 = -1;
        if (root != -1) {
            hub hubVar = this.addressSpace;
            int root2 = this.table.getRoot();
            int[] groups = hubVar.getGroups();
            int i3 = groups[root2 + 1];
            while (true) {
                i = i2;
                i2 = root;
                root = i3;
                if (root < 0) {
                    break;
                }
                i3 = groups[root + 1];
            }
            root = i2;
            i2 = i;
        }
        return (((long) i2) << 32) | (((long) bqd.c(root)) & 4294967295L);
    }

    public final void v(kub sourceEditor, long sourceHandle) {
        Intrinsics.e(sourceEditor.getAddressSpace(), this.addressSpace);
        long jM = sourceEditor.m();
        sourceEditor.F(sourceHandle);
        sourceEditor.C(false);
        sourceEditor.F(jM);
        int iB = v15.b(sourceHandle);
        int[] groups = this.addressSpace.getGroups();
        int i = this.parent;
        int i2 = this.previousSibling;
        if (i2 != -1) {
            groups[i2 + 1] = iB;
        } else if (i == -1) {
            this.table.R(iB);
        } else {
            groups[i + 3] = iB;
        }
        groups[iB + 2] = i;
        groups[iB + 1] = -1;
        this.previousSibling = iB;
        int i3 = this.nodeCount;
        int i4 = groups[iB + 4];
        this.nodeCount = i3 + ((i4 & 8388608) == 8388608 ? 1 : 8388607 & i4);
        int iA = u15.a(i4);
        if (iA != 0) {
            int[] groups2 = this.addressSpace.getGroups();
            int i5 = i;
            while (i5 > 0) {
                int i6 = i5 + 4;
                int i7 = groups[i6];
                if ((i7 & iA) == iA) {
                    return;
                }
                groups[i6] = i7 | iA;
                i5 = groups2[i5 + 2];
            }
            if (i5 != 0) {
                return;
            }
            e.b("Traversing parent of group not in the slot table: " + i);
        }
    }

    public final int w(int address) {
        return this.addressSpace.getGroups()[address + 2];
    }

    public iub(hub hubVar, boolean z, boolean z2) {
        this(new eub(0, hubVar, z, z2, 1, null), z, z2);
    }
}
