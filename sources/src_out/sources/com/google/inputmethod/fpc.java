package com.google.inputmethod;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.DrawFilter;
import android.graphics.Matrix;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Picture;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.RenderNode;
import android.graphics.fonts.Font;
import android.graphics.text.MeasuredText;
import com.google.android.r43;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\b\f\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0019\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\r\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0017\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u0014J\u000f\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001c\u0010\u0014J+\u0010!\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0017¢\u0006\u0004\b!\u0010\"J#\u0010!\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010#JA\u0010!\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010 \u001a\u00020\u0012H\u0017¢\u0006\u0004\b!\u0010)J9\u0010!\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b!\u0010*J)\u0010,\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0017¢\u0006\u0004\b,\u0010-J!\u0010,\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u00010\u001d2\u0006\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u0010.J?\u0010,\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010+\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0012H\u0017¢\u0006\u0004\b,\u0010/J7\u0010,\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010+\u001a\u00020\u0012H\u0016¢\u0006\u0004\b,\u00100J\u000f\u00101\u001a\u00020\u000bH\u0016¢\u0006\u0004\b1\u0010\u0003J\u000f\u00102\u001a\u00020\u0012H\u0016¢\u0006\u0004\b2\u0010\u0014J\u0017\u00104\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u0012H\u0016¢\u0006\u0004\b4\u0010\u0019J\u001f\u00107\u001a\u00020\u000b2\u0006\u00105\u001a\u00020$2\u0006\u00106\u001a\u00020$H\u0016¢\u0006\u0004\b7\u00108J\u001f\u0010;\u001a\u00020\u000b2\u0006\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020$H\u0016¢\u0006\u0004\b;\u00108J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010<\u001a\u00020$H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010?\u001a\u00020\u000b2\u0006\u00109\u001a\u00020$2\u0006\u0010:\u001a\u00020$H\u0016¢\u0006\u0004\b?\u00108J\u0019\u0010B\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bB\u0010CJ\u0019\u0010D\u001a\u00020\u000b2\b\u0010A\u001a\u0004\u0018\u00010@H\u0016¢\u0006\u0004\bD\u0010CJ\u0017\u0010F\u001a\u00020\u000b2\u0006\u0010E\u001a\u00020@H\u0017¢\u0006\u0004\bF\u0010CJ\u001f\u0010J\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010I\u001a\u00020HH\u0017¢\u0006\u0004\bJ\u0010KJ\u001f\u0010J\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u00042\u0006\u0010I\u001a\u00020HH\u0017¢\u0006\u0004\bJ\u0010LJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u001dH\u0016¢\u0006\u0004\bJ\u0010MJ\u0017\u0010J\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0004H\u0016¢\u0006\u0004\bJ\u0010\bJ7\u0010J\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010I\u001a\u00020HH\u0017¢\u0006\u0004\bJ\u0010NJ/\u0010J\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0016¢\u0006\u0004\bJ\u0010OJ/\u0010J\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0016¢\u0006\u0004\bJ\u0010PJ\u0017\u0010Q\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u001dH\u0017¢\u0006\u0004\bQ\u0010MJ\u0017\u0010Q\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u0004H\u0017¢\u0006\u0004\bQ\u0010\bJ/\u0010Q\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0017¢\u0006\u0004\bQ\u0010OJ/\u0010Q\u001a\u00020\u00062\u0006\u0010%\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u00122\u0006\u0010(\u001a\u00020\u0012H\u0017¢\u0006\u0004\bQ\u0010PJ\u001f\u0010T\u001a\u00020\u00062\u0006\u0010S\u001a\u00020R2\u0006\u0010I\u001a\u00020HH\u0017¢\u0006\u0004\bT\u0010UJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010S\u001a\u00020RH\u0016¢\u0006\u0004\bT\u0010VJ\u0017\u0010W\u001a\u00020\u00062\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\bW\u0010VJ\u0011\u0010Y\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\bY\u0010ZJ\u0019\u0010\\\u001a\u00020\u000b2\b\u0010[\u001a\u0004\u0018\u00010XH\u0016¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010_\u001a\u00020^H\u0017¢\u0006\u0004\b`\u0010aJ\u0017\u0010`\u001a\u00020\u00062\u0006\u0010G\u001a\u00020\u001dH\u0017¢\u0006\u0004\b`\u0010MJ\u001f\u0010`\u001a\u00020\u00062\u0006\u0010S\u001a\u00020R2\u0006\u0010_\u001a\u00020^H\u0017¢\u0006\u0004\b`\u0010bJ\u0017\u0010`\u001a\u00020\u00062\u0006\u0010S\u001a\u00020RH\u0017¢\u0006\u0004\b`\u0010VJ7\u0010`\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010_\u001a\u00020^H\u0017¢\u0006\u0004\b`\u0010cJ/\u0010`\u001a\u00020\u00062\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$H\u0017¢\u0006\u0004\b`\u0010OJ\u0017\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020dH\u0016¢\u0006\u0004\bf\u0010gJ\u001f\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020d2\u0006\u0010h\u001a\u00020\u001dH\u0016¢\u0006\u0004\bf\u0010iJ\u001f\u0010f\u001a\u00020\u000b2\u0006\u0010e\u001a\u00020d2\u0006\u0010h\u001a\u00020\u0004H\u0016¢\u0006\u0004\bf\u0010jJ7\u0010o\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u001d2\u0006\u0010l\u001a\u00020$2\u0006\u0010m\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bo\u0010pJO\u0010o\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010l\u001a\u00020$2\u0006\u0010m\u001a\u00020$2\u0006\u0010n\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\bo\u0010qJ/\u0010v\u001a\u00020\u000b2\u0006\u0010r\u001a\u00020\u00122\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0012H\u0016¢\u0006\u0004\bv\u0010wJ1\u0010x\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\bx\u0010yJ3\u0010x\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010h\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\bx\u0010{J3\u0010x\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\b\u0010z\u001a\u0004\u0018\u00010\u00042\u0006\u0010h\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\bx\u0010|J`\u0010x\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010\u0080\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0007\u0010\u0083\u0001\u001a\u00020\u00122\u0007\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0085\u0001\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0005\bx\u0010\u0086\u0001J`\u0010x\u001a\u00020\u000b2\u0006\u0010~\u001a\u00020}2\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010\u0080\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020\u00122\u0007\u0010\u0082\u0001\u001a\u00020\u00122\u0007\u0010\u0083\u0001\u001a\u00020\u00122\u0007\u0010\u0084\u0001\u001a\u00020\u00122\u0007\u0010\u0085\u0001\u001a\u00020\u00062\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0005\bx\u0010\u0087\u0001J*\u0010x\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010A\u001a\u00020@2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0005\bx\u0010\u0088\u0001J\\\u0010\u008f\u0001\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0007\u0010\u0089\u0001\u001a\u00020\u00122\u0007\u0010\u008a\u0001\u001a\u00020\u00122\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008d\u0001\u001a\u00020\u00122\b\u0010~\u001a\u0004\u0018\u00010}2\u0007\u0010\u008e\u0001\u001a\u00020\u00122\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J5\u0010\u0094\u0001\u001a\u00020\u000b2\u0007\u0010\u0091\u0001\u001a\u00020$2\u0007\u0010\u0092\u0001\u001a\u00020$2\u0007\u0010\u0093\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001a\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0096\u0001\u001a\u00020\u0012H\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0019J\u001c\u0010\u0097\u0001\u001a\u00020\u000b2\b\u0010\u0096\u0001\u001a\u00030\u0098\u0001H\u0017¢\u0006\u0006\b\u0097\u0001\u0010\u0099\u0001J%\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0096\u0001\u001a\u00020\u00122\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u009c\u0001J%\u0010\u0097\u0001\u001a\u00020\u000b2\u0007\u0010\u0096\u0001\u001a\u00020\u00122\b\u0010\u009b\u0001\u001a\u00030\u009d\u0001H\u0017¢\u0006\u0006\b\u0097\u0001\u0010\u009e\u0001J&\u0010\u0097\u0001\u001a\u00020\u000b2\b\u0010\u0096\u0001\u001a\u00030\u0098\u00012\b\u0010\u009b\u0001\u001a\u00030\u009d\u0001H\u0017¢\u0006\u0006\b\u0097\u0001\u0010\u009f\u0001J>\u0010¤\u0001\u001a\u00020\u000b2\u0007\u0010 \u0001\u001a\u00020$2\u0007\u0010¡\u0001\u001a\u00020$2\u0007\u0010¢\u0001\u001a\u00020$2\u0007\u0010£\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¤\u0001\u0010¥\u0001J5\u0010¨\u0001\u001a\u00020\u000b2\b\u0010¦\u0001\u001a\u00030\u008b\u00012\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¨\u0001\u0010©\u0001J$\u0010¨\u0001\u001a\u00020\u000b2\b\u0010¦\u0001\u001a\u00030\u008b\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¨\u0001\u0010ª\u0001J\"\u0010«\u0001\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b«\u0001\u0010¬\u0001J:\u0010«\u0001\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b«\u0001\u0010¥\u0001J\u001a\u0010\u00ad\u0001\u001a\u00020\u000b2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J.\u0010±\u0001\u001a\u00020\u000b2\b\u0010°\u0001\u001a\u00030¯\u00012\u0006\u0010h\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0006\b±\u0001\u0010²\u0001J.\u0010±\u0001\u001a\u00020\u000b2\b\u0010°\u0001\u001a\u00030¯\u00012\u0006\u0010h\u001a\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0006\b±\u0001\u0010³\u0001J\"\u0010´\u0001\u001a\u00020\u000b2\u0006\u0010S\u001a\u00020R2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b´\u0001\u0010µ\u0001J,\u0010¶\u0001\u001a\u00020\u000b2\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¶\u0001\u0010·\u0001J7\u0010¸\u0001\u001a\u00020\u000b2\n\u0010¦\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0006\u0010\u007f\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¸\u0001\u0010©\u0001J$\u0010¸\u0001\u001a\u00020\u000b2\b\u0010¦\u0001\u001a\u00030\u008b\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\b¸\u0001\u0010ª\u0001J@\u0010½\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020\u00122\b\u0010¼\u0001\u001a\u00030\u008b\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\b½\u0001\u0010¾\u0001J.\u0010½\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¿\u00012\b\u0010¼\u0001\u001a\u00030\u008b\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\b½\u0001\u0010À\u0001J\"\u0010Á\u0001\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÁ\u0001\u0010¬\u0001J\"\u0010Á\u0001\u001a\u00020\u000b2\u0006\u0010s\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÁ\u0001\u0010Â\u0001J:\u0010Á\u0001\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÁ\u0001\u0010¥\u0001J*\u0010Ã\u0001\u001a\u00020\u000b2\u0006\u0010s\u001a\u00020\u00122\u0006\u0010t\u001a\u00020\u00122\u0006\u0010u\u001a\u00020\u0012H\u0016¢\u0006\u0006\bÃ\u0001\u0010Ä\u0001J4\u0010Ç\u0001\u001a\u00020\u000b2\u0006\u0010G\u001a\u00020\u001d2\u0007\u0010Å\u0001\u001a\u00020$2\u0007\u0010Æ\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÇ\u0001\u0010È\u0001JL\u0010Ç\u0001\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020$2\u0006\u0010'\u001a\u00020$2\u0006\u0010(\u001a\u00020$2\u0007\u0010Å\u0001\u001a\u00020$2\u0007\u0010Æ\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÇ\u0001\u0010É\u0001JP\u0010Ð\u0001\u001a\u00020\u000b2\u0007\u0010Ê\u0001\u001a\u00020\u001d2\u0007\u0010Ë\u0001\u001a\u00020$2\u0007\u0010Ì\u0001\u001a\u00020$2\u0007\u0010Í\u0001\u001a\u00020\u001d2\u0007\u0010Î\u0001\u001a\u00020$2\u0007\u0010Ï\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J@\u0010Ð\u0001\u001a\u00020\u000b2\u0007\u0010Ê\u0001\u001a\u00020\u001d2\b\u0010Ò\u0001\u001a\u00030\u008b\u00012\u0007\u0010Í\u0001\u001a\u00020\u001d2\b\u0010Ó\u0001\u001a\u00030\u008b\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\bÐ\u0001\u0010Ô\u0001JR\u0010Ü\u0001\u001a\u00020\u000b2\u0007\u0010Õ\u0001\u001a\u00020}2\u0007\u0010Ö\u0001\u001a\u00020\u00122\b\u0010×\u0001\u001a\u00030\u008b\u00012\u0007\u0010Ø\u0001\u001a\u00020\u00122\u0007\u0010Ù\u0001\u001a\u00020\u00122\b\u0010Û\u0001\u001a\u00030Ú\u00012\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\bÜ\u0001\u0010Ý\u0001JH\u0010Þ\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÞ\u0001\u0010ß\u0001J6\u0010Þ\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¿\u00012\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÞ\u0001\u0010à\u0001JH\u0010Þ\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¿\u00012\u0007\u0010á\u0001\u001a\u00020\u00122\u0007\u0010â\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÞ\u0001\u0010ã\u0001JH\u0010Þ\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030ä\u00012\u0007\u0010á\u0001\u001a\u00020\u00122\u0007\u0010â\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bÞ\u0001\u0010å\u0001JP\u0010è\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020\u00122\u0006\u0010S\u001a\u00020R2\u0007\u0010æ\u0001\u001a\u00020$2\u0007\u0010ç\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bè\u0001\u0010é\u0001J>\u0010è\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¿\u00012\u0006\u0010S\u001a\u00020R2\u0007\u0010æ\u0001\u001a\u00020$2\u0007\u0010ç\u0001\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bè\u0001\u0010ê\u0001Jc\u0010î\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030¹\u00012\u0007\u0010»\u0001\u001a\u00020\u00122\u0007\u0010§\u0001\u001a\u00020\u00122\u0007\u0010ë\u0001\u001a\u00020\u00122\u0007\u0010ì\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0007\u0010í\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\bî\u0001\u0010ï\u0001Jc\u0010î\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030ä\u00012\u0007\u0010á\u0001\u001a\u00020\u00122\u0007\u0010â\u0001\u001a\u00020\u00122\u0007\u0010ð\u0001\u001a\u00020\u00122\u0007\u0010ñ\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0007\u0010í\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\bî\u0001\u0010ò\u0001Jc\u0010î\u0001\u001a\u00020\u000b2\b\u0010º\u0001\u001a\u00030ó\u00012\u0007\u0010á\u0001\u001a\u00020\u00122\u0007\u0010â\u0001\u001a\u00020\u00122\u0007\u0010ð\u0001\u001a\u00020\u00122\u0007\u0010ñ\u0001\u001a\u00020\u00122\u0007\u0010\u0081\u0001\u001a\u00020$2\u0007\u0010\u0082\u0001\u001a\u00020$2\u0007\u0010í\u0001\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001eH\u0017¢\u0006\u0006\bî\u0001\u0010ô\u0001J\u0086\u0001\u0010ý\u0001\u001a\u00020\u000b2\b\u0010\u009b\u0001\u001a\u00030õ\u00012\u0007\u0010ö\u0001\u001a\u00020\u00122\b\u0010\u008c\u0001\u001a\u00030\u008b\u00012\u0007\u0010\u008d\u0001\u001a\u00020\u00122\n\u0010÷\u0001\u001a\u0005\u0018\u00010\u008b\u00012\u0007\u0010ø\u0001\u001a\u00020\u00122\b\u0010~\u001a\u0004\u0018\u00010}2\u0007\u0010\u008e\u0001\u001a\u00020\u00122\n\u0010ú\u0001\u001a\u0005\u0018\u00010ù\u00012\u0007\u0010û\u0001\u001a\u00020\u00122\u0007\u0010ü\u0001\u001a\u00020\u00122\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0006\bý\u0001\u0010þ\u0001J\u001c\u0010\u0081\u0002\u001a\u00020\u000b2\b\u0010\u0080\u0002\u001a\u00030ÿ\u0001H\u0017¢\u0006\u0006\b\u0081\u0002\u0010\u0082\u0002R0\u0010\u0088\u0002\u001a\u0004\u0018\u00010\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001d\n\u0005\br\u0010\u0083\u0002\u0012\u0005\b\u0087\u0002\u0010\u0003\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0005\bu\u0010\u0086\u0002R\u0016\u0010\u0089\u0002\u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0007\u001a\u0005\br\u0010\u0085\u0002¨\u0006\u008a\u0002"}, d2 = {"Lcom/google/android/fpc;", "Landroid/graphics/Canvas;", "<init>", "()V", "Landroid/graphics/Rect;", "bounds", "", "getClipBounds", "(Landroid/graphics/Rect;)Z", "Landroid/graphics/Bitmap;", "bitmap", "", "setBitmap", "(Landroid/graphics/Bitmap;)V", "enableZ", "disableZ", "isOpaque", "()Z", "", "getWidth", "()I", "getHeight", "getDensity", "density", "setDensity", "(I)V", "getMaximumBitmapWidth", "getMaximumBitmapHeight", "save", "Landroid/graphics/RectF;", "Landroid/graphics/Paint;", "paint", "saveFlags", "saveLayer", "(Landroid/graphics/RectF;Landroid/graphics/Paint;I)I", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)I", "", "left", "top", "right", "bottom", "(FFFFLandroid/graphics/Paint;I)I", "(FFFFLandroid/graphics/Paint;)I", "alpha", "saveLayerAlpha", "(Landroid/graphics/RectF;II)I", "(Landroid/graphics/RectF;I)I", "(FFFFII)I", "(FFFFI)I", "restore", "getSaveCount", "saveCount", "restoreToCount", "dx", "dy", "translate", "(FF)V", "sx", "sy", "scale", "degrees", "rotate", "(F)V", "skew", "Landroid/graphics/Matrix;", "matrix", "concat", "(Landroid/graphics/Matrix;)V", "setMatrix", "ctm", "getMatrix", "rect", "Landroid/graphics/Region$Op;", "op", "clipRect", "(Landroid/graphics/RectF;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Rect;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/RectF;)Z", "(FFFFLandroid/graphics/Region$Op;)Z", "(FFFF)Z", "(IIII)Z", "clipOutRect", "Landroid/graphics/Path;", "path", "clipPath", "(Landroid/graphics/Path;Landroid/graphics/Region$Op;)Z", "(Landroid/graphics/Path;)Z", "clipOutPath", "Landroid/graphics/DrawFilter;", "getDrawFilter", "()Landroid/graphics/DrawFilter;", "filter", "setDrawFilter", "(Landroid/graphics/DrawFilter;)V", "Landroid/graphics/Canvas$EdgeType;", "type", "quickReject", "(Landroid/graphics/RectF;Landroid/graphics/Canvas$EdgeType;)Z", "(Landroid/graphics/Path;Landroid/graphics/Canvas$EdgeType;)Z", "(FFFFLandroid/graphics/Canvas$EdgeType;)Z", "Landroid/graphics/Picture;", "picture", "drawPicture", "(Landroid/graphics/Picture;)V", "dst", "(Landroid/graphics/Picture;Landroid/graphics/RectF;)V", "(Landroid/graphics/Picture;Landroid/graphics/Rect;)V", "oval", "startAngle", "sweepAngle", "useCenter", "drawArc", "(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V", "(FFFFFFZLandroid/graphics/Paint;)V", "a", "r", "g", "b", "drawARGB", "(IIII)V", "drawBitmap", "(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V", "src", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "", "colors", "offset", "stride", "x", "y", "width", "height", "hasAlpha", "([IIIFFIIZLandroid/graphics/Paint;)V", "([IIIIIIIZLandroid/graphics/Paint;)V", "(Landroid/graphics/Bitmap;Landroid/graphics/Matrix;Landroid/graphics/Paint;)V", "meshWidth", "meshHeight", "", "verts", "vertOffset", "colorOffset", "drawBitmapMesh", "(Landroid/graphics/Bitmap;II[FI[IILandroid/graphics/Paint;)V", "cx", "cy", "radius", "drawCircle", "(FFFLandroid/graphics/Paint;)V", "color", "drawColor", "", "(J)V", "Landroid/graphics/PorterDuff$Mode;", "mode", "(ILandroid/graphics/PorterDuff$Mode;)V", "Landroid/graphics/BlendMode;", "(ILandroid/graphics/BlendMode;)V", "(JLandroid/graphics/BlendMode;)V", "startX", "startY", "stopX", "stopY", "drawLine", "(FFFFLandroid/graphics/Paint;)V", "pts", "count", "drawLines", "([FIILandroid/graphics/Paint;)V", "([FLandroid/graphics/Paint;)V", "drawOval", "(Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPaint", "(Landroid/graphics/Paint;)V", "Landroid/graphics/NinePatch;", "patch", "drawPatch", "(Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "(Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "drawPath", "(Landroid/graphics/Path;Landroid/graphics/Paint;)V", "drawPoint", "(FFLandroid/graphics/Paint;)V", "drawPoints", "", "text", "index", "pos", "drawPosText", "([CII[FLandroid/graphics/Paint;)V", "", "(Ljava/lang/String;[FLandroid/graphics/Paint;)V", "drawRect", "(Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "drawRGB", "(III)V", "rx", "ry", "drawRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "(FFFFFFLandroid/graphics/Paint;)V", "outer", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "drawDoubleRoundRect", "(Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "outerRadii", "innerRadii", "(Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "glyphIds", "glyphIdOffset", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "drawGlyphs", "([II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "drawText", "([CIIFFLandroid/graphics/Paint;)V", "(Ljava/lang/String;FFLandroid/graphics/Paint;)V", "start", "end", "(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V", "", "(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V", "hOffset", "vOffset", "drawTextOnPath", "([CIILandroid/graphics/Path;FFLandroid/graphics/Paint;)V", "(Ljava/lang/String;Landroid/graphics/Path;FFLandroid/graphics/Paint;)V", "contextIndex", "contextCount", "isRtl", "drawTextRun", "([CIIIIFFZLandroid/graphics/Paint;)V", "contextStart", "contextEnd", "(Ljava/lang/CharSequence;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "(Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/Canvas$VertexMode;", "vertexCount", "texs", "texOffset", "", "indices", "indexOffset", "indexCount", "drawVertices", "(Landroid/graphics/Canvas$VertexMode;I[FI[FI[II[SIILandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "drawRenderNode", "(Landroid/graphics/RenderNode;)V", "Landroid/graphics/Canvas;", "get_nativeCanvas$ui_text", "()Landroid/graphics/Canvas;", "(Landroid/graphics/Canvas;)V", "get_nativeCanvas$ui_text$annotations", "_nativeCanvas", "nativeCanvas", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class fpc extends Canvas {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private Canvas _nativeCanvas;

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    private final Canvas a() throws KotlinNothingValueException {
        Canvas canvas = this._nativeCanvas;
        if (canvas != null) {
            return canvas;
        }
        ax5.d("Text drawing wrapper is missing a Canvas!");
        throw new KotlinNothingValueException();
    }

    public final void b(Canvas canvas) {
        this._nativeCanvas = canvas;
    }

    @Override // android.graphics.Canvas
    public boolean clipOutPath(Path path) {
        return z41.a.a(a(), path);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(RectF rect) {
        return z41.a.e(a(), rect);
    }

    @Override // android.graphics.Canvas
    @r43
    public boolean clipPath(Path path, Region.Op op) {
        return a().clipPath(path, op);
    }

    @Override // android.graphics.Canvas
    @r43
    public boolean clipRect(RectF rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void concat(Matrix matrix) {
        a().concat(matrix);
    }

    @Override // android.graphics.Canvas
    public void disableZ() {
        g51.a.a(a());
    }

    @Override // android.graphics.Canvas
    public void drawARGB(int a, int r, int g, int b) {
        a().drawARGB(a, r, g, b);
    }

    @Override // android.graphics.Canvas
    public void drawArc(RectF oval, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        a().drawArc(oval, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, float left, float top, Paint paint) {
        a().drawBitmap(bitmap, left, top, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmapMesh(Bitmap bitmap, int meshWidth, int meshHeight, float[] verts, int vertOffset, int[] colors, int colorOffset, Paint paint) {
        a().drawBitmapMesh(bitmap, meshWidth, meshHeight, verts, vertOffset, colors, colorOffset, paint);
    }

    @Override // android.graphics.Canvas
    public void drawCircle(float cx, float cy, float radius, Paint paint) {
        a().drawCircle(cx, cy, radius, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color) {
        a().drawColor(color);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float outerRx, float outerRy, RectF inner, float innerRx, float innerRy, Paint paint) {
        g51.a.e(a(), outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
    }

    @Override // android.graphics.Canvas
    public void drawGlyphs(int[] glyphIds, int glyphIdOffset, float[] positions, int positionOffset, int glyphCount, Font font, Paint paint) {
        o51.a.a(a(), glyphIds, glyphIdOffset, positions, positionOffset, glyphCount, font, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLine(float startX, float startY, float stopX, float stopY, Paint paint) {
        a().drawLine(startX, startY, stopX, stopY, paint);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, int offset, int count, Paint paint) {
        a().drawLines(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(RectF oval, Paint paint) {
        a().drawOval(oval, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPaint(Paint paint) {
        a().drawPaint(paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, Rect dst, Paint paint) {
        o51.a.b(a(), patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPath(Path path, Paint paint) {
        a().drawPath(path, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture) {
        a().drawPicture(picture);
    }

    @Override // android.graphics.Canvas
    public void drawPoint(float x, float y, Paint paint) {
        a().drawPoint(x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, int offset, int count, Paint paint) {
        a().drawPoints(pts, offset, count, paint);
    }

    @Override // android.graphics.Canvas
    @r43
    public void drawPosText(char[] text, int index, int count, float[] pos, Paint paint) {
        a().drawPosText(text, index, count, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRGB(int r, int g, int b) {
        a().drawRGB(r, g, b);
    }

    @Override // android.graphics.Canvas
    public void drawRect(RectF rect, Paint paint) {
        a().drawRect(rect, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRenderNode(RenderNode renderNode) {
        g51.a.g(a(), renderNode);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(RectF rect, float rx, float ry, Paint paint) {
        a().drawRoundRect(rect, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(char[] text, int index, int count, float x, float y, Paint paint) {
        a().drawText(text, index, count, x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(char[] text, int index, int count, Path path, float hOffset, float vOffset, Paint paint) {
        a().drawTextOnPath(text, index, count, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(char[] text, int index, int count, int contextIndex, int contextCount, float x, float y, boolean isRtl, Paint paint) {
        y41.a.b(a(), text, index, count, contextIndex, contextCount, x, y, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    public void drawVertices(Canvas.VertexMode mode, int vertexCount, float[] verts, int vertOffset, float[] texs, int texOffset, int[] colors, int colorOffset, short[] indices, int indexOffset, int indexCount, Paint paint) {
        a().drawVertices(mode, vertexCount, verts, vertOffset, texs, texOffset, colors, colorOffset, indices, indexOffset, indexCount, paint);
    }

    @Override // android.graphics.Canvas
    public void enableZ() {
        g51.a.i(a());
    }

    @Override // android.graphics.Canvas
    public boolean getClipBounds(Rect bounds) {
        boolean clipBounds = a().getClipBounds(bounds);
        if (clipBounds) {
            bounds.set(0, 0, bounds.width(), Integer.MAX_VALUE);
        }
        return clipBounds;
    }

    @Override // android.graphics.Canvas
    public int getDensity() {
        return a().getDensity();
    }

    @Override // android.graphics.Canvas
    public DrawFilter getDrawFilter() {
        return a().getDrawFilter();
    }

    @Override // android.graphics.Canvas
    public int getHeight() {
        return a().getHeight();
    }

    @Override // android.graphics.Canvas
    @r43
    public void getMatrix(Matrix ctm) {
        a().getMatrix(ctm);
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapHeight() {
        return a().getMaximumBitmapHeight();
    }

    @Override // android.graphics.Canvas
    public int getMaximumBitmapWidth() {
        return a().getMaximumBitmapWidth();
    }

    @Override // android.graphics.Canvas
    public int getSaveCount() {
        return a().getSaveCount();
    }

    @Override // android.graphics.Canvas
    public int getWidth() {
        return a().getWidth();
    }

    @Override // android.graphics.Canvas
    public boolean isOpaque() {
        return a().isOpaque();
    }

    @Override // android.graphics.Canvas
    @r43
    public boolean quickReject(RectF rect, Canvas.EdgeType type) {
        return a().quickReject(rect, type);
    }

    @Override // android.graphics.Canvas
    public void restore() {
        a().restore();
    }

    @Override // android.graphics.Canvas
    public void restoreToCount(int saveCount) {
        a().restoreToCount(saveCount);
    }

    @Override // android.graphics.Canvas
    public void rotate(float degrees) {
        a().rotate(degrees);
    }

    @Override // android.graphics.Canvas
    public int save() {
        return a().save();
    }

    @Override // android.graphics.Canvas
    @r43
    public int saveLayer(RectF bounds, Paint paint, int saveFlags) {
        return a().saveLayer(bounds, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @r43
    public int saveLayerAlpha(RectF bounds, int alpha, int saveFlags) {
        return a().saveLayerAlpha(bounds, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public void scale(float sx, float sy) {
        a().scale(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void setBitmap(Bitmap bitmap) {
        a().setBitmap(bitmap);
    }

    @Override // android.graphics.Canvas
    public void setDensity(int density) {
        a().setDensity(density);
    }

    @Override // android.graphics.Canvas
    public void setDrawFilter(DrawFilter filter) {
        a().setDrawFilter(filter);
    }

    @Override // android.graphics.Canvas
    public void setMatrix(Matrix matrix) {
        a().setMatrix(matrix);
    }

    @Override // android.graphics.Canvas
    public void skew(float sx, float sy) {
        a().skew(sx, sy);
    }

    @Override // android.graphics.Canvas
    public void translate(float dx, float dy) {
        a().translate(dx, dy);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(Rect rect) {
        return z41.a.d(a(), rect);
    }

    @Override // android.graphics.Canvas
    public boolean clipPath(Path path) {
        return a().clipPath(path);
    }

    @Override // android.graphics.Canvas
    @r43
    public boolean clipRect(Rect rect, Region.Op op) {
        return a().clipRect(rect, op);
    }

    @Override // android.graphics.Canvas
    public void drawArc(float left, float top, float right, float bottom, float startAngle, float sweepAngle, boolean useCenter, Paint paint) {
        a().drawArc(left, top, right, bottom, startAngle, sweepAngle, useCenter, paint);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, RectF dst, Paint paint) {
        a().drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color) {
        g51.a.c(a(), color);
    }

    @Override // android.graphics.Canvas
    public void drawLines(float[] pts, Paint paint) {
        a().drawLines(pts, paint);
    }

    @Override // android.graphics.Canvas
    public void drawOval(float left, float top, float right, float bottom, Paint paint) {
        a().drawOval(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPatch(NinePatch patch, RectF dst, Paint paint) {
        o51.a.c(a(), patch, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, RectF dst) {
        a().drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawPoints(float[] pts, Paint paint) {
        a().drawPoints(pts, paint);
    }

    @Override // android.graphics.Canvas
    @r43
    public void drawPosText(String text, float[] pos, Paint paint) {
        a().drawPosText(text, pos, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRect(Rect r, Paint paint) {
        a().drawRect(r, paint);
    }

    @Override // android.graphics.Canvas
    public void drawRoundRect(float left, float top, float right, float bottom, float rx, float ry, Paint paint) {
        a().drawRoundRect(left, top, right, bottom, rx, ry, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, float x, float y, Paint paint) {
        a().drawText(text, x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextOnPath(String text, Path path, float hOffset, float vOffset, Paint paint) {
        a().drawTextOnPath(text, path, hOffset, vOffset, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(RectF rect) {
        return k51.a.c(a(), rect);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(RectF bounds, Paint paint) {
        return a().saveLayer(bounds, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(RectF bounds, int alpha) {
        return a().saveLayerAlpha(bounds, alpha);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(float left, float top, float right, float bottom) {
        return z41.a.b(a(), left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(RectF rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Rect src, Rect dst, Paint paint) {
        a().drawBitmap(bitmap, src, dst, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, PorterDuff.Mode mode) {
        a().drawColor(color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawPicture(Picture picture, Rect dst) {
        a().drawPicture(picture, dst);
    }

    @Override // android.graphics.Canvas
    public void drawRect(float left, float top, float right, float bottom, Paint paint) {
        a().drawRect(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(String text, int start, int end, float x, float y, Paint paint) {
        a().drawText(text, start, end, x, y, paint);
    }

    @Override // android.graphics.Canvas
    @r43
    public boolean quickReject(Path path, Canvas.EdgeType type) {
        return a().quickReject(path, type);
    }

    @Override // android.graphics.Canvas
    @r43
    public int saveLayer(float left, float top, float right, float bottom, Paint paint, int saveFlags) {
        return a().saveLayer(left, top, right, bottom, paint, saveFlags);
    }

    @Override // android.graphics.Canvas
    @r43
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha, int saveFlags) {
        return a().saveLayerAlpha(left, top, right, bottom, alpha, saveFlags);
    }

    @Override // android.graphics.Canvas
    public boolean clipOutRect(int left, int top, int right, int bottom) {
        return z41.a.c(a(), left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(Rect rect) {
        return a().clipRect(rect);
    }

    @Override // android.graphics.Canvas
    @r43
    public void drawBitmap(int[] colors, int offset, int stride, float x, float y, int width, int height, boolean hasAlpha, Paint paint) {
        a().drawBitmap(colors, offset, stride, x, y, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(int color, BlendMode mode) {
        g51.a.b(a(), color, mode);
    }

    @Override // android.graphics.Canvas
    public void drawDoubleRoundRect(RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        g51.a.f(a(), outer, outerRadii, inner, innerRadii, paint);
    }

    @Override // android.graphics.Canvas
    public void drawText(CharSequence text, int start, int end, float x, float y, Paint paint) {
        a().drawText(text, start, end, x, y, paint);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(CharSequence text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, Paint paint) {
        y41.a.a(a(), text, start, end, contextStart, contextEnd, x, y, isRtl, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(Path path) {
        return k51.a.b(a(), path);
    }

    @Override // android.graphics.Canvas
    public int saveLayer(float left, float top, float right, float bottom, Paint paint) {
        return a().saveLayer(left, top, right, bottom, paint);
    }

    @Override // android.graphics.Canvas
    public int saveLayerAlpha(float left, float top, float right, float bottom, int alpha) {
        return a().saveLayerAlpha(left, top, right, bottom, alpha);
    }

    @Override // android.graphics.Canvas
    @r43
    public boolean clipRect(float left, float top, float right, float bottom, Region.Op op) {
        return a().clipRect(left, top, right, bottom, op);
    }

    @Override // android.graphics.Canvas
    @r43
    public void drawBitmap(int[] colors, int offset, int stride, int x, int y, int width, int height, boolean hasAlpha, Paint paint) {
        a().drawBitmap(colors, offset, stride, x, y, width, height, hasAlpha, paint);
    }

    @Override // android.graphics.Canvas
    public void drawColor(long color, BlendMode mode) {
        g51.a.d(a(), color, mode);
    }

    @Override // android.graphics.Canvas
    @r43
    public boolean quickReject(float left, float top, float right, float bottom, Canvas.EdgeType type) {
        return a().quickReject(left, top, right, bottom, type);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(float left, float top, float right, float bottom) {
        return a().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawBitmap(Bitmap bitmap, Matrix matrix, Paint paint) {
        a().drawBitmap(bitmap, matrix, paint);
    }

    @Override // android.graphics.Canvas
    public boolean quickReject(float left, float top, float right, float bottom) {
        return k51.a.a(a(), left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public boolean clipRect(int left, int top, int right, int bottom) {
        return a().clipRect(left, top, right, bottom);
    }

    @Override // android.graphics.Canvas
    public void drawTextRun(MeasuredText text, int start, int end, int contextStart, int contextEnd, float x, float y, boolean isRtl, Paint paint) {
        g51.a.h(a(), text, start, end, contextStart, contextEnd, x, y, isRtl, paint);
    }
}
