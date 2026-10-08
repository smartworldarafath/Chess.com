package com.google.inputmethod;

import androidx.collection.ObjectList;
import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.m;
import com.google.android.fh6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010(\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0017\u0010\u000bJ\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\t¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\u001fH\u0016¢\u0006\u0004\b$\u0010%J?\u0010+\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u00112&\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)H\u0000¢\u0006\u0004\b+\u0010,J\u008f\u0001\u0010;\u001a\u00020\u000e2\u0006\u0010-\u001a\u00020\u00142\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00072\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00104\u001a\u00020\u00072\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`62&\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0000¢\u0006\u0004\b;\u0010<J\u0087\u0001\u0010=\u001a\u00020\u000e2\u0006\u0010/\u001a\u00020.2\u0006\u00100\u001a\u00020\u00072\u000e\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\u0006\u00104\u001a\u00020\u00072\u0016\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`62&\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)2\u000e\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u000108H\u0000¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u001b2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001b¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u0004\u0018\u00010(2\u0006\u0010\u001e\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020\u000eH\u0016¢\u0006\u0004\bG\u0010\u0006J\u000f\u0010H\u001a\u00020\u000eH\u0016¢\u0006\u0004\bH\u0010\u0006J\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\bI\u0010\u0010J\u000f\u0010J\u001a\u00020\u000eH\u0016¢\u0006\u0004\bJ\u0010\u0006J5\u0010R\u001a\u000e\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020Q0P2\n\u0010L\u001a\u0006\u0012\u0002\b\u00030K2\f\u0010O\u001a\b\u0012\u0004\u0012\u00020N0MH\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010U\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010T\u001a\u00020QH\u0016¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u00020\u000eH\u0016¢\u0006\u0004\bW\u0010\u0006J!\u0010Y\u001a\u0004\u0018\u0001022\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0000¢\u0006\u0004\bY\u0010ZJ\u0016\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u00040[H\u0096\u0002¢\u0006\u0004\b\\\u0010]R$\u0010/\u001a\u00020.2\u0006\u0010^\u001a\u00020.8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR$\u00100\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010c\u001a\u0004\bd\u0010eR4\u00103\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102012\u000e\u0010^\u001a\n\u0012\u0006\u0012\u0004\u0018\u000102018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bG\u0010f\u001a\u0004\bg\u0010hR$\u00104\u001a\u00020\u00072\u0006\u0010^\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bH\u0010c\u001a\u0004\bi\u0010eR\u0016\u0010j\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010cR\u0018\u0010m\u001a\u000602j\u0002`k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010lR$\u0010-\u001a\u00020\u001b2\u0006\u0010^\u001a\u00020\u001b8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bn\u0010o\u001a\u0004\bp\u0010DR\"\u0010u\u001a\u00020\u00078\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bq\u0010c\u001a\u0004\br\u0010e\"\u0004\bs\u0010tR2\u00107\u001a\u0012\u0012\u0004\u0012\u00020\t05j\b\u0012\u0004\u0012\u00020\t`68\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bU\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zRB\u0010*\u001a\"\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u00010'j\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020(\u0018\u0001`)8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bR\u0010{\u001a\u0004\bc\u0010|\"\u0004\b}\u0010~R/\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001088\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010\u0080\u0001\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001\"\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0085\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0085\u0001\u0010D¨\u0006\u0086\u0001"}, d2 = {"Lcom/google/android/fub;", "Lcom/google/android/cub;", "Lcom/google/android/rr1;", "", "Lcom/google/android/xr1;", "<init>", "()V", "", "index", "Lcom/google/android/ku4;", "S", "(I)Lcom/google/android/ku4;", "Lcom/google/android/sea;", "rememberManager", "", "b", "(Lcom/google/android/sea;)V", "Lcom/google/android/bub;", "M", "()Lcom/google/android/bub;", "Lcom/google/android/wub;", "N", "()Lcom/google/android/wub;", "t", "anchor", "u", "(Lcom/google/android/ku4;)I", "", "O", "(Lcom/google/android/ku4;)Z", "group", "Lcom/google/android/mg;", "n", "(ILcom/google/android/mg;)Z", "parent", "child", "o", "(Lcom/google/android/mg;Lcom/google/android/mg;)Z", "reader", "Ljava/util/HashMap;", "Lcom/google/android/xu4;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "v", "(Lcom/google/android/bub;Ljava/util/HashMap;)V", "writer", "", "groups", "groupsSize", "", "", "slots", "slotsSize", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "anchors", "Lcom/google/android/o48;", "Lcom/google/android/p48;", "calledByMap", "w", "(Lcom/google/android/wub;[II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lcom/google/android/o48;)V", "P", "([II[Ljava/lang/Object;ILjava/util/ArrayList;Ljava/util/HashMap;Lcom/google/android/o48;)V", "Landroidx/compose/runtime/b0;", "scope", "r", "(Landroidx/compose/runtime/b0;)Z", "x", "()Z", "R", "(I)Lcom/google/android/xu4;", "c", "d", "e", "f", "Lcom/google/android/ez;", "applier", "Landroidx/collection/ObjectList;", "Lcom/google/android/r08;", "references", "Landroidx/collection/e;", "Lcom/google/android/q08;", "j", "(Lcom/google/android/ez;Landroidx/collection/ObjectList;)Landroidx/collection/e;", "state", "i", "(Lcom/google/android/sea;Lcom/google/android/q08;)V", "q", "slotIndex", "Q", "(II)Ljava/lang/Object;", "", "iterator", "()Ljava/util/Iterator;", "value", "a", "[I", "D", "()[I", "I", "E", "()I", "[Ljava/lang/Object;", "G", "()[Ljava/lang/Object;", "H", "readers", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "lock", "g", "Z", "K", "h", "J", "setVersion$runtime", "(I)V", "version", "Ljava/util/ArrayList;", "B", "()Ljava/util/ArrayList;", "setAnchors$runtime", "(Ljava/util/ArrayList;)V", "Ljava/util/HashMap;", "()Ljava/util/HashMap;", "setSourceInformationMap$runtime", "(Ljava/util/HashMap;)V", "k", "Lcom/google/android/o48;", "C", "()Lcom/google/android/o48;", "setCalledByMap$runtime", "(Lcom/google/android/o48;)V", "isEmpty", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fub extends cub implements rr1, Iterable<xr1>, fh6 {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int groupsSize;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int slotsSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int readers;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean writer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private HashMap<ku4, xu4> sourceInformationMap;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private o48<p48> calledByMap;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int[] groups = new int[0];

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Object[] slots = new Object[0];

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ArrayList<ku4> anchors = new ArrayList<>();

    private static final void A(SlotWriter slotWriter, int i) {
        z(slotWriter, i);
        while (slotWriter.getCurrentGroup() != i && !slotWriter.u0()) {
            if (i < tub.r(slotWriter)) {
                slotWriter.m1();
            } else {
                slotWriter.c1();
            }
        }
        if (!(slotWriter.getCurrentGroup() == i)) {
            e.b("Unexpected slot table structure");
        }
        slotWriter.m1();
    }

    private final ku4 S(int index) {
        int i;
        if (this.writer) {
            e.b("use active SlotWriter to crate an anchor for location instead");
        }
        if (index < 0 || index >= (i = this.groupsSize)) {
            return null;
        }
        return tub.q(this.anchors, index, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer y(fub fubVar, r08 r08Var) {
        return Integer.valueOf(fubVar.u(lu4.a(r08Var.getAnchor())));
    }

    private static final void z(SlotWriter slotWriter, int i) {
        while (slotWriter.getParent() >= 0 && slotWriter.getCurrentGroupEnd() <= i) {
            slotWriter.d1();
            slotWriter.S();
        }
    }

    public final ArrayList<ku4> B() {
        return this.anchors;
    }

    public final o48<p48> C() {
        return this.calledByMap;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int[] getGroups() {
        return this.groups;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final Object[] getSlots() {
        return this.slots;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getSlotsSize() {
        return this.slotsSize;
    }

    public final HashMap<ku4, xu4> I() {
        return this.sourceInformationMap;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final boolean getWriter() {
        return this.writer;
    }

    public final SlotReader M() {
        if (this.writer) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.readers++;
        return new SlotReader(this);
    }

    public final SlotWriter N() {
        if (this.writer) {
            e.b("Cannot start a writer when another writer is pending");
        }
        if (!(this.readers <= 0)) {
            e.b("Cannot start a writer when a reader is pending");
        }
        this.writer = true;
        this.version++;
        return new SlotWriter(this);
    }

    public final boolean O(ku4 anchor) {
        int iW;
        return anchor.a() && (iW = tub.w(this.anchors, anchor.getLocation(), this.groupsSize)) >= 0 && Intrinsics.e(this.anchors.get(iW), anchor);
    }

    public final void P(int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<ku4> anchors, HashMap<ku4, xu4> sourceInformationMap, o48<p48> calledByMap) {
        this.groups = groups;
        this.groupsSize = groupsSize;
        this.slots = slots;
        this.slotsSize = slotsSize;
        this.anchors = anchors;
        this.sourceInformationMap = sourceInformationMap;
        this.calledByMap = calledByMap;
    }

    public final Object Q(int group, int slotIndex) {
        int iX = tub.x(this.groups, group);
        int i = group + 1;
        return (slotIndex < 0 || slotIndex >= (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slots.length) - iX) ? d.INSTANCE.a() : this.slots[iX + slotIndex];
    }

    public final xu4 R(int group) {
        ku4 ku4VarS;
        HashMap<ku4, xu4> map = this.sourceInformationMap;
        if (map == null || (ku4VarS = S(group)) == null) {
            return null;
        }
        return map.get(ku4VarS);
    }

    @Override // com.google.inputmethod.cub
    public void b(sea rememberManager) {
        SlotWriter slotWriterN = N();
        try {
            e.l(slotWriterN, rememberManager);
            Unit unit = Unit.a;
            boolean z = true;
        } finally {
            slotWriterN.K(false);
        }
    }

    @Override // com.google.inputmethod.cub
    public void c() {
        this.calledByMap = new o48<>(0, 1, null);
    }

    @Override // com.google.inputmethod.cub
    public void d() {
        this.sourceInformationMap = new HashMap<>();
    }

    @Override // com.google.inputmethod.cub
    public void e(sea rememberManager) {
        SlotWriter slotWriterN = N();
        try {
            m.v(slotWriterN, rememberManager);
            Unit unit = Unit.a;
            boolean z = true;
        } finally {
            slotWriterN.K(false);
        }
    }

    @Override // com.google.inputmethod.cub
    public void f() {
    }

    @Override // com.google.inputmethod.cub
    public void i(sea rememberManager, q08 state) {
        SlotWriter slotWriterN = N();
        try {
            e.l(slotWriterN, rememberManager);
            Unit unit = Unit.a;
            boolean z = true;
        } finally {
            slotWriterN.K(false);
        }
    }

    @Override // com.google.inputmethod.cub
    public boolean isEmpty() {
        return this.groupsSize == 0;
    }

    @Override // java.lang.Iterable
    public Iterator<xr1> iterator() {
        return new y15(this, 0, this.groupsSize);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.cub
    public androidx.collection.e<r08, q08> j(ez<?> applier, ObjectList<r08> references) {
        Object[] objArr = references.content;
        int i = references._size;
        Object[] objArr2 = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        while (true) {
            boolean z2 = true;
            char c = 1;
            if (i4 >= i) {
                break;
            }
            if (!O(lu4.a(((r08) objArr[i4]).getAnchor()))) {
                e58 e58Var = new e58(objArr2 == true ? 1 : 0, c == true ? 1 : 0, null);
                Object[] objArr3 = references.content;
                int i5 = references._size;
                for (int i6 = i2; i6 < i5; i6++) {
                    Object obj = objArr3[i6];
                    if (O(lu4.a(((r08) obj).getAnchor()))) {
                        e58Var.n(obj);
                    }
                }
                references = e58Var;
                break;
            }
            i4++;
        }
        ObjectList objectListD = i24.d(references, new Function1() { // from class: com.google.android.dub
            public final Object invoke(Object obj2) {
                return fub.y(this.a, (r08) obj2);
            }
        });
        if (objectListD.g()) {
            return k4b.a();
        }
        k58 k58VarC = k4b.c();
        SlotWriter slotWriterN = N();
        try {
            Object[] objArr4 = objectListD.content;
            int i7 = objectListD._size;
            for (int i8 = i3; i8 < i7; i8++) {
                r08 r08Var = (r08) objArr4[i8];
                int iC = slotWriterN.C(lu4.a(r08Var.getAnchor()));
                int iL0 = slotWriterN.L0(iC);
                z(slotWriterN, iL0);
                A(slotWriterN, iL0);
                slotWriterN.A(iC - slotWriterN.getCurrentGroup());
                k58VarC.x(r08Var, e.d(r08Var.getComposition(), r08Var, slotWriterN, applier));
            }
            z(slotWriterN, Integer.MAX_VALUE);
            Unit unit = Unit.a;
            return k58VarC;
        } finally {
            slotWriterN.K(z);
        }
    }

    @Override // com.google.inputmethod.cub
    public boolean n(int group, mg anchor) {
        if (this.writer) {
            e.b("Writer is active");
        }
        if (!(group >= 0 && group < this.groupsSize)) {
            e.b("Invalid group index");
        }
        ku4 ku4VarA = lu4.a(anchor);
        if (O(ku4VarA)) {
            int iS = tub.s(this.groups, group) + group;
            int location = ku4VarA.getLocation();
            if (group <= location && location < iS) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.inputmethod.cub
    public boolean o(mg parent, mg child) {
        int location = lu4.a(parent).getLocation();
        int iS = tub.s(this.groups, location) + location;
        int location2 = lu4.a(child).getLocation();
        return location <= location2 && location2 < iS;
    }

    @Override // com.google.inputmethod.cub
    public void q() {
        for (Object obj : this.slots) {
            qaa qaaVar = obj instanceof qaa ? (qaa) obj : null;
            if (qaaVar != null) {
                qaaVar.invalidate();
            }
        }
    }

    @Override // com.google.inputmethod.cub
    public boolean r(b0 scope) {
        mg anchor = scope.getAnchor();
        return anchor != null && O(lu4.a(anchor));
    }

    public final ku4 t(int index) {
        if (this.writer) {
            e.b("use active SlotWriter to create an anchor location instead");
        }
        boolean z = false;
        if (index >= 0 && index < this.groupsSize) {
            z = true;
        }
        if (!z) {
            ei9.a("Parameter index is out of range");
        }
        ArrayList<ku4> arrayList = this.anchors;
        int iW = tub.w(arrayList, index, this.groupsSize);
        if (iW >= 0) {
            return arrayList.get(iW);
        }
        ku4 ku4Var = new ku4(index);
        arrayList.add(-(iW + 1), ku4Var);
        return ku4Var;
    }

    public final int u(ku4 anchor) {
        if (this.writer) {
            e.b("Use active SlotWriter to determine anchor location instead");
        }
        if (!anchor.a()) {
            ei9.a("Anchor refers to a group that was removed");
        }
        return anchor.getLocation();
    }

    public final void v(SlotReader reader, HashMap<ku4, xu4> sourceInformationMap) {
        if (!(reader.getTable() == this && this.readers > 0)) {
            e.b("Unexpected reader close()");
        }
        this.readers--;
        if (sourceInformationMap != null) {
            synchronized (this.lock) {
                try {
                    HashMap<ku4, xu4> map = this.sourceInformationMap;
                    if (map != null) {
                        map.putAll(sourceInformationMap);
                    } else {
                        this.sourceInformationMap = sourceInformationMap;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final void w(SlotWriter writer, int[] groups, int groupsSize, Object[] slots, int slotsSize, ArrayList<ku4> anchors, HashMap<ku4, xu4> sourceInformationMap, o48<p48> calledByMap) {
        if (!(writer.getTable() == this && this.writer)) {
            ei9.a("Unexpected writer close()");
        }
        this.writer = false;
        P(groups, groupsSize, slots, slotsSize, anchors, sourceInformationMap, calledByMap);
    }

    public final boolean x() {
        return this.groupsSize > 0 && (this.groups[1] & 67108864) != 0;
    }
}
