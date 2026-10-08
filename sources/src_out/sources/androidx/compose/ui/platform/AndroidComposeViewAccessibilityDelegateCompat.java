package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.collection.ScatterSet;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import androidx.compose.ui.platform.accessibility.CollectionInfo_androidKt;
import androidx.compose.ui.semantics.SemanticsActions;
import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import androidx.compose.ui.semantics.SemanticsNode;
import androidx.compose.ui.semantics.SemanticsProperties;
import androidx.compose.ui.semantics.SemanticsPropertiesAndroid;
import androidx.compose.ui.semantics.SemanticsPropertyKey;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.lifecycle.Lifecycle;
import com.google.android.h81;
import com.google.android.p81;
import com.google.android.ps4;
import com.google.inputmethod.AccessibilityAction;
import com.google.inputmethod.CustomAccessibilityAction;
import com.google.inputmethod.ProgressBarRangeInfo;
import com.google.inputmethod.ScrollAxisRange;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.a6;
import com.google.inputmethod.ard;
import com.google.inputmethod.b6;
import com.google.inputmethod.bfb;
import com.google.inputmethod.d57;
import com.google.inputmethod.d58;
import com.google.inputmethod.d6;
import com.google.inputmethod.dfb;
import com.google.inputmethod.e0c;
import com.google.inputmethod.e16;
import com.google.inputmethod.efb;
import com.google.inputmethod.f16;
import com.google.inputmethod.f6;
import com.google.inputmethod.ffb;
import com.google.inputmethod.fj;
import com.google.inputmethod.g10;
import com.google.inputmethod.gba;
import com.google.inputmethod.gfb;
import com.google.inputmethod.hd5;
import com.google.inputmethod.hpa;
import com.google.inputmethod.ifb;
import com.google.inputmethod.k16;
import com.google.inputmethod.k33;
import com.google.inputmethod.kba;
import com.google.inputmethod.ki8;
import com.google.inputmethod.kn6;
import com.google.inputmethod.l16;
import com.google.inputmethod.ln6;
import com.google.inputmethod.m47;
import com.google.inputmethod.m48;
import com.google.inputmethod.mh;
import com.google.inputmethod.mq1;
import com.google.inputmethod.n48;
import com.google.inputmethod.nfb;
import com.google.inputmethod.ni8;
import com.google.inputmethod.o48;
import com.google.inputmethod.o9b;
import com.google.inputmethod.p16;
import com.google.inputmethod.p48;
import com.google.inputmethod.r16;
import com.google.inputmethod.r58;
import com.google.inputmethod.r6;
import com.google.inputmethod.rfb;
import com.google.inputmethod.rn8;
import com.google.inputmethod.s06;
import com.google.inputmethod.s6;
import com.google.inputmethod.seb;
import com.google.inputmethod.t04;
import com.google.inputmethod.x06;
import com.google.inputmethod.xkb;
import com.google.inputmethod.xl8;
import com.google.inputmethod.xy9;
import com.google.inputmethod.xz9;
import com.google.inputmethod.y06;
import com.google.inputmethod.y23;
import com.google.inputmethod.zw5;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u000f\b\u0001\u0018\u0000 ¸\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\nà\u0001í\u0001é\u0001Ô\u0001Ø\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010(\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u00020\t*\u00020\u001a2\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u0004\u0018\u000104*\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b7\u00100J\u0017\u00108\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b:\u00109J=\u0010@\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00112\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011H\u0003¢\u0006\u0004\bF\u0010GJ?\u0010M\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010\u00112\b\u0010I\u001a\u0004\u0018\u00010\u00112\b\u0010J\u001a\u0004\u0018\u00010\u00112\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u00109J)\u0010S\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\u00020\u000f*\u00020+H\u0003¢\u0006\u0004\bU\u0010VJ\u0013\u0010W\u001a\u00020\u000f*\u00020+H\u0002¢\u0006\u0004\bW\u0010VJ#\u0010Z\u001a\u00020\u0013*\u00020+2\u0006\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020\u0013H\u0002¢\u0006\u0004\bZ\u0010[J#\u0010]\u001a\u00020\u0013*\u00020+2\u0006\u0010X\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u0013H\u0002¢\u0006\u0004\b]\u0010[J1\u0010_\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010^\u001a\u00020>2\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\b_\u0010`J'\u0010e\u001a\u00020d2\u0006\u0010\u001f\u001a\u00020+2\u0006\u0010a\u001a\u00020 2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\be\u0010fJ\u001b\u0010g\u001a\u00020d*\u00020 2\u0006\u0010a\u001a\u00020 H\u0002¢\u0006\u0004\bg\u0010hJ#\u0010l\u001a\u0004\u0018\u00010k2\b\u0010i\u001a\u0004\u0018\u00010+2\u0006\u0010j\u001a\u00020dH\u0002¢\u0006\u0004\bl\u0010mJ#\u0010s\u001a\u00020r*\u00020b2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\bs\u0010tJ%\u0010w\u001a\u0004\u0018\u00010 *\u00020r2\u0006\u0010u\u001a\u00020#2\u0006\u0010v\u001a\u00020#H\u0002¢\u0006\u0004\bw\u0010xJ\u0015\u0010z\u001a\u0004\u0018\u00010y*\u00020rH\u0002¢\u0006\u0004\bz\u0010{J%\u0010}\u001a\u0004\u0018\u00010|*\u00020r2\u0006\u0010u\u001a\u00020#2\u0006\u0010v\u001a\u00020#H\u0002¢\u0006\u0004\b}\u0010~J(\u0010\u007f\u001a\u00020 *\u00020d2\b\b\u0002\u0010u\u001a\u00020#2\b\b\u0002\u0010v\u001a\u00020#H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J3\u0010\u0084\u0001\u001a\u0004\u0018\u00018\u0000\"\t\b\u0000\u0010\u0083\u0001*\u00020K2\b\u0010L\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010o\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J&\u0010\u008d\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u000bJ\u0011\u0010\u0090\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u000bJ!\u0010\u0092\u0001\u001a\u00020\t2\r\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J+\u0010\u0097\u0001\u001a\u00020\u000f2\u0007\u0010\u0094\u0001\u001a\u00020\u00112\u000e\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010=H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\t2\b\u0010\u0099\u0001\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J.\u0010\u009e\u0001\u001a\u00020\t2\u0007\u0010\u009c\u0001\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J%\u0010£\u0001\u001a\u00020\t2\u0007\u0010 \u0001\u001a\u00020+2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001b\u0010¥\u0001\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J5\u0010ª\u0001\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020+2\u0007\u0010§\u0001\u001a\u00020\u00112\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001b\u0010¬\u0001\u001a\u00020\t2\u0007\u0010\u009c\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¬\u0001\u0010\u0082\u0001J5\u0010°\u0001\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020+2\u0007\u0010\u00ad\u0001\u001a\u00020\u00112\u0007\u0010®\u0001\u001a\u00020\u00112\u0007\u0010¯\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010²\u0001\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001a\u0010´\u0001\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0006\b´\u0001\u0010³\u0001J\u0019\u0010µ\u0001\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0005\bµ\u0001\u0010VJ(\u0010·\u0001\u001a\u0005\u0018\u00010¶\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010+2\u0007\u0010§\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001e\u0010¹\u0001\u001a\u0004\u0018\u00010>2\b\u0010\u001f\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u0019\u0010¼\u0001\u001a\u0004\u0018\u000103*\u00030»\u0001H\u0002¢\u0006\u0006\b¼\u0001\u0010½\u0001J\u001b\u0010¿\u0001\u001a\u00020\t2\u0007\u0010\u0006\u001a\u00030¾\u0001H\u0016¢\u0006\u0006\b¿\u0001\u0010À\u0001J\u001b\u0010Á\u0001\u001a\u00020\t2\u0007\u0010\u0006\u001a\u00030¾\u0001H\u0016¢\u0006\u0006\bÁ\u0001\u0010À\u0001J\u001b\u0010Ã\u0001\u001a\u00020\t2\u0007\u0010Â\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J\u001b\u0010Å\u0001\u001a\u00020\t2\u0007\u0010Â\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\bÅ\u0001\u0010Ä\u0001J*\u0010Æ\u0001\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0006\bÆ\u0001\u0010Ç\u0001J\u001b\u0010É\u0001\u001a\u00020\u000f2\u0007\u0010C\u001a\u00030È\u0001H\u0000¢\u0006\u0006\bÉ\u0001\u0010Ê\u0001J#\u0010\u0083\u0001\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020#2\u0007\u0010\u008f\u0001\u001a\u00020#H\u0001¢\u0006\u0006\b\u0083\u0001\u0010Ë\u0001J\u001d\u0010Î\u0001\u001a\u00030Í\u00012\b\u0010Ì\u0001\u001a\u00030¾\u0001H\u0016¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0011\u0010Ð\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\bÐ\u0001\u0010\u000bJ\u0013\u0010Ñ\u0001\u001a\u00020\tH\u0080@¢\u0006\u0006\bÑ\u0001\u0010Ò\u0001J\u001c\u0010Ó\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0006\bÓ\u0001\u0010\u0089\u0001R\u001b\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0010\n\u0006\bÔ\u0001\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010×\u0001R0\u0010Þ\u0001\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bØ\u0001\u0010Ù\u0001\u0012\u0005\bÝ\u0001\u0010\u000b\u001a\u0006\bÚ\u0001\u0010Û\u0001\"\u0006\bÜ\u0001\u0010\u0082\u0001R=\u0010ç\u0001\u001a\u000f\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000f0ß\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bà\u0001\u0010á\u0001\u0012\u0005\bæ\u0001\u0010\u000b\u001a\u0006\bâ\u0001\u0010ã\u0001\"\u0006\bä\u0001\u0010å\u0001R\u0018\u0010ë\u0001\u001a\u00030è\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ê\u0001R0\u0010ð\u0001\u001a\u00020\u000f2\u0007\u0010ì\u0001\u001a\u00020\u000f8\u0000@@X\u0080\u000e¢\u0006\u0016\n\u0005\bí\u0001\u0010U\u001a\u0005\bî\u0001\u0010\u0018\"\u0006\bï\u0001\u0010Ä\u0001R*\u0010ø\u0001\u001a\u00030ñ\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001\"\u0006\bö\u0001\u0010÷\u0001R\"\u0010ü\u0001\u001a\u000b\u0012\u0005\u0012\u00030ù\u0001\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bú\u0001\u0010û\u0001R+\u0010\u0083\u0002\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bý\u0001\u0010þ\u0001\u001a\u0006\bÿ\u0001\u0010\u0080\u0002\"\u0006\b\u0081\u0002\u0010\u0082\u0002R\u0018\u0010\u0087\u0002\u001a\u00030\u0084\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u001e\u0010\u008b\u0002\u001a\u00070\u0088\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0002\u0010\u008a\u0002R\u0019\u0010\u008d\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010Ù\u0001R\u0019\u0010\u008f\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0002\u0010Ù\u0001R\u001b\u0010\u0092\u0002\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0002\u0010\u0091\u0002R\u001b\u0010\u0094\u0002\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0093\u0002\u0010\u0091\u0002R\u0018\u0010\u0096\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0095\u0002\u0010UR\u001f\u0010\u009b\u0002\u001a\n\u0012\u0005\u0012\u00030\u0098\u00020\u0097\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0099\u0002\u0010\u009a\u0002R\u001f\u0010\u009d\u0002\u001a\n\u0012\u0005\u0012\u00030\u0098\u00020\u0097\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009c\u0002\u0010\u009a\u0002R'\u0010¡\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020K0\u009e\u00020\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0002\u0010 \u0002R&\u0010£\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020K0¢\u00020\u009e\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010 \u0002R\u0018\u0010¤\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bZ\u0010Ù\u0001R\u001a\u0010¦\u0002\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b!\u0010¥\u0002R\u001f\u0010©\u0002\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010§\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0001\u0010¨\u0002R\u001e\u0010¬\u0002\u001a\t\u0012\u0004\u0012\u00020\t0ª\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÆ\u0001\u0010«\u0002R\u0017\u0010\u00ad\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010UR\u001c\u0010°\u0002\u001a\u0005\u0018\u00010®\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010¯\u0002R%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b\u001b\u0010±\u0002\u001a\u0006\b²\u0002\u0010³\u0002R\u0019\u0010µ\u0002\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010´\u0002R)\u0010¼\u0002\u001a\u00030¶\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bM\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R*\u0010¿\u0002\u001a\u00030¶\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÉ\u0001\u0010·\u0002\u001a\u0006\b½\u0002\u0010¹\u0002\"\u0006\b¾\u0002\u0010»\u0002R\u001e\u0010Ã\u0002\u001a\u00020>8\u0000X\u0080D¢\u0006\u000f\n\u0005\b\u001d\u0010À\u0002\u001a\u0006\bÁ\u0002\u0010Â\u0002R\u001f\u0010Ä\u0002\u001a\u00020>8\u0000X\u0080D¢\u0006\u0010\n\u0006\b´\u0001\u0010À\u0002\u001a\u0006\bó\u0001\u0010Â\u0002R\u0018\u0010Ç\u0002\u001a\u00030Å\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010Æ\u0002R!\u0010É\u0002\u001a\n\u0012\u0005\u0012\u00030¡\u00010\u0097\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0002\u0010\u009a\u0002R\u001a\u0010Ë\u0002\u001a\u00030¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b²\u0002\u0010Ê\u0002R\u0018\u0010Ì\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÙ\u0001\u0010UR\u0018\u0010Í\u0002\u001a\u00030¶\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bó\u0001\u0010·\u0002R\u0018\u0010Ð\u0002\u001a\u00030Î\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÁ\u0002\u0010Ï\u0002R\u001f\u0010Ó\u0002\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010Ñ\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0002\u0010û\u0001R%\u0010Ô\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0095\u0001\u0012\u0004\u0012\u00020\t0ß\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b½\u0002\u0010á\u0001R\u001e\u0010Ö\u0002\u001a\t\u0012\u0005\u0012\u00030ù\u00010=8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÙ\u0001\u0010Õ\u0002R\u0016\u0010Ø\u0002\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b×\u0002\u0010\u0018R!\u0010Û\u0002\u001a\u0005\u0018\u00010\u0084\u00028BX\u0082\u0004¢\u0006\u000f\u0012\u0005\bÚ\u0002\u0010\u000b\u001a\u0006\bÒ\u0002\u0010Ù\u0002R\u001b\u0010Ý\u0002\u001a\u00020 *\u00020\u001a8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010Ü\u0002R\u0016\u0010ß\u0002\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bÞ\u0002\u0010\u0018¨\u0006à\u0002"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;", "Lcom/google/android/a6;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "", "k0", "()V", "Lcom/google/android/e16;", "Lcom/google/android/ffb;", "currentSemanticsNodes", "", "vertical", "", "direction", "Lcom/google/android/rn8;", "position", "x", "(Lcom/google/android/e16;ZIJ)Z", "X", "()Z", "virtualViewId", "Lcom/google/android/r6;", "z", "(I)Lcom/google/android/r6;", "D", "()Lcom/google/android/r6;", "node", "Landroid/graphics/Rect;", "u", "(Lcom/google/android/ffb;)Landroid/graphics/Rect;", "", "left", "top", "right", "bottom", "I0", "(FFFF)Landroid/graphics/Rect;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "g0", "(ILcom/google/android/r6;Landroidx/compose/ui/semantics/SemanticsNode;)V", "B0", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/r6;)V", "C0", "(Lcom/google/android/r6;Landroidx/compose/ui/semantics/SemanticsNode;)V", "Landroidx/compose/ui/text/b;", "Landroid/text/SpannableString;", "N0", "(Landroidx/compose/ui/text/b;)Landroid/text/SpannableString;", "E0", "U", "(I)Z", "requestAccessibilityFocus", "eventType", "contentChangeType", "", "", "contentDescription", "t0", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "s0", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "createEvent", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "B", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "clearAccessibilityFocus", "action", "Landroid/os/Bundle;", "arguments", "e0", "(IILandroid/os/Bundle;)Z", "Z", "(Landroidx/compose/ui/semantics/SemanticsNode;)Z", "o0", "scrollableAncestor", "offset", "t", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroidx/compose/ui/semantics/SemanticsNode;J)J", "offsetAdjustment", "m0", "extraDataKey", "s", "(ILcom/google/android/r6;Ljava/lang/String;Landroid/os/Bundle;)V", "nodeBoundsInScreen", "Lcom/google/android/xkb;", "shape", "Lcom/google/android/gba;", "Q", "(Landroidx/compose/ui/semantics/SemanticsNode;Landroid/graphics/Rect;Lcom/google/android/xkb;)Lcom/google/android/gba;", "J0", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Lcom/google/android/gba;", "textNode", "bounds", "Landroid/graphics/RectF;", "M0", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/gba;)Landroid/graphics/RectF;", "Lcom/google/android/tsb;", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/graphics/n;", "A", "(Lcom/google/android/xkb;JLandroidx/compose/ui/unit/LayoutDirection;)Landroidx/compose/ui/graphics/n;", "leftOffset", "topOffset", "F0", "(Landroidx/compose/ui/graphics/n;FF)Landroid/graphics/Rect;", "", "K0", "(Landroidx/compose/ui/graphics/n;)[F", "Landroid/graphics/Region;", "L0", "(Landroidx/compose/ui/graphics/n;FF)Landroid/graphics/Region;", "G0", "(Lcom/google/android/gba;FF)Landroid/graphics/Rect;", "updateHoveredVirtualView", "(I)V", "T", "P0", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/LayoutNode;", "layoutNode", "b0", "(Landroidx/compose/ui/node/LayoutNode;)V", "z0", "Lcom/google/android/p48;", "subtreeChangedSemanticsNodesIds", "y0", "(Landroidx/compose/ui/node/LayoutNode;Lcom/google/android/p48;)V", "y", "Q0", "newSemanticsNodes", "x0", "(Lcom/google/android/e16;)V", "id", "Lcom/google/android/o9b;", "oldScrollObservationScopes", "j0", "(ILjava/util/List;)Z", "scrollObservationScope", "l0", "(Lcom/google/android/o9b;)V", "semanticsNodeId", "title", "v0", "(IILjava/lang/String;)V", "newNode", "Lcom/google/android/dfb;", "oldNode", "r0", "(Landroidx/compose/ui/semantics/SemanticsNode;Lcom/google/android/dfb;)V", "q0", "(I)I", "granularity", "forward", "extendSelection", "O0", "(Landroidx/compose/ui/semantics/SemanticsNode;IZZ)Z", "w0", "start", "end", "traversalMode", "A0", "(Landroidx/compose/ui/semantics/SemanticsNode;IIZ)Z", "F", "(Landroidx/compose/ui/semantics/SemanticsNode;)I", "E", "V", "Lcom/google/android/d6;", "P", "(Landroidx/compose/ui/semantics/SemanticsNode;I)Lcom/google/android/d6;", "O", "(Landroidx/compose/ui/semantics/SemanticsNode;)Ljava/lang/String;", "Lcom/google/android/seb;", "R", "(Lcom/google/android/seb;)Landroidx/compose/ui/text/b;", "Landroid/view/View;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "enabled", "onAccessibilityStateChanged", "(Z)V", "onTouchExplorationStateChanged", "w", "(ZIJ)Z", "Landroid/view/MotionEvent;", "C", "(Landroid/view/MotionEvent;)Z", "(FF)I", "host", "Lcom/google/android/s6;", "getAccessibilityNodeProvider", "(Landroid/view/View;)Lcom/google/android/s6;", "d0", "v", "(Lcom/google/android/q22;)Ljava/lang/Object;", "c0", "a", "Landroidx/compose/ui/platform/AndroidComposeView;", "S", "()Landroidx/compose/ui/platform/AndroidComposeView;", "b", "I", "getHoveredVirtualViewId$ui", "()I", "setHoveredVirtualViewId$ui", "getHoveredVirtualViewId$ui$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "c", "Lkotlin/jvm/functions/Function1;", "getOnSendAccessibilityEvent$ui", "()Lkotlin/jvm/functions/Function1;", "setOnSendAccessibilityEvent$ui", "(Lkotlin/jvm/functions/Function1;)V", "getOnSendAccessibilityEvent$ui$annotations", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "d", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "e", "getAccessibilityForceEnabledForTesting$ui", "setAccessibilityForceEnabledForTesting$ui", "accessibilityForceEnabledForTesting", "", "f", "J", "getSendRecurringAccessibilityEventsIntervalMillis$ui", "()J", "D0", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "g", "Ljava/util/List;", "_enabledServices", "h", "Ljava/lang/Boolean;", "getRequestFromAccessibilityToolForTesting$ui", "()Ljava/lang/Boolean;", "setRequestFromAccessibilityToolForTesting$ui", "(Ljava/lang/Boolean;)V", "requestFromAccessibilityToolForTesting", "Landroid/os/Handler;", "i", "Landroid/os/Handler;", "legacyMainHandler", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$d;", "j", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$d;", "nodeProvider", "k", "accessibilityFocusedVirtualViewId", "l", "focusedVirtualViewId", "m", "Lcom/google/android/r6;", "currentlyAccessibilityFocusedANI", "n", "currentlyFocusedANI", "o", "sendingFocusAffectingEvent", "Lcom/google/android/o48;", "Lcom/google/android/a9b;", "p", "Lcom/google/android/o48;", "pendingHorizontalScrollEvents", "q", "pendingVerticalScrollEvents", "Lcom/google/android/e0c;", "r", "Lcom/google/android/e0c;", "actionIdToLabel", "Lcom/google/android/d58;", "labelToActionId", "accessibilityCursorPosition", "Ljava/lang/Integer;", "previousTraversedNode", "Lcom/google/android/g10;", "Lcom/google/android/g10;", "subtreeChangedLayoutNodes", "Lcom/google/android/h81;", "Lcom/google/android/h81;", "boundsUpdateChannel", "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$e;", "Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$e;", "pendingTextTraversedEvent", "Lcom/google/android/e16;", "H", "()Lcom/google/android/e16;", "Lcom/google/android/p48;", "paneDisplayed", "Lcom/google/android/m48;", "Lcom/google/android/m48;", "N", "()Lcom/google/android/m48;", "setIdToBeforeMap$ui", "(Lcom/google/android/m48;)V", "idToBeforeMap", "M", "setIdToAfterMap$ui", "idToAfterMap", "Ljava/lang/String;", "K", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "ExtraDataTestTraversalAfterVal", "Lcom/google/android/ard;", "Lcom/google/android/ard;", "urlSpanCache", "G", "previousSemanticsNodes", "Lcom/google/android/dfb;", "previousSemanticsRoot", "checkingForSemanticsChanges", "drawingOrder", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "", "L", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "()Ljava/util/List;", "enabledServices", "Y", "isTouchExplorationEnabled", "()Landroid/os/Handler;", "getHandler$annotations", "handler", "(Lcom/google/android/r6;)Landroid/graphics/Rect;", "boundsInScreen", "W", "isEnabled", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AndroidComposeViewAccessibilityDelegateCompat extends a6 implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {
    public static final int O = 8;
    private static final x06 P = y06.d(xy9.a, xy9.b, xy9.m, xy9.x, xy9.A, xy9.B, xy9.C, xy9.D, xy9.E, xy9.F, xy9.c, xy9.d, xy9.e, xy9.f, xy9.g, xy9.h, xy9.i, xy9.j, xy9.k, xy9.l, xy9.n, xy9.o, xy9.p, xy9.q, xy9.r, xy9.s, xy9.t, xy9.u, xy9.v, xy9.w, xy9.y, xy9.z);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private p48 paneDisplayed;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private m48 idToBeforeMap;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private m48 idToAfterMap;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final String ExtraDataTestTraversalBeforeVal;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final String ExtraDataTestTraversalAfterVal;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final ard urlSpanCache;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private o48<dfb> previousSemanticsNodes;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private dfb previousSemanticsRoot;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final m48 drawingOrder;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final Runnable semanticsChangeChecker;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final List<o9b> scrollObservationScopes;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final Function1<o9b, Unit> scheduleScrollEventIfNeededLambda;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AndroidComposeView view;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int hoveredVirtualViewId = t04.INVALID_ID;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private Function1<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new Function1<AccessibilityEvent, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1
        {
            super(1);
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(this.this$0.getView().getParent().requestSendAccessibilityEvent(this.this$0.getView(), accessibilityEvent));
        }
    };

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final AccessibilityManager accessibilityManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean accessibilityForceEnabledForTesting;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private long SendRecurringAccessibilityEventsIntervalMillis;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private List<? extends AccessibilityServiceInfo> _enabledServices;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private Boolean requestFromAccessibilityToolForTesting;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final Handler legacyMainHandler;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private d nodeProvider;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private int accessibilityFocusedVirtualViewId;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private int focusedVirtualViewId;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private r6 currentlyAccessibilityFocusedANI;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private r6 currentlyFocusedANI;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private boolean sendingFocusAffectingEvent;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final o48<ScrollAxisRange> pendingHorizontalScrollEvents;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final o48<ScrollAxisRange> pendingVerticalScrollEvents;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    private e0c<e0c<CharSequence>> actionIdToLabel;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    private e0c<d58<CharSequence>> labelToActionId;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    private int accessibilityCursorPosition;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    private Integer previousTraversedNode;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    private final g10<LayoutNode> subtreeChangedLayoutNodes;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final h81<Unit> boundsUpdateChannel;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private e pendingTextTraversedEvent;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private e16<ffb> currentSemanticsNodes;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$a;", "", "<init>", "()V", "Lcom/google/android/r6;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "a", "(Lcom/google/android/r6;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {
        public static final a a = new a();

        private a() {
        }

        public static final void a(r6 info, SemanticsNode semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode) || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.y())) == null) {
                return;
            }
            info.b(new r6.a(R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$b;", "", "<init>", "()V", "Lcom/google/android/r6;", "info", "Landroidx/compose/ui/semantics/SemanticsNode;", "semanticsNode", "", "a", "(Lcom/google/android/r6;Landroidx/compose/ui/semantics/SemanticsNode;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {
        public static final b a = new b();

        private b() {
        }

        public static final void a(r6 info, SemanticsNode semanticsNode) {
            hpa hpaVar = (hpa) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsProperties.a.F());
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
                if (hpaVar == null ? false : hpa.m(hpaVar.getValue(), hpa.INSTANCE.b())) {
                    return;
                }
                seb unmergedConfig = semanticsNode.getUnmergedConfig();
                SemanticsActions semanticsActions = SemanticsActions.a;
                AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig, semanticsActions.s());
                if (accessibilityAction != null) {
                    info.b(new r6.a(R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.p());
                if (accessibilityAction2 != null) {
                    info.b(new r6.a(R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.q());
                if (accessibilityAction3 != null) {
                    info.b(new r6.a(R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.r());
                if (accessibilityAction4 != null) {
                    info.b(new r6.a(R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$d;", "Lcom/google/android/s6;", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat;)V", "", "virtualViewId", "Lcom/google/android/r6;", "b", "(I)Lcom/google/android/r6;", "action", "Landroid/os/Bundle;", "arguments", "", "f", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "", "a", "(ILcom/google/android/r6;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class d extends s6 {
        public d() {
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.google.inputmethod.s6
        public void a(int virtualViewId, r6 info, String extraDataKey, Bundle arguments) throws NoWhenBranchMatchedException {
            AndroidComposeViewAccessibilityDelegateCompat.this.s(virtualViewId, info, extraDataKey, arguments);
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        @Override // com.google.inputmethod.s6
        public r6 b(int virtualViewId) throws NoWhenBranchMatchedException, KotlinNothingValueException {
            r6 r6VarZ = AndroidComposeViewAccessibilityDelegateCompat.this.z(virtualViewId);
            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = AndroidComposeViewAccessibilityDelegateCompat.this;
            if (androidComposeViewAccessibilityDelegateCompat.sendingFocusAffectingEvent) {
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.accessibilityFocusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI = r6VarZ;
                }
                if (virtualViewId == androidComposeViewAccessibilityDelegateCompat.focusedVirtualViewId) {
                    androidComposeViewAccessibilityDelegateCompat.currentlyFocusedANI = r6VarZ;
                }
            }
            return r6VarZ;
        }

        @Override // com.google.inputmethod.s6
        public r6 d(int focus) {
            if (focus == 1) {
                if (AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return b(AndroidComposeViewAccessibilityDelegateCompat.this.focusedVirtualViewId);
            }
            if (focus == 2) {
                return b(AndroidComposeViewAccessibilityDelegateCompat.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + focus);
        }

        @Override // com.google.inputmethod.s6
        public boolean f(int virtualViewId, int action, Bundle arguments) {
            return AndroidComposeViewAccessibilityDelegateCompat.this.e0(virtualViewId, action, arguments);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$e;", "", "Landroidx/compose/ui/semantics/SemanticsNode;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(Landroidx/compose/ui/semantics/SemanticsNode;IIIIJ)V", "a", "Landroidx/compose/ui/semantics/SemanticsNode;", "d", "()Landroidx/compose/ui/semantics/SemanticsNode;", "b", "I", "()I", "c", "e", "f", "J", "()J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class e {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final SemanticsNode node;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private final int action;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        private final int granularity;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int toIndex;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        private final long traverseTime;

        public e(SemanticsNode semanticsNode, int i, int i2, int i3, int i4, long j) {
            this.node = semanticsNode;
            this.action = i;
            this.granularity = i2;
            this.fromIndex = i3;
            this.toIndex = i4;
            this.traverseTime = j;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final SemanticsNode getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/compose/ui/platform/AndroidComposeViewAccessibilityDelegateCompat$f", "Lcom/google/android/nfb;", "T", "Landroidx/compose/ui/semantics/SemanticsPropertyKey;", "key", "value", "", "b", "(Landroidx/compose/ui/semantics/SemanticsPropertyKey;Ljava/lang/Object;)V", "", "a", "Z", "()Z", "setHasMatchedShape", "(Z)V", "hasMatchedShape", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements nfb {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private boolean hasMatchedShape;
        final /* synthetic */ xkb b;

        f(xkb xkbVar) {
            this.b = xkbVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasMatchedShape() {
            return this.hasMatchedShape;
        }

        @Override // com.google.inputmethod.nfb
        public <T> void b(SemanticsPropertyKey<T> key, T value) {
            if (value == this.b) {
                this.hasMatchedShape = true;
            }
        }
    }

    public AndroidComposeViewAccessibilityDelegateCompat(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        Object systemService = androidComposeView.getContext().getSystemService("accessibility");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        this.accessibilityManager = (AccessibilityManager) systemService;
        this.SendRecurringAccessibilityEventsIntervalMillis = 100L;
        this.legacyMainHandler = new Handler(Looper.getMainLooper());
        this.nodeProvider = new d();
        this.accessibilityFocusedVirtualViewId = t04.INVALID_ID;
        this.focusedVirtualViewId = t04.INVALID_ID;
        this.pendingHorizontalScrollEvents = new o48<>(0, 1, null);
        this.pendingVerticalScrollEvents = new o48<>(0, 1, null);
        this.actionIdToLabel = new e0c<>(0, 1, null);
        this.labelToActionId = new e0c<>(0, 1, null);
        this.accessibilityCursorPosition = -1;
        this.subtreeChangedLayoutNodes = new g10<>(0, 1, null);
        this.boundsUpdateChannel = p81.b(1, (BufferOverflow) null, (Function1) null, 6, (Object) null);
        this.currentSemanticsNodesInvalidated = true;
        this.currentSemanticsNodes = f16.b();
        this.paneDisplayed = new p48(0, 1, null);
        this.idToBeforeMap = new m48(0, 1, null);
        this.idToAfterMap = new m48(0, 1, null);
        this.ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";
        this.ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";
        this.urlSpanCache = new ard();
        this.previousSemanticsNodes = f16.c();
        this.previousSemanticsRoot = new dfb(androidComposeView.getSemanticsOwner().d(), f16.b());
        this.drawingOrder = s06.a();
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new Runnable() { // from class: com.google.android.nj
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeViewAccessibilityDelegateCompat.p0(this.a);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new Function1<o9b, Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeededLambda$1
            {
                super(1);
            }

            public final void a(o9b o9bVar) {
                this.this$0.l0(o9bVar);
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((o9b) obj);
                return Unit.a;
            }
        };
    }

    private final androidx.compose.ui.graphics.n A(xkb xkbVar, long j, LayoutDirection layoutDirection) {
        return xkbVar.mo5createOutlinePq9zytI(j, layoutDirection, this.view.getDensity());
    }

    private final boolean A0(SemanticsNode node, int start, int end, boolean traversalMode) {
        String strO;
        seb unmergedConfig = node.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.a;
        if (unmergedConfig.d(semanticsActions.z()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(node)) {
            ps4 ps4VarA = ((AccessibilityAction) node.getUnmergedConfig().i(semanticsActions.z())).a();
            if (ps4VarA != null) {
                return ((Boolean) ps4VarA.invoke(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (strO = O(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > strO.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z = strO.length() > 0;
        s0(B(q0(node.getId()), z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(this.accessibilityCursorPosition) : null, z ? Integer.valueOf(strO.length()) : null, strO));
        w0(node.getId());
        return true;
    }

    private final AccessibilityEvent B(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(virtualViewId, 8192);
        if (fromIndex != null) {
            accessibilityEventCreateEvent.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventCreateEvent.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventCreateEvent.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventCreateEvent.getText().add(text);
        }
        return accessibilityEventCreateEvent;
    }

    private final void B0(SemanticsNode node, r6 info) {
        seb unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (unmergedConfig.d(semanticsProperties.h())) {
            info.y0(true);
            info.D0((CharSequence) SemanticsConfigurationKt.a(node.getUnmergedConfig(), semanticsProperties.h()));
        }
    }

    private final void C0(r6 r6Var, SemanticsNode semanticsNode) {
        if (semanticsNode.x().r()) {
            r6Var.m1(false);
        }
    }

    private final r6 D() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return r6.f0();
    }

    private final int E(SemanticsNode node) {
        seb unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return (unmergedConfig.d(semanticsProperties.d()) || !node.getUnmergedConfig().d(semanticsProperties.O())) ? this.accessibilityCursorPosition : androidx.compose.ui.text.x.i(((androidx.compose.ui.text.x) node.getUnmergedConfig().i(semanticsProperties.O())).getPackedValue());
    }

    private final void E0(SemanticsNode node, r6 info) {
        androidx.compose.ui.text.b bVarS = AndroidComposeViewAccessibilityDelegateCompat_androidKt.s(node);
        info.d1(bVarS != null ? N0(bVarS) : null);
    }

    private final int F(SemanticsNode node) {
        seb unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return (unmergedConfig.d(semanticsProperties.d()) || !node.getUnmergedConfig().d(semanticsProperties.O())) ? this.accessibilityCursorPosition : androidx.compose.ui.text.x.n(((androidx.compose.ui.text.x) node.getUnmergedConfig().i(semanticsProperties.O())).getPackedValue());
    }

    private final Rect F0(androidx.compose.ui.graphics.n nVar, float f2, float f3) {
        if ((nVar instanceof androidx.compose.ui.graphics.n.b) || (nVar instanceof androidx.compose.ui.graphics.n.c)) {
            return G0(nVar.getRect(), f2, f3);
        }
        return null;
    }

    private final Rect G(r6 r6Var) {
        Rect rect = new Rect();
        r6Var.l(rect);
        return rect;
    }

    private final Rect G0(gba gbaVar, float f2, float f3) {
        return new Rect((int) (gbaVar.getLeft() + f2), (int) (gbaVar.getTop() + f3), (int) (gbaVar.getRight() + f2), (int) (gbaVar.getBottom() + f3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e16<ffb> H() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = ifb.a(this.view.getSemanticsOwner(), -1, new Function1<SemanticsNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$currentSemanticsNodes$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(SemanticsNode semanticsNode) {
                    return Boolean.valueOf(gfb.a(semanticsNode));
                }
            });
            if (W()) {
                AndroidComposeViewAccessibilityDelegateCompat_androidKt.w(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    static /* synthetic */ Rect H0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, gba gbaVar, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f2 = 0.0f;
        }
        if ((i & 2) != 0) {
            f3 = 0.0f;
        }
        return androidComposeViewAccessibilityDelegateCompat.G0(gbaVar, f2, f3);
    }

    private final List<AccessibilityServiceInfo> I() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    private final Rect I0(float left, float top, float right, float bottom) {
        long jM = this.view.m(rn8.e((((long) Float.floatToRawIntBits(top)) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        long jM2 = this.view.m(rn8.e((((long) Float.floatToRawIntBits(bottom)) & 4294967295L) | (Float.floatToRawIntBits(right) << 32)));
        int i = (int) (jM >> 32);
        int i2 = (int) (jM2 >> 32);
        int i3 = (int) (jM & 4294967295L);
        int i4 = (int) (jM2 & 4294967295L);
        return new Rect((int) Math.floor(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.floor(Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4))));
    }

    private final gba J0(Rect rect, Rect rect2) {
        float f2 = rect.left - rect2.left;
        float f3 = rect.top - rect2.top;
        return new gba(f2, f3, rect.width() + f2, rect.height() + f3);
    }

    private final float[] K0(androidx.compose.ui.graphics.n nVar) {
        if (!(nVar instanceof androidx.compose.ui.graphics.n.c)) {
            return null;
        }
        androidx.compose.ui.graphics.n.c cVar = (androidx.compose.ui.graphics.n.c) nVar;
        return new float[]{Float.intBitsToFloat((int) (cVar.getRoundRect().getTopLeftCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getTopLeftCornerRadius() & 4294967295L)), Float.intBitsToFloat((int) (cVar.getRoundRect().getTopRightCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getTopRightCornerRadius() & 4294967295L)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomRightCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomRightCornerRadius() & 4294967295L)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomLeftCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomLeftCornerRadius() & 4294967295L))};
    }

    private final Handler L() {
        return fj.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    private final Region L0(androidx.compose.ui.graphics.n nVar, float f2, float f3) {
        if (!(nVar instanceof androidx.compose.ui.graphics.n.a)) {
            return null;
        }
        androidx.compose.ui.graphics.n.a aVar = (androidx.compose.ui.graphics.n.a) nVar;
        Region region = new Region(H0(this, aVar.getRect().t(f2, f3), 0.0f, 0.0f, 3, null));
        Region region2 = new Region();
        Path path = aVar.getPath();
        if (!(path instanceof androidx.compose.ui.graphics.c)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        android.graphics.Path internalPath = ((androidx.compose.ui.graphics.c) path).getInternalPath();
        internalPath.offset(f2, f3);
        region2.setPath(internalPath, region);
        return region2;
    }

    private final RectF M0(SemanticsNode textNode, gba bounds) {
        if (textNode == null) {
            return null;
        }
        gba gbaVarU = bounds.u(textNode.u());
        gba gbaVarK = textNode.k();
        gba gbaVarQ = gbaVarU.s(gbaVarK) ? gbaVarU.q(gbaVarK) : null;
        if (gbaVarQ == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = gbaVarQ.getLeft();
        long jM = androidComposeView.m(rn8.e((((long) Float.floatToRawIntBits(gbaVarQ.getTop())) & 4294967295L) | (((long) Float.floatToRawIntBits(left)) << 32)));
        long jM2 = this.view.m(rn8.e((((long) Float.floatToRawIntBits(gbaVarQ.getRight())) << 32) | (((long) Float.floatToRawIntBits(gbaVarQ.getBottom())) & 4294967295L)));
        int i = (int) (jM >> 32);
        int i2 = (int) (jM2 >> 32);
        int i3 = (int) (jM & 4294967295L);
        int i4 = (int) (jM2 & 4294967295L);
        return new RectF(Math.min(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.min(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)), Math.max(Float.intBitsToFloat(i), Float.intBitsToFloat(i2)), Math.max(Float.intBitsToFloat(i3), Float.intBitsToFloat(i4)));
    }

    private final SpannableString N0(androidx.compose.ui.text.b bVar) {
        return (SpannableString) P0(mh.b(bVar, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    private final String O(SemanticsNode node) {
        androidx.compose.ui.text.b bVar;
        if (node == null) {
            return null;
        }
        seb unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (unmergedConfig.d(semanticsProperties.d())) {
            return m47.e((List) node.getUnmergedConfig().i(semanticsProperties.d()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().d(semanticsProperties.g())) {
            androidx.compose.ui.text.b bVarR = R(node.getUnmergedConfig());
            if (bVarR != null) {
                return bVarR.getText();
            }
            return null;
        }
        List list = (List) SemanticsConfigurationKt.a(node.getUnmergedConfig(), semanticsProperties.L());
        if (list == null || (bVar = (androidx.compose.ui.text.b) kotlin.collections.m.B0(list)) == null) {
            return null;
        }
        return bVar.getText();
    }

    private final boolean O0(SemanticsNode node, int granularity, boolean forward, boolean extendSelection) {
        int iF;
        int i;
        int id = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String strO = O(node);
        boolean z = false;
        if (strO != null && strO.length() != 0) {
            d6 d6VarP = P(node, granularity);
            if (d6VarP == null) {
                return false;
            }
            int iE = E(node);
            if (iE == -1) {
                iE = forward ? 0 : strO.length();
            }
            int[] iArrA = forward ? d6VarP.a(iE) : d6VarP.b(iE);
            if (iArrA == null) {
                return false;
            }
            int i2 = iArrA[0];
            z = true;
            int i3 = iArrA[1];
            if (extendSelection && V(node)) {
                iF = F(node);
                if (iF == -1) {
                    iF = forward ? i2 : i3;
                }
                i = forward ? i3 : i2;
            } else {
                iF = forward ? i3 : i2;
                i = iF;
            }
            this.pendingTextTraversedEvent = new e(node, forward ? 256 : 512, granularity, i2, i3, SystemClock.uptimeMillis());
            A0(node, iF, i, true);
        }
        return z;
    }

    private final d6 P(SemanticsNode node, int granularity) {
        String strO;
        TextLayoutResult textLayoutResultC;
        if (node == null || (strO = O(node)) == null || strO.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            androidx.compose.ui.platform.b bVarA = androidx.compose.ui.platform.b.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            bVarA.e(strO);
            return bVarA;
        }
        if (granularity == 2) {
            androidx.compose.ui.platform.f fVarA = androidx.compose.ui.platform.f.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            fVarA.e(strO);
            return fVarA;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                androidx.compose.ui.platform.e eVarA = androidx.compose.ui.platform.e.INSTANCE.a();
                eVarA.e(strO);
                return eVarA;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().d(SemanticsActions.a.i()) || (textLayoutResultC = rfb.c(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            c cVarA = c.INSTANCE.a();
            cVarA.j(strO, textLayoutResultC);
            return cVarA;
        }
        androidx.compose.ui.platform.d dVarA = androidx.compose.ui.platform.d.INSTANCE.a();
        dVarA.j(strO, textLayoutResultC, node);
        return dVarA;
    }

    private final <T extends CharSequence> T P0(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i = size - 1;
        if (Character.isHighSurrogate(text.charAt(i)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i;
        }
        T t = (T) text.subSequence(0, size);
        Intrinsics.h(t, "null cannot be cast to non-null type T of androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.trimToSize");
        return t;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a A[LOOP:0: B:5:0x0021->B:37:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f A[EDGE_INSN: B:50:0x008f->B:38:0x008f BREAK  A[LOOP:0: B:5:0x0021->B:37:0x008a], SYNTHETIC] */
    private final gba Q(SemanticsNode node, Rect nodeBoundsInScreen, xkb shape) {
        androidx.compose.ui.b.c node2;
        f fVar = new f(shape);
        LayoutNode layoutNode = node.getLayoutNode();
        ki8 nodes = layoutNode.getNodes();
        int iA = ni8.a(8);
        Object obj = null;
        if ((nodes.i() & iA) != 0) {
            loop0: for (androidx.compose.ui.b.c head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) == 0) {
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    androidx.compose.ui.b.c cVarJ = head;
                    r58 r58Var = null;
                    while (cVarJ != null) {
                        if (cVarJ instanceof bfb) {
                            ((bfb) cVarJ).H0(fVar);
                            if (fVar.getHasMatchedShape()) {
                                obj = cVarJ;
                                break loop0;
                            }
                        } else if ((cVarJ.getKindSet() & iA) != 0 && (cVarJ instanceof k33)) {
                            int i = 0;
                            for (androidx.compose.ui.b.c delegate = ((k33) cVarJ).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i++;
                                    if (i == 1) {
                                        cVarJ = delegate;
                                    } else {
                                        if (r58Var == null) {
                                            r58Var = new r58(new androidx.compose.ui.b.c[16], 0);
                                        }
                                        if (cVarJ != null) {
                                            r58Var.c(cVarJ);
                                            cVarJ = null;
                                        }
                                        r58Var.c(delegate);
                                    }
                                }
                            }
                            if (i == 1) {
                            }
                        }
                        cVarJ = y23.j(r58Var);
                    }
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        bfb bfbVar = (bfb) obj;
        if (bfbVar == null || (node2 = bfbVar.getNode()) == null || !node2.getIsAttached()) {
            return ln6.d(layoutNode.x0(), false);
        }
        kn6 kn6VarO = y23.o(bfbVar);
        gba gbaVarR = ln6.f(kn6VarO).R(kn6VarO, false);
        return J0(I0(gbaVarR.getLeft(), gbaVarR.getTop(), gbaVarR.getRight(), gbaVarR.getBottom()), nodeBoundsInScreen);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[LOOP:2: B:39:0x00da->B:54:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0159 A[EDGE_INSN: B:64:0x0159->B:55:0x0159 BREAK  A[LOOP:2: B:39:0x00da->B:54:0x0150], SYNTHETIC] */
    private final void Q0() {
        long j;
        long j2;
        long j3;
        long j4;
        seb unmergedConfig;
        p48 p48Var = new p48(0, 1, null);
        p48 p48Var2 = this.paneDisplayed;
        int[] iArr = p48Var2.elements;
        long[] jArr = p48Var2.metadata;
        int length = jArr.length - 2;
        long j5 = 128;
        long j6 = 255;
        char c = 7;
        long j7 = -9187201950435737472L;
        if (length >= 0) {
            int i = 0;
            while (true) {
                long j8 = jArr[i];
                int[] iArr2 = iArr;
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i2 = 8 - ((~(i - length)) >>> 31);
                    int i3 = 0;
                    while (i3 < i2) {
                        if ((j8 & j6) < j5) {
                            j3 = j5;
                            int i4 = iArr2[(i << 3) + i3];
                            ffb ffbVarB = H().b(i4);
                            SemanticsNode semanticsNode = ffbVarB != null ? ffbVarB.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                j4 = j6;
                                if (!semanticsNode.getUnmergedConfig().d(SemanticsProperties.a.C())) {
                                }
                            } else {
                                j4 = j6;
                            }
                            p48Var.g(i4);
                            dfb dfbVarB = this.previousSemanticsNodes.b(i4);
                            v0(i4, 32, (dfbVarB == null || (unmergedConfig = dfbVarB.getUnmergedConfig()) == null) ? null : (String) SemanticsConfigurationKt.a(unmergedConfig, SemanticsProperties.a.C()));
                        } else {
                            j3 = j5;
                            j4 = j6;
                        }
                        j8 >>= 8;
                        i3++;
                        j5 = j3;
                        j6 = j4;
                    }
                    j = j5;
                    j2 = j6;
                    if (i2 != 8) {
                        break;
                    }
                } else {
                    j = j5;
                    j2 = j6;
                }
                if (i == length) {
                    break;
                }
                i++;
                iArr = iArr2;
                j5 = j;
                j6 = j2;
            }
        } else {
            j = 128;
            j2 = 255;
        }
        this.paneDisplayed.t(p48Var);
        this.previousSemanticsNodes.g();
        e16<ffb> e16VarH = H();
        int[] iArr3 = e16VarH.keys;
        Object[] objArr = e16VarH.values;
        long[] jArr2 = e16VarH.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i5 = 0;
            while (true) {
                long j9 = jArr2[i5];
                if ((((~j9) << c) & j9 & j7) != j7) {
                    int i6 = 8 - ((~(i5 - length2)) >>> 31);
                    for (int i7 = 0; i7 < i6; i7++) {
                        if ((j9 & j2) < j) {
                            int i8 = (i5 << 3) + i7;
                            int i9 = iArr3[i8];
                            ffb ffbVar = (ffb) objArr[i8];
                            seb unmergedConfig2 = ffbVar.getSemanticsNode().getUnmergedConfig();
                            SemanticsProperties semanticsProperties = SemanticsProperties.a;
                            if (unmergedConfig2.d(semanticsProperties.C()) && this.paneDisplayed.g(i9)) {
                                v0(i9, 16, (String) ffbVar.getSemanticsNode().getUnmergedConfig().i(semanticsProperties.C()));
                            }
                            this.previousSemanticsNodes.r(i9, new dfb(ffbVar.getSemanticsNode(), H()));
                        }
                        j9 >>= 8;
                    }
                    if (i6 != 8) {
                        break;
                    }
                    if (i5 != length2) {
                        break;
                    }
                    i5++;
                    c = 7;
                    j7 = -9187201950435737472L;
                } else if (i5 != length2) {
                    break;
                    break;
                } else {
                    i5++;
                    c = 7;
                    j7 = -9187201950435737472L;
                }
            }
        }
        this.previousSemanticsRoot = new dfb(this.view.getSemanticsOwner().d(), H());
    }

    private final androidx.compose.ui.text.b R(seb sebVar) {
        return (androidx.compose.ui.text.b) SemanticsConfigurationKt.a(sebVar, SemanticsProperties.a.g());
    }

    private final boolean U(int virtualViewId) {
        return this.accessibilityFocusedVirtualViewId == virtualViewId;
    }

    private final boolean V(SemanticsNode node) {
        seb unmergedConfig = node.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        return !unmergedConfig.d(semanticsProperties.d()) && node.getUnmergedConfig().d(semanticsProperties.g());
    }

    private final boolean X() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (Intrinsics.e(bool, Boolean.TRUE)) {
            return true;
        }
        if (Intrinsics.e(bool, Boolean.FALSE)) {
            return false;
        }
        return f6.a(this.accessibilityManager);
    }

    private final boolean Y() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x001a -> B:8:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @com.google.android.r43
    private final boolean Z(androidx.compose.ui.semantics.SemanticsNode r9) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.Z(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    private static final float a0(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void b0(LayoutNode layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.e(Unit.a);
        }
    }

    private final boolean clearAccessibilityFocus(int virtualViewId) {
        if (!U(virtualViewId)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = t04.INVALID_ID;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        u0(this, virtualViewId, 65536, null, null, 12, null);
        return true;
    }

    private final AccessibilityEvent createEvent(int virtualViewId, int eventType) {
        ffb ffbVarB;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        if (W() && (ffbVarB = H().b(virtualViewId)) != null) {
            seb unmergedConfig = ffbVarB.getSemanticsNode().getUnmergedConfig();
            SemanticsProperties semanticsProperties = SemanticsProperties.a;
            accessibilityEventObtain.setPassword(unmergedConfig.d(semanticsProperties.D()));
            b6.b(accessibilityEventObtain, Intrinsics.e(SemanticsConfigurationKt.a(ffbVarB.getSemanticsNode().getUnmergedConfig(), semanticsProperties.w()), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0(int virtualViewId, int action, Bundle arguments) {
        SemanticsNode semanticsNode;
        Function0 function0A;
        Function0 function0A2;
        Function0 function0A3;
        Function0 function0A4;
        float f2;
        int steps;
        Function0 function0A5;
        Function0 function0A6;
        Function0 function0A7;
        Function0 function0A8;
        Function0 function0A9;
        Function0 function0A10;
        Function0 function0A11;
        Function1 function1A;
        AccessibilityAction accessibilityAction;
        Function1 function1A2;
        Function0 function0A12;
        Function0 function0A13;
        Function0 function0A14;
        Function0 function0A15;
        Function0 function0A16;
        CharSequence charSequenceE;
        List list;
        Float fValueOf = Float.valueOf(0.0f);
        ffb ffbVarB = H().b(virtualViewId);
        if (ffbVarB == null || (semanticsNode = ffbVarB.getSemanticsNode()) == null) {
            return false;
        }
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        Object objA = SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.w());
        Boolean bool = Boolean.TRUE;
        if (Intrinsics.e(objA, bool) && !X()) {
            return false;
        }
        if (action == 64) {
            return requestAccessibilityFocus(virtualViewId);
        }
        if (action == 128) {
            return clearAccessibilityFocus(virtualViewId);
        }
        if (action == 256 || action == 512) {
            if (arguments == null) {
                return false;
            }
            return O0(semanticsNode, arguments.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), action == 256, arguments.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
        }
        if (action == 16384) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.c());
            if (accessibilityAction2 == null || (function0A = accessibilityAction2.a()) == null) {
                return false;
            }
            return ((Boolean) function0A.invoke()).booleanValue();
        }
        if (action == 131072) {
            boolean zA0 = A0(semanticsNode, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zA0) {
                u0(this, q0(semanticsNode.getId()), 0, null, null, 12, null);
            }
            return zA0;
        }
        if (!AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
            return false;
        }
        if (action == 1) {
            if (this.view.isInTouchMode()) {
                this.view.requestFocusFromTouch();
            }
            AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.u());
            if (accessibilityAction3 == null || (function0A2 = accessibilityAction3.a()) == null) {
                return false;
            }
            return ((Boolean) function0A2.invoke()).booleanValue();
        }
        if (action == 2) {
            if (!Intrinsics.e(SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.j()), bool)) {
                return false;
            }
            this.view.getFocusOwner().n(false, true, true, androidx.compose.ui.focus.b.INSTANCE.c());
            return true;
        }
        Boolean bool2 = null;
        switch (action) {
            case 16:
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.l());
                if (accessibilityAction4 != null && (function0A3 = accessibilityAction4.a()) != null) {
                    bool2 = (Boolean) function0A3.invoke();
                }
                u0(this, virtualViewId, 1, null, null, 12, null);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.o());
                if (accessibilityAction5 == null || (function0A4 = accessibilityAction5.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A4.invoke()).booleanValue();
            case 4096:
            case 8192:
                break;
            case 32768:
                AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.t());
                if (accessibilityAction6 == null || (function0A7 = accessibilityAction6.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A7.invoke()).booleanValue();
            case 65536:
                AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.e());
                if (accessibilityAction7 == null || (function0A8 = accessibilityAction7.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A8.invoke()).booleanValue();
            case 262144:
                AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.g());
                if (accessibilityAction8 == null || (function0A9 = accessibilityAction8.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A9.invoke()).booleanValue();
            case 524288:
                AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.b());
                if (accessibilityAction9 == null || (function0A10 = accessibilityAction9.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A10.invoke()).booleanValue();
            case 1048576:
                AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.f());
                if (accessibilityAction10 == null || (function0A11 = accessibilityAction10.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A11.invoke()).booleanValue();
            case 2097152:
                String string = arguments != null ? arguments.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.A());
                if (accessibilityAction11 == null || (function1A = accessibilityAction11.a()) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) function1A.invoke(new androidx.compose.ui.text.b(string, null, 2, null))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                return fj.isAccessibilityShowOnScreenNestedScrollingEnabled ? o0(semanticsNode) : Z(semanticsNode);
            case R.id.accessibilityActionSetProgress:
                if (arguments == null || !arguments.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.y())) == null || (function1A2 = accessibilityAction.a()) == null) {
                    return false;
                }
                return ((Boolean) function1A2.invoke(Float.valueOf(arguments.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.n());
                if (accessibilityAction12 == null || (function0A12 = accessibilityAction12.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A12.invoke()).booleanValue();
            default:
                switch (action) {
                    case R.id.accessibilityActionScrollUp:
                    case R.id.accessibilityActionScrollLeft:
                    case R.id.accessibilityActionScrollDown:
                    case R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (action) {
                            case R.id.accessibilityActionPageUp:
                                AccessibilityAction accessibilityAction13 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.s());
                                if (accessibilityAction13 == null || (function0A13 = accessibilityAction13.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) function0A13.invoke()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                AccessibilityAction accessibilityAction14 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.p());
                                if (accessibilityAction14 == null || (function0A14 = accessibilityAction14.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) function0A14.invoke()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                AccessibilityAction accessibilityAction15 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.q());
                                if (accessibilityAction15 == null || (function0A15 = accessibilityAction15.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) function0A15.invoke()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                AccessibilityAction accessibilityAction16 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.r());
                                if (accessibilityAction16 == null || (function0A16 = accessibilityAction16.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) function0A16.invoke()).booleanValue();
                            default:
                                e0c<CharSequence> e0cVarE = this.actionIdToLabel.e(virtualViewId);
                                if (e0cVarE == null || (charSequenceE = e0cVarE.e(action)) == null || (list = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.d())) == null) {
                                    return false;
                                }
                                int size = list.size();
                                for (int i = 0; i < size; i++) {
                                    CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i);
                                    if (Intrinsics.e(customAccessibilityAction.getLabel(), charSequenceE)) {
                                        return ((Boolean) customAccessibilityAction.a().invoke()).booleanValue();
                                    }
                                }
                                return false;
                        }
                }
                break;
        }
        boolean z = action == 4096;
        boolean z2 = action == 8192;
        boolean z3 = action == 16908345;
        boolean z4 = action == 16908347;
        boolean z5 = action == 16908344;
        boolean z6 = action == 16908346;
        boolean z7 = z3 || z4 || z || z2;
        boolean z8 = z5 || z6 || z || z2;
        if (z || z2) {
            ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.E());
            AccessibilityAction accessibilityAction17 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsActions.a.y());
            if (progressBarRangeInfo != null && accessibilityAction17 != null) {
                float fD = kotlin.ranges.g.d(((Number) progressBarRangeInfo.c().e()).floatValue(), ((Number) progressBarRangeInfo.c().c()).floatValue());
                float fI = kotlin.ranges.g.i(((Number) progressBarRangeInfo.c().c()).floatValue(), ((Number) progressBarRangeInfo.c().e()).floatValue());
                if (progressBarRangeInfo.getSteps() > 0) {
                    f2 = fD - fI;
                    steps = progressBarRangeInfo.getSteps() + 1;
                } else {
                    f2 = fD - fI;
                    steps = 20;
                }
                float f3 = f2 / steps;
                if (z2) {
                    f3 = -f3;
                }
                Function1 function1A3 = accessibilityAction17.a();
                if (function1A3 != null) {
                    return ((Boolean) function1A3.invoke(Float.valueOf(progressBarRangeInfo.getCurrent() + f3))).booleanValue();
                }
                return false;
            }
        }
        long jK = ln6.a(semanticsNode.r().v()).k();
        Float fB = rfb.b(semanticsNode.getUnmergedConfig());
        seb unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.a;
        AccessibilityAction accessibilityAction18 = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig2, semanticsActions.v());
        if (accessibilityAction18 == null) {
            return false;
        }
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.m());
        if (scrollAxisRange == null || !z7) {
            fB = fB;
        } else {
            float fFloatValue = fB != null ? fB.floatValue() : Float.intBitsToFloat((int) (jK >> 32));
            if (z3 || z2) {
                fFloatValue = -fFloatValue;
            }
            if (scrollAxisRange.getReverseScrolling()) {
                fFloatValue = -fFloatValue;
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode) && (z3 || z4)) {
                fFloatValue = -fFloatValue;
            }
            if (f0(scrollAxisRange, fFloatValue)) {
                if (!semanticsNode.getUnmergedConfig().d(semanticsActions.q()) && !semanticsNode.getUnmergedConfig().d(semanticsActions.r())) {
                    Function2 function2A = accessibilityAction18.a();
                    if (function2A != null) {
                        return ((Boolean) function2A.invoke(Float.valueOf(fFloatValue), fValueOf)).booleanValue();
                    }
                    return false;
                }
                AccessibilityAction accessibilityAction19 = fFloatValue > 0.0f ? (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.r()) : (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.q());
                if (accessibilityAction19 == null || (function0A6 = accessibilityAction19.a()) == null) {
                    return false;
                }
                return ((Boolean) function0A6.invoke()).booleanValue();
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.S());
        if (scrollAxisRange2 != null && z8) {
            float fFloatValue2 = fB != null ? fB.floatValue() : Float.intBitsToFloat((int) (4294967295L & jK));
            if (z5 || z2) {
                fFloatValue2 = -fFloatValue2;
            }
            if (scrollAxisRange2.getReverseScrolling()) {
                fFloatValue2 = -fFloatValue2;
            }
            if (f0(scrollAxisRange2, fFloatValue2)) {
                if (!semanticsNode.getUnmergedConfig().d(semanticsActions.s()) && !semanticsNode.getUnmergedConfig().d(semanticsActions.p())) {
                    Function2 function2A2 = accessibilityAction18.a();
                    if (function2A2 != null) {
                        return ((Boolean) function2A2.invoke(fValueOf, Float.valueOf(fFloatValue2))).booleanValue();
                    }
                    return false;
                }
                AccessibilityAction accessibilityAction20 = fFloatValue2 > 0.0f ? (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.p()) : (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.s());
                if (accessibilityAction20 != null && (function0A5 = accessibilityAction20.a()) != null) {
                    return ((Boolean) function0A5.invoke()).booleanValue();
                }
            }
        }
        return false;
    }

    private static final boolean f0(ScrollAxisRange scrollAxisRange, float f2) {
        if (f2 >= 0.0f || ((Number) scrollAxisRange.c().invoke()).floatValue() <= 0.0f) {
            return f2 > 0.0f && ((Number) scrollAxisRange.c().invoke()).floatValue() < ((Number) scrollAxisRange.a().invoke()).floatValue();
        }
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:144:0x03af  */
    /* JADX WARN: Code duplicated, block: B:247:0x0609 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:248:0x060b A[LOOP:2: B:233:0x05bf->B:248:0x060b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:373:0x0610 A[EDGE_INSN: B:373:0x0610->B:249:0x0610 BREAK  A[LOOP:2: B:233:0x05bf->B:248:0x060b], SYNTHETIC] */
    private final void g0(int virtualViewId, r6 info, SemanticsNode semanticsNode) throws NoWhenBranchMatchedException {
        View viewD;
        String accessibilityExtraKey;
        boolean z;
        SemanticsNode semanticsNodeT;
        int iE;
        boolean zBooleanValue;
        SemanticsNode semanticsNode2;
        seb sebVarP;
        Resources resources = this.view.getContext().getResources();
        info.t0("android.view.View");
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (unmergedConfig.d(semanticsProperties.g())) {
            info.t0("android.widget.EditText");
        }
        if (semanticsNode.getUnmergedConfig().d(semanticsProperties.L())) {
            info.t0("android.widget.TextView");
        }
        hpa hpaVar = (hpa) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.F());
        if (hpaVar != null) {
            hpaVar.getValue();
            if (semanticsNode.A() || semanticsNode.v().isEmpty()) {
                hpa.Companion companion = hpa.INSTANCE;
                if (hpa.m(hpaVar.getValue(), companion.h())) {
                    info.V0(resources.getString(xz9.l));
                } else if (hpa.m(hpaVar.getValue(), companion.g())) {
                    info.V0(resources.getString(xz9.k));
                } else {
                    String strE = rfb.e(hpaVar.getValue());
                    if (!hpa.m(hpaVar.getValue(), companion.e()) || semanticsNode.D() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.t0(strE);
                    }
                }
            }
            Unit unit = Unit.a;
        }
        info.P0(this.view.getContext().getPackageName());
        info.I0(ifb.h(semanticsNode));
        boolean zX = X();
        List<SemanticsNode> listV = semanticsNode.v();
        int size = listV.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            SemanticsNode semanticsNode3 = listV.get(i2);
            if (H().a(semanticsNode3.getId())) {
                AndroidViewHolder androidViewHolder = this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(semanticsNode3.getLayoutNode());
                if (semanticsNode3.getId() != -1) {
                    if (androidViewHolder != null) {
                        info.c(androidViewHolder);
                    } else {
                        ffb ffbVarB = H().b(semanticsNode3.getId());
                        boolean zE = (ffbVarB == null || (semanticsNode2 = ffbVarB.getSemanticsNode()) == null || (sebVarP = semanticsNode2.p()) == null) ? false : Intrinsics.e(SemanticsConfigurationKt.a(sebVarP, SemanticsProperties.a.w()), Boolean.TRUE);
                        if (zX || !zE) {
                            info.d(this.view, semanticsNode3.getId());
                        }
                    }
                    this.drawingOrder.q(semanticsNode3.getId(), i);
                    i++;
                }
            }
        }
        boolean z2 = true;
        if (virtualViewId == this.accessibilityFocusedVirtualViewId) {
            info.m0(true);
            info.b(r6.a.l);
        } else {
            info.m0(false);
            info.b(r6.a.k);
        }
        E0(semanticsNode, info);
        B0(semanticsNode, info);
        info.c1(AndroidComposeViewAccessibilityDelegateCompat_androidKt.r(semanticsNode, resources));
        info.r0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.q(semanticsNode));
        seb unmergedConfig2 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties2 = SemanticsProperties.a;
        ToggleableState toggleableState = (ToggleableState) SemanticsConfigurationKt.a(unmergedConfig2, semanticsProperties2.Q());
        if (toggleableState != null) {
            if (toggleableState == ToggleableState.On) {
                info.s0(true);
            } else if (toggleableState == ToggleableState.Off) {
                info.s0(false);
            }
            Unit unit2 = Unit.a;
        }
        Boolean bool = (Boolean) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties2.H());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (hpaVar == null ? false : hpa.m(hpaVar.getValue(), hpa.INSTANCE.h())) {
                info.Y0(zBooleanValue2);
            } else {
                info.s0(zBooleanValue2);
            }
            Unit unit3 = Unit.a;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.v().isEmpty()) {
            List list = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties2.d());
            info.x0(list != null ? (String) kotlin.collections.m.B0(list) : null);
        }
        String str = (String) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties2.K());
        if (str != null) {
            SemanticsNode semanticsNodeT2 = semanticsNode;
            while (true) {
                if (semanticsNodeT2 == null) {
                    zBooleanValue = false;
                    break;
                }
                seb unmergedConfig3 = semanticsNodeT2.getUnmergedConfig();
                SemanticsPropertiesAndroid semanticsPropertiesAndroid = SemanticsPropertiesAndroid.a;
                if (unmergedConfig3.d(semanticsPropertiesAndroid.b())) {
                    zBooleanValue = ((Boolean) semanticsNodeT2.getUnmergedConfig().i(semanticsPropertiesAndroid.b())).booleanValue();
                    break;
                }
                semanticsNodeT2 = semanticsNodeT2.t();
            }
            if (zBooleanValue) {
                info.l1(str);
            }
        }
        seb unmergedConfig4 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties3 = SemanticsProperties.a;
        if (((Unit) SemanticsConfigurationKt.a(unmergedConfig4, semanticsProperties3.k())) != null) {
            info.G0(true);
            Unit unit4 = Unit.a;
        }
        if (((Unit) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.N())) != null) {
            info.e1(true);
            Unit unit5 = Unit.a;
        }
        if (virtualViewId != -1 && (iE = this.drawingOrder.e(semanticsNode.getId(), -1)) != -1) {
            info.A0(iE);
            Unit unit6 = Unit.a;
        }
        info.T0(semanticsNode.getUnmergedConfig().d(semanticsProperties3.D()));
        Object objA = SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.u());
        Boolean bool2 = Boolean.TRUE;
        info.B0(Intrinsics.e(objA, bool2));
        Integer num = (Integer) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.B());
        info.N0(num != null ? num.intValue() : -1);
        info.C0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode));
        info.E0(semanticsNode.getUnmergedConfig().d(semanticsProperties3.j()));
        if (info.T()) {
            info.F0(((Boolean) semanticsNode.getUnmergedConfig().i(semanticsProperties3.j())).booleanValue());
            if (info.U()) {
                info.a(2);
                this.focusedVirtualViewId = virtualViewId;
            } else {
                info.a(1);
            }
        }
        info.m1(!ifb.g(semanticsNode));
        if (mq1.isAccessibilityShouldIncludeOffscreenChildrenEnabled) {
            if (semanticsNode.A()) {
                semanticsNodeT = semanticsNode.t();
                Intrinsics.g(semanticsNodeT);
            } else {
                semanticsNodeT = semanticsNode;
            }
            C0(info, semanticsNodeT);
        }
        d57 d57Var = (d57) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.A());
        if (d57Var != null) {
            int value = d57Var.getValue();
            d57.Companion companion2 = d57.INSTANCE;
            info.L0((!d57.f(value, companion2.b()) && d57.f(value, companion2.a())) ? 2 : 1);
            Unit unit7 = Unit.a;
        }
        info.u0(false);
        seb unmergedConfig5 = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions = SemanticsActions.a;
        AccessibilityAction accessibilityAction = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig5, semanticsActions.l());
        if (accessibilityAction != null) {
            boolean zE2 = Intrinsics.e(SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.H()), bool2);
            hpa.Companion companion3 = hpa.INSTANCE;
            if (hpaVar == null ? false : hpa.m(hpaVar.getValue(), companion3.h())) {
                z = true;
            } else if (hpaVar == null ? false : hpa.m(hpaVar.getValue(), companion3.f())) {
                z = true;
            } else {
                z = false;
            }
            info.u0(!z || (z && !zE2));
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode) && info.P()) {
                info.b(new r6.a(16, accessibilityAction.getLabel()));
            }
            Unit unit8 = Unit.a;
        }
        info.M0(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.o());
        if (accessibilityAction2 != null) {
            info.M0(true);
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
                info.b(new r6.a(32, accessibilityAction2.getLabel()));
            }
            Unit unit9 = Unit.a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.c());
        if (accessibilityAction3 != null) {
            info.b(new r6.a(16384, accessibilityAction3.getLabel()));
            Unit unit10 = Unit.a;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.A());
            if (accessibilityAction4 != null) {
                info.b(new r6.a(2097152, accessibilityAction4.getLabel()));
                Unit unit11 = Unit.a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.n());
            if (accessibilityAction5 != null) {
                info.b(new r6.a(R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                Unit unit12 = Unit.a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.e());
            if (accessibilityAction6 != null) {
                info.b(new r6.a(65536, accessibilityAction6.getLabel()));
                Unit unit13 = Unit.a;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.t());
            if (accessibilityAction7 != null) {
                if (info.U() && this.view.getClipboardManager().e()) {
                    info.b(new r6.a(32768, accessibilityAction7.getLabel()));
                }
                Unit unit14 = Unit.a;
            }
        }
        String strO = O(semanticsNode);
        if (!(strO == null || strO.length() == 0)) {
            info.f1(F(semanticsNode), E(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions.z());
            info.b(new r6.a(131072, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.a(256);
            info.a(512);
            info.O0(11);
            List list2 = (List) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties3.d());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().d(semanticsActions.i()) && !AndroidComposeViewAccessibilityDelegateCompat_androidKt.o(semanticsNode)) {
                info.O0(info.B() | 20);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence charSequenceG = info.G();
        if (!(charSequenceG == null || charSequenceG.length() == 0) && semanticsNode.getUnmergedConfig().d(semanticsActions.i())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (semanticsNode.getUnmergedConfig().d(semanticsProperties3.K())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        if (semanticsNode.getUnmergedConfig().d(semanticsProperties3.I())) {
            arrayList.add("androidx.compose.ui.semantics.shapeType");
            arrayList.add("androidx.compose.ui.semantics.shapeRect");
            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
        }
        ScatterSet<SemanticsPropertyKey<?>> scatterSetJ = semanticsNode.getUnmergedConfig().j();
        if (scatterSetJ != null) {
            Object[] objArr = scatterSetJ.elements;
            long[] jArr = scatterSetJ.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i3 = 0;
                while (true) {
                    long j = jArr[i3];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if (((j & 255) < 128 ? z2 : false) && (accessibilityExtraKey = ((SemanticsPropertyKey) objArr[(i3 << 3) + i5]).getAccessibilityExtraKey()) != null) {
                                arrayList.add(accessibilityExtraKey);
                                Unit unit15 = Unit.a;
                            }
                            j >>= 8;
                            i5++;
                            z2 = true;
                        }
                        if (i4 != 8) {
                            break;
                        }
                        if (i3 != length) {
                            break;
                        }
                        i3++;
                        z2 = true;
                    } else if (i3 != length) {
                        break;
                        break;
                    } else {
                        i3++;
                        z2 = true;
                    }
                }
            }
            Unit unit16 = Unit.a;
        }
        info.n0(arrayList);
        seb unmergedConfig6 = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties4 = SemanticsProperties.a;
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) SemanticsConfigurationKt.a(unmergedConfig6, semanticsProperties4.E());
        if (progressBarRangeInfo != null) {
            seb unmergedConfig7 = semanticsNode.getUnmergedConfig();
            SemanticsActions semanticsActions2 = SemanticsActions.a;
            if (unmergedConfig7.d(semanticsActions2.y())) {
                info.t0("android.widget.SeekBar");
            } else {
                info.t0("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.a()) {
                info.U0(r6.i.d(1, ((Number) progressBarRangeInfo.c().c()).floatValue(), ((Number) progressBarRangeInfo.c().e()).floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().d(semanticsActions2.y()) && AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < kotlin.ranges.g.d(((Number) progressBarRangeInfo.c().e()).floatValue(), ((Number) progressBarRangeInfo.c().c()).floatValue())) {
                    info.b(r6.a.q);
                }
                if (progressBarRangeInfo.getCurrent() > kotlin.ranges.g.i(((Number) progressBarRangeInfo.c().c()).floatValue(), ((Number) progressBarRangeInfo.c().e()).floatValue())) {
                    info.b(r6.a.r);
                }
            }
        }
        int i6 = Build.VERSION.SDK_INT;
        a.a(info, semanticsNode);
        CollectionInfo_androidKt.d(semanticsNode, info);
        CollectionInfo_androidKt.e(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties4.m());
        seb unmergedConfig8 = semanticsNode.getUnmergedConfig();
        SemanticsActions semanticsActions3 = SemanticsActions.a;
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) SemanticsConfigurationKt.a(unmergedConfig8, semanticsActions3.v());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.b(semanticsNode)) {
                info.t0("android.widget.HorizontalScrollView");
            }
            if (((Number) scrollAxisRange.a().invoke()).floatValue() > 0.0f) {
                info.X0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
                if (i0(scrollAxisRange)) {
                    info.b(r6.a.q);
                    info.b(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode) ? r6.a.F : r6.a.D);
                }
                if (h0(scrollAxisRange)) {
                    info.b(r6.a.r);
                    info.b(!AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode) ? r6.a.D : r6.a.F);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties4.S());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!CollectionInfo_androidKt.b(semanticsNode)) {
                info.t0("android.widget.ScrollView");
            }
            if (((Number) scrollAxisRange2.a().invoke()).floatValue() > 0.0f) {
                info.X0(true);
            }
            if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
                if (i0(scrollAxisRange2)) {
                    info.b(r6.a.q);
                    info.b(r6.a.E);
                }
                if (h0(scrollAxisRange2)) {
                    info.b(r6.a.r);
                    info.b(r6.a.C);
                }
            }
        }
        if (i6 >= 29) {
            b.a(info, semanticsNode);
        }
        info.Q0((CharSequence) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties4.C()));
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.n(semanticsNode)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions3.g());
            if (accessibilityAction10 != null) {
                info.b(new r6.a(262144, accessibilityAction10.getLabel()));
                Unit unit17 = Unit.a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions3.b());
            if (accessibilityAction11 != null) {
                info.b(new r6.a(524288, accessibilityAction11.getLabel()));
                Unit unit18 = Unit.a;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsActions3.f());
            if (accessibilityAction12 != null) {
                info.b(new r6.a(1048576, accessibilityAction12.getLabel()));
                Unit unit19 = Unit.a;
            }
            if (semanticsNode.getUnmergedConfig().d(semanticsActions3.d())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().i(semanticsActions3.d());
                int size2 = list3.size();
                x06 x06Var = P;
                if (size2 >= x06Var._size) {
                    throw new IllegalStateException("Can't have more than " + x06Var._size + " custom actions for one widget");
                }
                e0c<CharSequence> e0cVar = new e0c<>(0, 1, null);
                d58<CharSequence> d58VarB = xl8.b();
                if (this.labelToActionId.d(virtualViewId)) {
                    d58<CharSequence> d58VarE = this.labelToActionId.e(virtualViewId);
                    n48 n48Var = new n48(0, 1, null);
                    int[] iArr = x06Var.content;
                    int i7 = x06Var._size;
                    for (int i8 = 0; i8 < i7; i8++) {
                        n48Var.k(iArr[i8]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i9 = 0; i9 < size3; i9++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i9);
                        Intrinsics.g(d58VarE);
                        if (d58VarE.a(customAccessibilityAction.getLabel())) {
                            int iC = d58VarE.c(customAccessibilityAction.getLabel());
                            e0cVar.i(iC, customAccessibilityAction.getLabel());
                            d58VarB.u(customAccessibilityAction.getLabel(), iC);
                            n48Var.o(iC);
                            info.b(new r6.a(iC, customAccessibilityAction.getLabel()));
                            Unit unit20 = Unit.a;
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i10 = 0; i10 < size4; i10++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i10);
                        int iE2 = n48Var.e(i10);
                        e0cVar.i(iE2, customAccessibilityAction2.getLabel());
                        d58VarB.u(customAccessibilityAction2.getLabel(), iE2);
                        info.b(new r6.a(iE2, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i11 = 0; i11 < size5; i11++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i11);
                        int iE3 = P.e(i11);
                        e0cVar.i(iE3, customAccessibilityAction3.getLabel());
                        d58VarB.u(customAccessibilityAction3.getLabel(), iE3);
                        info.b(new r6.a(iE3, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.i(virtualViewId, e0cVar);
                this.labelToActionId.i(virtualViewId, d58VarB);
            }
        }
        info.W0(AndroidComposeViewAccessibilityDelegateCompat_androidKt.u(semanticsNode, resources));
        int iE4 = this.idToBeforeMap.e(virtualViewId, -1);
        if (iE4 != -1) {
            View viewD2 = rfb.d(this.view.getAndroidViewsHandler$ui(), iE4);
            if (viewD2 != null) {
                info.j1(viewD2);
            } else {
                info.k1(this.view, iE4);
            }
            s(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int iE5 = this.idToAfterMap.e(virtualViewId, -1);
        if (iE5 != -1 && (viewD = rfb.d(this.view.getAndroidViewsHandler$ui(), iE5)) != null) {
            info.h1(viewD);
            s(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
        }
        String str2 = (String) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), SemanticsPropertiesAndroid.a.a());
        if (str2 != null) {
            info.t0(str2);
            Unit unit21 = Unit.a;
        }
    }

    private static final boolean h0(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.c().invoke()).floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return ((Number) scrollAxisRange.c().invoke()).floatValue() < ((Number) scrollAxisRange.a().invoke()).floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean i0(ScrollAxisRange scrollAxisRange) {
        if (((Number) scrollAxisRange.c().invoke()).floatValue() >= ((Number) scrollAxisRange.a().invoke()).floatValue() || scrollAxisRange.getReverseScrolling()) {
            return ((Number) scrollAxisRange.c().invoke()).floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean j0(int id, List<o9b> oldScrollObservationScopes) {
        boolean z;
        o9b o9bVarA = rfb.a(oldScrollObservationScopes, id);
        if (o9bVarA != null) {
            z = false;
        } else {
            o9b o9bVar = new o9b(id, this.scrollObservationScopes, null, null, null, null);
            z = true;
            o9bVarA = o9bVar;
        }
        this.scrollObservationScopes.add(o9bVarA);
        return z;
    }

    private final void k0() {
        this._enabledServices = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void l0(final o9b scrollObservationScope) {
        if (scrollObservationScope.z0()) {
            OwnerSnapshotObserver snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.observer.k(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new Function0<Unit>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$scheduleScrollEventIfNeeded$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                public /* bridge */ /* synthetic */ Object invoke() {
                    m46invoke();
                    return Unit.a;
                }

                /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
                public final void m46invoke() {
                    SemanticsNode semanticsNode;
                    LayoutNode layoutNode;
                    ScrollAxisRange horizontalScrollAxisRange = scrollObservationScope.getHorizontalScrollAxisRange();
                    ScrollAxisRange verticalScrollAxisRange = scrollObservationScope.getVerticalScrollAxisRange();
                    Float oldXValue = scrollObservationScope.getOldXValue();
                    Float oldYValue = scrollObservationScope.getOldYValue();
                    float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : ((Number) horizontalScrollAxisRange.c().invoke()).floatValue() - oldXValue.floatValue();
                    float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : ((Number) verticalScrollAxisRange.c().invoke()).floatValue() - oldYValue.floatValue();
                    if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                        int iQ0 = this.q0(scrollObservationScope.getSemanticsNodeId());
                        ffb ffbVar = (ffb) this.H().b(this.accessibilityFocusedVirtualViewId);
                        if (ffbVar != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat = this;
                            try {
                                r6 r6Var = androidComposeViewAccessibilityDelegateCompat.currentlyAccessibilityFocusedANI;
                                if (r6Var != null) {
                                    r6Var.q0(androidComposeViewAccessibilityDelegateCompat.u(ffbVar));
                                    Unit unit = Unit.a;
                                }
                            } catch (IllegalStateException unused) {
                                Unit unit2 = Unit.a;
                            }
                        }
                        ffb ffbVar2 = (ffb) this.H().b(this.focusedVirtualViewId);
                        if (ffbVar2 != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat2 = this;
                            try {
                                r6 r6Var2 = androidComposeViewAccessibilityDelegateCompat2.currentlyFocusedANI;
                                if (r6Var2 != null) {
                                    r6Var2.q0(androidComposeViewAccessibilityDelegateCompat2.u(ffbVar2));
                                    Unit unit3 = Unit.a;
                                }
                            } catch (IllegalStateException unused2) {
                                Unit unit4 = Unit.a;
                            }
                        }
                        this.getView().invalidate();
                        ffb ffbVar3 = (ffb) this.H().b(iQ0);
                        if (ffbVar3 != null && (semanticsNode = ffbVar3.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                            AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat3 = this;
                            if (horizontalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingHorizontalScrollEvents.r(iQ0, horizontalScrollAxisRange);
                            }
                            if (verticalScrollAxisRange != null) {
                                androidComposeViewAccessibilityDelegateCompat3.pendingVerticalScrollEvents.r(iQ0, verticalScrollAxisRange);
                            }
                            androidComposeViewAccessibilityDelegateCompat3.b0(layoutNode);
                        }
                    }
                    if (horizontalScrollAxisRange != null) {
                        scrollObservationScope.g((Float) horizontalScrollAxisRange.c().invoke());
                    }
                    if (verticalScrollAxisRange != null) {
                        scrollObservationScope.h((Float) verticalScrollAxisRange.c().invoke());
                    }
                }
            });
        }
    }

    private final long m0(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        gba gbaVarA = ln6.a(semanticsNode2.r().v());
        kn6 kn6VarL = semanticsNode2.r().v().L();
        gba gbaVarU = gbaVarA.u(kn6VarL != null ? ln6.h(kn6VarL) : rn8.INSTANCE.c());
        gba gbaVarC = kba.c(rn8.q(semanticsNode.u(), j), r16.e(semanticsNode.w()));
        return rn8.e((((long) Float.floatToRawIntBits(n0(gbaVarC.getLeft() - gbaVarU.getLeft(), gbaVarC.getRight() - gbaVarU.getRight()))) << 32) | (4294967295L & ((long) Float.floatToRawIntBits(n0(gbaVarC.getTop() - gbaVarU.getTop(), gbaVarC.getBottom() - gbaVarU.getBottom())))));
    }

    private static final float n0(float f2, float f3) {
        if (Math.signum(f2) == Math.signum(f3)) {
            return Math.abs(f2) < Math.abs(f3) ? f2 : f3;
        }
        return 0.0f;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x001a -> B:8:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private final boolean o0(androidx.compose.ui.semantics.SemanticsNode r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.o0(androidx.compose.ui.semantics.SemanticsNode):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat) {
        Trace.beginSection("measureAndLayout");
        try {
            androidx.compose.ui.node.m.e(androidComposeViewAccessibilityDelegateCompat.view, false, 1, null);
            Unit unit = Unit.a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                androidComposeViewAccessibilityDelegateCompat.y();
                Trace.endSection();
                androidComposeViewAccessibilityDelegateCompat.checkingForSemanticsChanges = false;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int q0(int id) {
        if (id == this.view.getSemanticsOwner().d().getId()) {
            return -1;
        }
        return id;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0094 A[LOOP:1: B:15:0x0054->B:28:0x0094, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x0097 A[EDGE_INSN: B:44:0x0097->B:29:0x0097 BREAK  A[LOOP:1: B:15:0x0054->B:28:0x0094], SYNTHETIC] */
    private final void r0(SemanticsNode newNode, dfb oldNode) {
        p48 p48VarB = p16.b();
        List<SemanticsNode> listV = newNode.v();
        int size = listV.size();
        for (int i = 0; i < size; i++) {
            SemanticsNode semanticsNode = listV.get(i);
            if (H().a(semanticsNode.getId())) {
                if (!oldNode.getChildren().a(semanticsNode.getId())) {
                    b0(newNode.getLayoutNode());
                    return;
                }
                p48VarB.g(semanticsNode.getId());
            }
        }
        p48 children = oldNode.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j = jArr[i2];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i2 != length) {
                        break;
                        break;
                    }
                    i2++;
                } else {
                    int i3 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i4 = 0; i4 < i3; i4++) {
                        if ((255 & j) < 128 && !p48VarB.a(iArr[(i2 << 3) + i4])) {
                            b0(newNode.getLayoutNode());
                            return;
                        }
                        j >>= 8;
                    }
                    if (i3 != 8) {
                        break;
                    } else if (i2 != length) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
        }
        List<SemanticsNode> listV2 = newNode.v();
        int size2 = listV2.size();
        for (int i5 = 0; i5 < size2; i5++) {
            SemanticsNode semanticsNode2 = listV2.get(i5);
            dfb dfbVarB = this.previousSemanticsNodes.b(semanticsNode2.getId());
            if (dfbVarB != null && H().a(semanticsNode2.getId())) {
                r0(semanticsNode2, dfbVarB);
            }
        }
    }

    private final boolean requestAccessibilityFocus(int virtualViewId) {
        if (!Y() || U(virtualViewId)) {
            return false;
        }
        int i = this.accessibilityFocusedVirtualViewId;
        if (i != Integer.MIN_VALUE) {
            u0(this, i, 65536, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        u0(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void s(int virtualViewId, r6 info, String extraDataKey, Bundle arguments) throws NoWhenBranchMatchedException {
        SemanticsNode semanticsNode;
        float[] fArrK0;
        TextLayoutResult textLayoutResultC;
        ffb ffbVarB = H().b(virtualViewId);
        if (ffbVarB == null || (semanticsNode = ffbVarB.getSemanticsNode()) == null) {
            return;
        }
        String strO = O(semanticsNode);
        if (Intrinsics.e(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int iE = this.idToBeforeMap.e(virtualViewId, -1);
            if (iE != -1) {
                info.y().putInt(extraDataKey, iE);
                return;
            }
            return;
        }
        if (Intrinsics.e(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int iE2 = this.idToAfterMap.e(virtualViewId, -1);
            if (iE2 != -1) {
                info.y().putInt(extraDataKey, iE2);
                return;
            }
            return;
        }
        int i = 0;
        if (semanticsNode.getUnmergedConfig().d(SemanticsActions.a.i()) && arguments != null && Intrinsics.e(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i2 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i3 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i3 <= 0 || i2 < 0) {
                return;
            }
            if (i2 < (strO != null ? strO.length() : Integer.MAX_VALUE) && (textLayoutResultC = rfb.c(semanticsNode.getUnmergedConfig())) != null) {
                ArrayList arrayList = new ArrayList();
                for (int i4 = 0; i4 < i3; i4++) {
                    int i5 = i2 + i4;
                    if (i5 >= textLayoutResultC.getLayoutInput().getText().length()) {
                        arrayList.add(null);
                    } else {
                        arrayList.add(M0(semanticsNode, textLayoutResultC.d(i5)));
                    }
                }
                info.y().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                return;
            }
            return;
        }
        seb unmergedConfig = semanticsNode.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        if (unmergedConfig.d(semanticsProperties.K()) && arguments != null && Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.testTag")) {
            String str = (String) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.K());
            if (str != null) {
                info.y().putCharSequence(extraDataKey, str);
                return;
            }
            return;
        }
        if (Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.id")) {
            info.y().putInt(extraDataKey, semanticsNode.getId());
            return;
        }
        if (Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.shapeType")) {
            xkb xkbVar = (xkb) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.I());
            if (xkbVar != null) {
                gba gbaVarQ = Q(semanticsNode, G(info), xkbVar);
                androidx.compose.ui.graphics.n nVarA = A(xkbVar, gbaVarQ.k(), semanticsNode.r().getLayoutDirection());
                if (nVarA instanceof androidx.compose.ui.graphics.n.b) {
                    info.y().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    info.y().putParcelable("androidx.compose.ui.semantics.shapeRect", F0(nVarA, gbaVarQ.getLeft(), gbaVarQ.getTop()));
                    return;
                } else if (nVarA instanceof androidx.compose.ui.graphics.n.c) {
                    info.y().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    info.y().putParcelable("androidx.compose.ui.semantics.shapeRect", F0(nVarA, gbaVarQ.getLeft(), gbaVarQ.getTop()));
                    info.y().putFloatArray("androidx.compose.ui.semantics.shapeCorners", K0(nVarA));
                    return;
                } else {
                    if (!(nVarA instanceof androidx.compose.ui.graphics.n.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    info.y().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    info.y().putParcelable("androidx.compose.ui.semantics.shapeRegion", L0(nVarA, gbaVarQ.getLeft(), gbaVarQ.getTop()));
                    return;
                }
            }
            return;
        }
        if (Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.shapeRect")) {
            xkb xkbVar2 = (xkb) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.I());
            if (xkbVar2 != null) {
                gba gbaVarQ2 = Q(semanticsNode, G(info), xkbVar2);
                Rect rectF0 = F0(A(xkbVar2, gbaVarQ2.k(), semanticsNode.r().getLayoutDirection()), gbaVarQ2.getLeft(), gbaVarQ2.getTop());
                if (rectF0 != null) {
                    info.y().putParcelable("androidx.compose.ui.semantics.shapeRect", rectF0);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.shapeCorners")) {
            xkb xkbVar3 = (xkb) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.I());
            if (xkbVar3 == null || (fArrK0 = K0(A(xkbVar3, Q(semanticsNode, G(info), xkbVar3).k(), semanticsNode.r().getLayoutDirection()))) == null) {
                return;
            }
            info.y().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrK0);
            return;
        }
        if (Intrinsics.e(extraDataKey, "androidx.compose.ui.semantics.shapeRegion")) {
            xkb xkbVar4 = (xkb) SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsProperties.I());
            if (xkbVar4 != null) {
                gba gbaVarQ3 = Q(semanticsNode, G(info), xkbVar4);
                Region regionL0 = L0(A(xkbVar4, gbaVarQ3.k(), semanticsNode.r().getLayoutDirection()), gbaVarQ3.getLeft(), gbaVarQ3.getTop());
                if (regionL0 != null) {
                    info.y().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionL0);
                    return;
                }
                return;
            }
            return;
        }
        ScatterSet<SemanticsPropertyKey<?>> scatterSetJ = semanticsNode.getUnmergedConfig().j();
        if (scatterSetJ == null) {
            return;
        }
        Object[] objArr = scatterSetJ.elements;
        long[] jArr = scatterSetJ.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i6 = 0;
        while (true) {
            long j = jArr[i6];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i7 = 8 - ((~(i6 - length)) >>> 31);
                for (int i8 = i; i8 < i7; i8++) {
                    if ((255 & j) < 128) {
                        SemanticsPropertyKey semanticsPropertyKey = (SemanticsPropertyKey) objArr[(i6 << 3) + i8];
                        String accessibilityExtraKey = semanticsPropertyKey.getAccessibilityExtraKey();
                        if (Intrinsics.e(accessibilityExtraKey, extraDataKey)) {
                            Object objA = SemanticsConfigurationKt.a(semanticsNode.getUnmergedConfig(), semanticsPropertyKey);
                            if (objA instanceof Serializable) {
                                info.y().putSerializable(accessibilityExtraKey, (Serializable) objA);
                            } else {
                                if (!(objA instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                info.y().putParcelable(accessibilityExtraKey, (Parcelable) objA);
                            }
                        } else {
                            continue;
                        }
                    }
                    j >>= 8;
                }
                if (i7 != 8) {
                    return;
                }
            }
            if (i6 == length) {
                return;
            }
            i6++;
            i = 0;
        }
    }

    private final boolean s0(AccessibilityEvent event) {
        if (!W()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return ((Boolean) this.onSendAccessibilityEvent.invoke(event)).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final long t(SemanticsNode semanticsNode, SemanticsNode semanticsNode2, long j) {
        if (rn8.j(j, rn8.INSTANCE.c())) {
            return j;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        seb unmergedConfig = semanticsNode2.getUnmergedConfig();
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(unmergedConfig, semanticsProperties.m());
        if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        if (AndroidComposeViewAccessibilityDelegateCompat_androidKt.t(semanticsNode)) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) SemanticsConfigurationKt.a(semanticsNode2.getUnmergedConfig(), semanticsProperties.S());
        if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
            fIntBitsToFloat2 = -fIntBitsToFloat2;
        }
        return rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L));
    }

    private final boolean t0(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !W()) {
            return false;
        }
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventCreateEvent.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventCreateEvent.setContentDescription(m47.e(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return s0(accessibilityEventCreateEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect u(ffb node) {
        k16 adjustedBounds = node.getAdjustedBounds();
        return I0(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean u0(AndroidComposeViewAccessibilityDelegateCompat androidComposeViewAccessibilityDelegateCompat, int i, int i2, Integer num, List list, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            num = null;
        }
        if ((i3 & 8) != 0) {
            list = null;
        }
        return androidComposeViewAccessibilityDelegateCompat.t0(i, i2, num, list);
    }

    private final void updateHoveredVirtualView(int virtualViewId) {
        int i = this.hoveredVirtualViewId;
        if (i == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        u0(this, virtualViewId, 128, null, null, 12, null);
        u0(this, i, 256, null, null, 12, null);
    }

    private final void v0(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventCreateEvent = createEvent(q0(semanticsNodeId), 32);
        accessibilityEventCreateEvent.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventCreateEvent.getText().add(title);
        }
        s0(accessibilityEventCreateEvent);
    }

    private final void w0(int semanticsNodeId) {
        e eVar = this.pendingTextTraversedEvent;
        if (eVar != null) {
            if (semanticsNodeId != eVar.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - eVar.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventCreateEvent = createEvent(q0(eVar.getNode().getId()), 131072);
                accessibilityEventCreateEvent.setFromIndex(eVar.getFromIndex());
                accessibilityEventCreateEvent.setToIndex(eVar.getToIndex());
                accessibilityEventCreateEvent.setAction(eVar.getAction());
                accessibilityEventCreateEvent.setMovementGranularity(eVar.getGranularity());
                accessibilityEventCreateEvent.getText().add(O(eVar.getNode()));
                s0(accessibilityEventCreateEvent);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    private final boolean x(e16<ffb> currentSemanticsNodes, boolean vertical, int direction, long position) throws NoWhenBranchMatchedException {
        SemanticsPropertyKey<ScrollAxisRange> semanticsPropertyKeyM;
        ScrollAxisRange scrollAxisRange;
        if (rn8.j(position, rn8.INSTANCE.b()) || (((9223372034707292159L & position) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (vertical) {
            semanticsPropertyKeyM = SemanticsProperties.a.S();
        } else {
            if (vertical) {
                throw new NoWhenBranchMatchedException();
            }
            semanticsPropertyKeyM = SemanticsProperties.a.m();
        }
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr = currentSemanticsNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i = 0;
        boolean z = false;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((j & 255) < 128) {
                        ffb ffbVar = (ffb) objArr[(i << 3) + i3];
                        if (l16.d(ffbVar.getAdjustedBounds()).b(position) && (scrollAxisRange = (ScrollAxisRange) SemanticsConfigurationKt.a(ffbVar.getSemanticsNode().getUnmergedConfig(), semanticsPropertyKeyM)) != null) {
                            int i4 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                            if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                                i4 = -1;
                            }
                            if (i4 < 0) {
                                if (((Number) scrollAxisRange.c().invoke()).floatValue() > 0.0f) {
                                    z = true;
                                }
                            } else if (((Number) scrollAxisRange.c().invoke()).floatValue() < ((Number) scrollAxisRange.a().invoke()).floatValue()) {
                                z = true;
                            }
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return z;
                }
            }
            if (i == length) {
                return z;
            }
            i++;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final void x0(com.google.inputmethod.e16<com.google.inputmethod.ffb> r53) throws kotlin.KotlinNothingValueException {
        /*
            Method dump skipped, instruction units count: 1755
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.x0(com.google.android.e16):void");
    }

    private final void y() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (W()) {
                r0(this.view.getSemanticsOwner().d(), this.previousSemanticsRoot);
            }
            Unit unit = Unit.a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                x0(H());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    Q0();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            Trace.endSection();
            throw th2;
        }
    }

    private final void y0(LayoutNode layoutNode, p48 subtreeChangedSemanticsNodesIds) {
        seb sebVarG;
        LayoutNode layoutNodeP;
        if (layoutNode.b() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().p(ni8.a(8))) {
                layoutNode = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$semanticsNode$1
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(LayoutNode layoutNode2) {
                        return Boolean.valueOf(layoutNode2.getNodes().p(ni8.a(8)));
                    }
                });
            }
            if (layoutNode == null || (sebVarG = layoutNode.g()) == null) {
                return;
            }
            if (!sebVarG.getIsMergingSemanticsOfDescendants() && (layoutNodeP = AndroidComposeViewAccessibilityDelegateCompat_androidKt.p(layoutNode, new Function1<LayoutNode, Boolean>() { // from class: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat$sendSubtreeChangeAccessibilityEvents$1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(LayoutNode layoutNode2) {
                    seb sebVarG2 = layoutNode2.g();
                    boolean z = false;
                    if (sebVarG2 != null && sebVarG2.getIsMergingSemanticsOfDescendants()) {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                }
            })) != null) {
                layoutNode = layoutNodeP;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (subtreeChangedSemanticsNodesIds.g(semanticsId)) {
                u0(this, q0(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    public final r6 z(int virtualViewId) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        ffb ffbVarB;
        if (this.view.getComposeViewContext().getLifecycleOwner().getLifecycle().getState() != Lifecycle.State.DESTROYED && (ffbVarB = H().b(virtualViewId)) != null) {
            SemanticsNode semanticsNode = ffbVarB.getSemanticsNode();
            boolean zE = Intrinsics.e(SemanticsConfigurationKt.a(semanticsNode.p(), SemanticsProperties.a.w()), Boolean.TRUE);
            if (zE && !X()) {
                return null;
            }
            r6 r6VarF0 = r6.f0();
            r6VarF0.l0(zE);
            if (virtualViewId == -1) {
                ViewParent parentForAccessibility = this.view.getParentForAccessibility();
                r6VarF0.R0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
            } else {
                SemanticsNode semanticsNodeT = semanticsNode.t();
                Integer numValueOf = semanticsNodeT != null ? Integer.valueOf(semanticsNodeT.getId()) : null;
                if (numValueOf == null) {
                    zw5.d("semanticsNode " + virtualViewId + " has null parent");
                    throw new KotlinNothingValueException();
                }
                int iIntValue = numValueOf.intValue();
                r6VarF0.S0(this.view, iIntValue != this.view.getSemanticsOwner().d().getId() ? iIntValue : -1);
            }
            r6VarF0.b1(this.view, virtualViewId);
            r6VarF0.q0(u(ffbVarB));
            g0(virtualViewId, r6VarF0, semanticsNode);
            return r6VarF0;
        }
        return D();
    }

    private final void z0(LayoutNode layoutNode) {
        if (layoutNode.b() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRangeB = this.pendingHorizontalScrollEvents.b(semanticsId);
            ScrollAxisRange scrollAxisRangeB2 = this.pendingVerticalScrollEvents.b(semanticsId);
            if (scrollAxisRangeB == null && scrollAxisRangeB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventCreateEvent = createEvent(semanticsId, 4096);
            if (scrollAxisRangeB != null) {
                accessibilityEventCreateEvent.setScrollX((int) ((Number) scrollAxisRangeB.c().invoke()).floatValue());
                accessibilityEventCreateEvent.setMaxScrollX((int) ((Number) scrollAxisRangeB.a().invoke()).floatValue());
            }
            if (scrollAxisRangeB2 != null) {
                accessibilityEventCreateEvent.setScrollY((int) ((Number) scrollAxisRangeB2.c().invoke()).floatValue());
                accessibilityEventCreateEvent.setMaxScrollY((int) ((Number) scrollAxisRangeB2.a().invoke()).floatValue());
            }
            s0(accessibilityEventCreateEvent);
        }
    }

    public final boolean C(MotionEvent event) {
        if (!Y()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iT = T(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
            updateHoveredVirtualView(iT);
            if (iT == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
        }
        updateHoveredVirtualView(t04.INVALID_ID);
        return true;
    }

    public final void D0(long j) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final m48 getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final m48 getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final int T(float x, float y) throws KotlinNothingValueException {
        int iQ0;
        androidx.compose.ui.node.m.e(this.view, false, 1, null);
        hd5 hd5Var = new hd5();
        LayoutNode.P0(this.view.getRoot(), rn8.e((((long) Float.floatToRawIntBits(y)) & 4294967295L) | (Float.floatToRawIntBits(x) << 32)), hd5Var, 0, false, 12, null);
        int iR = kotlin.collections.m.r(hd5Var);
        while (true) {
            iQ0 = t04.INVALID_ID;
            if (-1 >= iR) {
                break;
            }
            LayoutNode layoutNodeQ = y23.q(hd5Var.get(iR));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(layoutNodeQ) != null) {
                return t04.INVALID_ID;
            }
            if (layoutNodeQ.getNodes().p(ni8.a(8))) {
                iQ0 = q0(layoutNodeQ.getSemanticsId());
                SemanticsNode semanticsNodeA = efb.a(layoutNodeQ, false);
                if (ifb.h(semanticsNodeA) && !gfb.a(semanticsNodeA)) {
                    break;
                }
            }
            iR--;
        }
        return iQ0;
    }

    public final boolean W() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !I().isEmpty();
    }

    public final void c0(LayoutNode layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (W()) {
            b0(layoutNode);
        }
    }

    public final void d0() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handlerL = L();
        if (!W() || this.checkingForSemanticsChanges || handlerL == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handlerL.post(this.semanticsChangeChecker);
    }

    @Override // com.google.inputmethod.a6
    public s6 getAccessibilityNodeProvider(View host) {
        return this.nodeProvider;
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        k0();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean enabled) {
        k0();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            k0();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Handler handlerL = L();
        Intrinsics.g(handlerL);
        handlerL.removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:38:0x00a4, B:39:0x00ab, B:20:0x0049, B:23:0x0050), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007d A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:38:0x00a4, B:39:0x00ab, B:20:0x0049, B:23:0x0050), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0036, LOOP:0: B:33:0x0084->B:34:0x0086, LOOP_END, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:38:0x00a4, B:39:0x00ab, B:20:0x0049, B:23:0x0050), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (kotlinx.coroutines.DelayKt.b(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c6 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(com.google.android.q22<? super kotlin.Unit> r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat.v(com.google.android.q22):java.lang.Object");
    }

    public final boolean w(boolean vertical, int direction, long position) {
        if (Intrinsics.e(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return x(H(), vertical, direction, position);
        }
        return false;
    }
}
