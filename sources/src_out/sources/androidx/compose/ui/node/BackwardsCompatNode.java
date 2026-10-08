package androidx.compose.ui.node;

import androidx.compose.ui.focus.FocusProperties;
import androidx.compose.ui.input.pointer.PointerEventPass;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.af9;
import com.google.inputmethod.al4;
import com.google.inputmethod.bf9;
import com.google.inputmethod.bfb;
import com.google.inputmethod.bo6;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dl4;
import com.google.inputmethod.dz4;
import com.google.inputmethod.ew8;
import com.google.inputmethod.f43;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fn6;
import com.google.inputmethod.fz1;
import com.google.inputmethod.gk4;
import com.google.inputmethod.h66;
import com.google.inputmethod.ik4;
import com.google.inputmethod.ir8;
import com.google.inputmethod.kn6;
import com.google.inputmethod.lw0;
import com.google.inputmethod.my7;
import com.google.inputmethod.nfb;
import com.google.inputmethod.ni8;
import com.google.inputmethod.ny7;
import com.google.inputmethod.oi8;
import com.google.inputmethod.pk4;
import com.google.inputmethod.pr8;
import com.google.inputmethod.py7;
import com.google.inputmethod.qea;
import com.google.inputmethod.qk4;
import com.google.inputmethod.qy7;
import com.google.inputmethod.r16;
import com.google.inputmethod.ry7;
import com.google.inputmethod.seb;
import com.google.inputmethod.sg3;
import com.google.inputmethod.sy7;
import com.google.inputmethod.tk4;
import com.google.inputmethod.ty7;
import com.google.inputmethod.w19;
import com.google.inputmethod.wq8;
import com.google.inputmethod.x19;
import com.google.inputmethod.xg3;
import com.google.inputmethod.y23;
import com.google.inputmethod.yd0;
import com.google.inputmethod.yeb;
import com.google.inputmethod.yg3;
import com.google.inputmethod.yk4;
import com.google.inputmethod.zg3;
import com.google.inputmethod.zw5;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000fB\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001b\u0010\u0016J\u001b\u0010\u001d\u001a\u00020\u00142\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J\u000f\u0010 \u001a\u00020\u0014H\u0016¢\u0006\u0004\b \u0010\u0016J\u000f\u0010!\u001a\u00020\u0014H\u0016¢\u0006\u0004\b!\u0010\u0016J\u000f\u0010\"\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\"\u0010\u0016J\r\u0010#\u001a\u00020\u0014¢\u0006\u0004\b#\u0010\u0016J#\u0010*\u001a\u00020)*\u00020$2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J#\u00100\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J#\u00103\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b3\u00101J#\u00104\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b4\u00101J#\u00105\u001a\u00020.*\u00020,2\u0006\u0010&\u001a\u00020-2\u0006\u00102\u001a\u00020.H\u0016¢\u0006\u0004\b5\u00101J\u0013\u00107\u001a\u00020\u0014*\u000206H\u0016¢\u0006\u0004\b7\u00108J\u0013\u0010:\u001a\u00020\u0014*\u000209H\u0016¢\u0006\u0004\b:\u0010;J'\u0010B\u001a\u00020\u00142\u0006\u0010=\u001a\u00020<2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0016¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010\u0016J\u000f\u0010E\u001a\u00020\u0014H\u0016¢\u0006\u0004\bE\u0010\u0016J\u000f\u0010F\u001a\u00020\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u0017H\u0016¢\u0006\u0004\bH\u0010GJ\u001f\u0010L\u001a\u0004\u0018\u00010J*\u00020I2\b\u0010K\u001a\u0004\u0018\u00010JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00142\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00142\u0006\u0010R\u001a\u00020@H\u0016¢\u0006\u0004\bS\u0010TJ\u0017\u0010U\u001a\u00020\u00142\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bU\u0010QJ\u0017\u0010X\u001a\u00020\u00142\u0006\u0010W\u001a\u00020VH\u0016¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u00142\u0006\u0010[\u001a\u00020ZH\u0016¢\u0006\u0004\b\\\u0010]J\u000f\u0010_\u001a\u00020^H\u0016¢\u0006\u0004\b_\u0010`R*\u0010\u0011\u001a\u00020\u00102\u0006\u0010a\u001a\u00020\u00108\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010\u0013R\u0016\u0010h\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010HR\u0018\u0010k\u001a\u0004\u0018\u00010i8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010jR:\u0010u\u001a\u001a\u0012\b\u0012\u0006\u0012\u0002\b\u00030m0lj\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030m`n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR\u0018\u0010w\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010vR\u0014\u0010z\u001a\u00020I8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0014\u0010~\u001a\u00020{8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b|\u0010}R\u0016\u0010R\u001a\u00020\u007f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0085\u0001\u001a\u00030\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0016\u0010\u0087\u0001\u001a\u00020\u00178VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010G¨\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/ui/node/BackwardsCompatNode;", "Landroidx/compose/ui/node/c;", "Lcom/google/android/yg3;", "Lcom/google/android/bfb;", "Lcom/google/android/bf9;", "Lcom/google/android/qy7;", "Lcom/google/android/ty7;", "Lcom/google/android/x19;", "Lcom/google/android/fn6;", "Lcom/google/android/dz4;", "Lcom/google/android/ik4;", "Lcom/google/android/tk4;", "Lcom/google/android/al4;", "Lcom/google/android/ew8;", "Lcom/google/android/lw0;", "Landroidx/compose/ui/b$c;", "Landroidx/compose/ui/b$b;", "element", "<init>", "(Landroidx/compose/ui/b$b;)V", "", "s3", "()V", "", "duringAttach", "p3", "(Z)V", "t3", "Lcom/google/android/sy7;", "v3", "(Lcom/google/android/sy7;)V", "V2", "W2", "N0", "q3", "u3", "Landroidx/compose/ui/layout/j;", "Lcom/google/android/dj7;", "measurable", "Lcom/google/android/kx1;", "constraints", "Lcom/google/android/fj7;", "b", "(Landroidx/compose/ui/layout/j;Lcom/google/android/dj7;J)Lcom/google/android/fj7;", "Lcom/google/android/h66;", "Lcom/google/android/f66;", "", "height", "z", "(Lcom/google/android/h66;Lcom/google/android/f66;I)I", "width", "m", "t", "i", "Lcom/google/android/fz1;", "j", "(Lcom/google/android/fz1;)V", "Lcom/google/android/nfb;", "H0", "(Lcom/google/android/nfb;)V", "Landroidx/compose/ui/input/pointer/e;", "pointerEvent", "Landroidx/compose/ui/input/pointer/PointerEventPass;", "pass", "Lcom/google/android/q16;", "bounds", "x1", "(Landroidx/compose/ui/input/pointer/e;Landroidx/compose/ui/input/pointer/PointerEventPass;J)V", "N", "K0", "E2", "()Z", "Z", "Lcom/google/android/f43;", "", "parentData", "r", "(Lcom/google/android/f43;Ljava/lang/Object;)Ljava/lang/Object;", "Lcom/google/android/kn6;", "coordinates", "D", "(Lcom/google/android/kn6;)V", "size", "f", "(J)V", "w", "Lcom/google/android/dl4;", "focusState", "J", "(Lcom/google/android/dl4;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "m2", "(Landroidx/compose/ui/focus/FocusProperties;)V", "", "toString", "()Ljava/lang/String;", "value", "p", "Landroidx/compose/ui/b$b;", "n3", "()Landroidx/compose/ui/b$b;", "r3", "q", "invalidateCache", "Lcom/google/android/yd0;", "Lcom/google/android/yd0;", "_providedValues", "Ljava/util/HashSet;", "Lcom/google/android/my7;", "Lkotlin/collections/HashSet;", "s", "Ljava/util/HashSet;", "o3", "()Ljava/util/HashSet;", "setReadValues", "(Ljava/util/HashSet;)V", "readValues", "Lcom/google/android/kn6;", "lastOnPlacedCoordinates", "getDensity", "()Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/tsb;", "d", "()J", "Lcom/google/android/py7;", "c0", "()Lcom/google/android/py7;", "providedValues", "z0", "isValidOwnerScope", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackwardsCompatNode extends androidx.compose.ui.b.c implements c, yg3, bfb, bf9, qy7, ty7, x19, fn6, dz4, ik4, tk4, al4, ew8, lw0 {

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private androidx.compose.ui.b.InterfaceC0050b element;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean invalidateCache;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private yd0 _providedValues;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private HashSet<my7<?>> readValues;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private kn6 lastOnPlacedCoordinates;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"androidx/compose/ui/node/BackwardsCompatNode$a", "Landroidx/compose/ui/node/m$b;", "", "q", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements m.b {
        a() {
        }

        @Override // androidx.compose.ui.node.m.b
        public void q() {
            if (BackwardsCompatNode.this.lastOnPlacedCoordinates == null) {
                BackwardsCompatNode backwardsCompatNode = BackwardsCompatNode.this;
                backwardsCompatNode.w(y23.l(backwardsCompatNode, ni8.a(4194304)));
            }
        }
    }

    public BackwardsCompatNode(androidx.compose.ui.b.InterfaceC0050b interfaceC0050b) {
        g3(oi8.f(interfaceC0050b));
        this.element = interfaceC0050b;
        this.invalidateCache = true;
        this.readValues = new HashSet<>();
    }

    private final void p3(boolean duringAttach) {
        if (!getIsAttached()) {
            zw5.c("initializeModifier called on unattached node");
        }
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        if ((ni8.a(32) & getKindSet()) != 0) {
            if (interfaceC0050b instanceof ny7) {
                k3(new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$initializeModifier$2
                    {
                        super(0);
                    }

                    public /* bridge */ /* synthetic */ Object invoke() {
                        m19invoke();
                        return Unit.a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                    public final void m19invoke() {
                        this.this$0.u3();
                    }
                });
            }
            if (interfaceC0050b instanceof sy7) {
                v3((sy7) interfaceC0050b);
            }
        }
        if ((ni8.a(4) & getKindSet()) != 0) {
            if (interfaceC0050b instanceof sg3) {
                this.invalidateCache = true;
            }
            if (!duringAttach) {
                bo6.a(this);
            }
        }
        if ((ni8.a(2) & getKindSet()) != 0) {
            if (BackwardsCompatNodeKt.e(this)) {
                NodeCoordinator coordinator = getCoordinator();
                Intrinsics.g(coordinator);
                ((d) coordinator).q4(this);
                coordinator.B3();
            }
            if (!duringAttach) {
                bo6.a(this);
                y23.q(this).T0();
            }
        }
        if (interfaceC0050b instanceof qea) {
            ((qea) interfaceC0050b).q(y23.q(this));
        }
        if ((ni8.a(128) & getKindSet()) != 0 && (interfaceC0050b instanceof pr8) && BackwardsCompatNodeKt.e(this)) {
            y23.q(this).T0();
        }
        if ((ni8.a(4194304) & getKindSet()) != 0 && (interfaceC0050b instanceof ir8)) {
            this.lastOnPlacedCoordinates = null;
            if (BackwardsCompatNodeKt.e(this)) {
                y23.r(this).p(new a());
            }
        }
        if ((ni8.a(256) & getKindSet()) != 0 && (interfaceC0050b instanceof wq8) && BackwardsCompatNodeKt.e(this)) {
            y23.q(this).T0();
        }
        if (interfaceC0050b instanceof yk4) {
            ((yk4) interfaceC0050b).h().f().c(this);
        }
        if ((ni8.a(16) & getKindSet()) != 0 && (interfaceC0050b instanceof af9)) {
            ((af9) interfaceC0050b).getPointerInputFilter().setLayoutCoordinates$ui(getCoordinator());
        }
        if ((ni8.a(8) & getKindSet()) != 0) {
            y23.r(this).N();
        }
    }

    private final void s3() {
        if (!getIsAttached()) {
            zw5.c("unInitializeModifier called on unattached node");
        }
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        if ((ni8.a(32) & getKindSet()) != 0) {
            if (interfaceC0050b instanceof sy7) {
                y23.r(this).getModifierLocalManager().d(this, ((sy7) interfaceC0050b).getKey());
            }
            if (interfaceC0050b instanceof ny7) {
                ((ny7) interfaceC0050b).l(BackwardsCompatNodeKt.a);
            }
        }
        if ((ni8.a(8) & getKindSet()) != 0) {
            y23.r(this).N();
        }
        if (interfaceC0050b instanceof yk4) {
            ((yk4) interfaceC0050b).h().f().s(this);
        }
    }

    private final void t3() {
        final androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        if (interfaceC0050b instanceof sg3) {
            OwnerSnapshotObserver snapshotObserver = y23.r(this).getSnapshotObserver();
            snapshotObserver.observer.k(this, BackwardsCompatNodeKt.b, new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateDrawCache$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m20invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m20invoke() {
                    ((sg3) interfaceC0050b).x(this);
                }
            });
        }
        this.invalidateCache = false;
    }

    private final void v3(sy7<?> element) {
        yd0 yd0Var = this._providedValues;
        if (yd0Var != null && yd0Var.a(element.getKey())) {
            yd0Var.c(element);
            y23.r(this).getModifierLocalManager().f(this, element.getKey());
        } else {
            this._providedValues = new yd0(element);
            if (BackwardsCompatNodeKt.e(this)) {
                y23.r(this).getModifierLocalManager().a(this, element.getKey());
            }
        }
    }

    @Override // com.google.inputmethod.dz4
    public void D(kn6 coordinates) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        ((wq8) interfaceC0050b).D(coordinates);
    }

    @Override // com.google.inputmethod.bf9
    public boolean E2() {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((af9) interfaceC0050b).getPointerInputFilter().getShareWithSiblings();
    }

    @Override // com.google.inputmethod.bfb
    public void H0(nfb nfbVar) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        seb sebVarG = ((yeb) interfaceC0050b).g();
        Intrinsics.h(nfbVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        ((seb) nfbVar).c(sebVarG);
    }

    @Override // com.google.inputmethod.ik4
    public void J(dl4 focusState) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        if (!(interfaceC0050b instanceof gk4)) {
            zw5.c("onFocusEvent called on wrong node");
        }
        ((gk4) interfaceC0050b).J(focusState);
    }

    @Override // com.google.inputmethod.bf9
    public void K0() {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((af9) interfaceC0050b).getPointerInputFilter().onCancel();
    }

    @Override // com.google.inputmethod.x23, com.google.inputmethod.bf9
    public void N() {
        if (this.element instanceof af9) {
            K0();
        }
    }

    @Override // com.google.inputmethod.yg3
    public void N0() {
        this.invalidateCache = true;
        zg3.a(this);
    }

    @Override // androidx.compose.ui.b.c
    public void V2() {
        p3(true);
    }

    @Override // androidx.compose.ui.b.c
    public void W2() {
        s3();
    }

    @Override // com.google.inputmethod.bf9
    public boolean Z() {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        return ((af9) interfaceC0050b).getPointerInputFilter().getInterceptOutOfBoundsChildEvents();
    }

    @Override // androidx.compose.ui.node.c
    public fj7 b(androidx.compose.ui.layout.j jVar, dj7 dj7Var, long j) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.g) interfaceC0050b).b(jVar, dj7Var, j);
    }

    @Override // com.google.inputmethod.qy7
    public py7 c0() {
        yd0 yd0Var = this._providedValues;
        return yd0Var != null ? yd0Var : ry7.a();
    }

    @Override // com.google.inputmethod.lw0
    public long d() {
        return r16.e(y23.l(this, ni8.a(128)).a());
    }

    @Override // com.google.inputmethod.fn6, com.google.inputmethod.kj7
    public void f(long size) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        if (interfaceC0050b instanceof pr8) {
            ((pr8) interfaceC0050b).f(size);
        }
    }

    @Override // com.google.inputmethod.lw0
    public f43 getDensity() {
        return y23.q(this).getDensity();
    }

    @Override // com.google.inputmethod.lw0
    public LayoutDirection getLayoutDirection() {
        return y23.q(this).getLayoutDirection();
    }

    @Override // androidx.compose.ui.node.c
    public int i(h66 h66Var, f66 f66Var, int i) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.g) interfaceC0050b).i(h66Var, f66Var, i);
    }

    @Override // com.google.inputmethod.yg3
    public void j(fz1 fz1Var) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        xg3 xg3Var = (xg3) interfaceC0050b;
        if (this.invalidateCache && (interfaceC0050b instanceof sg3)) {
            t3();
        }
        xg3Var.j(fz1Var);
    }

    @Override // androidx.compose.ui.node.c
    public int m(h66 h66Var, f66 f66Var, int i) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.g) interfaceC0050b).m(h66Var, f66Var, i);
    }

    @Override // com.google.inputmethod.tk4
    public void m2(FocusProperties focusProperties) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        if (!(interfaceC0050b instanceof qk4)) {
            zw5.c("applyFocusProperties called on wrong node");
        }
        ((qk4) interfaceC0050b).p(new pk4(focusProperties));
    }

    /* JADX INFO: renamed from: n3, reason: from getter */
    public final androidx.compose.ui.b.InterfaceC0050b getElement() {
        return this.element;
    }

    public final HashSet<my7<?>> o3() {
        return this.readValues;
    }

    public final void q3() {
        this.invalidateCache = true;
        zg3.a(this);
    }

    @Override // com.google.inputmethod.x19
    public Object r(f43 f43Var, Object obj) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return ((w19) interfaceC0050b).r(f43Var, obj);
    }

    public final void r3(androidx.compose.ui.b.InterfaceC0050b interfaceC0050b) {
        if (getIsAttached()) {
            s3();
        }
        this.element = interfaceC0050b;
        g3(oi8.f(interfaceC0050b));
        if (getIsAttached()) {
            p3(false);
        }
    }

    @Override // androidx.compose.ui.node.c
    public int t(h66 h66Var, f66 f66Var, int i) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.g) interfaceC0050b).t(h66Var, f66Var, i);
    }

    public String toString() {
        return this.element.toString();
    }

    public final void u3() {
        if (getIsAttached()) {
            this.readValues.clear();
            OwnerSnapshotObserver snapshotObserver = y23.r(this).getSnapshotObserver();
            snapshotObserver.observer.k(this, BackwardsCompatNodeKt.c, new Function0<Unit>() { // from class: androidx.compose.ui.node.BackwardsCompatNode$updateModifierLocalConsumer$1
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m21invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m21invoke() {
                    androidx.compose.ui.b.InterfaceC0050b element = this.this$0.getElement();
                    Intrinsics.h(element, "null cannot be cast to non-null type androidx.compose.ui.modifier.ModifierLocalConsumer");
                    ((ny7) element).l(this.this$0);
                }
            });
        }
    }

    @Override // com.google.inputmethod.fn6
    public void w(kn6 coordinates) {
        this.lastOnPlacedCoordinates = coordinates;
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        if (interfaceC0050b instanceof ir8) {
            ((ir8) interfaceC0050b).w(coordinates);
        }
    }

    @Override // com.google.inputmethod.bf9
    public void x1(androidx.compose.ui.input.pointer.e pointerEvent, PointerEventPass pass, long bounds) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        ((af9) interfaceC0050b).getPointerInputFilter().mo15onPointerEventH0pRuoY(pointerEvent, pass, bounds);
    }

    @Override // androidx.compose.ui.node.c
    public int z(h66 h66Var, f66 f66Var, int i) {
        androidx.compose.ui.b.InterfaceC0050b interfaceC0050b = this.element;
        Intrinsics.h(interfaceC0050b, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((androidx.compose.ui.layout.g) interfaceC0050b).z(h66Var, f66Var, i);
    }

    @Override // com.google.inputmethod.ew8
    public boolean z0() {
        return getIsAttached();
    }
}
