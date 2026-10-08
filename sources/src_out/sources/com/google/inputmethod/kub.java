package com.google.inputmethod;

import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.t;
import com.google.android.bqd;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0001\u0018\u00002\u00020\u0001:\u0001HB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\n\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ;\u0010\u0011\u001a\u00020\t2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0018\u001a\u00020\t2\f\b\u0002\u0010\b\u001a\u00060\u0006j\u0002`\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001a\u0010\u0014J\u0019\u0010\u001b\u001a\u00020\u000f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00062\n\u0010\u001d\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001e\u0010\u0014J\u0019\u0010\u001f\u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b\u001f\u0010\u0014J\u0019\u0010 \u001a\u00020\u00062\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007¢\u0006\u0004\b \u0010\u0014J\u0011\u0010#\u001a\u00060!j\u0002`\"¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\t¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\t¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\t¢\u0006\u0004\b(\u0010&J\u0017\u0010*\u001a\u00020\t2\b\b\u0002\u0010)\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0006¢\u0006\u0004\b-\u0010\u000bJ/\u00101\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u00022\n\u0010/\u001a\u00060!j\u0002`\"2\f\b\u0002\u00100\u001a\u00060!j\u0002`\"¢\u0006\u0004\b1\u00102J3\u00104\u001a\u00060!j\u0002`\"2\u0006\u00103\u001a\u00020\u00002\n\u0010/\u001a\u00060!j\u0002`\"2\f\b\u0002\u00100\u001a\u00060!j\u0002`\"¢\u0006\u0004\b4\u00105J\r\u00106\u001a\u00020\u0006¢\u0006\u0004\b6\u00107J\u0015\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u000208¢\u0006\u0004\b:\u0010;J\u0019\u0010=\u001a\u00020\t2\n\u0010<\u001a\u00060!j\u0002`\"¢\u0006\u0004\b=\u0010>J\u0017\u0010@\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b@\u0010AJ%\u0010D\u001a\u0004\u0018\u00010\u00012\n\u0010C\u001a\u00060\u0006j\u0002`B2\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bD\u0010EJ!\u0010G\u001a\u0004\u0018\u00010\u00012\u0006\u0010F\u001a\u00020\u00062\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bG\u0010EJ\u0017\u0010H\u001a\u00020\t2\b\u0010?\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bH\u0010AJ\u0015\u0010J\u001a\u00020\t2\u0006\u0010I\u001a\u00020\u0006¢\u0006\u0004\bJ\u0010\u000bJ\u0019\u0010L\u001a\u00020\u000f2\n\u0010K\u001a\u00060!j\u0002`\"¢\u0006\u0004\bL\u0010MJ!\u0010Q\u001a\u00020\t2\n\u0010N\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010P\u001a\u00020O¢\u0006\u0004\bQ\u0010RJ7\u0010U\u001a\u00020\t2\n\u0010N\u001a\u00060\u0006j\u0002`\u00072\n\u0010S\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010T\u001a\u00020\u00062\u0006\u0010P\u001a\u00020OH\u0000¢\u0006\u0004\bU\u0010VJ\u0019\u0010Y\u001a\u00020\t2\n\u0010X\u001a\u00060\u0006j\u0002`W¢\u0006\u0004\bY\u0010\u000bJ\r\u0010Z\u001a\u00020\t¢\u0006\u0004\bZ\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010[\u001a\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010GR\u0016\u0010_\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010GR\u001a\u0010d\u001a\u00020`8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b(\u0010a\u001a\u0004\bb\u0010cR$\u0010h\u001a\u00020\u000f2\u0006\u0010?\u001a\u00020\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b \u0010e\u001a\u0004\bf\u0010gR$\u0010j\u001a\u00020\u00062\u0006\u0010?\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001a\u0010G\u001a\u0004\bi\u00107R\u0011\u0010l\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bk\u00107R\u0011\u0010n\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bm\u00107R\u0011\u0010p\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bo\u0010gR\u0011\u0010r\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bq\u0010gR\u0013\u0010u\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010w\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\bv\u0010g¨\u0006x"}, d2 = {"Lcom/google/android/kub;", "", "Lcom/google/android/eub;", "table", "<init>", "(Lcom/google/android/eub;)V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "", "n", "(I)V", "nodeCountDelta", "flagsToRemove", "flagsToAdd", "", "removingGroup", "A", "(IIIIZ)V", "l", "(I)I", "x", "(I)Ljava/lang/Object;", "newValue", "N", "(ILjava/lang/Object;)V", "f", "r", "(I)Z", "groups", "y", "z", "e", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "m", "()J", "b", "()V", "K", "d", "freeGroup", "C", "(Z)V", "offset", "w", "sourceTable", "sourceHandle", "destination", "u", "(Lcom/google/android/eub;JJ)V", "sourceEditor", "t", "(Lcom/google/android/kub;JJ)J", "J", "()I", "Lcom/google/android/t27;", "anchor", "G", "(Lcom/google/android/t27;)V", "handle", "F", "(J)V", "value", "M", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/composer/linkbuffer/SlotAddress;", "slotAddress", "H", "(ILjava/lang/Object;)Ljava/lang/Object;", "index", "I", "a", "slots", "L", "groupHandle", "c", "(J)Z", "inGroup", "Lcom/google/android/kub$a;", "callback", "O", "(ILcom/google/android/kub$a;)V", "firstTailGroupToVisit", "tailSlots", "P", "(IIILcom/google/android/kub$a;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "B", "E", "Lcom/google/android/eub;", "k", "()Lcom/google/android/eub;", "parent", "current", "Lcom/google/android/hub;", "Lcom/google/android/hub;", "g", "()Lcom/google/android/hub;", "addressSpace", "Z", "o", "()Z", "isClosed", "getPreviousSibling", "previousSibling", "h", "currentGroup", "j", "parentGroup", "q", "isNode", "p", "isEmpty", "i", "()Ljava/lang/Object;", "node", "s", "isParentGroupANode", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class kub {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final eub table;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private int current;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final hub addressSpace;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int parent = -1;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int previousSibling = -1;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J-\u0010\b\u001a\u00020\u00072\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¢\u0006\u0004\b\b\u0010\tø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0001"}, d2 = {"Lcom/google/android/kub$a;", "", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "slotIndex", "slot", "", "a", "(IILjava/lang/Object;)Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface a {
        boolean a(int group, int slotIndex, Object slot);
    }

    public kub(eub eubVar) {
        this.table = eubVar;
        this.current = eubVar.getRoot();
        this.addressSpace = eubVar.getAddressSpace();
    }

    private final void A(int group, int nodeCountDelta, int flagsToRemove, int flagsToAdd, boolean removingGroup) {
        int i;
        int i2;
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.addressSpace.getGroups();
        int i3 = groups2[group + 2];
        while (true) {
            if (i3 <= 0) {
                if (i3 != 0) {
                    return;
                }
                e.b("Traversing parent of group not in the slot table: " + group);
                return;
            }
            int i4 = i3 + 4;
            int i5 = groups[i4];
            if (nodeCountDelta != 0) {
                i5 = (i5 & (-8388608)) | ((8388607 & i5) + nodeCountDelta);
                groups[i4] = i5;
                if ((i5 & 8388608) == 8388608) {
                    nodeCountDelta = 0;
                }
            }
            if (flagsToRemove == 0) {
                i = 0;
                break;
            }
            int i6 = (flagsToRemove >> 1) | flagsToRemove;
            int[] groups3 = this.addressSpace.getGroups();
            int i7 = groups3[i3 + 3];
            while (true) {
                if (i7 <= 0) {
                    i = flagsToRemove;
                    break;
                } else {
                    if ((!removingGroup || i7 != group) && (groups[i7 + 4] & i6) != 0) {
                        i = 0;
                        break;
                    }
                    i7 = groups3[i7 + 1];
                }
            }
            if ((i == 0 && flagsToAdd == 0) || (i2 = ((~i) & i5) | flagsToAdd) == i5) {
                flagsToAdd = 0;
            } else {
                groups[i4] = i2;
                flagsToRemove = i;
            }
            if (nodeCountDelta == 0 && flagsToRemove == 0 && flagsToAdd == 0) {
                return;
            } else {
                i3 = groups2[i3 + 2];
            }
        }
    }

    public static /* synthetic */ void D(kub kubVar, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        kubVar.C(z);
    }

    private final void n(int group) {
        int i = this.previousSibling;
        int i2 = this.parent;
        int[] groups = this.addressSpace.getGroups();
        if (i != -1) {
            groups[i + 1] = group;
        } else if (i2 == -1) {
            this.table.R(group);
        } else {
            groups[i2 + 3] = group;
        }
        groups[group + 2] = i2;
        groups[group + 1] = this.current;
        int i3 = groups[group + 4];
        int i4 = (i3 & 8388608) != 8388608 ? i3 & 8388607 : 1;
        this.current = group;
        A(group, i4, 0, u15.a(i3), false);
    }

    public static /* synthetic */ void v(kub kubVar, eub eubVar, long j, long j2, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = -1;
        }
        kubVar.u(eubVar, j, j2);
    }

    public final void B(int flags) {
        boolean z;
        int iA = flags | u15.a(flags);
        hub hubVar = this.addressSpace;
        int[] groups = hubVar.getGroups();
        int root = this.table.getRoot();
        if (root < 0) {
            return;
        }
        t16 t16Var = new t16();
        int[] groups2 = hubVar.getGroups();
        while (true) {
            int i = root + 4;
            int i2 = groups[i];
            if ((iA & i2) == 0) {
                z = false;
            } else {
                groups[i] = i2 & (~iA);
                z = true;
            }
            int i3 = groups2[root + 1];
            if (i3 >= 0) {
                t16Var.i(i3);
            }
            root = groups2[root + 3];
            if (!z || root < 0) {
                if (t16Var.tos == 0) {
                    return;
                } else {
                    root = t16Var.g();
                }
            }
        }
    }

    public final void C(boolean freeGroup) {
        int[] groups = this.addressSpace.getGroups();
        int i = this.current;
        int i2 = groups[i + 4];
        A(i, -((i2 & 8388608) == 8388608 ? 1 : 8388607 & i2), u15.a(i2), 0, true);
        int i3 = groups[i + 1];
        int i4 = this.previousSibling;
        if (i4 == -1) {
            int i5 = this.parent;
            if (i5 == -1) {
                this.table.R(i3);
            } else {
                groups[i5 + 3] = i3;
            }
        } else {
            groups[i4 + 1] = i3;
        }
        if (freeGroup) {
            this.addressSpace.k(i);
        }
        this.current = i3;
    }

    public final void E() {
        this.parent = -1;
        this.previousSibling = -1;
        this.current = this.table.getRoot();
    }

    public final void F(long handle) {
        c(handle);
        int iA = v15.a(handle);
        int[] groups = this.addressSpace.getGroups();
        int iB = v15.b(handle);
        int i = iB == -1 ? iA : groups[iB + 2];
        if (iB == -1) {
            iA = -1;
        }
        this.parent = i;
        this.current = iB;
        if (iA != -1 ? groups[iA + 1] != iB : !(i != -1 ? groups[i + 3] == iB : this.table.getRoot() == iB)) {
            int[] groups2 = this.addressSpace.getGroups();
            int i2 = -1;
            for (int root = i == -1 ? this.table.getRoot() : groups[i + 3]; root >= 0 && root != iB; root = groups2[root + 1]) {
                i2 = root;
            }
            iA = i2;
        }
        if (iA != -1) {
            int i3 = groups[iA + 1];
        } else if (i == -1) {
            this.table.getRoot();
        } else {
            int i4 = groups[i + 3];
        }
        this.previousSibling = iA;
    }

    public final void G(t27 anchor) {
        F((((long) 0) << 32) | (((long) bqd.c(anchor.getAddress())) & 4294967295L));
    }

    public final Object H(int slotAddress, Object value) {
        Object[] slots = this.addressSpace.getSlots();
        if (slotAddress >= 0) {
            int length = slots.length;
        }
        Object obj = slots[slotAddress];
        slots[slotAddress] = value;
        return obj;
    }

    public final Object I(int index, Object value) {
        return H((this.addressSpace.getGroups()[this.parent + 5] >> 4) + index, value);
    }

    public final int J() {
        int i = this.current;
        if (i == -1) {
            throw new IllegalStateException("Skipping past the end of a group");
        }
        this.previousSibling = i;
        this.current = this.addressSpace.getGroups()[i + 1];
        int i2 = this.addressSpace.getGroups()[i + 4];
        if ((i2 & 8388608) == 8388608) {
            return 1;
        }
        return i2 & 8388607;
    }

    public final void K() {
        int i = this.current;
        if (!(i > 0)) {
            e.b("Cannot start a group because current does not refer to a child of a group");
        }
        this.parent = i;
        int[] groups = this.addressSpace.getGroups();
        if (i + 6 > groups.length) {
            return;
        }
        this.current = groups[i + 3];
        this.previousSibling = -1;
    }

    public final void L(int slots) {
        int iC;
        hub hubVar = this.addressSpace;
        int i = this.parent;
        int[] groups = hubVar.getGroups();
        int i2 = groups[i + 5];
        if (i2 == -1) {
            iC = 0;
        } else {
            iC = (i2 & 15) + 1;
            if (iC > 15) {
                iC = hubVar.o().c(i2 >> 4);
            }
        }
        int i3 = iC - slots;
        if (!(i3 >= u15.b(groups[i + 4]))) {
            e.b("Attempted to trim more slots than the group has");
        }
        hubVar.A(i, i3);
    }

    public final void M(Object value) {
        int[] groups = this.addressSpace.getGroups();
        int i = this.current;
        this.addressSpace.getSlots()[(groups[i + 5] >> 4) + Integer.bitCount(25165824 & groups[i + 4])] = value;
    }

    public final void N(int group, Object newValue) {
        hub hubVar = this.addressSpace;
        int[] groups = hubVar.getGroups();
        Object[] slots = hubVar.getSlots();
        int i = groups[group + 4];
        slots[groups[group + 5] >> 4] = newValue;
    }

    public final void O(int inGroup, a callback) {
        if (inGroup < 0) {
            return;
        }
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        int i = groups[inGroup + 5];
        int i2 = -1;
        if (i != -1) {
            hub hubVar = this.addressSpace;
            int iC = (i & 15) + 1;
            int i3 = i >> 4;
            if (iC > 15) {
                iC = hubVar.o().c(i3);
            }
            int i4 = iC + i3;
            for (int i5 = i3; i5 < i4; i5++) {
                int i6 = i5 - i3;
                Object obj = slots[i5];
                if (obj instanceof zea) {
                    int address = t.l((zea) obj).getAfter().getAddress();
                    while (i2 != address) {
                        i2 = i2 < 0 ? groups[inGroup + 3] : groups[i2 + 1];
                        if (!(i2 >= 0)) {
                            e.b("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                        }
                        O(i2, callback);
                    }
                }
                if (callback.a(inGroup, i6, obj)) {
                    slots[i6 + i3] = d.INSTANCE.a();
                }
            }
        }
        for (int i7 = i2 < 0 ? groups[inGroup + 3] : groups[i2 + 1]; i7 >= 0; i7 = groups[i7 + 1]) {
            O(i7, callback);
        }
    }

    public final void P(int inGroup, int firstTailGroupToVisit, int tailSlots, a callback) {
        int iC;
        if (inGroup < 0) {
            return;
        }
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        int i = groups[inGroup + 5];
        int i2 = i >> 4;
        hub hubVar = this.addressSpace;
        int i3 = -1;
        if (i == -1) {
            iC = 0;
        } else {
            iC = (i & 15) + 1;
            if (iC > 15) {
                iC = hubVar.o().c(i2);
            }
        }
        int i4 = (iC + i2) - tailSlots;
        int i5 = i4 + tailSlots;
        boolean z = false;
        for (int i6 = i4; i6 < i5; i6++) {
            int i7 = i6 - i4;
            Object obj = slots[i6];
            if (obj instanceof zea) {
                int address = t.l((zea) obj).getAfter().getAddress();
                while (i3 != address) {
                    i3 = i3 < 0 ? groups[inGroup + 3] : groups[i3 + 1];
                    if (!(i3 >= 0)) {
                        e.b("A RememberObserver cannot be forgotten correctly because its group ordering metadata is inconsistent with the rest of the SlotTable");
                    }
                    z |= firstTailGroupToVisit == i3;
                    if (z) {
                        O(i3, callback);
                    }
                }
            }
            if (callback.a(inGroup, i7, obj)) {
                slots[i7 + i2] = d.INSTANCE.a();
            }
        }
        int i8 = i3 < 0 ? groups[inGroup + 3] : groups[i3 + 1];
        while (i8 >= 0) {
            z |= firstTailGroupToVisit == i8;
            if (z) {
                O(i8, callback);
            }
            i8 = groups[i8 + 1];
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void a(Object value) throws KotlinNothingValueException {
        int[] groups = this.addressSpace.getGroups();
        int i = this.parent;
        int i2 = groups[i + 5];
        if (i2 == -1) {
            this.addressSpace.G(i, 0, value);
            return;
        }
        hub hubVar = this.addressSpace;
        int iC = (i2 & 15) + 1;
        int i3 = i2 >> 4;
        if (iC > 15) {
            iC = hubVar.o().c(i3);
        }
        this.addressSpace.G(i, iC, value);
    }

    public final void b() {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.table.u(this);
    }

    public final boolean c(long groupHandle) {
        int iB = v15.b(groupHandle);
        if (iB == -1) {
            iB = v15.a(groupHandle);
        }
        if (iB == -1) {
            return false;
        }
        int root = this.table.getRoot();
        int[] groups = this.addressSpace.getGroups();
        int[] groups2 = this.addressSpace.getGroups();
        int i = iB;
        while (true) {
            if (i <= 0) {
                if (!(i != 0)) {
                    e.b("Traversing parent of group not in the slot table: " + iB);
                }
                return false;
            }
            if (i == root) {
                return true;
            }
            if (i <= 0) {
                return false;
            }
            int i2 = i + 2;
            if (groups[i2] == -1) {
                int[] groups3 = this.addressSpace.getGroups();
                for (int i3 = root; i3 >= 0; i3 = groups3[i3 + 1]) {
                    if (i3 == i) {
                        return true;
                    }
                }
            }
            i = groups2[i2];
        }
    }

    public final void d() {
        int i = this.parent;
        int[] groups = this.addressSpace.getGroups();
        if (i + 6 > groups.length) {
            return;
        }
        int i2 = groups[i + 1];
        this.parent = groups[i + 2];
        this.previousSibling = i;
        this.current = i2;
    }

    public final int e(int group) {
        return this.addressSpace.getGroups()[group + 3];
    }

    public final int f(int group) {
        return this.addressSpace.getGroups()[group + 4];
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final hub getAddressSpace() {
        return this.addressSpace;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getCurrent() {
        return this.current;
    }

    public final Object i() {
        return x(this.current);
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final eub getTable() {
        return this.table;
    }

    public final int l(int group) {
        return this.addressSpace.getGroups()[group];
    }

    public final long m() {
        return (((long) bqd.c(this.current)) & 4294967295L) | (((long) this.previousSibling) << 32);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getIsClosed() {
        return this.isClosed;
    }

    public final boolean p() {
        return this.table.isEmpty();
    }

    public final boolean q() {
        return (this.addressSpace.getGroups()[this.current + 4] & 8388608) == 8388608;
    }

    public final boolean r(int group) {
        return (f(group) & 8388608) == 8388608;
    }

    public final boolean s() {
        return (this.addressSpace.getGroups()[this.parent + 4] & 8388608) == 8388608;
    }

    public final long t(kub sourceEditor, long sourceHandle, long destination) {
        int iB;
        long jM;
        sourceEditor.F(sourceHandle);
        if (Intrinsics.e(sourceEditor.addressSpace, this.addressSpace)) {
            iB = v15.b(sourceHandle);
            sourceEditor.C(false);
        } else {
            iB = this.addressSpace.g(sourceEditor.addressSpace, v15.b(sourceHandle));
            sourceEditor.C(true);
        }
        if (destination != -1) {
            jM = m();
            F(destination);
        } else {
            jM = -1;
        }
        int i = this.previousSibling;
        n(iB);
        this.previousSibling = i;
        this.current = iB;
        long jC = (((long) i) << 32) | (((long) bqd.c(iB)) & 4294967295L);
        if (jM != -1) {
            F(jM);
        }
        if (this.table.getRecordSourceInformation()) {
            this.addressSpace.w(iB, i);
        }
        return jC;
    }

    public final void u(eub sourceTable, long sourceHandle, long destination) {
        kub kubVarO = sourceTable.O();
        try {
            t(kubVarO, sourceHandle, destination);
        } finally {
            kubVarO.b();
        }
    }

    public final void w(int offset) {
        if (offset == 0) {
            return;
        }
        int i = this.current;
        int i2 = this.previousSibling;
        int[] groups = this.addressSpace.getGroups();
        int i3 = 0;
        int i4 = i;
        int i5 = i2;
        while (i3 < offset) {
            int i6 = groups[i4 + 1];
            if (i6 == -1) {
                throw new IllegalStateException(("Offset(" + offset + ") too large").toString());
            }
            i3++;
            i5 = i4;
            i4 = i6;
        }
        int i7 = i4 + 1;
        groups[i5 + 1] = groups[i7];
        groups[i7] = i;
        if (i2 == -1) {
            groups[this.parent + 3] = i4;
        } else {
            groups[i2 + 1] = i4;
        }
        this.current = i4;
    }

    public final Object x(int group) {
        int[] groups = this.addressSpace.getGroups();
        if ((groups[group + 4] & 8388608) == 8388608) {
            return this.addressSpace.getSlots()[groups[group + 5] >> 4];
        }
        return null;
    }

    public final int y(int groups) {
        int i = this.addressSpace.getGroups()[groups + 4];
        if ((i & 8388608) == 8388608) {
            return 1;
        }
        return i & 8388607;
    }

    public final int z(int group) {
        return this.addressSpace.getGroups()[group + 2];
    }
}
