package androidx.compose.p004runtime;

import androidx.collection.ObjectList;
import androidx.collection.ScatterSet;
import androidx.collection.d;
import androidx.compose.p004runtime.Recomposer;
import androidx.compose.p004runtime.snapshots.g;
import androidx.compose.p004runtime.snapshots.h;
import com.google.android.g41;
import com.google.android.nx3;
import com.google.android.oq2;
import com.google.android.ox3;
import com.google.android.p58;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.qjd;
import com.google.android.r6c;
import com.google.android.rw0;
import com.google.android.sl1;
import com.google.android.ta2;
import com.google.inputmethod.am8;
import com.google.inputmethod.e58;
import com.google.inputmethod.e89;
import com.google.inputmethod.ez;
import com.google.inputmethod.fob;
import com.google.inputmethod.j24;
import com.google.inputmethod.k4b;
import com.google.inputmethod.k58;
import com.google.inputmethod.kq1;
import com.google.inputmethod.ks1;
import com.google.inputmethod.l4b;
import com.google.inputmethod.m4b;
import com.google.inputmethod.nh8;
import com.google.inputmethod.o41;
import com.google.inputmethod.pm8;
import com.google.inputmethod.pr1;
import com.google.inputmethod.pxb;
import com.google.inputmethod.q08;
import com.google.inputmethod.q38;
import com.google.inputmethod.r08;
import com.google.inputmethod.r58;
import com.google.inputmethod.rr1;
import com.google.inputmethod.uyd;
import com.google.inputmethod.x22;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.enums.a;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.e;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.s;
import kotlinx.coroutines.u;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 ß\u00012\u00020\u0001:\u0005à\u0001fRLB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b&\u0010'J:\u0010.\u001a\u00020\u00072(\u0010-\u001a$\b\u0001\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070+\u0012\u0006\u0012\u0004\u0018\u00010,0(H\u0082@¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u0010!J)\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J3\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001a2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000101H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010\u000bJ#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070:2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010<J3\u0010=\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070:2\u0006\u0010\u001f\u001a\u00020\u00152\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000101H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bC\u0010'J\r\u0010D\u001a\u00020\u0007¢\u0006\u0004\bD\u0010\u000bJ\u0010\u0010E\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bE\u0010'J\u001d\u0010I\u001a\u00020H2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0016¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00152\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0011¢\u0006\u0004\bL\u0010MJ3\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010O\u001a\u00020N2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0011¢\u0006\u0004\bR\u0010SJ3\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010O\u001a\u00020N2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0010¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020QH\u0010¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010\u000bJ\r\u0010[\u001a\u00020\u0007¢\u0006\u0004\b[\u0010\u000bJ\u001d\u0010_\u001a\u00020\u00072\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0010¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0010¢\u0006\u0004\ba\u0010!J\u0017\u0010b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0010¢\u0006\u0004\bb\u0010!J\u0017\u0010d\u001a\u00020\u00072\u0006\u0010c\u001a\u000205H\u0010¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010c\u001a\u000205H\u0010¢\u0006\u0004\bf\u0010eJ+\u0010k\u001a\u00020\u00072\u0006\u0010c\u001a\u0002052\u0006\u0010h\u001a\u00020g2\n\u0010j\u001a\u0006\u0012\u0002\b\u00030iH\u0010¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0010¢\u0006\u0004\bm\u0010!J\u0019\u0010n\u001a\u0004\u0018\u00010g2\u0006\u0010c\u001a\u000205H\u0010¢\u0006\u0004\bn\u0010oR$\u0010u\u001a\u00020p2\u0006\u0010q\u001a\u00020p8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010zR\u0018\u0010\u007f\u001a\u00060,j\u0002`|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0080\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u001f\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020,018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0087\u0001R\u001e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u0002050\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0087\u0001R-\u0010\u009a\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010,0\u0097\u0001\u0012\u0004\u0012\u0002050\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009d\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u009c\u0001R#\u0010\u009f\u0001\u001a\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020g0\u009e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0099\u0001R#\u0010 \u0001\u001a\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050\u0096\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0099\u0001R!\u0010¡\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010\u0087\u0001R \u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u008c\u0001R \u0010¤\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010£\u0001R\u001a\u0010¨\u0001\u001a\u00030¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010ª\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010©\u0001R\"\u0010®\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¬\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u00ad\u0001R\u0018\u0010¯\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010©\u0001R\u001f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010\u00ad\u0001R&\u0010¶\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020Q\u0018\u0001010³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0017\u0010¹\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010¸\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b\u0092\u0001\u0010¼\u0001R*\u0010Â\u0001\u001a\f\u0012\u0005\u0012\u00030¾\u0001\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b¿\u0001\u0010À\u0001\u0012\u0005\bÁ\u0001\u0010\u000bR\u001c\u0010Æ\u0001\u001a\u00070Ã\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010È\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\u000eR\u0016\u0010Ê\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010\u000eR\u0016\u0010Ì\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\u000eR\u0016\u0010Î\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010\u000eR\u0016\u0010Ð\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\u000eR\u0016\u0010Ò\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010\u000eR\u001c\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010Ó\u00018F¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001b\u0010Ø\u0001\u001a\u00070pj\u0003`×\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010tR\u0015\u0010Ù\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010Ú\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000eR\u0016\u0010Û\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u000eR\u0016\u0010Ü\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u000eR\u0019\u0010\u001f\u001a\u0005\u0018\u00010Ý\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010Þ\u0001¨\u0006á\u0001"}, d2 = {"Landroidx/compose/runtime/Recomposer;", "Landroidx/compose/runtime/f;", "Lkotlin/coroutines/CoroutineContext;", "effectCoroutineContext", "<init>", "(Lkotlin/coroutines/CoroutineContext;)V", "Lcom/google/android/g41;", "", "p0", "()Lcom/google/android/g41;", "F0", "()V", "", "R0", "()Z", "Lkotlinx/coroutines/s;", "callingJob", "U0", "(Lkotlinx/coroutines/s;)V", "", "e", "Lcom/google/android/x22;", "failedInitialComposition", "recoverable", "M0", "(Ljava/lang/Throwable;Lcom/google/android/x22;Z)V", "", "C0", "()Ljava/util/List;", "D0", "n0", "composition", "V0", "(Lcom/google/android/x22;)V", "i0", "T0", "Y0", "S0", "k0", "(Lcom/google/android/q22;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lcom/google/android/ta2;", "Landroidx/compose/runtime/v;", "Lcom/google/android/q22;", "", "block", "Q0", "(Lcom/google/android/ps4;Lcom/google/android/q22;)Ljava/lang/Object;", "H0", "Landroidx/collection/d;", "modifiedValues", "K0", "(Lcom/google/android/x22;Landroidx/collection/d;)Lcom/google/android/x22;", "Lcom/google/android/r08;", "references", "J0", "(Ljava/util/List;Landroidx/collection/d;)Ljava/util/List;", "q0", "Lkotlin/Function1;", "O0", "(Lcom/google/android/x22;)Lkotlin/jvm/functions/Function1;", "Z0", "(Lcom/google/android/x22;Landroidx/collection/d;)Lkotlin/jvm/functions/Function1;", "Landroidx/compose/runtime/snapshots/b;", "snapshot", "j0", "(Landroidx/compose/runtime/snapshots/b;)V", "X0", "m0", "B0", "Lkotlin/Function0;", "action", "Lcom/google/android/o41;", "w", "(Lkotlin/jvm/functions/Function0;)Lcom/google/android/o41;", "content", "a", "(Lcom/google/android/x22;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/fob;", "shouldPause", "Landroidx/collection/ScatterSet;", "Landroidx/compose/runtime/b0;", "b", "(Lcom/google/android/x22;Lcom/google/android/fob;Lkotlin/jvm/functions/Function2;)Landroidx/collection/ScatterSet;", "invalidScopes", "r", "(Lcom/google/android/x22;Lcom/google/android/fob;Landroidx/collection/ScatterSet;)Landroidx/collection/ScatterSet;", "scope", "u", "(Landroidx/compose/runtime/b0;)V", "G0", "W0", "", "Lcom/google/android/rr1;", "table", "s", "(Ljava/util/Set;)V", "z", "o", "reference", "n", "(Lcom/google/android/r08;)V", "c", "Lcom/google/android/q08;", "data", "Lcom/google/android/ez;", "applier", "p", "(Lcom/google/android/r08;Lcom/google/android/q08;Lcom/google/android/ez;)V", "v", "q", "(Lcom/google/android/r08;)Lcom/google/android/q08;", "", "value", "J", "t0", "()J", "changeCount", "Landroidx/compose/runtime/b;", "Landroidx/compose/runtime/b;", "broadcastFrameClock", "Lcom/google/android/nh8;", "Lcom/google/android/nh8;", "nextFrameEndCallbackQueue", "Landroidx/compose/runtime/platform/SynchronizedObject;", "d", "Ljava/lang/Object;", "stateLock", "Lkotlinx/coroutines/s;", "runnerJob", "f", "Ljava/lang/Throwable;", "closeCause", "", "g", "Ljava/util/List;", "_knownCompositions", "h", "_knownCompositionsCache", "i", "Landroidx/collection/d;", "snapshotInvalidations", "Lcom/google/android/r58;", "j", "Lcom/google/android/r58;", "compositionInvalidations", "k", "compositionsAwaitingApply", "l", "movableContentAwaitingInsert", "Lcom/google/android/q38;", "Lcom/google/android/n08;", "m", "Lcom/google/android/k58;", "movableContentRemoved", "Landroidx/compose/runtime/y;", "Landroidx/compose/runtime/y;", "movableContentNestedStatesAvailable", "Lcom/google/android/k58;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Lcom/google/android/g41;", "workContinuation", "", "t", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "Lcom/google/android/p58;", "Landroidx/compose/runtime/Recomposer$b;", "Lcom/google/android/p58;", "errorState", "frameClockPaused", "Landroidx/compose/runtime/Recomposer$State;", "x", "_state", "Lcom/google/android/pxb;", "y", "Lcom/google/android/pxb;", "pausedScopes", "Lcom/google/android/sl1;", "Lcom/google/android/sl1;", "effectJob", "A", "Lkotlin/coroutines/CoroutineContext;", "()Lkotlin/coroutines/CoroutineContext;", "Lcom/google/android/e58;", "Lcom/google/android/ks1;", "B", "Lcom/google/android/e58;", "getRegistrationObservers$annotations", "registrationObservers", "Landroidx/compose/runtime/Recomposer$c;", "C", "Landroidx/compose/runtime/Recomposer$c;", "recomposerInfo", "w0", "hasBroadcastFrameClockAwaitersLocked", "y0", "hasNextFrameEndAwaitersLocked", "v0", "hasBroadcastFrameClockAwaiters", "A0", "shouldKeepRecomposing", "z0", "hasSchedulingWork", "x0", "hasFrameWorkLocked", "Lcom/google/android/r6c;", "u0", "()Lcom/google/android/r6c;", "currentState", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "collectingCallByInformation", "collectingParameterInformation", "collectingSourceInformation", "stackTraceEnabled", "Lcom/google/android/pr1;", "()Lcom/google/android/pr1;", "D", "State", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Recomposer extends f {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int E = 8;
    private static final p58<e89<c>> F = p.a(j24.c());
    private static final AtomicReference<Boolean> G = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final CoroutineContext effectCoroutineContext;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private e58<ks1> registrationObservers;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final c recomposerInfo;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private long changeCount;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final androidx.compose.p004runtime.b broadcastFrameClock;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final nh8 nextFrameEndCallbackQueue;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Object stateLock;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private s runnerJob;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private Throwable closeCause;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<x22> _knownCompositions;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private List<? extends x22> _knownCompositionsCache;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private d<Object> snapshotInvalidations;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final r58<x22> compositionInvalidations;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final List<x22> compositionsAwaitingApply;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final List<r08> movableContentAwaitingInsert;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final k58<Object, Object> movableContentRemoved;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final y movableContentNestedStatesAvailable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final k58<r08, q08> movableContentStatesAvailable;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final k58<Object, Object> movableContentNestedExtractionsPending;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private List<x22> failedCompositions;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private d<x22> compositionsRemoved;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private g41<? super Unit> workContinuation;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private p58<b> errorState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private boolean frameClockPaused;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final p58<State> _state;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final pxb<d<b0>> pausedScopes;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final sl1 effectJob;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/Recomposer$State;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum State {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;

        private static final /* synthetic */ EnumEntries h = a.a(a());
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.Recomposer$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR$\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/runtime/Recomposer$a;", "", "<init>", "()V", "Landroidx/compose/runtime/Recomposer$c;", "Landroidx/compose/runtime/Recomposer;", "info", "", "c", "(Landroidx/compose/runtime/Recomposer$c;)V", "d", "Lcom/google/android/p58;", "Lcom/google/android/e89;", "_runningRecomposers", "Lcom/google/android/p58;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c info) {
            e89 e89Var;
            e89 e89VarAdd;
            do {
                e89Var = (e89) Recomposer.F.getValue();
                e89VarAdd = e89Var.add(info);
                if (e89Var == e89VarAdd) {
                    return;
                }
            } while (!Recomposer.F.c(e89Var, e89VarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c info) {
            e89 e89Var;
            e89 e89VarRemove;
            do {
                e89Var = (e89) Recomposer.F.getValue();
                e89VarRemove = e89Var.remove(info);
                if (e89Var == e89VarRemove) {
                    return;
                }
            } while (!Recomposer.F.c(e89Var, e89VarRemove));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/runtime/Recomposer$b;", "", "", "cause", "", "isRecoverable", "<init>", "(Ljava/lang/Throwable;Z)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "b", "Z", "()Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final Throwable cause;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final boolean isRecoverable;

        public b(Throwable th, boolean z) {
            this.cause = th;
            this.isRecoverable = z;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public Throwable getCause() {
            return this.cause;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/Recomposer$c;", "", "<init>", "(Landroidx/compose/runtime/Recomposer;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class c {
        public c() {
        }
    }

    public Recomposer(CoroutineContext coroutineContext) {
        androidx.compose.p004runtime.b bVar = new androidx.compose.p004runtime.b(new Function0() { // from class: com.google.android.vaa
            public final Object invoke() {
                return Recomposer.l0(this.a);
            }
        });
        this.broadcastFrameClock = bVar;
        this.nextFrameEndCallbackQueue = new nh8(new Function0() { // from class: com.google.android.waa
            public final Object invoke() {
                return Recomposer.E0(this.a);
            }
        });
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new d<>(0, 1, null);
        this.compositionInvalidations = new r58<>(new x22[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = q38.e(null, 1, null);
        this.movableContentNestedStatesAvailable = new y();
        this.movableContentStatesAvailable = k4b.c();
        this.movableContentNestedExtractionsPending = q38.e(null, 1, null);
        this.errorState = p.a((Object) null);
        this._state = p.a(State.Inactive);
        this.pausedScopes = new pxb<>();
        sl1 sl1VarA = u.a(coroutineContext.get(s.u2));
        sl1VarA.A(new Function1() { // from class: com.google.android.xaa
            public final Object invoke(Object obj) {
                return Recomposer.r0(this.a, (Throwable) obj);
            }
        });
        this.effectJob = sl1VarA;
        this.effectCoroutineContext = coroutineContext.plus(bVar).plus(sl1VarA);
        this.recomposerInfo = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.isClosed;
        }
        if (!z) {
            return true;
        }
        Iterator it = this.effectJob.h().iterator();
        while (it.hasNext()) {
            if (((s) it.next()).b()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<x22> C0() {
        List<x22> listD0;
        synchronized (this.stateLock) {
            listD0 = D0();
        }
        return listD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<x22> D0() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<x22> list2 = this._knownCompositions;
        List<x22> listP = list2.isEmpty() ? m.p() : new ArrayList(list2);
        this._knownCompositionsCache = listP;
        return listP;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(Recomposer recomposer) {
        recomposer.F0();
        return Unit.a;
    }

    private final void F0() {
        g41<Unit> g41VarP0;
        synchronized (this.stateLock) {
            g41VarP0 = p0();
            if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                throw nx3.a("Recomposer shutdown; frame clock awaiter will never resume", this.closeCause);
            }
        }
        if (g41VarP0 != null) {
            Result.a aVar = Result.a;
            g41VarP0.resumeWith(Result.b(Unit.a));
        }
    }

    private final void H0(x22 composition) {
        synchronized (this.stateLock) {
            List<r08> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (Intrinsics.e(list.get(i).getComposition(), composition)) {
                    Unit unit = Unit.a;
                    ArrayList arrayList = new ArrayList();
                    I0(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        J0(arrayList, null);
                        I0(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void I0(List<r08> list, Recomposer recomposer, x22 x22Var) {
        list.clear();
        synchronized (recomposer.stateLock) {
            try {
                Iterator<r08> it = recomposer.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    r08 next = it.next();
                    if (Intrinsics.e(next.getComposition(), x22Var)) {
                        list.add(next);
                        it.remove();
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<x22> J0(List<r08> references, d<Object> modifiedValues) {
        ArrayList arrayList;
        z zVarE;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i = 0; i < size; i++) {
            r08 r08Var = references.get(i);
            x22 composition = r08Var.getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(r08Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            x22 x22Var = (x22) entry.getKey();
            List list = (List) entry.getValue();
            if (x22Var.q()) {
                e.b("Check failed");
            }
            androidx.compose.p004runtime.snapshots.b bVarN = g.INSTANCE.n(O0(x22Var), Z0(x22Var, modifiedValues));
            try {
                g gVarL = bVarN.l();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            for (int i2 = 0; i2 < size2; i2++) {
                                r08 r08Var2 = (r08) list.get(i2);
                                Object objM = q38.m(this.movableContentRemoved, r08Var2.c());
                                r08 r08Var3 = (r08) objM;
                                if (r08Var3 != null) {
                                    this.movableContentNestedStatesAvailable.f(r08Var3);
                                }
                                arrayList.add(qjd.a(r08Var2, objM));
                            }
                            int size3 = arrayList.size();
                            for (int i3 = 0; i3 < size3; i3++) {
                                Pair<r08, r08> pair = arrayList.get(i3);
                                if (pair.d() == null && this.movableContentNestedStatesAvailable.d(((r08) pair.c()).c())) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size4 = arrayList.size();
                                    for (int i4 = 0; i4 < size4; i4++) {
                                        Pair<r08, r08> pairA = arrayList.get(i4);
                                        if (pairA.d() == null && (zVarE = this.movableContentNestedStatesAvailable.e(((r08) pairA.c()).c())) != null) {
                                            r08 content = zVarE.getContent();
                                            q38.a(this.movableContentNestedExtractionsPending, zVarE.getContainer(), content);
                                            pairA = qjd.a(pairA.c(), content);
                                        }
                                        arrayList3.add(pairA);
                                    }
                                    arrayList = arrayList3;
                                    break;
                                }
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i5 = 0; i5 < size5; i5++) {
                        if (arrayList.get(i5).d() != null) {
                            int size6 = arrayList.size();
                            for (int i6 = 0; i6 < size6; i6++) {
                                if (arrayList.get(i6).d() == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i7 = 0; i7 < size7; i7++) {
                                        Pair<r08, r08> pair2 = arrayList.get(i7);
                                        r08 r08Var4 = pair2.d() == null ? (r08) pair2.c() : null;
                                        if (r08Var4 != null) {
                                            arrayList4.add(r08Var4);
                                        }
                                    }
                                    synchronized (this.stateLock) {
                                        m.G(this.movableContentAwaitingInsert, arrayList4);
                                        Unit unit = Unit.a;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i8 = 0; i8 < size8; i8++) {
                                        Pair<r08, r08> pair3 = arrayList.get(i8);
                                        if (pair3.d() != null) {
                                            arrayList5.add(pair3);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    x22Var.k(arrayList);
                    Unit unit2 = Unit.a;
                    bVarN.s(gVarL);
                    j0(bVarN);
                } catch (Throwable th2) {
                    bVarN.s(gVarL);
                    throw th2;
                }
            } catch (Throwable th3) {
                j0(bVarN);
                throw th3;
            }
        }
        return m.y1(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x22 K0(final x22 composition, final d<Object> modifiedValues) {
        d<x22> dVar;
        if (composition.q() || composition.isDisposed() || ((dVar = this.compositionsRemoved) != null && dVar.a(composition))) {
            return null;
        }
        androidx.compose.p004runtime.snapshots.b bVarN = g.INSTANCE.n(O0(composition), Z0(composition, modifiedValues));
        try {
            g gVarL = bVarN.l();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.e()) {
                        composition.n(new Function0() { // from class: com.google.android.aba
                            public final Object invoke() {
                                return Recomposer.L0(modifiedValues, composition);
                            }
                        });
                    }
                } catch (Throwable th) {
                    bVarN.s(gVarL);
                    throw th;
                }
            }
            boolean zL = composition.l();
            bVarN.s(gVarL);
            j0(bVarN);
            if (zL) {
                return composition;
            }
            return null;
        } catch (Throwable th2) {
            j0(bVarN);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[LOOP:0: B:5:0x000b->B:15:0x0040, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[EDGE_INSN: B:19:0x0043->B:16:0x0043 BREAK  A[LOOP:0: B:5:0x000b->B:15:0x0040], SYNTHETIC] */
    public static final Unit L0(d dVar, x22 x22Var) {
        Object[] objArr = dVar.elements;
        long[] jArr = dVar.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j = jArr[i];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i != length) {
                        break;
                        break;
                    }
                    i++;
                } else {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    for (int i3 = 0; i3 < i2; i3++) {
                        if ((255 & j) < 128) {
                            x22Var.s(objArr[(i << 3) + i3]);
                        }
                        j >>= 8;
                    }
                    if (i2 != 8) {
                        break;
                    }
                    if (i != length) {
                        break;
                    }
                    i++;
                }
            }
        }
        return Unit.a;
    }

    private final void M0(Throwable e, x22 failedInitialComposition, boolean recoverable) throws Throwable {
        if (!G.get().booleanValue() || (e instanceof ComposeRuntimeError)) {
            synchronized (this.stateLock) {
                uyd.a("Error was captured in composition.", e);
                b bVar = (b) this.errorState.getValue();
                if (bVar != null) {
                    throw bVar.getCause();
                }
                this.errorState.setValue(new b(e, false));
                Unit unit = Unit.a;
            }
            throw e;
        }
        synchronized (this.stateLock) {
            try {
                uyd.a("Error was captured in composition while live edit was enabled.", e);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.j();
                this.snapshotInvalidations = new d<>(0, 1, null);
                this.movableContentAwaitingInsert.clear();
                q38.c(this.movableContentRemoved);
                this.movableContentStatesAvailable.k();
                this.errorState.setValue(new b(e, recoverable));
                if (failedInitialComposition != null) {
                    S0(failedInitialComposition);
                }
                if (p0() != null) {
                    e.b("expected to go to inactive state due to composition error");
                }
                Unit unit2 = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void N0(Recomposer recomposer, Throwable th, x22 x22Var, boolean z, int i, Object obj) throws Throwable {
        if ((i & 2) != 0) {
            x22Var = null;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        recomposer.M0(th, x22Var, z);
    }

    private final Function1<Object, Unit> O0(final x22 composition) {
        return new Function1() { // from class: com.google.android.uaa
            public final Object invoke(Object obj) {
                return Recomposer.P0(composition, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P0(x22 x22Var, Object obj) {
        x22Var.a(obj);
        return Unit.a;
    }

    private final Object Q0(ps4<? super ta2, ? super v, ? super q22<? super Unit>, ? extends Object> ps4Var, q22<? super Unit> q22Var) {
        Object objG = rw0.g(this.broadcastFrameClock, new ta2(this, ps4Var, w.a(q22Var.getContext()), null), q22Var);
        return objG == kotlin.coroutines.intrinsics.a.g() ? objG : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R0() {
        boolean zX0;
        m.p();
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.d()) {
                return x0();
            }
            List<x22> listD0 = D0();
            Set<? extends Object> setA = m4b.a(this.snapshotInvalidations);
            this.snapshotInvalidations = new d<>(0, 1, null);
            try {
                int size = listD0.size();
                for (int i = 0; i < size; i++) {
                    listD0.get(i).o(setA);
                    if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    if (p0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zX0 = x0();
                }
                return zX0;
            } catch (Throwable th) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.j(setA);
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(x22 composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        V0(composition);
    }

    private final void T0(x22 composition) {
        e58<ks1> e58Var = this.registrationObservers;
        if (e58Var != null) {
            Object[] objArr = e58Var.content;
            int i = e58Var._size;
            for (int i2 = 0; i2 < i; i2++) {
                ks1 ks1Var = (ks1) objArr[i2];
                if (composition instanceof pm8) {
                    ks1Var.b((pm8) composition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(s callingJob) {
        synchronized (this.stateLock) {
            try {
                Throwable th = this.closeCause;
                if (th != null) {
                    throw th;
                }
                if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (this.runnerJob != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                this.runnerJob = callingJob;
                if (p0() != null) {
                    e.b("called outside of runRecomposeAndApplyChanges");
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final void V0(x22 composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            Y0(composition);
        }
    }

    private final void Y0(x22 composition) {
        e58<ks1> e58Var = this.registrationObservers;
        if (e58Var != null) {
            Object[] objArr = e58Var.content;
            int i = e58Var._size;
            for (int i2 = 0; i2 < i; i2++) {
                ks1 ks1Var = (ks1) objArr[i2];
                if (composition instanceof pm8) {
                    ks1Var.a((pm8) composition);
                }
            }
        }
    }

    private final Function1<Object, Unit> Z0(final x22 composition, final d<Object> modifiedValues) {
        return new Function1() { // from class: com.google.android.yaa
            public final Object invoke(Object obj) {
                return Recomposer.a1(composition, modifiedValues, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a1(x22 x22Var, d dVar, Object obj) {
        x22Var.s(obj);
        if (dVar != null) {
            dVar.h(obj);
        }
        return Unit.a;
    }

    private final void i0(x22 composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    private final void j0(androidx.compose.p004runtime.snapshots.b snapshot) {
        try {
            if (snapshot.C() instanceof h.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            snapshot.d();
        } catch (Throwable th) {
            snapshot.d();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k0(q22<? super Unit> q22Var) {
        q22 q22Var2;
        if (z0()) {
            return Unit.a;
        }
        q22 eVar = new e(kotlin.coroutines.intrinsics.a.d(q22Var), 1);
        eVar.G();
        synchronized (this.stateLock) {
            if (z0()) {
                q22Var2 = eVar;
            } else {
                this.workContinuation = eVar;
                q22Var2 = null;
            }
        }
        if (q22Var2 != null) {
            Result.a aVar = Result.a;
            q22Var2.resumeWith(Result.b(Unit.a));
        }
        Object objY = eVar.y();
        if (objY == kotlin.coroutines.intrinsics.a.g()) {
            oq2.c(q22Var);
        }
        return objY == kotlin.coroutines.intrinsics.a.g() ? objY : Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(Recomposer recomposer) {
        recomposer.F0();
        return Unit.a;
    }

    private final void n0() {
        List<x22> listD0 = D0();
        int size = listD0.size();
        for (int i = 0; i < size; i++) {
            Y0(listD0.get(i));
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = m.p();
    }

    private static final void o0(Recomposer recomposer, r08 r08Var, r08 r08Var2) {
        List<r08> listF = r08Var2.f();
        if (listF != null) {
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                r08 r08Var3 = listF.get(i);
                recomposer.movableContentNestedStatesAvailable.b(r08Var3.c(), new z(r08Var3, r08Var));
                o0(recomposer, r08Var, r08Var3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g41<Unit> p0() {
        State state;
        if (((State) this._state.getValue()).compareTo(State.ShuttingDown) <= 0) {
            n0();
            this.snapshotInvalidations = new d<>(0, 1, null);
            this.compositionInvalidations.j();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            g41<? super Unit> g41Var = this.workContinuation;
            if (g41Var != null) {
                g41.a.a(g41Var, (Throwable) null, 1, (Object) null);
            }
            this.workContinuation = null;
            this.errorState.setValue((Object) null);
            return null;
        }
        if (this.errorState.getValue() != null) {
            state = State.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new d<>(0, 1, null);
            this.compositionInvalidations.j();
            state = (w0() || y0()) ? State.InactivePendingWork : State.Inactive;
        } else {
            state = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.e() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !w0() && !y0() && !q38.k(this.movableContentRemoved)) ? State.Idle : State.PendingWork;
        }
        this._state.setValue(state);
        if (state != State.PendingWork) {
            return null;
        }
        g41<? super Unit> g41Var2 = this.workContinuation;
        this.workContinuation = null;
        return g41Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        int i;
        ObjectList objectListF;
        synchronized (this.stateLock) {
            try {
                if (q38.k(this.movableContentRemoved)) {
                    ObjectList objectListQ = q38.q(this.movableContentRemoved);
                    q38.c(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.c();
                    q38.c(this.movableContentNestedExtractionsPending);
                    e58 e58Var = new e58(objectListQ.get_size());
                    Object[] objArr = objectListQ.content;
                    int i2 = objectListQ._size;
                    for (int i3 = 0; i3 < i2; i3++) {
                        r08 r08Var = (r08) objArr[i3];
                        e58Var.n(qjd.a(r08Var, this.movableContentStatesAvailable.e(r08Var)));
                    }
                    this.movableContentStatesAvailable.k();
                    objectListF = e58Var;
                } else {
                    objectListF = am8.f();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object[] objArr2 = objectListF.content;
        int i4 = objectListF._size;
        for (i = 0; i < i4; i++) {
            Pair pair = (Pair) objArr2[i];
            r08 r08Var2 = (r08) pair.a();
            q08 q08Var = (q08) pair.b();
            if (q08Var != null) {
                r08Var2.getComposition().r(q08Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(final Recomposer recomposer, final Throwable th) {
        g41<? super Unit> g41Var;
        g41<? super Unit> g41Var2;
        CancellationException cancellationExceptionA = nx3.a("Recomposer effect job completed", th);
        synchronized (recomposer.stateLock) {
            try {
                s sVar = recomposer.runnerJob;
                g41Var = null;
                if (sVar != null) {
                    recomposer._state.setValue(State.ShuttingDown);
                    if (recomposer.isClosed) {
                        g41Var2 = recomposer.workContinuation;
                        if (g41Var2 != null) {
                        }
                        recomposer.workContinuation = null;
                        sVar.A(new Function1() { // from class: com.google.android.zaa
                            public final Object invoke(Object obj) {
                                return Recomposer.s0(this.a, th, (Throwable) obj);
                            }
                        });
                        g41Var = g41Var2;
                    } else {
                        sVar.k(cancellationExceptionA);
                    }
                    g41Var2 = null;
                    recomposer.workContinuation = null;
                    sVar.A(new Function1() { // from class: com.google.android.zaa
                        public final Object invoke(Object obj) {
                            return Recomposer.s0(this.a, th, (Throwable) obj);
                        }
                    });
                    g41Var = g41Var2;
                } else {
                    recomposer.closeCause = cancellationExceptionA;
                    recomposer._state.setValue(State.ShutDown);
                    Unit unit = Unit.a;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (g41Var != null) {
            Result.a aVar = Result.a;
            g41Var.resumeWith(Result.b(Unit.a));
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(Recomposer recomposer, Throwable th, Throwable th2) {
        synchronized (recomposer.stateLock) {
            if (th == null) {
                th = null;
            } else if (th2 != null) {
                try {
                    if (th2 instanceof CancellationException) {
                        th2 = null;
                    }
                    if (th2 != null) {
                        ox3.a(th, th2);
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            recomposer.closeCause = th;
            recomposer._state.setValue(State.ShutDown);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v0() {
        boolean zW0;
        synchronized (this.stateLock) {
            zW0 = w0();
        }
        return zW0;
    }

    private final boolean w0() {
        return !this.frameClockPaused && this.broadcastFrameClock.f();
    }

    private final boolean x0() {
        return this.compositionInvalidations.getSize() != 0 || w0() || y0() || q38.k(this.movableContentRemoved);
    }

    private final boolean y0() {
        return !this.frameClockPaused && this.nextFrameEndCallbackQueue.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z0() {
        boolean z;
        synchronized (this.stateLock) {
            z = this.snapshotInvalidations.e() || this.compositionInvalidations.getSize() != 0 || w0() || y0();
        }
        return z;
    }

    public final Object B0(q22<? super Unit> q22Var) {
        Object objG = kotlinx.coroutines.flow.d.G(u0(), new Recomposer$join$2(null), q22Var);
        return objG == kotlin.coroutines.intrinsics.a.g() ? objG : Unit.a;
    }

    public final void G0() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            Unit unit = Unit.a;
        }
    }

    public final void W0() {
        g41<Unit> g41VarP0;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                g41VarP0 = p0();
            } else {
                g41VarP0 = null;
            }
        }
        if (g41VarP0 != null) {
            Result.a aVar = Result.a;
            g41VarP0.resumeWith(Result.b(Unit.a));
        }
    }

    public final Object X0(q22<? super Unit> q22Var) {
        Object objQ0 = Q0(new C0211Recomposer$runRecomposeAndApplyChanges$2(this, null), q22Var);
        return objQ0 == kotlin.coroutines.intrinsics.a.g() ? objQ0 : Unit.a;
    }

    @Override // androidx.compose.p004runtime.f
    public void a(x22 composition, Function2<? super d, ? super Integer, Unit> content) throws Throwable {
        Throwable th;
        boolean z;
        Throwable th2;
        boolean zQ = composition.q();
        synchronized (this.stateLock) {
            try {
                State state = (State) this._state.getValue();
                State state2 = State.ShuttingDown;
                if (state.compareTo(state2) > 0) {
                    try {
                        boolean zContains = D0().contains(composition);
                        z = !zContains;
                        if (!zContains) {
                            T0(composition);
                        }
                    } catch (Throwable th3) {
                        th = th3;
                        throw th;
                    }
                } else {
                    z = true;
                }
                try {
                    g.Companion companion = g.INSTANCE;
                    androidx.compose.p004runtime.snapshots.b bVarN = companion.n(O0(composition), Z0(composition, null));
                    try {
                        g gVarL = bVarN.l();
                        try {
                            composition.i(content);
                            Unit unit = Unit.a;
                            bVarN.s(gVarL);
                            j0(bVarN);
                            synchronized (this.stateLock) {
                                try {
                                    if (((State) this._state.getValue()).compareTo(state2) > 0) {
                                        try {
                                            if (!D0().contains(composition)) {
                                                i0(composition);
                                            }
                                        } catch (Throwable th4) {
                                            th2 = th4;
                                            throw th2;
                                        }
                                    } else {
                                        Y0(composition);
                                    }
                                    if (!zQ) {
                                        companion.f();
                                    }
                                    try {
                                        H0(composition);
                                        try {
                                            composition.p();
                                            composition.j();
                                            if (zQ) {
                                                return;
                                            }
                                            companion.f();
                                        } catch (Throwable th5) {
                                            N0(this, th5, null, false, 6, null);
                                        }
                                    } catch (Throwable th6) {
                                        M0(th6, composition, true);
                                    }
                                } catch (Throwable th7) {
                                    th2 = th7;
                                }
                            }
                        } catch (Throwable th8) {
                            try {
                                bVarN.s(gVarL);
                                throw th8;
                            } catch (Throwable th9) {
                                th = th9;
                                Throwable th10 = th;
                                try {
                                    j0(bVarN);
                                    throw th10;
                                } catch (Throwable th11) {
                                    th = th11;
                                    Throwable th12 = th;
                                    if (z) {
                                        synchronized (this.stateLock) {
                                            Y0(composition);
                                            Unit unit2 = Unit.a;
                                        }
                                    }
                                    M0(th12, composition, true);
                                }
                            }
                        }
                    } catch (Throwable th13) {
                        th = th13;
                    }
                } catch (Throwable th14) {
                    th = th14;
                    this = this;
                }
            } catch (Throwable th15) {
                th = th15;
            }
        }
    }

    @Override // androidx.compose.p004runtime.f
    public ScatterSet<b0> b(x22 composition, fob shouldPause, Function2<? super d, ? super Integer, Unit> content) {
        try {
            fob fobVarU = composition.u(shouldPause);
            try {
                a(composition, content);
                ScatterSet<b0> scatterSetA = (d) this.pausedScopes.a();
                if (scatterSetA == null) {
                    scatterSetA = l4b.a();
                }
                composition.u(fobVarU);
                this.pausedScopes.b(null);
                return scatterSetA;
            } catch (Throwable th) {
                composition.u(fobVarU);
                throw th;
            }
        } catch (Throwable th2) {
            this.pausedScopes.b(null);
            throw th2;
        }
    }

    @Override // androidx.compose.p004runtime.f
    public void c(r08 reference) {
        g41<Unit> g41VarP0;
        synchronized (this.stateLock) {
            try {
                q38.a(this.movableContentRemoved, reference.c(), reference);
                if (reference.f() != null) {
                    o0(this, reference, reference);
                }
                g41VarP0 = p0();
            } catch (Throwable th) {
                throw th;
            }
        }
        if (g41VarP0 != null) {
            Result.a aVar = Result.a;
            g41VarP0.resumeWith(Result.b(Unit.a));
        }
    }

    @Override // androidx.compose.p004runtime.f
    public boolean e() {
        return G.get().booleanValue();
    }

    @Override // androidx.compose.p004runtime.f
    public boolean f() {
        return false;
    }

    @Override // androidx.compose.p004runtime.f
    public boolean g() {
        return kq1.d(e.e(), kq1.INSTANCE.b());
    }

    @Override // androidx.compose.p004runtime.f
    public long h() {
        return 1000;
    }

    @Override // androidx.compose.p004runtime.f
    public pr1 i() {
        return null;
    }

    @Override // androidx.compose.p004runtime.f
    /* JADX INFO: renamed from: k, reason: from getter */
    public CoroutineContext getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // androidx.compose.p004runtime.f
    public boolean m() {
        return !kq1.d(e.e(), kq1.INSTANCE.a());
    }

    public final void m0() {
        synchronized (this.stateLock) {
            try {
                if (((State) this._state.getValue()).compareTo(State.Idle) >= 0) {
                    this._state.setValue(State.ShuttingDown);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
        s.a.a(this.effectJob, (CancellationException) null, 1, (Object) null);
    }

    @Override // androidx.compose.p004runtime.f
    public void n(r08 reference) {
        g41<Unit> g41VarP0;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            g41VarP0 = p0();
        }
        if (g41VarP0 != null) {
            Result.a aVar = Result.a;
            g41VarP0.resumeWith(Result.b(Unit.a));
        }
    }

    @Override // androidx.compose.p004runtime.f
    public void o(x22 composition) {
        g41<Unit> g41VarP0;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.l(composition)) {
                g41VarP0 = null;
            } else {
                this.compositionInvalidations.c(composition);
                g41VarP0 = p0();
            }
        }
        if (g41VarP0 != null) {
            Result.a aVar = Result.a;
            g41VarP0.resumeWith(Result.b(Unit.a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[Catch: all -> 0x0067, LOOP:0: B:9:0x0031->B:21:0x0071, LOOP_END, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x0007, B:6:0x001a, B:9:0x0031, B:11:0x0041, B:13:0x004d, B:15:0x0056, B:18:0x0069, B:21:0x0071, B:22:0x0074), top: B:27:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[EDGE_INSN: B:30:0x0074->B:22:0x0074 BREAK  A[LOOP:0: B:9:0x0031->B:21:0x0071], SYNTHETIC] */
    @Override // androidx.compose.p004runtime.f
    public void p(r08 reference, q08 data, ez<?> applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.x(reference, data);
                ObjectList<r08> objectListH = q38.h(this.movableContentNestedExtractionsPending, reference);
                if (objectListH.h()) {
                    androidx.collection.e<r08, q08> eVarJ = data.getSlotStorage().j(applier, objectListH);
                    Object[] objArr = eVarJ.keys;
                    Object[] objArr2 = eVarJ.values;
                    long[] jArr = eVarJ.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i = 0;
                        while (true) {
                            long j = jArr[i];
                            if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i != length) {
                                    break;
                                    break;
                                }
                                i++;
                            } else {
                                int i2 = 8 - ((~(i - length)) >>> 31);
                                for (int i3 = 0; i3 < i2; i3++) {
                                    if ((255 & j) < 128) {
                                        int i4 = (i << 3) + i3;
                                        Object obj = objArr[i4];
                                        this.movableContentStatesAvailable.x((r08) obj, (q08) objArr2[i4]);
                                    }
                                    j >>= 8;
                                }
                                if (i2 != 8) {
                                    break;
                                } else if (i != length) {
                                    break;
                                } else {
                                    i++;
                                }
                            }
                        }
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.p004runtime.f
    public q08 q(r08 reference) {
        q08 q08VarU;
        synchronized (this.stateLock) {
            q08VarU = this.movableContentStatesAvailable.u(reference);
        }
        return q08VarU;
    }

    @Override // androidx.compose.p004runtime.f
    public ScatterSet<b0> r(x22 composition, fob shouldPause, ScatterSet<b0> invalidScopes) {
        try {
            R0();
            composition.o(m4b.a(invalidScopes));
            fob fobVarU = composition.u(shouldPause);
            try {
                x22 x22VarK0 = K0(composition, null);
                if (x22VarK0 != null) {
                    H0(composition);
                    x22VarK0.p();
                    x22VarK0.j();
                }
                ScatterSet<b0> scatterSetA = (d) this.pausedScopes.a();
                if (scatterSetA == null) {
                    scatterSetA = l4b.a();
                }
                composition.u(fobVarU);
                this.pausedScopes.b(null);
                return scatterSetA;
            } catch (Throwable th) {
                composition.u(fobVarU);
                throw th;
            }
        } catch (Throwable th2) {
            this.pausedScopes.b(null);
            throw th2;
        }
    }

    @Override // androidx.compose.p004runtime.f
    public void s(Set<rr1> table) {
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // androidx.compose.p004runtime.f
    public void u(b0 scope) {
        d<b0> dVarA = this.pausedScopes.a();
        if (dVarA == null) {
            dVarA = l4b.b();
            this.pausedScopes.b(dVarA);
        }
        dVarA.h(scope);
    }

    public final r6c<State> u0() {
        return this._state;
    }

    @Override // androidx.compose.p004runtime.f
    public void v(x22 composition) {
        synchronized (this.stateLock) {
            try {
                d<x22> dVarB = this.compositionsRemoved;
                if (dVarB == null) {
                    dVarB = l4b.b();
                    this.compositionsRemoved = dVarB;
                }
                dVarB.h(composition);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.p004runtime.f
    public o41 w(Function0<Unit> action) {
        return this.nextFrameEndCallbackQueue.g(action);
    }

    @Override // androidx.compose.p004runtime.f
    public void z(x22 composition) {
        synchronized (this.stateLock) {
            V0(composition);
            this.compositionInvalidations.s(composition);
            this.compositionsAwaitingApply.remove(composition);
            Unit unit = Unit.a;
        }
    }
}
