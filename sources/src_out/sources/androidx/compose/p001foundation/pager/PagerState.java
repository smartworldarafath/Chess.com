package androidx.compose.p001foundation.pager;

import androidx.compose.p001foundation.MutatePriority;
import androidx.compose.p001foundation.gestures.Orientation;
import androidx.compose.p001foundation.gestures.u;
import androidx.compose.p001foundation.pager.PagerState;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.p004runtime.snapshots.g;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.sh7;
import com.google.inputmethod.az8;
import com.google.inputmethod.bc0;
import com.google.inputmethod.bt6;
import com.google.inputmethod.cx5;
import com.google.inputmethod.f43;
import com.google.inputmethod.fl9;
import com.google.inputmethod.gn8;
import com.google.inputmethod.hab;
import com.google.inputmethod.j26;
import com.google.inputmethod.jj7;
import com.google.inputmethod.jz8;
import com.google.inputmethod.k26;
import com.google.inputmethod.kr;
import com.google.inputmethod.ky8;
import com.google.inputmethod.lr;
import com.google.inputmethod.mu6;
import com.google.inputmethod.mwb;
import com.google.inputmethod.mz8;
import com.google.inputmethod.nu6;
import com.google.inputmethod.nx1;
import com.google.inputmethod.nz8;
import com.google.inputmethod.o58;
import com.google.inputmethod.p9b;
import com.google.inputmethod.pea;
import com.google.inputmethod.q48;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qe8;
import com.google.inputmethod.qea;
import com.google.inputmethod.r48;
import com.google.inputmethod.rn8;
import com.google.inputmethod.up1;
import com.google.inputmethod.us6;
import com.google.inputmethod.wy8;
import com.google.inputmethod.yx8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0004¬\u0001°\u0001\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\"\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000e*\u00020(2\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0018H\u0000¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u000e2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\nJ2\u00103\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u00042\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000401H\u0086@¢\u0006\u0004\b3\u00104J<\u0010;\u001a\u00020\u000e2\u0006\u00106\u001a\u0002052\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e08\u0012\u0006\u0012\u0004\u0018\u00010907H\u0096@¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\rJ)\u0010@\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00182\b\b\u0002\u0010?\u001a\u00020\u0018H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0018H\u0000¢\u0006\u0004\bB\u0010CJ!\u0010F\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bF\u0010GR$\u0010K\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010I\u001a\u0004\bJ\u0010CR(\u0010P\u001a\u0004\u0018\u00010\u00112\b\u0010H\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR+\u0010Y\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010[R$\u0010a\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R$\u0010d\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bb\u0010^\u001a\u0004\bc\u0010`R\"\u0010j\u001a\u00020e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010V\"\u0004\bi\u0010XR\"\u0010n\u001a\u00020e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bk\u0010g\u001a\u0004\bl\u0010V\"\u0004\bm\u0010XR\u0016\u0010q\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bo\u0010pR\u0016\u0010s\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010pR\u0014\u0010v\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR$\u0010y\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bw\u0010^\u001a\u0004\bx\u0010`R\u0016\u0010{\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010^R#\u0010\u0080\u0001\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b|\u0010I\u001a\u0004\b}\u0010C\"\u0004\b~\u0010\u007fR\u0017\u0010\u0081\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010^R\u001c\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0017\u0010\u0086\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010IR\u001f\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0087\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010TR)\u0010\u0090\u0001\u001a\u00030\u008a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u000f\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R&\u0010\u0094\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010^\u001a\u0004\b^\u0010`\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001f\u0010\u0099\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\"\u0010\u0096\u0001\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001R0\u0010\u009d\u0001\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u001f\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010`\"\u0006\b\u009c\u0001\u0010\u0093\u0001R0\u0010 \u0001\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0015\u0010\u009a\u0001\u001a\u0005\b\u009e\u0001\u0010`\"\u0006\b\u009f\u0001\u0010\u0093\u0001R\u001e\u0010£\u0001\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000e\n\u0006\b¡\u0001\u0010¢\u0001\u001a\u0004\bI\u0010`R\u001e\u0010)\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b¤\u0001\u0010¢\u0001\u001a\u0005\b¥\u0001\u0010`R \u0010«\u0001\u001a\u00030¦\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001R\u0018\u0010¯\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u00ad\u0001\u0010®\u0001R\u0018\u0010³\u0001\u001a\u00030°\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R \u0010·\u0001\u001a\u00030´\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008c\u0001\u0010µ\u0001\u001a\u0006\b§\u0001\u0010¶\u0001R\u001f\u0010»\u0001\u001a\u00030¸\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b_\u0010¹\u0001\u001a\u0006\b¤\u0001\u0010º\u0001R\u001f\u0010¿\u0001\u001a\u00030¼\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bc\u0010½\u0001\u001a\u0006\b¡\u0001\u0010¾\u0001R6\u0010Å\u0001\u001a\u0005\u0018\u00010À\u00012\t\u0010R\u001a\u0005\u0018\u00010À\u00018@@BX\u0080\u008e\u0002¢\u0006\u0016\n\u0004\bp\u0010T\u001a\u0006\bÁ\u0001\u0010Â\u0001\"\u0006\bÃ\u0001\u0010Ä\u0001R \u0010Ê\u0001\u001a\u00030Æ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0097\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R'\u0010Ï\u0001\u001a\u00030Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bÌ\u0001\u0010g\u001a\u0005\bÍ\u0001\u0010V\"\u0005\bÎ\u0001\u0010XR\u001f\u0010Ô\u0001\u001a\u00030Ð\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b^\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010Ó\u0001R\u001e\u0010Ø\u0001\u001a\u00030Õ\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\bg\u0010T\u001a\u0006\bÖ\u0001\u0010×\u0001R\u001e\u0010Ú\u0001\u001a\u00030Õ\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\bh\u0010T\u001a\u0006\bÙ\u0001\u0010×\u0001R.\u0010Ü\u0001\u001a\u00020\u00182\u0006\u0010R\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bÙ\u0001\u0010T\u001a\u0004\bS\u0010C\"\u0005\bÛ\u0001\u0010\u007fR-\u0010Þ\u0001\u001a\u00020\u00182\u0006\u0010R\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\bl\u0010T\u001a\u0004\bb\u0010C\"\u0005\bÝ\u0001\u0010\u007fR\u001d\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bß\u0001\u0010TR\u001d\u0010â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bá\u0001\u0010TR\u0016\u0010ã\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010`R\u0013\u0010å\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\bg\u0010ä\u0001R\u0016\u0010ç\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010`R\u0016\u0010é\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bè\u0001\u0010`R\u0016\u0010ë\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bê\u0001\u0010`R\u0017\u0010î\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\bì\u0001\u0010í\u0001R\u0014\u0010ñ\u0001\u001a\u00030ï\u00018F¢\u0006\u0007\u001a\u0005\bp\u0010ð\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b\u00ad\u0001\u0010`R\u0013\u0010\u0005\u001a\u00020\u00048G¢\u0006\b\u001a\u0006\b±\u0001\u0010í\u0001R!\u0010ö\u0001\u001a\u00030ò\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bß\u0001\u0010ó\u0001*\u0006\bô\u0001\u0010õ\u0001R\u0015\u0010÷\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010CR\u0016\u0010ø\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÌ\u0001\u0010C¨\u0006ù\u0001"}, d2 = {"Landroidx/compose/foundation/pager/PagerState;", "Lcom/google/android/hab;", "", "currentPage", "", "currentPageOffsetFraction", "Lcom/google/android/fl9;", "prefetchScheduler", "<init>", "(IFLcom/google/android/fl9;)V", "(IF)V", "delta", "h0", "(F)F", "", "s", "(Lcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/jz8;", "result", "A0", "(Lcom/google/android/jz8;)V", "w", "(I)I", "scrollDelta", "", "d0", "(F)Z", "Lcom/google/android/wy8;", "info", "g0", "(FLcom/google/android/wy8;)V", "v", "(Lcom/google/android/wy8;)V", "forward", "u", "(ZLcom/google/android/wy8;)I", "page", "pageOffsetFraction", "m0", "(IFLcom/google/android/q22;)Ljava/lang/Object;", "Lcom/google/android/p9b;", "targetPage", "B0", "(Lcom/google/android/p9b;I)V", "offsetFraction", "forceRemeasure", "y0", "(IFZ)V", "j0", "Lcom/google/android/kr;", "animationSpec", "o", "(IFLcom/google/android/kr;Lcom/google/android/q22;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "scrollPriority", "Lkotlin/Function2;", "Lcom/google/android/q22;", "", "block", "a", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lcom/google/android/q22;)Ljava/lang/Object;", "d", "isLookingAhead", "visibleItemsStayedTheSame", "q", "(Lcom/google/android/jz8;ZZ)V", "e0", "()Z", "Lcom/google/android/az8;", "itemProvider", "f0", "(Lcom/google/android/az8;I)I", "value", "Z", "getHasLookaheadOccurred$foundation", "hasLookaheadOccurred", "b", "Lcom/google/android/jz8;", "getApproachLayoutInfo$foundation", "()Lcom/google/android/jz8;", "approachLayoutInfo", "Lcom/google/android/rn8;", "<set-?>", "c", "Lcom/google/android/o58;", "c0", "()J", "w0", "(J)V", "upDownDifference", "Lcom/google/android/mz8;", "Lcom/google/android/mz8;", "scrollPosition", "e", "I", "D", "()I", "firstVisiblePage", "f", "E", "firstVisiblePageOffset", "", "g", "J", "K", "setMaxScrollOffset$foundation", "maxScrollOffset", "h", "M", "setMinScrollOffset$foundation", "minScrollOffset", "i", "F", "accumulator", "j", "previousPassDelta", "k", "Lcom/google/android/hab;", "scrollableState", "l", "getLayoutWithMeasurement$foundation", "layoutWithMeasurement", "m", "layoutWithoutMeasurement", "n", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "(Z)V", "prefetchingEnabled", "indexToPrefetch", "Lcom/google/android/nu6$b;", "p", "Lcom/google/android/nu6$b;", "currentPrefetchHandle", "wasPrefetchingForward", "Lcom/google/android/o58;", "r", "pagerLayoutInfoState", "Lcom/google/android/f43;", "Lcom/google/android/f43;", "C", "()Lcom/google/android/f43;", "r0", "(Lcom/google/android/f43;)V", "density", "t", "setLatestPageSizeWithSpacing$foundation", "(I)V", "latestPageSizeWithSpacing", "Lcom/google/android/r48;", "Lcom/google/android/r48;", "G", "()Lcom/google/android/r48;", "internalInteractionSource", "Lcom/google/android/q48;", "W", "t0", "programmaticScrollTargetPage", "a0", "v0", "settledPageState", "x", "Lcom/google/android/q6c;", "settledPage", "y", "b0", "Lcom/google/android/nu6;", "z", "Lcom/google/android/nu6;", "V", "()Lcom/google/android/nu6;", "prefetchState", "androidx/compose/foundation/pager/PagerState$b", "A", "Landroidx/compose/foundation/pager/PagerState$b;", "pagerCacheWindow", "androidx/compose/foundation/pager/PagerState$a", "B", "Landroidx/compose/foundation/pager/PagerState$a;", "_scrollIndicatorState", "Lcom/google/android/ky8;", "Lcom/google/android/ky8;", "()Lcom/google/android/ky8;", "cacheWindowLogic", "Lcom/google/android/us6;", "Lcom/google/android/us6;", "()Lcom/google/android/us6;", "beyondBoundsInfo", "Lcom/google/android/bc0;", "Lcom/google/android/bc0;", "()Lcom/google/android/bc0;", "awaitLayoutModifier", "Lcom/google/android/pea;", "X", "()Lcom/google/android/pea;", "u0", "(Lcom/google/android/pea;)V", "remeasurement", "Lcom/google/android/qea;", "Lcom/google/android/qea;", "Y", "()Lcom/google/android/qea;", "remeasurementModifier", "Lcom/google/android/kx1;", "H", "getPremeasureConstraints-msEJaDk$foundation", "s0", "premeasureConstraints", "Lcom/google/android/mu6;", "Lcom/google/android/mu6;", "S", "()Lcom/google/android/mu6;", "pinnedPages", "Lcom/google/android/gn8;", "T", "()Lcom/google/android/o58;", "placementScopeInvalidator", "L", "measurementScopeInvalidator", "q0", "canScrollForward", "p0", "canScrollBackward", "N", "isLastScrollForwardState", "O", "isLastScrollBackwardState", "pageCount", "()Lcom/google/android/wy8;", "layoutInfo", "R", "pageSpacing", "P", "pageSize", "Q", "pageSizeWithSpacing", "U", "()F", "positionThresholdFraction", "Lcom/google/android/j26;", "()Lcom/google/android/j26;", "interactionSource", "Lkotlin/ranges/IntRange;", "()Lkotlin/ranges/IntRange;", "getNearestRange$foundation$delegate", "(Landroidx/compose/foundation/pager/PagerState;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "lastScrolledForward", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class PagerState implements hab {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final b pagerCacheWindow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final a _scrollIndicatorState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final ky8 cacheWindowLogic;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final us6 beyondBoundsInfo;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final bc0 awaitLayoutModifier;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final o58 remeasurement;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final qea remeasurementModifier;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private long premeasureConstraints;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final mu6 pinnedPages;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final o58<Unit> placementScopeInvalidator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final o58<Unit> measurementScopeInvalidator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final o58 canScrollForward;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final o58 canScrollBackward;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final o58<Boolean> isLastScrollForwardState;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final o58<Boolean> isLastScrollBackwardState;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private jz8 approachLayoutInfo;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final o58 upDownDifference;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final mz8 scrollPosition;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private int firstVisiblePage;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int firstVisiblePageOffset;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private long maxScrollOffset;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private long minScrollOffset;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private float accumulator;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final hab scrollableState;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int layoutWithMeasurement;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private int layoutWithoutMeasurement;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private int indexToPrefetch;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private nu6.b currentPrefetchHandle;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private boolean wasPrefetchingForward;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private o58<jz8> pagerLayoutInfoState;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int latestPageSizeWithSpacing;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final r48 internalInteractionSource;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final q48 programmaticScrollTargetPage;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final q48 settledPageState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final q6c settledPage;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final q6c targetPage;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final nu6 prefetchState;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/foundation/pager/PagerState$a", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"androidx/compose/foundation/pager/PagerState$b", "Lcom/google/android/bt6;", "Lcom/google/android/f43;", "", "viewport", "b", "(Lcom/google/android/f43;I)I", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements bt6 {
        b() {
        }

        @Override // com.google.inputmethod.bt6
        public int a(f43 f43Var, int i) {
            return 0;
        }

        @Override // com.google.inputmethod.bt6
        public int b(f43 f43Var, int i) {
            return PagerState.this.getLatestPageSizeWithSpacing();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"androidx/compose/foundation/pager/PagerState$c", "Lcom/google/android/qea;", "Lcom/google/android/pea;", "remeasurement", "", "q", "(Lcom/google/android/pea;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements qea {
        c() {
        }

        @Override // com.google.inputmethod.qea
        public void q(pea remeasurement) {
            PagerState.this.u0(remeasurement);
        }
    }

    public PagerState() {
        this(0, 0.0f, null, 7, null);
    }

    private final void A0(jz8 result) {
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            if (this.prefetchingEnabled) {
                if (result.getBeyondViewportPageCount() >= O()) {
                    return;
                }
                if (Math.abs(this.previousPassDelta) <= 0.5f) {
                    return;
                }
                if (d0(this.previousPassDelta)) {
                    if (up1.isCacheWindowForPagerEnabled) {
                        this.cacheWindowLogic.C(this.previousPassDelta, result);
                    } else {
                        g0(this.previousPassDelta, result);
                    }
                    Unit unit = Unit.a;
                }
            }
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }

    private final int W() {
        return this.programmaticScrollTargetPage.getIntValue();
    }

    private final int a0() {
        return this.settledPageState.getIntValue();
    }

    private final boolean d0(float scrollDelta) {
        if (J().getOrientation() == Orientation.Vertical) {
            if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (c0() & 4294967295L)))) {
                return true;
            }
        } else if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (c0() >> 32)))) {
            return true;
        }
        return e0();
    }

    private final void g0(float delta, wy8 info) {
        nu6.b bVar;
        nu6.b bVar2;
        nu6.b bVar3;
        if (this.prefetchingEnabled && !info.m().isEmpty()) {
            boolean z = delta > 0.0f;
            int iU = u(z, info);
            if (iU < 0 || iU >= O()) {
                return;
            }
            if (iU != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z && (bVar3 = this.currentPrefetchHandle) != null) {
                    bVar3.cancel();
                }
                this.wasPrefetchingForward = z;
                this.indexToPrefetch = iU;
                this.currentPrefetchHandle = nu6.h(this.prefetchState, iU, this.premeasureConstraints, null, 4, null);
            }
            if (z) {
                if ((((yx8) m.L0(info.m())).getOffset() + (info.getPageSize() + info.getPageSpacing())) - info.getViewportEndOffset() >= delta || (bVar2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                bVar2.d();
                return;
            }
            if (info.getViewportStartOffset() - ((yx8) m.z0(info.m())).getOffset() >= (-delta) || (bVar = this.currentPrefetchHandle) == null) {
                return;
            }
            bVar.d();
        }
    }

    private final float h0(float delta) {
        jz8 jz8Var;
        long jA = nz8.a(this);
        float f = this.accumulator + delta;
        long jF = sh7.f(f);
        this.accumulator = f - jF;
        if (Math.abs(delta) < 1.0E-4f) {
            return delta;
        }
        long j = jA + jF;
        long jQ = kotlin.ranges.g.q(j, this.minScrollOffset, this.maxScrollOffset);
        boolean z = j != jQ;
        long j2 = jQ - jA;
        float f2 = j2;
        this.previousPassDelta = f2;
        if (Math.abs(j2) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f2 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f2 < 0.0f));
        }
        int i = (int) j2;
        int i2 = -i;
        jz8 jz8VarP = this.pagerLayoutInfoState.getValue().p(i2);
        if (jz8VarP != null && (jz8Var = this.approachLayoutInfo) != null) {
            jz8 jz8VarP2 = jz8Var != null ? jz8Var.p(i2) : null;
            if (jz8VarP2 != null) {
                this.approachLayoutInfo = jz8VarP2;
            } else {
                jz8VarP = null;
            }
        }
        if (jz8VarP != null) {
            q(jz8VarP, this.hasLookaheadOccurred, true);
            gn8.d(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.a(i);
            pea peaVarX = X();
            if (peaVarX != null) {
                peaVarX.h();
            }
            this.layoutWithMeasurement++;
        }
        return (z ? Long.valueOf(j2) : Float.valueOf(delta)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i0(PagerState pagerState, qe8 qe8Var) {
        g.Companion companion = g.INSTANCE;
        g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        g gVarE = companion.e(gVarD);
        try {
            qe8Var.a(pagerState.firstVisiblePage);
            Unit unit = Unit.a;
            return Unit.a;
        } finally {
            companion.l(gVarD, gVarE, function1G);
        }
    }

    public static /* synthetic */ void k0(PagerState pagerState, int i, float f, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        pagerState.j0(i, f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8.a(r6, r7, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object l0(androidx.compose.p001foundation.pager.PagerState r5, androidx.compose.p001foundation.MutatePriority r6, kotlin.jvm.functions.Function2<? super com.google.inputmethod.p9b, ? super com.google.android.q22<? super kotlin.Unit>, ? extends java.lang.Object> r7, com.google.android.q22<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.p001foundation.pager.PagerState$scroll$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = (androidx.compose.p001foundation.pager.PagerState$scroll$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.foundation.pager.PagerState$scroll$1 r0 = new androidx.compose.foundation.pager.PagerState$scroll$1
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.p001foundation.pager.PagerState) r5
            kotlin.f.b(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.L$2
            r7 = r5
            kotlin.jvm.functions.Function2 r7 = (kotlin.jvm.functions.Function2) r7
            java.lang.Object r5 = r0.L$1
            r6 = r5
            androidx.compose.foundation.MutatePriority r6 = (androidx.compose.p001foundation.MutatePriority) r6
            java.lang.Object r5 = r0.L$0
            androidx.compose.foundation.pager.PagerState r5 = (androidx.compose.p001foundation.pager.PagerState) r5
            kotlin.f.b(r8)
            goto L5c
        L4a:
            kotlin.f.b(r8)
            r0.L$0 = r5
            r0.L$1 = r6
            r0.L$2 = r7
            r0.label = r4
            java.lang.Object r8 = r5.s(r0)
            if (r8 != r1) goto L5c
            goto L7a
        L5c:
            boolean r8 = r5.b()
            if (r8 != 0) goto L69
            int r8 = r5.A()
            r5.v0(r8)
        L69:
            com.google.android.hab r8 = r5.scrollableState
            r0.L$0 = r5
            r2 = 0
            r0.L$1 = r2
            r0.L$2 = r2
            r0.label = r3
            java.lang.Object r6 = r8.a(r6, r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r6 = -1
            r5.t0(r6)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.pager.PagerState.l0(androidx.compose.foundation.pager.PagerState, androidx.compose.foundation.MutatePriority, kotlin.jvm.functions.Function2, com.google.android.q22):java.lang.Object");
    }

    public static /* synthetic */ Object n0(PagerState pagerState, int i, float f, q22 q22Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        return pagerState.m0(i, f, q22Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float o0(PagerState pagerState, float f) {
        return pagerState.h0(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object p(PagerState pagerState, int i, float f, kr krVar, q22 q22Var, int i2, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i2 & 2) != 0) {
            f = 0.0f;
        }
        if ((i2 & 4) != 0) {
            krVar = lr.j(0.0f, 0.0f, null, 7, null);
        }
        return pagerState.o(i, f, krVar, q22Var);
    }

    private final void p0(boolean z) {
        this.canScrollBackward.setValue(Boolean.valueOf(z));
    }

    private final void q0(boolean z) {
        this.canScrollForward.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void r(PagerState pagerState, jz8 jz8Var, boolean z, boolean z2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        pagerState.q(jz8Var, z, z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(q22<? super Unit> q22Var) {
        Object objA;
        return (this.pagerLayoutInfoState.getValue() == j.m() && (objA = this.awaitLayoutModifier.A(q22Var)) == kotlin.coroutines.intrinsics.a.g()) ? objA : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(PagerState pagerState) {
        return pagerState.O();
    }

    private final void t0(int i) {
        this.programmaticScrollTargetPage.f(i);
    }

    private final int u(boolean forward, wy8 info) {
        if (!forward) {
            return (((yx8) m.z0(info.m())).getIndex() - info.getBeyondViewportPageCount()) - 1;
        }
        int iO = info.getBeyondViewportPageCount() + 1;
        if (iO < 0) {
            return Integer.MAX_VALUE;
        }
        return ((yx8) m.L0(info.m())).getIndex() + iO;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(pea peaVar) {
        this.remeasurement.setValue(peaVar);
    }

    private final void v(wy8 info) {
        if (this.indexToPrefetch == -1 || info.m().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != u(this.wasPrefetchingForward, info)) {
            this.indexToPrefetch = -1;
            nu6.b bVar = this.currentPrefetchHandle;
            if (bVar != null) {
                bVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    private final void v0(int i) {
        this.settledPageState.f(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int w(int i) {
        if (O() > 0) {
            return kotlin.ranges.g.o(i, 0, O() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x0(PagerState pagerState) {
        return pagerState.b() ? pagerState.a0() : pagerState.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z0(PagerState pagerState) {
        int iA;
        if (!pagerState.b()) {
            iA = pagerState.A();
        } else if (pagerState.W() != -1) {
            iA = pagerState.W();
        } else if (Math.abs(pagerState.B()) >= Math.abs(pagerState.U())) {
            iA = pagerState.H() ? pagerState.firstVisiblePage + 1 : pagerState.firstVisiblePage;
        } else {
            iA = pagerState.A();
        }
        return pagerState.w(iA);
    }

    public final int A() {
        return this.scrollPosition.b();
    }

    public final float B() {
        return this.scrollPosition.c();
    }

    public final void B0(p9b p9bVar, int i) {
        t0(w(i));
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    public final j26 F() {
        return this.internalInteractionSource;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final r48 getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public boolean H() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final int getLatestPageSizeWithSpacing() {
        return this.latestPageSizeWithSpacing;
    }

    public final wy8 J() {
        return this.pagerLayoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getMaxScrollOffset() {
        return this.maxScrollOffset;
    }

    public final o58<Unit> L() {
        return this.measurementScopeInvalidator;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getMinScrollOffset() {
        return this.minScrollOffset;
    }

    public final IntRange N() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public abstract int O();

    public final int P() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int Q() {
        return P() + R();
    }

    public final int R() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final mu6 getPinnedPages() {
        return this.pinnedPages;
    }

    public final o58<Unit> T() {
        return this.placementScopeInvalidator;
    }

    public final float U() {
        return Math.min(this.density.x2(j.l()), P() / 2.0f) / P();
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final nu6 getPrefetchState() {
        return this.prefetchState;
    }

    public final pea X() {
        return (pea) this.remeasurement.getValue();
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final qea getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final int Z() {
        return ((Number) this.settledPage.getValue()).intValue();
    }

    @Override // com.google.inputmethod.hab
    public Object a(MutatePriority mutatePriority, Function2<? super p9b, ? super q22<? super Unit>, ? extends Object> function2, q22<? super Unit> q22Var) {
        return l0(this, mutatePriority, function2, q22Var);
    }

    @Override // com.google.inputmethod.hab
    public boolean b() {
        return this.scrollableState.b();
    }

    public final int b0() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.hab
    public final boolean c() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long c0() {
        return ((rn8) this.upDownDifference.getValue()).getPackedValue();
    }

    @Override // com.google.inputmethod.hab
    public float d(float delta) {
        return this.scrollableState.d(delta);
    }

    public final boolean e0() {
        return ((int) Float.intBitsToFloat((int) (c0() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (c0() & 4294967295L))) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.hab
    public final boolean f() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final int f0(az8 itemProvider, int currentPage) {
        return this.scrollPosition.e(itemProvider, currentPage);
    }

    public final void j0(int page, float pageOffsetFraction) {
        if (b()) {
            rw0.d(this.pagerLayoutInfoState.getValue().getCoroutineScope(), (CoroutineContext) null, (CoroutineStart) null, new PagerState$requestScrollToPage$1(this, null), 3, (Object) null);
        }
        y0(page, pageOffsetFraction, false);
    }

    public final Object m0(int i, float f, q22<? super Unit> q22Var) {
        Object objE = hab.e(this, null, new PagerState$scrollToPage$2(this, f, i, null), q22Var, 1, null);
        return objE == kotlin.coroutines.intrinsics.a.g() ? objE : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (com.google.inputmethod.hab.e(r11, null, r3, r4, 1, null) == r0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r12, float r13, com.google.inputmethod.kr<java.lang.Float> r14, com.google.android.q22<? super kotlin.Unit> r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof androidx.compose.p001foundation.pager.PagerState$animateScrollToPage$1
            if (r0 == 0) goto L14
            r0 = r15
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = (androidx.compose.p001foundation.pager.PagerState$animateScrollToPage$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.label = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$1 r0 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$1
            r0.<init>(r11, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.result
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
            int r1 = r4.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            kotlin.f.b(r15)
            goto Lbc
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            float r13 = r4.F$0
            int r12 = r4.I$0
            java.lang.Object r14 = r4.L$0
            com.google.android.kr r14 = (com.google.inputmethod.kr) r14
            kotlin.f.b(r15)
        L42:
            r9 = r14
            goto L6e
        L44:
            kotlin.f.b(r15)
            int r15 = r11.A()
            if (r12 != r15) goto L56
            float r15 = r11.B()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L56
            goto L5c
        L56:
            int r15 = r11.O()
            if (r15 != 0) goto L5f
        L5c:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        L5f:
            r4.L$0 = r14
            r4.I$0 = r12
            r4.F$0 = r13
            r4.label = r3
            java.lang.Object r15 = r11.s(r4)
            if (r15 != r0) goto L42
            goto Lbb
        L6e:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r5 = 0
            if (r1 > 0) goto L7d
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto L7d
            goto L7e
        L7d:
            r3 = r5
        L7e:
            if (r3 != 0) goto L99
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "pageOffsetFraction "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            com.google.inputmethod.cx5.a(r14)
        L99:
            int r7 = r11.w(r12)
            int r12 = r11.Q()
            float r12 = (float) r12
            float r8 = r13 * r12
            androidx.compose.foundation.pager.PagerState$animateScrollToPage$3 r3 = new androidx.compose.foundation.pager.PagerState$animateScrollToPage$3
            r10 = 0
            r6 = r11
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            r12 = 0
            r4.L$0 = r12
            r4.label = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r11
            java.lang.Object r12 = com.google.inputmethod.hab.e(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            kotlin.Unit r12 = kotlin.Unit.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.p001foundation.pager.PagerState.o(int, float, com.google.android.kr, com.google.android.q22):java.lang.Object");
    }

    public final void q(jz8 result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        this.prefetchState.j(result.m().size());
        this.latestPageSizeWithSpacing = result.getPageSize() + result.getPageSpacing();
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.j(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.k(result);
            if (!up1.isCacheWindowForPagerEnabled) {
                v(result);
            } else if (this.prefetchingEnabled) {
                this.cacheWindowLogic.D(result);
            }
        }
        this.pagerLayoutInfoState.setValue(result);
        q0(result.getCanScrollForward());
        p0(result.q());
        jj7 jj7VarZ = result.getFirstVisiblePage();
        if (jj7VarZ != null) {
            this.firstVisiblePage = jj7VarZ.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        A0(result);
        this.maxScrollOffset = j.j(result, O());
        this.minScrollOffset = kotlin.ranges.g.k(j.k(result, O()), this.maxScrollOffset);
    }

    public final void r0(f43 f43Var) {
        this.density = f43Var;
    }

    public final void s0(long j) {
        this.premeasureConstraints = j;
    }

    public final void w0(long j) {
        this.upDownDifference.setValue(rn8.d(j));
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final bc0 getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final us6 getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    public final void y0(int page, float offsetFraction, boolean forceRemeasure) {
        if (this.scrollPosition.b() != page || this.scrollPosition.c() != offsetFraction) {
            this.cacheWindowLogic.x();
        }
        this.scrollPosition.f(page, offsetFraction);
        if (!forceRemeasure) {
            gn8.d(this.measurementScopeInvalidator);
            return;
        }
        pea peaVarX = X();
        if (peaVarX != null) {
            peaVarX.h();
        }
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final ky8 getCacheWindowLogic() {
        return this.cacheWindowLogic;
    }

    public PagerState(int i, float f, fl9 fl9Var) {
        double d = f;
        boolean z = false;
        if (-0.5d <= d && d <= 0.5d) {
            z = true;
        }
        if (!z) {
            cx5.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference = s0.e(rn8.d(rn8.INSTANCE.c()), null, 2, null);
        mz8 mz8Var = new mz8(i, f, this);
        this.scrollPosition = mz8Var;
        this.firstVisiblePage = i;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = u.b(new Function1() { // from class: com.google.android.sz8
            public final Object invoke(Object obj) {
                return Float.valueOf(PagerState.o0(this.a, ((Float) obj).floatValue()));
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = p0.i(j.m(), p0.k());
        this.density = j.b;
        this.internalInteractionSource = k26.a();
        this.programmaticScrollTargetPage = mwb.a(-1);
        this.settledPageState = mwb.a(i);
        this.settledPage = p0.d(p0.t(), new Function0() { // from class: com.google.android.tz8
            public final Object invoke() {
                return Integer.valueOf(PagerState.x0(this.a));
            }
        });
        this.targetPage = p0.d(p0.t(), new Function0() { // from class: com.google.android.uz8
            public final Object invoke() {
                return Integer.valueOf(PagerState.z0(this.a));
            }
        });
        nu6 nu6Var = new nu6(fl9Var, new Function1() { // from class: com.google.android.vz8
            public final Object invoke(Object obj) {
                return PagerState.i0(this.a, (qe8) obj);
            }
        });
        this.prefetchState = nu6Var;
        b bVar = new b();
        this.pagerCacheWindow = bVar;
        this._scrollIndicatorState = new a();
        this.cacheWindowLogic = new ky8(bVar, nu6Var, new Function0() { // from class: com.google.android.wz8
            public final Object invoke() {
                return Integer.valueOf(PagerState.t(this.a));
            }
        });
        this.beyondBoundsInfo = new us6();
        this.awaitLayoutModifier = new bc0();
        this.remeasurement = s0.e(null, null, 2, null);
        this.remeasurementModifier = new c();
        this.premeasureConstraints = nx1.b(0, 0, 0, 0, 15, null);
        this.pinnedPages = new mu6();
        mz8Var.getNearestRangeState();
        this.placementScopeInvalidator = gn8.c(null, 1, null);
        this.measurementScopeInvalidator = gn8.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = s0.e(bool, null, 2, null);
        this.canScrollBackward = s0.e(bool, null, 2, null);
        this.isLastScrollForwardState = s0.e(bool, null, 2, null);
        this.isLastScrollBackwardState = s0.e(bool, null, 2, null);
    }

    public /* synthetic */ PagerState(int i, float f, fl9 fl9Var, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? 0.0f : f, (i2 & 4) != 0 ? null : fl9Var);
    }

    public PagerState(int i, float f) {
        this(i, f, null);
    }
}
