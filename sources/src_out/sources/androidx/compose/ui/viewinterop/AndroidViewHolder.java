package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.node.m;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.android.e0b;
import com.google.android.ibe;
import com.google.android.lq2;
import com.google.android.q22;
import com.google.android.r43;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.afb;
import com.google.inputmethod.aq1;
import com.google.inputmethod.bf8;
import com.google.inputmethod.cf8;
import com.google.inputmethod.dj7;
import com.google.inputmethod.ej7;
import com.google.inputmethod.ew8;
import com.google.inputmethod.f43;
import com.google.inputmethod.f66;
import com.google.inputmethod.fbe;
import com.google.inputmethod.fj7;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.h16;
import com.google.inputmethod.h66;
import com.google.inputmethod.jba;
import com.google.inputmethod.k43;
import com.google.inputmethod.k7e;
import com.google.inputmethod.kie;
import com.google.inputmethod.kn6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.ln6;
import com.google.inputmethod.mq1;
import com.google.inputmethod.n17;
import com.google.inputmethod.nfb;
import com.google.inputmethod.q16;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t04;
import com.google.inputmethod.te8;
import com.google.inputmethod.u3e;
import com.google.inputmethod.ue8;
import com.google.inputmethod.uy5;
import com.google.inputmethod.vp8;
import com.google.inputmethod.w41;
import com.google.inputmethod.whe;
import com.google.inputmethod.xi;
import com.google.inputmethod.xq8;
import com.google.inputmethod.zw5;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineStart;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 è\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001)B9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u0010\u001cJ\u000f\u00103\u001a\u00020\u001aH\u0014¢\u0006\u0004\b3\u0010\u001cJ%\u00109\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001a¢\u0006\u0004\bC\u0010\u001cJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020$H\u0016¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010RJ/\u0010S\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJG\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\u0006\u0010[\u001a\u000204H\u0016¢\u0006\u0004\b\\\u0010]J?\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\b\\\u0010^J7\u0010a\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020\n2\u0006\u0010`\u001a\u00020\n2\u0006\u0010[\u001a\u0002042\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\ba\u0010bJ/\u0010f\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020c2\u0006\u0010[\u001a\u00020$H\u0016¢\u0006\u0004\bf\u0010gJ'\u0010h\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020c2\u0006\u0010e\u001a\u00020cH\u0016¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020$H\u0016¢\u0006\u0004\bj\u0010LJ\u001f\u0010n\u001a\u00020l2\u0006\u0010k\u001a\u00020\u000e2\u0006\u0010m\u001a\u00020lH\u0016¢\u0006\u0004\bn\u0010oJ'\u0010s\u001a\u00020\n2\u0006\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\nH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020l2\u0006\u0010m\u001a\u00020lH\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010k\u001a\u00020w2\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\bk\u0010yJ4\u0010\u007f\u001a\u00020z*\u00020z2\u0006\u0010{\u001a\u00020\n2\u0006\u0010|\u001a\u00020\n2\u0006\u0010}\u001a\u00020\n2\u0006\u0010~\u001a\u00020\nH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bn\u0010\u0081\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0082\u0001R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010\u0016R\u0015\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001d\u0010\u0085\u0001R@\u0010\u008e\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00012\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0019\u0010\u0091\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R@\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00012\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0089\u0001\u001a\u0006\b\u0093\u0001\u0010\u008b\u0001\"\u0006\b\u0094\u0001\u0010\u008d\u0001R@\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00012\u000e\u0010\u0087\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0096\u0001\u0010\u0089\u0001\u001a\u0006\b\u0097\u0001\u0010\u008b\u0001\"\u0006\b\u0098\u0001\u0010\u008d\u0001R4\u0010¡\u0001\u001a\u00030\u009a\u00012\b\u0010\u0087\u0001\u001a\u00030\u009a\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u009b\u0001\u0010\u009c\u0001\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R9\u0010©\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u009a\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R4\u0010±\u0001\u001a\u00030ª\u00012\b\u0010\u0087\u0001\u001a\u00030ª\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u00ad\u0001\u0010®\u0001\"\u0006\b¯\u0001\u0010°\u0001R8\u0010´\u0001\u001a\u0012\u0012\u0005\u0012\u00030ª\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b&\u0010¤\u0001\u001a\u0006\b²\u0001\u0010¦\u0001\"\u0006\b³\u0001\u0010¨\u0001R8\u0010¼\u0001\u001a\u0005\u0018\u00010µ\u00012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010µ\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001\"\u0006\bº\u0001\u0010»\u0001R8\u0010Ä\u0001\u001a\u0005\u0018\u00010½\u00012\n\u0010\u0087\u0001\u001a\u0005\u0018\u00010½\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R\u0017\u0010Ç\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u0019\u0010Ê\u0001\u001a\u00030È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010É\u0001R\u001a\u0010m\u001a\u0004\u0018\u00010l8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R1\u0010Ï\u0001\u001a\u001b\u0012\u0007\u0012\u0005\u0018\u00010Í\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010¢\u0001j\u0005\u0018\u0001`Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010¤\u0001R\u001e\u0010Ñ\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÐ\u0001\u0010\u0089\u0001R\u001d\u0010Ò\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b'\u0010\u0089\u0001R7\u0010Õ\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u007f\u0010¤\u0001\u001a\u0006\bÓ\u0001\u0010¦\u0001\"\u0006\bÔ\u0001\u0010¨\u0001R\u0015\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010Æ\u0001R\u0018\u0010Ö\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010\u0081\u0001R\u0018\u0010×\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bC\u0010\u0081\u0001R\u0018\u0010Û\u0001\u001a\u00030Ø\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÙ\u0001\u0010Ú\u0001R\u0018\u0010Ü\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010\u0090\u0001R\u001c\u0010á\u0001\u001a\u00030Ý\u00018\u0006¢\u0006\u000f\n\u0005\b#\u0010Þ\u0001\u001a\u0006\bß\u0001\u0010à\u0001R\u0016\u0010ã\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bâ\u0001\u0010LR\u0018\u0010ç\u0001\u001a\u00030ä\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bå\u0001\u0010æ\u0001¨\u0006é\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Lcom/google/android/bf8;", "Lcom/google/android/aq1;", "Lcom/google/android/ew8;", "Lcom/google/android/vp8;", "Landroid/content/Context;", "context", "Landroidx/compose/runtime/f;", "parentContext", "", "compositeKeyHash", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/m;", "owner", "<init>", "(Landroid/content/Context;Landroidx/compose/runtime/f;ILandroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;Landroid/view/View;Landroidx/compose/ui/node/m;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "p", "()V", "d", "c", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "A", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "rectangle", "immediate", "requestChildRectangleOnScreen", "(Landroid/view/View;Landroid/graphics/Rect;Z)Z", "x", "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "onStartNestedScroll", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "onNestedScrollAccepted", "(Landroid/view/View;Landroid/view/View;II)V", "onStopNestedScroll", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "onNestedScroll", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "dx", "dy", "onNestedPreScroll", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Lcom/google/android/kie;", "insets", "a", "(Landroid/view/View;Lcom/google/android/kie;)Lcom/google/android/kie;", "min", "max", "preferred", "z", "(III)I", "w", "(Lcom/google/android/kie;)Lcom/google/android/kie;", "Lcom/google/android/whe$a;", "bounds", "(Lcom/google/android/whe$a;)Lcom/google/android/whe$a;", "Lcom/google/android/uy5;", "left", "top", "right", "bottom", "u", "(Lcom/google/android/uy5;IIII)Lcom/google/android/uy5;", "I", "Landroidx/compose/ui/input/nestedscroll/NestedScrollDispatcher;", "Landroid/view/View;", "getView", "Landroidx/compose/ui/node/m;", "Lkotlin/Function0;", "value", "e", "Lkotlin/jvm/functions/Function0;", "getUpdate", "()Lkotlin/jvm/functions/Function0;", "setUpdate", "(Lkotlin/jvm/functions/Function0;)V", "update", "f", "Z", "hasUpdateBlock", "g", "getReset", "setReset", "reset", "h", "getRelease", "setRelease", "release", "Landroidx/compose/ui/b;", "i", "Landroidx/compose/ui/b;", "getModifier", "()Landroidx/compose/ui/b;", "setModifier", "(Landroidx/compose/ui/b;)V", "modifier", "Lkotlin/Function1;", "j", "Lkotlin/jvm/functions/Function1;", "getOnModifierChanged$ui", "()Lkotlin/jvm/functions/Function1;", "setOnModifierChanged$ui", "(Lkotlin/jvm/functions/Function1;)V", "onModifierChanged", "Lcom/google/android/f43;", "k", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "setDensity", "(Lcom/google/android/f43;)V", "density", "getOnDensityChanged$ui", "setOnDensityChanged$ui", "onDensityChanged", "Lcom/google/android/n17;", "m", "Lcom/google/android/n17;", "getLifecycleOwner", "()Lcom/google/android/n17;", "setLifecycleOwner", "(Lcom/google/android/n17;)V", "lifecycleOwner", "Lcom/google/android/e0b;", "n", "Lcom/google/android/e0b;", "getSavedStateRegistryOwner", "()Lcom/google/android/e0b;", "setSavedStateRegistryOwner", "(Lcom/google/android/e0b;)V", "savedStateRegistryOwner", "o", "[I", "position", "Lcom/google/android/q16;", "J", "size", "q", "Lcom/google/android/kie;", "Lcom/google/android/gba;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "bringIntoViewRequester", "s", "runUpdate", "runInvalidate", "getOnRequestDisallowInterceptTouchEvent$ui", "setOnRequestDisallowInterceptTouchEvent$ui", "onRequestDisallowInterceptTouchEvent", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Lcom/google/android/cf8;", "y", "Lcom/google/android/cf8;", "nestedScrollingParentHelper", "isDrawing", "Landroidx/compose/ui/node/LayoutNode;", "Landroidx/compose/ui/node/LayoutNode;", "getLayoutNode", "()Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "z0", "isValidOwnerScope", "Landroidx/compose/ui/node/OwnerSnapshotObserver;", "getSnapshotObserver", "()Landroidx/compose/ui/node/OwnerSnapshotObserver;", "snapshotObserver", "B", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements bf8, aq1, ew8, vp8 {
    public static final int C = 8;
    private static final Function1<AndroidViewHolder, Unit> D = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.i;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final LayoutNode layoutNode;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final int compositeKeyHash;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final NestedScrollDispatcher dispatcher;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final m owner;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private Function0<Unit> update;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean hasUpdateBlock;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function0<Unit> reset;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Function0<Unit> release;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private androidx.compose.ui.b modifier;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private Function1<? super androidx.compose.ui.b, Unit> onModifierChanged;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private Function1<? super f43, Unit> onDensityChanged;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private n17 lifecycleOwner;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private e0b savedStateRegistryOwner;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final int[] position;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private kie insets;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private Function1<? super gba, Unit> bringIntoViewRequester;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final Function0<Unit> runUpdate;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final Function0<Unit> runInvalidate;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Function1<? super Boolean, Unit> onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final int[] location;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private int lastWidthMeasureSpec;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final cf8 nestedScrollingParentHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private boolean isDrawing;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/ui/viewinterop/AndroidViewHolder$a", "Lcom/google/android/whe$b;", "Lcom/google/android/whe;", "animation", "Lcom/google/android/whe$a;", "bounds", "f", "(Lcom/google/android/whe;Lcom/google/android/whe$a;)Lcom/google/android/whe$a;", "Lcom/google/android/kie;", "insets", "", "runningAnimations", "e", "(Lcom/google/android/kie;Ljava/util/List;)Lcom/google/android/kie;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends whe.b {
        a() {
            super(1);
        }

        @Override // com.google.android.whe.b
        public kie e(kie insets, List<whe> runningAnimations) {
            return AndroidViewHolder.this.w(insets);
        }

        @Override // com.google.android.whe.b
        public whe.a f(whe animation, whe.a bounds) {
            return AndroidViewHolder.this.v(bounds);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedFling$1", f = "AndroidViewHolder.android.kt", l = {634, 636}, m = "invokeSuspend", v = 1)
    static final class AnonymousClass1 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ boolean $consumed;
        final /* synthetic */ long $viewVelocity;
        int label;
        final /* synthetic */ AndroidViewHolder this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z, AndroidViewHolder androidViewHolder, long j, q22<? super AnonymousClass1> q22Var) {
            super(2, q22Var);
            this.$consumed = z;
            this.this$0 = androidViewHolder;
            this.$viewVelocity = j;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return new AnonymousClass1(this.$consumed, this.this$0, this.$viewVelocity, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r11 == r0) goto L18;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.a.g()
                int r1 = r10.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.f.b(r11)
                goto L5e
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                kotlin.f.b(r11)
                r6 = r10
                goto L3f
            L1f:
                kotlin.f.b(r11)
                boolean r11 = r10.$consumed
                if (r11 != 0) goto L45
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.e(r11)
                com.google.android.t3e$a r11 = com.google.inputmethod.t3e.INSTANCE
                long r5 = r11.a()
                long r7 = r10.$viewVelocity
                r10.label = r3
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L3f
                goto L5d
            L3f:
                com.google.android.t3e r11 = (com.google.inputmethod.t3e) r11
                r11.getPackedValue()
                goto L63
            L45:
                r6 = r10
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r6.this$0
                androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher r1 = androidx.compose.ui.viewinterop.AndroidViewHolder.e(r11)
                r11 = r2
                long r2 = r6.$viewVelocity
                com.google.android.t3e$a r4 = com.google.inputmethod.t3e.INSTANCE
                long r4 = r4.a()
                r6.label = r11
                java.lang.Object r11 = r1.a(r2, r4, r6)
                if (r11 != r0) goto L5e
            L5d:
                return r0
            L5e:
                com.google.android.t3e r11 = (com.google.inputmethod.t3e) r11
                r11.getPackedValue()
            L63:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/google/android/ta2;", "", "<anonymous>", "(Lcom/google/android/ta2;)V"}, k = 3, mv = {2, 1, 0})
    @lq2(c = "androidx.compose.ui.viewinterop.AndroidViewHolder$onNestedPreFling$1", f = "AndroidViewHolder.android.kt", l = {645}, m = "invokeSuspend", v = 1)
    static final class C02201 extends SuspendLambda implements Function2<ta2, q22<? super Unit>, Object> {
        final /* synthetic */ long $toBeConsumed;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C02201(long j, q22<? super C02201> q22Var) {
            super(2, q22Var);
            this.$toBeConsumed = j;
        }

        public final q22<Unit> create(Object obj, q22<?> q22Var) {
            return AndroidViewHolder.this.new C02201(this.$toBeConsumed, q22Var);
        }

        public final Object invoke(ta2 ta2Var, q22<? super Unit> q22Var) {
            return create(ta2Var, q22Var).invokeSuspend(Unit.a);
        }

        public final Object invokeSuspend(Object obj) {
            Object objG = kotlin.coroutines.intrinsics.a.g();
            int i = this.label;
            if (i == 0) {
                kotlin.f.b(obj);
                NestedScrollDispatcher nestedScrollDispatcher = AndroidViewHolder.this.dispatcher;
                long j = this.$toBeConsumed;
                this.label = 1;
                if (nestedScrollDispatcher.c(j, this) == objG) {
                    return objG;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.f.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    public AndroidViewHolder(Context context, androidx.compose.p004runtime.f fVar, int i, NestedScrollDispatcher nestedScrollDispatcher, View view, m mVar) throws KotlinNothingValueException {
        super(context);
        this.compositeKeyHash = i;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = mVar;
        if (fVar != null) {
            WindowRecomposer_androidKt.k(this, fVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        k7e.G0(this, new a());
        k7e.z0(this, this);
        this.update = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$update$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m68invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m68invoke();
                return Unit.a;
            }
        };
        this.reset = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$reset$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m65invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m65invoke();
                return Unit.a;
            }
        };
        this.release = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$release$1
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m64invoke() {
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m64invoke();
                return Unit.a;
            }
        };
        androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
        this.modifier = companion;
        this.density = k43.b(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = q16.INSTANCE.a();
        this.runUpdate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runUpdate$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m67invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m67invoke() {
                if (this.this$0.hasUpdateBlock && this.this$0.isAttachedToWindow()) {
                    ViewParent parent = this.this$0.getView().getParent();
                    AndroidViewHolder androidViewHolder = this.this$0;
                    if (parent == androidViewHolder) {
                        OwnerSnapshotObserver snapshotObserver = androidViewHolder.getSnapshotObserver();
                        snapshotObserver.observer.k(this.this$0, AndroidViewHolder.D, this.this$0.getUpdate());
                    }
                }
            }
        };
        this.runInvalidate = new Function0<Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$runInvalidate$1
            {
                super(0);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke() throws KotlinNothingValueException {
                m66invoke();
                return Unit.a;
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m66invoke() throws KotlinNothingValueException {
                this.this$0.getLayoutNode().R0();
            }
        };
        this.location = new int[2];
        this.lastWidthMeasureSpec = t04.INVALID_ID;
        this.lastHeightMeasureSpec = t04.INVALID_ID;
        this.nestedScrollingParentHelper = new cf8(this);
        Object[] objArr = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, objArr, 3, null);
        layoutNode.U1(this);
        final androidx.compose.ui.b bVarThen = xq8.a(androidx.compose.ui.draw.c.b(PointerInteropFilter_androidKt.b(afb.c(ue8.a(companion, b.a, nestedScrollDispatcher), true, new Function1<nfb, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$1
            public final void a(nfb nfbVar) {
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((nfb) obj);
                return Unit.a;
            }
        }), this), new Function1<DrawScope, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(DrawScope drawScope) {
                AndroidViewHolder androidViewHolder = this.$this_run;
                LayoutNode layoutNode2 = layoutNode;
                AndroidViewHolder androidViewHolder2 = this;
                w41 w41VarB = drawScope.getDrawContext().b();
                if (androidViewHolder.getView().getVisibility() != 8) {
                    androidViewHolder.isDrawing = true;
                    m owner = layoutNode2.getOwner();
                    AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                    if (androidComposeView != null) {
                        androidComposeView.D0(androidViewHolder2, xi.d(w41VarB));
                    }
                    androidViewHolder.isDrawing = false;
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((DrawScope) obj);
                return Unit.a;
            }
        }), new Function1<kn6, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(kn6 kn6Var) {
                WindowInsets windowInsetsE;
                b.f(this.$this_run, layoutNode);
                this.$this_run.owner.j(this.$this_run);
                int i2 = this.$this_run.position[0];
                int i3 = this.$this_run.position[1];
                this.$this_run.getView().getLocationOnScreen(this.$this_run.position);
                long j = this.$this_run.size;
                this.$this_run.size = kn6Var.a();
                kie kieVar = this.$this_run.insets;
                if (kieVar != null) {
                    if ((i2 == this.$this_run.position[0] && i3 == this.$this_run.position[1] && q16.f(j, this.$this_run.size)) || (windowInsetsE = this.$this_run.w(kieVar).E()) == null) {
                        return;
                    }
                    this.$this_run.getView().dispatchApplyWindowInsets(windowInsetsE);
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((kn6) obj);
                return Unit.a;
            }
        }).then(new c(new Function1<Function1<? super gba, ? extends Unit>, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$coreModifier$4
            {
                super(1);
            }

            public final void a(Function1<? super gba, Unit> function1) {
                this.$this_run.bringIntoViewRequester = function1;
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((Function1) obj);
                return Unit.a;
            }
        }));
        layoutNode.f(i);
        layoutNode.j(this.modifier.then(bVarThen));
        this.onModifierChanged = new Function1<androidx.compose.ui.b, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final void a(androidx.compose.ui.b bVar) throws KotlinNothingValueException {
                layoutNode.j(bVar.then(bVarThen));
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws KotlinNothingValueException {
                a((androidx.compose.ui.b) obj);
                return Unit.a;
            }
        };
        layoutNode.e(this.density);
        this.onDensityChanged = new Function1<f43, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$2
            {
                super(1);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public final void a(f43 f43Var) throws KotlinNothingValueException {
                layoutNode.e(f43Var);
            }

            /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
            public /* bridge */ /* synthetic */ Object invoke(Object obj) throws KotlinNothingValueException {
                a((f43) obj);
                return Unit.a;
            }
        };
        layoutNode.Y1(new Function1<m, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(m mVar2) {
                AndroidComposeView androidComposeView = mVar2 instanceof AndroidComposeView ? (AndroidComposeView) mVar2 : null;
                if (androidComposeView != null) {
                    androidComposeView.t0(this.$this_run, layoutNode);
                }
                ViewParent parent = this.$this_run.getView().getParent();
                AndroidViewHolder androidViewHolder = this.$this_run;
                if (parent != androidViewHolder) {
                    androidViewHolder.addView(androidViewHolder.getView());
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((m) obj);
                return Unit.a;
            }
        });
        layoutNode.Z1(new Function1<m, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$4
            {
                super(1);
            }

            public final void a(m mVar2) {
                if (mq1.isViewFocusFixEnabled && this.$this_run.hasFocus()) {
                    mVar2.getFocusOwner().C(true);
                }
                AndroidComposeView androidComposeView = mVar2 instanceof AndroidComposeView ? (AndroidComposeView) mVar2 : null;
                if (androidComposeView != null) {
                    androidComposeView.h1(this.$this_run);
                }
                this.$this_run.removeAllViewsInLayout();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((m) obj);
                return Unit.a;
            }
        });
        layoutNode.m(new ej7() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int a(int width) {
                AndroidViewHolder androidViewHolder = this.a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                Intrinsics.g(layoutParams);
                androidViewHolder.measure(androidViewHolder.z(0, width, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
                return this.a.getMeasuredHeight();
            }

            private final int b(int height) {
                AndroidViewHolder androidViewHolder = this.a;
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = this.a;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                Intrinsics.g(layoutParams);
                androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.z(0, height, layoutParams.height));
                return this.a.getMeasuredWidth();
            }

            @Override // com.google.inputmethod.ej7
            public int maxIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i2) {
                return a(i2);
            }

            @Override // com.google.inputmethod.ej7
            public int maxIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i2) {
                return b(i2);
            }

            @Override // com.google.inputmethod.ej7
            /* JADX INFO: renamed from: measure-3p2s80s */
            public fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) {
                if (this.a.getChildCount() == 0) {
                    return j.Q1(jVar, kx1.n(j), kx1.m(j), null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$1
                        public final void invoke(o.a aVar) {
                        }

                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            invoke((o.a) obj);
                            return Unit.a;
                        }
                    }, 4, null);
                }
                if (kx1.n(j) != 0) {
                    this.a.getChildAt(0).setMinimumWidth(kx1.n(j));
                }
                if (kx1.m(j) != 0) {
                    this.a.getChildAt(0).setMinimumHeight(kx1.m(j));
                }
                AndroidViewHolder androidViewHolder = this.a;
                int iN = kx1.n(j);
                int iL = kx1.l(j);
                ViewGroup.LayoutParams layoutParams = this.a.getLayoutParams();
                Intrinsics.g(layoutParams);
                int iZ = androidViewHolder.z(iN, iL, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = this.a;
                int iM = kx1.m(j);
                int iK = kx1.k(j);
                ViewGroup.LayoutParams layoutParams2 = this.a.getLayoutParams();
                Intrinsics.g(layoutParams2);
                androidViewHolder.measure(iZ, androidViewHolder2.z(iM, iK, layoutParams2.height));
                int measuredWidth = this.a.getMeasuredWidth();
                int measuredHeight = this.a.getMeasuredHeight();
                final AndroidViewHolder androidViewHolder3 = this.a;
                final LayoutNode layoutNode2 = layoutNode;
                return j.Q1(jVar, measuredWidth, measuredHeight, null, new Function1<o.a, Unit>() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5$measure$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        invoke((o.a) obj);
                        return Unit.a;
                    }

                    public final void invoke(o.a aVar) {
                        b.f(androidViewHolder3, layoutNode2);
                    }
                }, 4, null);
            }

            @Override // com.google.inputmethod.ej7
            public int minIntrinsicHeight(h66 h66Var, List<? extends f66> list, int i2) {
                return a(i2);
            }

            @Override // com.google.inputmethod.ej7
            public int minIntrinsicWidth(h66 h66Var, List<? extends f66> list, int i2) {
                return b(i2);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            zw5.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    private final uy5 u(uy5 uy5Var, int i, int i2, int i3, int i4) {
        int i5 = uy5Var.a - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = uy5Var.b - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = uy5Var.c - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = uy5Var.d - i4;
        return uy5.d(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final whe.a v(whe.a bounds) {
        NodeCoordinator nodeCoordinatorB0 = this.layoutNode.b0();
        if (nodeCoordinatorB0.b()) {
            long jD = h16.d(ln6.h(nodeCoordinatorB0));
            int iK = g16.k(jD);
            if (iK < 0) {
                iK = 0;
            }
            int iL = g16.l(jD);
            int i = iL < 0 ? 0 : iL;
            long jA = ln6.f(nodeCoordinatorB0).a();
            int i2 = (int) (jA >> 32);
            int i3 = (int) (jA & 4294967295L);
            long jA2 = nodeCoordinatorB0.a();
            long jD2 = h16.d(nodeCoordinatorB0.N(rn8.e((4294967295L & ((long) Float.floatToRawIntBits((int) (jA2 & 4294967295L)))) | (((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32))));
            int iK2 = i2 - g16.k(jD2);
            if (iK2 < 0) {
                iK2 = 0;
            }
            int iL2 = i3 - g16.l(jD2);
            int i4 = iL2 >= 0 ? iL2 : 0;
            if (iK != 0 || i != 0 || iK2 != 0 || i4 != 0) {
                int i5 = iK;
                int i6 = iK2;
                return new whe.a(u(bounds.a(), i5, i, i6, i4), u(bounds.b(), i5, i, i6, i4));
            }
        }
        return bounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kie w(kie insets) {
        if (insets.o()) {
            NodeCoordinator nodeCoordinatorB0 = this.layoutNode.b0();
            if (nodeCoordinatorB0.b()) {
                long jD = h16.d(ln6.h(nodeCoordinatorB0));
                int iK = g16.k(jD);
                if (iK < 0) {
                    iK = 0;
                }
                int iL = g16.l(jD);
                if (iL < 0) {
                    iL = 0;
                }
                long jA = ln6.f(nodeCoordinatorB0).a();
                int i = (int) (jA >> 32);
                int i2 = (int) (jA & 4294967295L);
                long jA2 = nodeCoordinatorB0.a();
                long jD2 = h16.d(nodeCoordinatorB0.N(rn8.e((((long) Float.floatToRawIntBits((int) (jA2 & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (jA2 >> 32))) << 32))));
                int iK2 = i - g16.k(jD2);
                if (iK2 < 0) {
                    iK2 = 0;
                }
                int iL2 = i2 - g16.l(jD2);
                int i3 = iL2 < 0 ? 0 : iL2;
                if (iK != 0 || iL != 0 || iK2 != 0 || i3 != 0) {
                    return insets.q(iK, iL, iK2, i3);
                }
            }
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int z(int min, int max, int preferred) {
        if (preferred >= 0 || min == max) {
            return View.MeasureSpec.makeMeasureSpec(kotlin.ranges.g.o(preferred, min, max), 1073741824);
        }
        if (preferred != -2 || max == Integer.MAX_VALUE) {
            return (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(max, t04.INVALID_ID);
    }

    public final void A() {
        int i;
        int i2 = this.lastWidthMeasureSpec;
        if (i2 == Integer.MIN_VALUE || (i = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // com.google.inputmethod.vp8
    public kie a(View v, kie insets) {
        this.insets = new kie(insets);
        return w(insets);
    }

    @Override // com.google.inputmethod.aq1
    public void c() {
        this.release.invoke();
    }

    @Override // com.google.inputmethod.aq1
    public void d() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i = iArr[0];
        region.op(i, iArr[1], i + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final f43 getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final n17 getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final androidx.compose.ui.b getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    public final Function1<f43, Unit> getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final Function1<androidx.compose.ui.b, Unit> getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final Function1<Boolean, Unit> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0<Unit> getRelease() {
        return this.release;
    }

    public final Function0<Unit> getReset() {
        return this.reset;
    }

    public final e0b getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0<Unit> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // android.view.ViewGroup, android.view.ViewParent
    @r43
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) throws KotlinNothingValueException {
        super.invalidateChildInParent(location, dirty);
        x();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) throws KotlinNothingValueException {
        super.onDescendantInvalidated(child, target);
        x();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().i(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l, int t, int r, int b) {
        this.view.layout(0, 0, r - l, b - t);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        rw0.d(this.dispatcher.e(), (CoroutineContext) null, (CoroutineStart) null, new AnonymousClass1(consumed, this, u3e.a(b.h(velocityX), b.h(velocityY)), null), 3, (Object) null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        rw0.d(this.dispatcher.e(), (CoroutineContext) null, (CoroutineStart) null, new C02201(u3e.a(b.h(velocityX), b.h(velocityY)), null), 3, (Object) null);
        return false;
    }

    @Override // com.google.inputmethod.af8
    public void onNestedPreScroll(View target, int dx, int dy, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float fG = b.g(dx);
            long jD = nestedScrollDispatcher.d(rn8.e((((long) Float.floatToRawIntBits(b.g(dy))) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32)), b.i(type));
            consumed[0] = te8.a(Float.intBitsToFloat((int) (jD >> 32)));
            consumed[1] = te8.a(Float.intBitsToFloat((int) (jD & 4294967295L)));
        }
    }

    @Override // com.google.inputmethod.bf8
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float fG = b.g(dxConsumed);
            long jE = rn8.e((((long) Float.floatToRawIntBits(b.g(dyConsumed))) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = b.g(dxUnconsumed);
            long jB = nestedScrollDispatcher.b(jE, rn8.e((((long) Float.floatToRawIntBits(b.g(dyUnconsumed))) & 4294967295L) | (Float.floatToRawIntBits(fG2) << 32)), b.i(type));
            consumed[0] = te8.a(Float.intBitsToFloat((int) (jB >> 32)));
            consumed[1] = te8.a(Float.intBitsToFloat((int) (jB & 4294967295L)));
        }
    }

    @Override // com.google.inputmethod.af8
    public void onNestedScrollAccepted(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.c(child, target, axes, type);
    }

    @Override // com.google.inputmethod.af8
    public boolean onStartNestedScroll(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // com.google.inputmethod.af8
    public void onStopNestedScroll(View target, int type) {
        this.nestedScrollingParentHelper.e(target, type);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // com.google.inputmethod.aq1
    public void p() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        Function1<? super gba, Unit> function1 = this.bringIntoViewRequester;
        if (function1 == null) {
            return true;
        }
        function1.invoke(rectangle != null ? jba.e(rectangle) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        Function1<? super Boolean, Unit> function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(f43 f43Var) {
        if (f43Var != this.density) {
            this.density = f43Var;
            Function1<? super f43, Unit> function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(f43Var);
            }
        }
    }

    public final void setLifecycleOwner(n17 n17Var) {
        if (n17Var != this.lifecycleOwner) {
            this.lifecycleOwner = n17Var;
            fbe.b(this, n17Var);
        }
    }

    public final void setModifier(androidx.compose.ui.b bVar) {
        if (bVar != this.modifier) {
            this.modifier = bVar;
            Function1<? super androidx.compose.ui.b, Unit> function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(bVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(Function1<? super f43, Unit> function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui(Function1<? super androidx.compose.ui.b, Unit> function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(Function1<? super Boolean, Unit> function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    protected final void setRelease(Function0<Unit> function0) {
        this.release = function0;
    }

    protected final void setReset(Function0<Unit> function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(e0b e0bVar) {
        if (e0bVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = e0bVar;
            ibe.b(this, e0bVar);
        }
    }

    protected final void setUpdate(Function0<Unit> function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void x() throws KotlinNothingValueException {
        if (!this.isDrawing) {
            this.layoutNode.R0();
            return;
        }
        View view = this.view;
        final Function0<Unit> function0 = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: com.google.android.qp
            @Override // java.lang.Runnable
            public final void run() {
                AndroidViewHolder.y(function0);
            }
        });
    }

    @Override // com.google.inputmethod.ew8
    public boolean z0() {
        return isAttachedToWindow();
    }

    @Override // com.google.inputmethod.af8
    public void onNestedScroll(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            NestedScrollDispatcher nestedScrollDispatcher = this.dispatcher;
            float fG = b.g(dxConsumed);
            long jE = rn8.e((((long) Float.floatToRawIntBits(b.g(dyConsumed))) & 4294967295L) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = b.g(dxUnconsumed);
            nestedScrollDispatcher.b(jE, rn8.e((((long) Float.floatToRawIntBits(b.g(dyUnconsumed))) & 4294967295L) | (Float.floatToRawIntBits(fG2) << 32)), b.i(type));
        }
    }
}
