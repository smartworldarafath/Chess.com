package com.google.inputmethod;

import androidx.collection.ObjectList;
import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.e;
import com.google.android.fh6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010(\n\u0002\b\u001c\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u0000 w2\u00020\u00012\u00020\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003:\u0001UB/\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u001f\u001a\u00020\t2\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0086\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\t2\u0006\u0010\"\u001a\u00020!H\u0086\u0002¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020\t2\n\u0010&\u001a\u00060\u0005j\u0002`%¢\u0006\u0004\b'\u0010 J\u0019\u0010(\u001a\u00020\t2\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001d¢\u0006\u0004\b(\u0010 J\u001d\u0010+\u001a\u00020\t2\u0006\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020!¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b1\u00100J5\u00109\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u000208072\n\u00103\u001a\u0006\u0012\u0002\b\u0003022\f\u00106\u001a\b\u0012\u0004\u0012\u00020504H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010<\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020;H\u0016¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\t2\u0006\u0010>\u001a\u00020;2\u0006\u0010?\u001a\u00020;H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010C\u001a\u00020\u000e2\u0006\u0010.\u001a\u00020-2\u0006\u0010B\u001a\u000208H\u0016¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u000eH\u0016¢\u0006\u0004\bE\u0010\u0010J\u0017\u0010H\u001a\u00020\t2\u0006\u0010G\u001a\u00020FH\u0016¢\u0006\u0004\bH\u0010IJ'\u0010J\u001a\u00020\t2\n\u0010?\u001a\u00060\u0005j\u0002`\u001d2\n\u0010>\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u000eH\u0016¢\u0006\u0004\bL\u0010\u0010J\u000f\u0010M\u001a\u00020\u000eH\u0016¢\u0006\u0004\bM\u0010\u0010J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00040NH\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u001b\u0010Q\u001a\u00020\u00052\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\u00052\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bS\u0010RJ\u001b\u0010T\u001a\u00020\u00052\n\u0010\u001e\u001a\u00060\u0005j\u0002`\u001dH\u0000¢\u0006\u0004\bT\u0010RR\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bU\u0010T\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b/\u0010Z\u001a\u0004\b[\u0010\\R\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bM\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010\u000b\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010]\u001a\u0004\bb\u0010_\"\u0004\bc\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u0010dR\u0016\u0010f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010TR$\u0010j\u001a\u00020\u00052\u0006\u0010g\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bh\u0010T\u001a\u0004\bi\u0010WR\u0014\u0010n\u001a\u00020k8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001c\u0010s\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010p0o8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0011\u0010u\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\bt\u0010_R\u0014\u0010v\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010_¨\u0006x"}, d2 = {"Lcom/google/android/eub;", "Lcom/google/android/cub;", "Lcom/google/android/rr1;", "", "Lcom/google/android/xr1;", "", "root", "Lcom/google/android/hub;", "addressSpace", "", "recordSourceInformation", "recordCallByInformation", "<init>", "(ILcom/google/android/hub;ZZ)V", "", "f", "()V", "Lcom/google/android/uub;", "P", "()Lcom/google/android/uub;", "reader", "v", "(Lcom/google/android/uub;)V", "Lcom/google/android/kub;", "O", "()Lcom/google/android/kub;", "editor", "u", "(Lcom/google/android/kub;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "group", "contains", "(I)Z", "Lcom/google/android/t27;", "anchor", "w", "(Lcom/google/android/t27;)Z", "Landroidx/compose/runtime/composer/linkbuffer/GroupFlags;", "flags", "x", "J", "groupAnchor", "childAnchor", "K", "(Lcom/google/android/t27;Lcom/google/android/t27;)Z", "Lcom/google/android/sea;", "rememberManager", "b", "(Lcom/google/android/sea;)V", "e", "Lcom/google/android/ez;", "applier", "Landroidx/collection/ObjectList;", "Lcom/google/android/r08;", "references", "Landroidx/collection/e;", "Lcom/google/android/q08;", "j", "(Lcom/google/android/ez;Landroidx/collection/ObjectList;)Landroidx/collection/e;", "Lcom/google/android/mg;", "n", "(ILcom/google/android/mg;)Z", "parent", "child", "o", "(Lcom/google/android/mg;Lcom/google/android/mg;)Z", "state", "i", "(Lcom/google/android/sea;Lcom/google/android/q08;)V", "q", "Landroidx/compose/runtime/b0;", "scope", "r", "(Landroidx/compose/runtime/b0;)Z", "M", "(II)Z", "d", "c", "", "iterator", "()Ljava/util/Iterator;", "N", "(I)I", "y", "I", "a", "E", "()I", "R", "(I)V", "Lcom/google/android/hub;", "z", "()Lcom/google/android/hub;", "Z", "D", "()Z", "Q", "(Z)V", "C", "setRecordCallByInformation", "Lcom/google/android/kub;", "currentEditor", "openReaders", "value", "g", "H", "version", "", "A", "()[I", "groups", "", "", "G", "()[Ljava/lang/Object;", "slots", "B", "hasEditor", "isEmpty", "h", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class eub extends cub implements rr1, Iterable<xr1>, fh6 {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int i = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private int root;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final hub addressSpace;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean recordSourceInformation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private boolean recordCallByInformation;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private kub currentEditor;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int openReaders;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int version;

    /* JADX INFO: renamed from: com.google.android.eub$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/google/android/eub$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public eub() {
        this(0, null, false, false, 15, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int[] A() {
        return this.addressSpace.getGroups();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object[] G() {
        return this.addressSpace.getSlots();
    }

    public final boolean B() {
        return this.currentEditor != null;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final boolean getRecordCallByInformation() {
        return this.recordCallByInformation;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getRecordSourceInformation() {
        return this.recordSourceInformation;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getRoot() {
        return this.root;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    public final int I(int group) {
        return A()[group + 4];
    }

    public final boolean J(int group) {
        int i2;
        int[] groups = this.addressSpace.getGroups();
        Object[] slots = this.addressSpace.getSlots();
        hub addressSpace = getAddressSpace();
        if (group < 0) {
            return false;
        }
        t16 t16Var = new t16();
        int[] groups2 = addressSpace.getGroups();
        int iG = group;
        while (sub.l(slots, groups[iG + 5]) == null) {
            if (iG != group && (i2 = groups2[iG + 1]) >= 0) {
                t16Var.i(i2);
            }
            iG = groups2[iG + 3];
            if (iG < 0) {
                if (t16Var.tos == 0) {
                    return false;
                }
                iG = t16Var.g();
            }
        }
        return true;
    }

    public final boolean K(t27 groupAnchor, t27 childAnchor) {
        if (!groupAnchor.a() || !childAnchor.a()) {
            return false;
        }
        if (Intrinsics.e(groupAnchor, childAnchor)) {
            return true;
        }
        hub hubVar = this.addressSpace;
        if (!hubVar.u(childAnchor) || !hubVar.u(groupAnchor)) {
            return false;
        }
        int address = groupAnchor.getAddress();
        int address2 = childAnchor.getAddress();
        if (!hubVar.f(address) || !hubVar.f(address2)) {
            return false;
        }
        int[] groups = hubVar.getGroups();
        int i2 = groups[address2 + 2];
        while (i2 > 0) {
            if (i2 == address) {
                return true;
            }
            if (address <= 0) {
                return false;
            }
            i2 = groups[i2 + 2];
        }
        if (!(i2 != 0)) {
            e.b("Traversing parent of group not in the slot table: " + address2);
        }
        return false;
    }

    public final boolean M(int child, int parent) {
        int[] groups = getAddressSpace().getGroups();
        int i2 = child;
        while (true) {
            if (i2 <= 0) {
                if (!(i2 != 0)) {
                    e.b("Traversing parent of group not in the slot table: " + child);
                }
                return false;
            }
            if (i2 == parent) {
                return true;
            }
            i2 = groups[i2 + 2];
        }
    }

    public final int N(int group) {
        return A()[group + 1];
    }

    public final kub O() {
        if (B()) {
            e.b("Cannot start a writer when another writer is pending");
        }
        if (!(this.openReaders <= 0)) {
            e.b("Cannot start a writer when a reader is pending");
        }
        this.version++;
        kub kubVar = new kub(this);
        this.currentEditor = kubVar;
        return kubVar;
    }

    public final uub P() {
        if (B()) {
            e.b("Cannot read while a writer is pending");
        }
        this.openReaders++;
        return new uub(this);
    }

    public final void Q(boolean z) {
        this.recordSourceInformation = z;
    }

    public final void R(int i2) {
        this.root = i2;
    }

    @Override // com.google.inputmethod.cub
    public void b(sea rememberManager) {
        kub kubVarO = O();
        try {
            sub.m(kubVarO, rememberManager);
            Unit unit = Unit.a;
        } finally {
            kubVarO.b();
        }
    }

    @Override // com.google.inputmethod.cub
    public void c() {
        this.recordCallByInformation = true;
    }

    public final boolean contains(int group) {
        if (group >= 0 && this.addressSpace.f(group)) {
            int[] groups = this.addressSpace.getGroups();
            int i2 = groups[group + 2];
            while (true) {
                if (i2 <= 0) {
                    if (!(i2 != 0)) {
                        e.b("Traversing parent of group not in the slot table: " + group);
                        break;
                    }
                    break;
                }
                if (i2 == this.root) {
                    return true;
                }
                i2 = groups[i2 + 2];
            }
        }
        return false;
    }

    @Override // com.google.inputmethod.cub
    public void d() {
        this.recordSourceInformation = true;
    }

    @Override // com.google.inputmethod.cub
    public void e(sea rememberManager) {
        kub kubVarO = O();
        try {
            sub.g(kubVarO, rememberManager);
            Unit unit = Unit.a;
        } finally {
            kubVarO.b();
        }
    }

    @Override // com.google.inputmethod.cub
    public void f() {
        int i2 = this.root;
        if (i2 != -1) {
            this.addressSpace.k(i2);
            this.root = -1;
        }
    }

    @Override // com.google.inputmethod.cub
    public void i(sea rememberManager, q08 state) {
        kub kubVarO = O();
        try {
            sub.m(kubVarO, rememberManager);
            Unit unit = Unit.a;
        } finally {
            kubVarO.b();
        }
    }

    @Override // com.google.inputmethod.cub
    public boolean isEmpty() {
        return this.root == -1;
    }

    @Override // java.lang.Iterable
    public Iterator<xr1> iterator() {
        return new x15(this, this.root);
    }

    @Override // com.google.inputmethod.cub
    public androidx.collection.e<r08, q08> j(ez<?> applier, ObjectList<r08> references) {
        k58 k58VarC = k4b.c();
        kub kubVarO = O();
        try {
            Object[] objArr = references.content;
            int i2 = references._size;
            for (int i3 = 0; i3 < i2; i3++) {
                r08 r08Var = (r08) objArr[i3];
                t27 t27VarC = u27.c(r08Var.getAnchor());
                if (kubVarO.getTable().w(t27VarC)) {
                    kubVarO.G(t27VarC);
                    k58VarC.x(r08Var, sub.i(r08Var.getComposition(), r08Var, kubVarO, applier));
                }
            }
            Unit unit = Unit.a;
            return k58VarC;
        } finally {
            kubVarO.b();
        }
    }

    @Override // com.google.inputmethod.cub
    public boolean n(int group, mg anchor) {
        t27 t27VarC = u27.c(anchor);
        return this.addressSpace.u(t27VarC) && M(t27VarC.getAddress(), group);
    }

    @Override // com.google.inputmethod.cub
    public boolean o(mg parent, mg child) {
        return K(u27.c(parent), u27.c(child));
    }

    @Override // com.google.inputmethod.cub
    public void q() {
        if (B()) {
            e.b("Cannot read while an editor is pending");
        }
        hub addressSpace = getAddressSpace();
        int root = getRoot();
        if (root < 0) {
            return;
        }
        t16 t16Var = new t16();
        int[] groups = addressSpace.getGroups();
        while (true) {
            int i2 = A()[root + 5];
            if (i2 != -1) {
                hub addressSpace2 = getAddressSpace();
                int iC = (i2 & 15) + 1;
                int i3 = i2 >> 4;
                if (iC > 15) {
                    iC = addressSpace2.o().c(i3);
                }
                for (int i4 = 0; i4 < iC; i4++) {
                    Object obj = G()[i3 + i4];
                    if (Intrinsics.e(obj, d.INSTANCE.a())) {
                        break;
                    }
                    qaa qaaVar = obj instanceof qaa ? (qaa) obj : null;
                    if (qaaVar != null) {
                        qaaVar.invalidate();
                    }
                }
            }
            int i5 = groups[root + 1];
            if (i5 >= 0) {
                t16Var.i(i5);
            }
            root = groups[root + 3];
            if (root < 0) {
                if (t16Var.tos == 0) {
                    return;
                } else {
                    root = t16Var.g();
                }
            }
        }
    }

    @Override // com.google.inputmethod.cub
    public boolean r(b0 scope) {
        mg anchor = scope.getAnchor();
        if (anchor != null) {
            t27 t27VarC = u27.c(anchor);
            if (this.addressSpace.u(t27VarC) && M(t27VarC.getAddress(), this.root)) {
                return true;
            }
        }
        return false;
    }

    public final void u(kub editor) {
        if (!(this.currentEditor == editor)) {
            e.b("Attempted to close an editor that was not the current editor");
        }
        this.currentEditor = null;
    }

    public final void v(uub reader) {
        if (!(reader.getTable() == this && this.openReaders > 0)) {
            e.b("Unexpected reader close()");
        }
        this.openReaders--;
    }

    public final boolean w(t27 anchor) {
        return anchor.a() && this.addressSpace.u(anchor) && contains(anchor.getAddress());
    }

    public final boolean x(int flags) {
        return !isEmpty() && (this.addressSpace.getGroups()[this.root + 4] & flags) == flags;
    }

    public final int y(int group) {
        return A()[group + 3];
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final hub getAddressSpace() {
        return this.addressSpace;
    }

    public eub(int i2, hub hubVar, boolean z, boolean z2) {
        this.root = i2;
        this.addressSpace = hubVar;
        this.recordSourceInformation = z;
        this.recordCallByInformation = z2;
    }

    public /* synthetic */ eub(int i2, hub hubVar, boolean z, boolean z2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? -1 : i2, (i3 & 2) != 0 ? new hub() : hubVar, (i3 & 4) != 0 ? false : z, (i3 & 8) != 0 ? false : z2);
    }
}
