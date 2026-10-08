package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.d;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.x;
import com.google.inputmethod.CollectionInfo;
import com.google.inputmethod.ProgressBarRangeInfo;
import com.google.inputmethod.ScrollAxisRange;
import com.google.inputmethod.d57;
import com.google.inputmethod.hpa;
import com.google.inputmethod.oh1;
import com.google.inputmethod.t94;
import com.google.inputmethod.xkb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\b\u001a\u0004\b\r\u0010\nR\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\u0010\u0010\nR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\b\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0017\u0010\nR\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\b\u001a\u0004\b\u001b\u0010\nR\u001d\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\b\u001a\u0004\b\u0007\u0010\nR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b \u0010\b\u001a\u0004\b!\u0010\nR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\b\u001a\u0004\b$\u0010\nR\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\b\u001a\u0004\b\u0016\u0010\nR\u001d\u0010*\u001a\b\u0012\u0004\u0012\u00020'0\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\b\u001a\u0004\b)\u0010\nR\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006¢\u0006\f\n\u0004\b,\u0010\b\u001a\u0004\b#\u0010\nR&\u00101\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010\b\u0012\u0004\b0\u0010\u0003\u001a\u0004\b/\u0010\nR\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006¢\u0006\f\n\u0004\b2\u0010\b\u001a\u0004\b3\u0010\nR\u001d\u00107\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006¢\u0006\f\n\u0004\b5\u0010\b\u001a\u0004\b6\u0010\nR&\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\b\u0012\u0004\b:\u0010\u0003\u001a\u0004\b9\u0010\nR\u001d\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b9\u0010\b\u001a\u0004\b(\u0010\nR\u001d\u0010>\u001a\b\u0012\u0004\u0012\u00020=0\u00048\u0006¢\u0006\f\n\u0004\b/\u0010\b\u001a\u0004\b\u0012\u0010\nR\u001d\u0010A\u001a\b\u0012\u0004\u0012\u00020?0\u00048\u0006¢\u0006\f\n\u0004\b@\u0010\b\u001a\u0004\b\f\u0010\nR\u001d\u0010D\u001a\b\u0012\u0004\u0012\u00020B0\u00048\u0006¢\u0006\f\n\u0004\bC\u0010\b\u001a\u0004\b \u0010\nR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u00020E0\u00048\u0006¢\u0006\f\n\u0004\bF\u0010\b\u001a\u0004\bG\u0010\nR\u001d\u0010J\u001a\b\u0012\u0004\u0012\u00020I0\u00048\u0006¢\u0006\f\n\u0004\b6\u0010\b\u001a\u0004\b,\u0010\nR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020I0\u00048\u0006¢\u0006\f\n\u0004\bK\u0010\b\u001a\u0004\bL\u0010\nR\u001d\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b3\u0010\b\u001a\u0004\bF\u0010\nR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bO\u0010\b\u001a\u0004\b@\u0010\nR\u001d\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0\u00048\u0006¢\u0006\f\n\u0004\b)\u0010\b\u001a\u0004\bR\u0010\nR\u001d\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\b\u001a\u0004\bU\u0010\nR\u001d\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\bO\u0010\nR#\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020X0\u00050\u00048\u0006¢\u0006\f\n\u0004\bY\u0010\b\u001a\u0004\bZ\u0010\nR\u001d\u0010]\u001a\b\u0012\u0004\u0012\u00020X0\u00048\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\\\u0010\nR\u001d\u0010^\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006¢\u0006\f\n\u0004\bR\u0010\b\u001a\u0004\bK\u0010\nR\u001d\u0010_\u001a\b\u0012\u0004\u0012\u00020X0\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\b\u001a\u0004\b5\u0010\nR\u001d\u0010a\u001a\b\u0012\u0004\u0012\u00020X0\u00048\u0006¢\u0006\f\n\u0004\b`\u0010\b\u001a\u0004\b\u001a\u0010\nR\u001d\u0010e\u001a\b\u0012\u0004\u0012\u00020b0\u00048\u0006¢\u0006\f\n\u0004\bc\u0010\b\u001a\u0004\bd\u0010\nR\u001f\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010b0\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\bf\u0010\nR\u001d\u0010i\u001a\b\u0012\u0004\u0012\u00020h0\u00048\u0006¢\u0006\f\n\u0004\bU\u0010\b\u001a\u0004\b.\u0010\nR\u001d\u0010j\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006¢\u0006\f\n\u0004\bZ\u0010\b\u001a\u0004\b`\u0010\nR\u001d\u0010m\u001a\b\u0012\u0004\u0012\u00020k0\u00048\u0006¢\u0006\f\n\u0004\bf\u0010\b\u001a\u0004\bl\u0010\nR\u001d\u0010n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\b\u001a\u0004\b8\u0010\nR\u001d\u0010o\u001a\b\u0012\u0004\u0012\u00020\u00150\u00048\u0006¢\u0006\f\n\u0004\bd\u0010\b\u001a\u0004\bY\u0010\nR\u001d\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\\\u0010\b\u001a\u0004\b\u001e\u0010\nR)\u0010s\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020r0q0\u00048\u0006¢\u0006\f\n\u0004\bl\u0010\b\u001a\u0004\b2\u0010\nR\u001d\u0010t\u001a\b\u0012\u0004\u0012\u00020+0\u00048\u0006¢\u0006\f\n\u0004\bG\u0010\b\u001a\u0004\bC\u0010\nR\u001d\u0010u\u001a\b\u0012\u0004\u0012\u00020r0\u00048\u0006¢\u0006\f\n\u0004\bL\u0010\b\u001a\u0004\bT\u0010\nR\u001d\u0010x\u001a\b\u0012\u0004\u0012\u00020v0\u00048\u0006¢\u0006\f\n\u0004\bw\u0010\b\u001a\u0004\bc\u0010\n¨\u0006y"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsProperties;", "", "<init>", "()V", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "", "", "b", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "d", "()Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "ContentDescription", "c", "J", "StateDescription", "Lcom/google/android/up9;", "E", "ProgressBarRangeInfo", "e", "C", "PaneTitle", "", "f", "G", "SelectableGroup", "Lcom/google/android/nh1;", "g", "a", "CollectionInfo", "Lcom/google/android/oh1;", "h", "CollectionItemInfo", "i", "k", "Heading", "j", "N", "TextEntryKey", "Disabled", "Lcom/google/android/d57;", "l", "A", "LiveRegion", "", "m", "Focused", "n", "s", "getIsContainer$annotations", "IsContainer", "o", "y", "IsTraversalGroup", "p", "w", "IsSensitiveData", "q", "r", "getInvisibleToUser$annotations", "InvisibleToUser", "HideFromAccessibility", "Landroidx/compose/ui/autofill/d;", "ContentType", "Landroidx/compose/ui/autofill/c;", "t", "ContentDataType", "Lcom/google/android/t94;", "u", "FillableData", "", "v", "R", "TraversalIndex", "Lcom/google/android/a9b;", "HorizontalScrollAxisRange", "x", "S", "VerticalScrollAxisRange", "IsPopup", "z", "IsDialog", "Lcom/google/android/hpa;", "F", "Role", "B", "K", "TestTag", "LinkTestMarker", "Landroidx/compose/ui/text/b;", "D", "L", "Text", "P", "TextSubstitution", "IsShowingTextSubstitution", "InputText", "H", "EditableText", "Landroidx/compose/ui/text/x;", "I", "O", "TextSelectionRange", "M", "TextCompositionRange", "Landroidx/compose/ui/text/input/a;", "ImeAction", "Selected", "Landroidx/compose/ui/state/ToggleableState;", "Q", "ToggleableState", "InputTextSuggestionState", "Password", "Error", "Lkotlin/Function1;", "", "IndexForKey", "IsEditable", "MaxTextLength", "Lcom/google/android/xkb;", "T", "Shape", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SemanticsProperties {
    public static final SemanticsProperties a = new SemanticsProperties();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<List<String>> ContentDescription = new SemanticsPropertyKey<>("ContentDescription", true, new Function2<List<? extends String>, List<? extends String>, List<? extends String>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDescription$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<String> invoke(List<String> list, List<String> list2) {
            List<String> listB1;
            if (list == null || (listB1 = m.B1(list)) == null) {
                return list2;
            }
            listB1.addAll(list2);
            return listB1;
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<String> StateDescription = new SemanticsPropertyKey<>("StateDescription", true);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<ProgressBarRangeInfo> ProgressBarRangeInfo = new SemanticsPropertyKey<>("ProgressBarRangeInfo", true);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<String> PaneTitle = new SemanticsPropertyKey<>("PaneTitle", true, new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$PaneTitle$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> SelectableGroup = new SemanticsPropertyKey<>("SelectableGroup", true);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<CollectionInfo> CollectionInfo = new SemanticsPropertyKey<>("CollectionInfo", true);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<oh1> CollectionItemInfo = new SemanticsPropertyKey<>("CollectionItemInfo", true);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> Heading = new SemanticsPropertyKey<>("Heading", true);

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> TextEntryKey = new SemanticsPropertyKey<>("TextEntryKey", true);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> Disabled = new SemanticsPropertyKey<>("Disabled", true);

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<d57> LiveRegion = new SemanticsPropertyKey<>("LiveRegion", true);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> Focused = new SemanticsPropertyKey<>("Focused", true);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsContainer = new SemanticsPropertyKey<>("IsContainer", true);

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsTraversalGroup = new SemanticsPropertyKey<>("IsTraversalGroup", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsSensitiveData = new SemanticsPropertyKey<>("IsSensitiveData", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> InvisibleToUser = new SemanticsPropertyKey<>("InvisibleToUser", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$InvisibleToUser$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    });

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> HideFromAccessibility = new SemanticsPropertyKey<>("HideFromAccessibility", new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$HideFromAccessibility$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    });

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<d> ContentType = new SemanticsPropertyKey<>("ContentType", new Function2<d, d, d>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentType$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final d invoke(d dVar, d dVar2) {
            return dVar;
        }
    });

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<androidx.compose.ui.autofill.c> ContentDataType = new SemanticsPropertyKey<>("ContentDataType", new Function2<androidx.compose.ui.autofill.c, androidx.compose.ui.autofill.c, androidx.compose.ui.autofill.c>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$ContentDataType$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.ui.autofill.c invoke(androidx.compose.ui.autofill.c cVar, androidx.compose.ui.autofill.c cVar2) {
            return cVar;
        }
    });

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<t94> FillableData = new SemanticsPropertyKey<>("FillableData", new Function2<t94, t94, t94>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$FillableData$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final t94 invoke(t94 t94Var, t94 t94Var2) {
            return t94Var;
        }
    });

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Float> TraversalIndex = new SemanticsPropertyKey<>("TraversalIndex", new Function2<Float, Float, Float>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TraversalIndex$1
        public final Float a(Float f, float f2) {
            return f;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((Float) obj, ((Number) obj2).floatValue());
        }
    });

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<ScrollAxisRange> HorizontalScrollAxisRange = new SemanticsPropertyKey<>("HorizontalScrollAxisRange", true);

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<ScrollAxisRange> VerticalScrollAxisRange = new SemanticsPropertyKey<>("VerticalScrollAxisRange", true);

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> IsPopup = new SemanticsPropertyKey<>("IsPopup", true, new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsPopup$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> IsDialog = new SemanticsPropertyKey<>("IsDialog", true, new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$IsDialog$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<hpa> Role = new SemanticsPropertyKey<>("Role", true, new Function2<hpa, hpa, hpa>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Role$1
        public final hpa a(hpa hpaVar, int i2) {
            return hpaVar;
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((hpa) obj, ((hpa) obj2).getValue());
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<String> TestTag = new SemanticsPropertyKey<>("TestTag", false, new Function2<String, String, String>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$TestTag$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String str, String str2) {
            return str;
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> LinkTestMarker = new SemanticsPropertyKey<>("LinkTestMarker", false, new Function2<Unit, Unit, Unit>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$LinkTestMarker$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Unit invoke(Unit unit, Unit unit2) {
            return unit;
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<List<androidx.compose.ui.text.b>> Text = new SemanticsPropertyKey<>("Text", true, new Function2<List<? extends androidx.compose.ui.text.b>, List<? extends androidx.compose.ui.text.b>, List<? extends androidx.compose.ui.text.b>>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Text$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<androidx.compose.ui.text.b> invoke(List<androidx.compose.ui.text.b> list, List<androidx.compose.ui.text.b> list2) {
            List<androidx.compose.ui.text.b> listB1;
            if (list == null || (listB1 = m.B1(list)) == null) {
                return list2;
            }
            listB1.addAll(list2);
            return listB1;
        }
    }, null, 8, null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<androidx.compose.ui.text.b> TextSubstitution = new SemanticsPropertyKey<>("TextSubstitution", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsShowingTextSubstitution = new SemanticsPropertyKey<>("IsShowingTextSubstitution", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<androidx.compose.ui.text.b> InputText = new SemanticsPropertyKey<>("InputText", true);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<androidx.compose.ui.text.b> EditableText = new SemanticsPropertyKey<>("EditableText", true);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<x> TextSelectionRange = new SemanticsPropertyKey<>("TextSelectionRange", true);

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<x> TextCompositionRange = new SemanticsPropertyKey<>("TextCompositionRange", true);

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<androidx.compose.ui.text.input.a> ImeAction = new SemanticsPropertyKey<>("ImeAction", true);

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> Selected = new SemanticsPropertyKey<>("Selected", true);

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<ToggleableState> ToggleableState = new SemanticsPropertyKey<>("ToggleableState", true);

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Object> InputTextSuggestionState = new SemanticsPropertyKey<>("InputTextSuggestionState", true);

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Unit> Password = new SemanticsPropertyKey<>("Password", true);

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<String> Error = new SemanticsPropertyKey<>("Error", true);

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Function1<Object, Integer>> IndexForKey = new SemanticsPropertyKey<>("IndexForKey", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Boolean> IsEditable = new SemanticsPropertyKey<>("IsEditable", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<Integer> MaxTextLength = new SemanticsPropertyKey<>("MaxTextLength", (Function2) null, 2, (DefaultConstructorMarker) null);

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final SemanticsPropertyKey<xkb> Shape = new SemanticsPropertyKey<>("Shape", false, new Function2<xkb, xkb, xkb>() { // from class: androidx.compose.ui.semantics.SemanticsProperties$Shape$1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xkb invoke(xkb xkbVar, xkb xkbVar2) {
            return xkbVar;
        }
    }, null, 8, null);
    public static final int U = 8;

    private SemanticsProperties() {
    }

    public final SemanticsPropertyKey<d57> A() {
        return LiveRegion;
    }

    public final SemanticsPropertyKey<Integer> B() {
        return MaxTextLength;
    }

    public final SemanticsPropertyKey<String> C() {
        return PaneTitle;
    }

    public final SemanticsPropertyKey<Unit> D() {
        return Password;
    }

    public final SemanticsPropertyKey<ProgressBarRangeInfo> E() {
        return ProgressBarRangeInfo;
    }

    public final SemanticsPropertyKey<hpa> F() {
        return Role;
    }

    public final SemanticsPropertyKey<Unit> G() {
        return SelectableGroup;
    }

    public final SemanticsPropertyKey<Boolean> H() {
        return Selected;
    }

    public final SemanticsPropertyKey<xkb> I() {
        return Shape;
    }

    public final SemanticsPropertyKey<String> J() {
        return StateDescription;
    }

    public final SemanticsPropertyKey<String> K() {
        return TestTag;
    }

    public final SemanticsPropertyKey<List<androidx.compose.ui.text.b>> L() {
        return Text;
    }

    public final SemanticsPropertyKey<x> M() {
        return TextCompositionRange;
    }

    public final SemanticsPropertyKey<Unit> N() {
        return TextEntryKey;
    }

    public final SemanticsPropertyKey<x> O() {
        return TextSelectionRange;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.b> P() {
        return TextSubstitution;
    }

    public final SemanticsPropertyKey<ToggleableState> Q() {
        return ToggleableState;
    }

    public final SemanticsPropertyKey<Float> R() {
        return TraversalIndex;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> S() {
        return VerticalScrollAxisRange;
    }

    public final SemanticsPropertyKey<CollectionInfo> a() {
        return CollectionInfo;
    }

    public final SemanticsPropertyKey<oh1> b() {
        return CollectionItemInfo;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.autofill.c> c() {
        return ContentDataType;
    }

    public final SemanticsPropertyKey<List<String>> d() {
        return ContentDescription;
    }

    public final SemanticsPropertyKey<d> e() {
        return ContentType;
    }

    public final SemanticsPropertyKey<Unit> f() {
        return Disabled;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.b> g() {
        return EditableText;
    }

    public final SemanticsPropertyKey<String> h() {
        return Error;
    }

    public final SemanticsPropertyKey<t94> i() {
        return FillableData;
    }

    public final SemanticsPropertyKey<Boolean> j() {
        return Focused;
    }

    public final SemanticsPropertyKey<Unit> k() {
        return Heading;
    }

    public final SemanticsPropertyKey<Unit> l() {
        return HideFromAccessibility;
    }

    public final SemanticsPropertyKey<ScrollAxisRange> m() {
        return HorizontalScrollAxisRange;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.input.a> n() {
        return ImeAction;
    }

    public final SemanticsPropertyKey<Function1<Object, Integer>> o() {
        return IndexForKey;
    }

    public final SemanticsPropertyKey<androidx.compose.ui.text.b> p() {
        return InputText;
    }

    public final SemanticsPropertyKey<Object> q() {
        return InputTextSuggestionState;
    }

    public final SemanticsPropertyKey<Unit> r() {
        return InvisibleToUser;
    }

    public final SemanticsPropertyKey<Boolean> s() {
        return IsContainer;
    }

    public final SemanticsPropertyKey<Unit> t() {
        return IsDialog;
    }

    public final SemanticsPropertyKey<Boolean> u() {
        return IsEditable;
    }

    public final SemanticsPropertyKey<Unit> v() {
        return IsPopup;
    }

    public final SemanticsPropertyKey<Boolean> w() {
        return IsSensitiveData;
    }

    public final SemanticsPropertyKey<Boolean> x() {
        return IsShowingTextSubstitution;
    }

    public final SemanticsPropertyKey<Boolean> y() {
        return IsTraversalGroup;
    }

    public final SemanticsPropertyKey<Unit> z() {
        return LinkTestMarker;
    }
}
