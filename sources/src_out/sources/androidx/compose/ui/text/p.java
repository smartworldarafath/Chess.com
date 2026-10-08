package androidx.compose.ui.text;

import androidx.compose.ui.text.ParagraphStyle;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.UrlAnnotation;
import androidx.compose.ui.text.VerbatimTtsAnnotation;
import androidx.compose.ui.text.b;
import androidx.compose.ui.text.f;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.t;
import androidx.compose.ui.text.font.u;
import androidx.compose.ui.text.p;
import androidx.compose.ui.text.x;
import com.google.inputmethod.LineHeightStyle;
import com.google.inputmethod.LocaleList;
import com.google.inputmethod.Shadow;
import com.google.inputmethod.TextGeometricTransform;
import com.google.inputmethod.TextIndent;
import com.google.inputmethod.b0d;
import com.google.inputmethod.c0d;
import com.google.inputmethod.cpc;
import com.google.inputmethod.d0d;
import com.google.inputmethod.d27;
import com.google.inputmethod.dsc;
import com.google.inputmethod.e77;
import com.google.inputmethod.ei1;
import com.google.inputmethod.k0b;
import com.google.inputmethod.ki1;
import com.google.inputmethod.myc;
import com.google.inputmethod.n0b;
import com.google.inputmethod.o0b;
import com.google.inputmethod.qi5;
import com.google.inputmethod.rn8;
import com.google.inputmethod.ryc;
import com.google.inputmethod.wg0;
import com.google.inputmethod.wi8;
import com.google.inputmethod.wrc;
import com.google.inputmethod.zyc;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ø\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aO\u0010\t\u001a\u00020\u0003\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0004*\u00020\u00032\b\u0010\u0005\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0006\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0004*\u00020\u00032\u001a\u0010\f\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a!\u0010\u0012\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0005\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\"&\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\".\u0010\u001d\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b0\u001a\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0016\".\u0010!\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u001b\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u0012\u0004\b\u001f\u0010 \" \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0016\"&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\f\n\u0004\b&\u0010\u0016\u0012\u0004\b'\u0010 \" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0016\" \u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010\u0016\"&\u00102\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010\u0016\u001a\u0004\b1\u0010\u0018\"&\u00106\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b4\u0010\u0016\u001a\u0004\b5\u0010\u0018\"&\u0010:\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b8\u0010\u0016\u001a\u0004\b9\u0010\u0018\" \u0010=\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0016\" \u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010\u0016\" \u0010C\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0016\" \u0010F\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0016\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0016\" \u0010L\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010\u0016\" \u0010O\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0016\" \u0010S\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R\" \u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010R\" \u0010Y\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010R\" \u0010\\\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010R\"&\u0010`\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010\u0016\u001a\u0004\b_\u0010\u0018\"&\u0010d\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bb\u0010\u0016\u001a\u0004\bc\u0010\u0018\" \u0010g\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010R\"&\u0010l\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00030\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bi\u0010R\u001a\u0004\bj\u0010k\" \u0010o\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010R\" \u0010r\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010\u0016\" \u0010u\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010\u0016\" \u0010x\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u00030\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010\u0016\" \u0010{\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010R\" \u0010~\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010R\"\"\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u00030\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010R\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020;\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0082\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0086\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020A\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0089\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020D\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u008c\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u008d\u0001\u0010\u008e\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u008f\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020J\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0092\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0093\u0001\u0010\u0094\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020M\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0095\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u0098\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u009b\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u009e\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020Z\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¡\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010£\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020]\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¤\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¥\u0001\u0010¦\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020a\u0012\u0004\u0012\u00020\u00030\u0000*\u00030§\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¨\u0001\u0010©\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020e\u0012\u0004\u0012\u00020\u00030\u0000*\u00030ª\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0001\u0010¬\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\u00030\u0000*\u00030\u00ad\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\u00030\u0000*\u00030°\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020p\u0012\u0004\u0012\u00020\u00030\u0000*\u00030³\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b´\u0001\u0010µ\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020s\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¶\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020v\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¹\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bº\u0001\u0010»\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¼\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010¾\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\u00030\u0000*\u00030¿\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001\"(\u0010\u0085\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u007f\u0012\u0004\u0012\u00020\u00030\u0000*\u00030Â\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Ä\u0001¨\u0006Å\u0001"}, d2 = {"Lcom/google/android/k0b;", "T", "Original", "", "Saveable", "value", "saver", "Lcom/google/android/o0b;", "scope", "T1", "(Ljava/lang/Object;Lcom/google/android/k0b;Lcom/google/android/o0b;)Ljava/lang/Object;", "Lkotlin/Function2;", "save", "Lkotlin/Function1;", "restore", "Lcom/google/android/wi8;", "Q0", "(Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)Lcom/google/android/wi8;", "S1", "(Ljava/lang/Object;)Ljava/lang/Object;", "Landroidx/compose/ui/text/b;", "a", "Lcom/google/android/k0b;", "v1", "()Lcom/google/android/k0b;", "AnnotatedStringSaver", "", "Landroidx/compose/ui/text/b$d;", "b", "AnnotationRangeListSaver", "c", "getAnnotationRangeSaver$annotations", "()V", "AnnotationRangeSaver", "Landroidx/compose/ui/text/b0;", "d", "VerbatimTtsAnnotationSaver", "Landroidx/compose/ui/text/a0;", "e", "getUrlAnnotationSaver$annotations", "UrlAnnotationSaver", "Landroidx/compose/ui/text/f$b;", "f", "LinkSaver", "Landroidx/compose/ui/text/f$a;", "g", "ClickableSaver", "Landroidx/compose/ui/text/m;", "h", "getParagraphStyleSaver", "ParagraphStyleSaver", "Landroidx/compose/ui/text/r;", "i", "getSpanStyleSaver", "SpanStyleSaver", "Lcom/google/android/myc;", "j", "getTextLinkStylesSaver", "TextLinkStylesSaver", "Lcom/google/android/wrc;", "k", "TextDecorationSaver", "Lcom/google/android/hwc;", "l", "TextGeometricTransformSaver", "Lcom/google/android/owc;", "m", "TextIndentSaver", "Landroidx/compose/ui/text/font/x;", "n", "FontWeightSaver", "Lcom/google/android/wg0;", "o", "BaselineShiftSaver", "Landroidx/compose/ui/text/x;", "p", "TextRangeSaver", "Lcom/google/android/nkb;", "q", "ShadowSaver", "Lcom/google/android/ei1;", "r", "Lcom/google/android/wi8;", "ColorSaver", "Lcom/google/android/cpc;", "s", "TextAlignSaver", "Lcom/google/android/dsc;", "t", "TextDirectionSaver", "Lcom/google/android/qi5;", "u", "HyphensSaver", "Landroidx/compose/ui/text/font/t;", "v", "getFontStyleSaver", "FontStyleSaver", "Landroidx/compose/ui/text/font/u;", "w", "getFontSynthesisSaver", "FontSynthesisSaver", "Lcom/google/android/b0d;", "x", "TextUnitSaver", "Lcom/google/android/d0d;", "y", "getTextUnitTypeSaver", "()Lcom/google/android/wi8;", "TextUnitTypeSaver", "Lcom/google/android/rn8;", "z", "OffsetSaver", "Lcom/google/android/g77;", "A", "LocaleListSaver", "Lcom/google/android/e77;", "B", "LocaleSaver", "Lcom/google/android/g27;", "C", "LineHeightStyleSaver", "Lcom/google/android/g27$a;", "D", "LineHeightStyleAlignmentSaver", "Lcom/google/android/g27$d;", "E", "LineHeightStyleTrimSaver", "Lcom/google/android/g27$c;", "F", "LineHeightStyleModeSaver", "Lcom/google/android/wrc$a;", "M1", "(Lcom/google/android/wrc$a;)Lcom/google/android/k0b;", "Saver", "Lcom/google/android/hwc$a;", "O1", "(Lcom/google/android/hwc$a;)Lcom/google/android/k0b;", "Lcom/google/android/owc$a;", "P1", "(Lcom/google/android/owc$a;)Lcom/google/android/k0b;", "Landroidx/compose/ui/text/font/x$a;", "z1", "(Landroidx/compose/ui/text/font/x$a;)Lcom/google/android/k0b;", "Lcom/google/android/wg0$a;", "A1", "(Lcom/google/android/wg0$a;)Lcom/google/android/k0b;", "Landroidx/compose/ui/text/x$a;", "w1", "(Landroidx/compose/ui/text/x$a;)Lcom/google/android/k0b;", "Lcom/google/android/nkb$a;", "K1", "(Lcom/google/android/nkb$a;)Lcom/google/android/k0b;", "Lcom/google/android/ei1$a;", "B1", "(Lcom/google/android/ei1$a;)Lcom/google/android/k0b;", "Lcom/google/android/cpc$a;", "L1", "(Lcom/google/android/cpc$a;)Lcom/google/android/k0b;", "Lcom/google/android/dsc$a;", "N1", "(Lcom/google/android/dsc$a;)Lcom/google/android/k0b;", "Lcom/google/android/qi5$a;", "C1", "(Lcom/google/android/qi5$a;)Lcom/google/android/k0b;", "Landroidx/compose/ui/text/font/t$a;", "x1", "(Landroidx/compose/ui/text/font/t$a;)Lcom/google/android/k0b;", "Landroidx/compose/ui/text/font/u$a;", "y1", "(Landroidx/compose/ui/text/font/u$a;)Lcom/google/android/k0b;", "Lcom/google/android/b0d$a;", "Q1", "(Lcom/google/android/b0d$a;)Lcom/google/android/k0b;", "Lcom/google/android/d0d$a;", "R1", "(Lcom/google/android/d0d$a;)Lcom/google/android/k0b;", "Lcom/google/android/rn8$a;", "J1", "(Lcom/google/android/rn8$a;)Lcom/google/android/k0b;", "Lcom/google/android/g77$a;", "I1", "(Lcom/google/android/g77$a;)Lcom/google/android/k0b;", "Lcom/google/android/e77$a;", "H1", "(Lcom/google/android/e77$a;)Lcom/google/android/k0b;", "Lcom/google/android/g27$b;", "E1", "(Lcom/google/android/g27$b;)Lcom/google/android/k0b;", "Lcom/google/android/g27$a$a;", "D1", "(Lcom/google/android/g27$a$a;)Lcom/google/android/k0b;", "Lcom/google/android/g27$d$a;", "G1", "(Lcom/google/android/g27$d$a;)Lcom/google/android/k0b;", "Lcom/google/android/g27$c$a;", "F1", "(Lcom/google/android/g27$c$a;)Lcom/google/android/k0b;", "ui-text"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class p {
    private static final k0b<androidx.compose.ui.text.b, Object> a = n0b.e(new Function2() { // from class: com.google.android.p0b
        public final Object invoke(Object obj, Object obj2) {
            return p.k0((o0b) obj, (b) obj2);
        }
    }, new Function1() { // from class: com.google.android.r0b
        public final Object invoke(Object obj) {
            return p.l0(obj);
        }
    });
    private static final k0b<List<androidx.compose.ui.text.b.Range<? extends Object>>, Object> b = n0b.e(new Function2() { // from class: com.google.android.d1b
        public final Object invoke(Object obj, Object obj2) {
            return p.m0((o0b) obj, (List) obj2);
        }
    }, new Function1() { // from class: com.google.android.p1b
        public final Object invoke(Object obj) {
            return p.n0(obj);
        }
    });
    private static final k0b<androidx.compose.ui.text.b.Range<? extends Object>, Object> c = n0b.e(new Function2() { // from class: com.google.android.b2b
        public final Object invoke(Object obj, Object obj2) {
            return p.o0((o0b) obj, (b.Range) obj2);
        }
    }, new Function1() { // from class: com.google.android.n2b
        public final Object invoke(Object obj) {
            return p.p0(obj);
        }
    });
    private static final k0b<VerbatimTtsAnnotation, Object> d = n0b.e(new Function2() { // from class: com.google.android.q2b
        public final Object invoke(Object obj, Object obj2) {
            return p.t1((o0b) obj, (VerbatimTtsAnnotation) obj2);
        }
    }, new Function1() { // from class: com.google.android.r2b
        public final Object invoke(Object obj) {
            return p.u1(obj);
        }
    });
    private static final k0b<UrlAnnotation, Object> e = n0b.e(new Function2() { // from class: com.google.android.t2b
        public final Object invoke(Object obj, Object obj2) {
            return p.r1((o0b) obj, (UrlAnnotation) obj2);
        }
    }, new Function1() { // from class: com.google.android.u2b
        public final Object invoke(Object obj) {
            return p.s1(obj);
        }
    });
    private static final k0b<f.b, Object> f = n0b.e(new Function2() { // from class: com.google.android.a1b
        public final Object invoke(Object obj, Object obj2) {
            return p.K0((o0b) obj, (f.b) obj2);
        }
    }, new Function1() { // from class: com.google.android.l1b
        public final Object invoke(Object obj) {
            return p.L0(obj);
        }
    });
    private static final k0b<f.a, Object> g = n0b.e(new Function2() { // from class: com.google.android.w1b
        public final Object invoke(Object obj, Object obj2) {
            return p.s0((o0b) obj, (f.a) obj2);
        }
    }, new Function1() { // from class: com.google.android.h2b
        public final Object invoke(Object obj) {
            return p.t0(obj);
        }
    });
    private static final k0b<ParagraphStyle, Object> h = n0b.e(new Function2() { // from class: com.google.android.s2b
        public final Object invoke(Object obj, Object obj2) {
            return p.T0((o0b) obj, (ParagraphStyle) obj2);
        }
    }, new Function1() { // from class: com.google.android.v2b
        public final Object invoke(Object obj) {
            return p.U0(obj);
        }
    });
    private static final k0b<SpanStyle, Object> i = n0b.e(new Function2() { // from class: com.google.android.w2b
        public final Object invoke(Object obj, Object obj2) {
            return p.X0((o0b) obj, (SpanStyle) obj2);
        }
    }, new Function1() { // from class: com.google.android.x2b
        public final Object invoke(Object obj) {
            return p.Y0(obj);
        }
    });
    private static final k0b<myc, Object> j = n0b.e(new Function2() { // from class: com.google.android.y2b
        public final Object invoke(Object obj, Object obj2) {
            return p.j1((o0b) obj, (myc) obj2);
        }
    }, new Function1() { // from class: com.google.android.q0b
        public final Object invoke(Object obj) {
            return p.k1(obj);
        }
    });
    private static final k0b<wrc, Object> k = n0b.e(new Function2() { // from class: com.google.android.s0b
        public final Object invoke(Object obj, Object obj2) {
            return p.b1((o0b) obj, (wrc) obj2);
        }
    }, new Function1() { // from class: com.google.android.t0b
        public final Object invoke(Object obj) {
            return p.c1(obj);
        }
    });
    private static final k0b<TextGeometricTransform, Object> l = n0b.e(new Function2() { // from class: com.google.android.u0b
        public final Object invoke(Object obj, Object obj2) {
            return p.f1((o0b) obj, (TextGeometricTransform) obj2);
        }
    }, new Function1() { // from class: com.google.android.v0b
        public final Object invoke(Object obj) {
            return p.g1(obj);
        }
    });
    private static final k0b<TextIndent, Object> m = n0b.e(new Function2() { // from class: com.google.android.w0b
        public final Object invoke(Object obj, Object obj2) {
            return p.h1((o0b) obj, (TextIndent) obj2);
        }
    }, new Function1() { // from class: com.google.android.x0b
        public final Object invoke(Object obj) {
            return p.i1(obj);
        }
    });
    private static final k0b<FontWeight, Object> n = n0b.e(new Function2() { // from class: com.google.android.y0b
        public final Object invoke(Object obj, Object obj2) {
            return p.y0((o0b) obj, (FontWeight) obj2);
        }
    }, new Function1() { // from class: com.google.android.z0b
        public final Object invoke(Object obj) {
            return p.z0(obj);
        }
    });
    private static final k0b<wg0, Object> o = n0b.e(new Function2() { // from class: com.google.android.b1b
        public final Object invoke(Object obj, Object obj2) {
            return p.q0((o0b) obj, (wg0) obj2);
        }
    }, new Function1() { // from class: com.google.android.c1b
        public final Object invoke(Object obj) {
            return p.r0(obj);
        }
    });
    private static final k0b<x, Object> p = n0b.e(new Function2() { // from class: com.google.android.e1b
        public final Object invoke(Object obj, Object obj2) {
            return p.l1((o0b) obj, (x) obj2);
        }
    }, new Function1() { // from class: com.google.android.f1b
        public final Object invoke(Object obj) {
            return p.m1(obj);
        }
    });
    private static final k0b<Shadow, Object> q = n0b.e(new Function2() { // from class: com.google.android.g1b
        public final Object invoke(Object obj, Object obj2) {
            return p.V0((o0b) obj, (Shadow) obj2);
        }
    }, new Function1() { // from class: com.google.android.h1b
        public final Object invoke(Object obj) {
            return p.W0(obj);
        }
    });
    private static final wi8<ei1, Object> r = Q0(a.a, b.a);
    private static final wi8<cpc, Object> s = Q0(new Function2() { // from class: com.google.android.i1b
        public final Object invoke(Object obj, Object obj2) {
            return p.Z0((o0b) obj, (cpc) obj2);
        }
    }, new Function1() { // from class: com.google.android.j1b
        public final Object invoke(Object obj) {
            return p.a1(obj);
        }
    });
    private static final wi8<dsc, Object> t = Q0(new Function2() { // from class: com.google.android.k1b
        public final Object invoke(Object obj, Object obj2) {
            return p.d1((o0b) obj, (dsc) obj2);
        }
    }, new Function1() { // from class: com.google.android.m1b
        public final Object invoke(Object obj) {
            return p.e1(obj);
        }
    });
    private static final wi8<qi5, Object> u = Q0(new Function2() { // from class: com.google.android.n1b
        public final Object invoke(Object obj, Object obj2) {
            return p.A0((o0b) obj, (qi5) obj2);
        }
    }, new Function1() { // from class: com.google.android.o1b
        public final Object invoke(Object obj) {
            return p.B0(obj);
        }
    });
    private static final k0b<androidx.compose.ui.text.font.t, Object> v = n0b.e(new Function2() { // from class: com.google.android.q1b
        public final Object invoke(Object obj, Object obj2) {
            return p.u0((o0b) obj, (t) obj2);
        }
    }, new Function1() { // from class: com.google.android.r1b
        public final Object invoke(Object obj) {
            return p.v0(obj);
        }
    });
    private static final k0b<androidx.compose.ui.text.font.u, Object> w = n0b.e(new Function2() { // from class: com.google.android.s1b
        public final Object invoke(Object obj, Object obj2) {
            return p.w0((o0b) obj, (u) obj2);
        }
    }, new Function1() { // from class: com.google.android.t1b
        public final Object invoke(Object obj) {
            return p.x0(obj);
        }
    });
    private static final wi8<b0d, Object> x = Q0(new Function2() { // from class: com.google.android.u1b
        public final Object invoke(Object obj, Object obj2) {
            return p.n1((o0b) obj, (b0d) obj2);
        }
    }, new Function1() { // from class: com.google.android.v1b
        public final Object invoke(Object obj) {
            return p.o1(obj);
        }
    });
    private static final wi8<d0d, Object> y = Q0(new Function2() { // from class: com.google.android.x1b
        public final Object invoke(Object obj, Object obj2) {
            return p.p1((o0b) obj, (d0d) obj2);
        }
    }, new Function1() { // from class: com.google.android.y1b
        public final Object invoke(Object obj) {
            return p.q1(obj);
        }
    });
    private static final wi8<rn8, Object> z = Q0(new Function2() { // from class: com.google.android.z1b
        public final Object invoke(Object obj, Object obj2) {
            return p.R0((o0b) obj, (rn8) obj2);
        }
    }, new Function1() { // from class: com.google.android.a2b
        public final Object invoke(Object obj) {
            return p.S0(obj);
        }
    });
    private static final k0b<LocaleList, Object> A = n0b.e(new Function2() { // from class: com.google.android.c2b
        public final Object invoke(Object obj, Object obj2) {
            return p.M0((o0b) obj, (LocaleList) obj2);
        }
    }, new Function1() { // from class: com.google.android.d2b
        public final Object invoke(Object obj) {
            return p.N0(obj);
        }
    });
    private static final k0b<e77, Object> B = n0b.e(new Function2() { // from class: com.google.android.e2b
        public final Object invoke(Object obj, Object obj2) {
            return p.O0((o0b) obj, (e77) obj2);
        }
    }, new Function1() { // from class: com.google.android.f2b
        public final Object invoke(Object obj) {
            return p.P0(obj);
        }
    });
    private static final k0b<LineHeightStyle, Object> C = n0b.e(new Function2() { // from class: com.google.android.g2b
        public final Object invoke(Object obj, Object obj2) {
            return p.G0((o0b) obj, (LineHeightStyle) obj2);
        }
    }, new Function1() { // from class: com.google.android.i2b
        public final Object invoke(Object obj) {
            return p.H0(obj);
        }
    });
    private static final wi8<LineHeightStyle.a, Object> D = Q0(new Function2() { // from class: com.google.android.j2b
        public final Object invoke(Object obj, Object obj2) {
            return p.C0((o0b) obj, (LineHeightStyle.a) obj2);
        }
    }, new Function1() { // from class: com.google.android.k2b
        public final Object invoke(Object obj) {
            return p.D0(obj);
        }
    });
    private static final wi8<LineHeightStyle.d, Object> E = Q0(new Function2() { // from class: com.google.android.l2b
        public final Object invoke(Object obj, Object obj2) {
            return p.I0((o0b) obj, (LineHeightStyle.d) obj2);
        }
    }, new Function1() { // from class: com.google.android.m2b
        public final Object invoke(Object obj) {
            return p.J0(obj);
        }
    });
    private static final wi8<LineHeightStyle.c, Object> F = Q0(new Function2() { // from class: com.google.android.o2b
        public final Object invoke(Object obj, Object obj2) {
            return p.E0((o0b) obj, (LineHeightStyle.c) obj2);
        }
    }, new Function1() { // from class: com.google.android.p2b
        public final Object invoke(Object obj) {
            return p.F0(obj);
        }
    });

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Function2<o0b, ei1, Object> {
        public static final a a = new a();

        a() {
        }

        public final Object a(o0b o0bVar, long j) {
            return j == 16 ? Boolean.FALSE : Integer.valueOf(ki1.j(j));
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((o0b) obj, ((ei1) obj2).getValue());
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b implements Function1<Object, ei1> {
        public static final b a = new b();

        b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ei1 invoke(Object obj) {
            if (Intrinsics.e(obj, Boolean.FALSE)) {
                return ei1.l(ei1.INSTANCE.i());
            }
            Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
            return ei1.l(ki1.b(((Integer) obj).intValue()));
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"androidx/compose/ui/text/p$c", "Lcom/google/android/wi8;", "Lcom/google/android/o0b;", "value", "a", "(Lcom/google/android/o0b;Ljava/lang/Object;)Ljava/lang/Object;", "b", "(Ljava/lang/Object;)Ljava/lang/Object;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c<Original, Saveable> implements wi8<Original, Saveable> {
        final /* synthetic */ Function2<o0b, Original, Saveable> a;
        final /* synthetic */ Function1<Saveable, Original> b;

        /* JADX WARN: Multi-variable type inference failed */
        c(Function2<? super o0b, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
            this.a = function2;
            this.b = function1;
        }

        @Override // com.google.inputmethod.k0b
        public Saveable a(o0b o0bVar, Original original) {
            return (Saveable) this.a.invoke(o0bVar, original);
        }

        @Override // com.google.inputmethod.k0b
        public Original b(Saveable value) {
            return (Original) this.b.invoke(value);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AnnotationType.values().length];
            try {
                iArr[AnnotationType.Paragraph.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AnnotationType.Span.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AnnotationType.VerbatimTts.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AnnotationType.Url.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AnnotationType.Link.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AnnotationType.Clickable.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AnnotationType.String.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object A0(o0b o0bVar, qi5 qi5Var) {
        return Integer.valueOf(qi5Var.getValue());
    }

    public static final k0b<wg0, Object> A1(wg0.Companion companion) {
        return o;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final qi5 B0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return qi5.d(qi5.e(((Integer) obj).intValue()));
    }

    public static final k0b<ei1, Object> B1(ei1.Companion companion) {
        return r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object C0(o0b o0bVar, LineHeightStyle.a aVar) {
        return Float.valueOf(aVar.getTopRatio());
    }

    public static final k0b<qi5, Object> C1(qi5.Companion companion) {
        return u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.a D0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Float");
        return LineHeightStyle.a.c(LineHeightStyle.a.d(((Float) obj).floatValue()));
    }

    private static final k0b<LineHeightStyle.a, Object> D1(LineHeightStyle.a.Companion companion) {
        return D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object E0(o0b o0bVar, LineHeightStyle.c cVar) {
        return Integer.valueOf(cVar.getValue());
    }

    public static final k0b<LineHeightStyle, Object> E1(LineHeightStyle.Companion companion) {
        return C;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.c F0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return LineHeightStyle.c.d(LineHeightStyle.c.e(((Integer) obj).intValue()));
    }

    private static final k0b<LineHeightStyle.c, Object> F1(LineHeightStyle.c.Companion companion) {
        return F;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G0(o0b o0bVar, LineHeightStyle lineHeightStyle) {
        return kotlin.collections.m.i(new Object[]{T1(LineHeightStyle.a.c(lineHeightStyle.getAlignment()), D1(LineHeightStyle.a.INSTANCE), o0bVar), T1(LineHeightStyle.d.c(lineHeightStyle.getTrim()), G1(LineHeightStyle.d.INSTANCE), o0bVar), T1(LineHeightStyle.c.d(lineHeightStyle.getMode()), F1(LineHeightStyle.c.INSTANCE), o0bVar)});
    }

    private static final k0b<LineHeightStyle.d, Object> G1(LineHeightStyle.d.Companion companion) {
        return E;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle H0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        k0b<LineHeightStyle.a, Object> k0bVarD1 = D1(LineHeightStyle.a.INSTANCE);
        Boolean bool = Boolean.FALSE;
        LineHeightStyle.a aVarB = ((!Intrinsics.e(obj2, bool) || (k0bVarD1 instanceof wi8)) && obj2 != null) ? k0bVarD1.b(obj2) : null;
        Intrinsics.g(aVarB);
        float topRatio = aVarB.getTopRatio();
        Object obj3 = list.get(1);
        k0b<LineHeightStyle.d, Object> k0bVarG1 = G1(LineHeightStyle.d.INSTANCE);
        LineHeightStyle.d dVarB = ((!Intrinsics.e(obj3, bool) || (k0bVarG1 instanceof wi8)) && obj3 != null) ? k0bVarG1.b(obj3) : null;
        Intrinsics.g(dVarB);
        int value = dVarB.getValue();
        Object obj4 = list.get(2);
        k0b<LineHeightStyle.c, Object> k0bVarF1 = F1(LineHeightStyle.c.INSTANCE);
        LineHeightStyle.c cVarB = ((!Intrinsics.e(obj4, bool) || (k0bVarF1 instanceof wi8)) && obj4 != null) ? k0bVarF1.b(obj4) : null;
        Intrinsics.g(cVarB);
        return new LineHeightStyle(topRatio, value, cVarB.getValue(), null);
    }

    public static final k0b<e77, Object> H1(e77.Companion companion) {
        return B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object I0(o0b o0bVar, LineHeightStyle.d dVar) {
        return Integer.valueOf(dVar.getValue());
    }

    public static final k0b<LocaleList, Object> I1(LocaleList.Companion companion) {
        return A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LineHeightStyle.d J0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return LineHeightStyle.d.c(LineHeightStyle.d.d(((Integer) obj).intValue()));
    }

    public static final k0b<rn8, Object> J1(rn8.Companion companion) {
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object K0(o0b o0bVar, f.b bVar) {
        return kotlin.collections.m.i(new Object[]{S1(bVar.getUrl()), T1(bVar.getStyles(), j, o0bVar)});
    }

    public static final k0b<Shadow, Object> K1(Shadow.Companion aVar) {
        return q;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f.b L0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        myc mycVarB = null;
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.g(str);
        Object obj3 = list.get(1);
        k0b<myc, Object> k0bVar = j;
        if ((!Intrinsics.e(obj3, Boolean.FALSE) || (k0bVar instanceof wi8)) && obj3 != null) {
            mycVarB = k0bVar.b(obj3);
        }
        return new f.b(str, mycVarB, null, 4, null);
    }

    public static final k0b<cpc, Object> L1(cpc.Companion companion) {
        return s;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object M0(o0b o0bVar, LocaleList localeList) {
        List<e77> listE = localeList.e();
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(T1(listE.get(i2), H1(e77.INSTANCE), o0bVar));
        }
        return arrayList;
    }

    public static final k0b<wrc, Object> M1(wrc.Companion companion) {
        return k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocaleList N0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            k0b<e77, Object> k0bVarH1 = H1(e77.INSTANCE);
            e77 e77VarB = null;
            if ((!Intrinsics.e(obj2, Boolean.FALSE) || (k0bVarH1 instanceof wi8)) && obj2 != null) {
                e77VarB = k0bVarH1.b(obj2);
            }
            Intrinsics.g(e77VarB);
            arrayList.add(e77VarB);
        }
        return new LocaleList(arrayList);
    }

    public static final k0b<dsc, Object> N1(dsc.Companion companion) {
        return t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object O0(o0b o0bVar, e77 e77Var) {
        return e77Var.d();
    }

    public static final k0b<TextGeometricTransform, Object> O1(TextGeometricTransform.Companion companion) {
        return l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e77 P0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.String");
        return new e77((String) obj);
    }

    public static final k0b<TextIndent, Object> P1(TextIndent.Companion companion) {
        return m;
    }

    private static final <Original, Saveable> wi8<Original, Saveable> Q0(Function2<? super o0b, ? super Original, ? extends Saveable> function2, Function1<? super Saveable, ? extends Original> function1) {
        return new c(function2, function1);
    }

    public static final k0b<b0d, Object> Q1(b0d.Companion companion) {
        return x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object R0(o0b o0bVar, rn8 rn8Var) {
        return rn8Var == null ? false : rn8.j(rn8Var.getPackedValue(), rn8.INSTANCE.b()) ? Boolean.FALSE : kotlin.collections.m.i(new Float[]{S1(Float.valueOf(Float.intBitsToFloat((int) (rn8Var.getPackedValue() >> 32)))), S1(Float.valueOf(Float.intBitsToFloat((int) (rn8Var.getPackedValue() & 4294967295L))))});
    }

    public static final k0b<d0d, Object> R1(d0d.Companion companion) {
        return y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final rn8 S0(Object obj) {
        if (Intrinsics.e(obj, Boolean.FALSE)) {
            return rn8.d(rn8.INSTANCE.b());
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f2 = obj2 != null ? (Float) obj2 : null;
        Intrinsics.g(f2);
        float fFloatValue = f2.floatValue();
        Object obj3 = list.get(1);
        Float f3 = obj3 != null ? (Float) obj3 : null;
        Intrinsics.g(f3);
        return rn8.d(rn8.e((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f3.floatValue())) & 4294967295L)));
    }

    public static final <T> T S1(T t2) {
        return t2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object T0(o0b o0bVar, ParagraphStyle mVar) {
        return kotlin.collections.m.i(new Object[]{T1(cpc.h(mVar.getTextAlign()), L1(cpc.INSTANCE), o0bVar), T1(dsc.g(mVar.getTextDirection()), N1(dsc.INSTANCE), o0bVar), T1(b0d.b(mVar.getLineHeight()), Q1(b0d.INSTANCE), o0bVar), T1(mVar.getTextIndent(), P1(TextIndent.INSTANCE), o0bVar), T1(mVar.getPlatformStyle(), q.v(PlatformParagraphStyle.INSTANCE), o0bVar), T1(mVar.getLineHeightStyle(), E1(LineHeightStyle.INSTANCE), o0bVar), T1(d27.d(mVar.getLineBreak()), q.w(d27.INSTANCE), o0bVar), T1(qi5.d(mVar.getHyphens()), C1(qi5.INSTANCE), o0bVar), T1(mVar.getTextMotion(), q.x(ryc.INSTANCE), o0bVar)});
    }

    public static final <T extends k0b<Original, Saveable>, Original, Saveable> Object T1(Original original, T t2, o0b o0bVar) {
        Object objA;
        return (original == null || (objA = t2.a(o0bVar, original)) == null) ? Boolean.FALSE : objA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ParagraphStyle U0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        k0b<cpc, Object> k0bVarL1 = L1(cpc.INSTANCE);
        Boolean bool = Boolean.FALSE;
        ryc rycVarB = null;
        cpc cpcVarB = ((!Intrinsics.e(obj2, bool) || (k0bVarL1 instanceof wi8)) && obj2 != null) ? k0bVarL1.b(obj2) : null;
        Intrinsics.g(cpcVarB);
        int value = cpcVarB.getValue();
        Object obj3 = list.get(1);
        k0b<dsc, Object> k0bVarN1 = N1(dsc.INSTANCE);
        dsc dscVarB = ((!Intrinsics.e(obj3, bool) || (k0bVarN1 instanceof wi8)) && obj3 != null) ? k0bVarN1.b(obj3) : null;
        Intrinsics.g(dscVarB);
        int value2 = dscVarB.getValue();
        Object obj4 = list.get(2);
        k0b<b0d, Object> k0bVarQ1 = Q1(b0d.INSTANCE);
        b0d b0dVarB = ((!Intrinsics.e(obj4, bool) || (k0bVarQ1 instanceof wi8)) && obj4 != null) ? k0bVarQ1.b(obj4) : null;
        Intrinsics.g(b0dVarB);
        long packedValue = b0dVarB.getPackedValue();
        Object obj5 = list.get(3);
        k0b<TextIndent, Object> k0bVarP1 = P1(TextIndent.INSTANCE);
        TextIndent textIndentB = ((!Intrinsics.e(obj5, bool) || (k0bVarP1 instanceof wi8)) && obj5 != null) ? k0bVarP1.b(obj5) : null;
        Object obj6 = list.get(4);
        k0b<PlatformParagraphStyle, Object> k0bVarV = q.v(PlatformParagraphStyle.INSTANCE);
        PlatformParagraphStyle platformParagraphStyleB = ((!Intrinsics.e(obj6, bool) || (k0bVarV instanceof wi8)) && obj6 != null) ? k0bVarV.b(obj6) : null;
        Object obj7 = list.get(5);
        k0b<LineHeightStyle, Object> k0bVarE1 = E1(LineHeightStyle.INSTANCE);
        LineHeightStyle lineHeightStyleB = ((!Intrinsics.e(obj7, bool) || (k0bVarE1 instanceof wi8)) && obj7 != null) ? k0bVarE1.b(obj7) : null;
        Object obj8 = list.get(6);
        k0b<d27, Object> k0bVarW = q.w(d27.INSTANCE);
        d27 d27VarB = ((!Intrinsics.e(obj8, bool) || (k0bVarW instanceof wi8)) && obj8 != null) ? k0bVarW.b(obj8) : null;
        Intrinsics.g(d27VarB);
        int mask = d27VarB.getMask();
        Object obj9 = list.get(7);
        k0b<qi5, Object> k0bVarC1 = C1(qi5.INSTANCE);
        qi5 qi5VarB = ((!Intrinsics.e(obj9, bool) || (k0bVarC1 instanceof wi8)) && obj9 != null) ? k0bVarC1.b(obj9) : null;
        Intrinsics.g(qi5VarB);
        int value3 = qi5VarB.getValue();
        Object obj10 = list.get(8);
        k0b<ryc, Object> k0bVarX = q.x(ryc.INSTANCE);
        if ((!Intrinsics.e(obj10, bool) || (k0bVarX instanceof wi8)) && obj10 != null) {
            rycVarB = k0bVarX.b(obj10);
        }
        return new ParagraphStyle(value, value2, packedValue, textIndentB, platformParagraphStyleB, lineHeightStyleB, mask, value3, rycVarB, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object V0(o0b o0bVar, Shadow nkbVar) {
        return kotlin.collections.m.i(new Object[]{T1(ei1.l(nkbVar.getColor()), B1(ei1.INSTANCE), o0bVar), T1(rn8.d(nkbVar.getOffset()), J1(rn8.INSTANCE), o0bVar), S1(Float.valueOf(nkbVar.getBlurRadius()))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Shadow W0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        k0b<ei1, Object> k0bVarB1 = B1(ei1.INSTANCE);
        Boolean bool = Boolean.FALSE;
        ei1 ei1VarB = ((!Intrinsics.e(obj2, bool) || (k0bVarB1 instanceof wi8)) && obj2 != null) ? k0bVarB1.b(obj2) : null;
        Intrinsics.g(ei1VarB);
        long value = ei1VarB.getValue();
        Object obj3 = list.get(1);
        k0b<rn8, Object> k0bVarJ1 = J1(rn8.INSTANCE);
        rn8 rn8VarB = ((!Intrinsics.e(obj3, bool) || (k0bVarJ1 instanceof wi8)) && obj3 != null) ? k0bVarJ1.b(obj3) : null;
        Intrinsics.g(rn8VarB);
        long packedValue = rn8VarB.getPackedValue();
        Object obj4 = list.get(2);
        Float f2 = obj4 != null ? (Float) obj4 : null;
        Intrinsics.g(f2);
        return new Shadow(value, packedValue, f2.floatValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object X0(o0b o0bVar, SpanStyle rVar) {
        ei1 ei1VarL = ei1.l(rVar.g());
        ei1.Companion companion = ei1.INSTANCE;
        Object objT1 = T1(ei1VarL, B1(companion), o0bVar);
        b0d b0dVarB = b0d.b(rVar.getFontSize());
        b0d.Companion companion2 = b0d.INSTANCE;
        return kotlin.collections.m.i(new Object[]{objT1, T1(b0dVarB, Q1(companion2), o0bVar), T1(rVar.getFontWeight(), z1(FontWeight.INSTANCE), o0bVar), T1(rVar.getFontStyle(), x1(androidx.compose.ui.text.font.t.INSTANCE), o0bVar), T1(rVar.getFontSynthesis(), y1(androidx.compose.ui.text.font.u.INSTANCE), o0bVar), S1(-1), S1(rVar.getFontFeatureSettings()), T1(b0d.b(rVar.getLetterSpacing()), Q1(companion2), o0bVar), T1(rVar.getBaselineShift(), A1(wg0.INSTANCE), o0bVar), T1(rVar.getTextGeometricTransform(), O1(TextGeometricTransform.INSTANCE), o0bVar), T1(rVar.getLocaleList(), I1(LocaleList.INSTANCE), o0bVar), T1(ei1.l(rVar.getBackground()), B1(companion), o0bVar), T1(rVar.getTextDecoration(), M1(wrc.INSTANCE), o0bVar), T1(rVar.getShadow(), K1(Shadow.INSTANCE), o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 androidx.compose.ui.text.r, still in use, count: 2, list:
          (r1v1 androidx.compose.ui.text.r) from 0x0100: MOVE (r16v2 androidx.compose.ui.text.r) = (r1v1 androidx.compose.ui.text.r)
          (r1v1 androidx.compose.ui.text.r) from 0x00f8: MOVE (r16v7 androidx.compose.ui.text.r) = (r1v1 androidx.compose.ui.text.r)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:59)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final androidx.compose.ui.text.SpanStyle Y0(java.lang.Object r28) {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.text.p.Y0(java.lang.Object):androidx.compose.ui.text.r");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object Z0(o0b o0bVar, cpc cpcVar) {
        return Integer.valueOf(cpcVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cpc a1(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return cpc.h(cpc.i(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b1(o0b o0bVar, wrc wrcVar) {
        return Integer.valueOf(wrcVar.getMask());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wrc c1(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return new wrc(((Integer) obj).intValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d1(o0b o0bVar, dsc dscVar) {
        return Integer.valueOf(dscVar.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final dsc e1(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return dsc.g(dsc.h(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object f1(o0b o0bVar, TextGeometricTransform textGeometricTransform) {
        return kotlin.collections.m.i(new Float[]{Float.valueOf(textGeometricTransform.getScaleX()), Float.valueOf(textGeometricTransform.getSkewX())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextGeometricTransform g1(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
        List list = (List) obj;
        return new TextGeometricTransform(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h1(o0b o0bVar, TextIndent textIndent) {
        b0d b0dVarB = b0d.b(textIndent.getFirstLine());
        b0d.Companion companion = b0d.INSTANCE;
        return kotlin.collections.m.i(new Object[]{T1(b0dVarB, Q1(companion), o0bVar), T1(b0d.b(textIndent.getRestLine()), Q1(companion), o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextIndent i1(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        b0d.Companion companion = b0d.INSTANCE;
        k0b<b0d, Object> k0bVarQ1 = Q1(companion);
        Boolean bool = Boolean.FALSE;
        b0d b0dVarB = null;
        b0d b0dVarB2 = ((!Intrinsics.e(obj2, bool) || (k0bVarQ1 instanceof wi8)) && obj2 != null) ? k0bVarQ1.b(obj2) : null;
        Intrinsics.g(b0dVarB2);
        long packedValue = b0dVarB2.getPackedValue();
        Object obj3 = list.get(1);
        k0b<b0d, Object> k0bVarQ2 = Q1(companion);
        if ((!Intrinsics.e(obj3, bool) || (k0bVarQ2 instanceof wi8)) && obj3 != null) {
            b0dVarB = k0bVarQ2.b(obj3);
        }
        Intrinsics.g(b0dVarB);
        return new TextIndent(packedValue, b0dVarB.getPackedValue(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object j1(o0b o0bVar, myc mycVar) {
        SpanStyle style = mycVar.getStyle();
        k0b<SpanStyle, Object> k0bVar = i;
        return kotlin.collections.m.i(new Object[]{T1(style, k0bVar, o0bVar), T1(mycVar.getFocusedStyle(), k0bVar, o0bVar), T1(mycVar.getHoveredStyle(), k0bVar, o0bVar), T1(mycVar.getPressedStyle(), k0bVar, o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k0(o0b o0bVar, androidx.compose.ui.text.b bVar) {
        return kotlin.collections.m.i(new Object[]{S1(bVar.getText()), T1(bVar.c(), b, o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final myc k1(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        k0b<SpanStyle, Object> k0bVar = i;
        Boolean bool = Boolean.FALSE;
        SpanStyle rVarB = null;
        SpanStyle rVarB2 = ((!Intrinsics.e(obj2, bool) || (k0bVar instanceof wi8)) && obj2 != null) ? k0bVar.b(obj2) : null;
        Object obj3 = list.get(1);
        SpanStyle rVarB3 = ((!Intrinsics.e(obj3, bool) || (k0bVar instanceof wi8)) && obj3 != null) ? k0bVar.b(obj3) : null;
        Object obj4 = list.get(2);
        SpanStyle rVarB4 = ((!Intrinsics.e(obj4, bool) || (k0bVar instanceof wi8)) && obj4 != null) ? k0bVar.b(obj4) : null;
        Object obj5 = list.get(3);
        if ((!Intrinsics.e(obj5, bool) || (k0bVar instanceof wi8)) && obj5 != null) {
            rVarB = k0bVar.b(obj5);
        }
        return new myc(rVarB2, rVarB3, rVarB4, rVarB);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.b l0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(1);
        k0b<List<androidx.compose.ui.text.b.Range<? extends Object>>, Object> k0bVar = b;
        List<androidx.compose.ui.text.b.Range<? extends Object>> listB = ((!Intrinsics.e(obj2, Boolean.FALSE) || (k0bVar instanceof wi8)) && obj2 != null) ? k0bVar.b(obj2) : null;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        Intrinsics.g(str);
        return new androidx.compose.ui.text.b(listB, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object l1(o0b o0bVar, x xVar) {
        return kotlin.collections.m.i(new Integer[]{S1(Integer.valueOf(x.n(xVar.getPackedValue()))), S1(Integer.valueOf(x.i(xVar.getPackedValue())))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object m0(o0b o0bVar, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(T1((androidx.compose.ui.text.b.Range) list.get(i2), c, o0bVar));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x m1(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        Intrinsics.g(num);
        int iIntValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.g(num2);
        return x.b(zyc.b(iIntValue, num2.intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List n0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj2 = list.get(i2);
            k0b<androidx.compose.ui.text.b.Range<? extends Object>, Object> k0bVar = c;
            androidx.compose.ui.text.b.Range<? extends Object> rangeB = null;
            if ((!Intrinsics.e(obj2, Boolean.FALSE) || (k0bVar instanceof wi8)) && obj2 != null) {
                rangeB = k0bVar.b(obj2);
            }
            Intrinsics.g(rangeB);
            arrayList.add(rangeB);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object n1(o0b o0bVar, b0d b0dVar) {
        return b0dVar == null ? false : b0d.e(b0dVar.getPackedValue(), b0d.INSTANCE.a()) ? Boolean.FALSE : kotlin.collections.m.i(new Object[]{S1(Float.valueOf(b0d.h(b0dVar.getPackedValue()))), T1(d0d.d(b0d.g(b0dVar.getPackedValue())), R1(d0d.INSTANCE), o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Object o0(o0b o0bVar, androidx.compose.ui.text.b.Range range) throws NoWhenBranchMatchedException {
        AnnotationType annotationType;
        Object objT1;
        Object objG = range.g();
        if (objG instanceof ParagraphStyle) {
            annotationType = AnnotationType.Paragraph;
        } else if (objG instanceof SpanStyle) {
            annotationType = AnnotationType.Span;
        } else if (objG instanceof VerbatimTtsAnnotation) {
            annotationType = AnnotationType.VerbatimTts;
        } else if (objG instanceof UrlAnnotation) {
            annotationType = AnnotationType.Url;
        } else if (objG instanceof f.b) {
            annotationType = AnnotationType.Link;
        } else if (objG instanceof f.a) {
            annotationType = AnnotationType.Clickable;
        } else {
            if (!(objG instanceof s)) {
                throw new UnsupportedOperationException();
            }
            annotationType = AnnotationType.String;
        }
        switch (d.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object objG2 = range.g();
                Intrinsics.h(objG2, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                objT1 = T1((ParagraphStyle) objG2, h, o0bVar);
                break;
            case 2:
                Object objG3 = range.g();
                Intrinsics.h(objG3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                objT1 = T1((SpanStyle) objG3, i, o0bVar);
                break;
            case 3:
                Object objG4 = range.g();
                Intrinsics.h(objG4, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                objT1 = T1((VerbatimTtsAnnotation) objG4, d, o0bVar);
                break;
            case 4:
                Object objG5 = range.g();
                Intrinsics.h(objG5, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                objT1 = T1((UrlAnnotation) objG5, e, o0bVar);
                break;
            case 5:
                Object objG6 = range.g();
                Intrinsics.h(objG6, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                objT1 = T1((f.b) objG6, f, o0bVar);
                break;
            case 6:
                Object objG7 = range.g();
                Intrinsics.h(objG7, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                objT1 = T1((f.a) objG7, g, o0bVar);
                break;
            case 7:
                Object objG8 = range.g();
                Intrinsics.h(objG8, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                objT1 = S1(((s) objG8).getValue());
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return kotlin.collections.m.i(new Object[]{S1(annotationType), objT1, S1(Integer.valueOf(range.h())), S1(Integer.valueOf(range.f())), S1(range.getTag())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0d o1(Object obj) {
        Boolean bool = Boolean.FALSE;
        if (Intrinsics.e(obj, bool)) {
            return b0d.b(b0d.INSTANCE.a());
        }
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        d0d d0dVarB = null;
        Float f2 = obj2 != null ? (Float) obj2 : null;
        Intrinsics.g(f2);
        float fFloatValue = f2.floatValue();
        Object obj3 = list.get(1);
        k0b<d0d, Object> k0bVarR1 = R1(d0d.INSTANCE);
        if ((!Intrinsics.e(obj3, bool) || (k0bVarR1 instanceof wi8)) && obj3 != null) {
            d0dVarB = k0bVarR1.b(obj3);
        }
        Intrinsics.g(d0dVarB);
        return b0d.b(c0d.a(fFloatValue, d0dVarB.getType()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final androidx.compose.ui.text.b.Range p0(Object obj) throws NoWhenBranchMatchedException {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        ParagraphStyle mVarB = null;
        aVarB = null;
        f.a aVarB = null;
        bVarB = null;
        f.b bVarB = null;
        a0VarB = null;
        UrlAnnotation a0VarB = null;
        verbatimTtsAnnotationB = null;
        VerbatimTtsAnnotation verbatimTtsAnnotationB = null;
        rVarB = null;
        SpanStyle rVarB = null;
        mVarB = null;
        AnnotationType annotationType = obj2 != null ? (AnnotationType) obj2 : null;
        Intrinsics.g(annotationType);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        Intrinsics.g(num);
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        Intrinsics.g(num2);
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        Intrinsics.g(str);
        switch (d.$EnumSwitchMapping$0[annotationType.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                k0b<ParagraphStyle, Object> k0bVar = h;
                if ((!Intrinsics.e(obj6, Boolean.FALSE) || (k0bVar instanceof wi8)) && obj6 != null) {
                    mVarB = k0bVar.b(obj6);
                }
                Intrinsics.g(mVarB);
                return new androidx.compose.ui.text.b.Range(mVarB, iIntValue, iIntValue2, str);
            case 2:
                Object obj7 = list.get(1);
                k0b<SpanStyle, Object> k0bVar2 = i;
                if ((!Intrinsics.e(obj7, Boolean.FALSE) || (k0bVar2 instanceof wi8)) && obj7 != null) {
                    rVarB = k0bVar2.b(obj7);
                }
                Intrinsics.g(rVarB);
                return new androidx.compose.ui.text.b.Range(rVarB, iIntValue, iIntValue2, str);
            case 3:
                Object obj8 = list.get(1);
                k0b<VerbatimTtsAnnotation, Object> k0bVar3 = d;
                if ((!Intrinsics.e(obj8, Boolean.FALSE) || (k0bVar3 instanceof wi8)) && obj8 != null) {
                    verbatimTtsAnnotationB = k0bVar3.b(obj8);
                }
                Intrinsics.g(verbatimTtsAnnotationB);
                return new androidx.compose.ui.text.b.Range(verbatimTtsAnnotationB, iIntValue, iIntValue2, str);
            case 4:
                Object obj9 = list.get(1);
                k0b<UrlAnnotation, Object> k0bVar4 = e;
                if ((!Intrinsics.e(obj9, Boolean.FALSE) || (k0bVar4 instanceof wi8)) && obj9 != null) {
                    a0VarB = k0bVar4.b(obj9);
                }
                Intrinsics.g(a0VarB);
                return new androidx.compose.ui.text.b.Range(a0VarB, iIntValue, iIntValue2, str);
            case 5:
                Object obj10 = list.get(1);
                k0b<f.b, Object> k0bVar5 = f;
                if ((!Intrinsics.e(obj10, Boolean.FALSE) || (k0bVar5 instanceof wi8)) && obj10 != null) {
                    bVarB = k0bVar5.b(obj10);
                }
                Intrinsics.g(bVarB);
                return new androidx.compose.ui.text.b.Range(bVarB, iIntValue, iIntValue2, str);
            case 6:
                Object obj11 = list.get(1);
                k0b<f.a, Object> k0bVar6 = g;
                if ((!Intrinsics.e(obj11, Boolean.FALSE) || (k0bVar6 instanceof wi8)) && obj11 != null) {
                    aVarB = k0bVar6.b(obj11);
                }
                Intrinsics.g(aVarB);
                return new androidx.compose.ui.text.b.Range(aVarB, iIntValue, iIntValue2, str);
            case 7:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                Intrinsics.g(str2);
                return new androidx.compose.ui.text.b.Range(s.a(s.b(str2)), iIntValue, iIntValue2, str);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object p1(o0b o0bVar, d0d d0dVar) {
        long type = d0dVar.getType();
        d0d.Companion companion = d0d.INSTANCE;
        if (d0d.g(type, companion.a())) {
            return 0;
        }
        if (d0d.g(type, companion.b())) {
            return 1;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q0(o0b o0bVar, wg0 wg0Var) {
        return Float.valueOf(wg0Var.getMultiplier());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final d0d q1(Object obj) {
        if (Intrinsics.e(obj, 0)) {
            return d0d.d(d0d.INSTANCE.a());
        }
        return Intrinsics.e(obj, 1) ? d0d.d(d0d.INSTANCE.b()) : d0d.d(d0d.INSTANCE.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wg0 r0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Float");
        return wg0.b(wg0.c(((Float) obj).floatValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object r1(o0b o0bVar, UrlAnnotation a0Var) {
        return S1(a0Var.getUrl());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object s0(o0b o0bVar, f.a aVar) {
        return kotlin.collections.m.i(new Object[]{S1(aVar.getTag()), T1(aVar.getStyles(), j, o0bVar)});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UrlAnnotation s1(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.g(str);
        return new UrlAnnotation(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f.a t0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        Intrinsics.g(str);
        Object obj3 = list.get(1);
        k0b<myc, Object> k0bVar = j;
        return new f.a(str, ((!Intrinsics.e(obj3, Boolean.FALSE) || (k0bVar instanceof wi8)) && obj3 != null) ? k0bVar.b(obj3) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object t1(o0b o0bVar, VerbatimTtsAnnotation verbatimTtsAnnotation) {
        return S1(verbatimTtsAnnotation.getVerbatim());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object u0(o0b o0bVar, androidx.compose.ui.text.font.t tVar) {
        return S1(Integer.valueOf(tVar.getValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final VerbatimTtsAnnotation u1(Object obj) {
        String str = obj != null ? (String) obj : null;
        Intrinsics.g(str);
        return new VerbatimTtsAnnotation(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.font.t v0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return androidx.compose.ui.text.font.t.c(androidx.compose.ui.text.font.t.d(((Integer) obj).intValue()));
    }

    public static final k0b<androidx.compose.ui.text.b, Object> v1() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object w0(o0b o0bVar, androidx.compose.ui.text.font.u uVar) {
        return Integer.valueOf(uVar.getValue());
    }

    public static final k0b<x, Object> w1(x.Companion companion) {
        return p;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.font.u x0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return androidx.compose.ui.text.font.u.e(androidx.compose.ui.text.font.u.f(((Integer) obj).intValue()));
    }

    public static final k0b<androidx.compose.ui.text.font.t, Object> x1(androidx.compose.ui.text.font.t.Companion companion) {
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object y0(o0b o0bVar, FontWeight fontWeight) {
        return Integer.valueOf(fontWeight.q());
    }

    public static final k0b<androidx.compose.ui.text.font.u, Object> y1(androidx.compose.ui.text.font.u.Companion companion) {
        return w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FontWeight z0(Object obj) {
        Intrinsics.h(obj, "null cannot be cast to non-null type kotlin.Int");
        return new FontWeight(((Integer) obj).intValue());
    }

    public static final k0b<FontWeight, Object> z1(FontWeight.Companion companion) {
        return n;
    }
}
