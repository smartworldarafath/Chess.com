package com.google.inputmethod;

import androidx.datastore.p007core.CorruptionException;
import androidx.datastore.preferences.PreferencesProto$Value;
import androidx.datastore.preferences.b;
import androidx.datastore.preferences.c;
import androidx.datastore.preferences.protobuf.ByteString;
import com.google.android.q22;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\u0018\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0096@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/google/android/wk9;", "Lcom/google/android/mhb;", "Lcom/google/android/uk9;", "<init>", "()V", "", "value", "Landroidx/datastore/preferences/PreferencesProto$Value;", "c", "(Ljava/lang/Object;)Landroidx/datastore/preferences/PreferencesProto$Value;", "", "name", "Lcom/google/android/h58;", "mutablePreferences", "", "a", "(Ljava/lang/String;Landroidx/datastore/preferences/PreferencesProto$Value;Lcom/google/android/h58;)V", "Ljava/io/InputStream;", "input", "readFrom", "(Ljava/io/InputStream;Lcom/google/android/q22;)Ljava/lang/Object;", "t", "Ljava/io/OutputStream;", "output", "d", "(Lcom/google/android/uk9;Ljava/io/OutputStream;Lcom/google/android/q22;)Ljava/lang/Object;", "b", "()Lcom/google/android/uk9;", "defaultValue", "datastore-preferences-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class wk9 implements mhb<uk9> {
    public static final wk9 a = new wk9();

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PreferencesProto$Value.ValueCase.values().length];
            try {
                iArr[PreferencesProto$Value.ValueCase.BOOLEAN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.FLOAT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.INTEGER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.LONG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.STRING_SET.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.BYTES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[PreferencesProto$Value.ValueCase.VALUE_NOT_SET.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private wk9() {
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final void a(String name, PreferencesProto$Value value, h58 mutablePreferences) throws CorruptionException, NoWhenBranchMatchedException {
        PreferencesProto$Value.ValueCase valueCaseE0 = value.e0();
        switch (valueCaseE0 == null ? -1 : a.$EnumSwitchMapping$0[valueCaseE0.ordinal()]) {
            case t04.HOST_ID /* -1 */:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                mutablePreferences.l(xk9.a(name), Boolean.valueOf(value.V()));
                return;
            case 2:
                mutablePreferences.l(xk9.d(name), Float.valueOf(value.Z()));
                return;
            case 3:
                mutablePreferences.l(xk9.c(name), Double.valueOf(value.Y()));
                return;
            case 4:
                mutablePreferences.l(xk9.e(name), Integer.valueOf(value.a0()));
                return;
            case 5:
                mutablePreferences.l(xk9.f(name), Long.valueOf(value.b0()));
                return;
            case 6:
                mutablePreferences.l(xk9.g(name), value.c0());
                return;
            case 7:
                uk9.a<Set<String>> aVarH = xk9.h(name);
                List<String> listR = value.d0().R();
                Intrinsics.checkNotNullExpressionValue(listR, "getStringsList(...)");
                mutablePreferences.l(aVarH, m.D1(listR));
                return;
            case 8:
                mutablePreferences.l(xk9.b(name), value.W().w());
                return;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final PreferencesProto$Value c(Object value) {
        if (value instanceof Boolean) {
            PreferencesProto$Value preferencesProto$ValueBuild = PreferencesProto$Value.f0().r(((Boolean) value).booleanValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild, "build(...)");
            return preferencesProto$ValueBuild;
        }
        if (value instanceof Float) {
            PreferencesProto$Value preferencesProto$ValueBuild2 = PreferencesProto$Value.f0().u(((Number) value).floatValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild2, "build(...)");
            return preferencesProto$ValueBuild2;
        }
        if (value instanceof Double) {
            PreferencesProto$Value preferencesProto$ValueBuild3 = PreferencesProto$Value.f0().t(((Number) value).doubleValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild3, "build(...)");
            return preferencesProto$ValueBuild3;
        }
        if (value instanceof Integer) {
            PreferencesProto$Value preferencesProto$ValueBuild4 = PreferencesProto$Value.f0().v(((Number) value).intValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild4, "build(...)");
            return preferencesProto$ValueBuild4;
        }
        if (value instanceof Long) {
            PreferencesProto$Value preferencesProto$ValueBuild5 = PreferencesProto$Value.f0().w(((Number) value).longValue()).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild5, "build(...)");
            return preferencesProto$ValueBuild5;
        }
        if (value instanceof String) {
            PreferencesProto$Value preferencesProto$ValueBuild6 = PreferencesProto$Value.f0().x((String) value).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild6, "build(...)");
            return preferencesProto$ValueBuild6;
        }
        if (value instanceof Set) {
            PreferencesProto$Value.a aVarF0 = PreferencesProto$Value.f0();
            c.a aVarS = c.S();
            Intrinsics.h(value, "null cannot be cast to non-null type kotlin.collections.Set<kotlin.String>");
            PreferencesProto$Value preferencesProto$ValueBuild7 = aVarF0.y(aVarS.r((Set) value)).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild7, "build(...)");
            return preferencesProto$ValueBuild7;
        }
        if (value instanceof byte[]) {
            PreferencesProto$Value preferencesProto$ValueBuild8 = PreferencesProto$Value.f0().s(ByteString.f((byte[]) value)).build();
            Intrinsics.checkNotNullExpressionValue(preferencesProto$ValueBuild8, "build(...)");
            return preferencesProto$ValueBuild8;
        }
        throw new IllegalStateException("PreferencesSerializer does not support type: " + value.getClass().getName());
    }

    @Override // com.google.inputmethod.mhb
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public uk9 getDefaultValue() {
        return vk9.a();
    }

    @Override // com.google.inputmethod.mhb
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object writeTo(uk9 uk9Var, OutputStream outputStream, q22<? super Unit> q22Var) throws IOException {
        Map<uk9.a<?>, Object> mapA = uk9Var.a();
        b.a aVarS = b.S();
        for (Map.Entry<uk9.a<?>, Object> entry : mapA.entrySet()) {
            aVarS.r(entry.getKey().getName(), c(entry.getValue()));
        }
        aVarS.build().h(outputStream);
        return Unit.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    @Override // com.google.inputmethod.mhb
    public Object readFrom(InputStream inputStream, q22<? super uk9> q22Var) throws NoWhenBranchMatchedException, IOException {
        b bVarA = yk9.INSTANCE.a(inputStream);
        h58 h58VarB = vk9.b(new uk9.b[0]);
        Map<String, PreferencesProto$Value> mapP = bVarA.P();
        Intrinsics.checkNotNullExpressionValue(mapP, "getPreferencesMap(...)");
        for (Map.Entry<String, PreferencesProto$Value> entry : mapP.entrySet()) {
            String key = entry.getKey();
            PreferencesProto$Value value = entry.getValue();
            wk9 wk9Var = a;
            Intrinsics.g(key);
            Intrinsics.g(value);
            wk9Var.a(key, value, h58VarB);
        }
        return h58VarB.e();
    }
}
