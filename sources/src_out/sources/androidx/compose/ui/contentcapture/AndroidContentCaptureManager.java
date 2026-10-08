package androidx.compose.ui.contentcapture;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.util.LongSparseArray;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import androidx.compose.ui.contentcapture.AndroidContentCaptureManager;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.text.TextLayoutInput;
import com.google.android.h81;
import com.google.android.p81;
import com.google.inputmethod.AccessibilityAction;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.ak;
import com.google.inputmethod.az1;
import com.google.inputmethod.b0d;
import com.google.inputmethod.bk;
import com.google.inputmethod.dfb;
import com.google.inputmethod.e16;
import com.google.inputmethod.f16;
import com.google.inputmethod.ffb;
import com.google.inputmethod.fj;
import com.google.inputmethod.gba;
import com.google.inputmethod.gfb;
import com.google.inputmethod.hpa;
import com.google.inputmethod.ifb;
import com.google.inputmethod.k58;
import com.google.inputmethod.l7e;
import com.google.inputmethod.m47;
import com.google.inputmethod.n17;
import com.google.inputmethod.o48;
import com.google.inputmethod.oa0;
import com.google.inputmethod.rae;
import com.google.inputmethod.rfb;
import com.google.inputmethod.seb;
import com.google.inputmethod.ux2;
import com.google.inputmethod.zj;
import com.google.inputmethod.zw5;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0004\u0093\u0001[WB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010\fJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\fJ\u001d\u0010\"\u001a\u0004\u0018\u00010!*\u00020\r2\u0006\u0010 \u001a\u00020\u0018H\u0002¢\u0006\u0004\b\"\u0010#J-\u0010&\u001a\u00020\n*\u00020\r2\u0018\u0010%\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0$H\u0002¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u00182\b\u0010)\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020\n2\u0006\u0010(\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\nH\u0002¢\u0006\u0004\b.\u0010\fJ\u001f\u00100\u001a\u00020\n2\u0006\u0010 \u001a\u00020\u00182\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020\n2\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b2\u00103J\u0017\u00104\u001a\u00020\n2\u0006\u0010/\u001a\u00020\rH\u0002¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\nH\u0002¢\u0006\u0004\b5\u0010\fJ\u000f\u00106\u001a\u00020\nH\u0002¢\u0006\u0004\b6\u0010\fJ\u000f\u00107\u001a\u00020\nH\u0002¢\u0006\u0004\b7\u0010\fJ\u0017\u0010:\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\n2\u0006\u00109\u001a\u000208H\u0016¢\u0006\u0004\b<\u0010;J\u0017\u0010?\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010A\u001a\u00020\n2\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\bA\u0010@J\u0010\u0010B\u001a\u00020\nH\u0080@¢\u0006\u0004\bB\u0010CJ\u000f\u00109\u001a\u00020\nH\u0000¢\u0006\u0004\b9\u0010\fJ\u000f\u0010D\u001a\u00020\nH\u0000¢\u0006\u0004\bD\u0010\fJ\u000f\u0010E\u001a\u00020\nH\u0000¢\u0006\u0004\bE\u0010\fJ\u000f\u0010F\u001a\u00020\nH\u0000¢\u0006\u0004\bF\u0010\fJ\u000f\u0010G\u001a\u00020\nH\u0000¢\u0006\u0004\bG\u0010\fJ/\u0010O\u001a\u00020\n2\u0006\u0010I\u001a\u00020H2\u0006\u0010K\u001a\u00020J2\u000e\u0010N\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010M0LH\u0001¢\u0006\u0004\bO\u0010PJ'\u0010U\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u00002\u000e\u0010T\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010S0RH\u0001¢\u0006\u0004\bU\u0010VR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bW\u0010X\u001a\u0004\bY\u0010ZR*\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R*\u0010h\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\ba\u0010b\u0012\u0004\bg\u0010\f\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR\u001a\u0010l\u001a\b\u0012\u0004\u0012\u00020j0i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010kR\u0016\u0010o\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010nR\u0016\u0010r\u001a\u00020p8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010qR\u0016\u0010u\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010tR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020\n0v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u0010wR\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010{R*\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138@@\u0000X\u0080\u000e¢\u0006\u0013\n\u0004\b&\u0010}\u001a\u0004\b~\u0010\u007f\"\u0005\b\u0080\u0001\u0010\u0017R\u0017\u0010\u0082\u0001\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b~\u0010nR \u0010\u0086\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0083\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0018\u0010\u0088\u0001\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010\u0087\u0001R\u0017\u0010\u0089\u0001\u001a\u00020s8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u0010tR\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R \u0010\u0090\u0001\u001a\u0004\u0018\u00010y8@X\u0080\u0004¢\u0006\u000f\u0012\u0005\b\u008f\u0001\u0010\f\u001a\u0006\b\u0084\u0001\u0010\u008e\u0001R\u0017\u0010\u0092\u0001\u001a\u00020s8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u0091\u0001¨\u0006\u0094\u0001"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "Lcom/google/android/ux2;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "Lkotlin/Function0;", "Lcom/google/android/az1;", "onContentCaptureSession", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;Lkotlin/jvm/functions/Function0;)V", "", "z", "()V", "Landroidx/compose/ui/semantics/SemanticsNode;", "newNode", "Lcom/google/android/dfb;", "oldNode", "y", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/dfb;)V", "Lcom/google/android/e16;", "Lcom/google/android/ffb;", "newSemanticsNodes", "g", "(Lcom/google/android/e16;)V", "", "id", "", "newText", "B", "(ILjava/lang/String;)V", "G", "q", "index", "Lcom/google/android/rae;", "D", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Lcom/google/android/rae;", "Lkotlin/Function2;", "action", "j", "(Landroidx/compose/ui/semantics/SemanticsNode;Lkotlin/jvm/functions/Function2;)V", "virtualId", "viewStructure", "e", "(ILcom/google/android/rae;)V", "f", "(I)V", "p", "node", "E", "(ILandroidx/compose/ui/semantics/SemanticsNode;)V", "F", "(Landroidx/compose/ui/semantics/SemanticsNode;)V", "H", "C", "n", "h", "Landroid/view/View;", "v", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "Lcom/google/android/n17;", "owner", "onStart", "(Lcom/google/android/n17;)V", "onStop", "d", "(Lcom/google/android/q22;)Ljava/lang/Object;", "u", "w", "t", "r", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "s", "([J[ILjava/util/function/Consumer;)V", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "x", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "m", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Lkotlin/jvm/functions/Function0;", "getOnContentCaptureSession", "()Lkotlin/jvm/functions/Function0;", "setOnContentCaptureSession", "(Lkotlin/jvm/functions/Function0;)V", "c", "Lcom/google/android/az1;", "getContentCaptureSession$ui", "()Lcom/google/android/az1;", "setContentCaptureSession$ui", "(Lcom/google/android/az1;)V", "getContentCaptureSession$ui$annotations", "contentCaptureSession", "", "Landroidx/compose/ui/contentcapture/b;", "Ljava/util/List;", "bufferedEvents", "", "J", "SendRecurringContentCaptureEventsIntervalMillis", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "translateStatus", "", "Z", "currentSemanticsNodesInvalidated", "Lcom/google/android/h81;", "Lcom/google/android/h81;", "boundsUpdateChannel", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "legacyMainHandler", "Lcom/google/android/e16;", "k", "()Lcom/google/android/e16;", "setCurrentSemanticsNodes$ui", "currentSemanticsNodes", "currentSemanticsNodesSnapshotTimestampMillis", "Lcom/google/android/o48;", "l", "Lcom/google/android/o48;", "previousSemanticsNodes", "Lcom/google/android/dfb;", "previousSemanticsRoot", "checkingForSemanticsChanges", "Ljava/lang/Runnable;", "o", "Ljava/lang/Runnable;", "contentCaptureChangeChecker", "()Landroid/os/Handler;", "getHandler$ui$annotations", "handler", "()Z", "isEnabled", "TranslateStatus", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidContentCaptureManager implements ux2, View.OnAttachStateChangeListener {
    public static final int q = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AndroidComposeView view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private Function0<? extends az1> onContentCaptureSession;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private az1 contentCaptureSession;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private long currentSemanticsNodesSnapshotTimestampMillis;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private dfb previousSemanticsRoot;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List<ContentCaptureEvent> bufferedEvents = new ArrayList();

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private long SendRecurringContentCaptureEventsIntervalMillis = 100;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private TranslateStatus translateStatus = TranslateStatus.SHOW_ORIGINAL;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated = true;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final h81<Unit> boundsUpdateChannel = p81.b(1, (BufferOverflow) null, (Function1) null, 6, (Object) null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private e16<ffb> currentSemanticsNodes = f16.b();

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private o48<dfb> previousSemanticsNodes = f16.c();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final Runnable contentCaptureChangeChecker = new Runnable() { // from class: com.google.android.vj
        @Override // java.lang.Runnable
        public final void run() {
            AndroidContentCaptureManager.i(this.a);
        }
    };

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$TranslateStatus;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private enum TranslateStatus {
        SHOW_ORIGINAL,
        SHOW_TRANSLATED;

        private static final /* synthetic */ EnumEntries d = kotlin.enums.a.a(a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ7\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006H\u0007¢\u0006\u0004\b\u0015\u0010\u000b¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager$b;", "", "<init>", "()V", "Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;", "contentCaptureManager", "Landroid/util/LongSparseArray;", "Landroid/view/translation/ViewTranslationResponse;", "response", "", "b", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;Landroid/util/LongSparseArray;)V", "", "virtualIds", "", "supportedFormats", "Ljava/util/function/Consumer;", "Landroid/view/translation/ViewTranslationRequest;", "requestsCollector", "c", "(Landroidx/compose/ui/contentcapture/AndroidContentCaptureManager;[J[ILjava/util/function/Consumer;)V", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class b {
        public static final b a = new b();

        private b() {
        }

        private final void b(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
            TranslationResponseValue value;
            CharSequence text;
            ffb ffbVarB;
            SemanticsNode semanticsNodeB;
            AccessibilityAction accessibilityAction;
            Function1 function1A;
            int size = response.size();
            for (int i = 0; i < size; i++) {
                long jKeyAt = response.keyAt(i);
                ViewTranslationResponse viewTranslationResponseA = bk.a(response.get(jKeyAt));
                if (viewTranslationResponseA != null && (value = viewTranslationResponseA.getValue("android:text")) != null && (text = value.getText()) != null && (ffbVarB = contentCaptureManager.k().b((int) jKeyAt)) != null && (semanticsNodeB = ffbVarB.getSemanticsNode()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNodeB.getUnmergedConfig(), SemanticsActions.a.B())) != null && (function1A = accessibilityAction.a()) != null) {
                    List list = null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void e(AndroidContentCaptureManager androidContentCaptureManager, LongSparseArray longSparseArray) {
            a.b(androidContentCaptureManager, longSparseArray);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x006d  */
        public final void c(AndroidContentCaptureManager contentCaptureManager, long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
            SemanticsNode semanticsNodeB;
            String strE;
            for (long j : virtualIds) {
                ffb ffbVarB = contentCaptureManager.k().b((int) j);
                if (ffbVarB != null && (semanticsNodeB = ffbVarB.getSemanticsNode()) != null) {
                    ak.a();
                    ViewTranslationRequest.Builder builderA = zj.a(contentCaptureManager.getView().getAutofillId(), semanticsNodeB.getId());
                    List list = (List) SemanticsConfigurationKt.a(semanticsNodeB.getUnmergedConfig(), SemanticsProperties.a.L());
                    if (list != null && (strE = m47.e(list, "\n", null, null, 0, null, null, 62, null)) != null) {
                        List list2 = null;
                        builderA.setValue("android:text", TranslationRequestValue.forText(new androidx.compose.ui.text.b(strE, list2, 2, list2)));
                        requestsCollector.accept(builderA.build());
                    }
                }
            }
        }

        public final void d(final AndroidContentCaptureManager contentCaptureManager, final LongSparseArray<ViewTranslationResponse> response) {
            if (Build.VERSION.SDK_INT < 31) {
                return;
            }
            if (Intrinsics.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
                b(contentCaptureManager, response);
            } else {
                contentCaptureManager.getView().post(new Runnable() { // from class: androidx.compose.ui.contentcapture.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidContentCaptureManager.b.e(contentCaptureManager, response);
                    }
                });
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContentCaptureEventType.values().length];
            try {
                iArr[ContentCaptureEventType.VIEW_APPEAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContentCaptureEventType.VIEW_DISAPPEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AndroidContentCaptureManager(AndroidComposeView androidComposeView, Function0<? extends az1> function0) {
        this.view = androidComposeView;
        this.onContentCaptureSession = function0;
        this.previousSemanticsRoot = new dfb(androidComposeView.getSemanticsOwner().d(), f16.b());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void B(int id, String newText) throws KotlinNothingValueException {
        az1 az1Var;
        if (Build.VERSION.SDK_INT >= 29 && (az1Var = this.contentCaptureSession) != null) {
            AutofillId autofillIdA = az1Var.a(id);
            if (autofillIdA != null) {
                az1Var.b(autofillIdA, newText);
            } else {
                zw5.d("Invalid content capture ID");
                throw new KotlinNothingValueException();
            }
        }
    }

    private final void C() {
        AccessibilityAction accessibilityAction;
        Function1 function1A;
        e16<ffb> e16VarK = k();
        Object[] objArr = e16VarK.values;
        long[] jArr = e16VarK.metadata;
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
                        seb unmergedConfig = ((ffb) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.e(SemanticsConfigurationKt.a(unmergedConfig, SemanticsProperties.a.x()), Boolean.FALSE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig, SemanticsActions.a.C())) != null && (function1A = accessibilityAction.a()) != null) {
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

    private final rae D(SemanticsNode semanticsNode, int i) {
        oa0 oa0VarA;
        AutofillId autofillIdA;
        String strE;
        az1 az1Var = this.contentCaptureSession;
        if (az1Var == null || Build.VERSION.SDK_INT < 29 || (oa0VarA = l7e.a(this.view)) == null) {
            return null;
        }
        SemanticsNode semanticsNodeT = semanticsNode.t();
        if (semanticsNodeT != null) {
            autofillIdA = az1Var.a(semanticsNodeT.getId());
            if (autofillIdA == null) {
                return null;
            }
        } else {
            autofillIdA = oa0VarA.a();
        }
        rae raeVarC = az1Var.c(autofillIdA, semanticsNode.getId());
        if (raeVarC == null) {
            return null;
        }
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (unmergedConfig.d(semanticsProperties.D())) {
            return null;
        }
        Bundle bundleA = raeVarC.a();
        if (bundleA != null) {
            bundleA.putLong("android.view.contentcapture.EventTimestamp", this.currentSemanticsNodesSnapshotTimestampMillis);
            bundleA.putInt("android.view.ViewStructure.extra.EXTRA_VIEW_NODE_INDEX", i);
        }
        String str = (String) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.K());
        if (str != null) {
            raeVarC.e(semanticsNode.getId(), null, null, str);
        }
        if (((Boolean) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.y())) != null) {
            raeVarC.b("android.widget.ViewGroup");
        }
        List list = (List) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.L());
        if (list != null) {
            raeVarC.b("android.widget.TextView");
            raeVarC.f(m47.e(list, "\n", null, null, 0, null, null, 62, null));
        }
        androidx.compose.ui.text.b bVar = (androidx.compose.ui.text.b) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.g());
        if (bVar != null) {
            raeVarC.b("android.widget.EditText");
            raeVarC.f(bVar);
        }
        List list2 = (List) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.d());
        if (list2 != null) {
            raeVarC.c(m47.e(list2, "\n", null, null, 0, null, null, 62, null));
        }
        hpa hpaVar = (hpa) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.F());
        if (hpaVar != null && (strE = rfb.e(hpaVar.getValue())) != null) {
            raeVarC.b(strE);
        }
        TextLayoutResult textLayoutResultC = rfb.c(unmergedConfig);
        if (textLayoutResultC != null) {
            TextLayoutInput layoutInput = textLayoutResultC.getLayoutInput();
            raeVarC.g(b0d.h(layoutInput.getStyle().l()) * layoutInput.getDensity().getDensity() * layoutInput.getDensity().getFontScale(), 0, 0, 0);
        }
        gba gbaVarJ = semanticsNode.j();
        raeVarC.d((int) gbaVarJ.getLeft(), (int) gbaVarJ.getTop(), 0, 0, (int) (gbaVarJ.getRight() - gbaVarJ.getLeft()), (int) (gbaVarJ.getBottom() - gbaVarJ.getTop()));
        return raeVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(int index, SemanticsNode node) {
        if (o()) {
            H(node);
            e(node.getId(), D(node, index));
            j(node, new Function2<Integer, SemanticsNode, Unit>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$updateBuffersOnAppeared$1
                {
                    super(2);
                }

                public final void a(int i, SemanticsNode semanticsNode) {
                    this.this$0.E(i, semanticsNode);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    a(((Number) obj).intValue(), (SemanticsNode) obj2);
                    return Unit.a;
                }
            });
        }
    }

    private final void F(SemanticsNode node) {
        if (o()) {
            f(node.getId());
            List<SemanticsNode> listV = node.v();
            int size = listV.size();
            for (int i = 0; i < size; i++) {
                F(listV.get(i));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x005f A[LOOP:0: B:5:0x0017->B:15:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0062 A[EDGE_INSN: B:19:0x0062->B:16:0x0062 BREAK  A[LOOP:0: B:5:0x0017->B:15:0x005f], SYNTHETIC] */
    private final void G() {
        this.previousSemanticsNodes.g();
        e16<ffb> e16VarK = k();
        int[] iArr = e16VarK.keys;
        Object[] objArr = e16VarK.values;
        long[] jArr = e16VarK.metadata;
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
                            this.previousSemanticsNodes.r(iArr[i4], new dfb(((ffb) objArr[i4]).getSemanticsNode(), k()));
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
        this.previousSemanticsRoot = new dfb(this.view.getSemanticsOwner().d(), k());
    }

    private final void H(SemanticsNode node) {
        AccessibilityAction accessibilityAction;
        Function1 function1A;
        Function1 function1A2;
        seb unmergedConfig = node.getUnmergedConfig();
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(unmergedConfig, SemanticsProperties.a.x());
        if (this.translateStatus == TranslateStatus.SHOW_ORIGINAL && Intrinsics.e(bool, Boolean.TRUE)) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig, SemanticsActions.a.C());
            if (accessibilityAction2 == null || (function1A2 = accessibilityAction2.a()) == null) {
                return;
            }
            return;
        }
        if (this.translateStatus != TranslateStatus.SHOW_TRANSLATED || !Intrinsics.e(bool, Boolean.FALSE) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig, SemanticsActions.a.C())) == null || (function1A = accessibilityAction.a()) == null) {
            return;
        }
    }

    private final void e(int virtualId, rae viewStructure) {
        if (viewStructure == null) {
            return;
        }
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_APPEAR, viewStructure));
    }

    private final void f(int virtualId) {
        this.bufferedEvents.add(new ContentCaptureEvent(virtualId, this.currentSemanticsNodesSnapshotTimestampMillis, ContentCaptureEventType.VIEW_DISAPPEAR, null));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void g(e16<ffb> newSemanticsNodes) throws KotlinNothingValueException {
        int[] iArr;
        long[] jArr;
        int[] iArr2;
        long[] jArr2;
        long j;
        char c2;
        long j2;
        int i;
        SemanticsNode semanticsNode;
        int i2;
        SemanticsNode semanticsNode2;
        long j3;
        int i3;
        long[] jArr3;
        e16<ffb> e16Var = newSemanticsNodes;
        int[] iArr3 = e16Var.keys;
        long[] jArr4 = e16Var.metadata;
        int length = jArr4.length - 2;
        if (length < 0) {
            return;
        }
        int i4 = 0;
        while (true) {
            long j4 = jArr4[i4];
            char c3 = 7;
            long j5 = -9187201950435737472L;
            if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i5 = 8;
                int i6 = 8 - ((~(i4 - length)) >>> 31);
                int i7 = 0;
                while (i7 < i6) {
                    if ((j4 & 255) < 128) {
                        int i8 = iArr3[(i4 << 3) + i7];
                        c2 = c3;
                        dfb dfbVarB = this.previousSemanticsNodes.b(i8);
                        ffb ffbVarB = e16Var.b(i8);
                        SemanticsNode semanticsNodeB = ffbVarB != null ? ffbVarB.getSemanticsNode() : null;
                        if (semanticsNodeB == null) {
                            zw5.d("no value for specified key");
                            throw new KotlinNothingValueException();
                        }
                        if (dfbVarB == null) {
                            k58<SemanticsPropertyKey<?>, Object> k58VarQ = semanticsNodeB.getUnmergedConfig().q();
                            j2 = j5;
                            Object[] objArr = k58VarQ.keys;
                            long[] jArr5 = k58VarQ.metadata;
                            int length2 = jArr5.length - 2;
                            if (length2 >= 0) {
                                int i9 = 0;
                                int i10 = i5;
                                while (true) {
                                    long j6 = jArr5[i9];
                                    iArr2 = iArr3;
                                    if ((((~j6) << c2) & j6 & j2) != j2) {
                                        int i11 = 8 - ((~(i9 - length2)) >>> 31);
                                        int i12 = 0;
                                        while (i12 < i11) {
                                            if ((j6 & 255) < 128) {
                                                i3 = i12;
                                                SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i9 << 3) + i12];
                                                SemanticsProperties semanticsProperties = SemanticsProperties.a;
                                                jArr3 = jArr4;
                                                if (Intrinsics.e(semanticsPropertyKey, semanticsProperties.L())) {
                                                    List list = (List) SemanticsConfigurationKt.a(semanticsNodeB.getUnmergedConfig(), semanticsProperties.L());
                                                    B(semanticsNodeB.getId(), String.valueOf(list != null ? (androidx.compose.ui.text.b) m.B0(list) : null));
                                                }
                                            } else {
                                                i3 = i12;
                                                jArr3 = jArr4;
                                            }
                                            j6 >>= i10;
                                            i12 = i3 + 1;
                                            jArr4 = jArr3;
                                        }
                                        jArr2 = jArr4;
                                        if (i11 != i10) {
                                            break;
                                        }
                                    } else {
                                        jArr2 = jArr4;
                                    }
                                    if (i9 == length2) {
                                        break;
                                    }
                                    i9++;
                                    iArr3 = iArr2;
                                    jArr4 = jArr2;
                                    i10 = 8;
                                }
                            } else {
                                iArr2 = iArr3;
                                jArr2 = jArr4;
                            }
                        } else {
                            iArr2 = iArr3;
                            jArr2 = jArr4;
                            j2 = j5;
                            k58<SemanticsPropertyKey<?>, Object> k58VarQ2 = semanticsNodeB.getUnmergedConfig().q();
                            Object[] objArr2 = k58VarQ2.keys;
                            long[] jArr6 = k58VarQ2.metadata;
                            int length3 = jArr6.length - 2;
                            if (length3 >= 0) {
                                int i13 = 0;
                                while (true) {
                                    long j7 = jArr6[i13];
                                    long[] jArr7 = jArr6;
                                    Object[] objArr3 = objArr2;
                                    if ((((~j7) << c2) & j7 & j2) != j2) {
                                        int i14 = 8 - ((~(i13 - length3)) >>> 31);
                                        int i15 = 0;
                                        while (i15 < i14) {
                                            if ((j7 & 255) < 128) {
                                                i2 = i15;
                                                SemanticsPropertyKey semanticsPropertyKey2 = (SemanticsPropertyKey) objArr3[(i13 << 3) + i15];
                                                SemanticsProperties semanticsProperties2 = SemanticsProperties.a;
                                                semanticsNode2 = semanticsNodeB;
                                                if (Intrinsics.e(semanticsPropertyKey2, semanticsProperties2.L())) {
                                                    List list2 = (List) SemanticsConfigurationKt.a(dfbVarB.getUnmergedConfig(), semanticsProperties2.L());
                                                    androidx.compose.ui.text.b bVar = list2 != null ? (androidx.compose.ui.text.b) m.B0(list2) : null;
                                                    j3 = j4;
                                                    List list3 = (List) SemanticsConfigurationKt.a(semanticsNode2.getUnmergedConfig(), semanticsProperties2.L());
                                                    androidx.compose.ui.text.b bVar2 = list3 != null ? (androidx.compose.ui.text.b) m.B0(list3) : null;
                                                    if (!Intrinsics.e(bVar, bVar2)) {
                                                        B(semanticsNode2.getId(), String.valueOf(bVar2));
                                                    }
                                                }
                                                j7 >>= 8;
                                                i15 = i2 + 1;
                                                semanticsNodeB = semanticsNode2;
                                                j4 = j3;
                                            } else {
                                                i2 = i15;
                                                semanticsNode2 = semanticsNodeB;
                                            }
                                            j3 = j4;
                                            j7 >>= 8;
                                            i15 = i2 + 1;
                                            semanticsNodeB = semanticsNode2;
                                            j4 = j3;
                                        }
                                        semanticsNode = semanticsNodeB;
                                        j = j4;
                                        if (i14 != 8) {
                                            break;
                                        }
                                    } else {
                                        semanticsNode = semanticsNodeB;
                                        j = j4;
                                    }
                                    if (i13 == length3) {
                                        break;
                                    }
                                    i13++;
                                    objArr2 = objArr3;
                                    jArr6 = jArr7;
                                    semanticsNodeB = semanticsNode;
                                    j4 = j;
                                }
                            }
                            i = 8;
                        }
                        j = j4;
                        i = 8;
                    } else {
                        iArr2 = iArr3;
                        jArr2 = jArr4;
                        j = j4;
                        c2 = c3;
                        j2 = j5;
                        i = i5;
                    }
                    j4 = j >> i;
                    i7++;
                    e16Var = newSemanticsNodes;
                    i5 = i;
                    c3 = c2;
                    j5 = j2;
                    iArr3 = iArr2;
                    jArr4 = jArr2;
                }
                iArr = iArr3;
                jArr = jArr4;
                if (i6 != i5) {
                    return;
                }
            } else {
                iArr = iArr3;
                jArr = jArr4;
            }
            if (i4 == length) {
                return;
            }
            i4++;
            e16Var = newSemanticsNodes;
            iArr3 = iArr;
            jArr4 = jArr;
        }
    }

    private final void h() {
        AccessibilityAction accessibilityAction;
        Function0 function0A;
        e16<ffb> e16VarK = k();
        Object[] objArr = e16VarK.values;
        long[] jArr = e16VarK.metadata;
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
                        seb unmergedConfig = ((ffb) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (SemanticsConfigurationKt.a(unmergedConfig, SemanticsProperties.a.x()) != null && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig, SemanticsActions.a.a())) != null && (function0A = accessibilityAction.a()) != null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(AndroidContentCaptureManager androidContentCaptureManager) {
        if (androidContentCaptureManager.o()) {
            Trace.beginSection("ContentCapture:changeChecker");
            try {
                androidx.compose.ui.node.m.e(androidContentCaptureManager.view, false, 1, null);
                androidContentCaptureManager.z();
                Trace.beginSection("ContentCapture:sendAppearEvents");
                try {
                    androidContentCaptureManager.y(androidContentCaptureManager.view.getSemanticsOwner().d(), androidContentCaptureManager.previousSemanticsRoot);
                    Unit unit = Unit.a;
                    Trace.endSection();
                    androidContentCaptureManager.g(androidContentCaptureManager.k());
                    androidContentCaptureManager.G();
                    androidContentCaptureManager.checkingForSemanticsChanges = false;
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
    }

    private final void j(SemanticsNode semanticsNode, Function2<? super Integer, ? super SemanticsNode, Unit> function2) {
        List<SemanticsNode> listV = semanticsNode.v();
        int size = listV.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode2 = listV.get(i2);
            if (k().a(semanticsNode2.getId())) {
                function2.invoke(Integer.valueOf(i), semanticsNode2);
                i++;
            }
        }
    }

    private final void n() {
        AccessibilityAction accessibilityAction;
        Function1 function1A;
        e16<ffb> e16VarK = k();
        Object[] objArr = e16VarK.values;
        long[] jArr = e16VarK.metadata;
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
                        seb unmergedConfig = ((ffb) objArr[(i << 3) + i3]).getSemanticsNode().getUnmergedConfig();
                        if (Intrinsics.e(SemanticsConfigurationKt.a(unmergedConfig, SemanticsProperties.a.x()), Boolean.TRUE) && (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig, SemanticsActions.a.C())) != null && (function1A = accessibilityAction.a()) != null) {
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void p() throws NoWhenBranchMatchedException {
        az1 az1Var = this.contentCaptureSession;
        if (az1Var == null || Build.VERSION.SDK_INT < 29 || this.bufferedEvents.isEmpty()) {
            return;
        }
        List<ContentCaptureEvent> list = this.bufferedEvents;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ContentCaptureEvent contentCaptureEvent = list.get(i);
            int i2 = c.$EnumSwitchMapping$0[contentCaptureEvent.getType().ordinal()];
            if (i2 == 1) {
                rae structureCompat = contentCaptureEvent.getStructureCompat();
                if (structureCompat != null) {
                    az1Var.e(structureCompat.h());
                }
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                AutofillId autofillIdA = az1Var.a(contentCaptureEvent.getId());
                if (autofillIdA != null) {
                    az1Var.d(autofillIdA);
                }
            }
        }
        az1Var.flush();
        this.bufferedEvents.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q() {
        this.boundsUpdateChannel.e(Unit.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final void y(SemanticsNode newNode, final dfb oldNode) throws KotlinNothingValueException {
        j(newNode, new Function2<Integer, SemanticsNode, Unit>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$sendContentCaptureAppearEvents$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(int i, SemanticsNode semanticsNode) {
                if (oldNode.getChildren().a(semanticsNode.getId())) {
                    return;
                }
                this.E(i, semanticsNode);
                this.q();
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a(((Number) obj).intValue(), (SemanticsNode) obj2);
                return Unit.a;
            }
        });
        List<SemanticsNode> listV = newNode.v();
        int size = listV.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = listV.get(i);
            if (k().a(semanticsNode.getId()) && this.previousSemanticsNodes.a(semanticsNode.getId())) {
                dfb dfbVarB = this.previousSemanticsNodes.b(semanticsNode.getId());
                if (dfbVarB == null) {
                    zw5.d("node not present in pruned tree before this change");
                    throw new KotlinNothingValueException();
                }
                y(semanticsNode, dfbVarB);
            }
        }
    }

    private final void z() {
        o48<dfb> o48Var = this.previousSemanticsNodes;
        int[] iArr = o48Var.keys;
        long[] jArr = o48Var.metadata;
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
                        int i4 = iArr[(i << 3) + i3];
                        if (!k().a(i4)) {
                            f(i4);
                            q();
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

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:21:0x0055  */
    /* JADX WARN: Code duplicated, block: B:24:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x0069  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:34:0x008a  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0087, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r5, r0) == r1) goto L33;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x0087 -> B:13:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(com.google.android.q22<? super kotlin.Unit> r9) throws kotlin.NoWhenBranchMatchedException {
        /*
            r8 = this;
            boolean r0 = r9 instanceof androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            if (r0 == 0) goto L13
            r0 = r9
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = (androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1 r0 = new androidx.compose.ui.contentcapture.AndroidContentCaptureManager$boundsUpdatesEventLoop$1
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.g()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r2 = r0.L$0
            com.google.android.o81 r2 = (com.google.android.o81) r2
            kotlin.f.b(r9)
        L2f:
            r9 = r2
            goto L4a
        L31:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L39:
            java.lang.Object r2 = r0.L$0
            com.google.android.o81 r2 = (com.google.android.o81) r2
            kotlin.f.b(r9)
            goto L58
        L41:
            kotlin.f.b(r9)
            com.google.android.h81<kotlin.Unit> r9 = r8.boundsUpdateChannel
            com.google.android.o81 r9 = r9.iterator()
        L4a:
            r0.L$0 = r9
            r0.label = r4
            java.lang.Object r2 = r9.a(r0)
            if (r2 != r1) goto L55
            goto L89
        L55:
            r7 = r2
            r2 = r9
            r9 = r7
        L58:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L8a
            r2.next()
            boolean r9 = r8.o()
            if (r9 == 0) goto L6c
            r8.p()
        L6c:
            android.os.Handler r9 = r8.l()
            boolean r5 = r8.checkingForSemanticsChanges
            if (r5 != 0) goto L7d
            if (r9 == 0) goto L7d
            r8.checkingForSemanticsChanges = r4
            java.lang.Runnable r5 = r8.contentCaptureChangeChecker
            r9.post(r5)
        L7d:
            long r5 = r8.SendRecurringContentCaptureEventsIntervalMillis
            r0.L$0 = r2
            r0.label = r3
            java.lang.Object r9 = kotlinx.coroutines.DelayKt.b(r5, r0)
            if (r9 != r1) goto L2f
        L89:
            return r1
        L8a:
            kotlin.Unit r9 = kotlin.Unit.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.contentcapture.AndroidContentCaptureManager.d(com.google.android.q22):java.lang.Object");
    }

    public final e16<ffb> k() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = ifb.a(this.view.getSemanticsOwner(), -1, new Function1<SemanticsNode, Boolean>() { // from class: androidx.compose.ui.contentcapture.AndroidContentCaptureManager$currentSemanticsNodes$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(SemanticsNode semanticsNode) {
                    return Boolean.valueOf(gfb.a(semanticsNode));
                }
            });
            this.currentSemanticsNodesSnapshotTimestampMillis = System.currentTimeMillis();
        }
        return this.currentSemanticsNodes;
    }

    public final Handler l() {
        return fj.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final boolean o() {
        return androidx.compose.ui.contentcapture.c.INSTANCE.a() && this.contentCaptureSession != null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.ux2
    public void onStart(n17 owner) throws NoWhenBranchMatchedException {
        this.contentCaptureSession = (az1) this.onContentCaptureSession.invoke();
        E(-1, this.view.getSemanticsOwner().d());
        p();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.ux2
    public void onStop(n17 owner) throws NoWhenBranchMatchedException {
        F(this.view.getSemanticsOwner().d());
        p();
        this.contentCaptureSession = null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View v) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View v) {
        Handler handlerL = l();
        Intrinsics.g(handlerL);
        handlerL.removeCallbacks(this.contentCaptureChangeChecker);
        this.contentCaptureSession = null;
    }

    public final void r() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        h();
    }

    public final void s(long[] virtualIds, int[] supportedFormats, Consumer<ViewTranslationRequest> requestsCollector) {
        b.a.c(this, virtualIds, supportedFormats, requestsCollector);
    }

    public final void t() {
        this.translateStatus = TranslateStatus.SHOW_ORIGINAL;
        n();
    }

    public final void u() {
        this.currentSemanticsNodesInvalidated = true;
        if (o()) {
            q();
        }
    }

    public final void v() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handlerL = l();
        if (!o() || this.checkingForSemanticsChanges || handlerL == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handlerL.post(this.contentCaptureChangeChecker);
    }

    public final void w() {
        this.translateStatus = TranslateStatus.SHOW_TRANSLATED;
        C();
    }

    public final void x(AndroidContentCaptureManager contentCaptureManager, LongSparseArray<ViewTranslationResponse> response) {
        b.a.d(contentCaptureManager, response);
    }
}
