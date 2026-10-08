package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.bqd;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b)\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\n\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\f\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u00122\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0015\u0010\u0011J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00012\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0016\u0010\u0011J\u0019\u0010\u0017\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0017\u0010\u0014J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00012\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0018\u0010\u0011J\u0019\u0010\u0019\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0019\u0010\u000eJ\u0019\u0010\u001a\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001a\u0010\u000eJ\u0019\u0010\u001b\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001b\u0010\u000eJ\u0011\u0010\u001e\u001a\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\u0011\u0010 \u001a\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b \u0010\u001fJ\u0019\u0010!\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b!\u0010\u0014J\u0019\u0010\"\u001a\u00020\u00122\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\"\u0010\u0014J\u001d\u0010$\u001a\u00060\u0006j\u0002`#2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b$\u0010\u000eJ\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\r\u0010(\u001a\u00020%¢\u0006\u0004\b(\u0010'J\r\u0010)\u001a\u00020%¢\u0006\u0004\b)\u0010'J\r\u0010*\u001a\u00020%¢\u0006\u0004\b*\u0010'J\r\u0010+\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020%¢\u0006\u0004\b-\u0010'J\u0019\u0010/\u001a\u00020%2\n\u0010.\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102J\u0019\u00103\u001a\u00020\u00062\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b3\u0010\u000eJ\u0017\u00105\u001a\u0004\u0018\u00010\u00012\u0006\u00104\u001a\u00020\u0006¢\u0006\u0004\b5\u0010\u0011J\r\u00106\u001a\u00020%¢\u0006\u0004\b6\u0010'J\r\u00107\u001a\u00020%¢\u0006\u0004\b7\u0010'J\u0019\u00108\u001a\u00020%2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b8\u00100J\u0019\u0010:\u001a\u00020%2\n\u00109\u001a\u00060\u001cj\u0002`\u001d¢\u0006\u0004\b:\u0010;J\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020=0<¢\u0006\u0004\b>\u0010?J'\u0010B\u001a\u00020%2\f\b\u0002\u0010@\u001a\u00060\u0006j\u0002`\u00072\n\u0010A\u001a\u00060\u0006j\u0002`#¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020%2\n\u0010A\u001a\u00060\u0006j\u0002`#¢\u0006\u0004\bD\u00100J%\u0010E\u001a\u00020%2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u00072\n\u0010A\u001a\u00060\u0006j\u0002`#¢\u0006\u0004\bE\u0010CR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010IR\u0016\u0010L\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010KR\u0016\u0010O\u001a\u00020M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010NR\u001e\u0010R\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010QR\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010\u001eR\u0016\u0010S\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010\u001eR\"\u0010V\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\u001e\u001a\u0004\bT\u0010,\"\u0004\bU\u00100R\"\u0010Y\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001e\u001a\u0004\bW\u0010,\"\u0004\bX\u00100R\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010[R\u0016\u0010]\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010\u001eR$\u0010a\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\n\u0010:\u001a\u0004\b_\u0010`R$\u0010d\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bb\u0010:\u001a\u0004\bc\u0010`R\u0016\u0010f\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010\u001eR,\u0010h\u001a\u00060\u0006j\u0002`\u00072\n\u0010^\u001a\u00060\u0006j\u0002`\u00078B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bb\u0010,\"\u0004\bg\u00100R,\u0010k\u001a\u00060\u0006j\u0002`\u00072\n\u0010^\u001a\u00060\u0006j\u0002`\u00078F@BX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010,\"\u0004\bj\u00100R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bl\u0010,R\u0011\u0010n\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\bm\u0010`R\u0011\u0010p\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bo\u0010,R\u0011\u0010r\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bq\u0010,R\u0013\u0010t\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bs\u00102R\u0011\u0010v\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bu\u0010,R\u0013\u0010x\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bw\u00102R\u0011\u0010z\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\by\u0010`R\u0011\u0010|\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b{\u0010`R\u0011\u0010~\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b}\u0010`R\u0012\u0010\u0080\u0001\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u007f\u0010`R\u0016\u0010\u0081\u0001\u001a\u00060\u0006j\u0002`\u00078F¢\u0006\u0006\u001a\u0004\be\u0010,R\u0017\u0010\u0083\u0001\u001a\u00060\u0006j\u0002`\u00078F¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010,R\u0015\u0010\u0087\u0001\u001a\u00030\u0084\u00018F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001R\u0017\u0010\u0089\u0001\u001a\u00060\u001cj\u0002`\u001d8F¢\u0006\u0007\u001a\u0005\b\u0088\u0001\u0010\u001fR\u0015\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0007\u001a\u0005\b\u008a\u0001\u00102R\u0013\u0010\u008d\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u008c\u0001\u0010,¨\u0006\u008e\u0001"}, d2 = {"Lcom/google/android/uub;", "", "Lcom/google/android/eub;", "table", "<init>", "(Lcom/google/android/eub;)V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "address", "slotIndex", "k", "(II)Ljava/lang/Object;", "t", "T", "(I)I", "group", "E", "(I)Ljava/lang/Object;", "", "J", "(I)Z", "H", "G", "P", "S", "U", "h", "R", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "I", "()J", "b0", "V", "K", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "i", "", "d", "()V", "g0", "h0", "f", "e0", "()I", "f0", "parent", "a0", "(I)V", "Q", "()Ljava/lang/Object;", "F", "index", "j", "c", "e", "Y", "handle", "Z", "(J)V", "", "Lcom/google/android/ti6;", "g", "()Ljava/util/List;", "groupAddress", "flags", "b", "(II)V", "W", "X", "a", "Lcom/google/android/eub;", "D", "()Lcom/google/android/eub;", "Lcom/google/android/hub;", "Lcom/google/android/hub;", "addressSpace", "", "[I", "groups", "", "[Ljava/lang/Object;", "slots", "_current", "getSlotCurrent", "setSlotCurrent", "slotCurrent", "getSlotEnd", "setSlotEnd", "slotEnd", "Lcom/google/android/t16;", "Lcom/google/android/t16;", "previousSlotCurrentOffset", "emptyCount", "value", "q", "()Z", "hadNext", "l", "L", "isClosed", "m", "_previousSibling", "c0", "current", "A", "d0", "previousSibling", "C", "M", "isEmpty", "B", "remainingSlots", "v", "parentCurrentSlotOffset", "n", "groupAux", "o", "groupKey", "p", "groupObjectKey", "r", "hasObjectKey", "N", "isGroupEnd", "O", "isNode", "s", "inEmpty", "currentGroup", "w", "parentGroup", "Lcom/google/android/t27;", "u", "()Lcom/google/android/t27;", "parentAnchor", "x", "parentHandle", "y", "parentNode", "z", "parentNodeCount", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class uub {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final eub table;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private hub addressSpace;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int[] groups;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int parent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int _current;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int slotCurrent;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int slotEnd;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final t16 previousSlotCurrentOffset;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private int emptyCount;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private boolean hadNext;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int _previousSibling;

    public uub(eub eubVar) {
        this.table = eubVar;
        hub addressSpace = eubVar.getAddressSpace();
        this.addressSpace = addressSpace;
        this.groups = addressSpace.getGroups();
        this.slots = eubVar.getAddressSpace().getSlots();
        this.parent = -1;
        this._current = eubVar.getRoot();
        this.previousSlotCurrentOffset = new t16();
        this._previousSibling = -1;
    }

    private final void c0(int i) {
        this._current = i;
    }

    private final void d0(int i) {
        this._previousSibling = i;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    private final int get_current() {
        return this._current;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final int get_previousSibling() {
        return this._previousSibling;
    }

    public final int B() {
        return this.slotEnd - this.slotCurrent;
    }

    public final int C() {
        int i = this.parent;
        if (i >= 0) {
            return this.slotCurrent - (this.groups[i + 5] >> 4);
        }
        return 0;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final eub getTable() {
        return this.table;
    }

    public final Object E(int group) {
        int[] iArr = this.groups;
        int i = iArr[group + 4];
        int i2 = iArr[group + 5];
        if ((i & 33554432) != 33554432) {
            return d.INSTANCE.a();
        }
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots[(i2 >> 4) + Integer.bitCount(i & 25165824)];
    }

    public final int F(int group) {
        return this.groups[group];
    }

    public final Object G(int group) {
        int[] iArr = this.groups;
        int i = iArr[group + 4];
        int i2 = iArr[group + 5];
        if ((i & 8388608) != 8388608) {
            return null;
        }
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots[i2 >> 4];
    }

    public final Object H(int address) {
        int[] iArr = this.groups;
        int i = iArr[address + 4];
        int i2 = iArr[address + 5];
        if ((i & 16777216) != 16777216) {
            return null;
        }
        if (this.emptyCount > 0) {
            this.slots = this.addressSpace.getSlots();
        }
        return this.slots[(i2 >> 4) + Integer.bitCount(i & 8388608)];
    }

    public final long I() {
        return v15.c(this.parent, get_previousSibling(), get_current());
    }

    public final boolean J(int address) {
        return (this.groups[address + 4] & 16777216) == 16777216;
    }

    public final boolean K(int group) {
        return (this.groups[group + 4] & 201326592) != 0;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final boolean M() {
        return this.table.isEmpty();
    }

    public final boolean N() {
        return get_current() == -1 && !s();
    }

    public final boolean O() {
        return (this.groups[get_current() + 4] & 8388608) == 8388608;
    }

    public final boolean P(int group) {
        return (this.groups[group + 4] & 8388608) == 8388608;
    }

    public final Object Q() {
        int i;
        if (s() || (i = this.slotCurrent) >= this.slotEnd) {
            this.hadNext = false;
            return d.INSTANCE.a();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.slotCurrent = i + 1;
        return objArr[i];
    }

    public final int R(int group) {
        return this.groups[group + 1];
    }

    public final Object S(int group) {
        return this.slots[this.groups[group + 5] >> 4];
    }

    public final int T(int address) {
        int i = this.groups[address + 4];
        if ((i & 8388608) == 8388608) {
            return 1;
        }
        return i & 8388607;
    }

    public final int U(int group) {
        return this.groups[group + 2];
    }

    public final boolean V(int group) {
        return (this.groups[group + 4] & 67108864) == 67108864;
    }

    public final void W(int flags) {
        X(this.parent, flags);
    }

    public final void X(int group, int flags) {
        int[] groups = this.addressSpace.getGroups();
        int i = group + 4;
        int i2 = groups[i];
        if ((flags & i2) == flags) {
            int i3 = i2 & (~flags);
            groups[i] = i3;
            int iA = u15.a(flags);
            if ((i3 & iA) != 0) {
                return;
            }
            int i4 = flags | iA;
            int[] groups2 = this.addressSpace.getGroups();
            int i5 = groups2[group + 2];
            while (i5 > 0) {
                int i6 = i5 + 4;
                int i7 = groups[i6];
                if ((i7 & iA) == 0) {
                    return;
                }
                int[] groups3 = this.addressSpace.getGroups();
                for (int i8 = groups3[i5 + 3]; i8 > 0; i8 = groups3[i8 + 1]) {
                    if ((groups[i8 + 4] & i4) != 0) {
                        return;
                    }
                }
                groups[i6] = i7 & (~iA);
                i5 = groups2[i5 + 2];
            }
            if (i5 != 0) {
                return;
            }
            e.b("Traversing parent of group not in the slot table: " + group);
        }
    }

    public final void Y(int group) {
        Z((((long) 0) << 32) | (((long) bqd.c(group)) & 4294967295L));
    }

    public final void Z(long handle) {
        if (s()) {
            e.b("Cannot reposition while in an empty region");
        }
        c0(v15.b(handle));
        d0(v15.a(handle));
        this.parent = this.groups[get_current() + 2];
    }

    public final void a0(int parent) {
        d0(0);
        this.parent = parent;
        this.slotCurrent = 0;
        this.slotEnd = 0;
    }

    public final void b(int groupAddress, int flags) {
        int iA = u15.a(flags);
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.table.getAddressSpace().getGroups();
        int i = groupAddress;
        while (i > 0) {
            int i2 = i + 4;
            int i3 = groups[i2];
            int i4 = i == groupAddress ? flags : iA;
            if ((i4 & i3) == i4) {
                return;
            }
            groups[i2] = i3 | i4;
            i = groups2[i + 2];
        }
        if (i != 0) {
            return;
        }
        e.b("Traversing parent of group not in the slot table: " + groupAddress);
    }

    public final long b0() {
        return (((long) (-1)) << 32) | (((long) bqd.c(this.table.getRoot())) & 4294967295L);
    }

    public final void c() {
        this.emptyCount++;
    }

    public final void d() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.table.v(this);
    }

    public final void e() {
        if (!(this.emptyCount > 0)) {
            e.b("Unbalanced begin/end empty");
        }
        int i = this.emptyCount - 1;
        this.emptyCount = i;
        if (i == 0) {
            this.slots = this.addressSpace.getSlots();
            int[] groups = this.addressSpace.getGroups();
            this.groups = groups;
            int i2 = this.slotEnd - this.slotCurrent;
            int i3 = groups[this.parent + 5];
            if (i3 != -1) {
                hub hubVar = this.addressSpace;
                int iC = (i3 & 15) + 1;
                int i4 = i3 >> 4;
                if (iC > 15) {
                    iC = hubVar.o().c(i4);
                }
                int i5 = i4 + iC;
                this.slotCurrent = i5 - i2;
                this.slotEnd = i5;
            }
        }
    }

    public final int e0() {
        int i = get_current();
        int[] iArr = this.groups;
        if (i + 6 > iArr.length) {
            return 0;
        }
        int i2 = iArr[i + 4];
        int i3 = (i2 & 8388608) == 8388608 ? 1 : i2 & 8388607;
        c0(iArr[i + 1]);
        d0(i);
        return i3;
    }

    public final void f() {
        int iC;
        int i = this.parent;
        int[] iArr = this.groups;
        if (i + 6 > iArr.length) {
            return;
        }
        int i2 = iArr[i + 1];
        int i3 = iArr[i + 2];
        this.parent = i3;
        d0(i);
        c0(i2);
        int i4 = this.groups[i3 + 5];
        int i5 = i4 >> 4;
        hub hubVar = this.addressSpace;
        if (i4 == -1) {
            iC = 0;
        } else {
            iC = (i4 & 15) + 1;
            if (iC > 15) {
                iC = hubVar.o().c(i5);
            }
        }
        int i6 = i5 + iC;
        this.slotEnd = i6;
        this.slotCurrent = i6 - this.previousSlotCurrentOffset.h(0);
    }

    public final void f0() {
        c0(-1);
        d0(0);
        this.slotCurrent = 0;
        this.slotEnd = 0;
    }

    public final List<ti6> g() {
        ArrayList arrayList = new ArrayList();
        if (!s()) {
            int i = get_previousSibling();
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            eub eubVar = this.table;
            int iM = m();
            int[] groups = eubVar.getAddressSpace().getGroups();
            int i2 = i;
            int i3 = iM;
            int i4 = 0;
            while (i3 >= 0) {
                int i5 = iArr[i3 + 4];
                arrayList.add(new ti6(iArr[i3], (i5 & 16777216) == 16777216 ? objArr[(iArr[i3 + 5] >> 4) + Integer.bitCount(i5 & 8388608)] : null, (((long) i2) << 32) | (((long) bqd.c(i3)) & 4294967295L), (i5 & 8388608) == 8388608 ? 1 : 8388607 & i5, i4));
                i2 = i3;
                i3 = groups[i3 + 1];
                i4++;
            }
        }
        return arrayList;
    }

    public final void g0() {
        int iC;
        int i = get_current();
        this.parent = i;
        int[] iArr = this.groups;
        if (i + 6 > iArr.length) {
            return;
        }
        c0(iArr[i + 3]);
        d0(-1);
        this.previousSlotCurrentOffset.i(this.slotEnd - this.slotCurrent);
        int i2 = iArr[i + 5];
        if (i2 == -1) {
            this.slotCurrent = -1;
            this.slotEnd = -1;
            return;
        }
        int i3 = iArr[i + 4];
        int i4 = i2 >> 4;
        this.slotCurrent = u15.b(i3) + i4;
        hub hubVar = this.addressSpace;
        if (i2 == -1) {
            iC = 0;
        } else {
            int i5 = (i2 & 15) + 1;
            iC = i5 > 15 ? hubVar.o().c(i4) : i5;
        }
        this.slotEnd = i4 + iC;
    }

    public final int h(int group) {
        return this.groups[group + 3];
    }

    public final void h0() {
        if (!O()) {
            e.b("Expected a node group");
        }
        g0();
    }

    public final int i(int address) {
        return this.groups[address + 4];
    }

    public final Object j(int index) {
        return k(get_current(), index);
    }

    public final Object k(int address, int slotIndex) {
        if (slotIndex >= 0) {
            int[] iArr = this.groups;
            Object[] objArr = this.slots;
            int i = iArr[address + 5];
            if (i != -1) {
                int i2 = iArr[address + 4];
                hub hubVar = this.addressSpace;
                int iC = (i & 15) + 1;
                int i3 = i >> 4;
                if (iC > 15) {
                    iC = hubVar.o().c(i3);
                }
                int iB = slotIndex + u15.b(i2);
                if (iB < iC) {
                    return objArr[i3 + iB];
                }
            }
        }
        return d.INSTANCE.a();
    }

    public final int m() {
        return get_current();
    }

    public final Object n() {
        return E(get_current());
    }

    public final int o() {
        int i = get_current();
        if (i != -1) {
            return this.addressSpace.getGroups()[i];
        }
        return 0;
    }

    public final Object p() {
        return H(get_current());
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean r() {
        return J(get_current());
    }

    public final boolean s() {
        return this.emptyCount > 0;
    }

    public final Object t(int address, int slotIndex) {
        Object objK = k(address, slotIndex);
        if (objK == null || Intrinsics.e(objK, d.INSTANCE.a())) {
            return null;
        }
        return objK;
    }

    public final t27 u() {
        return this.addressSpace.d(getParent());
    }

    public final int v() {
        int i = this.groups[this.parent + 5];
        if (i == -1) {
            return 0;
        }
        return this.slotCurrent - (i >> 4);
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final long x() {
        return (((long) 0) << 32) | (((long) bqd.c(this.parent)) & 4294967295L);
    }

    public final Object y() {
        return G(this.parent);
    }

    public final int z() {
        int i = this.parent;
        if (i == -1) {
            return 0;
        }
        int i2 = this.groups[i + 4];
        if ((i2 & 8388608) == 8388608) {
            return 1;
        }
        return i2 & 8388607;
    }
}
