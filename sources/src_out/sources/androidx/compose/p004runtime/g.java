package androidx.compose.p004runtime;

import androidx.collection.ScatterSet;
import androidx.collection.d;
import androidx.compose.p004runtime.collection.ScatterSetWrapper;
import androidx.compose.p004runtime.snapshots.e;
import com.google.android.qjd;
import com.google.inputmethod.a7c;
import com.google.inputmethod.b7c;
import com.google.inputmethod.b81;
import com.google.inputmethod.bna;
import com.google.inputmethod.bq1;
import com.google.inputmethod.c81;
import com.google.inputmethod.cub;
import com.google.inputmethod.d49;
import com.google.inputmethod.ei9;
import com.google.inputmethod.eub;
import com.google.inputmethod.ez;
import com.google.inputmethod.f49;
import com.google.inputmethod.fob;
import com.google.inputmethod.fub;
import com.google.inputmethod.g49;
import com.google.inputmethod.g81;
import com.google.inputmethod.is1;
import com.google.inputmethod.js1;
import com.google.inputmethod.k58;
import com.google.inputmethod.mg;
import com.google.inputmethod.pm8;
import com.google.inputmethod.q08;
import com.google.inputmethod.q6b;
import com.google.inputmethod.r08;
import com.google.inputmethod.r6b;
import com.google.inputmethod.rea;
import com.google.inputmethod.sub;
import com.google.inputmethod.taa;
import com.google.inputmethod.tub;
import com.google.inputmethod.uo1;
import com.google.inputmethod.vbd;
import com.google.inputmethod.w58;
import com.google.inputmethod.wl8;
import com.google.inputmethod.x22;
import com.google.inputmethod.yea;
import com.google.inputmethod.yr1;
import com.google.inputmethod.zea;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.f;
import kotlin.collections.l0;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010\"J\u001f\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,2\u0006\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010\"J\u0017\u00101\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0013H\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\u001b2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u0010:J)\u0010>\u001a\u00020=2\u0006\u00107\u001a\u0002062\u0006\u0010<\u001a\u00020;2\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040@H\u0002¢\u0006\u0004\bA\u0010BJ\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bF\u0010\u001aJ\u001d\u0010G\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bG\u0010\u001aJ\u001d\u0010H\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bJ\u0010IJ\u001f\u0010N\u001a\u00020\u00172\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010KH\u0000¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017¢\u0006\u0004\bP\u0010\u001aJ\u000f\u0010Q\u001a\u00020\u0017H\u0000¢\u0006\u0004\bQ\u0010\"J\u000f\u0010R\u001a\u00020\u0017H\u0016¢\u0006\u0004\bR\u0010\"J\u001d\u0010S\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,H\u0016¢\u0006\u0004\bS\u0010TJ\u001d\u0010U\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,H\u0016¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u00172\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bX\u0010YJ)\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040[0Z2\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u00102J\u0017\u0010_\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b_\u00102J\u000f\u0010`\u001a\u00020\u001bH\u0016¢\u0006\u0004\b`\u0010$J+\u0010c\u001a\u00020\u00172\u001a\u0010b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020a\u0012\u0006\u0012\u0004\u0018\u00010a0[0ZH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u00172\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0017H\u0016¢\u0006\u0004\bi\u0010\"J\u000f\u0010j\u001a\u00020\u0017H\u0016¢\u0006\u0004\bj\u0010\"J\u000f\u0010k\u001a\u00020\u0017H\u0016¢\u0006\u0004\bk\u0010\"J\u000f\u0010l\u001a\u00020\u0017H\u0016¢\u0006\u0004\bl\u0010\"J\u000f\u0010m\u001a\u00020\u0017H\u0016¢\u0006\u0004\bm\u0010\"J5\u0010r\u001a\u00028\u0000\"\u0004\b\u0000\u0010n2\b\u0010o\u001a\u0004\u0018\u00010\u00012\u0006\u0010q\u001a\u00020p2\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\br\u0010sJ\u001b\u0010v\u001a\u0004\u0018\u00010t2\b\u0010u\u001a\u0004\u0018\u00010tH\u0016¢\u0006\u0004\bv\u0010wJ!\u0010x\u001a\u00020=2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u00172\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bz\u0010{J\u001f\u0010|\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b|\u0010}J\u001c\u0010\u007f\u001a\u00020\u00172\n\u0010f\u001a\u0006\u0012\u0002\b\u00030~H\u0000¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0011\u0010\u0081\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0081\u0001\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u000f\n\u0005\b^\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bH\u0010\u0085\u0001R,\u0010\u0089\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0086\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0087\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u0088\u0001R\u001b\u0010\u008c\u0001\u001a\u00070\u0004j\u0003`\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bz\u0010\u008b\u0001R%\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u00018\u0002X\u0082\u0004¢\u0006\u000e\n\u0005\bU\u0010\u008f\u0001\u0012\u0005\b\u0090\u0001\u0010\"R$\u0010\u0095\u0001\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\u0015\n\u0005\bG\u0010\u0092\u0001\u0012\u0005\b\u0094\u0001\u0010\"\u001a\u0005\b\u0093\u0001\u0010\u000fR\"\u0010\u0097\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010\u0096\u0001R\u001d\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u0002060\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0099\u0001R\u001d\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u0002060\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010\u0099\u0001R&\u0010\u009c\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030~0@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010\u0096\u0001R\u0015\u00103\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bc\u0010\u009d\u0001R\u0016\u0010\u009e\u0001\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010\u009d\u0001R\"\u0010\u009f\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bx\u0010\u0096\u0001R$\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010\u0096\u0001R-\u0010¥\u0001\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u001c\n\u0004\bS\u0010|\u0012\u0005\b¤\u0001\u0010\"\u001a\u0005\b¡\u0001\u0010$\"\u0006\b¢\u0001\u0010£\u0001R\u0019\u0010u\u001a\u0004\u0018\u00010t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010¦\u0001R\u001c\u0010ª\u0001\u001a\u0005\u0018\u00010§\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001a\u0010¬\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bg\u0010«\u0001R\u0017\u0010\u00ad\u0001\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010\u0014R \u0010³\u0001\u001a\u00030®\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¯\u0001\u0010°\u0001\u001a\u0006\b±\u0001\u0010²\u0001R\u0017\u0010¶\u0001\u001a\u00030´\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bv\u0010µ\u0001R\u001c\u0010¸\u0001\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\r\n\u0005\bl\u0010·\u0001\u001a\u0004\bn\u0010\u0012R\u0019\u0010¹\u0001\u001a\u00020\u001b8\u0006¢\u0006\r\n\u0004\bm\u0010|\u001a\u0005\b¹\u0001\u0010$R\u0016\u0010f\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010\u0014R.\u0010¿\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0005\b¾\u0001\u0010\u001aR\u0016\u0010Á\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÀ\u0001\u0010$R\u0016\u0010Â\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¨\u0001\u0010$R\u0016\u0010Ã\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010$R\u0016\u0010Ä\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¯\u0001\u0010$¨\u0006Å\u0001"}, d2 = {"Landroidx/compose/runtime/g;", "Lcom/google/android/x22;", "Lcom/google/android/bna;", "Lcom/google/android/taa;", "", "Lcom/google/android/d49;", "Lcom/google/android/pm8;", "Landroidx/compose/runtime/f;", "parent", "Lcom/google/android/ez;", "applier", "<init>", "(Landroidx/compose/runtime/f;Lcom/google/android/ez;)V", "Lcom/google/android/cub;", "K", "()Lcom/google/android/cub;", "Landroidx/compose/runtime/o;", "J", "()Landroidx/compose/runtime/o;", "Lcom/google/android/g81;", "I", "()Lcom/google/android/g81;", "Lkotlin/Function0;", "", "content", "F", "(Lkotlin/jvm/functions/Function2;)V", "", "reusable", "Lcom/google/android/f49;", "G", "(ZLkotlin/jvm/functions/Function2;)Lcom/google/android/f49;", "H", "O", "()V", "E", "()Z", "L", "M", "N", "value", "forgetConditionalScopes", "A", "(Ljava/lang/Object;Z)V", "", "values", "B", "(Ljava/util/Set;Z)V", "D", "V", "(Ljava/lang/Object;)V", "changes", "C", "(Lcom/google/android/g81;)V", "Landroidx/compose/runtime/b0;", "scope", "instance", "b0", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Z", "Lcom/google/android/mg;", "anchor", "Landroidx/compose/runtime/InvalidationResult;", "U", "(Landroidx/compose/runtime/b0;Lcom/google/android/mg;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "Lcom/google/android/r6b;", "a0", "()Lcom/google/android/k58;", "Lcom/google/android/is1;", "W", "()Lcom/google/android/is1;", "c", "f", "b", "(Lkotlin/jvm/functions/Function2;)Lcom/google/android/f49;", "g", "Landroidx/collection/ScatterSet;", "Lcom/google/android/zea;", "ignoreSet", "X", "(Landroidx/collection/ScatterSet;)V", "i", "c0", "dispose", "o", "(Ljava/util/Set;)V", "e", "(Ljava/util/Set;)Z", "block", "n", "(Lkotlin/jvm/functions/Function0;)V", "", "Lkotlin/Pair;", "P", "(Lcom/google/android/mg;)Ljava/util/List;", "a", "s", "l", "Lcom/google/android/r08;", "references", "k", "(Ljava/util/List;)V", "Lcom/google/android/q08;", "state", "r", "(Lcom/google/android/q08;)V", "p", "j", "h", "v", "w", "R", "to", "", "groupIndex", "x", "(Lcom/google/android/x22;ILkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Lcom/google/android/fob;", "shouldPause", "u", "(Lcom/google/android/fob;)Lcom/google/android/fob;", "m", "(Landroidx/compose/runtime/b0;Ljava/lang/Object;)Landroidx/compose/runtime/InvalidationResult;", "d", "(Landroidx/compose/runtime/b0;)V", "Z", "(Ljava/lang/Object;Landroidx/compose/runtime/b0;)V", "Landroidx/compose/runtime/j;", "Y", "(Landroidx/compose/runtime/j;)V", "deactivate", "Landroidx/compose/runtime/f;", "getParent", "()Landroidx/compose/runtime/f;", "Lcom/google/android/ez;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "lock", "", "Lcom/google/android/yea;", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "Lcom/google/android/cub;", "T", "getSlotStorage$runtime$annotations", "slotStorage", "Lcom/google/android/k58;", "observations", "Landroidx/collection/d;", "Landroidx/collection/d;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "Lcom/google/android/g81;", "lateChanges", "observationsProcessed", "invalidations", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "getPendingInvalidScopes$runtime$annotations", "pendingInvalidScopes", "Lcom/google/android/fob;", "Lcom/google/android/g49;", "q", "Lcom/google/android/g49;", "pendingPausedComposition", "Landroidx/compose/runtime/g;", "invalidationDelegate", "invalidationDelegateGroup", "Lcom/google/android/js1;", "t", "Lcom/google/android/js1;", "S", "()Lcom/google/android/js1;", "observerHolder", "Lcom/google/android/rea;", "Lcom/google/android/rea;", "rememberManager", "Landroidx/compose/runtime/o;", "composer", "isRoot", "y", "Lkotlin/jvm/functions/Function2;", "getComposable", "()Lkotlin/jvm/functions/Function2;", "setComposable", "composable", "Q", "areChildrenComposing", "isComposing", "isDisposed", "hasInvalidations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements x22, bna, taa, d49, pm8 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final f parent;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ez<?> applier;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final AtomicReference<Object> pendingModifications = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final Set<yea> abandonSet;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final cub slotStorage;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final k58<Object, Object> observations;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final d<b0> invalidatedScopes;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final d<b0> conditionallyInvalidatedScopes;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final k58<Object, Object> derivedStates;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final g81 changes;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final g81 lateChanges;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final k58<Object, Object> observationsProcessed;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private k58<Object, Object> invalidations;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean pendingInvalidScopes;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private fob shouldPause;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private g49 pendingPausedComposition;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private g invalidationDelegate;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private int invalidationDelegateGroup;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final js1 observerHolder;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private final rea rememberManager;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final o composer;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final boolean isRoot;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private Function2<? super d, ? super Integer, Unit> composable;

    public g(f fVar, ez<?> ezVar) {
        this.parent = fVar;
        this.applier = ezVar;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i = 0;
        int i2 = 1;
        this.abandonSet = new d(i, i2, defaultConstructorMarker).l();
        cub cubVarK = K();
        if (fVar.e()) {
            cubVarK.c();
        }
        if (fVar.getCollectingSourceInformation()) {
            cubVarK.d();
        }
        this.slotStorage = cubVarK;
        this.observations = r6b.e(null, 1, null);
        this.invalidatedScopes = new d<>(i, i2, defaultConstructorMarker);
        this.conditionallyInvalidatedScopes = new d<>(i, i2, defaultConstructorMarker);
        this.derivedStates = r6b.e(null, 1, null);
        this.changes = I();
        this.lateChanges = I();
        this.observationsProcessed = r6b.e(null, 1, null);
        this.invalidations = r6b.e(null, 1, null);
        this.observerHolder = new js1(null, false, fVar, 3, null);
        this.rememberManager = new rea();
        o oVarJ = J();
        fVar.t(oVarJ);
        this.composer = oVarJ;
        this.isRoot = fVar instanceof Recomposer;
        this.composable = uo1.a.d();
    }

    private final void A(Object value, boolean forgetConditionalScopes) {
        Object objE = this.observations.e(value);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof d)) {
            b0 b0Var = (b0) objE;
            if (r6b.m(this.observationsProcessed, value, b0Var) || b0Var.v(value) == InvalidationResult.IGNORED) {
                return;
            }
            if (!b0Var.w() || forgetConditionalScopes) {
                this.invalidatedScopes.h(b0Var);
                return;
            } else {
                this.conditionallyInvalidatedScopes.h(b0Var);
                return;
            }
        }
        d dVar = (d) objE;
        Object[] objArr = dVar.elements;
        long[] jArr = dVar.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        b0 b0Var2 = (b0) objArr[(i << 3) + i3];
                        if (!r6b.m(this.observationsProcessed, value, b0Var2) && b0Var2.v(value) != InvalidationResult.IGNORED) {
                            if (!b0Var2.w() || forgetConditionalScopes) {
                                this.invalidatedScopes.h(b0Var2);
                            } else {
                                this.conditionallyInvalidatedScopes.h(b0Var2);
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:109:0x023b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x023d A[LOOP:6: B:93:0x01e9->B:110:0x023d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:169:0x034c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x034e A[LOOP:10: B:152:0x0301->B:170:0x034e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x00c8 A[EDGE_INSN: B:193:0x00c8->B:37:0x00c8 BREAK  A[LOOP:2: B:23:0x0077->B:34:0x00b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:201:0x024a A[EDGE_INSN: B:201:0x024a->B:112:0x024a BREAK  A[LOOP:6: B:93:0x01e9->B:110:0x023d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x0355 A[EDGE_INSN: B:207:0x0355->B:172:0x0355 BREAK  A[LOOP:10: B:152:0x0301->B:170:0x034e], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:216:0x0187 A[EDGE_INSN: B:216:0x0187->B:74:0x0187 BREAK  A[LOOP:13: B:61:0x014b->B:72:0x017f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[LOOP:2: B:23:0x0077->B:34:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x017f A[LOOP:13: B:61:0x014b->B:72:0x017f, LOOP_END] */
    private final void B(Set<? extends Object> values, boolean forgetConditionalScopes) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        String str;
        long j4;
        boolean zA;
        long j5;
        long[] jArr2;
        int i;
        long[] jArr3;
        int i2;
        int i3;
        long j6;
        boolean zD;
        int i4;
        long j7;
        long j8;
        char c2;
        long j9;
        int i5;
        int i6;
        Object obj = null;
        char c3 = 7;
        long j10 = -9187201950435737472L;
        int i7 = 8;
        if (values instanceof ScatterSetWrapper) {
            ScatterSet scatterSetB = ((ScatterSetWrapper) values).b();
            Object[] objArr = scatterSetB.elements;
            long[] jArr4 = scatterSetB.metadata;
            int length = jArr4.length - 2;
            if (length >= 0) {
                int i8 = 0;
                j2 = 128;
                while (true) {
                    long j11 = jArr4[i8];
                    j3 = 255;
                    if ((((~j11) << c3) & j11 & j10) != j10) {
                        int i9 = 8 - ((~(i8 - length)) >>> 31);
                        int i10 = 0;
                        while (i10 < i9) {
                            if ((j11 & 255) < 128) {
                                c2 = c3;
                                Object obj2 = objArr[(i8 << 3) + i10];
                                j9 = j10;
                                if (obj2 instanceof b0) {
                                    ((b0) obj2).v(obj);
                                    j8 = j11;
                                    i5 = length;
                                } else {
                                    A(obj2, forgetConditionalScopes);
                                    Object objE = this.derivedStates.e(obj2);
                                    if (objE == null) {
                                        j8 = j11;
                                        i5 = length;
                                    } else if (objE instanceof d) {
                                        d dVar = (d) objE;
                                        Object[] objArr2 = dVar.elements;
                                        long[] jArr5 = dVar.metadata;
                                        int length2 = jArr5.length - 2;
                                        if (length2 >= 0) {
                                            j8 = j11;
                                            int i11 = 0;
                                            while (true) {
                                                long j12 = jArr5[i11];
                                                int i12 = i7;
                                                i5 = length;
                                                if ((((~j12) << c2) & j12 & j9) != j9) {
                                                    int i13 = 8 - ((~(i11 - length2)) >>> 31);
                                                    int i14 = 0;
                                                    while (i14 < i13) {
                                                        if ((j12 & 255) < 128) {
                                                            A((j) objArr2[(i11 << 3) + i14], forgetConditionalScopes);
                                                        }
                                                        j12 >>= i12;
                                                        i14++;
                                                        i12 = i12;
                                                    }
                                                    if (i13 != i12) {
                                                        break;
                                                    }
                                                    if (i11 != length2) {
                                                        break;
                                                    }
                                                    i11++;
                                                    length = i5;
                                                    i7 = 8;
                                                } else if (i11 != length2) {
                                                    break;
                                                    break;
                                                } else {
                                                    i11++;
                                                    length = i5;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            j8 = j11;
                                            i5 = length;
                                        }
                                    } else {
                                        j8 = j11;
                                        i5 = length;
                                        A((j) objE, forgetConditionalScopes);
                                    }
                                    Unit unit = Unit.a;
                                }
                                i6 = 8;
                            } else {
                                j8 = j11;
                                c2 = c3;
                                j9 = j10;
                                i5 = length;
                                i6 = i7;
                            }
                            i10++;
                            length = i5;
                            i7 = i6;
                            c3 = c2;
                            j10 = j9;
                            j11 = j8 >> i6;
                            obj = null;
                        }
                        c = c3;
                        j = j10;
                        int i15 = length;
                        if (i9 != i7) {
                            break;
                        } else {
                            length = i15;
                        }
                    } else {
                        c = c3;
                        j = j10;
                    }
                    if (i8 == length) {
                        break;
                    }
                    i8++;
                    c3 = c;
                    j10 = j;
                    obj = null;
                    i7 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 128;
                j3 = 255;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 128;
            j3 = 255;
            for (Object obj3 : values) {
                if (obj3 instanceof b0) {
                    ((b0) obj3).v(null);
                } else {
                    A(obj3, forgetConditionalScopes);
                    Object objE2 = this.derivedStates.e(obj3);
                    if (objE2 != null) {
                        if (objE2 instanceof d) {
                            d dVar2 = (d) objE2;
                            Object[] objArr3 = dVar2.elements;
                            long[] jArr6 = dVar2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i16 = 0;
                                while (true) {
                                    long j13 = jArr6[i16];
                                    if ((((~j13) << 7) & j13 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i16 != length3) {
                                            break;
                                            break;
                                        }
                                        i16++;
                                    } else {
                                        int i17 = 8 - ((~(i16 - length3)) >>> 31);
                                        for (int i18 = 0; i18 < i17; i18++) {
                                            if ((j13 & 255) < 128) {
                                                A((j) objArr3[(i16 << 3) + i18], forgetConditionalScopes);
                                            }
                                            j13 >>= 8;
                                        }
                                        if (i17 != 8) {
                                            break;
                                        } else if (i16 != length3) {
                                            break;
                                        } else {
                                            i16++;
                                        }
                                    }
                                }
                            }
                        } else {
                            A((j) objE2, forgetConditionalScopes);
                        }
                    }
                    Unit unit2 = Unit.a;
                }
            }
        }
        d<b0> dVar3 = this.conditionallyInvalidatedScopes;
        d<b0> dVar4 = this.invalidatedScopes;
        String str2 = "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>";
        if (!forgetConditionalScopes || !dVar3.e()) {
            if (dVar4.e()) {
                k58<Object, Object> k58Var = this.observations;
                long[] jArr7 = k58Var.metadata;
                int length4 = jArr7.length - 2;
                if (length4 >= 0) {
                    int i19 = 0;
                    while (true) {
                        long j14 = jArr7[i19];
                        if ((((~j14) << c) & j14 & j) != j) {
                            int i20 = 8 - ((~(i19 - length4)) >>> 31);
                            int i21 = 0;
                            while (i21 < i20) {
                                if ((j14 & j3) < j2) {
                                    int i22 = (i19 << 3) + i21;
                                    Object obj4 = k58Var.keys[i22];
                                    Object obj5 = k58Var.values[i22];
                                    if (obj5 instanceof d) {
                                        Intrinsics.h(obj5, str2);
                                        d dVar5 = (d) obj5;
                                        Object[] objArr4 = dVar5.elements;
                                        long[] jArr8 = dVar5.metadata;
                                        int length5 = jArr8.length - 2;
                                        if (length5 >= 0) {
                                            int i23 = 0;
                                            while (true) {
                                                long j15 = jArr8[i23];
                                                j4 = j14;
                                                if ((((~j15) << c) & j15 & j) != j) {
                                                    int i24 = 8 - ((~(i23 - length5)) >>> 31);
                                                    int i25 = 0;
                                                    while (i25 < i24) {
                                                        if ((j15 & j3) < j2) {
                                                            j5 = j15;
                                                            int i26 = (i23 << 3) + i25;
                                                            if (dVar4.a((b0) objArr4[i26])) {
                                                                dVar5.A(i26);
                                                            }
                                                        } else {
                                                            j5 = j15;
                                                        }
                                                        i25++;
                                                        j15 = j5 >> 8;
                                                    }
                                                    if (i24 != 8) {
                                                        break;
                                                    }
                                                    if (i23 != length5) {
                                                        break;
                                                    }
                                                    i23++;
                                                    j14 = j4;
                                                } else if (i23 != length5) {
                                                    break;
                                                    break;
                                                } else {
                                                    i23++;
                                                    j14 = j4;
                                                }
                                            }
                                        } else {
                                            j4 = j14;
                                        }
                                        zA = dVar5.d();
                                    } else {
                                        j4 = j14;
                                        Intrinsics.h(obj5, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                        zA = dVar4.a((b0) obj5);
                                    }
                                    if (zA) {
                                        k58Var.v(i22);
                                    }
                                } else {
                                    jArr7 = jArr7;
                                    str2 = str2;
                                    j4 = j14;
                                }
                                j14 = j4 >> 8;
                                i21++;
                                jArr7 = jArr7;
                                str2 = str2;
                            }
                            jArr = jArr7;
                            str = str2;
                            if (i20 != 8) {
                                break;
                            }
                        } else {
                            jArr = jArr7;
                            str = str2;
                        }
                        if (i19 == length4) {
                            break;
                        }
                        i19++;
                        jArr7 = jArr;
                        str2 = str;
                    }
                }
                D();
                dVar4.m();
                return;
            }
            return;
        }
        k58<Object, Object> k58Var2 = this.observations;
        long[] jArr9 = k58Var2.metadata;
        int length6 = jArr9.length - 2;
        if (length6 >= 0) {
            int i27 = 0;
            while (true) {
                long j16 = jArr9[i27];
                if ((((~j16) << c) & j16 & j) != j) {
                    int i28 = 8 - ((~(i27 - length6)) >>> 31);
                    int i29 = 0;
                    while (i29 < i28) {
                        if ((j16 & j3) < j2) {
                            int i30 = (i27 << 3) + i29;
                            Object obj6 = k58Var2.keys[i30];
                            Object obj7 = k58Var2.values[i30];
                            if (obj7 instanceof d) {
                                Intrinsics.h(obj7, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                d dVar6 = (d) obj7;
                                Object[] objArr5 = dVar6.elements;
                                long[] jArr10 = dVar6.metadata;
                                jArr3 = jArr9;
                                int length7 = jArr10.length - 2;
                                if (length7 >= 0) {
                                    j6 = j16;
                                    int i31 = 0;
                                    while (true) {
                                        long j17 = jArr10[i31];
                                        i2 = length6;
                                        i3 = i27;
                                        if ((((~j17) << c) & j17 & j) != j) {
                                            int i32 = 8 - ((~(i31 - length7)) >>> 31);
                                            for (int i33 = 0; i33 < i32; i33 = i4 + 1) {
                                                if ((j17 & j3) < j2) {
                                                    i4 = i33;
                                                    int i34 = (i31 << 3) + i4;
                                                    j7 = j17;
                                                    b0 b0Var = (b0) objArr5[i34];
                                                    if (dVar3.a(b0Var) || dVar4.a(b0Var)) {
                                                        dVar6.A(i34);
                                                    }
                                                } else {
                                                    i4 = i33;
                                                    j7 = j17;
                                                }
                                                j17 = j7 >> 8;
                                            }
                                            if (i32 != 8) {
                                                break;
                                            }
                                            if (i31 != length7) {
                                                break;
                                            }
                                            i31++;
                                            length6 = i2;
                                            i27 = i3;
                                        } else if (i31 != length7) {
                                            break;
                                            break;
                                        } else {
                                            i31++;
                                            length6 = i2;
                                            i27 = i3;
                                        }
                                    }
                                } else {
                                    i2 = length6;
                                    i3 = i27;
                                    j6 = j16;
                                }
                                zD = dVar6.d();
                            } else {
                                jArr3 = jArr9;
                                i2 = length6;
                                i3 = i27;
                                j6 = j16;
                                Intrinsics.h(obj7, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                b0 b0Var2 = (b0) obj7;
                                zD = dVar3.a(b0Var2) || dVar4.a(b0Var2);
                            }
                            if (zD) {
                                k58Var2.v(i30);
                            }
                        } else {
                            jArr3 = jArr9;
                            i2 = length6;
                            i3 = i27;
                            j6 = j16;
                        }
                        j16 = j6 >> 8;
                        i29++;
                        length6 = i2;
                        jArr9 = jArr3;
                        i27 = i3;
                    }
                    jArr2 = jArr9;
                    int i35 = length6;
                    int i36 = i27;
                    if (i28 != 8) {
                        break;
                    }
                    length6 = i35;
                    i = i36;
                } else {
                    jArr2 = jArr9;
                    i = i27;
                }
                if (i == length6) {
                    break;
                }
                i27 = i + 1;
                jArr9 = jArr2;
            }
        }
        dVar3.m();
        D();
    }

    private final void C(g81 changes) {
        ez<?> ezVarD;
        rea reaVarE;
        long[] jArr;
        long[] jArr2;
        long j;
        char c;
        long j2;
        int i;
        boolean zD;
        long[] jArr3;
        this.rememberManager.r(this.abandonSet, this.composer.j0());
        try {
            if (changes.c()) {
                try {
                    if (this.lateChanges.c() && this.pendingPausedComposition == null) {
                        this.rememberManager.j();
                    }
                } finally {
                    this.rememberManager.i();
                }
            } else {
                g49 g49Var = this.pendingPausedComposition;
                if (g49Var == null || (ezVarD = g49Var.d()) == null) {
                    ezVarD = this.applier;
                }
                g49 g49Var2 = this.pendingPausedComposition;
                String str = Intrinsics.e(ezVarD, g49Var2 != null ? g49Var2.d() : null) ? "Compose:recordChanges" : "Compose:applyChanges";
                vbd vbdVar = vbd.a;
                Object objA = vbdVar.a(str);
                try {
                    g49 g49Var3 = this.pendingPausedComposition;
                    if (g49Var3 == null || (reaVarE = g49Var3.getRememberManager()) == null) {
                        reaVarE = this.rememberManager;
                    }
                    ezVarD.e();
                    changes.b(this.slotStorage, ezVarD, reaVarE, this.composer.j0());
                    ezVarD.c();
                    Unit unit = Unit.a;
                    vbdVar.b(objA);
                    this.rememberManager.m();
                    this.rememberManager.n();
                    if (this.pendingInvalidScopes) {
                        Object objA2 = vbdVar.a("Compose:unobserve");
                        int i2 = 0;
                        try {
                            this.pendingInvalidScopes = false;
                            k58<Object, Object> k58Var = this.observations;
                            long[] jArr4 = k58Var.metadata;
                            int length = jArr4.length - 2;
                            if (length >= 0) {
                                int i3 = 0;
                                while (true) {
                                    long j3 = jArr4[i3];
                                    char c2 = 7;
                                    long j4 = -9187201950435737472L;
                                    if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i4 = 8;
                                        int i5 = 8 - ((~(i3 - length)) >>> 31);
                                        int i6 = i2;
                                        while (i6 < i5) {
                                            if ((j3 & 255) < 128) {
                                                int i7 = (i3 << 3) + i6;
                                                c = c2;
                                                Object obj = k58Var.keys[i7];
                                                Object obj2 = k58Var.values[i7];
                                                j2 = j4;
                                                if (obj2 instanceof d) {
                                                    Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                                    d dVar = (d) obj2;
                                                    Object[] objArr = dVar.elements;
                                                    long[] jArr5 = dVar.metadata;
                                                    int length2 = jArr5.length - 2;
                                                    if (length2 >= 0) {
                                                        j = j3;
                                                        int i8 = i4;
                                                        int i9 = 0;
                                                        while (true) {
                                                            long j5 = jArr5[i9];
                                                            Object[] objArr2 = objArr;
                                                            long[] jArr6 = jArr5;
                                                            if ((((~j5) << c) & j5 & j2) != j2) {
                                                                int i10 = 8 - ((~(i9 - length2)) >>> 31);
                                                                int i11 = 0;
                                                                while (i11 < i10) {
                                                                    if ((j5 & 255) < 128) {
                                                                        jArr3 = jArr4;
                                                                        int i12 = (i9 << 3) + i11;
                                                                        if (!((b0) objArr2[i12]).u()) {
                                                                            dVar.A(i12);
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr4;
                                                                    }
                                                                    j5 >>= i8;
                                                                    i11++;
                                                                    jArr4 = jArr3;
                                                                }
                                                                jArr2 = jArr4;
                                                                if (i10 != i8) {
                                                                    break;
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                            }
                                                            if (i9 == length2) {
                                                                break;
                                                            }
                                                            i9++;
                                                            objArr = objArr2;
                                                            jArr5 = jArr6;
                                                            jArr4 = jArr2;
                                                            i8 = 8;
                                                        }
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j = j3;
                                                    }
                                                    zD = dVar.d();
                                                } else {
                                                    jArr2 = jArr4;
                                                    j = j3;
                                                    Intrinsics.h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                                    zD = !((b0) obj2).u();
                                                }
                                                if (zD) {
                                                    k58Var.v(i7);
                                                }
                                                i = 8;
                                            } else {
                                                jArr2 = jArr4;
                                                j = j3;
                                                c = c2;
                                                j2 = j4;
                                                i = i4;
                                            }
                                            j3 = j >> i;
                                            i6++;
                                            i4 = i;
                                            c2 = c;
                                            j4 = j2;
                                            jArr4 = jArr2;
                                        }
                                        jArr = jArr4;
                                        if (i5 != i4) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr4;
                                    }
                                    if (i3 == length) {
                                        break;
                                    }
                                    i3++;
                                    jArr4 = jArr;
                                    i2 = 0;
                                }
                            }
                            D();
                            Unit unit2 = Unit.a;
                            vbd.a.b(objA2);
                        } catch (Throwable th) {
                            vbd.a.b(objA2);
                            throw th;
                        }
                    }
                    try {
                        if (this.lateChanges.c() && this.pendingPausedComposition == null) {
                            this.rememberManager.j();
                        }
                    } finally {
                        this.rememberManager.i();
                    }
                } catch (Throwable th2) {
                    vbd.a.b(objA);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (this.lateChanges.c() && this.pendingPausedComposition == null) {
                    this.rememberManager.j();
                }
                throw th3;
            } finally {
                this.rememberManager.i();
            }
        }
    }

    private final void D() {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        boolean zD;
        long[] jArr3;
        int i3;
        int i4;
        k58<Object, Object> k58Var = this.derivedStates;
        long[] jArr4 = k58Var.metadata;
        int length = jArr4.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (length >= 0) {
            int i6 = 0;
            long j8 = 128;
            while (true) {
                long j9 = jArr4[i6];
                j2 = 255;
                if ((((~j9) << c3) & j9 & j7) != j7) {
                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j9 & 255) < j8) {
                            c2 = c3;
                            int i9 = (i6 << 3) + i8;
                            j5 = j7;
                            Object obj = k58Var.keys[i9];
                            Object obj2 = k58Var.values[i9];
                            if (obj2 instanceof d) {
                                Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                d dVar = (d) obj2;
                                Object[] objArr = dVar.elements;
                                long[] jArr5 = dVar.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i10 = 0;
                                    int i11 = i5;
                                    while (true) {
                                        int i12 = length2;
                                        long j10 = jArr5[i10];
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i10 - i12)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & 255) < j6) {
                                                    jArr3 = jArr4;
                                                    int i15 = (i10 << 3) + i14;
                                                    i3 = i14;
                                                    i4 = i8;
                                                    if (!r6b.f(this.observations, (j) objArr[i15])) {
                                                        dVar.A(i15);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i3 = i14;
                                                    i4 = i8;
                                                }
                                                j10 >>= i11;
                                                i14 = i3 + 1;
                                                i8 = i4;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i = i8;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i = i8;
                                        }
                                        length2 = i12;
                                        if (i10 == length2) {
                                            break;
                                        }
                                        i10++;
                                        j9 = j4;
                                        i8 = i;
                                        jArr4 = jArr2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                zD = dVar.d();
                            } else {
                                jArr2 = jArr4;
                                j4 = j9;
                                i = i8;
                                j6 = j8;
                                Intrinsics.h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                zD = !r6b.f(this.observations, (j) obj2);
                            }
                            if (zD) {
                                k58Var.v(i9);
                            }
                            i2 = 8;
                        } else {
                            jArr2 = jArr4;
                            j4 = j9;
                            i = i8;
                            c2 = c3;
                            j5 = j7;
                            j6 = j8;
                            i2 = i5;
                        }
                        j9 = j4 >> i2;
                        i8 = i + 1;
                        i5 = i2;
                        c3 = c2;
                        j7 = j5;
                        j8 = j6;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                    if (i7 != i5) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c = c3;
                    j = j7;
                    j3 = j8;
                }
                if (i6 == length) {
                    break;
                }
                i6++;
                c3 = c;
                j7 = j;
                j8 = j3;
                jArr4 = jArr;
                i5 = 8;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.e()) {
            return;
        }
        d<b0> dVar2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = dVar2.elements;
        long[] jArr6 = dVar2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i16 = 0;
        while (true) {
            long j11 = jArr6[i16];
            if ((((~j11) << c) & j11 & j) != j) {
                int i17 = 8 - ((~(i16 - length3)) >>> 31);
                for (int i18 = 0; i18 < i17; i18++) {
                    if ((j11 & j2) < j3) {
                        int i19 = (i16 << 3) + i18;
                        if (!((b0) objArr2[i19]).w()) {
                            dVar2.A(i19);
                        }
                    }
                    j11 >>= 8;
                }
                if (i17 != 8) {
                    return;
                }
            }
            if (i16 == length3) {
                return;
            } else {
                i16++;
            }
        }
    }

    private final boolean E() {
        boolean z;
        synchronized (this.lock) {
            z = true;
            if (this.state != 1) {
                z = false;
            }
            if (z) {
                this.state = 0;
            }
        }
        return z;
    }

    private final void F(Function2<? super d, ? super Integer, Unit> content) {
        this.composable = content;
        this.parent.a(this, content);
    }

    private final f49 G(boolean reusable, Function2<? super d, ? super Integer, Unit> content) {
        if (!(this.pendingPausedComposition == null)) {
            ei9.b("A pausable composition is in progress");
        }
        g49 g49Var = new g49(this, this.parent, this.composer, this.abandonSet, content, reusable, this.applier, this.lock);
        this.pendingPausedComposition = g49Var;
        return g49Var;
    }

    private final void H(Function2<? super d, ? super Integer, Unit> content) {
        this.composer.q0();
        F(content);
        this.composer.f0();
    }

    private final g81 I() {
        return bq1.isLinkBufferComposerEnabled ? new b81() : new c81();
    }

    private final o J() {
        if (!bq1.isLinkBufferComposerEnabled) {
            return new k(this.applier, this.parent, tub.o(this.slotStorage), this.abandonSet, this.changes, this.lateChanges, this.observerHolder, this);
        }
        return new s(this.applier, this.parent, this.abandonSet, sub.f(this.slotStorage), this.changes, this.lateChanges, this.observerHolder, this);
    }

    private final cub K() {
        if (!bq1.isLinkBufferComposerEnabled) {
            return new fub();
        }
        return new eub(0, null, false, false, 15, null);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void L() throws KotlinNothingValueException {
        Object andSet = this.pendingModifications.getAndSet(yr1.a);
        if (andSet != null) {
            if (Intrinsics.e(andSet, yr1.a)) {
                e.c("pending composition has not been applied");
                throw new KotlinNothingValueException();
            }
            if (andSet instanceof Set) {
                B((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                e.c("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new KotlinNothingValueException();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                B(set, true);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void M() throws KotlinNothingValueException {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (Intrinsics.e(andSet, yr1.a)) {
            return;
        }
        if (andSet instanceof Set) {
            B((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                B(set, false);
            }
            return;
        }
        if (andSet != null) {
            e.c("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        if (this.pendingPausedComposition == null) {
            e.b("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void N() throws KotlinNothingValueException {
        Object andSet = this.pendingModifications.getAndSet(l0.e());
        if (Intrinsics.e(andSet, yr1.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            B((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            e.c("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new KotlinNothingValueException();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            B(set, false);
        }
    }

    private final void O() {
        String str;
        int i = this.state;
        if (!(i == 0)) {
            if (i == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i != 2) {
                str = i != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            ei9.b(str);
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        ei9.b("A pausable composition is in progress");
    }

    private final boolean Q() {
        return this.composer.g0();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009e A[Catch: all -> 0x001e, LOOP:0: B:31:0x005d->B:45:0x009e, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:23:0x003c, B:24:0x0045, B:26:0x004d, B:28:0x0051, B:31:0x005d, B:33:0x006d, B:35:0x0079, B:37:0x0083, B:41:0x0092, B:45:0x009e, B:46:0x00a1, B:49:0x00a6), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[Catch: all -> 0x001e, EDGE_INSN: B:49:0x00a6->B:50:0x00ab BREAK  A[LOOP:0: B:31:0x005d->B:45:0x009e], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:23:0x003c, B:24:0x0045, B:26:0x004d, B:28:0x0051, B:31:0x005d, B:33:0x006d, B:35:0x0079, B:37:0x0083, B:41:0x0092, B:45:0x009e, B:46:0x00a1, B:49:0x00a6), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6 A[SYNTHETIC] */
    private final InvalidationResult U(b0 scope, mg anchor, Object instance) {
        synchronized (this.lock) {
            try {
                g gVar = this.invalidationDelegate;
                g gVar2 = null;
                if (gVar != null) {
                    if (!this.slotStorage.n(this.invalidationDelegateGroup, anchor)) {
                        gVar = null;
                    }
                    gVar2 = gVar;
                }
                if (gVar2 == null) {
                    if (b0(scope, instance)) {
                        return InvalidationResult.IMMINENT;
                    }
                    if (instance != null && (instance instanceof j)) {
                        Object objE = this.invalidations.e(scope);
                        if (objE != null) {
                            if (!(objE instanceof d)) {
                                if (objE != q6b.a) {
                                    r6b.a(this.invalidations, scope, instance);
                                    break;
                                }
                            } else {
                                d dVar = (d) objE;
                                Object[] objArr = dVar.elements;
                                long[] jArr = dVar.metadata;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    r6b.a(this.invalidations, scope, instance);
                                    break;
                                }
                                int i = 0;
                                loop0: while (true) {
                                    long j = jArr[i];
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i == length) {
                                            r6b.a(this.invalidations, scope, instance);
                                            break;
                                        }
                                        i++;
                                    } else {
                                        int i2 = 8;
                                        int i3 = 8 - ((~(i - length)) >>> 31);
                                        int i4 = 0;
                                        while (i4 < i3) {
                                            if ((j & 255) < 128 && objArr[(i << 3) + i4] == q6b.a) {
                                                break loop0;
                                            }
                                            j >>= i2;
                                            i4++;
                                            i2 = i2;
                                        }
                                        if (i3 == i2) {
                                            if (i == length) {
                                                i++;
                                            }
                                        }
                                        r6b.a(this.invalidations, scope, instance);
                                        break;
                                    }
                                }
                            }
                        } else {
                            r6b.a(this.invalidations, scope, instance);
                            break;
                        }
                    } else {
                        r6b.o(this.invalidations, scope, q6b.a);
                    }
                }
                if (gVar2 != null) {
                    return gVar2.U(scope, anchor, instance);
                }
                this.parent.o(this);
                return q() ? InvalidationResult.DEFERRED : InvalidationResult.SCHEDULED;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void V(Object value) {
        Object objE = this.observations.e(value);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof d)) {
            b0 b0Var = (b0) objE;
            if (b0Var.v(value) == InvalidationResult.IMMINENT) {
                r6b.a(this.observationsProcessed, value, b0Var);
                return;
            }
            return;
        }
        d dVar = (d) objE;
        Object[] objArr = dVar.elements;
        long[] jArr = dVar.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128) {
                        b0 b0Var2 = (b0) objArr[(i << 3) + i3];
                        if (b0Var2.v(value) == InvalidationResult.IMMINENT) {
                            r6b.a(this.observationsProcessed, value, b0Var2);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    private final is1 W() {
        this.observerHolder.a();
        return null;
    }

    private final k58<Object, Object> a0() {
        k58<Object, Object> k58Var = this.invalidations;
        this.invalidations = r6b.e(null, 1, null);
        return k58Var;
    }

    private final boolean b0(b0 scope, Object instance) {
        return q() && this.composer.r0(scope, instance);
    }

    public final List<Pair<b0, Object>> P(mg anchor) {
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j;
        char c;
        long j2;
        int i3;
        boolean zD;
        Object[] objArr;
        int i4;
        long j3;
        Object[] objArr2;
        if (r6b.i(this.invalidations) <= 0) {
            return m.p();
        }
        ArrayList arrayList = new ArrayList();
        cub cubVar = this.slotStorage;
        k58<Object, Object> k58Var = this.invalidations;
        long[] jArr3 = k58Var.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i5 = 0;
            while (true) {
                long j4 = jArr3[i5];
                char c2 = 7;
                long j5 = -9187201950435737472L;
                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i6 = 8;
                    int i7 = 8 - ((~(i5 - length)) >>> 31);
                    int i8 = 0;
                    while (i8 < i7) {
                        if ((j4 & 255) < 128) {
                            c = c2;
                            int i9 = (i5 << 3) + i8;
                            j2 = j5;
                            Object obj = k58Var.keys[i9];
                            Object obj2 = k58Var.values[i9];
                            int i10 = i6;
                            Intrinsics.h(obj, "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.ScopeMap");
                            if (obj2 instanceof d) {
                                Intrinsics.h(obj2, "null cannot be cast to non-null type androidx.collection.MutableScatterSet<Scope of androidx.compose.runtime.collection.ScopeMap>");
                                d dVar = (d) obj2;
                                Object[] objArr3 = dVar.elements;
                                long[] jArr4 = dVar.metadata;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j = j4;
                                    int i11 = 0;
                                    while (true) {
                                        long j6 = jArr4[i11];
                                        i = length;
                                        i2 = i8;
                                        if ((((~j6) << c) & j6 & j2) != j2) {
                                            int i12 = 8 - ((~(i11 - length2)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j6 & 255) < 128) {
                                                    i4 = i13;
                                                    int i14 = (i11 << 3) + i4;
                                                    j3 = j6;
                                                    Object obj3 = objArr3[i14];
                                                    b0 b0Var = (b0) obj;
                                                    objArr2 = objArr3;
                                                    mg mgVarH = b0Var.getAnchor();
                                                    if (mgVarH != null && cubVar.o(anchor, mgVarH)) {
                                                        arrayList.add(qjd.a(b0Var, obj3));
                                                        dVar.A(i14);
                                                    }
                                                } else {
                                                    i4 = i13;
                                                    j3 = j6;
                                                    objArr2 = objArr3;
                                                }
                                                j6 = j3 >> i10;
                                                i13 = i4 + 1;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i11 == length2) {
                                            break;
                                        }
                                        i11++;
                                        length = i;
                                        i8 = i2;
                                        objArr3 = objArr;
                                        i10 = 8;
                                    }
                                } else {
                                    i = length;
                                    i2 = i8;
                                    j = j4;
                                }
                                zD = dVar.d();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i8;
                                j = j4;
                                Intrinsics.h(obj2, "null cannot be cast to non-null type Scope of androidx.compose.runtime.collection.ScopeMap");
                                b0 b0Var2 = (b0) obj;
                                mg mgVarH2 = b0Var2.getAnchor();
                                if (mgVarH2 == null || !cubVar.o(anchor, mgVarH2)) {
                                    zD = false;
                                } else {
                                    arrayList.add(qjd.a(b0Var2, obj2));
                                    zD = true;
                                }
                            }
                            if (zD) {
                                k58Var.v(i9);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i8;
                            j = j4;
                            c = c2;
                            j2 = j5;
                            i3 = i6;
                        }
                        j4 = j >> i3;
                        i6 = i3;
                        c2 = c;
                        j5 = j2;
                        jArr3 = jArr2;
                        length = i;
                        i8 = i2 + 1;
                    }
                    jArr = jArr3;
                    int i15 = length;
                    if (i7 != i6) {
                        break;
                    }
                    length = i15;
                } else {
                    jArr = jArr3;
                }
                if (i5 == length) {
                    break;
                }
                i5++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final o getComposer() {
        return this.composer;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final js1 getObserverHolder() {
        return this.observerHolder;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final cub getSlotStorage() {
        return this.slotStorage;
    }

    public final void X(ScatterSet<zea> ignoreSet) {
        this.pendingPausedComposition = null;
        if (ignoreSet != null) {
            this.rememberManager.q(ignoreSet);
            this.state = 2;
        }
    }

    public final void Y(j<?> state) {
        if (r6b.f(this.observations, state)) {
            return;
        }
        r6b.n(this.derivedStates, state);
    }

    public final void Z(Object instance, b0 scope) {
        r6b.m(this.observations, instance, scope);
    }

    @Override // com.google.inputmethod.x22, com.google.inputmethod.taa
    public void a(Object value) {
        b0 b0VarH0;
        int i;
        int i2;
        if (Q() || (b0VarH0 = this.composer.h0()) == null) {
            return;
        }
        int i3 = 1;
        b0VarH0.O(true);
        boolean z = b0VarH0.z(value);
        W();
        if (z) {
            return;
        }
        if (value instanceof b7c) {
            ((b7c) value).m(e.a(1));
        }
        r6b.a(this.observations, value, b0VarH0);
        if (value instanceof j) {
            j<?> jVar = (j) value;
            j.a<?> aVarE = jVar.E();
            r6b.n(this.derivedStates, value);
            wl8<a7c> wl8VarB = aVarE.b();
            Object[] objArr = wl8VarB.keys;
            long[] jArr = wl8VarB.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i4 = 0;
                while (true) {
                    long j = jArr[i4];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8;
                        int i6 = 8 - ((~(i4 - length)) >>> 31);
                        int i7 = 0;
                        while (i7 < i6) {
                            if ((j & 255) < 128) {
                                i2 = i3;
                                a7c a7cVar = (a7c) objArr[(i4 << 3) + i7];
                                if (a7cVar instanceof b7c) {
                                    ((b7c) a7cVar).m(e.a(i2));
                                }
                                r6b.a(this.derivedStates, a7cVar, value);
                            } else {
                                i2 = i3;
                                i5 = i5;
                            }
                            j >>= i5;
                            i7++;
                            i3 = i2;
                            i5 = i5;
                        }
                        i = i3;
                        if (i6 != i5) {
                            break;
                        }
                    } else {
                        i = i3;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    i3 = i;
                }
            }
            b0VarH0.y(jVar, aVarE.a());
        }
    }

    @Override // com.google.inputmethod.d49
    public f49 b(Function2<? super d, ? super Integer, Unit> content) {
        return G(E(), content);
    }

    @Override // com.google.inputmethod.pr1
    public void c(Function2<? super d, ? super Integer, Unit> content) {
        boolean zE = E();
        O();
        if (zE) {
            H(content);
        } else {
            F(content);
        }
    }

    public final void c0() {
        synchronized (this.lock) {
            N();
            k58<Object, Object> k58VarA0 = a0();
            try {
                this.composer.s0(k58VarA0);
                Unit unit = Unit.a;
            } catch (Throwable th) {
                this.invalidations = k58VarA0;
                throw th;
            }
        }
    }

    @Override // com.google.inputmethod.taa
    public void d(b0 scope) {
        this.pendingInvalidScopes = true;
        W();
    }

    @Override // com.google.inputmethod.bna
    public void deactivate() {
        synchronized (this.lock) {
            try {
                if (!(this.pendingPausedComposition == null)) {
                    ei9.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean zIsEmpty = this.slotStorage.isEmpty();
                if (!zIsEmpty || !this.abandonSet.isEmpty()) {
                    vbd vbdVar = vbd.a;
                    Object objA = vbdVar.a("Compose:deactivate");
                    try {
                        rea reaVar = this.rememberManager;
                        try {
                            reaVar.r(this.abandonSet, this.composer.j0());
                            if (!zIsEmpty) {
                                this.applier.e();
                                this.slotStorage.e(this.rememberManager);
                                this.applier.c();
                                reaVar.m();
                            }
                            reaVar.j();
                            reaVar.i();
                            Unit unit = Unit.a;
                            vbdVar.b(objA);
                        } catch (Throwable th) {
                            reaVar.i();
                            throw th;
                        }
                    } catch (Throwable th2) {
                        vbd.a.b(objA);
                        throw th2;
                    }
                }
                r6b.c(this.observations);
                r6b.c(this.derivedStates);
                r6b.c(this.invalidations);
                this.changes.a();
                this.lateChanges.a();
                this.composer.d0();
                this.state = 1;
                Unit unit2 = Unit.a;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.inputmethod.pr1
    public void dispose() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    ei9.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.state != 3) {
                    this.state = 3;
                    this.composable = uo1.a.c();
                    g81 g81VarI0 = this.composer.getDeferredChanges();
                    if (g81VarI0 != null) {
                        C(g81VarI0);
                    }
                    boolean zIsEmpty = this.slotStorage.isEmpty();
                    if (!zIsEmpty || !this.abandonSet.isEmpty()) {
                        rea reaVar = this.rememberManager;
                        try {
                            reaVar.r(this.abandonSet, this.composer.j0());
                            if (!zIsEmpty) {
                                this.applier.e();
                                this.slotStorage.b(this.rememberManager);
                                this.applier.clear();
                                this.applier.c();
                                reaVar.m();
                            }
                            reaVar.j();
                            reaVar.i();
                        } catch (Throwable th) {
                            reaVar.i();
                            throw th;
                        }
                    }
                    this.composer.e0();
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.parent.z(this);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // com.google.inputmethod.x22
    public boolean e(Set<? extends Object> values) {
        if (values instanceof ScatterSetWrapper) {
            ScatterSet scatterSetB = ((ScatterSetWrapper) values).b();
            Object[] objArr = scatterSetB.elements;
            long[] jArr = scatterSetB.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (r6b.f(this.observations, obj) || r6b.f(this.derivedStates, obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : values) {
                if (r6b.f(this.observations, obj2) || r6b.f(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.inputmethod.bna
    public void f(Function2<? super d, ? super Integer, Unit> content) {
        E();
        O();
        H(content);
    }

    @Override // com.google.inputmethod.d49
    public f49 g(Function2<? super d, ? super Integer, Unit> content) {
        E();
        O();
        return G(true, content);
    }

    @Override // com.google.inputmethod.x22
    public void h() {
        synchronized (this.lock) {
            try {
                this.composer.b0();
                if (!this.abandonSet.isEmpty()) {
                    rea reaVar = this.rememberManager;
                    try {
                        reaVar.r(this.abandonSet, this.composer.j0());
                        reaVar.j();
                        reaVar.i();
                    } catch (Throwable th) {
                        reaVar.i();
                        throw th;
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rea reaVar2 = this.rememberManager;
                        try {
                            reaVar2.r(this.abandonSet, this.composer.j0());
                            reaVar2.j();
                        } finally {
                            reaVar2.i();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    v();
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.inputmethod.x22
    public void i(Function2<? super d, ? super Integer, Unit> content) {
        try {
            synchronized (this.lock) {
                L();
                k58<Object, Object> k58VarA0 = a0();
                try {
                    this.composer.c0(k58VarA0, content, this.shouldPause);
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    this.invalidations = k58VarA0;
                    throw th;
                }
            }
        } catch (Throwable th2) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    rea reaVar = this.rememberManager;
                    try {
                        reaVar.r(this.abandonSet, this.composer.j0());
                        reaVar.j();
                    } finally {
                        reaVar.i();
                    }
                }
                throw th2;
            } catch (Throwable th3) {
                v();
                throw th3;
            }
        }
    }

    @Override // com.google.inputmethod.pr1
    public boolean isDisposed() {
        return this.state == 3;
    }

    @Override // com.google.inputmethod.x22
    public void j() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.d()) {
                    C(this.lateChanges);
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rea reaVar = this.rememberManager;
                        try {
                            reaVar.r(this.abandonSet, this.composer.j0());
                            reaVar.j();
                        } finally {
                            reaVar.i();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    v();
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.inputmethod.x22
    public void k(List<Pair<r08, r08>> references) {
        int size = references.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                z = true;
                break;
            } else if (!Intrinsics.e(((r08) references.get(i).c()).getComposition(), this)) {
                break;
            } else {
                i++;
            }
        }
        if (!z) {
            e.b("Check failed");
        }
        try {
            this.composer.d(references);
            Unit unit = Unit.a;
        } catch (Throwable th) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    rea reaVar = this.rememberManager;
                    try {
                        reaVar.r(this.abandonSet, this.composer.j0());
                        reaVar.j();
                    } finally {
                        reaVar.i();
                    }
                }
                throw th;
            } catch (Throwable th2) {
                v();
                throw th2;
            }
        }
    }

    @Override // com.google.inputmethod.x22
    public boolean l() {
        synchronized (this.lock) {
            g49 g49Var = this.pendingPausedComposition;
            if (g49Var != null && !g49Var.f()) {
                g49Var.h();
                g49Var.d().l();
                return false;
            }
            L();
            try {
                k58<Object, Object> k58VarA0 = a0();
                try {
                    boolean zO0 = this.composer.o0(k58VarA0, this.shouldPause);
                    if (!zO0) {
                        M();
                    }
                    return zO0;
                } catch (Throwable th) {
                    this.invalidations = k58VarA0;
                    throw th;
                }
            } catch (Throwable th2) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rea reaVar = this.rememberManager;
                        try {
                            reaVar.r(this.abandonSet, this.composer.j0());
                            reaVar.j();
                        } finally {
                            reaVar.i();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    v();
                    throw th3;
                }
            }
        }
    }

    @Override // com.google.inputmethod.taa
    public InvalidationResult m(b0 scope, Object instance) {
        g gVar;
        if (scope.j()) {
            scope.F(true);
        }
        mg mgVarH = scope.getAnchor();
        if (mgVarH == null || !mgVarH.a()) {
            return InvalidationResult.IGNORED;
        }
        if (!this.slotStorage.r(scope)) {
            synchronized (this.lock) {
                gVar = this.invalidationDelegate;
            }
            return (gVar == null || !gVar.b0(scope, instance)) ? InvalidationResult.IGNORED : InvalidationResult.IMMINENT;
        }
        if (!scope.i()) {
            return InvalidationResult.IGNORED;
        }
        InvalidationResult invalidationResultU = U(scope, mgVarH, instance);
        if (invalidationResultU != InvalidationResult.IGNORED) {
            W();
        }
        return invalidationResultU;
    }

    @Override // com.google.inputmethod.x22
    public void n(Function0<Unit> block) {
        this.composer.n0(block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.inputmethod.x22
    public void o(Set<? extends Object> values) {
        Object obj;
        Object objN;
        do {
            obj = this.pendingModifications.get();
            if (obj == null || Intrinsics.e(obj, yr1.a)) {
                objN = values;
            } else if (obj instanceof Set) {
                objN = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.collections.Set<kotlin.Any>>");
                objN = f.N((Set[]) obj, values);
            }
        } while (!w58.a(this.pendingModifications, obj, objN));
        if (obj == null) {
            synchronized (this.lock) {
                M();
                Unit unit = Unit.a;
            }
        }
    }

    @Override // com.google.inputmethod.x22
    public void p() {
        synchronized (this.lock) {
            try {
                C(this.changes);
                M();
                Unit unit = Unit.a;
            } catch (Throwable th) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        rea reaVar = this.rememberManager;
                        try {
                            reaVar.r(this.abandonSet, this.composer.j0());
                            reaVar.j();
                        } finally {
                            reaVar.i();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    v();
                    throw th2;
                }
            }
        }
    }

    @Override // com.google.inputmethod.x22
    public boolean q() {
        return this.composer.getIsComposing();
    }

    @Override // com.google.inputmethod.x22
    public void r(q08 state) {
        rea reaVar = this.rememberManager;
        try {
            reaVar.r(this.abandonSet, this.composer.j0());
            state.getSlotStorage().i(this.rememberManager, state);
            reaVar.m();
        } finally {
            reaVar.i();
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    @Override // com.google.inputmethod.x22
    public void s(Object value) {
        synchronized (this.lock) {
            try {
                V(value);
                Object objE = this.derivedStates.e(value);
                if (objE != null) {
                    if (objE instanceof d) {
                        d dVar = (d) objE;
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
                                            V((j) objArr[(i << 3) + i3]);
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
                    } else {
                        V((j) objE);
                    }
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.inputmethod.pr1
    public boolean t() {
        boolean z;
        synchronized (this.lock) {
            z = r6b.i(this.invalidations) > 0;
        }
        return z;
    }

    @Override // com.google.inputmethod.x22
    public fob u(fob shouldPause) {
        fob fobVar = this.shouldPause;
        this.shouldPause = shouldPause;
        return fobVar;
    }

    @Override // com.google.inputmethod.x22
    public void v() {
        this.pendingModifications.set(null);
        this.changes.a();
        this.lateChanges.a();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        rea reaVar = this.rememberManager;
        try {
            reaVar.r(this.abandonSet, this.composer.j0());
            reaVar.j();
        } finally {
            reaVar.i();
        }
    }

    @Override // com.google.inputmethod.x22
    public void w() {
        this.slotStorage.q();
    }

    @Override // com.google.inputmethod.x22
    public <R> R x(x22 to, int groupIndex, Function0<? extends R> block) {
        if (to == null || Intrinsics.e(to, this) || groupIndex < 0) {
            return (R) block.invoke();
        }
        this.invalidationDelegate = (g) to;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return (R) block.invoke();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }
}
