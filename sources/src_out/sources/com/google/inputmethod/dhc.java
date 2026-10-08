package com.google.inputmethod;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B1\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lcom/google/android/dhc;", "Lcom/google/android/jkb;", "", "Lcom/google/android/rn8;", "center", "", "Lcom/google/android/ei1;", "colors", "", "stops", "<init>", "(JLjava/util/List;Ljava/util/List;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lcom/google/android/tsb;", "size", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "b", "(J)Landroid/graphics/Shader;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "f", "J", "getCenter-F1C5BW0$ui_graphics", "()J", "g", "Ljava/util/List;", "getColors$ui_graphics", "()Ljava/util/List;", "h", "getStops$ui_graphics", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class dhc extends jkb {

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final long center;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final List<ei1> colors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final List<Float> stops;

    public /* synthetic */ dhc(long j, List list, List list2, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, list, list2);
    }

    @Override // com.google.inputmethod.jkb
    public Shader b(long size) {
        long jE;
        long j = this.center;
        if ((9223372034707292159L & j) == 9205357640488583168L) {
            jE = atb.b(size);
        } else {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (j >> 32)) == Float.POSITIVE_INFINITY ? size >> 32 : this.center >> 32));
            if (Float.intBitsToFloat((int) (this.center & 4294967295L)) != Float.POSITIVE_INFINITY) {
                size = this.center;
            }
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (size & 4294967295L));
            jE = rn8.e((((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32));
        }
        return mkb.f(jE, this.colors, this.stops);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof dhc)) {
            return false;
        }
        dhc dhcVar = (dhc) other;
        return rn8.j(this.center, dhcVar.center) && Intrinsics.e(this.colors, dhcVar.colors) && Intrinsics.e(this.stops, dhcVar.stops);
    }

    public int hashCode() {
        int iO = ((rn8.o(this.center) * 31) + this.colors.hashCode()) * 31;
        List<Float> list = this.stops;
        return iO + (list != null ? list.hashCode() : 0);
    }

    public String toString() {
        String str;
        if ((this.center & 9223372034707292159L) != 9205357640488583168L) {
            str = "center=" + ((Object) rn8.s(this.center)) + ", ";
        } else {
            str = "";
        }
        return "SweepGradient(" + str + "colors=" + this.colors + ", stops=" + this.stops + ')';
    }

    private dhc(long j, List<ei1> list, List<Float> list2) {
        this.center = j;
        this.colors = list;
        this.stops = list2;
    }
}
