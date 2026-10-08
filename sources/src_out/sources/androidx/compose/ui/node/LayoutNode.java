package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.layout.LayoutNodeSubcompositionsState;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.spatial.RectManager;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import com.google.inputmethod.af6;
import com.google.inputmethod.afb;
import com.google.inputmethod.aq1;
import com.google.inputmethod.bf9;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dw8;
import com.google.inputmethod.dz4;
import com.google.inputmethod.ej7;
import com.google.inputmethod.ew8;
import com.google.inputmethod.f43;
import com.google.inputmethod.f66;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fn6;
import com.google.inputmethod.fo6;
import com.google.inputmethod.g16;
import com.google.inputmethod.gs1;
import com.google.inputmethod.h66;
import com.google.inputmethod.hd5;
import com.google.inputmethod.i66;
import com.google.inputmethod.jf3;
import com.google.inputmethod.k33;
import com.google.inputmethod.ki8;
import com.google.inputmethod.kn6;
import com.google.inputmethod.kx1;
import com.google.inputmethod.ni8;
import com.google.inputmethod.oi8;
import com.google.inputmethod.p7e;
import com.google.inputmethod.pea;
import com.google.inputmethod.r58;
import com.google.inputmethod.seb;
import com.google.inputmethod.sr1;
import com.google.inputmethod.t58;
import com.google.inputmethod.teb;
import com.google.inputmethod.un6;
import com.google.inputmethod.w41;
import com.google.inputmethod.wc;
import com.google.inputmethod.wr1;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000ê\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u0000 þ\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\b\u008f\u0001\u0090\u0001\u0093\u0003\u0094\u0003B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0011J\u000f\u0010*\u001a\u00020\u000fH\u0000¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000fH\u0000¢\u0006\u0004\b2\u0010\u0011J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u0010\u0011J'\u00109\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0000¢\u0006\u0004\b=\u0010\u0011J\u000f\u0010>\u001a\u00020\u000fH\u0000¢\u0006\u0004\b>\u0010\u0011J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010\u0011J\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010HJ\u0015\u0010K\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bK\u0010HJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bL\u0010HJ\u0015\u0010M\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bM\u0010HJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bN\u0010HJ\u0015\u0010O\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bO\u0010HJ\u0015\u0010P\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bP\u0010HJ\u0015\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u000fH\u0000¢\u0006\u0004\bV\u0010\u0011J\u000f\u0010W\u001a\u00020\u000fH\u0000¢\u0006\u0004\bW\u0010\u0011J\u001f\u0010Z\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000bH\u0000¢\u0006\u0004\bZ\u00105J\u000f\u0010[\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010\u0011J\u000f\u0010\\\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\\\u0010\u0011J!\u0010a\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020]2\b\u0010`\u001a\u0004\u0018\u00010_H\u0000¢\u0006\u0004\ba\u0010bJ3\u0010j\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020e2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020\tH\u0000¢\u0006\u0004\bj\u0010kJ3\u0010m\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020c2\u0006\u0010l\u001a\u00020e2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020\tH\u0000¢\u0006\u0004\bm\u0010kJ\u0017\u0010o\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u0000H\u0000¢\u0006\u0004\bo\u0010\u0019J-\u0010s\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\t2\b\b\u0002\u0010q\u001a\u00020\t2\b\b\u0002\u0010r\u001a\u00020\tH\u0000¢\u0006\u0004\bs\u0010tJ-\u0010u\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\t2\b\b\u0002\u0010q\u001a\u00020\t2\b\b\u0002\u0010r\u001a\u00020\tH\u0000¢\u0006\u0004\bu\u0010tJ\u000f\u0010v\u001a\u00020\u000fH\u0000¢\u0006\u0004\bv\u0010\u0011J\u000f\u0010w\u001a\u00020\u000fH\u0000¢\u0006\u0004\bw\u0010\u0011J\u0017\u0010z\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020xH\u0000¢\u0006\u0004\bz\u0010{J\u0019\u0010|\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\tH\u0000¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\tH\u0000¢\u0006\u0004\b~\u0010}J\u000f\u0010\u007f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u007f\u0010\u0011J\u0011\u0010\u0080\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0080\u0001\u0010\u0011J \u0010\u0083\u0001\u001a\u00020\t2\f\b\u0002\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J \u0010\u0085\u0001\u001a\u00020\t2\f\b\u0002\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001H\u0000¢\u0006\u0006\b\u0085\u0001\u0010\u0084\u0001J\u0011\u0010\u0086\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0086\u0001\u0010\u0011J\u0011\u0010\u0087\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0087\u0001\u0010\u0011J\u0011\u0010\u0088\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0088\u0001\u0010\u0011J\u0011\u0010\u0089\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0089\u0001\u0010\u0011J\u0011\u0010\u008a\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008a\u0001\u0010\u0011J\u0011\u0010\u008b\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008b\u0001\u0010\u0011J\u0011\u0010\u008c\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u008c\u0001\u0010\u0011J\u0011\u0010\u008d\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u008d\u0001\u0010\u0011J\u0011\u0010\u008e\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008e\u0001\u0010\u0011J\u0011\u0010\u008f\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u008f\u0001\u0010\u0011J\u0011\u0010\u0090\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0090\u0001\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R'\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u0093\u0001\u0010\u007f\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R'\u0010\u0099\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u0090\u0001\u0010\u0092\u0001\u001a\u0005\b\u0092\u0001\u0010<\"\u0005\b\u0098\u0001\u0010}R)\u0010\u009f\u0001\u001a\u00030\u009a\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u008f\u0001\u0010a\u001a\u0006\b\u009b\u0001\u0010\u009c\u0001\"\u0006\b\u009d\u0001\u0010\u009e\u0001R&\u0010¢\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bR\u0010\u0092\u0001\u001a\u0005\b \u0001\u0010<\"\u0005\b¡\u0001\u0010}R'\u0010¦\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b£\u0001\u0010\u0092\u0001\u001a\u0005\b¤\u0001\u0010<\"\u0005\b¥\u0001\u0010}R'\u0010ª\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b§\u0001\u0010\u0092\u0001\u001a\u0005\b¨\u0001\u0010<\"\u0005\b©\u0001\u0010}R(\u0010¬\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u008a\u0001\u0010\u007f\u001a\u0006\b«\u0001\u0010\u0095\u0001\"\u0006\b£\u0001\u0010\u0097\u0001R'\u0010°\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u00ad\u0001\u0010\u0092\u0001\u001a\u0005\b®\u0001\u0010<\"\u0005\b¯\u0001\u0010}R5\u0010·\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010±\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0005\b¶\u0001\u0010\u0019R\u0018\u0010¹\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b¸\u0001\u0010\u007fR\u001d\u0010¼\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000º\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b;\u0010»\u0001R\"\u0010À\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010Â\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÁ\u0001\u0010\u0092\u0001R\u001b\u0010Ä\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÃ\u0001\u0010³\u0001R-\u0010@\u001a\u0004\u0018\u00010?2\t\u0010Å\u0001\u001a\u0004\u0018\u00010?8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\b\u008e\u0001\u0010Æ\u0001\u001a\u0006\bÇ\u0001\u0010È\u0001R3\u0010Ð\u0001\u001a\f\u0018\u00010É\u0001j\u0005\u0018\u0001`Ê\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008b\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001\"\u0006\bÎ\u0001\u0010Ï\u0001R'\u0010\u001d\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bÑ\u0001\u0010\u007f\u001a\u0006\bÒ\u0001\u0010\u0095\u0001\"\u0006\bÓ\u0001\u0010\u0097\u0001R\u0019\u0010Õ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÔ\u0001\u0010\u0092\u0001R'\u0010Ù\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bÖ\u0001\u0010\u0092\u0001\u001a\u0005\b×\u0001\u0010<\"\u0005\bØ\u0001\u0010}R\u001b\u0010Ü\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0001\u0010Û\u0001R\u0019\u0010Þ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010\u0092\u0001R\u001e\u0010ß\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000½\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010¿\u0001R\u0018\u0010à\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010\u0092\u0001R3\u0010æ\u0001\u001a\u00030á\u00012\b\u0010Å\u0001\u001a\u00030á\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\bY\u0010â\u0001\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\b¾\u0001\u0010å\u0001R\u001b\u0010é\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bç\u0001\u0010è\u0001R2\u0010ï\u0001\u001a\u00030ê\u00012\b\u0010Å\u0001\u001a\u00030ê\u00018\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b&\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001\"\u0005\bR\u0010î\u0001R3\u0010õ\u0001\u001a\u00030ð\u00012\b\u0010Å\u0001\u001a\u00030ð\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\bA\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\b\u0091\u0001\u0010ô\u0001R3\u0010û\u0001\u001a\u00030ö\u00012\b\u0010Å\u0001\u001a\u00030ö\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u001b\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\b\u00ad\u0001\u0010ú\u0001R4\u0010\u0081\u0002\u001a\u00030ü\u00012\b\u0010Å\u0001\u001a\u00030ü\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u008c\u0001\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\bÃ\u0001\u0010\u0080\u0002R)\u0010\u0088\u0002\u001a\u00030\u0082\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b)\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R\u0019\u0010\u0089\u0002\u001a\u00030\u0082\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010\u0083\u0002R.\u0010\u008e\u0002\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0006\b\u008a\u0002\u0010\u0092\u0001\u0012\u0005\b\u008d\u0002\u0010\u0011\u001a\u0005\b\u008b\u0002\u0010<\"\u0005\b\u008c\u0002\u0010}R\u001f\u0010\u0093\u0002\u001a\u00030\u008f\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bC\u0010\u0090\u0002\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001f\u0010\u0098\u0002\u001a\u00030\u0094\u00028\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b\u007f\u0010\u0095\u0002\u001a\u0006\b\u0096\u0002\u0010\u0097\u0002R+\u0010\u009f\u0002\u001a\u0005\u0018\u00010\u0099\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\ba\u0010\u009a\u0002\u001a\u0006\b\u009b\u0002\u0010\u009c\u0002\"\u0006\b\u009d\u0002\u0010\u009e\u0002R\u001a\u0010¡\u0002\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0015\u0010 \u0002R'\u0010¤\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¨\u0001\u0010\u0092\u0001\u001a\u0005\b¢\u0002\u0010<\"\u0005\b£\u0002\u0010}R\u0019\u0010§\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¥\u0002\u0010¦\u0002R\u001b\u0010©\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0002\u0010¦\u0002R8\u0010°\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010ª\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008b\u0002\u0010«\u0002\u001a\u0006\b¬\u0002\u0010\u00ad\u0002\"\u0006\b®\u0002\u0010¯\u0002R8\u0010´\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010ª\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b±\u0002\u0010«\u0002\u001a\u0006\b²\u0002\u0010\u00ad\u0002\"\u0006\b³\u0002\u0010¯\u0002R'\u0010¸\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bµ\u0002\u0010\u0092\u0001\u001a\u0005\b¶\u0002\u0010<\"\u0005\b·\u0002\u0010}R1\u0010¼\u0002\u001a\u00020\u000b2\u0007\u0010Å\u0001\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b¹\u0002\u0010\u007f\u001a\u0006\bº\u0002\u0010\u0095\u0001\"\u0006\b»\u0002\u0010\u0097\u0001R(\u0010½\u0002\u001a\u00020\t2\u0007\u0010Å\u0001\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\u000e\n\u0006\b«\u0001\u0010\u0092\u0001\u001a\u0004\bY\u0010<R\u001a\u0010Á\u0002\u001a\u0005\u0018\u00010¾\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b¿\u0002\u0010À\u0002R\u0018\u0010Å\u0002\u001a\u00030Â\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010Ä\u0002R\u0016\u0010È\u0002\u001a\u0004\u0018\u00010\t8F¢\u0006\b\u001a\u0006\bÆ\u0002\u0010Ç\u0002R\u001e\u0010Ì\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000É\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÊ\u0002\u0010Ë\u0002R\u001f\u0010Î\u0002\u001a\n\u0012\u0005\u0012\u00030Í\u00020É\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bµ\u0002\u0010Ë\u0002R\u001f\u0010Ï\u0002\u001a\n\u0012\u0005\u0012\u00030Í\u00020É\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0002\u0010Ë\u0002R\u001e\u0010Ò\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000½\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÐ\u0002\u0010Ñ\u0002R\u001e\u0010Ó\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000É\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b¹\u0002\u0010Ë\u0002R\u0019\u0010Õ\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÔ\u0002\u0010µ\u0001R\u0016\u0010Ö\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010<R\u0018\u0010Ú\u0002\u001a\u00030×\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bØ\u0002\u0010Ù\u0002R\u001a\u0010Þ\u0002\u001a\u0005\u0018\u00010Û\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÜ\u0002\u0010Ý\u0002R\u0018\u0010â\u0002\u001a\u00030ß\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bà\u0002\u0010á\u0002R\u0018\u0010ã\u0002\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010\u001cR%\u0010æ\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000½\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bå\u0002\u0010\u0011\u001a\u0006\bä\u0002\u0010Ñ\u0002R\u0016\u0010è\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bç\u0002\u0010<R\u0016\u0010ê\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bé\u0002\u0010<R\u0016\u0010I\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0002\u0010\u0095\u0001R\u0016\u0010F\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bì\u0002\u0010\u0095\u0001R\u0016\u0010í\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¥\u0002\u0010<R\u0018\u0010ñ\u0002\u001a\u00030î\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bï\u0002\u0010ð\u0002R\u0015\u0010ò\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bX\u0010<R\u0013\u0010ô\u0002\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bó\u0002\u0010<R\u0017\u0010ö\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bõ\u0002\u0010\u0095\u0001R\u0018\u0010ø\u0002\u001a\u00030\u0082\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\b÷\u0002\u0010\u0085\u0002R\u0018\u0010ú\u0002\u001a\u00030\u0082\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bù\u0002\u0010\u0085\u0002R\u0017\u0010ý\u0002\u001a\u00020x8@X\u0080\u0004¢\u0006\b\u001a\u0006\bû\u0002\u0010ü\u0002R\u0017\u0010ÿ\u0002\u001a\u00020x8@X\u0080\u0004¢\u0006\b\u001a\u0006\bþ\u0002\u0010ü\u0002R\u0019\u0010\u0081\u0003\u001a\u0004\u0018\u00010x8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0080\u0003\u0010ü\u0002R\u0016\u0010\u0082\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¨\u0002\u0010<R(\u0010%\u001a\u00020$2\u0007\u0010Å\u0001\u001a\u00020$8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0083\u0003\u0010\u0084\u0003\"\u0005\b²\u0001\u0010'R\u0018\u0010\u0087\u0003\u001a\u00030\u0085\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÝ\u0001\u0010\u0086\u0003R\u0016\u0010\u0089\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0088\u0003\u0010<R\u0016\u0010\u008b\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008a\u0003\u0010<R\u0016\u0010\u008d\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008c\u0003\u0010<R\u0016\u0010\u008f\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0003\u0010<R\u0019\u0010\u0091\u0003\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\bÁ\u0001\u0010\u0090\u0003R\u001e\u0010\u0092\u0003\u001a\t\u0012\u0004\u0012\u00020\u00050É\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010Ë\u0002¨\u0006\u0095\u0003"}, d2 = {"Landroidx/compose/ui/node/LayoutNode;", "Lcom/google/android/aq1;", "Lcom/google/android/pea;", "Lcom/google/android/ew8;", "Lcom/google/android/un6;", "Lcom/google/android/teb;", "Landroidx/compose/ui/node/ComposeUiNode;", "", "Landroidx/compose/ui/node/m$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "", "w1", "()V", "X0", "instance", "", "K", "(Landroidx/compose/ui/node/LayoutNode;)Ljava/lang/String;", "child", "r1", "(Landroidx/compose/ui/node/LayoutNode;)V", "Lcom/google/android/seb;", "C", "()Lcom/google/android/seb;", "depth", "F", "(I)Ljava/lang/String;", "Lcom/google/android/i66;", "w0", "()Lcom/google/android/i66;", "t1", "Landroidx/compose/ui/b;", "modifier", "A", "(Landroidx/compose/ui/b;)V", "M1", "E", "h2", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "d0", "()Landroid/view/View;", "index", "Q0", "(ILandroidx/compose/ui/node/LayoutNode;)V", "u1", "count", "A1", "(II)V", "z1", "from", "to", "q1", "(III)V", "l", "()Z", "C1", "W0", "Landroidx/compose/ui/node/m;", "owner", "B", "(Landroidx/compose/ui/node/m;)V", "H", "toString", "()Ljava/lang/String;", "height", "p1", "(I)I", "width", "o1", "l1", "k1", "n1", "m1", "j1", "i1", "", "e", "", "O1", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "R0", "V0", "x", "y", "v1", "B1", "d1", "Lcom/google/android/w41;", "canvas", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "graphicsLayer", "J", "(Lcom/google/android/w41;Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "Lcom/google/android/rn8;", "pointerPosition", "Lcom/google/android/hd5;", "hitTestResult", "Landroidx/compose/ui/input/pointer/j;", "pointerType", "isInLayer", "M0", "(JLcom/google/android/hd5;IZ)V", "hitSemanticsEntities", "O0", "it", "L1", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "J1", "(ZZZ)V", "F1", "T0", "U0", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "s1", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "H1", "(Z)V", "D1", "I", "S0", "Lcom/google/android/kx1;", "constraints", "b1", "(Lcom/google/android/kx1;)Z", "x1", "e1", "h1", "f1", "g1", "h", "q", "D", "N1", "p", "d", "c", "a", "Z", "b", "w", "()I", "d2", "(I)V", "S1", "hasPositionalLayerTransformationsInOffsetFromRoot", "Lcom/google/android/g16;", "y0", "()J", "a2", "(J)V", "outerToInnerOffset", "A0", "b2", "outerToInnerOffsetDirty", "f", "E0", "c2", "rectInParentDirty", "g", "L", "P1", "addedToRectList", "S", "compositeKeyHash", "i", "a1", "g2", "isVirtualLookaheadRoot", "newRoot", "j", "Landroidx/compose/ui/node/LayoutNode;", "m0", "()Landroidx/compose/ui/node/LayoutNode;", "W1", "lookaheadRoot", "k", "virtualChildrenCount", "Lcom/google/android/t58;", "Lcom/google/android/t58;", "_foldedChildren", "Lcom/google/android/r58;", "m", "Lcom/google/android/r58;", "_unfoldedChildren", "n", "unfoldedVirtualChildrenListDirty", "o", "_foldedParent", "value", "Landroidx/compose/ui/node/m;", "B0", "()Landroidx/compose/ui/node/m;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "e0", "()Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "U1", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V", "interopViewFactoryHolder", "r", "V", "setDepth$ui", "s", "ignoreRemeasureRequests", "t", "isSemanticsInvalidated$ui", "e2", "isSemanticsInvalidated", "u", "Lcom/google/android/seb;", "_semanticsConfiguration", "v", "isCurrentlyCalculatingSemanticsConfiguration", "_zSortedChildren", "zSortedChildrenInvalidated", "Lcom/google/android/ej7;", "Lcom/google/android/ej7;", "q0", "()Lcom/google/android/ej7;", "(Lcom/google/android/ej7;)V", "measurePolicy", "z", "Lcom/google/android/i66;", "intrinsicsPolicy", "Lcom/google/android/f43;", "Lcom/google/android/f43;", "U", "()Lcom/google/android/f43;", "(Lcom/google/android/f43;)V", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lcom/google/android/p7e;", "Lcom/google/android/p7e;", "H0", "()Lcom/google/android/p7e;", "(Lcom/google/android/p7e;)V", "viewConfiguration", "Lcom/google/android/gs1;", "Lcom/google/android/gs1;", "T", "()Lcom/google/android/gs1;", "(Lcom/google/android/gs1;)V", "compositionLocalMap", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "f0", "()Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "V1", "(Landroidx/compose/ui/node/LayoutNode$UsageByParent;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "G", "O", "Q1", "getCanMultiMeasure$ui$annotations", "canMultiMeasure", "Lcom/google/android/ki8;", "Lcom/google/android/ki8;", "v0", "()Lcom/google/android/ki8;", "nodes", "Landroidx/compose/ui/node/f;", "Landroidx/compose/ui/node/f;", "g0", "()Landroidx/compose/ui/node/f;", "layoutDelegate", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "F0", "()Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;", "f2", "(Landroidx/compose/ui/layout/LayoutNodeSubcompositionsState;)V", "subcompositionsState", "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", "getInnerLayerCoordinatorIsDirty$ui", "T1", "innerLayerCoordinatorIsDirty", "M", "Landroidx/compose/ui/b;", "_modifier", "N", "pendingModifier", "Lkotlin/Function1;", "Lkotlin/jvm/functions/Function1;", "getOnAttach$ui", "()Lkotlin/jvm/functions/Function1;", "Y1", "(Lkotlin/jvm/functions/Function1;)V", "onAttach", "P", "getOnDetach$ui", "Z1", "onDetach", "Q", "u0", "X1", "needsOnGloballyPositionedDispatch", "R", "X", "R1", "globallyPositionedObservers", "isDeactivated", "Lcom/google/android/sr1;", "G0", "()Lcom/google/android/sr1;", "traceContext", "", "J0", "()F", "zIndex", "Z0", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "", "W", "()Ljava/util/List;", "foldedChildren", "Lcom/google/android/dj7;", "childMeasurables", "childLookaheadMeasurables", "L0", "()Lcom/google/android/r58;", "_children", "children", "C0", "parent", "isAttached", "Landroidx/compose/ui/node/LayoutNode$LayoutState;", "i0", "()Landroidx/compose/ui/node/LayoutNode$LayoutState;", "layoutState", "Landroidx/compose/ui/node/LookaheadPassDelegate;", "l0", "()Landroidx/compose/ui/node/LookaheadPassDelegate;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/MeasurePassDelegate;", "o0", "()Landroidx/compose/ui/node/MeasurePassDelegate;", "measurePassDelegate", "semanticsConfiguration", "K0", "getZSortedChildren$annotations", "zSortedChildren", "z0", "isValidOwnerScope", "Y", "hasFixedInnerContentConstraints", "I0", "a0", "alignmentLinesRequired", "Landroidx/compose/ui/node/LayoutNodeDrawScope;", "n0", "()Landroidx/compose/ui/node/LayoutNodeDrawScope;", "mDrawScope", "isPlaced", "Y0", "isPlacedByParent", "D0", "placeOrder", "r0", "measuredByParent", "s0", "measuredByParentInLookahead", "b0", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "x0", "outerCoordinator", "c0", "innerLayerCoordinator", "applyingModifierOnAttach", "t0", "()Landroidx/compose/ui/b;", "Lcom/google/android/kn6;", "()Lcom/google/android/kn6;", "coordinates", "p0", "measurePending", "h0", "layoutPending", "k0", "lookaheadMeasurePending", "j0", "lookaheadLayoutPending", "()Lcom/google/android/teb;", "parentInfo", "childrenInfo", "LayoutState", "UsageByParent", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutNode implements aq1, pea, ew8, un6, teb, ComposeUiNode, m.b {

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int U = 8;
    private static final d V = new b();
    private static final Function0<LayoutNode> W = new Function0<LayoutNode>() { // from class: androidx.compose.ui.node.LayoutNode$Companion$Constructor$1
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final LayoutNode invoke() {
            return new LayoutNode(false, 0 == true ? 1 : 0, 3, null);
        }
    };
    private static final p7e X = new a();
    private static final Comparator<LayoutNode> Y = new Comparator() { // from class: com.google.android.do6
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return LayoutNode.s((LayoutNode) obj, (LayoutNode) obj2);
        }
    };

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private f43 density;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private LayoutDirection layoutDirection;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private p7e viewConfiguration;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private gs1 compositionLocalMap;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private UsageByParent intrinsicsUsageByParent;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private UsageByParent previousIntrinsicsUsageByParent;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean canMultiMeasure;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final ki8 nodes;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final f layoutDelegate;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private LayoutNodeSubcompositionsState subcompositionsState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private NodeCoordinator _innerLayerCoordinator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private androidx.compose.ui.b _modifier;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private androidx.compose.ui.b pendingModifier;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private Function1<? super m, Unit> onAttach;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Function1<? super m, Unit> onDetach;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private boolean needsOnGloballyPositionedDispatch;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private int globallyPositionedObservers;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private boolean isDeactivated;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final boolean isVirtual;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int semanticsId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private boolean hasPositionalLayerTransformationsInOffsetFromRoot;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private long outerToInnerOffset;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean outerToInnerOffsetDirty;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private boolean rectInParentDirty;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean addedToRectList;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private int compositeKeyHash;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private LayoutNode lookaheadRoot;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int virtualChildrenCount;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final t58<LayoutNode> _foldedChildren;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private r58<LayoutNode> _unfoldedChildren;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private LayoutNode _foldedParent;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private m owner;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private AndroidViewHolder interopViewFactoryHolder;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private int depth;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private boolean isSemanticsInvalidated;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private seb _semanticsConfiguration;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private boolean isCurrentlyCalculatingSemanticsConfiguration;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final r58<LayoutNode> _zSortedChildren;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private ej7 measurePolicy;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private i66 intrinsicsPolicy;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$LayoutState;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum LayoutState {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;

        private static final /* synthetic */ EnumEntries g = kotlin.enums.a.a(a());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$UsageByParent;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum UsageByParent {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;

        private static final /* synthetic */ EnumEntries e = kotlin.enums.a.a(a());
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"androidx/compose/ui/node/LayoutNode$a", "Lcom/google/android/p7e;", "", "f", "()J", "longPressTimeoutMillis", "e", "doubleTapTimeoutMillis", "a", "doubleTapMinTimeMillis", "", "c", "()F", "touchSlop", "Lcom/google/android/jf3;", "g", "minimumTouchTargetSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p7e {
        a() {
        }

        @Override // com.google.inputmethod.p7e
        public long a() {
            return 40L;
        }

        @Override // com.google.inputmethod.p7e
        public float c() {
            return 16.0f;
        }

        @Override // com.google.inputmethod.p7e
        public long e() {
            return 300L;
        }

        @Override // com.google.inputmethod.p7e
        public long f() {
            return 400L;
        }

        @Override // com.google.inputmethod.p7e
        public long g() {
            return jf3.INSTANCE.b();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/ui/node/LayoutNode$b", "Landroidx/compose/ui/node/LayoutNode$d;", "Landroidx/compose/ui/layout/j;", "", "Lcom/google/android/dj7;", "measurables", "Lcom/google/android/kx1;", "constraints", "", "e", "(Landroidx/compose/ui/layout/j;Ljava/util/List;J)Ljava/lang/Void;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends d {
        b() {
            super("Undefined intrinsics block and it is required");
        }

        public Void e(androidx.compose.ui.layout.j jVar, List<? extends dj7> list, long j) {
            throw new IllegalStateException("Undefined measure and it is required");
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public /* bridge */ /* synthetic */ fj7 mo0measure3p2s80s(androidx.compose.ui.layout.j jVar, List list, long j) {
            return (fj7) e(jVar, list, j);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.LayoutNode$c, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$c;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/LayoutNode;", "Constructor", "Lkotlin/jvm/functions/Function0;", "a", "()Lkotlin/jvm/functions/Function0;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/LayoutNode$d;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/LayoutNode$d;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Function0<LayoutNode> a() {
            return LayoutNode.W;
        }

        public final Comparator<LayoutNode> b() {
            return LayoutNode.Y;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/LayoutNode$d;", "Lcom/google/android/ej7;", "", "error", "<init>", "(Ljava/lang/String;)V", "Lcom/google/android/h66;", "", "Lcom/google/android/f66;", "measurables", "", "height", "", "d", "(Lcom/google/android/h66;Ljava/util/List;I)Ljava/lang/Void;", "width", "c", "b", "a", "Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class d implements ej7 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final String error;

        public d(String str) {
            this.error = str;
        }

        public Void a(h66 h66Var, List<? extends f66> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void b(h66 h66Var, List<? extends f66> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void c(h66 h66Var, List<? extends f66> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void d(h66 h66Var, List<? extends f66> list, int i) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // com.google.inputmethod.ej7
        public /* bridge */ /* synthetic */ int maxIntrinsicHeight(h66 h66Var, List list, int i) {
            return ((Number) a(h66Var, list, i)).intValue();
        }

        @Override // com.google.inputmethod.ej7
        public /* bridge */ /* synthetic */ int maxIntrinsicWidth(h66 h66Var, List list, int i) {
            return ((Number) b(h66Var, list, i)).intValue();
        }

        @Override // com.google.inputmethod.ej7
        public /* bridge */ /* synthetic */ int minIntrinsicHeight(h66 h66Var, List list, int i) {
            return ((Number) c(h66Var, list, i)).intValue();
        }

        @Override // com.google.inputmethod.ej7
        public /* bridge */ /* synthetic */ int minIntrinsicWidth(h66 h66Var, List list, int i) {
            return ((Number) d(h66Var, list, i)).intValue();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class e {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutState.values().length];
            try {
                iArr[LayoutState.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LayoutNode() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void A(androidx.compose.ui.b modifier) throws KotlinNothingValueException {
        boolean zP = this.nodes.p(ni8.a(16));
        boolean zP2 = this.nodes.p(ni8.a(1024));
        this._modifier = modifier;
        this.nodes.E(modifier);
        boolean zP3 = this.nodes.p(ni8.a(16));
        boolean zP4 = this.nodes.p(ni8.a(1024));
        this.layoutDelegate.Z();
        if (this.lookaheadRoot == null && this.nodes.p(ni8.a(512))) {
            W1(this);
        }
        if (zP == zP3 && zP2 == zP4) {
            return;
        }
        fo6.b(this).getRectManager().t(this, zP4, zP3);
    }

    private final seb C() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new seb();
        OwnerSnapshotObserver snapshotObserver = fo6.b(this).getSnapshotObserver();
        Function0<Unit> function0 = new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m23invoke();
                return Unit.a;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r4v6 */
            /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
                java.lang.NullPointerException
                */
            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m23invoke() {
                /*
                    r11 = this;
                    androidx.compose.ui.node.LayoutNode r0 = r11.this$0
                    com.google.android.ki8 r0 = r0.getNodes()
                    r1 = 8
                    int r1 = com.google.inputmethod.ni8.a(r1)
                    kotlin.jvm.internal.Ref$ObjectRef<com.google.android.seb> r2 = r2
                    int r3 = com.google.inputmethod.ki8.c(r0)
                    r3 = r3 & r1
                    if (r3 == 0) goto L9d
                    androidx.compose.ui.b$c r0 = r0.getTail()
                L19:
                    if (r0 == 0) goto L9d
                    int r3 = r0.getKindSet()
                    r3 = r3 & r1
                    if (r3 == 0) goto L97
                    r3 = 0
                    r4 = r0
                    r5 = r3
                L25:
                    if (r4 == 0) goto L97
                    boolean r6 = r4 instanceof com.google.inputmethod.bfb
                    r7 = 1
                    if (r6 == 0) goto L53
                    com.google.android.bfb r4 = (com.google.inputmethod.bfb) r4
                    boolean r6 = r4.getIsClearingSemantics()
                    if (r6 == 0) goto L3e
                    com.google.android.seb r6 = new com.google.android.seb
                    r6.<init>()
                    r2.element = r6
                    r6.u(r7)
                L3e:
                    boolean r6 = r4.getMergeDescendants()
                    if (r6 == 0) goto L4b
                    java.lang.Object r6 = r2.element
                    com.google.android.seb r6 = (com.google.inputmethod.seb) r6
                    r6.v(r7)
                L4b:
                    java.lang.Object r6 = r2.element
                    com.google.android.nfb r6 = (com.google.inputmethod.nfb) r6
                    r4.H0(r6)
                    goto L92
                L53:
                    int r6 = r4.getKindSet()
                    r6 = r6 & r1
                    if (r6 == 0) goto L92
                    boolean r6 = r4 instanceof com.google.inputmethod.k33
                    if (r6 == 0) goto L92
                    r6 = r4
                    com.google.android.k33 r6 = (com.google.inputmethod.k33) r6
                    androidx.compose.ui.b$c r6 = r6.getDelegate()
                    r8 = 0
                    r9 = r8
                L67:
                    if (r6 == 0) goto L8f
                    int r10 = r6.getKindSet()
                    r10 = r10 & r1
                    if (r10 == 0) goto L8a
                    int r9 = r9 + 1
                    if (r9 != r7) goto L76
                    r4 = r6
                    goto L8a
                L76:
                    if (r5 != 0) goto L81
                    com.google.android.r58 r5 = new com.google.android.r58
                    r10 = 16
                    androidx.compose.ui.b$c[] r10 = new androidx.compose.ui.b.c[r10]
                    r5.<init>(r10, r8)
                L81:
                    if (r4 == 0) goto L87
                    r5.c(r4)
                    r4 = r3
                L87:
                    r5.c(r6)
                L8a:
                    androidx.compose.ui.b$c r6 = r6.getChild()
                    goto L67
                L8f:
                    if (r9 != r7) goto L92
                    goto L25
                L92:
                    androidx.compose.ui.b$c r4 = com.google.inputmethod.y23.b(r5)
                    goto L25
                L97:
                    androidx.compose.ui.b$c r0 = r0.getParent()
                    goto L19
                L9d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode$calculateSemanticsConfiguration$1.m23invoke():void");
            }
        };
        snapshotObserver.observer.k(this, snapshotObserver.onCommitAffectingSemantics, function0);
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (seb) objectRef.element;
    }

    private final void E() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        r58<LayoutNode> r58VarL0 = L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.intrinsicsUsageByParent == UsageByParent.InLayoutBlock) {
                layoutNode.E();
            }
        }
    }

    public static /* synthetic */ void E1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.D1(z);
    }

    private final String F(int depth) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < depth; i++) {
            sb.append("  ");
        }
        sb.append("|-");
        sb.append(toString());
        sb.append('\n');
        r58<LayoutNode> r58VarL0 = L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append(layoutNodeArr[i2].F(depth + 1));
        }
        String string = sb.toString();
        if (depth != 0) {
            return string;
        }
        String strSubstring = string.substring(0, string.length() - 1);
        Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    static /* synthetic */ String G(LayoutNode layoutNode, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        return layoutNode.F(i);
    }

    private final sr1 G0() {
        return (sr1) getCompositionLocalMap().a(wr1.c());
    }

    public static /* synthetic */ void G1(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.F1(z, z2, z3);
    }

    public static /* synthetic */ void I1(LayoutNode layoutNode, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        layoutNode.H1(z);
    }

    private final float J0() {
        return o0().X1();
    }

    private final String K(LayoutNode instance) {
        StringBuilder sb = new StringBuilder();
        sb.append("Cannot insert ");
        sb.append(instance);
        sb.append(" because it already has a parent or an owner. This tree: ");
        sb.append(G(this, 0, 1, null));
        sb.append(" Other tree: ");
        LayoutNode layoutNode = instance._foldedParent;
        sb.append(layoutNode != null ? G(layoutNode, 0, 1, null) : null);
        return sb.toString();
    }

    public static /* synthetic */ void K1(LayoutNode layoutNode, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = true;
        }
        if ((i & 4) != 0) {
            z3 = true;
        }
        layoutNode.J1(z, z2, z3);
    }

    private final void M1() {
        this.nodes.x();
    }

    public static /* synthetic */ void N0(LayoutNode layoutNode, long j, hd5 hd5Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.input.pointer.j.INSTANCE.e();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.M0(j, hd5Var, i3, z);
    }

    public static /* synthetic */ void P0(LayoutNode layoutNode, long j, hd5 hd5Var, int i, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            i = androidx.compose.ui.input.pointer.j.INSTANCE.d();
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = true;
        }
        layoutNode.O0(j, hd5Var, i3, z);
    }

    private final void W1(LayoutNode layoutNode) {
        if (Intrinsics.e(layoutNode, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = layoutNode;
        if (layoutNode != null) {
            this.layoutDelegate.a();
            NodeCoordinator wrapped = b0().getWrapped();
            for (NodeCoordinator nodeCoordinatorX0 = x0(); !Intrinsics.e(nodeCoordinatorX0, wrapped) && nodeCoordinatorX0 != null; nodeCoordinatorX0 = nodeCoordinatorX0.getWrapped()) {
                nodeCoordinatorX0.S2();
            }
        } else {
            this.layoutDelegate.I();
        }
        T0();
    }

    private final void X0() {
        LayoutNode layoutNode;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (layoutNode = this._foldedParent) == null) {
            return;
        }
        layoutNode.X0();
    }

    public static /* synthetic */ boolean c1(LayoutNode layoutNode, kx1 kx1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            kx1Var = layoutNode.layoutDelegate.k();
        }
        return layoutNode.b1(kx1Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void r1(LayoutNode child) throws KotlinNothingValueException {
        if (child.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            f fVar = this.layoutDelegate;
            fVar.L(fVar.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            child.H();
        }
        child._foldedParent = null;
        if (child.globallyPositionedObservers > 0) {
            R1(this.globallyPositionedObservers - 1);
        }
        child.x0().X3(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            r58<LayoutNode> r58VarC = child._foldedChildren.c();
            LayoutNode[] layoutNodeArr = r58VarC.content;
            int size = r58VarC.getSize();
            for (int i = 0; i < size; i++) {
                layoutNodeArr[i].x0().X3(null);
            }
        }
        X0();
        u1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int s(LayoutNode layoutNode, LayoutNode layoutNode2) {
        return layoutNode.J0() == layoutNode2.J0() ? Intrinsics.i(layoutNode.D0(), layoutNode2.D0()) : Float.compare(layoutNode.J0(), layoutNode2.J0());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void t1() throws KotlinNothingValueException {
        T0();
        LayoutNode layoutNodeC0 = C0();
        if (layoutNodeC0 != null) {
            layoutNodeC0.R0();
        } else {
            m mVar = this.owner;
            if (mVar != null) {
                mVar.k();
            }
        }
        S0();
    }

    private final i66 w0() {
        i66 i66Var = this.intrinsicsPolicy;
        if (i66Var != null) {
            return i66Var;
        }
        i66 i66Var2 = new i66(this, getMeasurePolicy());
        this.intrinsicsPolicy = i66Var2;
        return i66Var2;
    }

    private final void w1() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            r58<LayoutNode> r58Var = this._unfoldedChildren;
            if (r58Var == null) {
                r58Var = new r58<>(new LayoutNode[16], 0);
                this._unfoldedChildren = r58Var;
            }
            r58Var.j();
            r58<LayoutNode> r58VarC = this._foldedChildren.c();
            LayoutNode[] layoutNodeArr = r58VarC.content;
            int size = r58VarC.getSize();
            for (int i = 0; i < size; i++) {
                LayoutNode layoutNode = layoutNodeArr[i];
                if (layoutNode.isVirtual) {
                    r58Var.d(r58Var.getSize(), layoutNode.L0());
                } else {
                    r58Var.c(layoutNode);
                }
            }
            this.layoutDelegate.C();
        }
    }

    public static /* synthetic */ boolean y1(LayoutNode layoutNode, kx1 kx1Var, int i, Object obj) {
        if ((i & 1) != 0) {
            kx1Var = layoutNode.layoutDelegate.j();
        }
        return layoutNode.x1(kx1Var);
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getOuterToInnerOffsetDirty() {
        return this.outerToInnerOffsetDirty;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void A1(int index, int count) throws KotlinNothingValueException {
        if (!(count >= 0)) {
            zw5.a("count (" + count + ") must be greater than 0");
        }
        int i = (count + index) - 1;
        if (index > i) {
            return;
        }
        while (true) {
            r1(this._foldedChildren.c().content[i]);
            this._foldedChildren.d(i);
            if (i == index) {
                return;
            } else {
                i--;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    public final void B(m owner) throws KotlinNothingValueException {
        boolean z;
        LayoutNode layoutNode;
        if (!(this.owner == null)) {
            zw5.c("Cannot attach " + this + " as it already is attached.  Tree: " + G(this, 0, 1, null));
        }
        LayoutNode layoutNode2 = this._foldedParent;
        if (layoutNode2 == null) {
            z = true;
        } else if (Intrinsics.e(layoutNode2 != null ? layoutNode2.owner : null, owner)) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder();
            sb.append("Attaching to a different owner(");
            sb.append(owner);
            sb.append(") than the parent's owner(");
            LayoutNode layoutNodeC0 = C0();
            sb.append(layoutNodeC0 != null ? layoutNodeC0.owner : null);
            sb.append("). This tree: ");
            sb.append(G(this, 0, 1, null));
            sb.append(" Parent tree: ");
            LayoutNode layoutNode3 = this._foldedParent;
            sb.append(layoutNode3 != null ? G(layoutNode3, 0, 1, null) : null);
            zw5.c(sb.toString());
        }
        LayoutNode layoutNodeC1 = C0();
        if (layoutNodeC1 == null) {
            o0().L2(true);
            owner.getRectManager().l(this);
            LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
            if (lookaheadPassDelegateL0 != null) {
                lookaheadPassDelegateL0.m2();
            }
        }
        x0().X3(layoutNodeC1 != null ? layoutNodeC1.b0() : null);
        this.owner = owner;
        this.depth = (layoutNodeC1 != null ? layoutNodeC1.depth : -1) + 1;
        androidx.compose.ui.b bVar = this.pendingModifier;
        if (bVar != null) {
            A(bVar);
        }
        this.pendingModifier = null;
        owner.J(this);
        if (this.isVirtualLookaheadRoot) {
            W1(this);
        } else {
            LayoutNode layoutNode4 = this._foldedParent;
            if (layoutNode4 == null || (layoutNode = layoutNode4.lookaheadRoot) == null) {
                layoutNode = this.lookaheadRoot;
            }
            W1(layoutNode);
            if (this.lookaheadRoot == null && this.nodes.p(ni8.a(512))) {
                W1(this);
            }
        }
        if (!getIsDeactivated()) {
            this.nodes.s();
        }
        r58<LayoutNode> r58VarC = this._foldedChildren.c();
        LayoutNode[] layoutNodeArr = r58VarC.content;
        int size = r58VarC.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].B(owner);
        }
        if (!getIsDeactivated()) {
            this.nodes.y();
        }
        T0();
        if (layoutNodeC1 != null) {
            layoutNodeC1.T0();
        }
        Function1<? super m, Unit> function1 = this.onAttach;
        if (function1 != null) {
            function1.invoke(owner);
        }
        this.layoutDelegate.Z();
        if (!getIsDeactivated() && this.nodes.p(ni8.a(8))) {
            W0();
        }
        owner.H(this);
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final m getOwner() {
        return this.owner;
    }

    public final void B1() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            E();
        }
        o0().F2();
    }

    public final LayoutNode C0() {
        LayoutNode layoutNode = this._foldedParent;
        while (layoutNode != null && layoutNode.isVirtual) {
            layoutNode = layoutNode._foldedParent;
        }
        return layoutNode;
    }

    public final void C1() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        fo6.b(this).o(this);
    }

    public final void D() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = UsageByParent.NotUsed;
        r58<LayoutNode> r58VarL0 = L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            if (layoutNode.intrinsicsUsageByParent != UsageByParent.NotUsed) {
                layoutNode.D();
            }
        }
    }

    public final int D0() {
        return o0().F();
    }

    public final void D1(boolean forceRequest) {
        m mVar;
        if (this.isVirtual || (mVar = this.owner) == null) {
            return;
        }
        mVar.z(this, true, forceRequest);
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final boolean getRectInParentDirty() {
        return this.rectInParentDirty;
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final LayoutNodeSubcompositionsState getSubcompositionsState() {
        return this.subcompositionsState;
    }

    public final void F1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            zw5.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        m mVar = this.owner;
        if (mVar == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        mVar.u(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
            Intrinsics.g(lookaheadPassDelegateL0);
            lookaheadPassDelegateL0.X1(forceRequest);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void H() throws KotlinNothingValueException {
        m mVar = this.owner;
        if (mVar == null) {
            StringBuilder sb = new StringBuilder();
            sb.append("Cannot detach node that is already detached!  Tree: ");
            LayoutNode layoutNodeC0 = C0();
            sb.append(layoutNodeC0 != null ? G(layoutNodeC0, 0, 1, null) : null);
            zw5.d(sb.toString());
            throw new KotlinNothingValueException();
        }
        LayoutNode layoutNodeC1 = C0();
        if (layoutNodeC1 != null) {
            layoutNodeC1.R0();
            layoutNodeC1.T0();
            MeasurePassDelegate measurePassDelegateO0 = o0();
            UsageByParent usageByParent = UsageByParent.NotUsed;
            measurePassDelegateO0.K2(usageByParent);
            LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
            if (lookaheadPassDelegateL0 != null) {
                lookaheadPassDelegateL0.L2(usageByParent);
            }
        }
        this.layoutDelegate.K();
        NodeCoordinator wrapped = b0().getWrapped();
        for (NodeCoordinator nodeCoordinatorX0 = x0(); !Intrinsics.e(nodeCoordinatorX0, wrapped) && nodeCoordinatorX0 != null; nodeCoordinatorX0 = nodeCoordinatorX0.getWrapped()) {
            nodeCoordinatorX0.C3();
        }
        Function1<? super m, Unit> function1 = this.onDetach;
        if (function1 != null) {
            function1.invoke(mVar);
        }
        this.nodes.z();
        this.ignoreRemeasureRequests = true;
        r58<LayoutNode> r58VarC = this._foldedChildren.c();
        LayoutNode[] layoutNodeArr = r58VarC.content;
        int size = r58VarC.getSize();
        for (int i = 0; i < size; i++) {
            layoutNodeArr[i].H();
        }
        Unit unit = Unit.a;
        this.ignoreRemeasureRequests = false;
        this.nodes.t();
        mVar.L(this);
        mVar.getRectManager().n(this);
        this.owner = null;
        W1(null);
        this.depth = 0;
        o0().s2();
        LookaheadPassDelegate lookaheadPassDelegateL1 = l0();
        if (lookaheadPassDelegateL1 != null) {
            lookaheadPassDelegateL1.q2();
        }
        if (this.nodes.p(ni8.a(8))) {
            seb sebVar = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            mVar.getSemanticsOwner().e(this, sebVar);
            mVar.N();
        }
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public p7e getViewConfiguration() {
        return this.viewConfiguration;
    }

    public final void H1(boolean forceRequest) {
        m mVar;
        if (this.isVirtual || (mVar = this.owner) == null) {
            return;
        }
        m.B(mVar, this, false, forceRequest, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void I() {
        if (i0() != LayoutState.Idle || h0() || p0() || getIsDeactivated() || !x()) {
            return;
        }
        ki8 ki8Var = this.nodes;
        int iA = ni8.a(256);
        if ((ki8Var.i() & iA) != 0) {
            for (androidx.compose.ui.b.c head = ki8Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    androidx.compose.ui.b.c cVarJ = head;
                    r58 r58Var = null;
                    while (cVarJ != 0) {
                        if (cVarJ instanceof dz4) {
                            dz4 dz4Var = (dz4) cVarJ;
                            dz4Var.D(y23.l(dz4Var, ni8.a(256)));
                        } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                            androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                            int i = 0;
                            cVarJ = cVarJ;
                            while (cVarN3 != null) {
                                if ((cVarN3.getKindSet() & iA) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarJ = cVarN3;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                        }
                                        if (cVarJ != 0) {
                                            r58Var.c(cVarJ);
                                            cVarJ = 0;
                                        }
                                        r58Var.c(cVarN3);
                                    }
                                }
                                cVarN3 = cVarN3.getChild();
                                cVarJ = cVarJ;
                            }
                            if (i == 1) {
                            }
                        }
                        cVarJ = y23.j(r58Var);
                    }
                }
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public int I0() {
        return this.layoutDelegate.A();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void J(w41 canvas, GraphicsLayer graphicsLayer) throws Throwable {
        try {
            x0().P2(canvas, graphicsLayer);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            O1(th);
            throw new KotlinNothingValueException();
        }
    }

    public final void J1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        m mVar;
        if (this.ignoreRemeasureRequests || this.isVirtual || (mVar = this.owner) == null) {
            return;
        }
        m.Q(mVar, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            o0().Y1(forceRequest);
        }
    }

    public final r58<LayoutNode> K0() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.j();
            r58<LayoutNode> r58Var = this._zSortedChildren;
            r58Var.d(r58Var.getSize(), L0());
            this._zSortedChildren.A(Y);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getAddedToRectList() {
        return this.addedToRectList;
    }

    public final r58<LayoutNode> L0() {
        h2();
        if (this.virtualChildrenCount == 0) {
            return this._foldedChildren.c();
        }
        r58<LayoutNode> r58Var = this._unfoldedChildren;
        Intrinsics.g(r58Var);
        return r58Var;
    }

    public final void L1(LayoutNode it) {
        if (e.$EnumSwitchMapping$0[it.i0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.i0());
        }
        if (it.k0()) {
            G1(it, true, false, false, 6, null);
            return;
        }
        if (it.j0()) {
            it.D1(true);
        }
        if (it.p0()) {
            K1(it, true, false, false, 6, null);
        } else if (it.h0()) {
            it.H1(true);
        }
    }

    public final boolean M() {
        wc wcVarO;
        AlignmentLines alignmentLinesJ;
        f fVar = this.layoutDelegate;
        return fVar.b().j().k() || !((wcVarO = fVar.o()) == null || (alignmentLinesJ = wcVarO.j()) == null || !alignmentLinesJ.k());
    }

    public final void M0(long pointerPosition, hd5 hitTestResult, int pointerType, boolean isInLayer) {
        x0().t3(NodeCoordinator.INSTANCE.a(), NodeCoordinator.V2(x0(), pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
    }

    public final boolean N() {
        return this.pendingModifier != null;
    }

    public final void N1() {
        r58<LayoutNode> r58VarL0 = L0();
        LayoutNode[] layoutNodeArr = r58VarL0.content;
        int size = r58VarL0.getSize();
        for (int i = 0; i < size; i++) {
            LayoutNode layoutNode = layoutNodeArr[i];
            UsageByParent usageByParent = layoutNode.previousIntrinsicsUsageByParent;
            layoutNode.intrinsicsUsageByParent = usageByParent;
            if (usageByParent != UsageByParent.NotUsed) {
                layoutNode.N1();
            }
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void O0(long pointerPosition, hd5 hitSemanticsEntities, int pointerType, boolean isInLayer) {
        x0().t3(NodeCoordinator.INSTANCE.b(), NodeCoordinator.V2(x0(), pointerPosition, false, 2, null), hitSemanticsEntities, androidx.compose.ui.input.pointer.j.INSTANCE.d(), isInLayer);
    }

    public final Void O1(Throwable e2) throws Throwable {
        sr1 sr1VarG0 = G0();
        if (sr1VarG0 == null) {
            throw e2;
        }
        sr1VarG0.d(e2, this);
        throw e2;
    }

    public final List<dj7> P() {
        LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
        Intrinsics.g(lookaheadPassDelegateL0);
        return lookaheadPassDelegateL0.v1();
    }

    public final void P1(boolean z) {
        this.addedToRectList = z;
    }

    public final List<dj7> Q() {
        return o0().y1();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void Q0(int index, LayoutNode instance) throws KotlinNothingValueException {
        if (!(instance._foldedParent == null || instance.owner == null)) {
            zw5.c(K(instance));
        }
        instance._foldedParent = this;
        this._foldedChildren.a(index, instance);
        u1();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        X0();
        m mVar = this.owner;
        if (mVar != null) {
            instance.B(mVar);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            f fVar = this.layoutDelegate;
            fVar.L(fVar.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
        if (instance.globallyPositionedObservers > 0) {
            R1(this.globallyPositionedObservers + 1);
        }
    }

    public final void Q1(boolean z) {
        this.canMultiMeasure = z;
    }

    public final List<LayoutNode> R() {
        return L0().i();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void R0() throws KotlinNothingValueException {
        NodeCoordinator nodeCoordinatorC0 = c0();
        if (nodeCoordinatorC0 != null) {
            nodeCoordinatorC0.v3();
            return;
        }
        LayoutNode layoutNodeC0 = C0();
        if (layoutNodeC0 != null) {
            layoutNodeC0.R0();
            return;
        }
        m mVar = this.owner;
        if (mVar != null) {
            mVar.k();
        }
    }

    public final void R1(int i) {
        LayoutNode layoutNodeC0;
        LayoutNode layoutNodeC1;
        int i2 = this.globallyPositionedObservers;
        if (i2 != i) {
            if (i > 0 && i2 == 0 && (layoutNodeC1 = C0()) != null) {
                layoutNodeC1.R1(layoutNodeC1.globallyPositionedObservers + 1);
            }
            if (i == 0 && this.globallyPositionedObservers > 0 && (layoutNodeC0 = C0()) != null) {
                layoutNodeC0.R1(layoutNodeC0.globallyPositionedObservers - 1);
            }
            this.globallyPositionedObservers = i;
        }
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    public final void S0() {
        NodeCoordinator nodeCoordinatorX0 = x0();
        NodeCoordinator nodeCoordinatorB0 = b0();
        while (nodeCoordinatorX0 != nodeCoordinatorB0) {
            Intrinsics.h(nodeCoordinatorX0, "null cannot be cast to non-null type androidx.compose.ui.node.LayoutModifierNodeCoordinator");
            androidx.compose.ui.node.d dVar = (androidx.compose.ui.node.d) nodeCoordinatorX0;
            dw8 layer = dVar.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            nodeCoordinatorX0 = dVar.getWrapped();
        }
        dw8 layer2 = b0().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void S1(boolean z) {
        this.hasPositionalLayerTransformationsInOffsetFromRoot = z;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public gs1 getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    public final void T0() {
        if (this.isVirtual) {
            LayoutNode layoutNodeC0 = C0();
            if (layoutNodeC0 != null) {
                layoutNodeC0.T0();
                return;
            }
            return;
        }
        if (this.lookaheadRoot != null) {
            G1(this, false, false, false, 7, null);
        } else {
            K1(this, false, false, false, 7, null);
        }
    }

    public final void T1(boolean z) {
        this.innerLayerCoordinatorIsDirty = z;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public f43 getDensity() {
        return this.density;
    }

    public final void U0() {
        if (this.globallyPositionedObservers == 0 || h0() || p0() || this.needsOnGloballyPositionedDispatch) {
            return;
        }
        fo6.b(this).f(this);
    }

    public final void U1(AndroidViewHolder androidViewHolder) {
        this.interopViewFactoryHolder = androidViewHolder;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final void V0() {
        this.layoutDelegate.B();
    }

    public final void V1(UsageByParent usageByParent) {
        this.intrinsicsUsageByParent = usageByParent;
    }

    public final List<LayoutNode> W() {
        return this._foldedChildren.c().i();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void W0() throws KotlinNothingValueException {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (this.nodes.r() || N()) {
            this.isSemanticsInvalidated = true;
            return;
        }
        seb sebVar = this._semanticsConfiguration;
        this._semanticsConfiguration = C();
        this.isSemanticsInvalidated = false;
        m mVarB = fo6.b(this);
        mVarB.getSemanticsOwner().e(this, sebVar);
        mVarB.N();
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final int getGloballyPositionedObservers() {
        return this.globallyPositionedObservers;
    }

    public final void X1(boolean z) {
        this.needsOnGloballyPositionedDispatch = z;
    }

    public final boolean Y() {
        long jC3 = b0().c3();
        return kx1.j(jC3) && kx1.i(jC3);
    }

    public final boolean Y0() {
        return o0().e2();
    }

    public final void Y1(Function1<? super m, Unit> function1) {
        this.onAttach = function1;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getHasPositionalLayerTransformationsInOffsetFromRoot() {
        return this.hasPositionalLayerTransformationsInOffsetFromRoot;
    }

    public final Boolean Z0() {
        LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
        if (lookaheadPassDelegateL0 != null) {
            return Boolean.valueOf(lookaheadPassDelegateL0.b2());
        }
        return null;
    }

    public final void Z1(Function1<? super m, Unit> function1) {
        this.onDetach = function1;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void a(LayoutDirection layoutDirection) throws KotlinNothingValueException {
        if (this.layoutDirection != layoutDirection) {
            this.layoutDirection = layoutDirection;
            t1();
            for (androidx.compose.ui.b.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
                head.C1();
            }
        }
    }

    public int a0() {
        return this.layoutDelegate.i();
    }

    /* JADX INFO: renamed from: a1, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final void a2(long j) {
        this.outerToInnerOffset = j;
    }

    @Override // com.google.inputmethod.un6
    public boolean b() {
        return this.owner != null;
    }

    public final NodeCoordinator b0() {
        return this.nodes.getInnerCoordinator();
    }

    public final boolean b1(kx1 constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
        Intrinsics.g(lookaheadPassDelegateL0);
        return lookaheadPassDelegateL0.D2(constraints.getValue());
    }

    public final void b2(boolean z) {
        this.outerToInnerOffsetDirty = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.aq1
    public void c() throws KotlinNothingValueException {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.c();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.c();
        }
        NodeCoordinator wrapped = b0().getWrapped();
        for (NodeCoordinator nodeCoordinatorX0 = x0(); !Intrinsics.e(nodeCoordinatorX0, wrapped) && nodeCoordinatorX0 != null; nodeCoordinatorX0 = nodeCoordinatorX0.getWrapped()) {
            nodeCoordinatorX0.G3();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final NodeCoordinator c0() throws KotlinNothingValueException {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator nodeCoordinatorB0 = b0();
            NodeCoordinator wrappedBy = x0().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (!Intrinsics.e(nodeCoordinatorB0, wrappedBy)) {
                if ((nodeCoordinatorB0 != null ? nodeCoordinatorB0.getLayer() : null) != null) {
                    this._innerLayerCoordinator = nodeCoordinatorB0;
                    break;
                }
                nodeCoordinatorB0 = nodeCoordinatorB0 != null ? nodeCoordinatorB0.getWrappedBy() : null;
            }
            this.innerLayerCoordinatorIsDirty = false;
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        zw5.d("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        throw new KotlinNothingValueException();
    }

    public final void c2(boolean z) {
        this.rectInParentDirty = z;
    }

    @Override // com.google.inputmethod.aq1
    public void d() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.d();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.d();
        }
        this.isDeactivated = true;
        M1();
        if (b()) {
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
        }
        m mVar = this.owner;
        if (mVar != null) {
            mVar.P(this);
        }
    }

    public View d0() {
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            return androidViewHolder.getView();
        }
        return null;
    }

    public final void d1() {
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            E();
        }
        LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
        Intrinsics.g(lookaheadPassDelegateL0);
        lookaheadPassDelegateL0.E2();
    }

    public void d2(int i) {
        this.semanticsId = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void e(f43 f43Var) throws KotlinNothingValueException {
        if (Intrinsics.e(this.density, f43Var)) {
            return;
        }
        this.density = f43Var;
        t1();
        for (androidx.compose.ui.b.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
            head.N();
        }
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final AndroidViewHolder getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final void e1() {
        this.layoutDelegate.D();
    }

    public final void e2(boolean z) {
        this.isSemanticsInvalidated = z;
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void f(int i) {
        this.compositeKeyHash = i;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final UsageByParent getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void f1() {
        this.layoutDelegate.E();
    }

    public final void f2(LayoutNodeSubcompositionsState layoutNodeSubcompositionsState) {
        this.subcompositionsState = layoutNodeSubcompositionsState;
    }

    @Override // com.google.inputmethod.teb
    public seb g() {
        if (b() && !getIsDeactivated() && this.nodes.p(ni8.a(8))) {
            return this._semanticsConfiguration;
        }
        return null;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final f getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final void g1() {
        this.layoutDelegate.F();
    }

    public final void g2(boolean z) {
        this.isVirtualLookaheadRoot = z;
    }

    @Override // com.google.inputmethod.un6
    public LayoutDirection getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // com.google.inputmethod.pea
    public void h() {
        LayoutNode layoutNode;
        if (this.lookaheadRoot != null) {
            layoutNode = this;
            G1(layoutNode, false, false, false, 5, null);
        } else {
            K1(this, false, false, false, 5, null);
            layoutNode = this;
        }
        kx1 kx1VarJ = layoutNode.layoutDelegate.j();
        if (kx1VarJ != null) {
            m mVar = layoutNode.owner;
            if (mVar != null) {
                mVar.s(this, kx1VarJ.getValue());
                return;
            }
            return;
        }
        m mVar2 = layoutNode.owner;
        if (mVar2 != null) {
            m.e(mVar2, false, 1, null);
        }
    }

    public final boolean h0() {
        return this.layoutDelegate.m();
    }

    public final void h1() {
        this.layoutDelegate.G();
    }

    public final void h2() {
        if (this.virtualChildrenCount > 0) {
            w1();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void i(p7e p7eVar) {
        if (Intrinsics.e(this.viewConfiguration, p7eVar)) {
            return;
        }
        this.viewConfiguration = p7eVar;
        ki8 ki8Var = this.nodes;
        int iA = ni8.a(16);
        if ((ki8Var.i() & iA) != 0) {
            for (androidx.compose.ui.b.c head = ki8Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    androidx.compose.ui.b.c cVarJ = head;
                    r58 r58Var = null;
                    while (cVarJ != 0) {
                        if (cVarJ instanceof bf9) {
                            ((bf9) cVarJ).F2();
                        } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                            androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                            int i = 0;
                            cVarJ = cVarJ;
                            while (cVarN3 != null) {
                                if ((cVarN3.getKindSet() & iA) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarJ = cVarN3;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                        }
                                        if (cVarJ != 0) {
                                            r58Var.c(cVarJ);
                                            cVarJ = 0;
                                        }
                                        r58Var.c(cVarN3);
                                    }
                                }
                                cVarN3 = cVarN3.getChild();
                                cVarJ = cVarJ;
                            }
                            if (i == 1) {
                            }
                        }
                        cVarJ = y23.j(r58Var);
                    }
                }
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final LayoutState i0() {
        return this.layoutDelegate.getLayoutState();
    }

    public final int i1(int width) {
        return w0().b(width);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void j(androidx.compose.ui.b bVar) throws KotlinNothingValueException {
        if (!(!this.isVirtual || get_modifier() == androidx.compose.ui.b.INSTANCE)) {
            zw5.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            zw5.a("modifier is updated when deactivated");
        }
        if (!b()) {
            this.pendingModifier = bVar;
            return;
        }
        A(bVar);
        if (this.isSemanticsInvalidated) {
            W0();
        }
    }

    public final boolean j0() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    public final int j1(int height) {
        return w0().c(height);
    }

    @Override // com.google.inputmethod.teb
    public List<teb> k() {
        return R();
    }

    public final boolean k0() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    public final int k1(int width) {
        return w0().d(width);
    }

    @Override // com.google.inputmethod.teb
    public boolean l() {
        return x0().y3();
    }

    public final LookaheadPassDelegate l0() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    public final int l1(int height) {
        return w0().e(height);
    }

    @Override // androidx.compose.ui.node.ComposeUiNode
    public void m(ej7 ej7Var) {
        if (Intrinsics.e(this.measurePolicy, ej7Var)) {
            return;
        }
        this.measurePolicy = ej7Var;
        i66 i66Var = this.intrinsicsPolicy;
        if (i66Var != null) {
            i66Var.k(getMeasurePolicy());
        }
        T0();
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final LayoutNode getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final int m1(int width) {
        return w0().f(width);
    }

    @Override // com.google.inputmethod.teb
    public teb n() {
        return C0();
    }

    public final LayoutNodeDrawScope n0() {
        return fo6.b(this).getSharedDrawScope();
    }

    public final int n1(int height) {
        return w0().g(height);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.ComposeUiNode
    public void o(com.google.inputmethod.gs1 r10) throws kotlin.KotlinNothingValueException {
        /*
            r9 = this;
            r9.compositionLocalMap = r10
            com.google.android.ks9 r0 = androidx.compose.ui.platform.CompositionLocalsKt.g()
            java.lang.Object r0 = r10.a(r0)
            com.google.android.f43 r0 = (com.google.inputmethod.f43) r0
            r9.e(r0)
            com.google.android.ks9 r0 = androidx.compose.ui.platform.CompositionLocalsKt.m()
            java.lang.Object r0 = r10.a(r0)
            androidx.compose.ui.unit.LayoutDirection r0 = (androidx.compose.ui.unit.LayoutDirection) r0
            r9.a(r0)
            com.google.android.ks9 r0 = androidx.compose.ui.platform.CompositionLocalsKt.u()
            java.lang.Object r10 = r10.a(r0)
            com.google.android.p7e r10 = (com.google.inputmethod.p7e) r10
            r9.i(r10)
            com.google.android.ki8 r10 = r9.nodes
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = com.google.inputmethod.ni8.a(r0)
            int r1 = com.google.inputmethod.ki8.c(r10)
            r1 = r1 & r0
            if (r1 == 0) goto Lb4
            androidx.compose.ui.b$c r10 = r10.getHead()
        L3d:
            if (r10 == 0) goto Lb4
            int r1 = r10.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto La8
            r1 = 0
            r2 = r10
            r3 = r1
        L49:
            if (r2 == 0) goto La8
            boolean r4 = r2 instanceof com.google.inputmethod.bs1
            r5 = 1
            if (r4 == 0) goto L64
            com.google.android.bs1 r2 = (com.google.inputmethod.bs1) r2
            androidx.compose.ui.b$c r2 = r2.getNode()
            boolean r4 = r2.getIsAttached()
            if (r4 == 0) goto L60
            com.google.inputmethod.oi8.e(r2)
            goto La3
        L60:
            r2.j3(r5)
            goto La3
        L64:
            int r4 = r2.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto La3
            boolean r4 = r2 instanceof com.google.inputmethod.k33
            if (r4 == 0) goto La3
            r4 = r2
            com.google.android.k33 r4 = (com.google.inputmethod.k33) r4
            androidx.compose.ui.b$c r4 = r4.getDelegate()
            r6 = 0
            r7 = r6
        L78:
            if (r4 == 0) goto La0
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L9b
            int r7 = r7 + 1
            if (r7 != r5) goto L87
            r2 = r4
            goto L9b
        L87:
            if (r3 != 0) goto L92
            com.google.android.r58 r3 = new com.google.android.r58
            r8 = 16
            androidx.compose.ui.b$c[] r8 = new androidx.compose.ui.b.c[r8]
            r3.<init>(r8, r6)
        L92:
            if (r2 == 0) goto L98
            r3.c(r2)
            r2 = r1
        L98:
            r3.c(r4)
        L9b:
            androidx.compose.ui.b$c r4 = r4.getChild()
            goto L78
        La0:
            if (r7 != r5) goto La3
            goto L49
        La3:
            androidx.compose.ui.b$c r2 = com.google.inputmethod.y23.b(r3)
            goto L49
        La8:
            int r1 = r10.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto Lb4
            androidx.compose.ui.b$c r10 = r10.getChild()
            goto L3d
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.LayoutNode.o(com.google.android.gs1):void");
    }

    public final MeasurePassDelegate o0() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public final int o1(int width) {
        return w0().h(width);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    @Override // com.google.inputmethod.aq1
    public void p() throws KotlinNothingValueException {
        RectManager rectManager;
        RectManager rectManager2;
        if (!b()) {
            zw5.a("onReuse is only expected on attached node");
        }
        AndroidViewHolder androidViewHolder = this.interopViewFactoryHolder;
        if (androidViewHolder != null) {
            androidViewHolder.p();
        }
        LayoutNodeSubcompositionsState layoutNodeSubcompositionsState = this.subcompositionsState;
        if (layoutNodeSubcompositionsState != null) {
            layoutNodeSubcompositionsState.p();
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (getIsDeactivated()) {
            this.isDeactivated = false;
        } else {
            M1();
        }
        int semanticsId = getSemanticsId();
        m mVar = this.owner;
        if (mVar != null && (rectManager2 = mVar.getRectManager()) != null) {
            rectManager2.n(this);
        }
        d2(afb.b());
        m mVar2 = this.owner;
        if (mVar2 != null) {
            mVar2.D(this, semanticsId);
        }
        this.nodes.s();
        this.nodes.y();
        if (this.nodes.p(ni8.a(8))) {
            W0();
        }
        L1(this);
        m mVar3 = this.owner;
        if (mVar3 != null) {
            mVar3.g(this, semanticsId);
        }
        m mVar4 = this.owner;
        if (mVar4 == null || (rectManager = mVar4.getRectManager()) == null) {
            return;
        }
        rectManager.l(this);
    }

    public final boolean p0() {
        return this.layoutDelegate.w();
    }

    public final int p1(int height) {
        return w0().i(height);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.compose.ui.node.m.b
    public void q() {
        NodeCoordinator nodeCoordinatorB0 = b0();
        int iA = ni8.a(4194304);
        boolean zI = oi8.i(iA);
        androidx.compose.ui.b.c cVarJ3 = nodeCoordinatorB0.j3();
        if (!zI && (cVarJ3 = cVarJ3.getParent()) == null) {
            return;
        }
        for (androidx.compose.ui.b.c cVarQ3 = nodeCoordinatorB0.q3(zI); cVarQ3 != null && (cVarQ3.getAggregateChildKindSet() & iA) != 0; cVarQ3 = cVarQ3.getChild()) {
            if ((cVarQ3.getKindSet() & iA) != 0) {
                androidx.compose.ui.b.c cVarJ = cVarQ3;
                r58 r58Var = null;
                while (cVarJ != 0) {
                    if (cVarJ instanceof fn6) {
                        ((fn6) cVarJ).w(b0());
                    } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                        androidx.compose.ui.b.c cVarN3 = ((k33) cVarJ).getDelegate();
                        int i = 0;
                        cVarJ = cVarJ;
                        while (cVarN3 != null) {
                            if ((cVarN3.getKindSet() & iA) != 0) {
                                i++;
                                if (i == 1) {
                                    cVarJ = cVarN3;
                                } else {
                                    if (r58Var == null) {
                                        r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                    }
                                    if (cVarJ != 0) {
                                        r58Var.c(cVarJ);
                                        cVarJ = 0;
                                    }
                                    r58Var.c(cVarN3);
                                }
                            }
                            cVarN3 = cVarN3.getChild();
                            cVarJ = cVarJ;
                        }
                        if (i == 1) {
                        }
                    }
                    cVarJ = y23.j(r58Var);
                }
            }
            if (cVarQ3 == cVarJ3) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: q0, reason: from getter */
    public ej7 getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final void q1(int from, int to, int count) {
        if (from == to) {
            return;
        }
        for (int i = 0; i < count; i++) {
            this._foldedChildren.a(from > to ? to + i : (to + count) - 2, this._foldedChildren.d(from > to ? from + i : from));
        }
        u1();
        X0();
        T0();
    }

    public final UsageByParent r0() {
        return o0().N1();
    }

    public final UsageByParent s0() {
        UsageByParent usageByParentM1;
        LookaheadPassDelegate lookaheadPassDelegateL0 = l0();
        return (lookaheadPassDelegateL0 == null || (usageByParentM1 = lookaheadPassDelegateL0.M1()) == null) ? UsageByParent.NotUsed : usageByParentM1;
    }

    public final void s1(NodeCoordinator coordinator) {
        m mVar = this.owner;
        RectManager rectManager = mVar != null ? mVar.getRectManager() : null;
        boolean z = i0() != LayoutState.Idle || p0() || h0();
        if (this.addedToRectList && rectManager != null) {
            if (coordinator == x0()) {
                this.rectInParentDirty = true;
                if (!z) {
                    rectManager.l(this);
                }
            } else {
                this.outerToInnerOffsetDirty = true;
                r58<LayoutNode> r58VarL0 = L0();
                LayoutNode[] layoutNodeArr = r58VarL0.content;
                int size = r58VarL0.getSize();
                for (int i = 0; i < size; i++) {
                    LayoutNode layoutNode = layoutNodeArr[i];
                    layoutNode.rectInParentDirty = true;
                    if (!z) {
                        rectManager.l(layoutNode);
                    }
                }
                rectManager.j(this);
            }
        }
        this.layoutDelegate.getMeasurePassDelegate().H2();
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public androidx.compose.ui.b get_modifier() {
        return this._modifier;
    }

    public String toString() {
        return af6.a(this, null) + " children: " + R().size() + " measurePolicy: " + getMeasurePolicy() + " deactivated: " + getIsDeactivated();
    }

    /* JADX INFO: renamed from: u0, reason: from getter */
    public final boolean getNeedsOnGloballyPositionedDispatch() {
        return this.needsOnGloballyPositionedDispatch;
    }

    public final void u1() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        LayoutNode layoutNodeC0 = C0();
        if (layoutNodeC0 != null) {
            layoutNodeC0.u1();
        }
    }

    @Override // com.google.inputmethod.un6
    public kn6 v() {
        return b0();
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final ki8 getNodes() {
        return this.nodes;
    }

    public final void v1(int x, int y) {
        androidx.compose.ui.layout.o.a placementScope;
        NodeCoordinator nodeCoordinatorB0;
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            E();
        }
        LayoutNode layoutNodeC0 = C0();
        if (layoutNodeC0 == null || (nodeCoordinatorB0 = layoutNodeC0.b0()) == null || (placementScope = nodeCoordinatorB0.getPlacementScope()) == null) {
            placementScope = fo6.b(this).getPlacementScope();
        }
        androidx.compose.ui.layout.o.a.L(placementScope, o0(), x, y, 0.0f, 4, null);
    }

    @Override // com.google.inputmethod.un6
    /* JADX INFO: renamed from: w, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    @Override // com.google.inputmethod.un6
    public boolean x() {
        return o0().d2();
    }

    public final NodeCoordinator x0() {
        return this.nodes.getOuterCoordinator();
    }

    public final boolean x1(kx1 constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == UsageByParent.NotUsed) {
            D();
        }
        return o0().E2(constraints.getValue());
    }

    @Override // com.google.inputmethod.un6
    /* JADX INFO: renamed from: y, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    /* JADX INFO: renamed from: y0, reason: from getter */
    public final long getOuterToInnerOffset() {
        return this.outerToInnerOffset;
    }

    @Override // com.google.inputmethod.ew8
    public boolean z0() {
        return b();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void z1() throws KotlinNothingValueException {
        int size = this._foldedChildren.c().getSize();
        while (true) {
            size--;
            if (-1 >= size) {
                this._foldedChildren.b();
                return;
            }
            r1(this._foldedChildren.c().content[size]);
        }
    }

    public LayoutNode(boolean z, int i) {
        this.isVirtual = z;
        this.semanticsId = i;
        this.outerToInnerOffset = g16.INSTANCE.a();
        this.outerToInnerOffsetDirty = true;
        this.rectInParentDirty = true;
        this._foldedChildren = new t58<>(new r58(new LayoutNode[16], 0), new Function0<Unit>() { // from class: androidx.compose.ui.node.LayoutNode$_foldedChildren$1
            {
                super(0);
            }

            public /* bridge */ /* synthetic */ Object invoke() {
                m22invoke();
                return Unit.a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m22invoke() {
                this.this$0.getLayoutDelegate().C();
            }
        });
        this._zSortedChildren = new r58<>(new LayoutNode[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = V;
        this.density = fo6.a;
        this.layoutDirection = LayoutDirection.Ltr;
        this.viewConfiguration = X;
        this.compositionLocalMap = gs1.INSTANCE.a();
        UsageByParent usageByParent = UsageByParent.NotUsed;
        this.intrinsicsUsageByParent = usageByParent;
        this.previousIntrinsicsUsageByParent = usageByParent;
        this.nodes = new ki8(this);
        this.layoutDelegate = new f(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = androidx.compose.ui.b.INSTANCE;
    }

    public /* synthetic */ LayoutNode(boolean z, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? afb.b() : i);
    }
}
