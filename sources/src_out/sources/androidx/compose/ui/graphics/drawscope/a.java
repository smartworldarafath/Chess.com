package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.e;
import androidx.compose.ui.graphics.h;
import androidx.compose.ui.graphics.layer.GraphicsLayer;
import androidx.compose.ui.unit.LayoutDirection;
import com.google.inputmethod.ca4;
import com.google.inputmethod.dm;
import com.google.inputmethod.eh3;
import com.google.inputmethod.ei1;
import com.google.inputmethod.f39;
import com.google.inputmethod.f43;
import com.google.inputmethod.gr3;
import com.google.inputmethod.ml5;
import com.google.inputmethod.p51;
import com.google.inputmethod.q09;
import com.google.inputmethod.qu0;
import com.google.inputmethod.tsb;
import com.google.inputmethod.vg3;
import com.google.inputmethod.w09;
import com.google.inputmethod.w41;
import com.google.inputmethod.wbc;
import com.google.inputmethod.wg3;
import com.google.inputmethod.ybc;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001`B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJg\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&Ji\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J]\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J]\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u00102JK\u00106\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u00107JK\u00108\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109JC\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010=Jc\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bD\u0010EJS\u0010H\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bH\u0010IJS\u0010J\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bJ\u0010KJK\u0010N\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010OJK\u0010P\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bP\u0010QJK\u0010R\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bR\u00109Jc\u0010W\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010S\u001a\u00020\u000f2\u0006\u0010T\u001a\u00020\u000f2\u0006\u0010V\u001a\u00020U2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bW\u0010XJC\u0010[\u001a\u00020.2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b[\u0010\\JC\u0010]\u001a\u00020.2\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b]\u0010^R \u0010e\u001a\u00020_8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b`\u0010a\u0012\u0004\bd\u0010\u0003\u001a\u0004\bb\u0010cR\u001a\u0010j\u001a\u00020f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010g\u001a\u0004\bh\u0010iR\u0018\u0010m\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010o\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010lR\u0014\u0010s\u001a\u00020p8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010v\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010uR\u0014\u0010x\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bw\u0010u¨\u0006y"}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a;", "Landroidx/compose/ui/graphics/drawscope/DrawScope;", "<init>", "()V", "Lcom/google/android/q09;", "F", "()Lcom/google/android/q09;", "J", "Landroidx/compose/ui/graphics/drawscope/b;", "drawStyle", "L", "(Landroidx/compose/ui/graphics/drawscope/b;)Lcom/google/android/q09;", "Lcom/google/android/qu0;", "brush", "style", "", "alpha", "Landroidx/compose/ui/graphics/h;", "colorFilter", "Landroidx/compose/ui/graphics/e;", "blendMode", "Lcom/google/android/ca4;", "filterQuality", "i", "(Lcom/google/android/qu0;Landroidx/compose/ui/graphics/drawscope/b;FLandroidx/compose/ui/graphics/h;II)Lcom/google/android/q09;", "Lcom/google/android/ei1;", "color", "b", "(JLandroidx/compose/ui/graphics/drawscope/b;FLandroidx/compose/ui/graphics/h;II)Lcom/google/android/q09;", "strokeWidth", "miter", "Lcom/google/android/wbc;", "cap", "Lcom/google/android/ybc;", "join", "Lcom/google/android/f39;", "pathEffect", "m", "(JFFIILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;II)Lcom/google/android/q09;", "t", "(Lcom/google/android/qu0;FFIILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;II)Lcom/google/android/q09;", "D", "(JF)J", "Lcom/google/android/rn8;", "start", "end", "", "u1", "(Lcom/google/android/qu0;JJFILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;I)V", "A0", "(JJJFILcom/google/android/f39;FLandroidx/compose/ui/graphics/h;I)V", "topLeft", "Lcom/google/android/tsb;", "size", "l1", "(Lcom/google/android/qu0;JJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "k2", "(JJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/ml5;", "image", "W1", "(Lcom/google/android/ml5;JFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Lcom/google/android/g16;", "srcOffset", "Lcom/google/android/q16;", "srcSize", "dstOffset", "dstSize", "L1", "(Lcom/google/android/ml5;JJJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;II)V", "Lcom/google/android/aa2;", "cornerRadius", "j2", "(Lcom/google/android/qu0;JJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "S1", "(JJJJLandroidx/compose/ui/graphics/drawscope/b;FLandroidx/compose/ui/graphics/h;I)V", "radius", "center", "A1", "(Lcom/google/android/qu0;FJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "F0", "(JFJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "I0", "startAngle", "sweepAngle", "", "useCenter", "L0", "(JFFZJJFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Landroidx/compose/ui/graphics/Path;", "path", "C0", "(Landroidx/compose/ui/graphics/Path;JFLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "D1", "(Landroidx/compose/ui/graphics/Path;Lcom/google/android/qu0;FLandroidx/compose/ui/graphics/drawscope/b;Landroidx/compose/ui/graphics/h;I)V", "Landroidx/compose/ui/graphics/drawscope/a$a;", "a", "Landroidx/compose/ui/graphics/drawscope/a$a;", "z", "()Landroidx/compose/ui/graphics/drawscope/a$a;", "getDrawParams$annotations", "drawParams", "Lcom/google/android/vg3;", "Lcom/google/android/vg3;", "V0", "()Lcom/google/android/vg3;", "drawContext", "c", "Lcom/google/android/q09;", "fillPaint", "d", "strokePaint", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "getDensity", "()F", "density", "w2", "fontScale", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements DrawScope {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final vg3 drawContext = new b();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private q09 fillPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private q09 strokePaint;

    /* JADX INFO: renamed from: androidx.compose.ui.graphics.drawscope.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Landroidx/compose/ui/graphics/drawscope/a$a;", "", "Lcom/google/android/f43;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Lcom/google/android/w41;", "canvas", "Lcom/google/android/tsb;", "size", "<init>", "(Lcom/google/android/f43;Landroidx/compose/ui/unit/LayoutDirection;Lcom/google/android/w41;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "a", "()Lcom/google/android/f43;", "b", "()Landroidx/compose/ui/unit/LayoutDirection;", "c", "()Lcom/google/android/w41;", "d", "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/google/android/f43;", "f", "j", "(Lcom/google/android/f43;)V", "Landroidx/compose/ui/unit/LayoutDirection;", "g", "k", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "Lcom/google/android/w41;", "e", "i", "(Lcom/google/android/w41;)V", "J", "h", "l", "(J)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DrawParams {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        private f43 density;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        private LayoutDirection layoutDirection;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
        private w41 canvas;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
        private long size;

        public /* synthetic */ DrawParams(f43 f43Var, LayoutDirection layoutDirection, w41 w41Var, long j, DefaultConstructorMarker defaultConstructorMarker) {
            this(f43Var, layoutDirection, w41Var, j);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final f43 getDensity() {
            return this.density;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final LayoutDirection getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final w41 getCanvas() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final w41 e() {
            return this.canvas;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return Intrinsics.e(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && Intrinsics.e(this.canvas, drawParams.canvas) && tsb.h(this.size, drawParams.size);
        }

        public final f43 f() {
            return this.density;
        }

        public final LayoutDirection g() {
            return this.layoutDirection;
        }

        public final long h() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + tsb.m(this.size);
        }

        public final void i(w41 w41Var) {
            this.canvas = w41Var;
        }

        public final void j(f43 f43Var) {
            this.density = f43Var;
        }

        public final void k(LayoutDirection layoutDirection) {
            this.layoutDirection = layoutDirection;
        }

        public final void l(long j) {
            this.size = j;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) tsb.p(this.size)) + ')';
        }

        private DrawParams(f43 f43Var, LayoutDirection layoutDirection, w41 w41Var, long j) {
            this.density = f43Var;
            this.layoutDirection = layoutDirection;
            this.canvas = w41Var;
            this.size = j;
        }

        public /* synthetic */ DrawParams(f43 f43Var, LayoutDirection layoutDirection, w41 w41Var, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? wg3.a() : f43Var, (i & 2) != 0 ? LayoutDirection.Ltr : layoutDirection, (i & 4) != 0 ? gr3.a : w41Var, (i & 8) != 0 ? tsb.INSTANCE.b() : j, null);
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0012\"\u0004\b\u0013\u0010\u0014R$\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00168V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u0003\u0010\u001fR$\u0010&\u001a\u00020!2\u0006\u0010\u0011\u001a\u00020!8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"androidx/compose/ui/graphics/drawscope/a$b", "Lcom/google/android/vg3;", "Lcom/google/android/eh3;", "a", "Lcom/google/android/eh3;", "g", "()Lcom/google/android/eh3;", "transform", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "b", "Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "f", "()Landroidx/compose/ui/graphics/layer/GraphicsLayer;", "h", "(Landroidx/compose/ui/graphics/layer/GraphicsLayer;)V", "graphicsLayer", "Lcom/google/android/w41;", "value", "()Lcom/google/android/w41;", "i", "(Lcom/google/android/w41;)V", "canvas", "Lcom/google/android/tsb;", "d", "()J", "c", "(J)V", "size", "Landroidx/compose/ui/unit/LayoutDirection;", "getLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "layoutDirection", "Lcom/google/android/f43;", "getDensity", "()Lcom/google/android/f43;", "e", "(Lcom/google/android/f43;)V", "density", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements vg3 {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        private final eh3 transform = p51.b(this);

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        private GraphicsLayer graphicsLayer;

        b() {
        }

        @Override // com.google.inputmethod.vg3
        public void a(LayoutDirection layoutDirection) {
            a.this.getDrawParams().k(layoutDirection);
        }

        @Override // com.google.inputmethod.vg3
        public w41 b() {
            return a.this.getDrawParams().e();
        }

        @Override // com.google.inputmethod.vg3
        public void c(long j) {
            a.this.getDrawParams().l(j);
        }

        @Override // com.google.inputmethod.vg3
        public long d() {
            return a.this.getDrawParams().h();
        }

        @Override // com.google.inputmethod.vg3
        public void e(f43 f43Var) {
            a.this.getDrawParams().j(f43Var);
        }

        @Override // com.google.inputmethod.vg3
        /* JADX INFO: renamed from: f, reason: from getter */
        public GraphicsLayer getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // com.google.inputmethod.vg3
        /* JADX INFO: renamed from: g, reason: from getter */
        public eh3 getTransform() {
            return this.transform;
        }

        @Override // com.google.inputmethod.vg3
        public f43 getDensity() {
            return a.this.getDrawParams().f();
        }

        @Override // com.google.inputmethod.vg3
        public LayoutDirection getLayoutDirection() {
            return a.this.getDrawParams().g();
        }

        @Override // com.google.inputmethod.vg3
        public void h(GraphicsLayer graphicsLayer) {
            this.graphicsLayer = graphicsLayer;
        }

        @Override // com.google.inputmethod.vg3
        public void i(w41 w41Var) {
            a.this.getDrawParams().i(w41Var);
        }
    }

    private final long D(long j, float f) {
        return f == 1.0f ? j : ei1.p(j, ei1.s(j) * f, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final q09 F() {
        q09 q09Var = this.fillPaint;
        if (q09Var != null) {
            return q09Var;
        }
        q09 q09VarA = dm.a();
        q09VarA.y(w09.INSTANCE.a());
        this.fillPaint = q09VarA;
        return q09VarA;
    }

    private final q09 J() {
        q09 q09Var = this.strokePaint;
        if (q09Var != null) {
            return q09Var;
        }
        q09 q09VarA = dm.a();
        q09VarA.y(w09.INSTANCE.b());
        this.strokePaint = q09VarA;
        return q09VarA;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final q09 L(androidx.compose.ui.graphics.drawscope.b drawStyle) throws NoWhenBranchMatchedException {
        if (Intrinsics.e(drawStyle, c.b)) {
            return F();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new NoWhenBranchMatchedException();
        }
        q09 q09VarJ = J();
        Stroke stroke = (Stroke) drawStyle;
        if (q09VarJ.A() != stroke.getWidth()) {
            q09VarJ.z(stroke.getWidth());
        }
        if (!wbc.e(q09VarJ.r(), stroke.getCap())) {
            q09VarJ.p(stroke.getCap());
        }
        if (q09VarJ.u() != stroke.getMiter()) {
            q09VarJ.x(stroke.getMiter());
        }
        if (!ybc.e(q09VarJ.t(), stroke.getJoin())) {
            q09VarJ.s(stroke.getJoin());
        }
        if (!Intrinsics.e(q09VarJ.getPathEffect(), stroke.getPathEffect())) {
            q09VarJ.B(stroke.getPathEffect());
        }
        return q09VarJ;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final q09 b(long color, androidx.compose.ui.graphics.drawscope.b style, float alpha, h colorFilter, int blendMode, int filterQuality) throws NoWhenBranchMatchedException {
        q09 q09VarL = L(style);
        long jD = D(color, alpha);
        if (!ei1.r(q09VarL.d(), jD)) {
            q09VarL.n(jD);
        }
        if (q09VarL.getInternalShader() != null) {
            q09VarL.D(null);
        }
        if (!Intrinsics.e(q09VarL.getInternalColorFilter(), colorFilter)) {
            q09VarL.h(colorFilter);
        }
        if (!e.E(q09VarL.get_blendMode(), blendMode)) {
            q09VarL.e(blendMode);
        }
        if (!ca4.e(q09VarL.E(), filterQuality)) {
            q09VarL.q(filterQuality);
        }
        return q09VarL;
    }

    static /* synthetic */ q09 f(a aVar, long j, androidx.compose.ui.graphics.drawscope.b bVar, float f, h hVar, int i, int i2, int i3, Object obj) {
        return aVar.b(j, bVar, f, hVar, i, (i3 & 32) != 0 ? DrawScope.INSTANCE.b() : i2);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final q09 i(qu0 brush, androidx.compose.ui.graphics.drawscope.b style, float alpha, h colorFilter, int blendMode, int filterQuality) throws NoWhenBranchMatchedException {
        q09 q09VarL = L(style);
        if (brush != null) {
            brush.a(d(), q09VarL, alpha);
        } else {
            if (q09VarL.getInternalShader() != null) {
                q09VarL.D(null);
            }
            long jD = q09VarL.d();
            ei1.Companion companion = ei1.INSTANCE;
            if (!ei1.r(jD, companion.a())) {
                q09VarL.n(companion.a());
            }
            if (q09VarL.a() != alpha) {
                q09VarL.c(alpha);
            }
        }
        if (!Intrinsics.e(q09VarL.getInternalColorFilter(), colorFilter)) {
            q09VarL.h(colorFilter);
        }
        if (!e.E(q09VarL.get_blendMode(), blendMode)) {
            q09VarL.e(blendMode);
        }
        if (!ca4.e(q09VarL.E(), filterQuality)) {
            q09VarL.q(filterQuality);
        }
        return q09VarL;
    }

    static /* synthetic */ q09 j(a aVar, qu0 qu0Var, androidx.compose.ui.graphics.drawscope.b bVar, float f, h hVar, int i, int i2, int i3, Object obj) {
        if ((i3 & 32) != 0) {
            i2 = DrawScope.INSTANCE.b();
        }
        return aVar.i(qu0Var, bVar, f, hVar, i, i2);
    }

    private final q09 m(long color, float strokeWidth, float miter, int cap, int join, f39 pathEffect, float alpha, h colorFilter, int blendMode, int filterQuality) {
        q09 q09VarJ = J();
        long jD = D(color, alpha);
        if (!ei1.r(q09VarJ.d(), jD)) {
            q09VarJ.n(jD);
        }
        if (q09VarJ.getInternalShader() != null) {
            q09VarJ.D(null);
        }
        if (!Intrinsics.e(q09VarJ.getInternalColorFilter(), colorFilter)) {
            q09VarJ.h(colorFilter);
        }
        if (!e.E(q09VarJ.get_blendMode(), blendMode)) {
            q09VarJ.e(blendMode);
        }
        if (q09VarJ.A() != strokeWidth) {
            q09VarJ.z(strokeWidth);
        }
        if (q09VarJ.u() != miter) {
            q09VarJ.x(miter);
        }
        if (!wbc.e(q09VarJ.r(), cap)) {
            q09VarJ.p(cap);
        }
        if (!ybc.e(q09VarJ.t(), join)) {
            q09VarJ.s(join);
        }
        if (!Intrinsics.e(q09VarJ.getPathEffect(), pathEffect)) {
            q09VarJ.B(pathEffect);
        }
        if (!ca4.e(q09VarJ.E(), filterQuality)) {
            q09VarJ.q(filterQuality);
        }
        return q09VarJ;
    }

    static /* synthetic */ q09 r(a aVar, long j, float f, float f2, int i, int i2, f39 f39Var, float f3, h hVar, int i3, int i4, int i5, Object obj) {
        return aVar.m(j, f, f2, i, i2, f39Var, f3, hVar, i3, (i5 & 512) != 0 ? DrawScope.INSTANCE.b() : i4);
    }

    private final q09 t(qu0 brush, float strokeWidth, float miter, int cap, int join, f39 pathEffect, float alpha, h colorFilter, int blendMode, int filterQuality) {
        q09 q09VarJ = J();
        if (brush != null) {
            brush.a(d(), q09VarJ, alpha);
        } else if (q09VarJ.a() != alpha) {
            q09VarJ.c(alpha);
        }
        if (!Intrinsics.e(q09VarJ.getInternalColorFilter(), colorFilter)) {
            q09VarJ.h(colorFilter);
        }
        if (!e.E(q09VarJ.get_blendMode(), blendMode)) {
            q09VarJ.e(blendMode);
        }
        if (q09VarJ.A() != strokeWidth) {
            q09VarJ.z(strokeWidth);
        }
        if (q09VarJ.u() != miter) {
            q09VarJ.x(miter);
        }
        if (!wbc.e(q09VarJ.r(), cap)) {
            q09VarJ.p(cap);
        }
        if (!ybc.e(q09VarJ.t(), join)) {
            q09VarJ.s(join);
        }
        if (!Intrinsics.e(q09VarJ.getPathEffect(), pathEffect)) {
            q09VarJ.B(pathEffect);
        }
        if (!ca4.e(q09VarJ.E(), filterQuality)) {
            q09VarJ.q(filterQuality);
        }
        return q09VarJ;
    }

    static /* synthetic */ q09 w(a aVar, qu0 qu0Var, float f, float f2, int i, int i2, f39 f39Var, float f3, h hVar, int i3, int i4, int i5, Object obj) {
        return aVar.t(qu0Var, f, f2, i, i2, f39Var, f3, hVar, i3, (i5 & 512) != 0 ? DrawScope.INSTANCE.b() : i4);
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void A0(long color, long start, long end, float strokeWidth, int cap, f39 pathEffect, float alpha, h colorFilter, int blendMode) {
        this.drawParams.e().s(start, end, r(this, color, strokeWidth, 4.0f, cap, ybc.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void A1(qu0 brush, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        this.drawParams.e().z(center, radius, j(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void C0(Path path, long color, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        this.drawParams.e().y(path, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void D1(Path path, qu0 brush, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        this.drawParams.e().y(path, j(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void F0(long color, float radius, long center, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        this.drawParams.e().z(center, radius, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void I0(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.e().h(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void L0(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.e().q(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), startAngle, sweepAngle, useCenter, f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void L1(ml5 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode, int filterQuality) {
        this.drawParams.e().m(image, srcOffset, srcSize, dstOffset, dstSize, i(null, style, alpha, colorFilter, blendMode, filterQuality));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void S1(long color, long topLeft, long size, long cornerRadius, androidx.compose.ui.graphics.drawscope.b style, float alpha, h colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.e().A(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    /* JADX INFO: renamed from: V0, reason: from getter */
    public vg3 getDrawContext() {
        return this.drawContext;
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void W1(ml5 image, long topLeft, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        this.drawParams.e().f(image, topLeft, j(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // com.google.inputmethod.f43
    public float getDensity() {
        return this.drawParams.f().getDensity();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public LayoutDirection getLayoutDirection() {
        return this.drawParams.g();
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void j2(qu0 brush, long topLeft, long size, long cornerRadius, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.e().A(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & 4294967295L)), j(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void k2(long color, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.e().g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), f(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void l1(qu0 brush, long topLeft, long size, float alpha, androidx.compose.ui.graphics.drawscope.b style, h colorFilter, int blendMode) {
        int i = (int) (topLeft >> 32);
        int i2 = (int) (topLeft & 4294967295L);
        this.drawParams.e().g(Float.intBitsToFloat(i), Float.intBitsToFloat(i2), Float.intBitsToFloat(i) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i2) + Float.intBitsToFloat((int) (size & 4294967295L)), j(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // androidx.compose.ui.graphics.drawscope.DrawScope
    public void u1(qu0 brush, long start, long end, float strokeWidth, int cap, f39 pathEffect, float alpha, h colorFilter, int blendMode) {
        this.drawParams.e().s(start, end, w(this, brush, strokeWidth, 4.0f, cap, ybc.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // com.google.inputmethod.hm4
    /* JADX INFO: renamed from: w2 */
    public float getFontScale() {
        return this.drawParams.f().getFontScale();
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }
}
