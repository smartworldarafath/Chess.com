package androidx.compose.p002material3;

import androidx.compose.p000animation.CrossfadeKt;
import androidx.compose.p001foundation.BackgroundKt;
import androidx.compose.p001foundation.layout.BoxScopeInstance;
import androidx.compose.p001foundation.layout.SizeKt;
import androidx.compose.p001foundation.layout.t0;
import androidx.compose.p002material3.TimePickerKt;
import androidx.compose.p002material3.tokens.MotionSchemeKeyTokens;
import androidx.compose.p004runtime.d;
import androidx.compose.p004runtime.p0;
import androidx.compose.p004runtime.s0;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.layout.j;
import androidx.compose.ui.layout.o;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.rw0;
import com.google.android.sh7;
import com.google.android.ta2;
import com.google.inputmethod.BorderStroke;
import com.google.inputmethod.ClockDialModifier;
import com.google.inputmethod.LineHeightStyle;
import com.google.inputmethod.aca;
import com.google.inputmethod.afb;
import com.google.inputmethod.afc;
import com.google.inputmethod.ape;
import com.google.inputmethod.atb;
import com.google.inputmethod.b7;
import com.google.inputmethod.bj1;
import com.google.inputmethod.by0;
import com.google.inputmethod.c21;
import com.google.inputmethod.c6d;
import com.google.inputmethod.cpc;
import com.google.inputmethod.cz1;
import com.google.inputmethod.d08;
import com.google.inputmethod.d6d;
import com.google.inputmethod.dfa;
import com.google.inputmethod.dj7;
import com.google.inputmethod.dud;
import com.google.inputmethod.ei1;
import com.google.inputmethod.ej7;
import com.google.inputmethod.f43;
import com.google.inputmethod.ff3;
import com.google.inputmethod.fj7;
import com.google.inputmethod.fs1;
import com.google.inputmethod.fz1;
import com.google.inputmethod.g16;
import com.google.inputmethod.gba;
import com.google.inputmethod.gdb;
import com.google.inputmethod.gr0;
import com.google.inputmethod.gs1;
import com.google.inputmethod.hl4;
import com.google.inputmethod.hpa;
import com.google.inputmethod.hra;
import com.google.inputmethod.if3;
import com.google.inputmethod.ira;
import com.google.inputmethod.j7d;
import com.google.inputmethod.k0b;
import com.google.inputmethod.kn6;
import com.google.inputmethod.ko1;
import com.google.inputmethod.kr;
import com.google.inputmethod.kx1;
import com.google.inputmethod.l7d;
import com.google.inputmethod.ln6;
import com.google.inputmethod.lqa;
import com.google.inputmethod.m47;
import com.google.inputmethod.n48;
import com.google.inputmethod.nfb;
import com.google.inputmethod.nx8;
import com.google.inputmethod.o58;
import com.google.inputmethod.o5d;
import com.google.inputmethod.op1;
import com.google.inputmethod.os9;
import com.google.inputmethod.pn6;
import com.google.inputmethod.pp1;
import com.google.inputmethod.pr0;
import com.google.inputmethod.q5d;
import com.google.inputmethod.q6c;
import com.google.inputmethod.qxc;
import com.google.inputmethod.qzb;
import com.google.inputmethod.r16;
import com.google.inputmethod.rbc;
import com.google.inputmethod.rn8;
import com.google.inputmethod.s6b;
import com.google.inputmethod.saa;
import com.google.inputmethod.t04;
import com.google.inputmethod.tc;
import com.google.inputmethod.ulb;
import com.google.inputmethod.vbc;
import com.google.inputmethod.vn3;
import com.google.inputmethod.wx0;
import com.google.inputmethod.wz9;
import com.google.inputmethod.x06;
import com.google.inputmethod.xkb;
import com.google.inputmethod.xod;
import com.google.inputmethod.xq8;
import com.google.inputmethod.y06;
import com.google.inputmethod.yj1;
import com.google.inputmethod.z92;
import com.google.inputmethod.zf1;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a-\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a3\u0010\u0018\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001aJ\u0010\u001e\u001a\u00020\b*\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00120\u001cH\u0082@¢\u0006\u0004\b\u001e\u0010\u001f\u001a3\u0010 \u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000eH\u0001¢\u0006\u0004\b \u0010!\u001a3\u0010\"\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\"\u0010!\u001a\u001f\u0010#\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b%\u0010$\u001a\u001f\u0010&\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b&\u0010$\u001a'\u0010'\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b'\u0010(\u001a'\u0010)\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b)\u0010(\u001a?\u0010/\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,H\u0003¢\u0006\u0004\b/\u00100\u001aI\u00108\u001a\u00020\b2\u0006\u00101\u001a\u00020\u000e2\u0006\u00102\u001a\u00020,2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\b032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\b05H\u0003¢\u0006\u0004\b8\u00109\u001a\u0017\u0010:\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b:\u0010;\u001a7\u0010?\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=2\u0006\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b?\u0010@\u001a/\u0010A\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u000eH\u0001¢\u0006\u0004\bA\u0010B\u001a#\u0010C\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u001a2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010D\u001a/\u0010E\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000b2\u0006\u0010\u001b\u001a\u00020\u000eH\u0003¢\u0006\u0004\bE\u0010F\u001a1\u0010H\u001a\u00020\b2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010G\u001a\u00020\u00122\f\u00107\u001a\b\u0012\u0004\u0012\u00020\b03H\u0003¢\u0006\u0004\bH\u0010I\u001a'\u0010L\u001a\u00020K2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010J\u001a\u00020\u000bH\u0001¢\u0006\u0004\bL\u0010M\u001a/\u0010R\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u00122\u0006\u0010O\u001a\u00020\u00122\u0006\u0010P\u001a\u00020\u000b2\u0006\u0010Q\u001a\u00020\u000bH\u0002¢\u0006\u0004\bR\u0010S\u001a\u001f\u0010T\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\bT\u0010U\"\u0014\u0010W\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010H\"\u0014\u0010Y\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010H\"\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010H\"\u0014\u0010^\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010H\"\u0014\u0010`\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010H\"\u0014\u0010b\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010H\"\u0014\u0010d\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010H\"\u0014\u0010f\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010H\"\u0014\u0010h\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010H\"\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010k\"\u0014\u0010n\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010k\"\u0014\u0010p\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bo\u0010k\"\u0014\u0010r\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010H\"\u0014\u0010t\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010H\"\u0014\u0010v\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010H\"\u0014\u0010x\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010H\"\u001a\u0010|\u001a\u00020Z8\u0000X\u0080\u0004¢\u0006\f\n\u0004\by\u0010H\u001a\u0004\bz\u0010{\"\u0015\u0010\u007f\u001a\u00020\u000e*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b}\u0010~\"\u001b\u0010\u0082\u0001\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0080\u0001\u0010\u0081\u0001\"\u001c\u0010\u0086\u0001\u001a\u00030\u0083\u0001*\u00020\u001a8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u001f\u0010\u008b\u0001\u001a\u00020\u00068AX\u0080\u0004¢\u0006\u0010\u0012\u0006\b\u0089\u0001\u0010\u008a\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001¨\u0006\u0095\u0001²\u0006\r\u0010\u008c\u0001\u001a\u00020\u000e8\nX\u008a\u0084\u0002²\u0006\u0010\u0010\u008e\u0001\u001a\u00030\u008d\u00018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u008f\u0001\u001a\u00030\u008d\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0017\u001a\u00030\u0090\u00018\n@\nX\u008a\u008e\u0002²\u0006\u000f\u0010\u0091\u0001\u001a\u00020\u00168\n@\nX\u008a\u008e\u0002²\u0006\u0010\u0010\u0093\u0001\u001a\u00030\u0092\u00018\n@\nX\u008a\u008e\u0002²\u0006\r\u0010\u0094\u0001\u001a\u00020\u000e8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/google/android/j7d;", "state", "Landroidx/compose/ui/b;", "modifier", "Lcom/google/android/c6d;", "colors", "Landroidx/compose/material3/l2;", "layoutType", "", "o0", "(Lcom/google/android/j7d;Landroidx/compose/ui/b;Lcom/google/android/c6d;ILandroidx/compose/runtime/d;II)V", "", "initialHour", "initialMinute", "", "is24Hour", "k1", "(IIZLandroidx/compose/runtime/d;II)Lcom/google/android/j7d;", "", "x", "y", "maxDist", "Lcom/google/android/g16;", "center", "h1", "(Lcom/google/android/j7d;FFFJ)V", "Landroidx/compose/material3/AnalogTimePickerState;", "autoSwitchToMinute", "Lcom/google/android/kr;", "animationSpec", "j1", "(Landroidx/compose/material3/AnalogTimePickerState;FFFZJLcom/google/android/kr;Lcom/google/android/q22;)Ljava/lang/Object;", "C0", "(Landroidx/compose/material3/AnalogTimePickerState;Landroidx/compose/ui/b;Lcom/google/android/c6d;ZLandroidx/compose/runtime/d;II)V", "g0", "c0", "(Lcom/google/android/j7d;Lcom/google/android/c6d;Landroidx/compose/runtime/d;I)V", "y0", "H", "e0", "(Landroidx/compose/ui/b;Lcom/google/android/j7d;Lcom/google/android/c6d;Landroidx/compose/runtime/d;I)V", "A0", "Lcom/google/android/ej7;", "measurePolicy", "Lcom/google/android/xkb;", "startShape", "endShape", "j0", "(Landroidx/compose/ui/b;Lcom/google/android/j7d;Lcom/google/android/c6d;Lcom/google/android/ej7;Lcom/google/android/xkb;Lcom/google/android/xkb;Landroidx/compose/runtime/d;I)V", "checked", "shape", "Lkotlin/Function0;", "onClick", "Lkotlin/Function1;", "Lcom/google/android/hra;", "content", "v0", "(ZLcom/google/android/xkb;Lkotlin/jvm/functions/Function0;Lcom/google/android/c6d;Lcom/google/android/ps4;Landroidx/compose/runtime/d;I)V", "Z", "(Landroidx/compose/ui/b;Landroidx/compose/runtime/d;I)V", "value", "Landroidx/compose/material3/m2;", "selection", "r0", "(Landroidx/compose/ui/b;ILcom/google/android/j7d;ILcom/google/android/c6d;Landroidx/compose/runtime/d;I)V", "J", "(Landroidx/compose/ui/b;Landroidx/compose/material3/AnalogTimePickerState;Lcom/google/android/c6d;ZLandroidx/compose/runtime/d;I)V", "a1", "(Landroidx/compose/ui/b;Landroidx/compose/material3/AnalogTimePickerState;Lcom/google/android/c6d;)Landroidx/compose/ui/b;", "L", "(Landroidx/compose/ui/b;Landroidx/compose/material3/AnalogTimePickerState;IZLandroidx/compose/runtime/d;I)V", "radiusToSizeRatio", "F", "(Landroidx/compose/ui/b;FLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/d;II)V", "number", "", "i1", "(IZILandroidx/compose/runtime/d;I)Ljava/lang/String;", "x1", "y1", "x2", "y2", "Z0", "(FFII)F", "Y0", "(FF)F", "a", "OuterCircleToSizeRatio", "b", "InnerCircleToSizeRatio", "Lcom/google/android/ff3;", "c", "ClockDisplayBottomMargin", "d", "ClockFaceBottomMargin", "e", "DisplaySeparatorWidth", "f", "SupportLabelTop", "g", "TimeInputBottomPadding", "h", "MaxDistance", "i", "MinimumInteractiveSize", "Lcom/google/android/x06;", "j", "Lcom/google/android/x06;", "Minutes", "k", "Hours", "l", "ExtraHours", "m", "PeriodToggleMargin", "n", "TimePickerMaxHeight", "o", "TimePickerMidHeight", "p", "ClockDialMidContainerSize", "q", "c1", "()F", "ClockDialMinContainerSize", "g1", "(Lcom/google/android/j7d;)Z", "isPm", "e1", "(Lcom/google/android/j7d;)I", "hourForDisplay", "Lcom/google/android/if3;", "f1", "(Landroidx/compose/material3/AnalogTimePickerState;)J", "selectorPos", "d1", "(Landroidx/compose/runtime/d;I)I", "getDefaultTimePickerLayoutType$annotations", "()V", "defaultTimePickerLayoutType", "a11yServicesEnabled", "Lcom/google/android/cwc;", "hourValue", "minuteValue", "Lcom/google/android/rn8;", "parentCenter", "Lcom/google/android/gba;", "boundsInParent", "selected", "material3"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class TimePickerKt {
    private static final float a;
    private static final float b;
    private static final float c;
    private static final float d;
    private static final float e;
    private static final float f;
    private static final float g;
    private static final float h;
    private static final float i;
    private static final x06 j;
    private static final x06 k;
    private static final x06 l;
    private static final float m;
    private static final float n;
    private static final float o;
    private static final float p;
    private static final float q;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements ej7 {
        final /* synthetic */ float a;

        a(float f) {
            this.a = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(o oVar, List list, o oVar2, long j, float f, float f2, o.a aVar) {
            if (oVar != null) {
                o.a.z(aVar, oVar, 0, 0, 0.0f, 4, null);
            }
            int size = list.size();
            for (int i = 0; i < size; i++) {
                o oVar3 = (o) list.get(i);
                double d = f;
                double d2 = ((double) (i * f2)) - 1.5707963267948966d;
                o.a.z(aVar, oVar3, sh7.c((Math.cos(d2) * d) + ((double) ((kx1.l(j) / 2) - (oVar3.getWidth() / 2)))), sh7.c((d * Math.sin(d2)) + ((double) ((kx1.k(j) / 2) - (oVar3.getHeight() / 2)))), 0.0f, 4, null);
            }
            if (oVar2 != null) {
                o.a.z(aVar, oVar2, (kx1.n(j) - oVar2.getWidth()) / 2, (kx1.m(j) - oVar2.getHeight()) / 2, 0.0f, 4, null);
            }
            return Unit.a;
        }

        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, final long j) {
            dj7 dj7Var;
            dj7 dj7Var2;
            final float fK = kx1.k(j) * this.a;
            long jD = kx1.d(j, 0, 0, 0, 0, 10, null);
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int i = 0;
            for (int i2 = 0; i2 < size; i2++) {
                dj7 dj7Var3 = list.get(i2);
                dj7 dj7Var4 = dj7Var3;
                if (pn6.a(dj7Var4) != LayoutId.Selector && pn6.a(dj7Var4) != LayoutId.InnerCircle) {
                    arrayList.add(dj7Var3);
                }
            }
            final ArrayList arrayList2 = new ArrayList(arrayList.size());
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                arrayList2.add(((dj7) arrayList.get(i3)).r0(jD));
            }
            int size3 = list.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size3) {
                    dj7Var = null;
                    break;
                }
                dj7Var = list.get(i4);
                if (pn6.a(dj7Var) == LayoutId.Selector) {
                    break;
                }
                i4++;
            }
            dj7 dj7Var5 = dj7Var;
            int size4 = list.size();
            while (true) {
                if (i >= size4) {
                    dj7Var2 = null;
                    break;
                }
                dj7Var2 = list.get(i);
                if (pn6.a(dj7Var2) == LayoutId.InnerCircle) {
                    break;
                }
                i++;
            }
            dj7 dj7Var6 = dj7Var2;
            final float size5 = 6.2831855f / arrayList2.size();
            o oVarR0 = dj7Var5 != null ? dj7Var5.r0(jD) : null;
            final o oVarR1 = dj7Var6 != null ? dj7Var6.r0(jD) : null;
            final o oVar = oVarR0;
            return j.Q1(jVar, kx1.n(j), kx1.m(j), null, new Function1() { // from class: androidx.compose.material3.e2
                public final Object invoke(Object obj) {
                    return TimePickerKt.a.b(oVar, arrayList2, oVarR1, j, fK, size5, (o.a) obj);
                }
            }, 4, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ j7d a;
        final /* synthetic */ c6d b;

        b(j7d j7dVar, c6d c6dVar) {
            this.a = j7dVar;
            this.b = c6dVar;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public final void a(androidx.compose.p004runtime.d dVar, int i) throws NoWhenBranchMatchedException {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-477913269, i, -1, "androidx.compose.material3.ClockDisplayNumbers.<anonymous> (TimePicker.kt:1179)");
            }
            j7d j7dVar = this.a;
            c6d c6dVar = this.b;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarB = t0.b(androidx.compose.p001foundation.layout.c.a.j(), tc.INSTANCE.l(), dVar, 0);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarB, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            ira iraVar = ira.a;
            l7d l7dVar = l7d.a;
            androidx.compose.ui.b bVarV = SizeKt.v(companion, l7dVar.w(), l7dVar.u());
            int iE1 = TimePickerKt.e1(j7dVar);
            m2.Companion companion3 = m2.INSTANCE;
            TimePickerKt.r0(bVarV, iE1, j7dVar, companion3.a(), c6dVar, dVar, 3078);
            TimePickerKt.Z(SizeKt.v(companion, TimePickerKt.e, l7dVar.s()), dVar, 6);
            TimePickerKt.r0(SizeKt.v(companion, l7dVar.w(), l7dVar.u()), j7dVar.f(), j7dVar, companion3.b(), c6dVar, dVar, 3078);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
            a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements ps4<x06, androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ c6d a;
        final /* synthetic */ AnalogTimePickerState b;
        final /* synthetic */ boolean c;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        static final class a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
            final /* synthetic */ c6d a;
            final /* synthetic */ x06 b;
            final /* synthetic */ AnalogTimePickerState c;
            final /* synthetic */ boolean d;

            /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
            static final class C0033a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
                final /* synthetic */ x06 a;
                final /* synthetic */ AnalogTimePickerState b;
                final /* synthetic */ boolean c;

                /* JADX INFO: renamed from: androidx.compose.material3.TimePickerKt$c$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
                static final class C0034a implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
                    final /* synthetic */ AnalogTimePickerState a;
                    final /* synthetic */ boolean b;

                    C0034a(AnalogTimePickerState analogTimePickerState, boolean z) {
                        this.a = analogTimePickerState;
                        this.b = z;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit c(int i, nfb nfbVar) {
                        SemanticsPropertiesKt.G0(nfbVar, 12 + i);
                        return Unit.a;
                    }

                    public final void b(androidx.compose.p004runtime.d dVar, int i) {
                        if (!dVar.g((i & 3) != 2, i & 1)) {
                            dVar.q();
                            return;
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.o(-1385767514, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1639)");
                        }
                        int i2 = TimePickerKt.l._size;
                        AnalogTimePickerState analogTimePickerState = this.a;
                        boolean z = this.b;
                        for (final int i3 = 0; i3 < i2; i3++) {
                            int iE = TimePickerKt.l.e(i3);
                            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
                            boolean zC = dVar.C(i3);
                            Object objR = dVar.R();
                            if (zC || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                                objR = new Function1() { // from class: androidx.compose.material3.h2
                                    public final Object invoke(Object obj) {
                                        return TimePickerKt.c.a.C0033a.C0034a.c(i3, (nfb) obj);
                                    }
                                };
                                dVar.L(objR);
                            }
                            TimePickerKt.L(afb.d(companion, false, (Function1) objR, 1, null), analogTimePickerState, iE, z, dVar, 0);
                        }
                        if (androidx.compose.p004runtime.e.k()) {
                            androidx.compose.p004runtime.e.n();
                        }
                    }

                    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                        b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                        return Unit.a;
                    }
                }

                C0033a(x06 x06Var, AnalogTimePickerState analogTimePickerState, boolean z) {
                    this.a = x06Var;
                    this.b = analogTimePickerState;
                    this.c = z;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final Unit c(int i, nfb nfbVar) {
                    SemanticsPropertiesKt.G0(nfbVar, i + 1.0f);
                    return Unit.a;
                }

                public final void b(androidx.compose.p004runtime.d dVar, int i) {
                    if (!dVar.g((i & 3) != 2, i & 1)) {
                        dVar.q();
                        return;
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-596940007, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous>.<anonymous> (TimePicker.kt:1616)");
                    }
                    dVar.y(1866272144);
                    x06 x06Var = this.a;
                    int i2 = x06Var._size;
                    AnalogTimePickerState analogTimePickerState = this.b;
                    boolean z = this.c;
                    for (final int i3 = 0; i3 < i2; i3++) {
                        int iE = (!analogTimePickerState.getIs24hour() || m2.f(analogTimePickerState.c(), m2.INSTANCE.b())) ? x06Var.e(i3) : x06Var.e(i3) % 12;
                        androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
                        boolean zC = dVar.C(i3);
                        Object objR = dVar.R();
                        if (zC || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                            objR = new Function1() { // from class: androidx.compose.material3.g2
                                public final Object invoke(Object obj) {
                                    return TimePickerKt.c.a.C0033a.c(i3, (nfb) obj);
                                }
                            };
                            dVar.L(objR);
                        }
                        boolean z2 = z;
                        TimePickerKt.L(afb.d(companion, false, (Function1) objR, 1, null), analogTimePickerState, iE, z2, dVar, 0);
                        z = z2;
                    }
                    dVar.u();
                    if (m2.f(this.b.c(), m2.INSTANCE.a()) && this.b.getIs24hour()) {
                        dVar.y(2020585964);
                        TimePickerKt.F(BackgroundKt.c(SizeKt.t(pn6.b(androidx.compose.ui.b.INSTANCE, LayoutId.InnerCircle), l7d.a.b()), ei1.INSTANCE.h(), lqa.g()), TimePickerKt.b, ko1.e(-1385767514, true, new C0034a(this.b, this.c), dVar, 54), dVar, 432, 0);
                        dVar.u();
                    } else {
                        dVar.y(2021505641);
                        dVar.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                    return Unit.a;
                }
            }

            a(c6d c6dVar, x06 x06Var, AnalogTimePickerState analogTimePickerState, boolean z) {
                this.a = c6dVar;
                this.b = x06Var;
                this.c = analogTimePickerState;
                this.d = z;
            }

            public final void a(androidx.compose.p004runtime.d dVar, int i) {
                if (!dVar.g((i & 3) != 2, i & 1)) {
                    dVar.q();
                    return;
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-99063847, i, -1, "androidx.compose.material3.ClockFace.<anonymous>.<anonymous> (TimePicker.kt:1613)");
                }
                fs1.c(cz1.a().d(ei1.l(this.a.a(false))), ko1.e(-596940007, true, new C0033a(this.b, this.c, this.d), dVar, 54), dVar, os9.i | 48);
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
            }

            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
                return Unit.a;
            }
        }

        c(c6d c6dVar, AnalogTimePickerState analogTimePickerState, boolean z) {
            this.a = c6dVar;
            this.b = analogTimePickerState;
            this.c = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(nfb nfbVar) {
            SemanticsPropertiesKt.X(nfbVar);
            return Unit.a;
        }

        public final void b(x06 x06Var, androidx.compose.p004runtime.d dVar, int i) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(747010833, i, -1, "androidx.compose.material3.ClockFace.<anonymous> (TimePicker.kt:1609)");
            }
            androidx.compose.ui.b bVarT = SizeKt.t(androidx.compose.ui.b.INSTANCE, l7d.a.b());
            Object objR = dVar.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.f2
                    public final Object invoke(Object obj) {
                        return TimePickerKt.c.c((nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            TimePickerKt.F(afb.d(bVarT, false, (Function1) objR, 1, null), TimePickerKt.a, ko1.e(-99063847, true, new a(this.a, x06Var, this.b, this.c), dVar, 54), dVar, 432, 0);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((x06) obj, (androidx.compose.p004runtime.d) obj2, ((Number) obj3).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements ej7 {
        public static final d a = new d();

        d() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, o oVar, o.a aVar) {
            o.a.z(aVar, (o) list.get(0), 0, 0, 0.0f, 4, null);
            o.a.z(aVar, (o) list.get(1), ((o) list.get(0)).getWidth(), 0, 0.0f, 4, null);
            o.a.z(aVar, oVar, ((o) list.get(0)).getWidth() - (oVar.getWidth() / 2), 0, 0.0f, 4, null);
            return Unit.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) throws KotlinNothingValueException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dj7 dj7Var = list.get(i);
                if (Intrinsics.e(pn6.a(dj7Var), "Spacer")) {
                    final o oVarR0 = dj7Var.r0(kx1.d(j, 0, jVar.O1(l7d.a.o()), 0, 0, 12, null));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        dj7 dj7Var2 = list.get(i2);
                        if (!Intrinsics.e(pn6.a(dj7Var2), "Spacer")) {
                            arrayList.add(dj7Var2);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        arrayList2.add(((dj7) arrayList.get(i3)).r0(kx1.d(j, 0, kx1.l(j) / 2, 0, 0, 12, null)));
                    }
                    return j.Q1(jVar, kx1.l(j), kx1.k(j), null, new Function1() { // from class: androidx.compose.material3.i2
                        public final Object invoke(Object obj) {
                            return TimePickerKt.d.b(arrayList2, oVarR0, (o.a) obj);
                        }
                    }, 4, null);
                }
            }
            m47.f("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements Function2<androidx.compose.p004runtime.d, Integer, Unit> {
        final /* synthetic */ int a;
        final /* synthetic */ j7d b;
        final /* synthetic */ int c;
        final /* synthetic */ long d;

        e(int i, j7d j7dVar, int i2, long j) {
            this.a = i;
            this.b = j7dVar;
            this.c = i2;
            this.d = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit c(String str, nfb nfbVar) {
            SemanticsPropertiesKt.b0(nfbVar, str);
            return Unit.a;
        }

        public final void b(androidx.compose.p004runtime.d dVar, int i) {
            if (!dVar.g((i & 3) != 2, i & 1)) {
                dVar.q();
                return;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1477282471, i, -1, "androidx.compose.material3.TimeSelector.<anonymous> (TimePicker.kt:1431)");
            }
            final String strI1 = TimePickerKt.i1(this.a, this.b.getIs24hour(), this.c, dVar, 0);
            tc tcVarE = tc.INSTANCE.e();
            int i2 = this.c;
            long j = this.d;
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tcVarE, false);
            int iA = pp1.a(dVar, 0);
            gs1 gs1VarJ = dVar.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVar, companion);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVar.G() == null) {
                pp1.d();
            }
            dVar.o();
            if (dVar.getInserting()) {
                dVar.W(function0B);
            } else {
                dVar.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVar);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            boolean zX = dVar.x(strI1);
            Object objR = dVar.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: androidx.compose.material3.j2
                    public final Object invoke(Object obj) {
                        return TimePickerKt.e.c(strI1, (nfb) obj);
                    }
                };
                dVar.L(objR);
            }
            qxc.j(c21.c(i2, 2, 0, false, null, 14, null), afb.d(companion, false, (Function1) objR, 1, null), j, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, dVar, 0, 0, 262136);
            dVar.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((androidx.compose.p004runtime.d) obj, ((Number) obj2).intValue());
            return Unit.a;
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class f implements ej7 {
        public static final f a = new f();

        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit b(List list, o oVar, o.a aVar) {
            o.a.z(aVar, (o) list.get(0), 0, 0, 0.0f, 4, null);
            o.a.z(aVar, (o) list.get(1), 0, ((o) list.get(0)).getHeight(), 0.0f, 4, null);
            o.a.z(aVar, oVar, 0, ((o) list.get(0)).getHeight() - (oVar.getHeight() / 2), 0.0f, 4, null);
            return Unit.a;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
        @Override // com.google.inputmethod.ej7
        /* JADX INFO: renamed from: measure-3p2s80s */
        public final fj7 mo0measure3p2s80s(j jVar, List<? extends dj7> list, long j) throws KotlinNothingValueException {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                dj7 dj7Var = list.get(i);
                if (Intrinsics.e(pn6.a(dj7Var), "Spacer")) {
                    final o oVarR0 = dj7Var.r0(kx1.d(j, 0, 0, 0, jVar.O1(l7d.a.o()), 3, null));
                    ArrayList arrayList = new ArrayList(list.size());
                    int size2 = list.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        dj7 dj7Var2 = list.get(i2);
                        if (!Intrinsics.e(pn6.a(dj7Var2), "Spacer")) {
                            arrayList.add(dj7Var2);
                        }
                    }
                    final ArrayList arrayList2 = new ArrayList(arrayList.size());
                    int size3 = arrayList.size();
                    for (int i3 = 0; i3 < size3; i3++) {
                        arrayList2.add(((dj7) arrayList.get(i3)).r0(kx1.d(j, 0, 0, 0, kx1.k(j) / 2, 3, null)));
                    }
                    return j.Q1(jVar, kx1.l(j), kx1.k(j), null, new Function1() { // from class: androidx.compose.material3.k2
                        public final Object invoke(Object obj) {
                            return TimePickerKt.f.b(arrayList2, oVarR0, (o.a) obj);
                        }
                    }, 4, null);
                }
            }
            m47.f("Collection contains no element matching the predicate.");
            throw new KotlinNothingValueException();
        }
    }

    static {
        float fI = ff3.i(101);
        l7d l7dVar = l7d.a;
        a = fI / l7dVar.b();
        b = ff3.i(69) / l7dVar.b();
        c = ff3.i(36);
        float f2 = 24;
        d = ff3.i(f2);
        e = ff3.i(f2);
        f = ff3.i(7);
        g = ff3.i(f2);
        h = ff3.i(74);
        i = ff3.i(48);
        j = y06.d(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55);
        x06 x06VarD = y06.d(12, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11);
        k = x06VarD;
        n48 n48Var = new n48(x06VarD._size);
        int[] iArr = x06VarD.content;
        int i2 = x06VarD._size;
        for (int i3 = 0; i3 < i2; i3++) {
            n48Var.k((iArr[i3] % 12) + 12);
        }
        l = n48Var;
        m = ff3.i(12);
        n = ff3.i(384);
        o = ff3.i(330);
        p = ff3.i(238);
        q = ff3.i(200);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void A0(androidx.compose.ui.b bVar, j7d j7dVar, c6d c6dVar, androidx.compose.p004runtime.d dVar, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        final androidx.compose.ui.b bVar2;
        final j7d j7dVar2;
        final c6d c6dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1898918107);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.x(c6dVar) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1898918107, i3, -1, "androidx.compose.material3.VerticalPeriodToggle (TimePicker.kt:1252)");
            }
            Object objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = f.a;
                dVarF.L(objR);
            }
            ej7 ej7Var = (ej7) objR;
            xkb xkbVarI = ulb.i(l7d.a.k(), dVarF, 6);
            Intrinsics.h(xkbVarI, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            z92 z92Var = (z92) xkbVarI;
            bVar2 = bVar;
            j7dVar2 = j7dVar;
            c6dVar2 = c6dVar;
            j0(bVar2, j7dVar2, c6dVar2, ej7Var, ulb.m(z92Var, null, 1, null), ulb.d(z92Var, null, 1, null), dVarF, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            bVar2 = bVar;
            j7dVar2 = j7dVar;
            c6dVar2 = c6dVar;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.h6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.B0(bVar2, j7dVar2, c6dVar2, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit B0(androidx.compose.ui.b bVar, j7d j7dVar, c6d c6dVar, int i2, androidx.compose.p004runtime.d dVar, int i3) throws NoWhenBranchMatchedException {
        A0(bVar, j7dVar, c6dVar, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0122  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:93:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void C0(final AnalogTimePickerState analogTimePickerState, androidx.compose.ui.b bVar, c6d c6dVar, final boolean z, androidx.compose.p004runtime.d dVar, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        androidx.compose.ui.b bVar2;
        c6d c6dVar2;
        boolean z2;
        int i5;
        boolean z3;
        final androidx.compose.ui.b bVar3;
        final c6d c6dVar3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        int i6;
        c6d c6dVarA;
        androidx.compose.ui.b bVar5;
        Object objR;
        int iA;
        Function0<ComposeUiNode> function0B;
        androidx.compose.p004runtime.d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        androidx.compose.p004runtime.d dVarF = dVar.F(1249591487);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.T(analogTimePickerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    c6dVar2 = c6dVar;
                    int i8 = dVarF.x(c6dVar2) ? 256 : 128;
                    i4 |= i8;
                } else {
                    c6dVar2 = c6dVar;
                }
                i4 |= i8;
            } else {
                c6dVar2 = c6dVar;
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 3072) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i4 |= i5;
                }
                if ((i4 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0 || dVarF.t()) {
                        if (i7 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            bVar5 = bVar4;
                            i6 = i4 & (-897);
                            c6dVarA = d6d.a.a(dVarF, 6);
                        } else {
                            androidx.compose.ui.b bVar6 = bVar4;
                            i6 = i4;
                            c6dVarA = c6dVar2;
                            bVar5 = bVar6;
                        }
                    } else {
                        dVarF.q();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar2;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1249591487, i6, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
                    }
                    objR = dVarF.R();
                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.a7d
                            public final Object invoke(Object obj) {
                                return TimePickerKt.E0((nfb) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    androidx.compose.ui.b bVarD = afb.d(bVar5, false, (Function1) objR, 1, null);
                    ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(androidx.compose.p001foundation.layout.c.a.k(), tc.INSTANCE.g(), dVarF, 48);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ = dVarF.j();
                    androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarD);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    function0B = companion.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarA, companion.d());
                    dud.i(dVarC, gs1VarJ, companion.f());
                    function2C = companion.c();
                    if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE, companion.e());
                    yj1 yj1Var = yj1.a;
                    y0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
                    androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                    qzb.a(SizeKt.i(companion2, c), dVarF, 6);
                    J(SizeKt.t(companion2, l7d.a.b()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | 6 | (i6 & 896) | (i6 & 7168));
                    qzb.a(SizeKt.i(companion2, d), dVarF, 6);
                    dVarF.m();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    c6dVar3 = c6dVarA;
                    bVar3 = bVar5;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    c6dVar3 = c6dVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.c7d
                        public final Object invoke(Object obj, Object obj2) {
                            return TimePickerKt.D0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            z2 = z;
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar7 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar7;
                    }
                } else {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar8 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar8;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1249591487, i6, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
                }
                objR = dVarF.R();
                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.a7d
                        public final Object invoke(Object obj) {
                            return TimePickerKt.E0((nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarD2 = afb.d(bVar5, false, (Function1) objR, 1, null);
                ej7 ej7VarA2 = androidx.compose.p001foundation.layout.o.a(androidx.compose.p001foundation.layout.c.a.k(), tc.INSTANCE.g(), dVarF, 48);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarD2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                function0B = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarA2, companion3.d());
                dud.i(dVarC, gs1VarJ2, companion3.f());
                function2C = companion3.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE2, companion3.e());
                yj1 yj1Var2 = yj1.a;
                y0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
                androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                qzb.a(SizeKt.i(companion4, c), dVarF, 6);
                J(SizeKt.t(companion4, l7d.a.b()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | 6 | (i6 & 896) | (i6 & 7168));
                qzb.a(SizeKt.i(companion4, d), dVarF, 6);
                dVarF.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                c6dVar3 = c6dVarA;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                c6dVar3 = c6dVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.c7d
                    public final Object invoke(Object obj, Object obj2) {
                        return TimePickerKt.D0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                c6dVar2 = c6dVar;
                if (dVarF.x(c6dVar2)) {
                }
                i4 |= i8;
            } else {
                c6dVar2 = c6dVar;
            }
            i4 |= i8;
        } else {
            c6dVar2 = c6dVar;
        }
        if ((i3 & 8) != 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar9 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar9;
                    }
                } else {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar10 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar10;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1249591487, i6, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
                }
                objR = dVarF.R();
                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.a7d
                        public final Object invoke(Object obj) {
                            return TimePickerKt.E0((nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarD3 = afb.d(bVar5, false, (Function1) objR, 1, null);
                ej7 ej7VarA3 = androidx.compose.p001foundation.layout.o.a(androidx.compose.p001foundation.layout.c.a.k(), tc.INSTANCE.g(), dVarF, 48);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ3 = dVarF.j();
                androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarD3);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                function0B = companion5.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarA3, companion5.d());
                dud.i(dVarC, gs1VarJ3, companion5.f());
                function2C = companion5.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE3, companion5.e());
                yj1 yj1Var3 = yj1.a;
                y0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
                androidx.compose.ui.b.Companion companion6 = androidx.compose.ui.b.INSTANCE;
                qzb.a(SizeKt.i(companion6, c), dVarF, 6);
                J(SizeKt.t(companion6, l7d.a.b()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | 6 | (i6 & 896) | (i6 & 7168));
                qzb.a(SizeKt.i(companion6, d), dVarF, 6);
                dVarF.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                c6dVar3 = c6dVarA;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                c6dVar3 = c6dVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.c7d
                    public final Object invoke(Object obj, Object obj2) {
                        return TimePickerKt.D0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    bVar5 = bVar4;
                    i6 = i4 & (-897);
                    c6dVarA = d6d.a.a(dVarF, 6);
                } else {
                    androidx.compose.ui.b bVar11 = bVar4;
                    i6 = i4;
                    c6dVarA = c6dVar2;
                    bVar5 = bVar11;
                }
            } else {
                if (i7 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    bVar5 = bVar4;
                    i6 = i4 & (-897);
                    c6dVarA = d6d.a.a(dVarF, 6);
                } else {
                    androidx.compose.ui.b bVar12 = bVar4;
                    i6 = i4;
                    c6dVarA = c6dVar2;
                    bVar5 = bVar12;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1249591487, i6, -1, "androidx.compose.material3.VerticalTimePicker (TimePicker.kt:957)");
            }
            objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.a7d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.E0((nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarD4 = afb.d(bVar5, false, (Function1) objR, 1, null);
            ej7 ej7VarA4 = androidx.compose.p001foundation.layout.o.a(androidx.compose.p001foundation.layout.c.a.k(), tc.INSTANCE.g(), dVarF, 48);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ4 = dVarF.j();
            androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, bVarD4);
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            function0B = companion7.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarA4, companion7.d());
            dud.i(dVarC, gs1VarJ4, companion7.f());
            function2C = companion7.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE4, companion7.e());
            yj1 yj1Var4 = yj1.a;
            y0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
            androidx.compose.ui.b.Companion companion8 = androidx.compose.ui.b.INSTANCE;
            qzb.a(SizeKt.i(companion8, c), dVarF, 6);
            J(SizeKt.t(companion8, l7d.a.b()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | 6 | (i6 & 896) | (i6 & 7168));
            qzb.a(SizeKt.i(companion8, d), dVarF, 6);
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            c6dVar3 = c6dVarA;
            bVar3 = bVar5;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            c6dVar3 = c6dVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.c7d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.D0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit D0(AnalogTimePickerState analogTimePickerState, androidx.compose.ui.b bVar, c6d c6dVar, boolean z, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) throws NoWhenBranchMatchedException {
        C0(analogTimePickerState, bVar, c6dVar, z, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E0(nfb nfbVar) {
        SemanticsPropertiesKt.F0(nfbVar, true);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(androidx.compose.ui.b bVar, final float f2, final Function2<? super androidx.compose.p004runtime.d, ? super Integer, Unit> function2, androidx.compose.p004runtime.d dVar, final int i2, final int i3) {
        int i4;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1041042571);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= dVarF.B(f2) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= dVarF.T(function2) ? 256 : 128;
        }
        if (dVarF.g((i4 & 147) != 146, i4 & 1)) {
            if (i5 != 0) {
                bVar = androidx.compose.ui.b.INSTANCE;
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1041042571, i4, -1, "androidx.compose.material3.CircularLayout (TimePicker.kt:1978)");
            }
            boolean z = (i4 & 112) == 32;
            Object objR = dVarF.R();
            if (z || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new a(f2);
                dVarF.L(objR);
            }
            ej7 ej7Var = (ej7) objR;
            int i6 = ((i4 >> 6) & 14) | ((i4 << 3) & 112);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVar);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            int i7 = ((i6 << 6) & 896) | 6;
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7Var, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            function2.invoke(dVarF, Integer.valueOf((i7 >> 6) & 14));
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        final androidx.compose.ui.b bVar2 = bVar;
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.s6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.G(bVar2, f2, function2, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(androidx.compose.ui.b bVar, float f2, Function2 function2, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        F(bVar, f2, function2, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    private static final void H(final j7d j7dVar, final c6d c6dVar, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(-934561141);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(c6dVar) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-934561141, i3, -1, "androidx.compose.material3.ClockDisplayNumbers (TimePicker.kt:1173)");
            }
            fs1.d(new os9[]{qxc.q().d(xod.e(l7d.a.x(), dVarF, 6)), CompositionLocalsKt.m().d(LayoutDirection.Ltr)}, ko1.e(-477913269, true, new b(j7dVar, c6dVar), dVarF, 54), dVarF, os9.i | 48);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.i7d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.I(j7dVar, c6dVar, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(j7d j7dVar, c6d c6dVar, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        H(j7dVar, c6dVar, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    public static final void J(final androidx.compose.ui.b bVar, AnalogTimePickerState analogTimePickerState, final c6d c6dVar, final boolean z, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        final AnalogTimePickerState analogTimePickerState2 = analogTimePickerState;
        androidx.compose.p004runtime.d dVarF = dVar.F(-478841003);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.T(analogTimePickerState2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.x(c6dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.A(z) ? 2048 : 1024;
        }
        if (dVarF.g((i3 & 1171) != 1170, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-478841003, i3, -1, "androidx.compose.material3.ClockFace (TimePicker.kt:1591)");
            }
            analogTimePickerState2 = analogTimePickerState;
            CrossfadeKt.b(analogTimePickerState2.s(), a1(BackgroundKt.c(bVar, c6dVar.getClockDialColor(), lqa.g()).then(new ClockDialModifier(analogTimePickerState, z, analogTimePickerState.c(), d08.b(MotionSchemeKeyTokens.DefaultSpatial, dVarF, 6), null)), analogTimePickerState2, c6dVar), d08.b(MotionSchemeKeyTokens.DefaultEffects, dVarF, 6), null, ko1.e(747010833, true, new c(c6dVar, analogTimePickerState2, z), dVarF, 54), dVarF, 24576, 8);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.f7d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.K(bVar, analogTimePickerState2, c6dVar, z, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(androidx.compose.ui.b bVar, AnalogTimePickerState analogTimePickerState, c6d c6dVar, boolean z, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        J(bVar, analogTimePickerState, c6dVar, z, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(final androidx.compose.ui.b bVar, final AnalogTimePickerState analogTimePickerState, final int i2, final boolean z, androidx.compose.p004runtime.d dVar, final int i3) {
        int i4;
        androidx.compose.p004runtime.d dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(-206784607);
        if ((i3 & 6) == 0) {
            i4 = (dVarF.x(bVar) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= dVarF.T(analogTimePickerState) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= dVarF.C(i2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= dVarF.A(z) ? 2048 : 1024;
        }
        int i5 = i4;
        if (dVarF.g((i5 & 1171) != 1170, i5 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-206784607, i5, -1, "androidx.compose.material3.ClockText (TimePicker.kt:1727)");
            }
            TextStyle textStyleE = xod.e(l7d.a.c(), dVarF, 6);
            final f43 f43Var = (f43) dVarF.v(CompositionLocalsKt.g());
            final float fX2 = f43Var.x2(h);
            Object objR = dVarF.R();
            androidx.compose.p004runtime.d.Companion companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion.a()) {
                objR = s0.e(rn8.d(rn8.INSTANCE.c()), null, 2, null);
                dVarF.L(objR);
            }
            final o58 o58Var = (o58) objR;
            Object objR2 = dVarF.R();
            if (objR2 == companion.a()) {
                objR2 = s0.e(g16.c(g16.INSTANCE.b()), null, 2, null);
                dVarF.L(objR2);
            }
            final o58 o58Var2 = (o58) objR2;
            Object objR3 = dVarF.R();
            if (objR3 == companion.a()) {
                objR3 = s0.e(gba.INSTANCE.a(), null, 2, null);
                dVarF.L(objR3);
            }
            final o58 o58Var3 = (o58) objR3;
            Object objR4 = dVarF.R();
            if (objR4 == companion.a()) {
                objR4 = vn3.k(EmptyCoroutineContext.a, dVarF);
                dVarF.L(objR4);
            }
            final ta2 ta2Var = (ta2) objR4;
            final String strI1 = i1(analogTimePickerState.c(), analogTimePickerState.getIs24hour(), i2, dVarF, i5 & 896);
            String strC = c21.c(i2, 0, 0, false, null, 15, null);
            boolean zX = dVarF.x(analogTimePickerState);
            Object objR5 = dVarF.R();
            if (zX || objR5 == companion.a()) {
                objR5 = p0.e(new Function0() { // from class: com.google.android.t6d
                    public final Object invoke() {
                        return Boolean.valueOf(TimePickerKt.S(analogTimePickerState, f43Var, o58Var3));
                    }
                });
                dVarF.L(objR5);
            }
            final q6c q6cVar = (q6c) objR5;
            tc tcVarE = tc.INSTANCE.e();
            Object objR6 = dVarF.R();
            if (objR6 == companion.a()) {
                objR6 = new Function1() { // from class: com.google.android.u6d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.U(o58Var2, o58Var3, o58Var, (kn6) obj);
                    }
                };
                dVarF.L(objR6);
            }
            androidx.compose.ui.b bVarB = hl4.b(SizeKt.t(InteractiveComponentSizeKt.h(xq8.a(bVar, (Function1) objR6)), i), false, null, 3, null);
            boolean zT = dVarF.T(ta2Var) | dVarF.T(analogTimePickerState) | dVarF.B(fX2) | ((i5 & 7168) == 2048) | dVarF.x(q6cVar);
            Object objR7 = dVarF.R();
            if (zT || objR7 == companion.a()) {
                Function1 function1 = new Function1() { // from class: com.google.android.v6d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.V(ta2Var, analogTimePickerState, fX2, z, o58Var, o58Var2, q6cVar, (nfb) obj);
                    }
                };
                dVarF.L(function1);
                objR7 = function1;
            }
            androidx.compose.ui.b bVarC = afb.c(bVarB, true, (Function1) objR7);
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tcVarE, false);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarC);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            androidx.compose.ui.b.Companion companion3 = androidx.compose.ui.b.INSTANCE;
            boolean zX2 = dVarF.x(strI1);
            Object objR8 = dVarF.R();
            if (zX2 || objR8 == companion.a()) {
                objR8 = new Function1() { // from class: com.google.android.w6d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.X(strI1, (nfb) obj);
                    }
                };
                dVarF.L(objR8);
            }
            dVar2 = dVarF;
            qxc.j(strC, afb.a(companion3, (Function1) objR8), 0L, null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleE, dVar2, 0, 0, 131068);
            dVar2.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.x6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.Y(bVar, analogTimePickerState, i2, z, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long M(o58<rn8> o58Var) {
        return o58Var.getValue().getPackedValue();
    }

    private static final void N(o58<rn8> o58Var, long j2) {
        o58Var.setValue(rn8.d(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long O(o58<g16> o58Var) {
        return o58Var.getValue().getPackedValue();
    }

    private static final void P(o58<g16> o58Var, long j2) {
        o58Var.setValue(g16.c(j2));
    }

    private static final gba Q(o58<gba> o58Var) {
        return o58Var.getValue();
    }

    private static final void R(o58<gba> o58Var, gba gbaVar) {
        o58Var.setValue(gbaVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean S(AnalogTimePickerState analogTimePickerState, f43 f43Var, o58 o58Var) {
        long jF1 = f1(analogTimePickerState);
        float fX2 = f43Var.x2(if3.f(jF1));
        return Q(o58Var).b(rn8.e((((long) Float.floatToRawIntBits(f43Var.x2(if3.g(jF1)))) & 4294967295L) | (Float.floatToRawIntBits(fX2) << 32)));
    }

    private static final boolean T(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(o58 o58Var, o58 o58Var2, o58 o58Var3, kn6 kn6Var) {
        kn6 kn6VarZ = kn6Var.Z();
        P(o58Var, kn6VarZ != null ? r16.b(kn6VarZ.a()) : g16.INSTANCE.b());
        R(o58Var2, ln6.a(kn6Var));
        N(o58Var3, Q(o58Var2).h());
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(final ta2 ta2Var, final AnalogTimePickerState analogTimePickerState, final float f2, final boolean z, final o58 o58Var, final o58 o58Var2, q6c q6cVar, nfb nfbVar) {
        SemanticsPropertiesKt.x(nfbVar, null, new Function0() { // from class: com.google.android.b7d
            public final Object invoke() {
                return Boolean.valueOf(TimePickerKt.W(ta2Var, analogTimePickerState, f2, z, o58Var, o58Var2));
            }
        }, 1, null);
        SemanticsPropertiesKt.q0(nfbVar, T(q6cVar));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean W(ta2 ta2Var, AnalogTimePickerState analogTimePickerState, float f2, boolean z, o58 o58Var, o58 o58Var2) {
        rw0.d(ta2Var, (CoroutineContext) null, (CoroutineStart) null, new C0209TimePickerKt$ClockText$2$1$1$1(analogTimePickerState, f2, z, o58Var, o58Var2, null), 3, (Object) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(String str, nfb nfbVar) {
        SemanticsPropertiesKt.b0(nfbVar, str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(androidx.compose.ui.b bVar, AnalogTimePickerState analogTimePickerState, int i2, boolean z, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        L(bVar, analogTimePickerState, i2, z, dVar, saa.a(i3 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float Y0(float f2, float f3) {
        float fAtan2 = ((float) Math.atan2(f2, f3)) - 1.5707964f;
        return fAtan2 < 0.0f ? fAtan2 + 6.2831855f : fAtan2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(final androidx.compose.ui.b bVar, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(2100674302);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (dVarF.g((i3 & 3) != 2, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(2100674302, i3, -1, "androidx.compose.material3.DisplaySeparator (TimePicker.kt:1379)");
            }
            TextStyle textStyleC = TextStyle.c((TextStyle) dVarF.v(qxc.q()), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, cpc.INSTANCE.a(), 0, 0L, null, null, new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.d.INSTANCE.a(), (DefaultConstructorMarker) null), 0, 0, null, 15695871, null);
            Object objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.l6d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.a0((nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarA = afb.a(bVar, (Function1) objR);
            ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(tc.INSTANCE.e(), false);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarA);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarI, companion.d());
            dud.i(dVarC, gs1VarJ, companion.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion.e());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
            dVar2 = dVarF;
            qxc.j(":", null, bj1.l(q5d.a.a(), dVarF, 6), null, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleC, dVar2, 6, 0, 131066);
            dVar2.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.m6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.b0(bVar, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float Z0(float f2, float f3, int i2, int i3) {
        return (float) Math.hypot(i2 - f2, i3 - f3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(nfb nfbVar) {
        return Unit.a;
    }

    private static final androidx.compose.ui.b a1(androidx.compose.ui.b bVar, final AnalogTimePickerState analogTimePickerState, final c6d c6dVar) {
        return androidx.compose.ui.draw.c.d(bVar, new Function1() { // from class: com.google.android.g6d
            public final Object invoke(Object obj) {
                return TimePickerKt.b1(analogTimePickerState, c6dVar, (fz1) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(androidx.compose.ui.b bVar, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        Z(bVar, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b1(AnalogTimePickerState analogTimePickerState, c6d c6dVar, fz1 fz1Var) {
        float fX2 = fz1Var.x2(if3.f(f1(analogTimePickerState)));
        long jE = rn8.e((((long) Float.floatToRawIntBits(fz1Var.x2(if3.g(f1(analogTimePickerState))))) & 4294967295L) | (Float.floatToRawIntBits(fX2) << 32));
        l7d l7dVar = l7d.a;
        float fX3 = ((fz1Var.x2(l7dVar.g()) / 2.0f) * fz1Var.O1(analogTimePickerState.u())) / fz1Var.O1(l7dVar.b());
        long selectorColor = c6dVar.getSelectorColor();
        long jA = ei1.INSTANCE.a();
        androidx.compose.ui.graphics.e.Companion companion = androidx.compose.ui.graphics.e.INSTANCE;
        DrawScope.i1(fz1Var, jA, fX3, jE, 0.0f, null, null, companion.a(), 56, null);
        fz1Var.j1();
        DrawScope.i1(fz1Var, selectorColor, fX3, jE, 0.0f, null, null, companion.C(), 56, null);
        float fX4 = fz1Var.x2(l7dVar.h());
        float fCos = ((float) Math.cos(analogTimePickerState.t())) * fX3;
        DrawScope.e1(fz1Var, selectorColor, atb.b(fz1Var.d()), rn8.p(jE, rn8.e((((long) Float.floatToRawIntBits(((float) Math.sin(analogTimePickerState.t())) * fX3)) & 4294967295L) | (Float.floatToRawIntBits(fCos) << 32))), fX4, 0, null, 0.0f, null, companion.B(), 240, null);
        DrawScope.i1(fz1Var, selectorColor, fz1Var.x2(l7dVar.e()) / 2, atb.b(fz1Var.d()), 0.0f, null, null, 0, 120, null);
        DrawScope.i1(fz1Var, c6dVar.a(true), fX3, jE, 0.0f, null, null, companion.k(), 56, null);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void c0(final j7d j7dVar, final c6d c6dVar, androidx.compose.p004runtime.d dVar, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(755539561);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(c6dVar) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(755539561, i3, -1, "androidx.compose.material3.HorizontalClockDisplay (TimePicker.kt:1133)");
            }
            androidx.compose.foundation.layout.c.f fVarE = androidx.compose.p001foundation.layout.c.a.e();
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            tc.Companion companion2 = tc.INSTANCE;
            ej7 ej7VarA = androidx.compose.p001foundation.layout.o.a(fVarE, companion2.k(), dVarF, 6);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion3.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarA, companion3.d());
            dud.i(dVarC, gs1VarJ, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion3.e());
            yj1 yj1Var = yj1.a;
            H(j7dVar, c6dVar, dVarF, i3 & 126);
            if (j7dVar.getIs24hour()) {
                dVarF.y(999020143);
                dVarF.u();
            } else {
                dVarF.y(998576161);
                androidx.compose.ui.b bVarR = nx8.r(companion, 0.0f, m, 0.0f, 0.0f, 13, null);
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(companion2.o(), false);
                int iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarR);
                Function0<ComposeUiNode> function0B2 = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarI, companion3.d());
                dud.i(dVarC2, gs1VarJ2, companion3.f());
                Function2<ComposeUiNode, Integer, Unit> function2C2 = companion3.c();
                if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE2, companion3.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                l7d l7dVar = l7d.a;
                int i4 = i3 << 3;
                e0(SizeKt.v(companion, l7dVar.m(), l7dVar.l()), j7dVar, c6dVar, dVarF, 6 | (i4 & 112) | (i4 & 896));
                dVarF.m();
                dVarF.u();
            }
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.h7d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.d0(j7dVar, c6dVar, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float c1() {
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit d0(j7d j7dVar, c6d c6dVar, int i2, androidx.compose.p004runtime.d dVar, int i3) throws NoWhenBranchMatchedException {
        c0(j7dVar, c6dVar, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    public static final int d1(androidx.compose.p004runtime.d dVar, int i2) {
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(435687004, i2, -1, "androidx.compose.material3.<get-defaultTimePickerLayoutType> (TimePicker.kt:2051)");
        }
        int iA = p2.a(dVar, 0);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return iA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void e0(androidx.compose.ui.b bVar, j7d j7dVar, c6d c6dVar, androidx.compose.p004runtime.d dVar, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        final androidx.compose.ui.b bVar2;
        final j7d j7dVar2;
        final c6d c6dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(1261215927);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.x(c6dVar) ? 256 : 128;
        }
        if (dVarF.g((i3 & 147) != 146, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1261215927, i3, -1, "androidx.compose.material3.HorizontalPeriodToggle (TimePicker.kt:1206)");
            }
            Object objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = d.a;
                dVarF.L(objR);
            }
            ej7 ej7Var = (ej7) objR;
            xkb xkbVarI = ulb.i(l7d.a.k(), dVarF, 6);
            Intrinsics.h(xkbVarI, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            z92 z92Var = (z92) xkbVarI;
            bVar2 = bVar;
            j7dVar2 = j7dVar;
            c6dVar2 = c6dVar;
            j0(bVar2, j7dVar2, c6dVar2, ej7Var, ulb.k(z92Var, null, 1, null), ulb.f(z92Var, null, 1, null), dVarF, (i3 & 14) | 3072 | (i3 & 112) | (i3 & 896));
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            bVar2 = bVar;
            j7dVar2 = j7dVar;
            c6dVar2 = c6dVar;
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.f6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.f0(bVar2, j7dVar2, c6dVar2, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final int e1(j7d j7dVar) {
        if (j7dVar.getIs24hour()) {
            return j7dVar.a() % 24;
        }
        if (j7dVar.a() % 12 == 0) {
            return 12;
        }
        return g1(j7dVar) ? j7dVar.a() - 12 : j7dVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit f0(androidx.compose.ui.b bVar, j7d j7dVar, c6d c6dVar, int i2, androidx.compose.p004runtime.d dVar, int i3) throws NoWhenBranchMatchedException {
        e0(bVar, j7dVar, c6dVar, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    public static final long f1(AnalogTimePickerState analogTimePickerState) {
        float fU = analogTimePickerState.u();
        l7d l7dVar = l7d.a;
        float fI = ff3.i(ff3.i(l7dVar.g() / 2.0f) * (fU / l7dVar.b()));
        float fI2 = ff3.i(((ff3) g.g(ff3.e(ff3.i(((analogTimePickerState.getIs24hour() && g1(analogTimePickerState) && m2.f(analogTimePickerState.c(), m2.INSTANCE.a())) ? ff3.i(analogTimePickerState.u() * b) : ff3.i(analogTimePickerState.u() * a)) - fI)), ff3.e(ff3.i(0)))).getValue() + fI);
        float f2 = 2;
        return if3.c((((long) Float.floatToRawIntBits(ff3.i(ff3.i(((float) Math.cos(analogTimePickerState.t())) * fI2) + ff3.i(analogTimePickerState.u() / f2)))) << 32) | (((long) Float.floatToRawIntBits(ff3.i(ff3.i(fI2 * ((float) Math.sin(analogTimePickerState.t()))) + ff3.i(analogTimePickerState.u() / f2)))) & 4294967295L));
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0067  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0072  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:76:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0122  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x019b  */
    /* JADX WARN: Code duplicated, block: B:90:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    public static final void g0(final AnalogTimePickerState analogTimePickerState, androidx.compose.ui.b bVar, c6d c6dVar, final boolean z, androidx.compose.p004runtime.d dVar, final int i2, final int i3) throws NoWhenBranchMatchedException {
        int i4;
        androidx.compose.ui.b bVar2;
        c6d c6dVar2;
        boolean z2;
        int i5;
        boolean z3;
        final androidx.compose.ui.b bVar3;
        final c6d c6dVar3;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        int i6;
        c6d c6dVarA;
        androidx.compose.ui.b bVar5;
        Object objR;
        int iA;
        Function0<ComposeUiNode> function0B;
        androidx.compose.p004runtime.d dVarC;
        Function2<ComposeUiNode, Integer, Unit> function2C;
        androidx.compose.p004runtime.d dVarF = dVar.F(1432307537);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (dVarF.T(analogTimePickerState) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i7 = i3 & 2;
        if (i7 == 0) {
            if ((i2 & 48) == 0) {
                bVar2 = bVar;
                i4 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i2 & 384) == 0) {
                if ((i3 & 4) == 0) {
                    c6dVar2 = c6dVar;
                    int i8 = dVarF.x(c6dVar2) ? 256 : 128;
                    i4 |= i8;
                } else {
                    c6dVar2 = c6dVar;
                }
                i4 |= i8;
            } else {
                c6dVar2 = c6dVar;
            }
            if ((i3 & 8) != 0) {
                if ((i2 & 3072) == 0) {
                    z2 = z;
                    if (dVarF.A(z2)) {
                        i5 = 2048;
                    } else {
                        i5 = 1024;
                    }
                    i4 |= i5;
                }
                if ((i4 & 1171) != 1170) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (dVarF.g(z3, i4 & 1)) {
                    dVarF.U();
                    if ((i2 & 1) != 0 || dVarF.t()) {
                        if (i7 != 0) {
                            bVar4 = androidx.compose.ui.b.INSTANCE;
                        } else {
                            bVar4 = bVar2;
                        }
                        if ((i3 & 4) != 0) {
                            bVar5 = bVar4;
                            i6 = i4 & (-897);
                            c6dVarA = d6d.a.a(dVarF, 6);
                        } else {
                            androidx.compose.ui.b bVar6 = bVar4;
                            i6 = i4;
                            c6dVarA = c6dVar2;
                            bVar5 = bVar6;
                        }
                    } else {
                        dVarF.q();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar2;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(1432307537, i6, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
                    }
                    objR = dVarF.R();
                    if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                        objR = new Function1() { // from class: com.google.android.d7d
                            public final Object invoke(Object obj) {
                                return TimePickerKt.h0((nfb) obj);
                            }
                        };
                        dVarF.L(objR);
                    }
                    androidx.compose.ui.b bVarD = afb.d(bVar5, false, (Function1) objR, 1, null);
                    ej7 ej7VarB = t0.b(androidx.compose.p001foundation.layout.c.a.j(), tc.INSTANCE.i(), dVarF, 48);
                    iA = pp1.a(dVarF, 0);
                    gs1 gs1VarJ = dVarF.j();
                    androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarD);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    function0B = companion.b();
                    if (dVarF.G() == null) {
                        pp1.d();
                    }
                    dVarF.o();
                    if (dVarF.getInserting()) {
                        dVarF.W(function0B);
                    } else {
                        dVarF.k();
                    }
                    dVarC = dud.c(dVarF);
                    dud.i(dVarC, ej7VarB, companion.d());
                    dud.i(dVarC, gs1VarJ, companion.f());
                    function2C = companion.c();
                    if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                        dVarC.L(Integer.valueOf(iA));
                        dVarC.e(Integer.valueOf(iA), function2C);
                    }
                    dud.i(dVarC, bVarE, companion.e());
                    ira iraVar = ira.a;
                    c0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
                    androidx.compose.ui.b.Companion companion2 = androidx.compose.ui.b.INSTANCE;
                    qzb.a(SizeKt.y(companion2, c), dVarF, 6);
                    J(companion2.then(new zf1()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168));
                    dVarF.m();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    c6dVar3 = c6dVarA;
                    bVar3 = bVar5;
                } else {
                    dVarF.q();
                    bVar3 = bVar2;
                    c6dVar3 = c6dVar2;
                }
                s6bVarH = dVarF.H();
                if (s6bVarH != null) {
                    s6bVarH.a(new Function2() { // from class: com.google.android.e7d
                        public final Object invoke(Object obj, Object obj2) {
                            return TimePickerKt.i0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i4 |= 3072;
            z2 = z;
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar7 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar7;
                    }
                } else {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar8 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar8;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1432307537, i6, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
                }
                objR = dVarF.R();
                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.d7d
                        public final Object invoke(Object obj) {
                            return TimePickerKt.h0((nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarD2 = afb.d(bVar5, false, (Function1) objR, 1, null);
                ej7 ej7VarB2 = t0.b(androidx.compose.p001foundation.layout.c.a.j(), tc.INSTANCE.i(), dVarF, 48);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarD2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                function0B = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarB2, companion3.d());
                dud.i(dVarC, gs1VarJ2, companion3.f());
                function2C = companion3.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE2, companion3.e());
                ira iraVar2 = ira.a;
                c0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
                androidx.compose.ui.b.Companion companion4 = androidx.compose.ui.b.INSTANCE;
                qzb.a(SizeKt.y(companion4, c), dVarF, 6);
                J(companion4.then(new zf1()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168));
                dVarF.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                c6dVar3 = c6dVarA;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                c6dVar3 = c6dVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.e7d
                    public final Object invoke(Object obj, Object obj2) {
                        return TimePickerKt.i0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 48;
        bVar2 = bVar;
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                c6dVar2 = c6dVar;
                if (dVarF.x(c6dVar2)) {
                }
                i4 |= i8;
            } else {
                c6dVar2 = c6dVar;
            }
            i4 |= i8;
        } else {
            c6dVar2 = c6dVar;
        }
        if ((i3 & 8) != 0) {
            if ((i2 & 3072) == 0) {
                z2 = z;
                if (dVarF.A(z2)) {
                    i5 = 2048;
                } else {
                    i5 = 1024;
                }
                i4 |= i5;
            }
            if ((i4 & 1171) != 1170) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (dVarF.g(z3, i4 & 1)) {
                dVarF.U();
                if ((i2 & 1) != 0) {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar9 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar9;
                    }
                } else {
                    if (i7 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i3 & 4) != 0) {
                        bVar5 = bVar4;
                        i6 = i4 & (-897);
                        c6dVarA = d6d.a.a(dVarF, 6);
                    } else {
                        androidx.compose.ui.b bVar10 = bVar4;
                        i6 = i4;
                        c6dVarA = c6dVar2;
                        bVar5 = bVar10;
                    }
                }
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(1432307537, i6, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
                }
                objR = dVarF.R();
                if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                    objR = new Function1() { // from class: com.google.android.d7d
                        public final Object invoke(Object obj) {
                            return TimePickerKt.h0((nfb) obj);
                        }
                    };
                    dVarF.L(objR);
                }
                androidx.compose.ui.b bVarD3 = afb.d(bVar5, false, (Function1) objR, 1, null);
                ej7 ej7VarB3 = t0.b(androidx.compose.p001foundation.layout.c.a.j(), tc.INSTANCE.i(), dVarF, 48);
                iA = pp1.a(dVarF, 0);
                gs1 gs1VarJ3 = dVarF.j();
                androidx.compose.ui.b bVarE3 = ComposedModifierKt.e(dVarF, bVarD3);
                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                function0B = companion5.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B);
                } else {
                    dVarF.k();
                }
                dVarC = dud.c(dVarF);
                dud.i(dVarC, ej7VarB3, companion5.d());
                dud.i(dVarC, gs1VarJ3, companion5.f());
                function2C = companion5.c();
                if (dVarC.getInserting()) {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                } else {
                    dVarC.L(Integer.valueOf(iA));
                    dVarC.e(Integer.valueOf(iA), function2C);
                }
                dud.i(dVarC, bVarE3, companion5.e());
                ira iraVar3 = ira.a;
                c0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
                androidx.compose.ui.b.Companion companion6 = androidx.compose.ui.b.INSTANCE;
                qzb.a(SizeKt.y(companion6, c), dVarF, 6);
                J(companion6.then(new zf1()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168));
                dVarF.m();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                c6dVar3 = c6dVarA;
                bVar3 = bVar5;
            } else {
                dVarF.q();
                bVar3 = bVar2;
                c6dVar3 = c6dVar2;
            }
            s6bVarH = dVarF.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.e7d
                    public final Object invoke(Object obj, Object obj2) {
                        return TimePickerKt.i0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i4 |= 3072;
        z2 = z;
        if ((i4 & 1171) != 1170) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (dVarF.g(z3, i4 & 1)) {
            dVarF.U();
            if ((i2 & 1) != 0) {
                if (i7 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    bVar5 = bVar4;
                    i6 = i4 & (-897);
                    c6dVarA = d6d.a.a(dVarF, 6);
                } else {
                    androidx.compose.ui.b bVar11 = bVar4;
                    i6 = i4;
                    c6dVarA = c6dVar2;
                    bVar5 = bVar11;
                }
            } else {
                if (i7 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i3 & 4) != 0) {
                    bVar5 = bVar4;
                    i6 = i4 & (-897);
                    c6dVarA = d6d.a.a(dVarF, 6);
                } else {
                    androidx.compose.ui.b bVar12 = bVar4;
                    i6 = i4;
                    c6dVarA = c6dVar2;
                    bVar5 = bVar12;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1432307537, i6, -1, "androidx.compose.material3.HorizontalTimePicker (TimePicker.kt:980)");
            }
            objR = dVarF.R();
            if (objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.d7d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.h0((nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarD4 = afb.d(bVar5, false, (Function1) objR, 1, null);
            ej7 ej7VarB4 = t0.b(androidx.compose.p001foundation.layout.c.a.j(), tc.INSTANCE.i(), dVarF, 48);
            iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ4 = dVarF.j();
            androidx.compose.ui.b bVarE4 = ComposedModifierKt.e(dVarF, bVarD4);
            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
            function0B = companion7.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarB4, companion7.d());
            dud.i(dVarC, gs1VarJ4, companion7.f());
            function2C = companion7.c();
            if (dVarC.getInserting()) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            } else {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE4, companion7.e());
            ira iraVar4 = ira.a;
            c0(analogTimePickerState, c6dVarA, dVarF, (i6 & 14) | ((i6 >> 3) & 112));
            androidx.compose.ui.b.Companion companion8 = androidx.compose.ui.b.INSTANCE;
            qzb.a(SizeKt.y(companion8, c), dVarF, 6);
            J(companion8.then(new zf1()), analogTimePickerState, c6dVarA, z2, dVarF, ((i6 << 3) & 112) | (i6 & 896) | (i6 & 7168));
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            c6dVar3 = c6dVarA;
            bVar3 = bVar5;
        } else {
            dVarF.q();
            bVar3 = bVar2;
            c6dVar3 = c6dVar2;
        }
        s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.e7d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.i0(analogTimePickerState, bVar3, c6dVar3, z, i2, i3, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final boolean g1(j7d j7dVar) {
        return j7dVar.a() >= 12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(nfb nfbVar) {
        SemanticsPropertiesKt.F0(nfbVar, true);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h1(j7d j7dVar, float f2, float f3, float f4, long j2) {
        if (m2.f(j7dVar.c(), m2.INSTANCE.a()) && j7dVar.getIs24hour()) {
            float fZ0 = Z0(f2, f3, g16.k(j2), g16.l(j2));
            if (g1(j7dVar)) {
                j7dVar.d(j7dVar.a() - (fZ0 >= f4 ? 12 : 0));
            } else {
                j7dVar.d(j7dVar.a() + (fZ0 < f4 ? 12 : 0));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit i0(AnalogTimePickerState analogTimePickerState, androidx.compose.ui.b bVar, c6d c6dVar, boolean z, int i2, int i3, androidx.compose.p004runtime.d dVar, int i4) throws NoWhenBranchMatchedException {
        g0(analogTimePickerState, bVar, c6dVar, z, dVar, saa.a(i2 | 1), i3);
        return Unit.a;
    }

    public static final String i1(int i2, boolean z, int i3, androidx.compose.p004runtime.d dVar, int i4) {
        int iA;
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(194237364, i4, -1, "androidx.compose.material3.numberContentDescription (TimePicker.kt:2019)");
        }
        if (m2.f(i2, m2.INSTANCE.b())) {
            rbc.Companion companion = rbc.INSTANCE;
            iA = rbc.a(wz9.O);
        } else if (z) {
            rbc.Companion companion2 = rbc.INSTANCE;
            iA = rbc.a(wz9.K);
        } else {
            rbc.Companion companion3 = rbc.INSTANCE;
            iA = rbc.a(wz9.M);
        }
        String strC = vbc.c(iA, new Object[]{Integer.valueOf(i3)}, dVar, 0);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return strC;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void j0(final androidx.compose.ui.b bVar, final j7d j7dVar, final c6d c6dVar, final ej7 ej7Var, final xkb xkbVar, final xkb xkbVar2, androidx.compose.p004runtime.d dVar, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        xkb xkbVar3;
        androidx.compose.p004runtime.d dVarF = dVar.F(1374241901);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.x(bVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.x(c6dVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.x(ej7Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.x(xkbVar) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            xkbVar3 = xkbVar2;
            i3 |= dVarF.x(xkbVar3) ? 131072 : 65536;
        } else {
            xkbVar3 = xkbVar2;
        }
        if (dVarF.g((74899 & i3) != 74898, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1374241901, i3, -1, "androidx.compose.material3.PeriodToggleImpl (TimePicker.kt:1301)");
            }
            l7d l7dVar = l7d.a;
            BorderStroke borderStrokeA = pr0.a(l7dVar.o(), c6dVar.getPeriodSelectorBorderColor());
            xkb xkbVarI = ulb.i(l7dVar.k(), dVarF, 6);
            Intrinsics.h(xkbVarI, "null cannot be cast to non-null type androidx.compose.foundation.shape.CornerBasedShape");
            z92 z92Var = (z92) xkbVarI;
            rbc.Companion companion = rbc.INSTANCE;
            final String strB = vbc.b(rbc.a(wz9.P), dVarF, 0);
            boolean zX = dVarF.x(strB);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.n6d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.k0(strB, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarG = gr0.g(gdb.b(afb.d(bVar, false, (Function1) objR, 1, null)), borderStrokeA, z92Var);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, bVarG);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion2.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7Var, companion2.d());
            dud.i(dVarC, gs1VarJ, companion2.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion2.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion2.e());
            boolean z = !g1(j7dVar);
            int i4 = i3 & 112;
            boolean z2 = i4 == 32 || ((i3 & 64) != 0 && dVarF.T(j7dVar));
            Object objR2 = dVarF.R();
            if (z2 || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR2 = new Function0() { // from class: com.google.android.o6d
                    public final Object invoke() {
                        return TimePickerKt.l0(j7dVar);
                    }
                };
                dVarF.L(objR2);
            }
            op1 op1Var = op1.a;
            int i5 = (i3 << 3) & 7168;
            v0(z, xkbVar, (Function0) objR2, c6dVar, op1Var.b(), dVarF, ((i3 >> 9) & 112) | 24576 | i5);
            qzb.a(BackgroundKt.d(SizeKt.f(ape.a(pn6.b(androidx.compose.ui.b.INSTANCE, "Spacer"), 2.0f), 0.0f, 1, null), c6dVar.getPeriodSelectorBorderColor(), null, 2, null), dVarF, 0);
            boolean z3 = false;
            boolean zG1 = g1(j7dVar);
            if (i4 == 32 || ((i3 & 64) != 0 && dVarF.T(j7dVar))) {
                z3 = true;
            }
            Object objR3 = dVarF.R();
            if (z3 || objR3 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR3 = new Function0() { // from class: com.google.android.q6d
                    public final Object invoke() {
                        return TimePickerKt.m0(j7dVar);
                    }
                };
                dVarF.L(objR3);
            }
            v0(zG1, xkbVar3, (Function0) objR3, c6dVar, op1Var.a(), dVarF, ((i3 >> 12) & 112) | 24576 | i5);
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.r6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.n0(bVar, j7dVar, c6dVar, ej7Var, xkbVar, xkbVar2, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:35:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object j1(AnalogTimePickerState analogTimePickerState, float f2, float f3, float f4, boolean z, long j2, kr<Float> krVar, q22<? super Unit> q22Var) {
        TimePickerKt$onTap$1 timePickerKt$onTap$1;
        float f5;
        float fRint;
        AnalogTimePickerState analogTimePickerState2;
        boolean z2;
        AnalogTimePickerState analogTimePickerState3;
        if (q22Var instanceof TimePickerKt$onTap$1) {
            timePickerKt$onTap$1 = (TimePickerKt$onTap$1) q22Var;
            int i2 = timePickerKt$onTap$1.label;
            if ((i2 & t04.INVALID_ID) != 0) {
                timePickerKt$onTap$1.label = i2 - t04.INVALID_ID;
            } else {
                timePickerKt$onTap$1 = new TimePickerKt$onTap$1(q22Var);
            }
        } else {
            timePickerKt$onTap$1 = new TimePickerKt$onTap$1(q22Var);
        }
        TimePickerKt$onTap$1 timePickerKt$onTap$2 = timePickerKt$onTap$1;
        Object obj = timePickerKt$onTap$2.result;
        Object objG = kotlin.coroutines.intrinsics.a.g();
        int i3 = timePickerKt$onTap$2.label;
        if (i3 != 0) {
            if (i3 == 1) {
                z2 = timePickerKt$onTap$2.Z$0;
                AnalogTimePickerState analogTimePickerState4 = (AnalogTimePickerState) timePickerKt$onTap$2.L$0;
                kotlin.f.b(obj);
                analogTimePickerState2 = analogTimePickerState4;
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z2 = timePickerKt$onTap$2.Z$0;
                analogTimePickerState3 = (AnalogTimePickerState) timePickerKt$onTap$2.L$0;
                kotlin.f.b(obj);
            }
            analogTimePickerState2 = analogTimePickerState3;
            if (z2) {
                analogTimePickerState2.b(m2.INSTANCE.b());
            }
            return Unit.a;
        }
        kotlin.f.b(obj);
        float fY0 = Y0(f3 - g16.l(j2), f2 - g16.k(j2));
        if (m2.f(analogTimePickerState.c(), m2.INSTANCE.b())) {
            f5 = 0.10471976f;
            fRint = ((float) Math.rint((fY0 / 0.10471976f) / 5.0f)) * 5.0f;
        } else {
            f5 = 0.5235988f;
            fRint = (float) Math.rint(fY0 / 0.5235988f);
        }
        float f6 = fRint * f5;
        h1(analogTimePickerState, f2, f3, f4, j2);
        timePickerKt$onTap$2.L$0 = analogTimePickerState;
        timePickerKt$onTap$2.Z$0 = z;
        timePickerKt$onTap$2.label = 1;
        if (analogTimePickerState.A(f6, krVar, true, timePickerKt$onTap$2) != objG) {
            analogTimePickerState2 = analogTimePickerState;
            z2 = z;
        }
        return objG;
        if (m2.f(analogTimePickerState2.c(), m2.INSTANCE.a()) && z2) {
            timePickerKt$onTap$2.L$0 = analogTimePickerState2;
            timePickerKt$onTap$2.Z$0 = z2;
            timePickerKt$onTap$2.label = 2;
            if (DelayKt.b(100L, timePickerKt$onTap$2) != objG) {
                analogTimePickerState3 = analogTimePickerState2;
                analogTimePickerState2 = analogTimePickerState3;
            }
            return objG;
        }
        if (z2) {
            analogTimePickerState2.b(m2.INSTANCE.b());
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(String str, nfb nfbVar) {
        SemanticsPropertiesKt.F0(nfbVar, true);
        SemanticsPropertiesKt.b0(nfbVar, str);
        return Unit.a;
    }

    public static final j7d k1(final int i2, final int i3, final boolean z, androidx.compose.p004runtime.d dVar, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i2 = 0;
        }
        if ((i5 & 2) != 0) {
            i3 = 0;
        }
        if ((i5 & 4) != 0) {
            z = o5d.a(dVar, 0);
        }
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.o(1237715277, i4, -1, "androidx.compose.material3.rememberTimePickerState (TimePicker.kt:587)");
        }
        Object[] objArr = new Object[0];
        k0b<o2, ?> k0bVarC = o2.INSTANCE.c();
        boolean z2 = true;
        boolean z3 = ((((i4 & 14) ^ 6) > 4 && dVar.C(i2)) || (i4 & 6) == 4) | ((((i4 & 112) ^ 48) > 32 && dVar.C(i3)) || (i4 & 48) == 32);
        if ((((i4 & 896) ^ 384) <= 256 || !dVar.A(z)) && (i4 & 384) != 256) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objR = dVar.R();
        if (z4 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
            objR = new Function0() { // from class: com.google.android.p6d
                public final Object invoke() {
                    return TimePickerKt.l1(i2, i3, z);
                }
            };
            dVar.L(objR);
        }
        o2 o2Var = (o2) dfa.k(objArr, k0bVarC, (Function0) objR, dVar, 0);
        if (androidx.compose.p004runtime.e.k()) {
            androidx.compose.p004runtime.e.n();
        }
        return o2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(j7d j7dVar) {
        if (g1(j7dVar)) {
            j7dVar.d(j7dVar.a() - 12);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o2 l1(int i2, int i3, boolean z) {
        return new o2(i2, i3, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(j7d j7dVar) {
        if (!g1(j7dVar)) {
            j7dVar.d(j7dVar.a() + 12);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit n0(androidx.compose.ui.b bVar, j7d j7dVar, c6d c6dVar, ej7 ej7Var, xkb xkbVar, xkb xkbVar2, int i2, androidx.compose.p004runtime.d dVar, int i3) throws NoWhenBranchMatchedException {
        j0(bVar, j7dVar, c6dVar, ej7Var, xkbVar, xkbVar2, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:101:0x0150  */
    /* JADX WARN: Code duplicated, block: B:107:0x015d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0167  */
    /* JADX WARN: Code duplicated, block: B:112:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x0187  */
    /* JADX WARN: Code duplicated, block: B:116:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:121:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:124:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0051  */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x006c  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:69:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00be  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x0100  */
    /* JADX WARN: Code duplicated, block: B:87:0x010e  */
    /* JADX WARN: Code duplicated, block: B:93:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    public static final void o0(final j7d j7dVar, androidx.compose.ui.b bVar, c6d c6dVar, int i2, androidx.compose.p004runtime.d dVar, final int i3, final int i4) throws NoWhenBranchMatchedException {
        int i5;
        androidx.compose.ui.b bVar2;
        c6d c6dVar2;
        int i6;
        boolean z;
        androidx.compose.p004runtime.d dVar2;
        final androidx.compose.ui.b bVar3;
        final c6d c6dVar3;
        final int i7;
        s6b s6bVarH;
        androidx.compose.ui.b bVar4;
        c6d c6dVarA;
        int i8;
        c6d c6dVar4;
        int iC;
        q6c<Boolean> q6cVarN;
        Object objR;
        androidx.compose.p004runtime.d.Companion companion;
        aca acaVar;
        int i9;
        boolean z2;
        Object objR2;
        AnalogTimePickerState analogTimePickerState;
        boolean z3;
        boolean z4;
        Object objR3;
        c6d c6dVar5;
        androidx.compose.ui.b bVar5;
        androidx.compose.p004runtime.d dVarF = dVar.F(-619286452);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        int i10 = i4 & 2;
        if (i10 == 0) {
            if ((i3 & 48) == 0) {
                bVar2 = bVar;
                i5 |= dVarF.x(bVar2) ? 32 : 16;
            }
            if ((i3 & 384) == 0) {
                if ((i4 & 4) == 0) {
                    c6dVar2 = c6dVar;
                    int i11 = dVarF.x(c6dVar2) ? 256 : 128;
                    i5 |= i11;
                } else {
                    c6dVar2 = c6dVar;
                }
                i5 |= i11;
            } else {
                c6dVar2 = c6dVar;
            }
            if ((i3 & 3072) == 0) {
                if ((i4 & 8) == 0) {
                    i6 = i2;
                    int i12 = dVarF.C(i6) ? 2048 : 1024;
                    i5 |= i12;
                } else {
                    i6 = i2;
                }
                i5 |= i12;
            } else {
                i6 = i2;
            }
            if ((i5 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (dVarF.g(z, i5 & 1)) {
                dVarF.U();
                if ((i3 & 1) != 0 || dVarF.t()) {
                    if (i10 != 0) {
                        bVar4 = androidx.compose.ui.b.INSTANCE;
                    } else {
                        bVar4 = bVar2;
                    }
                    if ((i4 & 4) != 0) {
                        c6dVarA = d6d.a.a(dVarF, 6);
                        i5 &= -897;
                    } else {
                        c6dVarA = c6dVar2;
                    }
                    if ((i4 & 8) != 0) {
                        i8 = i5 & (-7169);
                        c6dVar4 = c6dVarA;
                        iC = d6d.a.c(dVarF, 6);
                    } else {
                        i8 = i5;
                        c6dVar4 = c6dVarA;
                    }
                    dVarF.M();
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.o(-619286452, i8, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
                    }
                    q6cVarN = b7.n(false, false, false, dVarF, 0, 7);
                    objR = dVarF.R();
                    companion = androidx.compose.p004runtime.d.INSTANCE;
                    if (objR == companion.a()) {
                        objR = new aca();
                        dVarF.L(objR);
                    }
                    acaVar = (aca) objR;
                    i9 = i8 & 14;
                    if (i9 != 4 || ((i8 & 8) != 0 && dVarF.x(j7dVar))) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objR2 = dVarF.R();
                    if (z2 || objR2 == companion.a()) {
                        objR2 = new AnalogTimePickerState(j7dVar, acaVar);
                        dVarF.L(objR2);
                    }
                    analogTimePickerState = (AnalogTimePickerState) objR2;
                    Integer numValueOf = Integer.valueOf(j7dVar.a());
                    Integer numValueOf2 = Integer.valueOf(j7dVar.f());
                    boolean zT = dVarF.T(acaVar) | dVarF.T(analogTimePickerState);
                    if (i9 != 4 || ((i8 & 8) != 0 && dVarF.T(j7dVar))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    z4 = zT | z3;
                    objR3 = dVarF.R();
                    if (z4 || objR3 == companion.a()) {
                        objR3 = new C0210TimePickerKt$TimePicker$1$1(acaVar, analogTimePickerState, j7dVar, null);
                        dVarF.L(objR3);
                    }
                    vn3.f(numValueOf, numValueOf2, (Function2) objR3, dVarF, 0);
                    if (l2.d(iC, l2.INSTANCE.b())) {
                        dVarF.y(2017551219);
                        c6dVar5 = c6dVar4;
                        bVar5 = bVar4;
                        C0(analogTimePickerState, bVar5, c6dVar5, !p0(q6cVarN), dVarF, i8 & 1008, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    } else {
                        c6dVar5 = c6dVar4;
                        bVar5 = bVar4;
                        dVarF.y(2017750673);
                        g0(analogTimePickerState, bVar5, c6dVar5, !p0(q6cVarN), dVarF, i8 & 1008, 0);
                        dVar2 = dVarF;
                        dVar2.u();
                    }
                    if (androidx.compose.p004runtime.e.k()) {
                        androidx.compose.p004runtime.e.n();
                    }
                    bVar3 = bVar5;
                    c6dVar3 = c6dVar5;
                    i7 = iC;
                } else {
                    dVarF.q();
                    if ((i4 & 4) != 0) {
                        i5 &= -897;
                    }
                    if ((i4 & 8) != 0) {
                        i5 &= -7169;
                    }
                    i8 = i5;
                    bVar4 = bVar2;
                    c6dVar4 = c6dVar2;
                }
                iC = i6;
                dVarF.M();
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.o(-619286452, i8, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
                }
                q6cVarN = b7.n(false, false, false, dVarF, 0, 7);
                objR = dVarF.R();
                companion = androidx.compose.p004runtime.d.INSTANCE;
                if (objR == companion.a()) {
                    objR = new aca();
                    dVarF.L(objR);
                }
                acaVar = (aca) objR;
                i9 = i8 & 14;
                if (i9 != 4) {
                    z2 = true;
                } else {
                    z2 = true;
                }
                objR2 = dVarF.R();
                if (z2) {
                    objR2 = new AnalogTimePickerState(j7dVar, acaVar);
                    dVarF.L(objR2);
                } else {
                    objR2 = new AnalogTimePickerState(j7dVar, acaVar);
                    dVarF.L(objR2);
                }
                analogTimePickerState = (AnalogTimePickerState) objR2;
                Integer numValueOf3 = Integer.valueOf(j7dVar.a());
                Integer numValueOf4 = Integer.valueOf(j7dVar.f());
                boolean zT2 = dVarF.T(acaVar) | dVarF.T(analogTimePickerState);
                if (i9 != 4) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                z4 = zT2 | z3;
                objR3 = dVarF.R();
                if (z4) {
                    objR3 = new C0210TimePickerKt$TimePicker$1$1(acaVar, analogTimePickerState, j7dVar, null);
                    dVarF.L(objR3);
                } else {
                    objR3 = new C0210TimePickerKt$TimePicker$1$1(acaVar, analogTimePickerState, j7dVar, null);
                    dVarF.L(objR3);
                }
                vn3.f(numValueOf3, numValueOf4, (Function2) objR3, dVarF, 0);
                if (l2.d(iC, l2.INSTANCE.b())) {
                    dVarF.y(2017551219);
                    c6dVar5 = c6dVar4;
                    bVar5 = bVar4;
                    C0(analogTimePickerState, bVar5, c6dVar5, !p0(q6cVarN), dVarF, i8 & 1008, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                } else {
                    c6dVar5 = c6dVar4;
                    bVar5 = bVar4;
                    dVarF.y(2017750673);
                    g0(analogTimePickerState, bVar5, c6dVar5, !p0(q6cVarN), dVarF, i8 & 1008, 0);
                    dVar2 = dVarF;
                    dVar2.u();
                }
                if (androidx.compose.p004runtime.e.k()) {
                    androidx.compose.p004runtime.e.n();
                }
                bVar3 = bVar5;
                c6dVar3 = c6dVar5;
                i7 = iC;
            } else {
                dVar2 = dVarF;
                dVar2.q();
                bVar3 = bVar2;
                c6dVar3 = c6dVar2;
                i7 = i6;
            }
            s6bVarH = dVar2.H();
            if (s6bVarH != null) {
                s6bVarH.a(new Function2() { // from class: com.google.android.e6d
                    public final Object invoke(Object obj, Object obj2) {
                        return TimePickerKt.q0(j7dVar, bVar3, c6dVar3, i7, i3, i4, (d) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i5 |= 48;
        bVar2 = bVar;
        if ((i3 & 384) == 0) {
            if ((i4 & 4) == 0) {
                c6dVar2 = c6dVar;
                if (dVarF.x(c6dVar2)) {
                }
                i5 |= i11;
            } else {
                c6dVar2 = c6dVar;
            }
            i5 |= i11;
        } else {
            c6dVar2 = c6dVar;
        }
        if ((i3 & 3072) == 0) {
            if ((i4 & 8) == 0) {
                i6 = i2;
                if (dVarF.C(i6)) {
                }
                i5 |= i12;
            } else {
                i6 = i2;
            }
            i5 |= i12;
        } else {
            i6 = i2;
        }
        if ((i5 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (dVarF.g(z, i5 & 1)) {
            dVarF.U();
            if ((i3 & 1) != 0) {
                if (i10 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i4 & 4) != 0) {
                    c6dVarA = d6d.a.a(dVarF, 6);
                    i5 &= -897;
                } else {
                    c6dVarA = c6dVar2;
                }
                if ((i4 & 8) != 0) {
                    i8 = i5 & (-7169);
                    c6dVar4 = c6dVarA;
                    iC = d6d.a.c(dVarF, 6);
                } else {
                    i8 = i5;
                    c6dVar4 = c6dVarA;
                    iC = i6;
                }
            } else {
                if (i10 != 0) {
                    bVar4 = androidx.compose.ui.b.INSTANCE;
                } else {
                    bVar4 = bVar2;
                }
                if ((i4 & 4) != 0) {
                    c6dVarA = d6d.a.a(dVarF, 6);
                    i5 &= -897;
                } else {
                    c6dVarA = c6dVar2;
                }
                if ((i4 & 8) != 0) {
                    i8 = i5 & (-7169);
                    c6dVar4 = c6dVarA;
                    iC = d6d.a.c(dVarF, 6);
                } else {
                    i8 = i5;
                    c6dVar4 = c6dVarA;
                    iC = i6;
                }
            }
            dVarF.M();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-619286452, i8, -1, "androidx.compose.material3.TimePicker (TimePicker.kt:224)");
            }
            q6cVarN = b7.n(false, false, false, dVarF, 0, 7);
            objR = dVarF.R();
            companion = androidx.compose.p004runtime.d.INSTANCE;
            if (objR == companion.a()) {
                objR = new aca();
                dVarF.L(objR);
            }
            acaVar = (aca) objR;
            i9 = i8 & 14;
            if (i9 != 4) {
                z2 = true;
            } else {
                z2 = true;
            }
            objR2 = dVarF.R();
            if (z2) {
                objR2 = new AnalogTimePickerState(j7dVar, acaVar);
                dVarF.L(objR2);
            } else {
                objR2 = new AnalogTimePickerState(j7dVar, acaVar);
                dVarF.L(objR2);
            }
            analogTimePickerState = (AnalogTimePickerState) objR2;
            Integer numValueOf5 = Integer.valueOf(j7dVar.a());
            Integer numValueOf6 = Integer.valueOf(j7dVar.f());
            boolean zT3 = dVarF.T(acaVar) | dVarF.T(analogTimePickerState);
            if (i9 != 4) {
                z3 = true;
            } else {
                z3 = true;
            }
            z4 = zT3 | z3;
            objR3 = dVarF.R();
            if (z4) {
                objR3 = new C0210TimePickerKt$TimePicker$1$1(acaVar, analogTimePickerState, j7dVar, null);
                dVarF.L(objR3);
            } else {
                objR3 = new C0210TimePickerKt$TimePicker$1$1(acaVar, analogTimePickerState, j7dVar, null);
                dVarF.L(objR3);
            }
            vn3.f(numValueOf5, numValueOf6, (Function2) objR3, dVarF, 0);
            if (l2.d(iC, l2.INSTANCE.b())) {
                dVarF.y(2017551219);
                c6dVar5 = c6dVar4;
                bVar5 = bVar4;
                C0(analogTimePickerState, bVar5, c6dVar5, !p0(q6cVarN), dVarF, i8 & 1008, 0);
                dVar2 = dVarF;
                dVar2.u();
            } else {
                c6dVar5 = c6dVar4;
                bVar5 = bVar4;
                dVarF.y(2017750673);
                g0(analogTimePickerState, bVar5, c6dVar5, !p0(q6cVarN), dVarF, i8 & 1008, 0);
                dVar2 = dVarF;
                dVar2.u();
            }
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
            bVar3 = bVar5;
            c6dVar3 = c6dVar5;
            i7 = iC;
        } else {
            dVar2 = dVarF;
            dVar2.q();
            bVar3 = bVar2;
            c6dVar3 = c6dVar2;
            i7 = i6;
        }
        s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.e6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.q0(j7dVar, bVar3, c6dVar3, i7, i3, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean p0(q6c<Boolean> q6cVar) {
        return q6cVar.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit q0(j7d j7dVar, androidx.compose.ui.b bVar, c6d c6dVar, int i2, int i3, int i4, androidx.compose.p004runtime.d dVar, int i5) throws NoWhenBranchMatchedException {
        o0(j7dVar, bVar, c6dVar, i2, dVar, saa.a(i3 | 1), i4);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void r0(final androidx.compose.ui.b bVar, final int i2, final j7d j7dVar, final int i3, final c6d c6dVar, androidx.compose.p004runtime.d dVar, final int i4) throws NoWhenBranchMatchedException {
        int i5;
        androidx.compose.p004runtime.d dVar2;
        int iA;
        androidx.compose.p004runtime.d dVarF = dVar.F(-1148055889);
        if ((i4 & 6) == 0) {
            i5 = (dVarF.x(bVar) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= dVarF.C(i2) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= (i4 & 512) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i5 |= dVarF.C(i3) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i5 |= dVarF.x(c6dVar) ? 16384 : 8192;
        }
        if (dVarF.g((i5 & 9363) != 9362, i5 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(-1148055889, i5, -1, "androidx.compose.material3.TimeSelector (TimePicker.kt:1403)");
            }
            boolean zF = m2.f(j7dVar.c(), i3);
            if (m2.f(i3, m2.INSTANCE.a())) {
                rbc.Companion companion = rbc.INSTANCE;
                iA = rbc.a(wz9.L);
            } else {
                rbc.Companion companion2 = rbc.INSTANCE;
                iA = rbc.a(wz9.N);
            }
            final String strB = vbc.b(iA, dVarF, 0);
            long jG = c6dVar.g(zF);
            long jH = c6dVar.h(zF);
            boolean zX = dVarF.x(strB);
            Object objR = dVarF.R();
            if (zX || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.i6d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.s0(strB, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            androidx.compose.ui.b bVarC = afb.c(bVar, true, (Function1) objR);
            xkb xkbVarI = ulb.i(l7d.a.v(), dVarF, 6);
            boolean z = ((i5 & 7168) == 2048) | ((i5 & 896) == 256 || ((i5 & 512) != 0 && dVarF.T(j7dVar)));
            Object objR2 = dVarF.R();
            if (z || objR2 == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR2 = new Function0() { // from class: com.google.android.j6d
                    public final Object invoke() {
                        return TimePickerKt.t0(i3, j7dVar);
                    }
                };
                dVarF.L(objR2);
            }
            dVar2 = dVarF;
            afc.d(zF, (Function0) objR2, bVarC, false, xkbVarI, jG, 0L, 0.0f, 0.0f, null, null, ko1.e(-1477282471, true, new e(i3, j7dVar, i2, jH), dVarF, 54), dVar2, 0, 48, 1992);
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.k6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.u0(bVar, i2, j7dVar, i3, c6dVar, i4, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(String str, nfb nfbVar) {
        SemanticsPropertiesKt.p0(nfbVar, hpa.INSTANCE.f());
        SemanticsPropertiesKt.b0(nfbVar, str);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(int i2, j7d j7dVar) {
        if (!m2.f(i2, j7dVar.c())) {
            j7dVar.b(i2);
        }
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit u0(androidx.compose.ui.b bVar, int i2, j7d j7dVar, int i3, c6d c6dVar, int i4, androidx.compose.p004runtime.d dVar, int i5) throws NoWhenBranchMatchedException {
        r0(bVar, i2, j7dVar, i3, c6dVar, dVar, saa.a(i4 | 1));
        return Unit.a;
    }

    private static final void v0(final boolean z, final xkb xkbVar, final Function0<Unit> function0, final c6d c6dVar, final ps4<? super hra, ? super androidx.compose.p004runtime.d, ? super Integer, Unit> ps4Var, androidx.compose.p004runtime.d dVar, final int i2) {
        int i3;
        androidx.compose.p004runtime.d dVar2;
        androidx.compose.p004runtime.d dVarF = dVar.F(1523811083);
        if ((i2 & 6) == 0) {
            i3 = (dVarF.A(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(xkbVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= dVarF.T(function0) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= dVarF.x(c6dVar) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= dVarF.T(ps4Var) ? 16384 : 8192;
        }
        if (dVarF.g((i3 & 9363) != 9362, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(1523811083, i3, -1, "androidx.compose.material3.ToggleItem (TimePicker.kt:1359)");
            }
            long jF = c6dVar.f(z);
            long jE = c6dVar.e(z);
            androidx.compose.ui.b bVarF = SizeKt.f(ape.a(androidx.compose.ui.b.INSTANCE, z ? 0.0f : 1.0f), 0.0f, 1, null);
            boolean z2 = (i3 & 14) == 4;
            Object objR = dVarF.R();
            if (z2 || objR == androidx.compose.p004runtime.d.INSTANCE.a()) {
                objR = new Function1() { // from class: com.google.android.y6d
                    public final Object invoke(Object obj) {
                        return TimePickerKt.w0(z, (nfb) obj);
                    }
                };
                dVarF.L(objR);
            }
            by0.j(function0, afb.d(bVarF, false, (Function1) objR, 1, null), false, xkbVar, wx0.a.s(jE, jF, 0L, 0L, dVarF, 24576, 12), null, null, nx8.e(ff3.i(0)), null, ps4Var, dVarF, ((i3 >> 6) & 14) | 12582912 | ((i3 << 6) & 7168) | ((i3 << 15) & 1879048192), 356);
            dVar2 = dVarF;
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVar2 = dVarF;
            dVar2.q();
        }
        s6b s6bVarH = dVar2.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.z6d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.x0(z, xkbVar, function0, c6dVar, ps4Var, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(boolean z, nfb nfbVar) {
        SemanticsPropertiesKt.q0(nfbVar, z);
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(boolean z, xkb xkbVar, Function0 function0, c6d c6dVar, ps4 ps4Var, int i2, androidx.compose.p004runtime.d dVar, int i3) {
        v0(z, xkbVar, function0, c6dVar, ps4Var, dVar, saa.a(i2 | 1));
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private static final void y0(final j7d j7dVar, final c6d c6dVar, androidx.compose.p004runtime.d dVar, final int i2) throws NoWhenBranchMatchedException {
        int i3;
        androidx.compose.p004runtime.d dVarF = dVar.F(2054675515);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? dVarF.x(j7dVar) : dVarF.T(j7dVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= dVarF.x(c6dVar) ? 32 : 16;
        }
        if (dVarF.g((i3 & 19) != 18, i3 & 1)) {
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.o(2054675515, i3, -1, "androidx.compose.material3.VerticalClockDisplay (TimePicker.kt:1153)");
            }
            androidx.compose.foundation.layout.c.f fVarE = androidx.compose.p001foundation.layout.c.a.e();
            androidx.compose.ui.b.Companion companion = androidx.compose.ui.b.INSTANCE;
            tc.Companion companion2 = tc.INSTANCE;
            ej7 ej7VarB = t0.b(fVarE, companion2.l(), dVarF, 6);
            int iA = pp1.a(dVarF, 0);
            gs1 gs1VarJ = dVarF.j();
            androidx.compose.ui.b bVarE = ComposedModifierKt.e(dVarF, companion);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> function0B = companion3.b();
            if (dVarF.G() == null) {
                pp1.d();
            }
            dVarF.o();
            if (dVarF.getInserting()) {
                dVarF.W(function0B);
            } else {
                dVarF.k();
            }
            androidx.compose.p004runtime.d dVarC = dud.c(dVarF);
            dud.i(dVarC, ej7VarB, companion3.d());
            dud.i(dVarC, gs1VarJ, companion3.f());
            Function2<ComposeUiNode, Integer, Unit> function2C = companion3.c();
            if (dVarC.getInserting() || !Intrinsics.e(dVarC.R(), Integer.valueOf(iA))) {
                dVarC.L(Integer.valueOf(iA));
                dVarC.e(Integer.valueOf(iA), function2C);
            }
            dud.i(dVarC, bVarE, companion3.e());
            ira iraVar = ira.a;
            H(j7dVar, c6dVar, dVarF, i3 & 126);
            if (j7dVar.getIs24hour()) {
                dVarF.y(1364727499);
                dVarF.u();
            } else {
                dVarF.y(1364287361);
                androidx.compose.ui.b bVarR = nx8.r(companion, m, 0.0f, 0.0f, 0.0f, 14, null);
                ej7 ej7VarI = androidx.compose.p001foundation.layout.j.i(companion2.o(), false);
                int iA2 = pp1.a(dVarF, 0);
                gs1 gs1VarJ2 = dVarF.j();
                androidx.compose.ui.b bVarE2 = ComposedModifierKt.e(dVarF, bVarR);
                Function0<ComposeUiNode> function0B2 = companion3.b();
                if (dVarF.G() == null) {
                    pp1.d();
                }
                dVarF.o();
                if (dVarF.getInserting()) {
                    dVarF.W(function0B2);
                } else {
                    dVarF.k();
                }
                androidx.compose.p004runtime.d dVarC2 = dud.c(dVarF);
                dud.i(dVarC2, ej7VarI, companion3.d());
                dud.i(dVarC2, gs1VarJ2, companion3.f());
                Function2<ComposeUiNode, Integer, Unit> function2C2 = companion3.c();
                if (dVarC2.getInserting() || !Intrinsics.e(dVarC2.R(), Integer.valueOf(iA2))) {
                    dVarC2.L(Integer.valueOf(iA2));
                    dVarC2.e(Integer.valueOf(iA2), function2C2);
                }
                dud.i(dVarC2, bVarE2, companion3.e());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.a;
                l7d l7dVar = l7d.a;
                int i4 = i3 << 3;
                A0(SizeKt.v(companion, l7dVar.t(), l7dVar.s()), j7dVar, c6dVar, dVarF, 6 | (i4 & 112) | (i4 & 896));
                dVarF.m();
                dVarF.u();
            }
            dVarF.m();
            if (androidx.compose.p004runtime.e.k()) {
                androidx.compose.p004runtime.e.n();
            }
        } else {
            dVarF.q();
        }
        s6b s6bVarH = dVarF.H();
        if (s6bVarH != null) {
            s6bVarH.a(new Function2() { // from class: com.google.android.g7d
                public final Object invoke(Object obj, Object obj2) {
                    return TimePickerKt.z0(j7dVar, c6dVar, i2, (d) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit z0(j7d j7dVar, c6d c6dVar, int i2, androidx.compose.p004runtime.d dVar, int i3) throws NoWhenBranchMatchedException {
        y0(j7dVar, c6dVar, dVar, saa.a(i2 | 1));
        return Unit.a;
    }
}
