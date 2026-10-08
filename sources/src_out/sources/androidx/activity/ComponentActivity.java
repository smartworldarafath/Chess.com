package androidx.activity;

import android.app.PictureInPictureUiState;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.ComponentActivity;
import androidx.activity.result.IntentSenderRequest;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import androidx.lifecycle.i;
import androidx.lifecycle.k;
import androidx.lifecycle.s;
import androidx.lifecycle.w;
import androidx.lifecycle.x;
import com.google.android.b0b;
import com.google.android.e0b;
import com.google.android.gbe;
import com.google.android.ibe;
import com.google.android.kd8;
import com.google.android.ld8;
import com.google.android.r43;
import com.google.android.ubd;
import com.google.android.za3;
import com.google.android.zza;
import com.google.inputmethod.CreationExtras;
import com.google.inputmethod.a8;
import com.google.inputmethod.dbe;
import com.google.inputmethod.er8;
import com.google.inputmethod.fbe;
import com.google.inputmethod.fq7;
import com.google.inputmethod.gr8;
import com.google.inputmethod.hbe;
import com.google.inputmethod.i99;
import com.google.inputmethod.iq7;
import com.google.inputmethod.j48;
import com.google.inputmethod.j99;
import com.google.inputmethod.jbe;
import com.google.inputmethod.jq8;
import com.google.inputmethod.k9e;
import com.google.inputmethod.l9;
import com.google.inputmethod.lq8;
import com.google.inputmethod.m99;
import com.google.inputmethod.n17;
import com.google.inputmethod.o02;
import com.google.inputmethod.oq8;
import com.google.inputmethod.oy1;
import com.google.inputmethod.p9;
import com.google.inputmethod.qq8;
import com.google.inputmethod.r38;
import com.google.inputmethod.u9;
import com.google.inputmethod.u9e;
import com.google.inputmethod.uq7;
import com.google.inputmethod.w8;
import com.google.inputmethod.x8;
import com.google.inputmethod.xr8;
import com.google.inputmethod.y8;
import com.google.inputmethod.yr4;
import com.google.inputmethod.z8;
import com.google.inputmethod.zr4;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 ò\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\u00022\u00020\r2\u00020\u00022\u00020\u000e2\u00020\u000f:\bó\u0001ô\u0001õ\u0001ö\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001eH\u0015¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b&\u0010%J\u0019\u0010(\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J\u0019\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b(\u0010+J#\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b(\u0010.J#\u0010/\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0015H\u0017¢\u0006\u0004\b0\u0010\u0011J\u0011\u00102\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0015\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b6\u00107J\u0015\u00108\u001a\u00020\u00152\u0006\u00105\u001a\u000204¢\u0006\u0004\b8\u00107J)\u0010=\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010C\u001a\u00020<2\u0006\u00109\u001a\u00020\u00122\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00152\u0006\u00109\u001a\u00020\u00122\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010JJ\u001f\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u0003H\u0016¢\u0006\u0004\bI\u0010LJ'\u0010I\u001a\u00020\u00152\u0006\u0010H\u001a\u00020G2\u0006\u0010K\u001a\u00020\u00032\u0006\u0010N\u001a\u00020MH\u0017¢\u0006\u0004\bI\u0010OJ\u0017\u0010P\u001a\u00020\u00152\u0006\u0010H\u001a\u00020GH\u0016¢\u0006\u0004\bP\u0010JJ\u000f\u0010Q\u001a\u00020\u0015H\u0016¢\u0006\u0004\bQ\u0010\u0011J\u000f\u0010R\u001a\u00020\u0015H\u0017¢\u0006\u0004\bR\u0010\u0011J\u001f\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u0012H\u0017¢\u0006\u0004\bV\u0010WJ)\u0010V\u001a\u00020\u00152\u0006\u0010T\u001a\u00020S2\u0006\u0010U\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bV\u0010YJA\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u0012H\u0017¢\u0006\u0004\b_\u0010`JK\u0010_\u001a\u00020\u00152\u0006\u0010T\u001a\u00020Z2\u0006\u0010U\u001a\u00020\u00122\b\u0010[\u001a\u0004\u0018\u00010S2\u0006\u0010\\\u001a\u00020\u00122\u0006\u0010]\u001a\u00020\u00122\u0006\u0010^\u001a\u00020\u00122\b\u0010X\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\b_\u0010aJ)\u0010d\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\u0006\u0010b\u001a\u00020\u00122\b\u0010c\u001a\u0004\u0018\u00010SH\u0015¢\u0006\u0004\bd\u0010eJ-\u0010k\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00122\f\u0010h\u001a\b\u0012\u0004\u0012\u00020g0f2\u0006\u0010j\u001a\u00020iH\u0017¢\u0006\u0004\bk\u0010lJI\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\u0006\u0010r\u001a\u00020q2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010wJA\u0010v\u001a\b\u0012\u0004\u0012\u00028\u00000u\"\u0004\b\u0000\u0010m\"\u0004\b\u0001\u0010n2\u0012\u0010p\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010o2\f\u0010t\u001a\b\u0012\u0004\u0012\u00028\u00010s¢\u0006\u0004\bv\u0010xJ\u0017\u0010{\u001a\u00020\u00152\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0004\b{\u0010|J\u001b\u0010~\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0004\b~\u0010\u007fJ\u001d\u0010\u0080\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020y0}¢\u0006\u0005\b\u0080\u0001\u0010\u007fJ\u001a\u0010\u0082\u0001\u001a\u00020\u00152\u0007\u0010\u0081\u0001\u001a\u00020\u0012H\u0017¢\u0006\u0005\b\u0082\u0001\u0010\u0014J\u001d\u0010\u0083\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0083\u0001\u0010\u007fJ\u001d\u0010\u0084\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020\u00120}¢\u0006\u0005\b\u0084\u0001\u0010\u007fJ\u001a\u0010\u0085\u0001\u001a\u00020\u00152\u0006\u0010T\u001a\u00020SH\u0015¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u001d\u0010\u0087\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0087\u0001\u0010\u007fJ\u001d\u0010\u0088\u0001\u001a\u00020\u00152\f\u00105\u001a\b\u0012\u0004\u0012\u00020S0}¢\u0006\u0005\b\u0088\u0001\u0010\u007fJ\u001b\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J#\u0010\u008a\u0001\u001a\u00020\u00152\u0007\u0010\u0089\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u008a\u0001\u0010\u008c\u0001J\u001e\u0010\u008e\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008e\u0001\u0010\u007fJ\u001e\u0010\u008f\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u008d\u00010}¢\u0006\u0005\b\u008f\u0001\u0010\u007fJ\u001b\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<H\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008b\u0001J#\u0010\u0091\u0001\u001a\u00020\u00152\u0007\u0010\u0090\u0001\u001a\u00020<2\u0006\u0010z\u001a\u00020yH\u0017¢\u0006\u0006\b\u0091\u0001\u0010\u008c\u0001J\u001c\u0010\u0094\u0001\u001a\u00020\u00152\b\u0010\u0093\u0001\u001a\u00030\u0092\u0001H\u0017¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001e\u0010\u0097\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010}¢\u0006\u0005\b\u0097\u0001\u0010\u007fJ\u001e\u0010\u0098\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0096\u00010}¢\u0006\u0005\b\u0098\u0001\u0010\u007fJ\u001e\u0010\u009a\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010}¢\u0006\u0005\b\u009a\u0001\u0010\u007fJ\u001e\u0010\u009b\u0001\u001a\u00020\u00152\r\u00105\u001a\t\u0012\u0005\u0012\u00030\u0099\u00010}¢\u0006\u0005\b\u009b\u0001\u0010\u007fJ\u0019\u0010\u009d\u0001\u001a\u00020\u00152\u0007\u0010-\u001a\u00030\u009c\u0001¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J\u0019\u0010\u009f\u0001\u001a\u00020\u00152\u0007\u0010-\u001a\u00030\u009c\u0001¢\u0006\u0006\b\u009f\u0001\u0010\u009e\u0001J\u0011\u0010 \u0001\u001a\u00020\u0015H\u0015¢\u0006\u0005\b \u0001\u0010\u0011J\u0019\u0010¢\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030¡\u0001¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0019\u0010¤\u0001\u001a\u00020\u00152\u0007\u00105\u001a\u00030¡\u0001¢\u0006\u0006\b¤\u0001\u0010£\u0001J\u0011\u0010¥\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b¥\u0001\u0010\u0011R\u0018\u0010§\u0001\u001a\u00030¦\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R\u0018\u0010ª\u0001\u001a\u00030©\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0001\u0010«\u0001R\u001f\u0010\u00ad\u0001\u001a\u00030¬\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u00ad\u0001\u0010®\u0001\u0012\u0005\b¯\u0001\u0010\u0011R\u001c\u0010±\u0001\u001a\u0005\u0018\u00010°\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0017\u0010³\u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R!\u0010º\u0001\u001a\u00030µ\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¶\u0001\u0010·\u0001\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010mR\u0018\u0010¼\u0001\u001a\u00030»\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0001\u0010½\u0001R\u001c\u0010¾\u0001\u001a\u00020q8\u0006¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R$\u0010Ã\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020y0}0Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R$\u0010Å\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120}0Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÅ\u0001\u0010Ä\u0001R$\u0010Æ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020S0}0Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010Ä\u0001R%\u0010Ç\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u008d\u00010}0Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÇ\u0001\u0010Ä\u0001R%\u0010È\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0096\u00010}0Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÈ\u0001\u0010Ä\u0001R%\u0010É\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0099\u00010}0Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0001\u0010Ä\u0001R\u001f\u0010Ê\u0001\u001a\n\u0012\u0005\u0012\u00030¡\u00010Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÊ\u0001\u0010Ä\u0001R\u0019\u0010Ë\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010Ì\u0001R\u0019\u0010Í\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Ì\u0001R!\u0010Ò\u0001\u001a\u00030Î\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÏ\u0001\u0010·\u0001\u001a\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ó\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010Ì\u0001R!\u0010Ø\u0001\u001a\u00030Ô\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÕ\u0001\u0010·\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R \u0010Ü\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u0010\n\u0006\bÙ\u0001\u0010·\u0001\u001a\u0006\bÚ\u0001\u0010Û\u0001R\u0018\u0010Þ\u0001\u001a\u0004\u0018\u00010\u00028WX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÝ\u0001\u0010%R\u0018\u0010â\u0001\u001a\u00030ß\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bà\u0001\u0010á\u0001R\u0018\u0010å\u0001\u001a\u00030°\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bã\u0001\u0010ä\u0001R\u0018\u0010é\u0001\u001a\u00030æ\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bç\u0001\u0010è\u0001R\u0018\u0010í\u0001\u001a\u00030ê\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001R\u0015\u0010ñ\u0001\u001a\u00030î\u00018F¢\u0006\b\u001a\u0006\bï\u0001\u0010ð\u0001¨\u0006÷\u0001"}, d2 = {"Landroidx/activity/ComponentActivity;", "Landroidx/core/app/ComponentActivity;", "", "Lcom/google/android/n17;", "Lcom/google/android/u9e;", "Landroidx/lifecycle/e;", "Lcom/google/android/e0b;", "Lcom/google/android/lq8;", "Lcom/google/android/ld8;", "Lcom/google/android/u9;", "Lcom/google/android/y8;", "Lcom/google/android/oq8;", "Lcom/google/android/xr8;", "Lcom/google/android/er8;", "Lcom/google/android/fq7;", "Lcom/google/android/zr4;", "<init>", "()V", "", "contentLayoutId", "(I)V", "", "ensureViewModelStore", "Lcom/google/android/jq8;", "dispatcher", "addObserverForBackInvoker", "(Lcom/google/android/jq8;)V", "Landroidx/activity/ComponentActivity$d;", "createFullyDrawnExecutor", "()Landroidx/activity/ComponentActivity$d;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "onRetainCustomNonConfigurationInstance", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "initializeViewTreeOwners", "Landroid/content/Context;", "peekAvailableContext", "()Landroid/content/Context;", "Lcom/google/android/qq8;", "listener", "addOnContextAvailableListener", "(Lcom/google/android/qq8;)V", "removeOnContextAvailableListener", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Lcom/google/android/uq7;", "provider", "addMenuProvider", "(Lcom/google/android/uq7;)V", "owner", "(Lcom/google/android/uq7;Lcom/google/android/n17;)V", "Landroidx/lifecycle/Lifecycle$State;", "state", "(Lcom/google/android/uq7;Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$State;)V", "removeMenuProvider", "invalidateMenu", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "Lcom/google/android/z8;", "contract", "Lcom/google/android/p9;", "registry", "Lcom/google/android/x8;", "callback", "Lcom/google/android/l9;", "registerForActivityResult", "(Lcom/google/android/z8;Lcom/google/android/p9;Lcom/google/android/x8;)Lcom/google/android/l9;", "(Lcom/google/android/z8;Lcom/google/android/x8;)Lcom/google/android/l9;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Lcom/google/android/oy1;", "addOnConfigurationChangedListener", "(Lcom/google/android/oy1;)V", "removeOnConfigurationChangedListener", "level", "onTrimMemory", "addOnTrimMemoryListener", "removeOnTrimMemoryListener", "onNewIntent", "(Landroid/content/Intent;)V", "addOnNewIntentListener", "removeOnNewIntentListener", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Lcom/google/android/r38;", "addOnMultiWindowModeChangedListener", "removeOnMultiWindowModeChangedListener", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Landroid/app/PictureInPictureUiState;", "pipState", "onPictureInPictureUiStateChanged", "(Landroid/app/PictureInPictureUiState;)V", "Lcom/google/android/i99;", "addOnPictureInPictureModeChangedListener", "removeOnPictureInPictureModeChangedListener", "Lcom/google/android/m99;", "addOnPictureInPictureUiStateChangedListener", "removeOnPictureInPictureUiStateChangedListener", "Lcom/google/android/j99;", "enterPictureInPictureMode", "(Lcom/google/android/j99;)V", "setPictureInPictureParams", "onUserLeaveHint", "Ljava/lang/Runnable;", "addOnUserLeaveHintListener", "(Ljava/lang/Runnable;)V", "removeOnUserLeaveHintListener", "reportFullyDrawn", "Lcom/google/android/o02;", "contextAwareHelper", "Lcom/google/android/o02;", "Lcom/google/android/iq7;", "menuHostHelper", "Lcom/google/android/iq7;", "Lcom/google/android/b0b;", "savedStateRegistryController", "Lcom/google/android/b0b;", "getSavedStateRegistryController$annotations", "Lcom/google/android/k9e;", "_viewModelStore", "Lcom/google/android/k9e;", "reportFullyDrawnExecutor", "Landroidx/activity/ComponentActivity$d;", "Lcom/google/android/yr4;", "fullyDrawnReporter$delegate", "Lkotlin/Lazy;", "getFullyDrawnReporter", "()Lcom/google/android/yr4;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "Ljava/util/concurrent/atomic/AtomicInteger;", "activityResultRegistry", "Lcom/google/android/p9;", "getActivityResultRegistry", "()Lcom/google/android/p9;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onTrimMemoryListeners", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "onPictureInPictureModeChangedListeners", "onPictureInPictureUiStateChangedListeners", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "Z", "dispatchingOnPictureInPictureModeChanged", "Lcom/google/android/za3;", "onBackPressedInput$delegate", "getOnBackPressedInput", "()Lcom/google/android/za3;", "onBackPressedInput", "hasPictureInPictureSystemFeature", "Landroidx/lifecycle/b0$c;", "defaultViewModelProviderFactory$delegate", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/b0$c;", "defaultViewModelProviderFactory", "onBackPressedDispatcher$delegate", "getOnBackPressedDispatcher", "()Lcom/google/android/jq8;", "onBackPressedDispatcher", "getLastCustomNonConfigurationInstance", "lastCustomNonConfigurationInstance", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "lifecycle", "getViewModelStore", "()Lcom/google/android/k9e;", "viewModelStore", "Lcom/google/android/oe2;", "getDefaultViewModelCreationExtras", "()Lcom/google/android/oe2;", "defaultViewModelCreationExtras", "Lcom/google/android/kd8;", "getNavigationEventDispatcher", "()Lcom/google/android/kd8;", "navigationEventDispatcher", "Lcom/google/android/zza;", "getSavedStateRegistry", "()Lcom/google/android/zza;", "savedStateRegistry", "Companion", "c", "d", "e", "b", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ComponentActivity extends androidx.core.app.ComponentActivity implements n17, u9e, androidx.lifecycle.e, e0b, lq8, ld8, u9, y8, oq8, xr8, er8, gr8, fq7, zr4 {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private static final b Companion = new b(null);
    private k9e _viewModelStore;
    private final p9 activityResultRegistry;
    private int contentLayoutId;
    private final o02 contextAwareHelper;

    /* JADX INFO: renamed from: defaultViewModelProviderFactory$delegate, reason: from kotlin metadata */
    private final Lazy defaultViewModelProviderFactory;
    private boolean dispatchingOnMultiWindowModeChanged;
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: fullyDrawnReporter$delegate, reason: from kotlin metadata */
    private final Lazy fullyDrawnReporter;
    private boolean hasPictureInPictureSystemFeature;
    private final iq7 menuHostHelper;
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: onBackPressedDispatcher$delegate, reason: from kotlin metadata */
    private final Lazy onBackPressedDispatcher;

    /* JADX INFO: renamed from: onBackPressedInput$delegate, reason: from kotlin metadata */
    private final Lazy onBackPressedInput;
    private final CopyOnWriteArrayList<oy1<Configuration>> onConfigurationChangedListeners;
    private final CopyOnWriteArrayList<oy1<r38>> onMultiWindowModeChangedListeners;
    private final CopyOnWriteArrayList<oy1<Intent>> onNewIntentListeners;
    private final CopyOnWriteArrayList<oy1<i99>> onPictureInPictureModeChangedListeners;
    private final CopyOnWriteArrayList<oy1<m99>> onPictureInPictureUiStateChangedListeners;
    private final CopyOnWriteArrayList<oy1<Integer>> onTrimMemoryListeners;
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;
    private final d reportFullyDrawnExecutor;
    private final b0b savedStateRegistryController;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"androidx/activity/ComponentActivity$a", "Landroidx/lifecycle/i;", "Lcom/google/android/n17;", "source", "Landroidx/lifecycle/Lifecycle$Event;", "event", "", "d6", "(Lcom/google/android/n17;Landroidx/lifecycle/Lifecycle$Event;)V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements i {
        a() {
        }

        @Override // androidx.lifecycle.i
        public void d6(n17 source, Lifecycle.Event event) {
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(event, "event");
            ComponentActivity.this.ensureViewModelStore();
            ComponentActivity.this.getLifecycle().g(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/activity/ComponentActivity$b;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\t\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0004\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Landroidx/activity/ComponentActivity$c;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "()Ljava/lang/Object;", "c", "(Ljava/lang/Object;)V", "custom", "Lcom/google/android/k9e;", "b", "Lcom/google/android/k9e;", "()Lcom/google/android/k9e;", "d", "(Lcom/google/android/k9e;)V", "viewModelStore", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private Object custom;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private k9e viewModelStore;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Object getCustom() {
            return this.custom;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k9e getViewModelStore() {
            return this.viewModelStore;
        }

        public final void c(Object obj) {
            this.custom = obj;
        }

        public final void d(k9e k9eVar) {
            this.viewModelStore = k9eVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Landroidx/activity/ComponentActivity$d;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)V", "O", "()V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private interface d extends Executor {
        void O();

        void c(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010$\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Landroidx/activity/ComponentActivity$e;", "Landroidx/activity/ComponentActivity$d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(Landroidx/activity/ComponentActivity;)V", "Landroid/view/View;", "view", "", "c", "(Landroid/view/View;)V", "O", "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "a", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "b", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private Runnable currentRunnable;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private boolean onDrawScheduled;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(e eVar) {
            Runnable runnable = eVar.currentRunnable;
            if (runnable != null) {
                Intrinsics.g(runnable);
                runnable.run();
                eVar.currentRunnable = null;
            }
        }

        @Override // androidx.activity.ComponentActivity.d
        public void O() {
            ComponentActivity.this.getWindow().getDecorView().removeCallbacks(this);
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // androidx.activity.ComponentActivity.d
        public void c(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.currentRunnable = runnable;
            View decorView = ComponentActivity.this.getWindow().getDecorView();
            Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: androidx.activity.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.e.b(this.a);
                    }
                });
            } else if (Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    ComponentActivity.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (ComponentActivity.this.getFullyDrawnReporter().c()) {
                this.onDrawScheduled = false;
                ComponentActivity.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            ComponentActivity.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/activity/ComponentActivity$f", "Lcom/google/android/p9;", "I", "O", "", "requestCode", "Lcom/google/android/z8;", "contract", "input", "Lcom/google/android/w8;", "options", "", "k", "(ILcom/google/android/z8;Ljava/lang/Object;Lcom/google/android/w8;)V", "activity"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f extends p9 {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(f fVar, int i, z8.a aVar) {
            fVar.g(i, aVar.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(f fVar, int i, IntentSender.SendIntentException sendIntentException) {
            fVar.f(i, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // com.google.inputmethod.p9
        public <I, O> void k(final int requestCode, z8<I, O> contract, I input, w8 options) {
            Bundle bundleB;
            final int i;
            Intrinsics.checkNotNullParameter(contract, "contract");
            ComponentActivity componentActivity = ComponentActivity.this;
            final z8.a<O> synchronousResult = contract.getSynchronousResult(componentActivity, input);
            if (synchronousResult != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.ym1
                    @Override // java.lang.Runnable
                    public final void run() {
                        ComponentActivity.f.u(this.a, requestCode, synchronousResult);
                    }
                });
                return;
            }
            Intent intentCreateIntent = contract.createIntent(componentActivity, input);
            if (intentCreateIntent.getExtras() != null) {
                Bundle extras = intentCreateIntent.getExtras();
                Intrinsics.g(extras);
                if (extras.getClassLoader() == null) {
                    intentCreateIntent.setExtrasClassLoader(componentActivity.getClassLoader());
                }
            }
            if (intentCreateIntent.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleB = intentCreateIntent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentCreateIntent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleB = options != null ? options.b() : null;
            }
            Bundle bundle = bundleB;
            if (Intrinsics.e("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentCreateIntent.getAction())) {
                String[] stringArrayExtra = intentCreateIntent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                a8.u(componentActivity, stringArrayExtra, requestCode);
                return;
            }
            if (!Intrinsics.e("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentCreateIntent.getAction())) {
                a8.y(componentActivity, intentCreateIntent, requestCode, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentCreateIntent.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                Intrinsics.g(intentSenderRequest);
                i = requestCode;
                try {
                    a8.z(componentActivity, intentSenderRequest.getIntentSender(), i, intentSenderRequest.getFillInIntent(), intentSenderRequest.getFlagsMask(), intentSenderRequest.getFlagsValues(), 0, bundle);
                    Unit unit = Unit.a;
                } catch (IntentSender.SendIntentException e) {
                    e = e;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.zm1
                        @Override // java.lang.Runnable
                        public final void run() {
                            ComponentActivity.f.v(this.a, i, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                i = requestCode;
            }
        }
    }

    public ComponentActivity() {
        this.contextAwareHelper = new o02();
        this.menuHostHelper = new iq7(new Runnable() { // from class: com.google.android.pm1
            @Override // java.lang.Runnable
            public final void run() {
                this.a.invalidateMenu();
            }
        });
        b0b b0bVarB = b0b.c.b(this);
        this.savedStateRegistryController = b0bVarB;
        this.reportFullyDrawnExecutor = createFullyDrawnExecutor();
        this.fullyDrawnReporter = kotlin.c.b(new Function0() { // from class: com.google.android.qm1
            public final Object invoke() {
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0(this.a);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureUiStateChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = kotlin.c.b(new Function0() { // from class: com.google.android.rm1
            public final Object invoke() {
                return ComponentActivity.onBackPressedInput_delegate$lambda$0(this.a);
            }
        });
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().c(new i() { // from class: com.google.android.sm1
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$1(this.a, n17Var, event);
            }
        });
        getLifecycle().c(new i() { // from class: com.google.android.tm1
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var, Lifecycle.Event event) {
                ComponentActivity._init_$lambda$2(this.a, n17Var, event);
            }
        });
        getLifecycle().c(new a());
        b0bVarB.c();
        w.c(this);
        getSavedStateRegistry().c(ACTIVITY_RESULT_TAG, new zza.b() { // from class: com.google.android.um1
            public final Bundle b() {
                return ComponentActivity._init_$lambda$3(this.a);
            }
        });
        addOnContextAvailableListener(new qq8() { // from class: com.google.android.vm1
            @Override // com.google.inputmethod.qq8
            public final void a(Context context) {
                ComponentActivity._init_$lambda$4(this.a, context);
            }
        });
        this.defaultViewModelProviderFactory = kotlin.c.b(new Function0() { // from class: com.google.android.wm1
            public final Object invoke() {
                return ComponentActivity.defaultViewModelProviderFactory_delegate$lambda$0(this.a);
            }
        });
        this.onBackPressedDispatcher = kotlin.c.b(new Function0() { // from class: com.google.android.xm1
            public final Object invoke() {
                return ComponentActivity.onBackPressedDispatcher_delegate$lambda$0(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(ComponentActivity componentActivity, n17 n17Var, Lifecycle.Event event) {
        Window window;
        View viewPeekDecorView;
        Intrinsics.checkNotNullParameter(n17Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event != Lifecycle.Event.ON_STOP || (window = componentActivity.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(ComponentActivity componentActivity, n17 n17Var, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(n17Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            componentActivity.contextAwareHelper.b();
            if (!componentActivity.isChangingConfigurations()) {
                componentActivity.getViewModelStore().a();
            }
            componentActivity.reportFullyDrawnExecutor.O();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle _init_$lambda$3(ComponentActivity componentActivity) {
        Bundle bundle = new Bundle();
        componentActivity.activityResultRegistry.m(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$4(ComponentActivity componentActivity, Context context) {
        Intrinsics.checkNotNullParameter(context, "it");
        Bundle bundleA = componentActivity.getSavedStateRegistry().a(ACTIVITY_RESULT_TAG);
        if (bundleA != null) {
            componentActivity.activityResultRegistry.l(bundleA);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void addObserverForBackInvoker(final jq8 dispatcher) {
        getLifecycle().c(new i() { // from class: com.google.android.nm1
            @Override // androidx.lifecycle.i
            public final void d6(n17 n17Var, Lifecycle.Event event) {
                ComponentActivity.addObserverForBackInvoker$lambda$0(dispatcher, this, n17Var, event);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void addObserverForBackInvoker$lambda$0(jq8 jq8Var, ComponentActivity componentActivity, n17 n17Var, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(n17Var, "<unused var>");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            OnBackInvokedDispatcher onBackInvokedDispatcher = componentActivity.getOnBackInvokedDispatcher();
            Intrinsics.checkNotNullExpressionValue(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            jq8Var.m(onBackInvokedDispatcher);
        }
    }

    private final d createFullyDrawnExecutor() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x defaultViewModelProviderFactory_delegate$lambda$0(ComponentActivity componentActivity) {
        return new x(componentActivity.getApplication(), componentActivity, componentActivity.getIntent() != null ? componentActivity.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void ensureViewModelStore() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new k9e();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final yr4 fullyDrawnReporter_delegate$lambda$0(final ComponentActivity componentActivity) {
        return new yr4(componentActivity.reportFullyDrawnExecutor, new Function0() { // from class: com.google.android.om1
            public final Object invoke() {
                return ComponentActivity.fullyDrawnReporter_delegate$lambda$0$0(this.a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fullyDrawnReporter_delegate$lambda$0$0(ComponentActivity componentActivity) {
        componentActivity.reportFullyDrawn();
        return Unit.a;
    }

    private final za3 getOnBackPressedInput() {
        return (za3) this.onBackPressedInput.getValue();
    }

    private static /* synthetic */ void getSavedStateRegistryController$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jq8 onBackPressedDispatcher_delegate$lambda$0(final ComponentActivity componentActivity) {
        final jq8 jq8Var = new jq8(new Runnable() { // from class: com.google.android.lm1
            @Override // java.lang.Runnable
            public final void run() {
                ComponentActivity.onBackPressedDispatcher_delegate$lambda$0$0(this.a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!Intrinsics.e(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.google.android.mm1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.addObserverForBackInvoker(jq8Var);
                    }
                });
                return jq8Var;
            }
            componentActivity.addObserverForBackInvoker(jq8Var);
        }
        return jq8Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBackPressedDispatcher_delegate$lambda$0$0(ComponentActivity componentActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e2) {
            if (!Intrinsics.e(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e2;
            }
        } catch (NullPointerException e3) {
            if (!Intrinsics.e(e3.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e3;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final za3 onBackPressedInput_delegate$lambda$0(ComponentActivity componentActivity) {
        za3 za3Var = new za3();
        componentActivity.getNavigationEventDispatcher().c(za3Var);
        return za3Var;
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.c(decorView);
        super.addContentView(view, params);
    }

    @Override // com.google.inputmethod.fq7
    public void addMenuProvider(uq7 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.c(provider);
    }

    @Override // com.google.inputmethod.oq8
    public final void addOnConfigurationChangedListener(oy1<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.add(listener);
    }

    public final void addOnContextAvailableListener(qq8 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.a(listener);
    }

    @Override // com.google.inputmethod.er8
    public final void addOnMultiWindowModeChangedListener(oy1<r38> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final void addOnNewIntentListener(oy1<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.add(listener);
    }

    @Override // com.google.inputmethod.gr8
    public final void addOnPictureInPictureModeChangedListener(oy1<i99> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    public final void addOnPictureInPictureUiStateChangedListener(oy1<m99> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureUiStateChangedListeners.add(listener);
    }

    @Override // com.google.inputmethod.xr8
    public final void addOnTrimMemoryListener(oy1<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.add(listener);
    }

    public final void addOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.add(listener);
    }

    public final void enterPictureInPictureMode(j99 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.hasPictureInPictureSystemFeature) {
            throw null;
        }
    }

    @Override // com.google.inputmethod.u9
    public final p9 getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    @Override // androidx.lifecycle.e
    public CreationExtras getDefaultViewModelCreationExtras() {
        j48 j48Var = new j48(null, 1, null);
        if (getApplication() != null) {
            j48Var.c(b0.a.h, getApplication());
        }
        j48Var.c(w.a, this);
        j48Var.c(w.b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            j48Var.c(w.c, extras);
        }
        return j48Var;
    }

    @Override // androidx.lifecycle.e
    public b0.c getDefaultViewModelProviderFactory() {
        return (b0.c) this.defaultViewModelProviderFactory.getValue();
    }

    public yr4 getFullyDrawnReporter() {
        return (yr4) this.fullyDrawnReporter.getValue();
    }

    @r43
    public Object getLastCustomNonConfigurationInstance() {
        c cVar = (c) getLastNonConfigurationInstance();
        if (cVar != null) {
            return cVar.getCustom();
        }
        return null;
    }

    @Override // androidx.core.app.ComponentActivity, com.google.inputmethod.n17
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }

    public kd8 getNavigationEventDispatcher() {
        return getOnBackPressedDispatcher().j();
    }

    @Override // com.google.inputmethod.lq8
    public final jq8 getOnBackPressedDispatcher() {
        return (jq8) this.onBackPressedDispatcher.getValue();
    }

    public final zza getSavedStateRegistry() {
        return this.savedStateRegistryController.b();
    }

    @Override // com.google.inputmethod.u9e
    public k9e getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        k9e k9eVar = this._viewModelStore;
        Intrinsics.g(k9eVar);
        return k9eVar;
    }

    public void initializeViewTreeOwners() {
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        fbe.b(decorView, this);
        View decorView2 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView2, "getDecorView(...)");
        jbe.b(decorView2, this);
        View decorView3 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView3, "getDecorView(...)");
        ibe.b(decorView3, this);
        View decorView4 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView4, "getDecorView(...)");
        hbe.b(decorView4, this);
        View decorView5 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView5, "getDecorView(...)");
        dbe.a(decorView5, this);
        View decorView6 = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView6, "getDecorView(...)");
        gbe.b(decorView6, this);
    }

    public void invalidateMenu() {
        invalidateOptionsMenu();
    }

    @Override // android.app.Activity
    @r43
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.f(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @r43
    public void onBackPressed() {
        getOnBackPressedInput().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        Iterator<oy1<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        s.INSTANCE.c(this);
        int i = this.contentLayoutId;
        if (i != 0) {
            setContentView(i);
        }
        this.hasPictureInPictureSystemFeature = getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.f(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.h(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @r43
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<oy1<r38>> it = this.onMultiWindowModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new r38(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.onNewIntent(intent);
        Iterator<oy1<Intent>> it = this.onNewIntentListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.menuHostHelper.g(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @r43
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<oy1<i99>> it = this.onPictureInPictureModeChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(new i99(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureUiStateChanged(PictureInPictureUiState pipState) {
        Intrinsics.checkNotNullParameter(pipState, "pipState");
        super.onPictureInPictureUiStateChanged(pipState);
        m99 m99VarA = m99.INSTANCE.a(pipState);
        Iterator<oy1<m99>> it = this.onPictureInPictureUiStateChangedListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(m99VarA);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.i(menu);
        return true;
    }

    @Override // android.app.Activity
    @r43
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (this.activityResultRegistry.f(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @r43
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        k9e viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = cVar.getViewModelStore();
        }
        if (viewModelStore == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.c(objOnRetainCustomNonConfigurationInstance);
        cVar2.d(viewModelStore);
        return cVar2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) throws NoWhenBranchMatchedException {
        Intrinsics.checkNotNullParameter(outState, "outState");
        if (getLifecycle() instanceof k) {
            Lifecycle lifecycleRegistry = getLifecycle();
            Intrinsics.h(lifecycleRegistry, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
            ((k) lifecycleRegistry).q(Lifecycle.State.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<oy1<Integer>> it = this.onTrimMemoryListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public Context peekAvailableContext() {
        return this.contextAwareHelper.getContext();
    }

    public final <I, O> l9<I> registerForActivityResult(z8<I, O> contract, p9 registry, x8<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(registry, "registry");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registry.o("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // com.google.inputmethod.fq7
    public void removeMenuProvider(uq7 provider) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        this.menuHostHelper.j(provider);
    }

    @Override // com.google.inputmethod.oq8
    public final void removeOnConfigurationChangedListener(oy1<Configuration> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onConfigurationChangedListeners.remove(listener);
    }

    public final void removeOnContextAvailableListener(qq8 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.contextAwareHelper.e(listener);
    }

    @Override // com.google.inputmethod.er8
    public final void removeOnMultiWindowModeChangedListener(oy1<r38> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    public final void removeOnNewIntentListener(oy1<Intent> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onNewIntentListeners.remove(listener);
    }

    @Override // com.google.inputmethod.gr8
    public final void removeOnPictureInPictureModeChangedListener(oy1<i99> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    public final void removeOnPictureInPictureUiStateChangedListener(oy1<m99> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onPictureInPictureUiStateChangedListeners.remove(listener);
    }

    @Override // com.google.inputmethod.xr8
    public final void removeOnTrimMemoryListener(oy1<Integer> listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onTrimMemoryListeners.remove(listener);
    }

    public final void removeOnUserLeaveHintListener(Runnable listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.onUserLeaveHintListeners.remove(listener);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (ubd.h()) {
                ubd.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            getFullyDrawnReporter().b();
        } finally {
            ubd.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.c(decorView);
        super.setContentView(layoutResID);
    }

    public final void setPictureInPictureParams(j99 params) {
        Intrinsics.checkNotNullParameter(params, "params");
        if (this.hasPictureInPictureSystemFeature) {
            throw null;
        }
    }

    @Override // android.app.Activity
    @r43
    public void startActivityForResult(Intent intent, int requestCode) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @r43
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    public void addMenuProvider(uq7 provider, n17 owner) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        this.menuHostHelper.d(provider, owner);
    }

    @Override // android.app.Activity
    @r43
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @r43
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intrinsics.checkNotNullParameter(intent, "intent");
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    public void addMenuProvider(uq7 provider, n17 owner, Lifecycle.State state) {
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(owner, "owner");
        Intrinsics.checkNotNullParameter(state, "state");
        this.menuHostHelper.e(provider, owner, state);
    }

    @Override // com.google.inputmethod.y8
    public final <I, O> l9<I> registerForActivityResult(z8<I, O> contract, x8<O> callback) {
        Intrinsics.checkNotNullParameter(contract, "contract");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return registerForActivityResult(contract, this.activityResultRegistry, callback);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<oy1<r38>> it = this.onMultiWindowModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new r38(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<oy1<i99>> it = this.onPictureInPictureModeChangedListeners.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                it.next().accept(new i99(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.c(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        initializeViewTreeOwners();
        d dVar = this.reportFullyDrawnExecutor;
        View decorView = getWindow().getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "getDecorView(...)");
        dVar.c(decorView);
        super.setContentView(view, params);
    }

    public ComponentActivity(int i) {
        this();
        this.contentLayoutId = i;
    }
}
