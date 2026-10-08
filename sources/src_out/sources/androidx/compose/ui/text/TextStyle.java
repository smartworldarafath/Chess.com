package androidx.compose.ui.text;

import androidx.compose.ui.text.font.FontWeight;
import com.google.inputmethod.LineHeightStyle;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.PlatformTextStyle;
import com.google.inputmethod.Shadow;
import com.google.inputmethod.TextGeometricTransform;
import com.google.inputmethod.TextIndent;
import com.google.inputmethod.b0d;
import com.google.inputmethod.cpc;
import com.google.inputmethod.d27;
import com.google.inputmethod.dsc;
import com.google.inputmethod.ei1;
import com.google.inputmethod.gwc;
import com.google.inputmethod.qi5;
import com.google.inputmethod.qu0;
import com.google.inputmethod.ryc;
import com.google.inputmethod.vzc;
import com.google.inputmethod.wg0;
import com.google.inputmethod.wrc;
import com.google.inputmethod.wzb;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: androidx.compose.ui.text.y, reason: from toString */
/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b'\b\u0007\u0018\u0000 a2\u00020\u0001:\u0001QB%\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nB\u0097\u0002\b\u0016\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\r\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\b\b\u0002\u0010 \u001a\u00020\u000b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010+\u001a\u00020\r\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00101\u001a\u000200\u0012\b\b\u0002\u00103\u001a\u000202\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\b\b\u00106J\u000f\u00107\u001a\u00020\u0002H\u0007¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020\u00002\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b<\u0010=J\u009d\u0002\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00105\u001a\u0004\u0018\u000104H\u0007¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0004H\u0007¢\u0006\u0004\b@\u0010AJ\u0018\u0010B\u001a\u00020\u00002\u0006\u0010;\u001a\u00020\u0000H\u0087\u0002¢\u0006\u0004\bB\u0010=J\u009b\u0002\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010\u0019\u001a\u00020\r2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\b\u0002\u0010 \u001a\u00020\u000b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\b\b\u0002\u0010(\u001a\u00020'2\b\b\u0002\u0010*\u001a\u00020)2\b\b\u0002\u0010+\u001a\u00020\r2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\b\b\u0002\u00101\u001a\u0002002\b\b\u0002\u00103\u001a\u0002022\n\b\u0002\u00105\u001a\u0004\u0018\u000104¢\u0006\u0004\bC\u0010DJ\u001a\u0010F\u001a\u00020E2\b\u0010;\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bF\u0010GJ\u0015\u0010H\u001a\u00020E2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bH\u0010IJ\u0015\u0010J\u001a\u00020E2\u0006\u0010;\u001a\u00020\u0000¢\u0006\u0004\bJ\u0010IJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020KH\u0000¢\u0006\u0004\bN\u0010MJ\u000f\u0010O\u001a\u00020\u0017H\u0016¢\u0006\u0004\bO\u0010PR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bQ\u0010R\u001a\u0004\bS\u00108R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\bC\u0010T\u001a\u0004\bU\u0010:R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\u0013\u0010]\u001a\u0004\u0018\u00010Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0011\u0010c\u001a\u00020`8F¢\u0006\u0006\u001a\u0004\ba\u0010bR\u0011\u0010\u000e\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bd\u0010_R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\be\u0010fR\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\bg\u0010hR\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u00138F¢\u0006\u0006\u001a\u0004\bi\u0010jR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00158F¢\u0006\u0006\u001a\u0004\bk\u0010lR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u00178F¢\u0006\u0006\u001a\u0004\bm\u0010PR\u0011\u0010\u0019\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bn\u0010_R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\bo\u0010pR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001c8F¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\bs\u0010tR\u0011\u0010 \u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bu\u0010_R\u0013\u0010\"\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\bv\u0010wR\u0013\u0010$\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\bx\u0010yR\u0013\u0010&\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\bz\u0010{R\u0011\u0010(\u001a\u00020'8F¢\u0006\u0006\u001a\u0004\b|\u0010MR\u0011\u0010*\u001a\u00020)8F¢\u0006\u0006\u001a\u0004\b}\u0010MR\u0011\u0010+\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b~\u0010_R\u0014\u0010-\u001a\u0004\u0018\u00010,8F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010/\u001a\u0004\u0018\u00010.8F¢\u0006\b\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0012\u00103\u001a\u0002028F¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010MR\u0012\u00101\u001a\u0002008F¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010MR\u0015\u00105\u001a\u0004\u0018\u0001048F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u0087\u0001"}, d2 = {"Landroidx/compose/ui/text/y;", "", "Landroidx/compose/ui/text/r;", "spanStyle", "Landroidx/compose/ui/text/m;", "paragraphStyle", "Lcom/google/android/cc9;", "platformStyle", "<init>", "(Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/m;Lcom/google/android/cc9;)V", "(Landroidx/compose/ui/text/r;Landroidx/compose/ui/text/m;)V", "Lcom/google/android/ei1;", "color", "Lcom/google/android/b0d;", "fontSize", "Landroidx/compose/ui/text/font/x;", "fontWeight", "Landroidx/compose/ui/text/font/t;", "fontStyle", "Landroidx/compose/ui/text/font/u;", "fontSynthesis", "Landroidx/compose/ui/text/font/l;", "fontFamily", "", "fontFeatureSettings", "letterSpacing", "Lcom/google/android/wg0;", "baselineShift", "Lcom/google/android/hwc;", "textGeometricTransform", "Lcom/google/android/g77;", "localeList", "background", "Lcom/google/android/wrc;", "textDecoration", "Lcom/google/android/nkb;", "shadow", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "Lcom/google/android/cpc;", "textAlign", "Lcom/google/android/dsc;", "textDirection", "lineHeight", "Lcom/google/android/owc;", "textIndent", "Lcom/google/android/g27;", "lineHeightStyle", "Lcom/google/android/d27;", "lineBreak", "Lcom/google/android/qi5;", "hyphens", "Lcom/google/android/ryc;", "textMotion", "(JJLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Landroidx/compose/ui/graphics/drawscope/b;IIJLcom/google/android/owc;Lcom/google/android/cc9;Lcom/google/android/g27;IILcom/google/android/ryc;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "O", "()Landroidx/compose/ui/text/r;", "N", "()Landroidx/compose/ui/text/m;", "other", "J", "(Landroidx/compose/ui/text/y;)Landroidx/compose/ui/text/y;", "K", "(JJLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Landroidx/compose/ui/graphics/drawscope/b;IIJLcom/google/android/owc;Lcom/google/android/g27;IILcom/google/android/cc9;Lcom/google/android/ryc;)Landroidx/compose/ui/text/y;", "I", "(Landroidx/compose/ui/text/m;)Landroidx/compose/ui/text/y;", "M", "b", "(JJLandroidx/compose/ui/text/font/x;Landroidx/compose/ui/text/font/t;Landroidx/compose/ui/text/font/u;Landroidx/compose/ui/text/font/l;Ljava/lang/String;JLcom/google/android/wg0;Lcom/google/android/hwc;Lcom/google/android/g77;JLcom/google/android/wrc;Lcom/google/android/nkb;Landroidx/compose/ui/graphics/drawscope/b;IIJLcom/google/android/owc;Lcom/google/android/cc9;Lcom/google/android/g27;IILcom/google/android/ryc;)Landroidx/compose/ui/text/y;", "", "equals", "(Ljava/lang/Object;)Z", "G", "(Landroidx/compose/ui/text/y;)Z", "F", "", "hashCode", "()I", "H", "toString", "()Ljava/lang/String;", "a", "Landroidx/compose/ui/text/r;", "y", "Landroidx/compose/ui/text/m;", "v", "c", "Lcom/google/android/cc9;", "w", "()Lcom/google/android/cc9;", "Lcom/google/android/qu0;", "g", "()Lcom/google/android/qu0;", "brush", "h", "()J", "", "d", "()F", "alpha", "l", "o", "()Landroidx/compose/ui/text/font/x;", "m", "()Landroidx/compose/ui/text/font/t;", "n", "()Landroidx/compose/ui/text/font/u;", "j", "()Landroidx/compose/ui/text/font/l;", "k", "q", "f", "()Lcom/google/android/wg0;", "C", "()Lcom/google/android/hwc;", "u", "()Lcom/google/android/g77;", "e", "A", "()Lcom/google/android/wrc;", "x", "()Lcom/google/android/nkb;", "i", "()Landroidx/compose/ui/graphics/drawscope/b;", "z", "B", "s", "D", "()Lcom/google/android/owc;", "t", "()Lcom/google/android/g27;", "p", "r", "E", "()Lcom/google/android/ryc;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextStyle {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final TextStyle e = new TextStyle(0, 0, null, null, null, null, null, 0, null, null, null, 0, null, null, null, 0, 0, 0, null, null, null, 0, 0, null, 16777215, null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final SpanStyle spanStyle;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ParagraphStyle paragraphStyle;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    private final PlatformTextStyle platformStyle;

    /* JADX INFO: renamed from: androidx.compose.ui.text.y$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Landroidx/compose/ui/text/y$a;", "", "<init>", "()V", "Landroidx/compose/ui/text/y;", "Default", "Landroidx/compose/ui/text/y;", "a", "()Landroidx/compose/ui/text/y;", "getDefault$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TextStyle a() {
            return TextStyle.e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow nkbVar, androidx.compose.ui.graphics.drawscope.b bVar, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, fontWeight, tVar, uVar, lVar, str, j3, wg0Var, textGeometricTransform, localeList, j4, wrcVar, nkbVar, bVar, i, i2, j5, textIndent, platformTextStyle, lineHeightStyle, i3, i4, rycVar);
    }

    public static /* synthetic */ TextStyle c(TextStyle textStyle, long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow nkbVar, androidx.compose.ui.graphics.drawscope.b bVar, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar, int i5, Object obj) {
        ryc rycVarK;
        int i6;
        long jG = (i5 & 1) != 0 ? textStyle.spanStyle.g() : j;
        long jK = (i5 & 2) != 0 ? textStyle.spanStyle.getFontSize() : j2;
        FontWeight fontWeightN = (i5 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : fontWeight;
        androidx.compose.ui.text.font.t tVarL = (i5 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : tVar;
        androidx.compose.ui.text.font.u uVarM = (i5 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : uVar;
        androidx.compose.ui.text.font.l lVarI = (i5 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : lVar;
        String strJ = (i5 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : str;
        long jO = (i5 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : j3;
        wg0 wg0VarE = (i5 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : wg0Var;
        TextGeometricTransform textGeometricTransformU = (i5 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : textGeometricTransform;
        LocaleList localeListP = (i5 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : localeList;
        long j6 = jG;
        long jD = (i5 & 2048) != 0 ? textStyle.spanStyle.getBackground() : j4;
        wrc wrcVarS = (i5 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : wrcVar;
        Shadow nkbVarR = (i5 & 8192) != 0 ? textStyle.spanStyle.getShadow() : nkbVar;
        wrc wrcVar2 = wrcVarS;
        androidx.compose.ui.graphics.drawscope.b bVarH = (i5 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : bVar;
        int iH = (i5 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : i;
        int i7 = (i5 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : i2;
        long jE = (i5 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : j5;
        TextIndent textIndentJ = (i5 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : textIndent;
        PlatformTextStyle platformTextStyle2 = (i5 & 524288) != 0 ? textStyle.platformStyle : platformTextStyle;
        LineHeightStyle lineHeightStyleF = (i5 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : lineHeightStyle;
        int iD = (i5 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : i3;
        int iC = (i5 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : i4;
        if ((i5 & 8388608) != 0) {
            i6 = iC;
            rycVarK = textStyle.paragraphStyle.getTextMotion();
        } else {
            rycVarK = rycVar;
            i6 = iC;
        }
        return textStyle.b(j6, jK, fontWeightN, tVarL, uVarM, lVarI, strJ, jO, wg0VarE, textGeometricTransformU, localeListP, jD, wrcVar2, nkbVarR, bVarH, iH, i7, jE, textIndentJ, platformTextStyle2, lineHeightStyleF, iD, i6, rycVarK);
    }

    public final wrc A() {
        return this.spanStyle.getTextDecoration();
    }

    public final int B() {
        return this.paragraphStyle.getTextDirection();
    }

    public final TextGeometricTransform C() {
        return this.spanStyle.getTextGeometricTransform();
    }

    public final TextIndent D() {
        return this.paragraphStyle.getTextIndent();
    }

    public final ryc E() {
        return this.paragraphStyle.getTextMotion();
    }

    public final boolean F(TextStyle other) {
        return this == other || this.spanStyle.w(other.spanStyle);
    }

    public final boolean G(TextStyle other) {
        if (this != other) {
            return Intrinsics.e(this.paragraphStyle, other.paragraphStyle) && this.spanStyle.v(other.spanStyle);
        }
        return true;
    }

    public final int H() {
        int iX = ((this.spanStyle.x() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iX + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final TextStyle I(ParagraphStyle other) {
        return new TextStyle(getSpanStyle(), getParagraphStyle().l(other));
    }

    public final TextStyle J(TextStyle other) {
        return (other == null || Intrinsics.e(other, e)) ? this : new TextStyle(getSpanStyle().y(other.getSpanStyle()), getParagraphStyle().l(other.getParagraphStyle()));
    }

    public final TextStyle K(long color, long fontSize, FontWeight fontWeight, androidx.compose.ui.text.font.t fontStyle, androidx.compose.ui.text.font.u fontSynthesis, androidx.compose.ui.text.font.l fontFamily, String fontFeatureSettings, long letterSpacing, wg0 baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, wrc textDecoration, Shadow shadow, androidx.compose.ui.graphics.drawscope.b drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, PlatformTextStyle platformStyle, ryc textMotion) {
        SpanStyle rVarC = wzb.c(this.spanStyle, color, null, Float.NaN, fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle);
        ParagraphStyle mVarA = n.a(this.paragraphStyle, textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion);
        return (this.spanStyle == rVarC && this.paragraphStyle == mVarA) ? this : new TextStyle(rVarC, mVarA);
    }

    public final TextStyle M(TextStyle other) {
        return J(other);
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final ParagraphStyle getParagraphStyle() {
        return this.paragraphStyle;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final SpanStyle getSpanStyle() {
        return this.spanStyle;
    }

    public final TextStyle b(long color, long fontSize, FontWeight fontWeight, androidx.compose.ui.text.font.t fontStyle, androidx.compose.ui.text.font.u fontSynthesis, androidx.compose.ui.text.font.l fontFamily, String fontFeatureSettings, long letterSpacing, wg0 baselineShift, TextGeometricTransform textGeometricTransform, LocaleList localeList, long background, wrc textDecoration, Shadow shadow, androidx.compose.ui.graphics.drawscope.b drawStyle, int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformTextStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, ryc textMotion) {
        return new TextStyle(new SpanStyle(ei1.r(color, this.spanStyle.g()) ? this.spanStyle.getTextForegroundStyle() : gwc.INSTANCE.b(color), fontSize, fontWeight, fontStyle, fontSynthesis, fontFamily, fontFeatureSettings, letterSpacing, baselineShift, textGeometricTransform, localeList, background, textDecoration, shadow, platformStyle != null ? platformStyle.getSpanStyle() : null, drawStyle, (DefaultConstructorMarker) null), new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle != null ? platformStyle.getParagraphSyle() : null, lineHeightStyle, lineBreak, hyphens, textMotion, null), platformStyle);
    }

    public final float d() {
        return this.spanStyle.c();
    }

    public final long e() {
        return this.spanStyle.getBackground();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStyle)) {
            return false;
        }
        TextStyle textStyle = (TextStyle) other;
        return Intrinsics.e(this.spanStyle, textStyle.spanStyle) && Intrinsics.e(this.paragraphStyle, textStyle.paragraphStyle) && Intrinsics.e(this.platformStyle, textStyle.platformStyle);
    }

    public final wg0 f() {
        return this.spanStyle.getBaselineShift();
    }

    public final qu0 g() {
        return this.spanStyle.f();
    }

    public final long h() {
        return this.spanStyle.g();
    }

    public int hashCode() {
        int iHashCode = ((this.spanStyle.hashCode() * 31) + this.paragraphStyle.hashCode()) * 31;
        PlatformTextStyle platformTextStyle = this.platformStyle;
        return iHashCode + (platformTextStyle != null ? platformTextStyle.hashCode() : 0);
    }

    public final androidx.compose.ui.graphics.drawscope.b i() {
        return this.spanStyle.getDrawStyle();
    }

    public final androidx.compose.ui.text.font.l j() {
        return this.spanStyle.getFontFamily();
    }

    public final String k() {
        return this.spanStyle.getFontFeatureSettings();
    }

    public final long l() {
        return this.spanStyle.getFontSize();
    }

    public final androidx.compose.ui.text.font.t m() {
        return this.spanStyle.getFontStyle();
    }

    public final androidx.compose.ui.text.font.u n() {
        return this.spanStyle.getFontSynthesis();
    }

    public final FontWeight o() {
        return this.spanStyle.getFontWeight();
    }

    public final int p() {
        return this.paragraphStyle.getHyphens();
    }

    public final long q() {
        return this.spanStyle.getLetterSpacing();
    }

    public final int r() {
        return this.paragraphStyle.getLineBreak();
    }

    public final long s() {
        return this.paragraphStyle.getLineHeight();
    }

    public final LineHeightStyle t() {
        return this.paragraphStyle.getLineHeightStyle();
    }

    public String toString() {
        return "TextStyle(color=" + ((Object) ei1.y(h())) + ", brush=" + g() + ", alpha=" + d() + ", fontSize=" + ((Object) b0d.l(l())) + ", fontWeight=" + o() + ", fontStyle=" + m() + ", fontSynthesis=" + n() + ", fontFamily=" + j() + ", fontFeatureSettings=" + k() + ", letterSpacing=" + ((Object) b0d.l(q())) + ", baselineShift=" + f() + ", textGeometricTransform=" + C() + ", localeList=" + u() + ", background=" + ((Object) ei1.y(e())) + ", textDecoration=" + A() + ", shadow=" + x() + ", drawStyle=" + i() + ", textAlign=" + ((Object) cpc.m(z())) + ", textDirection=" + ((Object) dsc.l(B())) + ", lineHeight=" + ((Object) b0d.l(s())) + ", textIndent=" + D() + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + t() + ", lineBreak=" + ((Object) d27.l(r())) + ", hyphens=" + ((Object) qi5.i(p())) + ", textMotion=" + E() + ')';
    }

    public final LocaleList u() {
        return this.spanStyle.getLocaleList();
    }

    public final ParagraphStyle v() {
        return this.paragraphStyle;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final PlatformTextStyle getPlatformStyle() {
        return this.platformStyle;
    }

    public final Shadow x() {
        return this.spanStyle.getShadow();
    }

    public final SpanStyle y() {
        return this.spanStyle;
    }

    public final int z() {
        return this.paragraphStyle.getTextAlign();
    }

    public TextStyle(SpanStyle rVar, ParagraphStyle mVar, PlatformTextStyle platformTextStyle) {
        this.spanStyle = rVar;
        this.paragraphStyle = mVar;
        this.platformStyle = platformTextStyle;
    }

    public TextStyle(SpanStyle rVar, ParagraphStyle mVar) {
        this(rVar, mVar, vzc.b(rVar.getPlatformStyle(), mVar.getPlatformStyle()));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ TextStyle(long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow nkbVar, androidx.compose.ui.graphics.drawscope.b bVar, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        long jI = (i5 & 1) != 0 ? ei1.INSTANCE.i() : j;
        long jA = (i5 & 2) != 0 ? b0d.INSTANCE.a() : j2;
        FontWeight fontWeight2 = (i5 & 4) != 0 ? null : fontWeight;
        androidx.compose.ui.text.font.t tVar2 = (i5 & 8) != 0 ? null : tVar;
        androidx.compose.ui.text.font.u uVar2 = (i5 & 16) != 0 ? null : uVar;
        androidx.compose.ui.text.font.l lVar2 = (i5 & 32) != 0 ? null : lVar;
        String str2 = (i5 & 64) != 0 ? null : str;
        long jA2 = (i5 & 128) != 0 ? b0d.INSTANCE.a() : j3;
        wg0 wg0Var2 = (i5 & 256) != 0 ? null : wg0Var;
        TextGeometricTransform textGeometricTransform2 = (i5 & 512) != 0 ? null : textGeometricTransform;
        LocaleList localeList2 = (i5 & 1024) != 0 ? null : localeList;
        long jI2 = (i5 & 2048) != 0 ? ei1.INSTANCE.i() : j4;
        wrc wrcVar2 = (i5 & 4096) != 0 ? null : wrcVar;
        long j6 = jI;
        Shadow nkbVar2 = (i5 & 8192) != 0 ? null : nkbVar;
        androidx.compose.ui.graphics.drawscope.b bVar2 = (i5 & 16384) != 0 ? null : bVar;
        int iG = (i5 & 32768) != 0 ? cpc.INSTANCE.g() : i;
        int iF = (i5 & 65536) != 0 ? dsc.INSTANCE.f() : i2;
        long jA3 = (i5 & 131072) != 0 ? b0d.INSTANCE.a() : j5;
        TextIndent textIndent2 = (i5 & 262144) != 0 ? null : textIndent;
        PlatformTextStyle platformTextStyle2 = (i5 & 524288) != 0 ? null : platformTextStyle;
        LineHeightStyle lineHeightStyle2 = (i5 & 1048576) != 0 ? null : lineHeightStyle;
        int iC = (i5 & 2097152) != 0 ? d27.INSTANCE.c() : i3;
        int iC2 = (i5 & 4194304) != 0 ? qi5.INSTANCE.c() : i4;
        long j7 = jA;
        FontWeight fontWeight3 = fontWeight2;
        wrc wrcVar3 = wrcVar2;
        androidx.compose.ui.text.font.t tVar3 = tVar2;
        androidx.compose.ui.text.font.u uVar3 = uVar2;
        androidx.compose.ui.text.font.l lVar3 = lVar2;
        String str3 = str2;
        long j8 = jA2;
        wg0 wg0Var3 = wg0Var2;
        TextGeometricTransform textGeometricTransform3 = textGeometricTransform2;
        LocaleList localeList3 = localeList2;
        long j9 = jI2;
        this(j6, j7, fontWeight3, tVar3, uVar3, lVar3, str3, j8, wg0Var3, textGeometricTransform3, localeList3, j9, wrcVar3, nkbVar2, bVar2, iG, iF, jA3, textIndent2, platformTextStyle2, lineHeightStyle2, iC, iC2, (i5 & 8388608) != 0 ? null : rycVar, null);
    }

    private TextStyle(long j, long j2, FontWeight fontWeight, androidx.compose.ui.text.font.t tVar, androidx.compose.ui.text.font.u uVar, androidx.compose.ui.text.font.l lVar, String str, long j3, wg0 wg0Var, TextGeometricTransform textGeometricTransform, LocaleList localeList, long j4, wrc wrcVar, Shadow nkbVar, androidx.compose.ui.graphics.drawscope.b bVar, int i, int i2, long j5, TextIndent textIndent, PlatformTextStyle platformTextStyle, LineHeightStyle lineHeightStyle, int i3, int i4, ryc rycVar) {
        this(new SpanStyle(j, j2, fontWeight, tVar, uVar, lVar, str, j3, wg0Var, textGeometricTransform, localeList, j4, wrcVar, nkbVar, platformTextStyle != null ? platformTextStyle.getSpanStyle() : null, bVar, (DefaultConstructorMarker) null), new ParagraphStyle(i, i2, j5, textIndent, platformTextStyle != null ? platformTextStyle.getParagraphSyle() : null, lineHeightStyle, i3, i4, rycVar, null), platformTextStyle);
    }
}
