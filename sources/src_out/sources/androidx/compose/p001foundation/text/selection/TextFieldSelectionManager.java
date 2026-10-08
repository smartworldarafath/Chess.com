package androidx.compose.p001foundation.text.selection;

import androidx.compose.p001foundation.text.Handle;
import androidx.compose.p001foundation.text.HandleState;
import androidx.compose.p001foundation.text.contextmenu.modifier.e;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.focus.f;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.x;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.ta2;
import com.google.inputmethod.TextFieldValue;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.a39;
import com.google.inputmethod.asc;
import com.google.inputmethod.c65;
import com.google.inputmethod.dwc;
import com.google.inputmethod.e65;
import com.google.inputmethod.f43;
import com.google.inputmethod.feb;
import com.google.inputmethod.ff3;
import com.google.inputmethod.gba;
import com.google.inputmethod.gsc;
import com.google.inputmethod.heb;
import com.google.inputmethod.j08;
import com.google.inputmethod.jf1;
import com.google.inputmethod.k07;
import com.google.inputmethod.kn6;
import com.google.inputmethod.kzc;
import com.google.inputmethod.mf1;
import com.google.inputmethod.nce;
import com.google.inputmethod.o0e;
import com.google.inputmethod.o58;
import com.google.inputmethod.p9d;
import com.google.inputmethod.q9d;
import com.google.inputmethod.qb9;
import com.google.inputmethod.rn8;
import com.google.inputmethod.rsd;
import com.google.inputmethod.ssc;
import com.google.inputmethod.t04;
import com.google.inputmethod.up1;
import com.google.inputmethod.urc;
import com.google.inputmethod.uxc;
import com.google.inputmethod.wxc;
import com.google.inputmethod.yzc;
import com.google.inputmethod.zn8;
import com.google.inputmethod.zyc;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.s;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010$\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\b2\b\b\u0002\u00103\u001a\u00020\u000fH\u0000¢\u0006\u0004\b4\u0010\u0012J\u000f\u00105\u001a\u00020\bH\u0000¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u00020\b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0006H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\bH\u0000¢\u0006\u0004\b>\u00106J\u000f\u0010?\u001a\u00020\u000fH\u0000¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\bH\u0080@¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010@J\u000f\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010@J\u000f\u0010E\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010@J\u000f\u0010F\u001a\u00020\u000fH\u0000¢\u0006\u0004\bF\u0010@J\u001b\u0010H\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010G\u001a\u00020\u000fH\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010J\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010G\u001a\u00020\u000fH\u0000¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\bL\u0010\u0015J\u0017\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020*H\u0000¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\bP\u0010\u0015J\u0011\u0010Q\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\bH\u0000¢\u0006\u0004\bS\u00106J\u000f\u0010T\u001a\u00020\bH\u0000¢\u0006\u0004\bT\u00106J\u0017\u0010U\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020ZH\u0000¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\bH\u0000¢\u0006\u0004\b^\u00106J\u000f\u0010_\u001a\u00020\bH\u0000¢\u0006\u0004\b_\u00106J\u000f\u0010`\u001a\u00020\u000fH\u0000¢\u0006\u0004\b`\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\"\u0010l\u001a\u00020e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR.\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010|\u001a\u0004\u0018\u00010u8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R2\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010 \u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R,\u0010¨\u0001\u001a\u0005\u0018\u00010¡\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R,\u0010°\u0001\u001a\u0005\u0018\u00010©\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R,\u0010¸\u0001\u001a\u0005\u0018\u00010±\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R,\u0010À\u0001\u001a\u0005\u0018\u00010¹\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R0\u0010Å\u0001\u001a\u00020\u000f2\u0007\u0010Á\u0001\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÂ\u0001\u0010\u007f\u001a\u0005\bÃ\u0001\u0010@\"\u0005\bÄ\u0001\u0010\u0012R0\u0010É\u0001\u001a\u00020\u000f2\u0007\u0010Á\u0001\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÆ\u0001\u0010\u007f\u001a\u0005\bÇ\u0001\u0010@\"\u0005\bÈ\u0001\u0010\u0012R\u0018\u0010Ë\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÊ\u0001\u0010QR\u001b\u0010Î\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ð\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010QR8\u0010×\u0001\u001a\u0005\u0018\u00010Ñ\u00012\n\u0010Á\u0001\u001a\u0005\u0018\u00010Ñ\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bÒ\u0001\u0010\u007f\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R5\u0010Ü\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bØ\u0001\u0010\u007f\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0005\bÛ\u0001\u00109R\u0019\u0010ß\u0001\u001a\u00030Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÞ\u0001\u0010PR\u0018\u0010á\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010à\u0001R\u001b\u0010ä\u0001\u001a\u0005\u0018\u00010â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010ã\u0001R)\u0010è\u0001\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b?\u0010Í\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0005\bç\u0001\u0010\nR/\u0010ë\u0001\u001a\u00020\u000f2\u0007\u0010Á\u0001\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0014\n\u0004\bD\u0010\u007f\u001a\u0005\bé\u0001\u0010@\"\u0005\bê\u0001\u0010\u0012R0\u0010ó\u0001\u001a\u00030ì\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\bC\u0010í\u0001\u0012\u0005\bò\u0001\u00106\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R\u001d\u0010ö\u0001\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bE\u0010ô\u0001\u001a\u0005\bõ\u0001\u00102R\u001f\u0010û\u0001\u001a\u00030÷\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b>\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R&\u0010þ\u0001\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bH\u0010¼\u0001\u001a\u0005\bü\u0001\u0010@\"\u0005\bý\u0001\u0010\u0012R\u0016\u0010\u0080\u0002\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÿ\u0001\u0010@R\u0016\u0010\u0082\u0002\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0002\u0010@R(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0018\u0010\u0088\u0002\u001a\u0004\u0018\u00010*8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0002\u0010RR\u0015\u0010\u008c\u0002\u001a\u00030\u0089\u00028F¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001d\u0010\u008f\u0002\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0002\u00106\u001a\u0005\b\u008d\u0002\u0010@¨\u0006\u0090\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "", "Lcom/google/android/rsd;", "undoManager", "<init>", "(Lcom/google/android/rsd;)V", "Landroidx/compose/ui/text/x;", "selection", "", "u0", "(Landroidx/compose/ui/text/x;)V", "Lkotlin/Pair;", "", "S", "()Lkotlin/Pair;", "", "show", "Y0", "(Z)V", "Lkotlinx/coroutines/s;", "W0", "()Lkotlinx/coroutines/s;", "Lcom/google/android/gba;", "Q", "()Lcom/google/android/gba;", "Lcom/google/android/cwc;", "value", "Lcom/google/android/rn8;", "currentPosition", "isStartOfSelection", "isStartHandle", "Landroidx/compose/foundation/text/selection/f;", "adjustment", "isTouchBasedSelection", "Lcom/google/android/e65;", "hapticFeedbackType", "Z0", "(Lcom/google/android/cwc;JZZLandroidx/compose/foundation/text/selection/f;ZLcom/google/android/e65;)J", "Landroidx/compose/foundation/text/HandleState;", "handleState", "H0", "(Landroidx/compose/foundation/text/HandleState;)V", "Landroidx/compose/ui/text/b;", "annotatedString", "G", "(Landroidx/compose/ui/text/b;J)Lcom/google/android/cwc;", "Lcom/google/android/gsc;", "q0", "(Z)Lcom/google/android/gsc;", "H", "()Lcom/google/android/gsc;", "showFloatingToolbar", "M", "O", "()V", "position", "K", "(Lcom/google/android/rn8;)V", "range", "P0", "(J)V", "C0", "B", "x", "()Z", "X0", "(Lcom/google/android/q22;)Ljava/lang/Object;", "z", "y", "A", "w", "cancelSelection", "C", "(Z)Lkotlinx/coroutines/s;", "E", "(Z)Landroidx/compose/ui/text/b;", "w0", "text", "x0", "(Landroidx/compose/ui/text/b;)V", "I", "J", "()Landroidx/compose/ui/text/b;", "y0", "v", "b0", "(Z)J", "", "a0", "(Z)F", "Lcom/google/android/f43;", "density", "V", "(Lcom/google/android/f43;)J", "V0", "r0", "t0", "a", "Lcom/google/android/rsd;", "getUndoManager", "()Lcom/google/android/rsd;", "Lcom/google/android/zn8;", "b", "Lcom/google/android/zn8;", "h0", "()Lcom/google/android/zn8;", "L0", "(Lcom/google/android/zn8;)V", "offsetMapping", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "i0", "()Lkotlin/jvm/functions/Function1;", "M0", "(Lkotlin/jvm/functions/Function1;)V", "onValueChange", "Lcom/google/android/k07;", "d", "Lcom/google/android/k07;", "k0", "()Lcom/google/android/k07;", "Q0", "(Lcom/google/android/k07;)V", "state", "Lcom/google/android/o58;", "e", "Lcom/google/android/o58;", "valueState", "Lcom/google/android/nce;", "f", "Lcom/google/android/nce;", "getVisualTransformation$foundation", "()Lcom/google/android/nce;", "U0", "(Lcom/google/android/nce;)V", "visualTransformation", "Lkotlin/Function0;", "g", "Lkotlin/jvm/functions/Function0;", "getRequestAutofillAction$foundation", "()Lkotlin/jvm/functions/Function0;", "O0", "(Lkotlin/jvm/functions/Function0;)V", "requestAutofillAction", "Lcom/google/android/jf1;", "h", "Lcom/google/android/jf1;", "P", "()Lcom/google/android/jf1;", "z0", "(Lcom/google/android/jf1;)V", "clipboard", "Lcom/google/android/ta2;", "i", "Lcom/google/android/ta2;", "T", "()Lcom/google/android/ta2;", "A0", "(Lcom/google/android/ta2;)V", "coroutineScope", "Lcom/google/android/qb9;", "j", "Lcom/google/android/qb9;", "j0", "()Lcom/google/android/qb9;", "N0", "(Lcom/google/android/qb9;)V", "platformSelectionBehaviors", "Lcom/google/android/yzc;", "k", "Lcom/google/android/yzc;", "l0", "()Lcom/google/android/yzc;", "R0", "(Lcom/google/android/yzc;)V", "textToolbar", "Lcom/google/android/c65;", "l", "Lcom/google/android/c65;", "c0", "()Lcom/google/android/c65;", "I0", "(Lcom/google/android/c65;)V", "hapticFeedBack", "Landroidx/compose/ui/focus/f;", "m", "Landroidx/compose/ui/focus/f;", "Z", "()Landroidx/compose/ui/focus/f;", "G0", "(Landroidx/compose/ui/focus/f;)V", "focusRequester", "<set-?>", "n", "X", "E0", "editable", "o", "Y", "F0", "enabled", "p", "dragBeginPosition", "q", "Landroidx/compose/ui/text/x;", "dragBeginSelection", "r", "dragTotalDistance", "Landroidx/compose/foundation/text/Handle;", "s", "W", "()Landroidx/compose/foundation/text/Handle;", "D0", "(Landroidx/compose/foundation/text/Handle;)V", "draggingHandle", "t", "U", "()Lcom/google/android/rn8;", "B0", "currentDragPosition", "", "u", "previousRawDragOffset", "Lcom/google/android/cwc;", "oldValue", "Lcom/google/android/heb;", "Lcom/google/android/heb;", "previousSelectionLayout", "f0", "()Landroidx/compose/ui/text/x;", "K0", "latestSelection", "d0", "J0", "hasAvailableTextToPaste", "Lcom/google/android/p9d;", "Lcom/google/android/p9d;", "getToolbarRequester$foundation", "()Lcom/google/android/p9d;", "setToolbarRequester$foundation", "(Lcom/google/android/p9d;)V", "getToolbarRequester$foundation$annotations", "toolbarRequester", "Lcom/google/android/gsc;", "n0", "touchSelectionObserver", "Lcom/google/android/j08;", "Lcom/google/android/j08;", "g0", "()Lcom/google/android/j08;", "mouseSelectionObserver", "getTextToolbarShownViaProvider$foundation", "S0", "textToolbarShownViaProvider", "s0", "isPassword", "e0", "hasSelection", "p0", "()Lcom/google/android/cwc;", "T0", "(Lcom/google/android/cwc;)V", "o0", "transformedText", "Landroidx/compose/ui/b;", "R", "()Landroidx/compose/ui/b;", "contextMenuAreaModifier", "m0", "getTextToolbarShown$foundation$annotations", "textToolbarShown", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextFieldSelectionManager {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final gsc touchSelectionObserver;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final j08 mouseSelectionObserver;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean textToolbarShownViaProvider;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final rsd undoManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private zn8 offsetMapping;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function1<? super TextFieldValue, Unit> onValueChange;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private k07 state;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final o58<TextFieldValue> valueState;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private nce visualTransformation;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private Function0<Unit> requestAutofillAction;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private jf1 clipboard;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private ta2 coroutineScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private qb9 platformSelectionBehaviors;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private yzc textToolbar;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private c65 hapticFeedBack;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private f focusRequester;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final o58 editable;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final o58 enabled;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private long dragBeginPosition;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private x dragBeginSelection;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private long dragTotalDistance;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private final o58 draggingHandle;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private final o58 currentDragPosition;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private int previousRawDragOffset;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private TextFieldValue oldValue;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private heb previousSelectionLayout;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private x latestSelection;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final o58 hasAvailableTextToPaste;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private p9d toolbarRequester;

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$a", "Lcom/google/android/gsc;", "Lcom/google/android/rn8;", "point", "", "a", "(J)V", "d", "()V", "startPoint", "Landroidx/compose/foundation/text/selection/f;", "selectionAdjustment", "c", "(JLandroidx/compose/foundation/text/selection/f;)V", "delta", "b", "g", "onCancel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements gsc {
        a() {
        }

        @Override // com.google.inputmethod.gsc
        public void a(long point) {
        }

        @Override // com.google.inputmethod.gsc
        public void b(long delta) {
            wxc wxcVarN;
            c65 hapticFeedBack;
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragTotalDistance = rn8.q(textFieldSelectionManager.dragTotalDistance, delta);
            k07 state = TextFieldSelectionManager.this.getState();
            if (state == null || (wxcVarN = state.n()) == null) {
                return;
            }
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.B0(rn8.d(rn8.q(textFieldSelectionManager2.dragBeginPosition, textFieldSelectionManager2.dragTotalDistance)));
            zn8 offsetMapping = textFieldSelectionManager2.getOffsetMapping();
            rn8 rn8VarU = textFieldSelectionManager2.U();
            Intrinsics.g(rn8VarU);
            int iA = offsetMapping.a(wxc.e(wxcVarN, rn8VarU.getPackedValue(), false, 2, null));
            long jB = zyc.b(iA, iA);
            if (x.g(jB, textFieldSelectionManager2.p0().getSelection())) {
                return;
            }
            k07 state2 = textFieldSelectionManager2.getState();
            if ((state2 == null || state2.C()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                hapticFeedBack.a(e65.INSTANCE.j());
            }
            textFieldSelectionManager2.i0().invoke(textFieldSelectionManager2.G(textFieldSelectionManager2.p0().getText(), jB));
            textFieldSelectionManager2.K0(x.b(jB));
        }

        @Override // com.google.inputmethod.gsc
        public void c(long startPoint, f selectionAdjustment) {
            wxc wxcVarN;
            long jA = feb.a(TextFieldSelectionManager.this.b0(true));
            k07 state = TextFieldSelectionManager.this.getState();
            if (state == null || (wxcVarN = state.n()) == null) {
                return;
            }
            long jK = wxcVarN.k(jA);
            TextFieldSelectionManager.this.dragBeginPosition = jK;
            TextFieldSelectionManager.this.B0(rn8.d(jK));
            TextFieldSelectionManager.this.dragTotalDistance = rn8.INSTANCE.c();
            TextFieldSelectionManager.this.D0(Handle.Cursor);
            TextFieldSelectionManager.this.Y0(false);
        }

        @Override // com.google.inputmethod.gsc
        public void d() {
            TextFieldSelectionManager.this.D0(null);
            TextFieldSelectionManager.this.B0(null);
        }

        @Override // com.google.inputmethod.gsc
        public void g() {
            TextFieldSelectionManager.this.D0(null);
            TextFieldSelectionManager.this.B0(null);
        }

        @Override // com.google.inputmethod.gsc
        public void onCancel() {
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$b", "Lcom/google/android/gsc;", "Lcom/google/android/rn8;", "point", "", "a", "(J)V", "d", "()V", "startPoint", "Landroidx/compose/foundation/text/selection/f;", "selectionAdjustment", "c", "(JLandroidx/compose/foundation/text/selection/f;)V", "delta", "b", "g", "onCancel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements gsc {
        final /* synthetic */ boolean b;

        b(boolean z) {
            this.b = z;
        }

        @Override // com.google.inputmethod.gsc
        public void a(long point) {
            wxc wxcVarN;
            TextFieldSelectionManager.this.D0(this.b ? Handle.SelectionStart : Handle.SelectionEnd);
            long jA = feb.a(TextFieldSelectionManager.this.b0(this.b));
            k07 state = TextFieldSelectionManager.this.getState();
            if (state == null || (wxcVarN = state.n()) == null) {
                return;
            }
            long jK = wxcVarN.k(jA);
            TextFieldSelectionManager.this.dragBeginPosition = jK;
            TextFieldSelectionManager.this.B0(rn8.d(jK));
            TextFieldSelectionManager.this.dragTotalDistance = rn8.INSTANCE.c();
            TextFieldSelectionManager.this.previousRawDragOffset = -1;
            k07 state2 = TextFieldSelectionManager.this.getState();
            if (state2 != null) {
                state2.M(true);
            }
            TextFieldSelectionManager.this.Y0(false);
        }

        @Override // com.google.inputmethod.gsc
        public void b(long delta) {
            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
            textFieldSelectionManager.dragTotalDistance = rn8.q(textFieldSelectionManager.dragTotalDistance, delta);
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.B0(rn8.d(rn8.q(textFieldSelectionManager2.dragBeginPosition, TextFieldSelectionManager.this.dragTotalDistance)));
            TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
            TextFieldValue textFieldValueP0 = textFieldSelectionManager3.p0();
            rn8 rn8VarU = TextFieldSelectionManager.this.U();
            Intrinsics.g(rn8VarU);
            textFieldSelectionManager3.Z0(textFieldValueP0, rn8VarU.getPackedValue(), false, this.b, f.INSTANCE.k(), true, e65.a(e65.INSTANCE.j()));
            TextFieldSelectionManager.this.Y0(false);
        }

        @Override // com.google.inputmethod.gsc
        public void c(long startPoint, f selectionAdjustment) {
        }

        @Override // com.google.inputmethod.gsc
        public void d() {
            TextFieldSelectionManager.this.D0(null);
            TextFieldSelectionManager.this.B0(null);
            TextFieldSelectionManager.this.Y0(true);
        }

        @Override // com.google.inputmethod.gsc
        public void g() {
            TextFieldSelectionManager.this.D0(null);
            TextFieldSelectionManager.this.B0(null);
            TextFieldSelectionManager.this.Y0(true);
        }

        @Override // com.google.inputmethod.gsc
        public void onCancel() {
        }
    }

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$c", "Lcom/google/android/j08;", "Lcom/google/android/rn8;", "downPosition", "", "e", "(J)Z", "dragPosition", "d", "Landroidx/compose/foundation/text/selection/f;", "adjustment", "", "clickCount", "b", "(JLandroidx/compose/foundation/text/selection/f;I)Z", "a", "(JLandroidx/compose/foundation/text/selection/f;)Z", "Lcom/google/android/cwc;", "value", "currentPosition", "isStartOfSelection", "Landroidx/compose/ui/text/x;", "f", "(Lcom/google/android/cwc;JZLandroidx/compose/foundation/text/selection/f;)J", "", "c", "()V", "Z", "isDoubleOrTripleClickSelectionOnly", "()Z", "setDoubleOrTripleClickSelectionOnly", "(Z)V", "Landroidx/compose/ui/text/x;", "getInitialSelection", "()Landroidx/compose/ui/text/x;", "setInitialSelection", "(Landroidx/compose/ui/text/x;)V", "initialSelection", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements j08 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isDoubleOrTripleClickSelectionOnly = true;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private x initialSelection;

        c() {
        }

        @Override // com.google.inputmethod.j08
        public boolean a(long dragPosition, f adjustment) {
            k07 state;
            if (!TextFieldSelectionManager.this.Y() || TextFieldSelectionManager.this.p0().m().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || state.n() == null) {
                return false;
            }
            f(TextFieldSelectionManager.this.p0(), dragPosition, false, adjustment);
            return true;
        }

        @Override // com.google.inputmethod.j08
        public boolean b(long downPosition, f adjustment, int clickCount) {
            k07 state;
            if (!TextFieldSelectionManager.this.Y() || TextFieldSelectionManager.this.p0().m().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || state.n() == null) {
                return false;
            }
            f focusRequester = TextFieldSelectionManager.this.getFocusRequester();
            if (focusRequester != null) {
                f.h(focusRequester, 0, 1, null);
            }
            TextFieldSelectionManager.this.dragBeginPosition = downPosition;
            TextFieldSelectionManager.this.previousRawDragOffset = -1;
            TextFieldSelectionManager.N(TextFieldSelectionManager.this, false, 1, null);
            long jF = f(TextFieldSelectionManager.this.p0(), TextFieldSelectionManager.this.dragBeginPosition, true, adjustment);
            if (clickCount >= 2) {
                this.isDoubleOrTripleClickSelectionOnly = true;
                this.initialSelection = x.b(jF);
            }
            return true;
        }

        @Override // com.google.inputmethod.j08
        public void c() {
            if (this.isDoubleOrTripleClickSelectionOnly) {
                TextFieldSelectionManager.this.u0(this.initialSelection);
            }
        }

        @Override // com.google.inputmethod.j08
        public boolean d(long dragPosition) {
            k07 state;
            if (!TextFieldSelectionManager.this.Y() || TextFieldSelectionManager.this.p0().m().length() == 0 || (state = TextFieldSelectionManager.this.getState()) == null || state.n() == null) {
                return false;
            }
            f(TextFieldSelectionManager.this.p0(), dragPosition, false, f.INSTANCE.l());
            return true;
        }

        @Override // com.google.inputmethod.j08
        public boolean e(long downPosition) {
            k07 state = TextFieldSelectionManager.this.getState();
            if (state == null || state.n() == null || !TextFieldSelectionManager.this.Y()) {
                return false;
            }
            TextFieldSelectionManager.this.previousRawDragOffset = -1;
            f focusRequester = TextFieldSelectionManager.this.getFocusRequester();
            if (focusRequester != null) {
                f.h(focusRequester, 0, 1, null);
            }
            f(TextFieldSelectionManager.this.p0(), downPosition, false, f.INSTANCE.l());
            return true;
        }

        public final long f(TextFieldValue value, long currentPosition, boolean isStartOfSelection, f adjustment) {
            long jZ0 = TextFieldSelectionManager.this.Z0(value, currentPosition, isStartOfSelection, false, adjustment, false, null);
            if (!x.f(jZ0, this.initialSelection)) {
                this.isDoubleOrTripleClickSelectionOnly = false;
            }
            TextFieldSelectionManager.this.H0(x.h(jZ0) ? HandleState.Cursor : HandleState.Selection);
            return jZ0;
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0019¨\u0006\u001b"}, d2 = {"androidx/compose/foundation/text/selection/TextFieldSelectionManager$d", "Lcom/google/android/gsc;", "", "e", "()V", "Lcom/google/android/rn8;", "point", "a", "(J)V", "d", "startPoint", "Landroidx/compose/foundation/text/selection/f;", "selectionAdjustment", "c", "(JLandroidx/compose/foundation/text/selection/f;)V", "delta", "b", "g", "onCancel", "", "Z", "isLongPressSelectionOnly", "Landroidx/compose/ui/text/x;", "Landroidx/compose/ui/text/x;", "runningSelection", "Landroidx/compose/foundation/text/selection/f;", "selectionAdjustmentMode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements gsc {

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private x runningSelection;

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean isLongPressSelectionOnly = true;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private f selectionAdjustmentMode = f.INSTANCE.l();

        d() {
        }

        private final void e() {
            TextFieldSelectionManager.this.D0(null);
            TextFieldSelectionManager.this.B0(null);
            this.selectionAdjustmentMode = f.INSTANCE.l();
            TextFieldSelectionManager.this.Y0(true);
            x xVar = this.runningSelection;
            boolean zH = x.h(xVar != null ? xVar.getPackedValue() : TextFieldSelectionManager.this.p0().getSelection());
            TextFieldSelectionManager.this.H0(zH ? HandleState.Cursor : HandleState.Selection);
            k07 state = TextFieldSelectionManager.this.getState();
            if (state != null) {
                state.W(!zH && TextFieldSelectionManager_androidKt.y(TextFieldSelectionManager.this, true));
            }
            k07 state2 = TextFieldSelectionManager.this.getState();
            if (state2 != null) {
                state2.V(!zH && TextFieldSelectionManager_androidKt.y(TextFieldSelectionManager.this, false));
            }
            k07 state3 = TextFieldSelectionManager.this.getState();
            if (state3 != null) {
                state3.T(zH && TextFieldSelectionManager_androidKt.y(TextFieldSelectionManager.this, true));
            }
            if (this.isLongPressSelectionOnly) {
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                textFieldSelectionManager.u0(textFieldSelectionManager.dragBeginSelection);
            }
            TextFieldSelectionManager.this.dragBeginSelection = null;
        }

        @Override // com.google.inputmethod.gsc
        public void a(long point) {
        }

        /* JADX WARN: Code duplicated, block: B:21:0x00be  */
        /* JADX WARN: Code duplicated, block: B:23:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:24:0x00ce  */
        @Override // com.google.inputmethod.gsc
        public void b(long delta) {
            wxc wxcVarN;
            TextFieldSelectionManager textFieldSelectionManager;
            x xVar;
            int iD;
            long jZ0;
            if (!TextFieldSelectionManager.this.Y() || TextFieldSelectionManager.this.p0().m().length() == 0) {
                return;
            }
            TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
            textFieldSelectionManager2.dragTotalDistance = rn8.q(textFieldSelectionManager2.dragTotalDistance, delta);
            k07 state = TextFieldSelectionManager.this.getState();
            if (state != null && (wxcVarN = state.n()) != null) {
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                textFieldSelectionManager3.B0(rn8.d(rn8.q(textFieldSelectionManager3.dragBeginPosition, textFieldSelectionManager3.dragTotalDistance)));
                if (textFieldSelectionManager3.dragBeginSelection == null) {
                    rn8 rn8VarU = textFieldSelectionManager3.U();
                    Intrinsics.g(rn8VarU);
                    if (wxcVarN.g(rn8VarU.getPackedValue())) {
                        textFieldSelectionManager = textFieldSelectionManager3;
                        xVar = textFieldSelectionManager.dragBeginSelection;
                        if (xVar != null) {
                            iD = x.n(xVar.getPackedValue());
                        } else {
                            iD = wxcVarN.d(textFieldSelectionManager.dragBeginPosition, false);
                        }
                        rn8 rn8VarU2 = textFieldSelectionManager.U();
                        Intrinsics.g(rn8VarU2);
                        int iD2 = wxcVarN.d(rn8VarU2.getPackedValue(), false);
                        if (textFieldSelectionManager.dragBeginSelection != null && iD == iD2) {
                            return;
                        }
                        TextFieldValue textFieldValueP0 = textFieldSelectionManager.p0();
                        rn8 rn8VarU3 = textFieldSelectionManager.U();
                        Intrinsics.g(rn8VarU3);
                        jZ0 = textFieldSelectionManager.Z0(textFieldValueP0, rn8VarU3.getPackedValue(), false, false, this.selectionAdjustmentMode, true, e65.a(e65.INSTANCE.j()));
                    } else {
                        int iA = textFieldSelectionManager3.getOffsetMapping().a(wxc.e(wxcVarN, textFieldSelectionManager3.dragBeginPosition, false, 2, null));
                        zn8 offsetMapping = textFieldSelectionManager3.getOffsetMapping();
                        rn8 rn8VarU4 = textFieldSelectionManager3.U();
                        Intrinsics.g(rn8VarU4);
                        f fVarL = iA == offsetMapping.a(wxc.e(wxcVarN, rn8VarU4.getPackedValue(), false, 2, null)) ? f.INSTANCE.l() : f.INSTANCE.n();
                        TextFieldValue textFieldValueP1 = textFieldSelectionManager3.p0();
                        rn8 rn8VarU5 = textFieldSelectionManager3.U();
                        Intrinsics.g(rn8VarU5);
                        textFieldSelectionManager = textFieldSelectionManager3;
                        jZ0 = textFieldSelectionManager.Z0(textFieldValueP1, rn8VarU5.getPackedValue(), false, false, fVarL, true, e65.a(e65.INSTANCE.j()));
                    }
                } else {
                    textFieldSelectionManager = textFieldSelectionManager3;
                    xVar = textFieldSelectionManager.dragBeginSelection;
                    if (xVar != null) {
                        iD = x.n(xVar.getPackedValue());
                    } else {
                        iD = wxcVarN.d(textFieldSelectionManager.dragBeginPosition, false);
                    }
                    rn8 rn8VarU6 = textFieldSelectionManager.U();
                    Intrinsics.g(rn8VarU6);
                    int iD3 = wxcVarN.d(rn8VarU6.getPackedValue(), false);
                    if (textFieldSelectionManager.dragBeginSelection != null) {
                    }
                    TextFieldValue textFieldValueP2 = textFieldSelectionManager.p0();
                    rn8 rn8VarU7 = textFieldSelectionManager.U();
                    Intrinsics.g(rn8VarU7);
                    jZ0 = textFieldSelectionManager.Z0(textFieldValueP2, rn8VarU7.getPackedValue(), false, false, this.selectionAdjustmentMode, true, e65.a(e65.INSTANCE.j()));
                }
                this.runningSelection = x.b(jZ0);
                if (!x.f(jZ0, textFieldSelectionManager.dragBeginSelection)) {
                    this.isLongPressSelectionOnly = false;
                }
            }
            TextFieldSelectionManager.this.Y0(false);
        }

        @Override // com.google.inputmethod.gsc
        public void c(long startPoint, f selectionAdjustment) {
            long j;
            wxc wxcVarN;
            wxc wxcVarN2;
            if (TextFieldSelectionManager.this.Y() && TextFieldSelectionManager.this.W() == null) {
                TextFieldSelectionManager.this.D0(Handle.SelectionEnd);
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                this.isLongPressSelectionOnly = true;
                this.selectionAdjustmentMode = selectionAdjustment;
                TextFieldSelectionManager.this.r0();
                k07 state = TextFieldSelectionManager.this.getState();
                if (state == null || (wxcVarN2 = state.n()) == null || !wxcVarN2.g(startPoint)) {
                    j = startPoint;
                    k07 state2 = TextFieldSelectionManager.this.getState();
                    if (state2 != null && (wxcVarN = state2.n()) != null) {
                        TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                        int iA = textFieldSelectionManager.getOffsetMapping().a(wxc.e(wxcVarN, j, false, 2, null));
                        TextFieldValue textFieldValueG = textFieldSelectionManager.G(textFieldSelectionManager.p0().getText(), zyc.b(iA, iA));
                        textFieldSelectionManager.M(false);
                        c65 hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.a(e65.INSTANCE.f());
                        }
                        textFieldSelectionManager.i0().invoke(textFieldValueG);
                        textFieldSelectionManager.K0(x.b(textFieldValueG.getSelection()));
                    }
                    this.isLongPressSelectionOnly = false;
                } else {
                    if (TextFieldSelectionManager.this.p0().m().length() == 0) {
                        return;
                    }
                    TextFieldSelectionManager.this.M(false);
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    long jZ0 = textFieldSelectionManager2.Z0(TextFieldValue.h(textFieldSelectionManager2.p0(), null, x.INSTANCE.a(), null, 5, null), startPoint, true, false, this.selectionAdjustmentMode, true, e65.a(e65.INSTANCE.f()));
                    j = startPoint;
                    TextFieldSelectionManager.this.dragBeginSelection = x.b(jZ0);
                    this.runningSelection = x.b(jZ0);
                }
                TextFieldSelectionManager.this.H0(HandleState.None);
                TextFieldSelectionManager.this.dragBeginPosition = j;
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                textFieldSelectionManager3.B0(rn8.d(textFieldSelectionManager3.dragBeginPosition));
                TextFieldSelectionManager.this.dragTotalDistance = rn8.INSTANCE.c();
            }
        }

        @Override // com.google.inputmethod.gsc
        public void d() {
        }

        @Override // com.google.inputmethod.gsc
        public void g() {
            e();
        }

        @Override // com.google.inputmethod.gsc
        public void onCancel() {
            e();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextFieldSelectionManager() {
        rsd rsdVar = null;
        this(rsdVar, 1, rsdVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(rn8 rn8Var) {
        this.currentDragPosition.setValue(rn8Var);
    }

    public static /* synthetic */ s D(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionManager.C(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(Handle handle) {
        this.draggingHandle.setValue(handle);
    }

    public static /* synthetic */ androidx.compose.ui.text.b F(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return textFieldSelectionManager.E(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldValue G(androidx.compose.ui.text.b annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (x) null, 4, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(HandleState handleState) {
        k07 k07Var = this.state;
        if (k07Var != null) {
            if (k07Var.g() == handleState) {
                k07Var = null;
            }
            if (k07Var != null) {
                k07Var.K(handleState);
            }
        }
    }

    private final void J0(boolean z) {
        this.hasAvailableTextToPaste.setValue(Boolean.valueOf(z));
    }

    public static /* synthetic */ void L(TextFieldSelectionManager textFieldSelectionManager, rn8 rn8Var, int i, Object obj) {
        if ((i & 1) != 0) {
            rn8Var = null;
        }
        textFieldSelectionManager.K(rn8Var);
    }

    public static /* synthetic */ void N(TextFieldSelectionManager textFieldSelectionManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        textFieldSelectionManager.M(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final gba Q() {
        char c2;
        long j;
        float fIntBitsToFloat;
        kn6 kn6VarM;
        TextLayoutResult value;
        gba gbaVarE;
        kn6 kn6VarM2;
        TextLayoutResult value2;
        gba gbaVarE2;
        kn6 kn6VarM3;
        kn6 kn6VarM4;
        k07 k07Var = this.state;
        if (k07Var != null) {
            if (k07Var.getIsLayoutResultStale()) {
                k07Var = null;
            }
            if (k07Var != null) {
                int iB = this.offsetMapping.b(x.n(p0().getSelection()));
                int iB2 = this.offsetMapping.b(x.i(p0().getSelection()));
                k07 k07Var2 = this.state;
                long jC = (k07Var2 == null || (kn6VarM4 = k07Var2.m()) == null) ? rn8.INSTANCE.c() : kn6VarM4.N(b0(true));
                k07 k07Var3 = this.state;
                long jC2 = (k07Var3 == null || (kn6VarM3 = k07Var3.m()) == null) ? rn8.INSTANCE.c() : kn6VarM3.N(b0(false));
                k07 k07Var4 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (k07Var4 == null || (kn6VarM2 = k07Var4.m()) == null) {
                    c2 = ' ';
                    j = 4294967295L;
                    fIntBitsToFloat = 0.0f;
                } else {
                    wxc wxcVarN = k07Var.n();
                    c2 = ' ';
                    j = 4294967295L;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (kn6VarM2.N(rn8.e((((long) Float.floatToRawIntBits((wxcVarN == null || (value2 = wxcVarN.getValue()) == null || (gbaVarE2 = value2.e(iB)) == null) ? 0.0f : gbaVarE2.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(0.0f)) << 32))) & 4294967295L));
                }
                k07 k07Var5 = this.state;
                if (k07Var5 != null && (kn6VarM = k07Var5.m()) != null) {
                    wxc wxcVarN2 = k07Var.n();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (kn6VarM.N(rn8.e((((long) Float.floatToRawIntBits(0.0f)) << c2) | (((long) Float.floatToRawIntBits((wxcVarN2 == null || (value = wxcVarN2.getValue()) == null || (gbaVarE = value.e(iB2)) == null) ? 0.0f : gbaVarE.getTop())) & j))) & j));
                }
                int i = (int) (jC >> c2);
                int i2 = (int) (jC2 >> c2);
                return new gba(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat((int) (jC & j)), Float.intBitsToFloat((int) (jC2 & j))) + (ff3.i(25) * k07Var.getTextDelegate().getDensity().getDensity()));
            }
        }
        return gba.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<String, x> S() {
        String text;
        x xVar;
        androidx.compose.ui.text.b bVarO0 = o0();
        if (bVarO0 == null || (text = bVarO0.getText()) == null || (xVar = this.latestSelection) == null) {
            return null;
        }
        long packedValue = xVar.getPackedValue();
        return new Pair<>(text, x.b(zyc.b(this.offsetMapping.b(x.n(packedValue)), this.offsetMapping.b(x.i(packedValue)))));
    }

    private final s W0() {
        ta2 ta2Var = this.coroutineScope;
        if (ta2Var != null) {
            return rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager$showSelectionToolbarViaTextToolbar$1(this, null), 1, (Object) null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(boolean show) {
        k07 k07Var = this.state;
        if (k07Var != null) {
            k07Var.U(show);
        }
        if (show) {
            V0();
        } else {
            r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Z0(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, f adjustment, boolean isTouchBasedSelection, e65 hapticFeedbackType) {
        wxc wxcVarN;
        int i;
        c65 c65Var;
        k07 k07Var = this.state;
        if (k07Var == null || (wxcVarN = k07Var.n()) == null) {
            return x.INSTANCE.a();
        }
        long jB = zyc.b(this.offsetMapping.b(x.n(value.getSelection())), this.offsetMapping.b(x.i(value.getSelection())));
        boolean z = false;
        int iD = wxcVarN.d(currentPosition, false);
        int iN = (isStartHandle || isStartOfSelection) ? iD : x.n(jB);
        int i2 = (!isStartHandle || isStartOfSelection) ? iD : x.i(jB);
        heb hebVar = this.previousSelectionLayout;
        if (isStartOfSelection || hebVar == null || (i = this.previousRawDragOffset) == -1) {
            i = -1;
        }
        heb hebVarB = k.b(wxcVarN.getValue(), iN, i2, i, jB, isStartOfSelection, isStartHandle);
        if (!hebVarB.h(hebVar)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = hebVarB;
        this.previousRawDragOffset = iD;
        Selection selectionA = adjustment.a(hebVarB);
        long jB2 = zyc.b(this.offsetMapping.a(selectionA.getStart().getOffset()), this.offsetMapping.a(selectionA.getEnd().getOffset()));
        if (x.g(jB2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z2 = x.m(jB2) != x.m(value.getSelection()) && x.g(zyc.b(x.i(jB2), x.n(jB2)), value.getSelection());
        boolean z3 = x.h(jB2) && x.h(value.getSelection());
        if (isTouchBasedSelection && value.m().length() > 0 && !z2 && !z3 && hapticFeedbackType != null && (c65Var = this.hapticFeedBack) != null) {
            c65Var.a(hapticFeedbackType.getValue());
        }
        this.onValueChange.invoke(G(value.getText(), jB2));
        this.latestSelection = x.b(jB2);
        if (!isTouchBasedSelection) {
            Y0(!x.h(jB2));
        }
        k07 k07Var2 = this.state;
        if (k07Var2 != null) {
            k07Var2.M(isTouchBasedSelection);
        }
        k07 k07Var3 = this.state;
        if (k07Var3 != null) {
            k07Var3.W(!x.h(jB2) && TextFieldSelectionManager_androidKt.y(this, true));
        }
        k07 k07Var4 = this.state;
        if (k07Var4 != null) {
            k07Var4.V(!x.h(jB2) && TextFieldSelectionManager_androidKt.y(this, false));
        }
        k07 k07Var5 = this.state;
        if (k07Var5 != null) {
            if (x.h(jB2) && TextFieldSelectionManager_androidKt.y(this, true)) {
                z = true;
            }
            k07Var5.T(z);
        }
        return jB2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gba c(TextFieldSelectionManager textFieldSelectionManager, kn6 kn6Var) {
        kn6 kn6VarM;
        gba gbaVarQ = textFieldSelectionManager.Q();
        k07 k07Var = textFieldSelectionManager.state;
        if (k07Var == null || (kn6VarM = k07Var.m()) == null) {
            return null;
        }
        return urc.b(gbaVarQ, kn6VarM, kn6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean d0() {
        return ((Boolean) this.hasAvailableTextToPaste.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        return !x.h(p0().getSelection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s0() {
        return this.visualTransformation instanceof a39;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(x selection) {
        qb9 qb9Var;
        androidx.compose.ui.text.b bVarO0;
        String text;
        ta2 ta2Var;
        if (selection == null || (qb9Var = this.platformSelectionBehaviors) == null || (bVarO0 = o0()) == null || (text = bVarO0.getText()) == null) {
            return;
        }
        zn8 zn8Var = this.offsetMapping;
        long jB = zyc.b(zn8Var.b(x.n(selection.getPackedValue())), zn8Var.b(x.i(selection.getPackedValue())));
        if (text.length() <= 0 || x.h(jB) || (ta2Var = this.coroutineScope) == null) {
            return;
        }
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new TextFieldSelectionManager$maybeSuggestSelection$1(qb9Var, text, jB, selection, this, zn8Var, null), 3, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(TextFieldValue textFieldValue) {
        return Unit.a;
    }

    public final boolean A() {
        return x.j(p0().getSelection()) != p0().m().length();
    }

    public final void A0(ta2 ta2Var) {
        this.coroutineScope = ta2Var;
    }

    public final void B() {
        k07 k07Var = this.state;
        if (k07Var != null) {
            k07Var.J(x.INSTANCE.a());
        }
        k07 k07Var2 = this.state;
        if (k07Var2 != null) {
            k07Var2.S(x.INSTANCE.a());
        }
    }

    public final s C(boolean cancelSelection) {
        ta2 ta2Var = this.coroutineScope;
        if (ta2Var != null) {
            return rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager$copy$1(this, cancelSelection, null), 1, (Object) null);
        }
        return null;
    }

    public final void C0(long range) {
        k07 k07Var = this.state;
        if (k07Var != null) {
            k07Var.J(range);
        }
        k07 k07Var2 = this.state;
        if (k07Var2 != null) {
            k07Var2.S(x.INSTANCE.a());
        }
        if (x.h(range)) {
            return;
        }
        O();
    }

    public final androidx.compose.ui.text.b E(boolean cancelSelection) {
        if (!e0() || s0()) {
            return null;
        }
        androidx.compose.ui.text.b bVarA = dwc.a(p0());
        if (!cancelSelection) {
            return bVarA;
        }
        int iK = x.k(p0().getSelection());
        this.onValueChange.invoke(G(p0().getText(), zyc.b(iK, iK)));
        H0(HandleState.None);
        return bVarA;
    }

    public final void E0(boolean z) {
        this.editable.setValue(Boolean.valueOf(z));
    }

    public final void F0(boolean z) {
        this.enabled.setValue(Boolean.valueOf(z));
    }

    public final void G0(f fVar) {
        this.focusRequester = fVar;
    }

    public final gsc H() {
        return new a();
    }

    public final s I() {
        ta2 ta2Var = this.coroutineScope;
        if (ta2Var != null) {
            return rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager$cut$1(this, null), 1, (Object) null);
        }
        return null;
    }

    public final void I0(c65 c65Var) {
        this.hapticFeedBack = c65Var;
    }

    public final androidx.compose.ui.text.b J() {
        if (!e0() || !X() || s0()) {
            return null;
        }
        androidx.compose.ui.text.b bVarA = dwc.a(p0());
        androidx.compose.ui.text.b bVarQ = dwc.c(p0(), p0().m().length()).q(dwc.b(p0(), p0().m().length()));
        int iL = x.l(p0().getSelection());
        this.onValueChange.invoke(G(bVarQ, zyc.b(iL, iL)));
        H0(HandleState.None);
        rsd rsdVar = this.undoManager;
        if (rsdVar != null) {
            rsdVar.a();
        }
        return bVarA;
    }

    public final void K(rn8 position) {
        if (!x.h(p0().getSelection())) {
            k07 k07Var = this.state;
            wxc wxcVarN = k07Var != null ? k07Var.n() : null;
            TextFieldValue textFieldValueH = TextFieldValue.h(p0(), null, zyc.a((position == null || wxcVarN == null) ? x.k(p0().getSelection()) : this.offsetMapping.a(wxc.e(wxcVarN, position.getPackedValue(), false, 2, null))), null, 5, null);
            this.onValueChange.invoke(textFieldValueH);
            this.latestSelection = x.b(textFieldValueH.getSelection());
        }
        H0((position == null || p0().m().length() <= 0) ? HandleState.None : HandleState.Cursor);
        Y0(false);
    }

    public final void K0(x xVar) {
        this.latestSelection = xVar;
    }

    public final void L0(zn8 zn8Var) {
        this.offsetMapping = zn8Var;
    }

    public final void M(boolean showFloatingToolbar) {
        f fVar;
        k07 k07Var = this.state;
        if (k07Var != null && !k07Var.h() && (fVar = this.focusRequester) != null) {
            f.h(fVar, 0, 1, null);
        }
        this.oldValue = p0();
        Y0(showFloatingToolbar);
        H0(HandleState.Selection);
    }

    public final void M0(Function1<? super TextFieldValue, Unit> function1) {
        this.onValueChange = function1;
    }

    public final void N0(qb9 qb9Var) {
        this.platformSelectionBehaviors = qb9Var;
    }

    public final void O() {
        Y0(false);
        H0(HandleState.None);
    }

    public final void O0(Function0<Unit> function0) {
        this.requestAutofillAction = function0;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final jf1 getClipboard() {
        return this.clipboard;
    }

    public final void P0(long range) {
        k07 k07Var = this.state;
        if (k07Var != null) {
            k07Var.S(range);
        }
        k07 k07Var2 = this.state;
        if (k07Var2 != null) {
            k07Var2.J(x.INSTANCE.a());
        }
        if (x.h(range)) {
            return;
        }
        O();
    }

    public final void Q0(k07 k07Var) {
        this.state = k07Var;
    }

    public final androidx.compose.ui.b R() {
        return !Y() ? androidx.compose.ui.b.INSTANCE : urc.a(e.a(androidx.compose.ui.b.INSTANCE, new TextFieldSelectionManager$contextMenuAreaModifier$1(this, null)), this.toolbarRequester, new TextFieldSelectionManager$contextMenuAreaModifier$2(this, null), new TextFieldSelectionManager$contextMenuAreaModifier$3(this, null), new Function1() { // from class: com.google.android.xuc
            public final Object invoke(Object obj) {
                return TextFieldSelectionManager.c(this.a, (kn6) obj);
            }
        });
    }

    public final void R0(yzc yzcVar) {
        this.textToolbar = yzcVar;
    }

    public final void S0(boolean z) {
        this.textToolbarShownViaProvider = z;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final ta2 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void T0(TextFieldValue textFieldValue) {
        this.valueState.setValue(textFieldValue);
        this.latestSelection = x.b(textFieldValue.getSelection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rn8 U() {
        return (rn8) this.currentDragPosition.getValue();
    }

    public final void U0(nce nceVar) {
        this.visualTransformation = nceVar;
    }

    public final long V(f43 density) {
        int iB = this.offsetMapping.b(x.n(p0().getSelection()));
        k07 k07Var = this.state;
        wxc wxcVarN = k07Var != null ? k07Var.n() : null;
        Intrinsics.g(wxcVarN);
        TextLayoutResult value = wxcVarN.getValue();
        gba gbaVarE = value.e(g.o(iB, 0, value.getLayoutInput().getText().length()));
        return rn8.e((((long) Float.floatToRawIntBits(gbaVarE.getLeft() + (density.x2(ssc.a()) / 2))) << 32) | (((long) Float.floatToRawIntBits(gbaVarE.getBottom())) & 4294967295L));
    }

    public final void V0() {
        k07 k07Var;
        androidx.compose.p004runtime.snapshots.g.Companion companion = androidx.compose.p004runtime.snapshots.g.INSTANCE;
        androidx.compose.p004runtime.snapshots.g gVarD = companion.d();
        Function1<Object, Unit> function1G = gVarD != null ? gVarD.g() : null;
        androidx.compose.p004runtime.snapshots.g gVarE = companion.e(gVarD);
        try {
            if (Y() && ((k07Var = this.state) == null || k07Var.C())) {
                Unit unit = Unit.a;
                companion.l(gVarD, gVarE, function1G);
                if (up1.isNewContextMenuEnabled) {
                    this.toolbarRequester.f();
                    return;
                } else {
                    W0();
                    return;
                }
            }
            companion.l(gVarD, gVarE, function1G);
        } catch (Throwable th) {
            companion.l(gVarD, gVarE, function1G);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Handle W() {
        return (Handle) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean X() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X0(q22<? super Unit> q22Var) {
        TextFieldSelectionManager$updateClipboardEntry$1 textFieldSelectionManager$updateClipboardEntry$1;
        TextFieldSelectionManager textFieldSelectionManager;
        if (q22Var instanceof TextFieldSelectionManager$updateClipboardEntry$1) {
            textFieldSelectionManager$updateClipboardEntry$1 = (TextFieldSelectionManager$updateClipboardEntry$1) q22Var;
            int i = textFieldSelectionManager$updateClipboardEntry$1.label;
            if ((i & t04.INVALID_ID) != 0) {
                textFieldSelectionManager$updateClipboardEntry$1.label = i - t04.INVALID_ID;
            } else {
                textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, q22Var);
            }
        } else {
            textFieldSelectionManager$updateClipboardEntry$1 = new TextFieldSelectionManager$updateClipboardEntry$1(this, q22Var);
        }
        Object objX = textFieldSelectionManager$updateClipboardEntry$1.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i2 = textFieldSelectionManager$updateClipboardEntry$1.label;
        if (i2 == 0) {
            kotlin.f.b(objX);
            jf1 jf1Var = this.clipboard;
            if (jf1Var != null && mf1.c(jf1Var)) {
                textFieldSelectionManager$updateClipboardEntry$1.L$0 = this;
                textFieldSelectionManager$updateClipboardEntry$1.label = 1;
                objX = TextFieldSelectionManager_androidKt.x(this, textFieldSelectionManager$updateClipboardEntry$1);
                if (objX == objG) {
                    return objG;
                }
                textFieldSelectionManager = this;
            }
            return Unit.a;
        }
        if (i2 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        textFieldSelectionManager = (TextFieldSelectionManager) textFieldSelectionManager$updateClipboardEntry$1.L$0;
        kotlin.f.b(objX);
        textFieldSelectionManager.J0(((Boolean) objX).booleanValue());
        return Unit.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Y() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final f getFocusRequester() {
        return this.focusRequester;
    }

    public final float a0(boolean isStartHandle) {
        wxc wxcVarN;
        TextLayoutResult value;
        int iN = isStartHandle ? x.n(p0().getSelection()) : x.i(p0().getSelection());
        k07 k07Var = this.state;
        if (k07Var == null || (wxcVarN = k07Var.n()) == null || (value = wxcVarN.getValue()) == null) {
            return 0.0f;
        }
        return uxc.b(value, iN);
    }

    public final long b0(boolean isStartHandle) {
        wxc wxcVarN;
        TextLayoutResult value;
        k07 k07Var = this.state;
        if (k07Var == null || (wxcVarN = k07Var.n()) == null || (value = wxcVarN.getValue()) == null) {
            return rn8.INSTANCE.b();
        }
        androidx.compose.ui.text.b bVarO0 = o0();
        if (bVarO0 == null) {
            return rn8.INSTANCE.b();
        }
        if (!Intrinsics.e(bVarO0.getText(), value.getLayoutInput().getText().getText())) {
            return rn8.INSTANCE.b();
        }
        long selection = p0().getSelection();
        return kzc.b(value, this.offsetMapping.b(isStartHandle ? x.n(selection) : x.i(selection)), isStartHandle, x.m(p0().getSelection()));
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final c65 getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final x getLatestSelection() {
        return this.latestSelection;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final j08 getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final zn8 getOffsetMapping() {
        return this.offsetMapping;
    }

    public final Function1<TextFieldValue, Unit> i0() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final qb9 getPlatformSelectionBehaviors() {
        return this.platformSelectionBehaviors;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final k07 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final yzc getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean m0() {
        if (up1.isNewContextMenuEnabled) {
            return this.textToolbarShownViaProvider;
        }
        yzc yzcVar = this.textToolbar;
        return (yzcVar != null ? yzcVar.getStatus() : null) == TextToolbarStatus.Shown;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final gsc getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final androidx.compose.ui.text.b o0() {
        asc ascVarZ;
        k07 k07Var = this.state;
        if (k07Var == null || (ascVarZ = k07Var.getTextDelegate()) == null) {
            return null;
        }
        return ascVarZ.getText();
    }

    public final TextFieldValue p0() {
        return this.valueState.getValue();
    }

    public final gsc q0(boolean isStartHandle) {
        return new b(isStartHandle);
    }

    public final void r0() {
        yzc yzcVar;
        if (up1.isNewContextMenuEnabled) {
            this.toolbarRequester.b();
            return;
        }
        yzc yzcVar2 = this.textToolbar;
        if ((yzcVar2 != null ? yzcVar2.getStatus() : null) != TextToolbarStatus.Shown || (yzcVar = this.textToolbar) == null) {
            return;
        }
        yzcVar.hide();
    }

    public final boolean t0() {
        return !Intrinsics.e(this.oldValue.m(), p0().m());
    }

    public final void v() {
        Function0<Unit> function0 = this.requestAutofillAction;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean w() {
        return X() && x.h(p0().getSelection());
    }

    public final s w0() {
        ta2 ta2Var = this.coroutineScope;
        if (ta2Var != null) {
            return rw0.d(ta2Var, (CoroutineContext) null, CoroutineStart.d, new TextFieldSelectionManager$paste$1(this, null), 1, (Object) null);
        }
        return null;
    }

    public final boolean x() {
        jf1 jf1Var;
        return e0() && !s0() && (jf1Var = this.clipboard) != null && mf1.d(jf1Var);
    }

    public final void x0(androidx.compose.ui.text.b text) {
        if (X()) {
            androidx.compose.ui.text.b bVarQ = dwc.c(p0(), p0().m().length()).q(text).q(dwc.b(p0(), p0().m().length()));
            int iL = x.l(p0().getSelection()) + text.length();
            this.onValueChange.invoke(G(bVarQ, zyc.b(iL, iL)));
            H0(HandleState.None);
            rsd rsdVar = this.undoManager;
            if (rsdVar != null) {
                rsdVar.a();
            }
        }
    }

    public final boolean y() {
        jf1 jf1Var;
        return e0() && X() && !s0() && (jf1Var = this.clipboard) != null && mf1.d(jf1Var);
    }

    public final void y0() {
        TextFieldValue textFieldValueG = G(p0().getText(), zyc.b(0, p0().m().length()));
        this.onValueChange.invoke(textFieldValueG);
        this.latestSelection = x.b(textFieldValueG.getSelection());
        this.oldValue = TextFieldValue.h(this.oldValue, null, textFieldValueG.getSelection(), null, 5, null);
        M(true);
    }

    public final boolean z() {
        jf1 jf1Var;
        return X() && d0() && (jf1Var = this.clipboard) != null && mf1.c(jf1Var);
    }

    public final void z0(jf1 jf1Var) {
        this.clipboard = jf1Var;
    }

    public TextFieldSelectionManager(rsd rsdVar) {
        this.undoManager = rsdVar;
        this.offsetMapping = o0e.d();
        this.onValueChange = new Function1() { // from class: com.google.android.wuc
            public final Object invoke(Object obj) {
                return TextFieldSelectionManager.v0((TextFieldValue) obj);
            }
        };
        this.valueState = s0.e(new TextFieldValue((String) null, 0L, (x) null, 7, (DefaultConstructorMarker) null), null, 2, null);
        this.visualTransformation = nce.INSTANCE.c();
        Boolean bool = Boolean.TRUE;
        this.editable = s0.e(bool, null, 2, null);
        this.enabled = s0.e(bool, null, 2, null);
        rn8.Companion companion = rn8.INSTANCE;
        this.dragBeginPosition = companion.c();
        this.dragTotalDistance = companion.c();
        this.draggingHandle = s0.e(null, null, 2, null);
        this.currentDragPosition = s0.e(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (x) null, 7, (DefaultConstructorMarker) null);
        this.hasAvailableTextToPaste = s0.e(Boolean.FALSE, null, 2, null);
        this.toolbarRequester = new q9d();
        this.touchSelectionObserver = new d();
        this.mouseSelectionObserver = new c();
    }

    public /* synthetic */ TextFieldSelectionManager(rsd rsdVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rsdVar);
    }
}
