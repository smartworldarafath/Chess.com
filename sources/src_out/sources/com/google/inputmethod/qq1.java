package com.google.inputmethod;

import androidx.compose.p004runtime.b0;
import androidx.compose.p004runtime.composer.linkbuffer.changelist.ComposerChangeListWriterAddressMode;
import androidx.compose.p004runtime.e;
import androidx.compose.p004runtime.f;
import androidx.compose.p004runtime.s;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\r\u0010\nJ\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0018\u0010\nJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ#\u0010\u001f\u001a\u00020\b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b#\u0010$J\u0015\u0010'\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b)\u0010(J\u0015\u0010*\u001a\u00020\b2\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b*\u0010(J\u001d\u0010/\u001a\u00020\b2\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\b2\u0006\u00101\u001a\u00020\u000e2\b\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b4\u00105J!\u00108\u001a\u00020\b2\n\u00107\u001a\u00060\u000ej\u0002`62\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\b8\u0010\u0012J\r\u00109\u001a\u00020\b¢\u0006\u0004\b9\u0010\nJ\u0017\u0010;\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b;\u00105J\r\u0010<\u001a\u00020\b¢\u0006\u0004\b<\u0010\nJ!\u0010@\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\n\u0010?\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0004\b@\u0010AJ)\u0010D\u001a\u00020\b2\u0006\u0010>\u001a\u00020=2\n\u0010?\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010C\u001a\u00020B¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\b2\u0006\u0010F\u001a\u00020\u000e¢\u0006\u0004\bG\u0010HJ)\u0010M\u001a\u00020\b2\u0012\u0010K\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\b0I2\u0006\u0010L\u001a\u00020J¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bP\u00105J;\u0010T\u001a\u00020\b\"\u0004\b\u0000\u0010Q\"\u0004\b\u0001\u0010)2\u0006\u0010\"\u001a\u00028\u00012\u0018\u0010S\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\b0R¢\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\bV\u0010\u0012J%\u0010Y\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u000e2\u0006\u0010X\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e¢\u0006\u0004\bY\u0010\u0017J\r\u0010Z\u001a\u00020\b¢\u0006\u0004\bZ\u0010\nJ!\u0010\\\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010[\u001a\u00060\u000ej\u0002`6¢\u0006\u0004\b\\\u0010\u0012J\r\u0010]\u001a\u00020\b¢\u0006\u0004\b]\u0010\nJ\u0017\u0010^\u001a\u00020\b2\b\u0010O\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b^\u00105J\u001b\u0010Q\u001a\u00020\b2\f\u0010`\u001a\b\u0012\u0004\u0012\u00020\b0_¢\u0006\u0004\bQ\u0010aJ!\u0010d\u001a\u00020\b2\u0006\u0010c\u001a\u00020b2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b¢\u0006\u0004\bd\u0010eJ%\u0010i\u001a\u00020\b2\u000e\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010f2\u0006\u0010h\u001a\u00020b¢\u0006\u0004\bi\u0010jJ/\u0010p\u001a\u00020\b2\b\u0010l\u001a\u0004\u0018\u00010k2\u0006\u0010n\u001a\u00020m2\u0006\u0010\u0014\u001a\u00020o2\u0006\u0010\u0013\u001a\u00020o¢\u0006\u0004\bp\u0010qJ%\u0010t\u001a\u00020\b2\u0006\u0010L\u001a\u00020r2\u0006\u0010n\u001a\u00020m2\u0006\u0010s\u001a\u00020o¢\u0006\u0004\bt\u0010uJ\r\u0010v\u001a\u00020\b¢\u0006\u0004\bv\u0010\nJ\u0017\u0010w\u001a\u00020\b2\b\u0010l\u001a\u0004\u0018\u00010k¢\u0006\u0004\bw\u0010xJ!\u0010z\u001a\u00020\b2\u0006\u0010y\u001a\u00020\u00042\n\b\u0002\u0010h\u001a\u0004\u0018\u00010b¢\u0006\u0004\bz\u0010{J\r\u0010|\u001a\u00020\b¢\u0006\u0004\b|\u0010\nJ\r\u0010}\u001a\u00020\b¢\u0006\u0004\b}\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR(\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010\u008a\u0001\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0004\b4\u00102\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u008b\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bi\u0010#R\u001f\u0010\u008e\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u008c\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bp\u0010\u008d\u0001R\u0017\u0010\u008f\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010#R\u0017\u0010\u0090\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010#R\u0017\u0010\u0091\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bw\u0010#R\u0017\u0010\u0092\u0001\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010#R)\u0010\u0099\u0001\u001a\u00030\u0093\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bv\u0010\u0094\u0001\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001\"\u0006\b\u0097\u0001\u0010\u0098\u0001R\u001b\u0010\u009a\u0001\u001a\u00060\u001aj\u0002`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010'R\u0018\u0010\u009e\u0001\u001a\u00030\u009b\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R\u0014\u0010 \u0001\u001a\u00020\u001d8F¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u0087\u0001¨\u0006¡\u0001"}, d2 = {"Lcom/google/android/qq1;", "", "Landroidx/compose/runtime/s;", "composer", "Lcom/google/android/b81;", "changeList", "<init>", "(Landroidx/compose/runtime/s;Lcom/google/android/b81;)V", "", "A", "()V", "C", "D", "F", "", "nodeIndex", "removeCount", "G", "(II)V", "to", "from", "count", "E", "(III)V", "B", "U", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "handle", "", "resetRelativeAddressing", "O", "(JZ)V", "Lcom/google/android/zea;", "value", "I", "(Lcom/google/android/zea;)V", "Landroidx/compose/runtime/b0;", "scope", "J", "(Landroidx/compose/runtime/b0;)V", "V", "m", "Lcom/google/android/g37;", "holder", "Lcom/google/android/t27;", "after", "Y", "(Lcom/google/android/g37;Lcom/google/android/t27;)V", "slotIndex", "Z", "(ILjava/lang/Object;)V", "c", "(Ljava/lang/Object;)V", "Landroidx/compose/runtime/composer/linkbuffer/GroupAddress;", "firstTailGroupToRemove", "M", "N", "data", "W", "K", "Lcom/google/android/eub;", "sourceTable", "source", "t", "(Lcom/google/android/eub;J)V", "Lcom/google/android/oe4;", "fixups", "u", "(Lcom/google/android/eub;JLcom/google/android/oe4;)V", "offset", "x", "(I)V", "Lkotlin/Function1;", "Lcom/google/android/pr1;", "action", "composition", "i", "(Lkotlin/jvm/functions/Function1;Lcom/google/android/pr1;)V", "node", "a0", "T", "Lkotlin/Function2;", "block", "X", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "L", "fromNodeIndex", "toNodeIndex", "y", "k", "group", "l", "z", "w", "Lkotlin/Function0;", "effect", "(Lkotlin/jvm/functions/Function0;)V", "Lcom/google/android/m16;", "effectiveNodeIndexOut", "g", "(Lcom/google/android/m16;J)V", "", "nodes", "effectiveNodeIndex", "d", "(Ljava/util/List;Lcom/google/android/m16;)V", "Lcom/google/android/q08;", "resolvedState", "Landroidx/compose/runtime/f;", "parentContext", "Lcom/google/android/r08;", "e", "(Lcom/google/android/q08;Landroidx/compose/runtime/f;Lcom/google/android/r08;Lcom/google/android/r08;)V", "Lcom/google/android/x22;", "reference", "H", "(Lcom/google/android/x22;Landroidx/compose/runtime/f;Lcom/google/android/r08;)V", "j", "h", "(Lcom/google/android/q08;)V", "other", "s", "(Lcom/google/android/b81;Lcom/google/android/m16;)V", "n", "f", "a", "Landroidx/compose/runtime/s;", "b", "Lcom/google/android/b81;", "p", "()Lcom/google/android/b81;", "R", "(Lcom/google/android/b81;)V", "q", "()Z", "S", "(Z)V", "implicitRootStart", "pendingUps", "Lcom/google/android/w3c;", "Ljava/util/ArrayList;", "pendingDownNodes", "removeFromNodeIndex", "moveFromNodeIndex", "moveToNodeIndex", "moveCount", "Landroidx/compose/runtime/composer/linkbuffer/changelist/ComposerChangeListWriterAddressMode;", "Landroidx/compose/runtime/composer/linkbuffer/changelist/ComposerChangeListWriterAddressMode;", "o", "()Landroidx/compose/runtime/composer/linkbuffer/changelist/ComposerChangeListWriterAddressMode;", "Q", "(Landroidx/compose/runtime/composer/linkbuffer/changelist/ComposerChangeListWriterAddressMode;)V", "addressMode", "editorCurrentPosition", "Lcom/google/android/uub;", "r", "()Lcom/google/android/uub;", "reader", "v", "isInAnchorMode", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class qq1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final s composer;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private b81 changeList;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private int pendingUps;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean implicitRootStart = true;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ArrayList<Object> pendingDownNodes = w3c.c(null, 1, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int removeFromNodeIndex = -1;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private int moveFromNodeIndex = -1;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int moveToNodeIndex = -1;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private int moveCount = -1;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private ComposerChangeListWriterAddressMode addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long editorCurrentPosition = -1;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerChangeListWriterAddressMode.values().length];
            try {
                iArr[ComposerChangeListWriterAddressMode.AbsoluteAddressing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerChangeListWriterAddressMode.AnchorAddressing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerChangeListWriterAddressMode.RelativeAddressing.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public qq1(s sVar, b81 b81Var) {
        this.composer = sVar;
        this.changeList = b81Var;
    }

    private final void A() {
        B();
    }

    private final void B() {
        int i = this.pendingUps;
        if (i > 0) {
            this.changeList.N(i);
            this.pendingUps = 0;
        }
        if (w3c.f(this.pendingDownNodes)) {
            this.changeList.n(w3c.k(this.pendingDownNodes));
            w3c.a(this.pendingDownNodes);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void C() throws NoWhenBranchMatchedException {
        long jI = r().I();
        if (this.editorCurrentPosition != jI) {
            P(this, jI, false, 2, null);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void D() throws NoWhenBranchMatchedException {
        P(this, r().I(), false, 2, null);
    }

    private final void E(int to, int from, int count) {
        A();
        this.changeList.v(to, from, count);
    }

    private final void F() {
        int i = this.moveCount;
        if (i > 0) {
            int i2 = this.removeFromNodeIndex;
            if (i2 >= 0) {
                G(i2, i);
                this.removeFromNodeIndex = -1;
            } else {
                E(this.moveToNodeIndex, this.moveFromNodeIndex, i);
                this.moveToNodeIndex = -1;
                this.moveFromNodeIndex = -1;
            }
            this.moveCount = 0;
        }
    }

    private final void G(int nodeIndex, int removeCount) {
        A();
        this.changeList.A(nodeIndex, removeCount);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static /* synthetic */ void P(qq1 qq1Var, long j, boolean z, int i, Object obj) throws NoWhenBranchMatchedException {
        if ((i & 2) != 0) {
            z = false;
        }
        qq1Var.O(j, z);
    }

    private final uub r() {
        return this.composer.getReader();
    }

    public final void H(x22 composition, f parentContext, r08 reference) {
        this.changeList.w(composition, parentContext, reference);
        this.editorCurrentPosition = -1L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void I(zea value) throws NoWhenBranchMatchedException {
        C();
        this.changeList.x(value);
    }

    public final void J(b0 scope) {
        this.changeList.y(scope);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void K() throws NoWhenBranchMatchedException {
        C();
        this.changeList.z();
    }

    public final void L(int nodeIndex, int count) {
        if (count > 0) {
            if (this.removeFromNodeIndex == nodeIndex) {
                this.moveCount += count;
                return;
            }
            F();
            this.removeFromNodeIndex = nodeIndex;
            this.moveCount = count;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void M(int firstTailGroupToRemove, int count) throws NoWhenBranchMatchedException {
        if (firstTailGroupToRemove >= 0 || count > 0) {
            C();
            this.changeList.B(firstTailGroupToRemove, count);
        }
    }

    public final void N() {
        this.changeList.C();
        this.editorCurrentPosition = -1L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void O(long handle, boolean resetRelativeAddressing) throws NoWhenBranchMatchedException {
        int i = a.$EnumSwitchMapping$0[this.addressMode.ordinal()];
        if (i == 1) {
            this.changeList.E(handle);
        } else if (i == 2) {
            this.changeList.D(r().getTable().getAddressSpace(), handle);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            int iB = v15.b(handle);
            int iA = iB == -1 ? v15.a(handle) : r().U(iB);
            if (!(iA == v15.b(this.editorCurrentPosition))) {
                e.b("Relative addressing only supports navigating to a child of the current group");
            }
            this.changeList.H();
            int iH = r().h(iA);
            while (iH != iB) {
                this.changeList.G();
                iH = r().R(iH);
            }
            if (resetRelativeAddressing) {
                this.addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
            }
        }
        this.editorCurrentPosition = handle;
    }

    public final void Q(ComposerChangeListWriterAddressMode composerChangeListWriterAddressMode) {
        this.addressMode = composerChangeListWriterAddressMode;
    }

    public final void R(b81 b81Var) {
        this.changeList = b81Var;
    }

    public final void S(boolean z) {
        this.implicitRootStart = z;
    }

    public final void T(Function0<Unit> effect) {
        this.changeList.F(effect);
    }

    public final void U() {
        w3c.a(this.pendingDownNodes);
        this.pendingUps = 0;
        this.removeFromNodeIndex = -1;
        this.moveFromNodeIndex = -1;
        this.moveToNodeIndex = -1;
        this.addressMode = ComposerChangeListWriterAddressMode.AbsoluteAddressing;
        this.editorCurrentPosition = -1L;
    }

    public final void V(b0 scope) {
        this.changeList.I(scope);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void W(Object data) throws NoWhenBranchMatchedException {
        C();
        this.changeList.J(data);
    }

    public final <T, V> void X(V value, Function2<? super T, ? super V, Unit> block) {
        A();
        this.changeList.K(value, block);
    }

    public final void Y(g37 holder, t27 after) {
        if (Intrinsics.e(holder.getAfter(), after)) {
            return;
        }
        this.changeList.M(holder, after);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void Z(int slotIndex, Object value) throws NoWhenBranchMatchedException {
        C();
        this.changeList.L(slotIndex, value);
    }

    public final void a0(Object node) {
        A();
        this.changeList.O(node);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void c(Object value) throws NoWhenBranchMatchedException {
        C();
        this.changeList.g(value);
    }

    public final void d(List<? extends Object> nodes, IntRef effectiveNodeIndex) {
        this.changeList.i(nodes, effectiveNodeIndex);
    }

    public final void e(q08 resolvedState, f parentContext, r08 from, r08 to) {
        this.changeList.j(resolvedState, parentContext, from, to);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void f() throws NoWhenBranchMatchedException {
        C();
        this.changeList.k();
    }

    public final void g(IntRef effectiveNodeIndexOut, long handle) {
        B();
        this.changeList.l(effectiveNodeIndexOut, handle);
        this.editorCurrentPosition = handle;
    }

    public final void h(q08 resolvedState) {
        if (resolvedState != null) {
            this.changeList.m(resolvedState);
        }
    }

    public final void i(Function1<? super pr1, Unit> action, pr1 composition) {
        this.changeList.o(action, composition);
    }

    public final void j() {
        this.changeList.p();
        this.pendingUps = 0;
    }

    public final void k() {
        F();
    }

    public final void l(int nodeIndex, int group) {
        k();
        B();
        int i = r().i(group);
        L(nodeIndex, (i & 8388608) == 8388608 ? 1 : i & 8388607);
    }

    public final void m(b0 scope) {
        this.changeList.q(scope);
    }

    public final void n() {
        B();
        this.changeList.h();
        this.editorCurrentPosition = -1L;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final ComposerChangeListWriterAddressMode getAddressMode() {
        return this.addressMode;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final b81 getChangeList() {
        return this.changeList;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getImplicitRootStart() {
        return this.implicitRootStart;
    }

    public final void s(b81 other, IntRef effectiveNodeIndex) {
        this.changeList.r(other, effectiveNodeIndex);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void t(eub sourceTable, long source) throws NoWhenBranchMatchedException {
        if (!(source != -1)) {
            e.b("Tried moving from an unspecified position");
        }
        B();
        C();
        F();
        this.changeList.s(sourceTable, source);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void u(eub sourceTable, long source, oe4 fixups) throws NoWhenBranchMatchedException {
        if (!(source != -1)) {
            e.b("Tried moving from an unspecified position");
        }
        B();
        C();
        F();
        this.changeList.t(sourceTable, source, fixups);
    }

    public final boolean v() {
        return this.addressMode == ComposerChangeListWriterAddressMode.AnchorAddressing;
    }

    public final void w(Object node) {
        F();
        w3c.j(this.pendingDownNodes, node);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void x(int offset) throws NoWhenBranchMatchedException {
        if (!(offset >= 0)) {
            e.b("Offset must not be negative");
        }
        D();
        this.changeList.u(offset);
        this.editorCurrentPosition = -1L;
    }

    public final void y(int fromNodeIndex, int toNodeIndex, int count) {
        if (count > 0) {
            int i = this.moveCount;
            if (i > 0 && this.moveFromNodeIndex == fromNodeIndex && this.moveToNodeIndex == toNodeIndex) {
                this.moveCount = i + count;
                return;
            }
            F();
            this.moveToNodeIndex = toNodeIndex;
            this.moveFromNodeIndex = fromNodeIndex;
            this.moveCount = count;
        }
    }

    public final void z() {
        F();
        if (w3c.f(this.pendingDownNodes)) {
            w3c.i(this.pendingDownNodes);
        } else {
            this.pendingUps++;
        }
    }
}
