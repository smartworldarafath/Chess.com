package androidx.compose.ui.semantics;

import androidx.compose.ui.autofill.d;
import androidx.compose.ui.state.ToggleableState;
import androidx.compose.ui.text.x;
import com.google.android.ph6;
import com.google.android.ps4;
import com.google.android.q22;
import com.google.android.ws4;
import com.google.inputmethod.AccessibilityAction;
import com.google.inputmethod.CollectionInfo;
import com.google.inputmethod.CustomAccessibilityAction;
import com.google.inputmethod.ProgressBarRangeInfo;
import com.google.inputmethod.ScrollAxisRange;
import com.google.inputmethod.TextLayoutResult;
import com.google.inputmethod.d57;
import com.google.inputmethod.hpa;
import com.google.inputmethod.nfb;
import com.google.inputmethod.rn8;
import com.google.inputmethod.t94;
import com.google.inputmethod.xkb;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\u0003\u001a\u0011\u0010\b\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\b\u0010\u0003\u001a\u0019\u0010\u000b\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a%\u0010\u0011\u001a\u00020\u0001*\u00020\u00002\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0011\u0010\u0013\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0013\u0010\u0003\u001a9\u0010\u0019\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u001a\u0010\u0018\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b\u0019\u0010\u001a\u001a-\u0010\u001c\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001d\u001a-\u0010\u001e\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b\u001e\u0010\u001d\u001a9\u0010!\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u001a\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"\u001a5\u0010%\u001a\u00020\u0001*\u00020\u00002\"\u0010\u0018\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020#\u0012\n\u0012\b\u0012\u0004\u0012\u00020#0$\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u001f¢\u0006\u0004\b%\u0010&\u001a1\u0010'\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00170\r¢\u0006\u0004\b'\u0010\u001a\u001a3\u0010)\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b)\u0010\u001a\u001a3\u0010*\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b*\u0010\u001a\u001a3\u0010,\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b,\u0010\u001a\u001a3\u0010-\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b-\u0010\u001a\u001a3\u0010.\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b.\u0010\u001a\u001a-\u0010/\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b/\u0010\u001d\u001a3\u00100\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020\u0017\u0018\u00010\r¢\u0006\u0004\b0\u0010\u001a\u001a5\u00103\u001a\u00020\u0001*\u00020\u00002\u0006\u00102\u001a\u0002012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b3\u00104\u001a?\u00106\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2 \u0010\u0018\u001a\u001c\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0017\u0018\u000105¢\u0006\u0004\b6\u00107\u001a-\u00108\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b8\u0010\u001d\u001a-\u00109\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b9\u0010\u001d\u001a-\u0010:\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b:\u0010\u001d\u001a-\u0010;\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b;\u0010\u001d\u001a-\u0010<\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b<\u0010\u001d\u001a-\u0010=\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b=\u0010\u001d\u001a-\u0010>\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b>\u0010\u001d\u001a-\u0010?\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b?\u0010\u001d\u001a-\u0010@\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\b@\u0010\u001d\u001a-\u0010A\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\bA\u0010\u001d\u001a-\u0010B\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u001b¢\u0006\u0004\bB\u0010\u001d\u001a-\u0010C\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\t2\u000e\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u001b¢\u0006\u0004\bC\u0010\u001d\"(\u0010H\u001a\u00020\t*\u00020\u00002\u0006\u0010D\u001a\u00020\t8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bE\u0010F\"\u0004\bG\u0010\f\"/\u0010N\u001a\u00020\t*\u00020\u00002\u0006\u0010I\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010\f*\u0004\bL\u0010M\"/\u0010U\u001a\u00020O*\u00020\u00002\u0006\u0010I\u001a\u00020O8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S*\u0004\bT\u0010M\"/\u0010Y\u001a\u00020\t*\u00020\u00002\u0006\u0010I\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bV\u0010F\"\u0004\bW\u0010\f*\u0004\bX\u0010M\"/\u0010`\u001a\u00020Z*\u00020\u00002\u0006\u0010I\u001a\u00020Z8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^*\u0004\b_\u0010M\"/\u0010f\u001a\u00020\u0017*\u00020\u00002\u0006\u0010I\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\ba\u0010b\"\u0004\bc\u0010d*\u0004\be\u0010M\"5\u0010g\u001a\u00020\u0017*\u00020\u00002\u0006\u0010I\u001a\u00020\u00178F@FX\u0087\u008e\u0002¢\u0006\u0018\u0012\u0004\bi\u0010\u0003\u001a\u0004\bg\u0010b\"\u0004\bh\u0010d*\u0004\bj\u0010M\"/\u0010k\u001a\u00020\u0017*\u00020\u00002\u0006\u0010I\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bk\u0010b\"\u0004\bl\u0010d*\u0004\bm\u0010M\"/\u0010t\u001a\u00020n*\u00020\u00002\u0006\u0010I\u001a\u00020n8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bo\u0010p\"\u0004\bq\u0010r*\u0004\bs\u0010M\"/\u0010{\u001a\u00020u*\u00020\u00002\u0006\u0010I\u001a\u00020u8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bv\u0010w\"\u0004\bx\u0010y*\u0004\bz\u0010M\"1\u0010\u0081\u0001\u001a\u00020(*\u00020\u00002\u0006\u0010I\u001a\u00020(8F@FX\u0086\u008e\u0002¢\u0006\u0013\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007f*\u0005\b\u0080\u0001\u0010M\"5\u0010\u0087\u0001\u001a\u00020 *\u00020\u00002\u0006\u0010I\u001a\u00020 8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001*\u0005\b\u0086\u0001\u0010M\"7\u0010\u008e\u0001\u001a\u00030\u0088\u0001*\u00020\u00002\u0007\u0010I\u001a\u00030\u0088\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001*\u0005\b\u008d\u0001\u0010M\"7\u0010\u0092\u0001\u001a\u00030\u0088\u0001*\u00020\u00002\u0007\u0010I\u001a\u00030\u0088\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b\u008f\u0001\u0010\u008a\u0001\"\u0006\b\u0090\u0001\u0010\u008c\u0001*\u0005\b\u0091\u0001\u0010M\"5\u0010\u0097\u0001\u001a\u00030\u0093\u0001*\u00020\u00002\u0007\u0010I\u001a\u00030\u0093\u00018F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0094\u0001\u0010\\\"\u0005\b\u0095\u0001\u0010^*\u0005\b\u0096\u0001\u0010M\"3\u0010\u009b\u0001\u001a\u00020\t*\u00020\u00002\u0006\u0010I\u001a\u00020\t8F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b\u0098\u0001\u0010F\"\u0005\b\u0099\u0001\u0010\f*\u0005\b\u009a\u0001\u0010M\"-\u0010 \u0001\u001a\u00020+*\u00020\u00002\u0006\u0010D\u001a\u00020+8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001\"5\u0010¤\u0001\u001a\u00020+*\u00020\u00002\u0006\u0010I\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¡\u0001\u0010\u009d\u0001\"\u0006\b¢\u0001\u0010\u009f\u0001*\u0005\b£\u0001\u0010M\"3\u0010¥\u0001\u001a\u00020\u0017*\u00020\u00002\u0006\u0010I\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b¥\u0001\u0010b\"\u0005\b¦\u0001\u0010d*\u0005\b§\u0001\u0010M\"5\u0010«\u0001\u001a\u00020+*\u00020\u00002\u0006\u0010I\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¨\u0001\u0010\u009d\u0001\"\u0006\b©\u0001\u0010\u009f\u0001*\u0005\bª\u0001\u0010M\"5\u0010¯\u0001\u001a\u00020+*\u00020\u00002\u0006\u0010I\u001a\u00020+8F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¬\u0001\u0010\u009d\u0001\"\u0006\b\u00ad\u0001\u0010\u009f\u0001*\u0005\b®\u0001\u0010M\"7\u0010¶\u0001\u001a\u00030°\u0001*\u00020\u00002\u0007\u0010I\u001a\u00030°\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b±\u0001\u0010²\u0001\"\u0006\b³\u0001\u0010´\u0001*\u0005\bµ\u0001\u0010M\"3\u0010º\u0001\u001a\u00020\u0017*\u00020\u00002\u0006\u0010I\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\b·\u0001\u0010b\"\u0005\b¸\u0001\u0010d*\u0005\b¹\u0001\u0010M\"7\u0010Á\u0001\u001a\u00030»\u0001*\u00020\u00002\u0007\u0010I\u001a\u00030»\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001*\u0005\bÀ\u0001\u0010M\"7\u0010È\u0001\u001a\u00030Â\u0001*\u00020\u00002\u0007\u0010I\u001a\u00030Â\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001*\u0005\bÇ\u0001\u0010M\"3\u0010É\u0001\u001a\u00020\u0017*\u00020\u00002\u0006\u0010I\u001a\u00020\u00178F@FX\u0086\u008e\u0002¢\u0006\u0015\u001a\u0005\bÉ\u0001\u0010b\"\u0005\bÊ\u0001\u0010d*\u0005\bË\u0001\u0010M\"7\u0010Ò\u0001\u001a\u00030Ì\u0001*\u00020\u00002\u0007\u0010I\u001a\u00030Ì\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÍ\u0001\u0010Î\u0001\"\u0006\bÏ\u0001\u0010Ð\u0001*\u0005\bÑ\u0001\u0010M\"E\u0010Ú\u0001\u001a\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u0001*\u00020\u00002\u000e\u0010I\u001a\n\u0012\u0005\u0012\u00030Ô\u00010Ó\u00018F@FX\u0086\u008e\u0002¢\u0006\u0017\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001*\u0005\bÙ\u0001\u0010M¨\u0006Û\u0001"}, d2 = {"Lcom/google/android/nfb;", "", "r", "(Lcom/google/android/nfb;)V", "i", "s", "P", "h", "M", "", "description", "l", "(Lcom/google/android/nfb;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "mapping", "t", "(Lcom/google/android/nfb;Lkotlin/jvm/functions/Function1;)V", "X", "label", "", "Lcom/google/android/vxc;", "", "action", "p", "(Lcom/google/android/nfb;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function0;", "w", "(Lcom/google/android/nfb;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "C", "Lkotlin/Function2;", "", "S", "(Lcom/google/android/nfb;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "Lcom/google/android/rn8;", "Lcom/google/android/q22;", "U", "(Lcom/google/android/nfb;Lkotlin/jvm/functions/Function2;)V", "V", "Lcom/google/android/t94;", "y", "m0", "Landroidx/compose/ui/text/b;", "y0", "C0", "I0", "a", "u", "Landroidx/compose/ui/text/input/a;", "imeActionType", "A", "(Lcom/google/android/nfb;ILjava/lang/String;Lkotlin/jvm/functions/Function0;)V", "Lkotlin/Function3;", "r0", "(Lcom/google/android/nfb;Ljava/lang/String;Lcom/google/android/ps4;)V", "d", "f", "N", "m", "c", "j", "Q", "K", "E", "G", "I", "n", "value", "getContentDescription", "(Lcom/google/android/nfb;)Ljava/lang/String;", "b0", "contentDescription", "<set-?>", "getStateDescription", "v0", "getStateDescription$delegate", "(Lcom/google/android/nfb;)Ljava/lang/Object;", "stateDescription", "Lcom/google/android/up9;", "getProgressBarRangeInfo", "(Lcom/google/android/nfb;)Lcom/google/android/up9;", "o0", "(Lcom/google/android/nfb;Lcom/google/android/up9;)V", "getProgressBarRangeInfo$delegate", "progressBarRangeInfo", "getPaneTitle", "l0", "getPaneTitle$delegate", "paneTitle", "Lcom/google/android/d57;", "getLiveRegion", "(Lcom/google/android/nfb;)I", "k0", "(Lcom/google/android/nfb;I)V", "getLiveRegion$delegate", "liveRegion", "getFocused", "(Lcom/google/android/nfb;)Z", "h0", "(Lcom/google/android/nfb;Z)V", "getFocused$delegate", "focused", "isContainer", "Z", "isContainer$annotations", "isContainer$delegate", "isTraversalGroup", "F0", "isTraversalGroup$delegate", "Landroidx/compose/ui/autofill/d;", "getContentType", "(Lcom/google/android/nfb;)Landroidx/compose/ui/autofill/d;", "c0", "(Lcom/google/android/nfb;Landroidx/compose/ui/autofill/d;)V", "getContentType$delegate", "contentType", "Landroidx/compose/ui/autofill/c;", "getContentDataType", "(Lcom/google/android/nfb;)Landroidx/compose/ui/autofill/c;", "a0", "(Lcom/google/android/nfb;Landroidx/compose/ui/autofill/c;)V", "getContentDataType$delegate", "contentDataType", "getFillableData", "(Lcom/google/android/nfb;)Lcom/google/android/t94;", "g0", "(Lcom/google/android/nfb;Lcom/google/android/t94;)V", "getFillableData$delegate", "fillableData", "getTraversalIndex", "(Lcom/google/android/nfb;)F", "G0", "(Lcom/google/android/nfb;F)V", "getTraversalIndex$delegate", "traversalIndex", "Lcom/google/android/a9b;", "getHorizontalScrollAxisRange", "(Lcom/google/android/nfb;)Lcom/google/android/a9b;", "i0", "(Lcom/google/android/nfb;Lcom/google/android/a9b;)V", "getHorizontalScrollAxisRange$delegate", "horizontalScrollAxisRange", "getVerticalScrollAxisRange", "H0", "getVerticalScrollAxisRange$delegate", "verticalScrollAxisRange", "Lcom/google/android/hpa;", "getRole", "p0", "getRole$delegate", "role", "getTestTag", "w0", "getTestTag$delegate", "testTag", "getText", "(Lcom/google/android/nfb;)Landroidx/compose/ui/text/b;", "x0", "(Lcom/google/android/nfb;Landroidx/compose/ui/text/b;)V", "text", "getTextSubstitution", "B0", "getTextSubstitution$delegate", "textSubstitution", "isShowingTextSubstitution", "u0", "isShowingTextSubstitution$delegate", "getInputText", "j0", "getInputText$delegate", "inputText", "getEditableText", "f0", "getEditableText$delegate", "editableText", "Landroidx/compose/ui/text/x;", "getTextSelectionRange", "(Lcom/google/android/nfb;)J", "A0", "(Lcom/google/android/nfb;J)V", "getTextSelectionRange$delegate", "textSelectionRange", "getSelected", "q0", "getSelected$delegate", "selected", "Lcom/google/android/nh1;", "getCollectionInfo", "(Lcom/google/android/nfb;)Lcom/google/android/nh1;", "Y", "(Lcom/google/android/nfb;Lcom/google/android/nh1;)V", "getCollectionInfo$delegate", "collectionInfo", "Landroidx/compose/ui/state/ToggleableState;", "getToggleableState", "(Lcom/google/android/nfb;)Landroidx/compose/ui/state/ToggleableState;", "E0", "(Lcom/google/android/nfb;Landroidx/compose/ui/state/ToggleableState;)V", "getToggleableState$delegate", "toggleableState", "isEditable", "e0", "isEditable$delegate", "Lcom/google/android/xkb;", "getShape", "(Lcom/google/android/nfb;)Lcom/google/android/xkb;", "t0", "(Lcom/google/android/nfb;Lcom/google/android/xkb;)V", "getShape$delegate", "shape", "", "Lcom/google/android/gi2;", "getCustomActions", "(Lcom/google/android/nfb;)Ljava/util/List;", "d0", "(Lcom/google/android/nfb;Ljava/util/List;)V", "getCustomActions$delegate", "customActions", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class SemanticsPropertiesKt {
    static final /* synthetic */ ph6<Object>[] a = {new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "textCompositionRange", "getTextCompositionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/TextRange;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "inputTextSuggestionState", "getInputTextSuggestionState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/InputTextSuggestionState;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;", 1), new MutablePropertyReference1Impl<>(SemanticsPropertiesKt.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;", 1)};

    static {
        SemanticsProperties semanticsProperties = SemanticsProperties.a;
        semanticsProperties.J();
        semanticsProperties.E();
        semanticsProperties.C();
        semanticsProperties.A();
        semanticsProperties.j();
        semanticsProperties.s();
        semanticsProperties.y();
        semanticsProperties.w();
        semanticsProperties.e();
        semanticsProperties.c();
        semanticsProperties.i();
        semanticsProperties.R();
        semanticsProperties.m();
        semanticsProperties.S();
        semanticsProperties.F();
        semanticsProperties.K();
        semanticsProperties.P();
        semanticsProperties.x();
        semanticsProperties.p();
        semanticsProperties.g();
        semanticsProperties.O();
        semanticsProperties.M();
        semanticsProperties.n();
        semanticsProperties.H();
        semanticsProperties.a();
        semanticsProperties.b();
        semanticsProperties.Q();
        semanticsProperties.q();
        semanticsProperties.u();
        semanticsProperties.B();
        semanticsProperties.I();
        SemanticsActions.a.d();
    }

    public static final void A(nfb nfbVar, int i, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsProperties.a.n(), androidx.compose.ui.text.input.a.j(i));
        nfbVar.b(SemanticsActions.a.n(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void A0(nfb nfbVar, long j) {
        SemanticsProperties.a.O().e(nfbVar, a[20], x.b(j));
    }

    public static /* synthetic */ void B(nfb nfbVar, int i, String str, Function0 function0, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        A(nfbVar, i, str, function0);
    }

    public static final void B0(nfb nfbVar, androidx.compose.ui.text.b bVar) {
        SemanticsProperties.a.P().e(nfbVar, a[16], bVar);
    }

    public static final void C(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.o(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void C0(nfb nfbVar, String str, Function1<? super androidx.compose.ui.text.b, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.B(), new AccessibilityAction(str, (ws4) function1));
    }

    public static /* synthetic */ void D(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        C(nfbVar, str, function0);
    }

    public static /* synthetic */ void D0(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        C0(nfbVar, str, function1);
    }

    public static final void E(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.p(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void E0(nfb nfbVar, ToggleableState toggleableState) {
        SemanticsProperties.a.Q().e(nfbVar, a[26], toggleableState);
    }

    public static /* synthetic */ void F(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        E(nfbVar, str, function0);
    }

    public static final void F0(nfb nfbVar, boolean z) {
        SemanticsProperties.a.y().e(nfbVar, a[6], Boolean.valueOf(z));
    }

    public static final void G(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.q(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void G0(nfb nfbVar, float f) {
        SemanticsProperties.a.R().e(nfbVar, a[11], Float.valueOf(f));
    }

    public static /* synthetic */ void H(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        G(nfbVar, str, function0);
    }

    public static final void H0(nfb nfbVar, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.a.S().e(nfbVar, a[13], scrollAxisRange);
    }

    public static final void I(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.r(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void I0(nfb nfbVar, String str, Function1<? super Boolean, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.C(), new AccessibilityAction(str, (ws4) function1));
    }

    public static /* synthetic */ void J(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        I(nfbVar, str, function0);
    }

    public static /* synthetic */ void J0(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        I0(nfbVar, str, function1);
    }

    public static final void K(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.s(), new AccessibilityAction(str, (ws4) function0));
    }

    public static /* synthetic */ void L(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        K(nfbVar, str, function0);
    }

    public static final void M(nfb nfbVar) {
        nfbVar.b(SemanticsProperties.a.D(), Unit.a);
    }

    public static final void N(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.t(), new AccessibilityAction(str, (ws4) function0));
    }

    public static /* synthetic */ void O(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        N(nfbVar, str, function0);
    }

    public static final void P(nfb nfbVar) {
        nfbVar.b(SemanticsProperties.a.v(), Unit.a);
    }

    public static final void Q(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.u(), new AccessibilityAction(str, (ws4) function0));
    }

    public static /* synthetic */ void R(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        Q(nfbVar, str, function0);
    }

    public static final void S(nfb nfbVar, String str, Function2<? super Float, ? super Float, Boolean> function2) {
        nfbVar.b(SemanticsActions.a.v(), new AccessibilityAction(str, (ws4) function2));
    }

    public static /* synthetic */ void T(nfb nfbVar, String str, Function2 function2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        S(nfbVar, str, function2);
    }

    public static final void U(nfb nfbVar, Function2<? super rn8, ? super q22<? super rn8>, ? extends Object> function2) {
        nfbVar.b(SemanticsActions.a.w(), function2);
    }

    public static final void V(nfb nfbVar, String str, Function1<? super Integer, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.x(), new AccessibilityAction(str, (ws4) function1));
    }

    public static /* synthetic */ void W(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        V(nfbVar, str, function1);
    }

    public static final void X(nfb nfbVar) {
        nfbVar.b(SemanticsProperties.a.G(), Unit.a);
    }

    public static final void Y(nfb nfbVar, CollectionInfo collectionInfo) {
        SemanticsProperties.a.a().e(nfbVar, a[24], collectionInfo);
    }

    public static final void Z(nfb nfbVar, boolean z) {
        SemanticsProperties.a.s().e(nfbVar, a[5], Boolean.valueOf(z));
    }

    public static final void a(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.a(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void a0(nfb nfbVar, androidx.compose.ui.autofill.c cVar) {
        SemanticsProperties.a.c().e(nfbVar, a[9], cVar);
    }

    public static /* synthetic */ void b(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        a(nfbVar, str, function0);
    }

    public static final void b0(nfb nfbVar, String str) {
        nfbVar.b(SemanticsProperties.a.d(), m.e(str));
    }

    public static final void c(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.b(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void c0(nfb nfbVar, d dVar) {
        SemanticsProperties.a.e().e(nfbVar, a[8], dVar);
    }

    public static final void d(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.c(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void d0(nfb nfbVar, List<CustomAccessibilityAction> list) {
        SemanticsActions.a.d().e(nfbVar, a[31], list);
    }

    public static /* synthetic */ void e(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        d(nfbVar, str, function0);
    }

    public static final void e0(nfb nfbVar, boolean z) {
        SemanticsProperties.a.u().e(nfbVar, a[28], Boolean.valueOf(z));
    }

    public static final void f(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.e(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void f0(nfb nfbVar, androidx.compose.ui.text.b bVar) {
        SemanticsProperties.a.g().e(nfbVar, a[19], bVar);
    }

    public static /* synthetic */ void g(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        f(nfbVar, str, function0);
    }

    public static final void g0(nfb nfbVar, t94 t94Var) {
        SemanticsProperties.a.i().e(nfbVar, a[10], t94Var);
    }

    public static final void h(nfb nfbVar) {
        nfbVar.b(SemanticsProperties.a.t(), Unit.a);
    }

    public static final void h0(nfb nfbVar, boolean z) {
        SemanticsProperties.a.j().e(nfbVar, a[4], Boolean.valueOf(z));
    }

    public static final void i(nfb nfbVar) {
        nfbVar.b(SemanticsProperties.a.f(), Unit.a);
    }

    public static final void i0(nfb nfbVar, ScrollAxisRange scrollAxisRange) {
        SemanticsProperties.a.m().e(nfbVar, a[12], scrollAxisRange);
    }

    public static final void j(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.f(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void j0(nfb nfbVar, androidx.compose.ui.text.b bVar) {
        SemanticsProperties.a.p().e(nfbVar, a[18], bVar);
    }

    public static /* synthetic */ void k(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        j(nfbVar, str, function0);
    }

    public static final void k0(nfb nfbVar, int i) {
        SemanticsProperties.a.A().e(nfbVar, a[3], d57.c(i));
    }

    public static final void l(nfb nfbVar, String str) {
        nfbVar.b(SemanticsProperties.a.h(), str);
    }

    public static final void l0(nfb nfbVar, String str) {
        SemanticsProperties.a.C().e(nfbVar, a[2], str);
    }

    public static final void m(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.g(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void m0(nfb nfbVar, String str, Function1<? super Float, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.y(), new AccessibilityAction(str, (ws4) function1));
    }

    public static final void n(nfb nfbVar, String str, final Function0<Float> function0) {
        nfbVar.b(SemanticsActions.a.h(), new AccessibilityAction(str, new Function1<List<Float>, Boolean>() { // from class: androidx.compose.ui.semantics.SemanticsPropertiesKt$getScrollViewportLength$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(List<Float> list) {
                boolean z;
                Float f = (Float) function0.invoke();
                if (f == null) {
                    z = false;
                } else {
                    list.add(f);
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        }));
    }

    public static /* synthetic */ void n0(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        m0(nfbVar, str, function1);
    }

    public static /* synthetic */ void o(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        n(nfbVar, str, function0);
    }

    public static final void o0(nfb nfbVar, ProgressBarRangeInfo progressBarRangeInfo) {
        SemanticsProperties.a.E().e(nfbVar, a[1], progressBarRangeInfo);
    }

    public static final void p(nfb nfbVar, String str, Function1<? super List<TextLayoutResult>, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.i(), new AccessibilityAction(str, (ws4) function1));
    }

    public static final void p0(nfb nfbVar, int i) {
        SemanticsProperties.a.F().e(nfbVar, a[14], hpa.j(i));
    }

    public static /* synthetic */ void q(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        p(nfbVar, str, function1);
    }

    public static final void q0(nfb nfbVar, boolean z) {
        SemanticsProperties.a.H().e(nfbVar, a[23], Boolean.valueOf(z));
    }

    public static final void r(nfb nfbVar) {
        nfbVar.b(SemanticsProperties.a.k(), Unit.a);
    }

    public static final void r0(nfb nfbVar, String str, ps4<? super Integer, ? super Integer, ? super Boolean, Boolean> ps4Var) {
        nfbVar.b(SemanticsActions.a.z(), new AccessibilityAction(str, ps4Var));
    }

    public static final void s(nfb nfbVar) {
        nfbVar.b(SemanticsProperties.a.l(), Unit.a);
    }

    public static /* synthetic */ void s0(nfb nfbVar, String str, ps4 ps4Var, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        r0(nfbVar, str, ps4Var);
    }

    public static final void t(nfb nfbVar, Function1<Object, Integer> function1) {
        nfbVar.b(SemanticsProperties.a.o(), function1);
    }

    public static final void t0(nfb nfbVar, xkb xkbVar) {
        SemanticsProperties.a.I().e(nfbVar, a[30], xkbVar);
    }

    public static final void u(nfb nfbVar, String str, Function1<? super androidx.compose.ui.text.b, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.j(), new AccessibilityAction(str, (ws4) function1));
    }

    public static final void u0(nfb nfbVar, boolean z) {
        SemanticsProperties.a.x().e(nfbVar, a[17], Boolean.valueOf(z));
    }

    public static /* synthetic */ void v(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        u(nfbVar, str, function1);
    }

    public static final void v0(nfb nfbVar, String str) {
        SemanticsProperties.a.J().e(nfbVar, a[0], str);
    }

    public static final void w(nfb nfbVar, String str, Function0<Boolean> function0) {
        nfbVar.b(SemanticsActions.a.l(), new AccessibilityAction(str, (ws4) function0));
    }

    public static final void w0(nfb nfbVar, String str) {
        SemanticsProperties.a.K().e(nfbVar, a[15], str);
    }

    public static /* synthetic */ void x(nfb nfbVar, String str, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        w(nfbVar, str, function0);
    }

    public static final void x0(nfb nfbVar, androidx.compose.ui.text.b bVar) {
        nfbVar.b(SemanticsProperties.a.L(), m.e(bVar));
    }

    public static final void y(nfb nfbVar, String str, Function1<? super t94, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.m(), new AccessibilityAction(str, (ws4) function1));
    }

    public static final void y0(nfb nfbVar, String str, Function1<? super androidx.compose.ui.text.b, Boolean> function1) {
        nfbVar.b(SemanticsActions.a.A(), new AccessibilityAction(str, (ws4) function1));
    }

    public static /* synthetic */ void z(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        y(nfbVar, str, function1);
    }

    public static /* synthetic */ void z0(nfb nfbVar, String str, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        y0(nfbVar, str, function1);
    }
}
