package androidx.compose.p001foundation.layout;

import androidx.compose.p004runtime.d;
import com.google.android.r43;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@r43
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u001eBa\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007\u0012\u001c\b\u0002\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J+\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\b2\u0012\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u0012H\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R(\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR(\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c\u0082\u0001\u0001\u001f¨\u0006 "}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow;", "", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "type", "", "minLinesToShowCollapse", "minCrossAxisSizeToShowCollapse", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/c0;", "Lkotlin/Function0;", "", "seeMoreGetter", "collapseGetter", "<init>", "(Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;IILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "b", "()Landroidx/compose/foundation/layout/c0;", "state", "", "list", "a", "(Landroidx/compose/foundation/layout/c0;Ljava/util/List;)V", "Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "getType$foundation_layout", "()Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "I", "c", "d", "Lkotlin/jvm/functions/Function1;", "e", "OverflowType", "Landroidx/compose/foundation/layout/h0;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class FlowLayoutOverflow {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final OverflowType type;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int minLinesToShowCollapse;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final int minCrossAxisSizeToShowCollapse;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Function1<FlowLayoutOverflowState, Function2<d, Integer, Unit>> seeMoreGetter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Function1<FlowLayoutOverflowState, Function2<d, Integer, Unit>> collapseGetter;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/foundation/layout/FlowLayoutOverflow$OverflowType;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum OverflowType {
        Visible,
        Clip,
        ExpandIndicator,
        ExpandOrCollapseIndicator;

        private static final /* synthetic */ EnumEntries f = kotlin.enums.a.a(a());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OverflowType.values().length];
            try {
                iArr[OverflowType.ExpandIndicator.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OverflowType.ExpandOrCollapseIndicator.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ FlowLayoutOverflow(OverflowType overflowType, int i, int i2, Function1 function1, Function1 function2, DefaultConstructorMarker defaultConstructorMarker) {
        this(overflowType, i, i2, function1, function2);
    }

    public final void a(FlowLayoutOverflowState state, List<Function2<d, Integer, Unit>> list) {
        Function1<FlowLayoutOverflowState, Function2<d, Integer, Unit>> function1 = this.seeMoreGetter;
        Function2<d, Integer, Unit> function2 = function1 != null ? (Function2) function1.invoke(state) : null;
        Function1<FlowLayoutOverflowState, Function2<d, Integer, Unit>> function3 = this.collapseGetter;
        Function2<d, Integer, Unit> function4 = function3 != null ? (Function2) function3.invoke(state) : null;
        int i = a.$EnumSwitchMapping$0[this.type.ordinal()];
        if (i == 1) {
            if (function2 != null) {
                list.add(function2);
            }
        } else {
            if (i != 2) {
                return;
            }
            if (function2 != null) {
                list.add(function2);
            }
            if (function4 != null) {
                list.add(function4);
            }
        }
    }

    public final FlowLayoutOverflowState b() {
        return new FlowLayoutOverflowState(this.type, this.minLinesToShowCollapse, this.minCrossAxisSizeToShowCollapse);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private FlowLayoutOverflow(OverflowType overflowType, int i, int i2, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super d, ? super Integer, Unit>> function1, Function1<? super FlowLayoutOverflowState, ? extends Function2<? super d, ? super Integer, Unit>> function2) {
        this.type = overflowType;
        this.minLinesToShowCollapse = i;
        this.minCrossAxisSizeToShowCollapse = i2;
        this.seeMoreGetter = function1;
        this.collapseGetter = function2;
    }
}
