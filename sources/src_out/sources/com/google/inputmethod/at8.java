package com.google.inputmethod;

import com.google.android.r43;
import kotlin.Metadata;
import kotlin.collections.f;
import kotlin.ranges.g;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0012*B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u0003J\u001f\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\t¢\u0006\u0004\b\u0012\u0010\u0003J\u0017\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0016J\u0015\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ3\u0010$\u001a\u00020\t2\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0017¢\u0006\u0004\b'\u0010(R$\u0010-\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\u0010R\"\u00101\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b\u0012\u0010/\u0012\u0004\b0\u0010\u0003R\u0016\u00103\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0007\u00102R\u0016\u00106\u001a\u0002048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b\u0018\u00105R\u0016\u00107\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b$\u00102R\u001e\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001080.8\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b,\u00109R\u0016\u0010<\u001a\u00020\u00048\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\b;\u00102R\u0016\u0010=\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u00102R\u0011\u0010?\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b;\u0010>¨\u0006@"}, d2 = {"Lcom/google/android/at8;", "Lcom/google/android/pq2;", "<init>", "()V", "", "currentSize", "requiredSize", "c", "(II)I", "", "o", "m", "(II)V", "n", "", "h", "()Z", "i", "b", "Lcom/google/android/ns8;", "operation", "l", "(Lcom/google/android/ns8;)V", "k", "d", "other", "j", "(Lcom/google/android/at8;)V", "Lcom/google/android/ez;", "applier", "Lcom/google/android/kub;", "slots", "Lcom/google/android/sea;", "rememberManager", "Lcom/google/android/ts8;", "errorContext", "e", "(Lcom/google/android/ez;Lcom/google/android/kub;Lcom/google/android/sea;Lcom/google/android/ts8;)V", "", "toString", "()Ljava/lang/String;", "value", "a", "Z", "f", "requiresApplication", "", "[Lcom/google/android/ns8;", "getOpCodes$runtime$annotations", "opCodes", "I", "opCodesSize", "", "[I", "intArgs", "intArgsSize", "", "[Ljava/lang/Object;", "objectArgs", "g", "objectArgsSize", "pushedIntMask", "()I", "size", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class at8 extends pq2 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean requiresApplication;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int opCodesSize;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public int intArgsSize;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public int objectArgsSize;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int pushedIntMask;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public ns8[] opCodes = new ns8[16];

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int[] intArgs = new int[16];

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public Object[] objectArgs = new Object[16];

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u00020\u00072\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/google/android/at8$a;", "Lcom/google/android/ps8;", "<init>", "(Lcom/google/android/at8;)V", "", "c", "()Z", "", "Landroidx/compose/runtime/composer/linkbuffer/changelist/IntParameter;", "parameter", "getInt", "(I)I", "T", "Lcom/google/android/ns8$s;", "a", "(I)Ljava/lang/Object;", "I", "opIdx", "b", "intIdx", "objIdx", "Lcom/google/android/ns8;", "()Lcom/google/android/ns8;", "operation", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements ps8 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private int opIdx;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private int intIdx;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private int objIdx;

        public a() {
        }

        @Override // com.google.inputmethod.ps8
        public <T> T a(int parameter) {
            return (T) at8.this.objectArgs[this.objIdx + parameter];
        }

        public final ns8 b() {
            return at8.this.opCodes[this.opIdx];
        }

        public final boolean c() {
            if (this.opIdx >= at8.this.opCodesSize) {
                return false;
            }
            ns8 ns8VarB = b();
            this.intIdx += ns8VarB.getInts();
            this.objIdx += ns8VarB.getObjects();
            int i = this.opIdx + 1;
            this.opIdx = i;
            return i < at8.this.opCodesSize;
        }

        @Override // com.google.inputmethod.ps8
        public int getInt(int parameter) {
            return at8.this.intArgs[this.intIdx + parameter];
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\r\u001a\u00020\f2\n\u0010\b\u001a\u00060\u0006j\u0002`\u00072\n\u0010\t\u001a\u00060\u0006j\u0002`\u00072\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013JE\u0010\u0019\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u00142\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0018\u001a\u00028\u0001¢\u0006\u0004\b\u0019\u0010\u001aJa\u0010\u001e\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u001b2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ}\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\u000f\"\u0004\b\u0001\u0010\u0014\"\u0004\b\u0002\u0010\u001b\"\u0004\b\u0003\u0010 2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00102\u0006\u0010\u0018\u001a\u00028\u00012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00020\u00102\u0006\u0010\u001d\u001a\u00028\u00022\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00030\u00102\u0006\u0010\"\u001a\u00028\u0003¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\f¢\u0006\u0004\b%\u0010&\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006'"}, d2 = {"Lcom/google/android/at8$b;", "", "Lcom/google/android/at8;", "stack", "a", "(Lcom/google/android/at8;)Lcom/google/android/at8;", "", "Landroidx/compose/runtime/composer/linkbuffer/changelist/IntParameter;", "highParameter", "lowParameter", "", "value", "", "c", "(Lcom/google/android/at8;IIJ)V", "T", "Lcom/google/android/ns8$s;", "parameter", "d", "(Lcom/google/android/at8;ILjava/lang/Object;)V", "U", "parameter1", "value1", "parameter2", "value2", "e", "(Lcom/google/android/at8;ILjava/lang/Object;ILjava/lang/Object;)V", "V", "parameter3", "value3", "f", "(Lcom/google/android/at8;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "W", "parameter4", "value4", "g", "(Lcom/google/android/at8;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)V", "b", "(Lcom/google/android/at8;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b {
        public static at8 a(at8 at8Var) {
            return at8Var;
        }

        public static final void b(at8 at8Var) {
            at8Var.requiresApplication = true;
        }

        public static final void c(at8 at8Var, int i, int i2, long j) {
            at8Var.intArgs[(at8Var.intArgsSize - at8Var.opCodes[at8Var.opCodesSize - 1].getInts()) + i] = (int) (j >>> 32);
            at8Var.intArgs[(at8Var.intArgsSize - at8Var.opCodes[at8Var.opCodesSize - 1].getInts()) + i2] = (int) j;
        }

        public static final <T> void d(at8 at8Var, int i, T t) {
            at8Var.objectArgs[(at8Var.objectArgsSize - at8Var.opCodes[at8Var.opCodesSize - 1].getObjects()) + i] = t;
        }

        public static final <T, U> void e(at8 at8Var, int i, T t, int i2, U u) {
            int objects = at8Var.objectArgsSize - at8Var.opCodes[at8Var.opCodesSize - 1].getObjects();
            Object[] objArr = at8Var.objectArgs;
            objArr[i + objects] = t;
            objArr[objects + i2] = u;
        }

        public static final <T, U, V> void f(at8 at8Var, int i, T t, int i2, U u, int i3, V v) {
            int objects = at8Var.objectArgsSize - at8Var.opCodes[at8Var.opCodesSize - 1].getObjects();
            Object[] objArr = at8Var.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[objects + i3] = v;
        }

        public static final <T, U, V, W> void g(at8 at8Var, int i, T t, int i2, U u, int i3, V v, int i4, W w) {
            int objects = at8Var.objectArgsSize - at8Var.opCodes[at8Var.opCodesSize - 1].getObjects();
            Object[] objArr = at8Var.objectArgs;
            objArr[i + objects] = t;
            objArr[i2 + objects] = u;
            objArr[i3 + objects] = v;
            objArr[objects + i4] = w;
        }
    }

    private final int c(int currentSize, int requiredSize) {
        return g.e(currentSize + g.j(currentSize, 1024), requiredSize);
    }

    private final void m(int currentSize, int requiredSize) {
        int[] iArr = new int[c(currentSize, requiredSize)];
        f.l(this.intArgs, iArr, 0, 0, currentSize);
        this.intArgs = iArr;
    }

    private final void n(int currentSize, int requiredSize) {
        Object[] objArr = new Object[c(currentSize, requiredSize)];
        System.arraycopy(this.objectArgs, 0, objArr, 0, currentSize);
        this.objectArgs = objArr;
    }

    private final void o() {
        int iJ = g.j(this.opCodesSize, 1024);
        int i = this.opCodesSize;
        ns8[] ns8VarArr = new ns8[iJ + i];
        System.arraycopy(this.opCodes, 0, ns8VarArr, 0, i);
        this.opCodes = ns8VarArr;
    }

    public final void b() {
        this.opCodesSize = 0;
        this.intArgsSize = 0;
        f.A(this.objectArgs, (Object) null, 0, this.objectArgsSize);
        this.objectArgsSize = 0;
        this.requiresApplication = false;
    }

    public final void d(ns8 operation) {
        int i = this.pushedIntMask;
        int ints = operation.getInts();
        if (i == ((ints == 0 ? 0 : -1) >>> (32 - ints))) {
            operation.getObjects();
        }
    }

    public final void e(ez<?> applier, kub slots, sea rememberManager, ts8 errorContext) {
        if (i()) {
            a aVar = new a();
            while (true) {
                ez<?> ezVar = applier;
                kub kubVar = slots;
                sea seaVar = rememberManager;
                ts8 ts8Var = errorContext;
                aVar.b().b(aVar, ezVar, kubVar, seaVar, ts8Var);
                if (!aVar.c()) {
                    break;
                }
                applier = ezVar;
                slots = kubVar;
                rememberManager = seaVar;
                errorContext = ts8Var;
            }
        }
        b();
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getRequiresApplication() {
        return this.requiresApplication;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getOpCodesSize() {
        return this.opCodesSize;
    }

    public final boolean h() {
        return getOpCodesSize() == 0;
    }

    public final boolean i() {
        return getOpCodesSize() != 0;
    }

    public final void j(at8 other) {
        ns8[] ns8VarArr = this.opCodes;
        int i = this.opCodesSize - 1;
        this.opCodesSize = i;
        ns8 ns8Var = ns8VarArr[i];
        ns8VarArr[i] = null;
        other.l(ns8Var);
        Object[] objArr = this.objectArgs;
        Object[] objArr2 = other.objectArgs;
        int objects = other.objectArgsSize - ns8Var.getObjects();
        int objects2 = this.objectArgsSize - ns8Var.getObjects();
        System.arraycopy(objArr, objects2, objArr2, objects, this.objectArgsSize - objects2);
        f.A(this.objectArgs, (Object) null, this.objectArgsSize - ns8Var.getObjects(), this.objectArgsSize);
        f.l(this.intArgs, other.intArgs, other.intArgsSize - ns8Var.getInts(), this.intArgsSize - ns8Var.getInts(), this.intArgsSize);
        this.objectArgsSize -= ns8Var.getObjects();
        this.intArgsSize -= ns8Var.getInts();
    }

    public final void k(ns8 operation) {
        l(operation);
    }

    public final void l(ns8 operation) {
        if (this.opCodesSize == this.opCodes.length) {
            o();
        }
        int ints = this.intArgsSize + operation.getInts();
        int length = this.intArgs.length;
        if (ints > length) {
            m(length, ints);
        }
        int objects = this.objectArgsSize + operation.getObjects();
        int length2 = this.objectArgs.length;
        if (objects > length2) {
            n(length2, objects);
        }
        ns8[] ns8VarArr = this.opCodes;
        int i = this.opCodesSize;
        this.opCodesSize = i + 1;
        ns8VarArr[i] = operation;
        this.intArgsSize += operation.getInts();
        this.objectArgsSize += operation.getObjects();
        if (operation.getIsExternallyVisible()) {
            this.requiresApplication = true;
        }
    }

    @r43
    public String toString() {
        return super.toString();
    }
}
