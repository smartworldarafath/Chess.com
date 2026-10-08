package com.google.inputmethod;

import android.view.KeyEvent;
import androidx.compose.p001foundation.text.KeyCommand;
import androidx.compose.p001foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.ui.text.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: d:\Antigravity Projects\Chess\xapk_analysis\res_out\resources\com.chess.apk\classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b+\b\u0001\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\u0014\b\u0002\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u0016*\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J#\u0010)\u001a\u00020\u00162\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020\u00160\u0015H\u0002¢\u0006\u0004\b)\u0010*J\u0015\u0010+\u001a\u00020\b2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010FR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010Q¨\u0006R"}, d2 = {"Lcom/google/android/auc;", "", "Lcom/google/android/k07;", "state", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "selectionManager", "Lcom/google/android/cwc;", "value", "", "editable", "singleLine", "Lcom/google/android/yyc;", "preparedSelectionState", "Lcom/google/android/zn8;", "offsetMapping", "Lcom/google/android/rsd;", "undoManager", "Lcom/google/android/fq2;", "keyCombiner", "Lcom/google/android/zi6;", "keyMapping", "Lkotlin/Function1;", "", "onValueChange", "Landroidx/compose/ui/text/input/a;", "imeAction", "<init>", "(Lcom/google/android/k07;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Lcom/google/android/cwc;ZZLcom/google/android/yyc;Lcom/google/android/zn8;Lcom/google/android/rsd;Lcom/google/android/fq2;Lcom/google/android/zi6;Lkotlin/jvm/functions/Function1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "Lcom/google/android/cn3;", "m", "(Ljava/util/List;)V", "l", "(Lcom/google/android/cn3;)V", "Lcom/google/android/oi6;", "event", "Lcom/google/android/gk1;", "y", "(Landroid/view/KeyEvent;)Lcom/google/android/gk1;", "Lcom/google/android/kuc;", "block", "n", "(Lkotlin/jvm/functions/Function1;)V", "o", "(Landroid/view/KeyEvent;)Z", "a", "Lcom/google/android/k07;", "getState", "()Lcom/google/android/k07;", "b", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "c", "Lcom/google/android/cwc;", "getValue", "()Lcom/google/android/cwc;", "d", "Z", "getEditable", "()Z", "e", "getSingleLine", "f", "Lcom/google/android/yyc;", "getPreparedSelectionState", "()Lcom/google/android/yyc;", "g", "Lcom/google/android/zn8;", "getOffsetMapping", "()Lcom/google/android/zn8;", "h", "Lcom/google/android/rsd;", "getUndoManager", "()Lcom/google/android/rsd;", "i", "Lcom/google/android/fq2;", "j", "Lcom/google/android/zi6;", "k", "Lkotlin/jvm/functions/Function1;", "I", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class auc {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final k07 state;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final TextFieldSelectionManager selectionManager;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final TextFieldValue value;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean editable;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final boolean singleLine;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final yyc preparedSelectionState;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final zn8 offsetMapping;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final rsd undoManager;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final fq2 keyCombiner;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final zi6 keyMapping;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final Function1<TextFieldValue, Unit> onValueChange;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final int imeAction;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[KeyCommand.values().length];
            try {
                iArr[KeyCommand.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KeyCommand.PASTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KeyCommand.CUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[KeyCommand.LEFT_CHAR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[KeyCommand.RIGHT_CHAR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[KeyCommand.LEFT_WORD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[KeyCommand.RIGHT_WORD.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[KeyCommand.PREV_PARAGRAPH.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[KeyCommand.NEXT_PARAGRAPH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[KeyCommand.UP.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[KeyCommand.DOWN.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[KeyCommand.PAGE_UP.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[KeyCommand.PAGE_DOWN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[KeyCommand.LINE_START.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[KeyCommand.LINE_END.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[KeyCommand.LINE_LEFT.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[KeyCommand.LINE_RIGHT.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[KeyCommand.HOME.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[KeyCommand.END.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_CHAR.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_CHAR.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[KeyCommand.DELETE_PREV_WORD.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[KeyCommand.DELETE_NEXT_WORD.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[KeyCommand.DELETE_FROM_LINE_START.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[KeyCommand.DELETE_TO_LINE_END.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[KeyCommand.NEW_LINE.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[KeyCommand.TAB.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[KeyCommand.SELECT_ALL.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_CHAR.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_CHAR.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                iArr[KeyCommand.SELECT_LEFT_WORD.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                iArr[KeyCommand.SELECT_RIGHT_WORD.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                iArr[KeyCommand.SELECT_PREV_PARAGRAPH.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                iArr[KeyCommand.SELECT_NEXT_PARAGRAPH.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_START.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_END.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_LEFT.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                iArr[KeyCommand.SELECT_LINE_RIGHT.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                iArr[KeyCommand.SELECT_UP.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                iArr[KeyCommand.SELECT_DOWN.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_UP.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                iArr[KeyCommand.SELECT_PAGE_DOWN.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                iArr[KeyCommand.SELECT_HOME.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                iArr[KeyCommand.SELECT_END.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                iArr[KeyCommand.DESELECT.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                iArr[KeyCommand.UNDO.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                iArr[KeyCommand.REDO.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                iArr[KeyCommand.CHARACTER_PALETTE.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                iArr[KeyCommand.CENTER.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public /* synthetic */ auc(k07 k07Var, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, yyc yycVar, zn8 zn8Var, rsd rsdVar, fq2 fq2Var, zi6 zi6Var, Function1 function1, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(k07Var, textFieldSelectionManager, textFieldValue, z, z2, yycVar, zn8Var, rsdVar, fq2Var, zi6Var, function1, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(TextFieldValue textFieldValue) {
        return Unit.a;
    }

    private final void l(cn3 cn3Var) {
        m(m.e(cn3Var));
    }

    private final void m(List<? extends cn3> list) {
        fn3 processor = this.state.getProcessor();
        List<? extends cn3> listB1 = m.B1(list);
        listB1.add(0, new wa4());
        this.onValueChange.invoke(processor.b(listB1));
    }

    private final void n(Function1<? super kuc, Unit> block) {
        kuc kucVar = new kuc(this.value, this.offsetMapping, this.state.n(), this.preparedSelectionState);
        block.invoke(kucVar);
        if (x.g(kucVar.getSelection(), this.value.getSelection()) && Intrinsics.e(kucVar.getAnnotatedString(), this.value.getText())) {
            return;
        }
        this.onValueChange.invoke(kucVar.a0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final Unit p(KeyCommand keyCommand, auc aucVar, Ref.BooleanRef booleanRef, kuc kucVar) throws NoWhenBranchMatchedException {
        TextFieldValue textFieldValueG;
        TextFieldValue textFieldValueC;
        switch (a.$EnumSwitchMapping$0[keyCommand.ordinal()]) {
            case 1:
                aucVar.selectionManager.C(false);
                return Unit.a;
            case 2:
                aucVar.selectionManager.w0();
                return Unit.a;
            case 3:
                aucVar.selectionManager.I();
                return Unit.a;
            case 4:
                kucVar.b(new Function1() { // from class: com.google.android.stc
                    public final Object invoke(Object obj) {
                        return auc.q((kuc) obj);
                    }
                });
                return Unit.a;
            case 5:
                kucVar.c(new Function1() { // from class: com.google.android.ttc
                    public final Object invoke(Object obj) {
                        return auc.r((kuc) obj);
                    }
                });
                return Unit.a;
            case 6:
                kucVar.C();
                return Unit.a;
            case 7:
                kucVar.K();
                return Unit.a;
            case 8:
                kucVar.H();
                return Unit.a;
            case lo6.HASACTION_FIELD_NUMBER /* 9 */:
                kucVar.E();
                return Unit.a;
            case lo6.HAS_IMAGE_DESCRIPTION_FIELD_NUMBER /* 10 */:
                kucVar.R();
                return Unit.a;
            case lo6.HAS_IMAGE_COLOR_FILTER_FIELD_NUMBER /* 11 */:
                kucVar.A();
                return Unit.a;
            case 12:
                kucVar.d0();
                return Unit.a;
            case 13:
                kucVar.c0();
                return Unit.a;
            case 14:
                kucVar.Q();
                return Unit.a;
            case 15:
                kucVar.N();
                return Unit.a;
            case 16:
                kucVar.O();
                return Unit.a;
            case 17:
                kucVar.P();
                return Unit.a;
            case 18:
                kucVar.M();
                return Unit.a;
            case 19:
                kucVar.L();
                return Unit.a;
            case 20:
                List<cn3> listZ = kucVar.Z(new Function1() { // from class: com.google.android.utc
                    public final Object invoke(Object obj) {
                        return auc.s((kuc) obj);
                    }
                });
                if (listZ != null) {
                    aucVar.m(listZ);
                    Unit unit = Unit.a;
                }
                return Unit.a;
            case 21:
                List<cn3> listZ2 = kucVar.Z(new Function1() { // from class: com.google.android.vtc
                    public final Object invoke(Object obj) {
                        return auc.t((kuc) obj);
                    }
                });
                if (listZ2 != null) {
                    aucVar.m(listZ2);
                    Unit unit2 = Unit.a;
                }
                return Unit.a;
            case 22:
                List<cn3> listZ3 = kucVar.Z(new Function1() { // from class: com.google.android.wtc
                    public final Object invoke(Object obj) {
                        return auc.u((kuc) obj);
                    }
                });
                if (listZ3 != null) {
                    aucVar.m(listZ3);
                    Unit unit3 = Unit.a;
                }
                return Unit.a;
            case 23:
                List<cn3> listZ4 = kucVar.Z(new Function1() { // from class: com.google.android.xtc
                    public final Object invoke(Object obj) {
                        return auc.v((kuc) obj);
                    }
                });
                if (listZ4 != null) {
                    aucVar.m(listZ4);
                    Unit unit4 = Unit.a;
                }
                return Unit.a;
            case 24:
                List<cn3> listZ5 = kucVar.Z(new Function1() { // from class: com.google.android.ytc
                    public final Object invoke(Object obj) {
                        return auc.w((kuc) obj);
                    }
                });
                if (listZ5 != null) {
                    aucVar.m(listZ5);
                    Unit unit5 = Unit.a;
                }
                return Unit.a;
            case 25:
                List<cn3> listZ6 = kucVar.Z(new Function1() { // from class: com.google.android.ztc
                    public final Object invoke(Object obj) {
                        return auc.x((kuc) obj);
                    }
                });
                if (listZ6 != null) {
                    aucVar.m(listZ6);
                    Unit unit6 = Unit.a;
                }
                return Unit.a;
            case 26:
                if (aucVar.singleLine) {
                    booleanRef.element = ((Boolean) aucVar.state.q().invoke(androidx.compose.ui.text.input.a.j(aucVar.imeAction))).booleanValue();
                } else {
                    aucVar.l(new CommitTextCommand("\n", 1));
                }
                Unit unit7 = Unit.a;
                return Unit.a;
            case 27:
                if (aucVar.singleLine) {
                    booleanRef.element = false;
                } else {
                    aucVar.l(new CommitTextCommand("\t", 1));
                }
                Unit unit8 = Unit.a;
                return Unit.a;
            case 28:
                kucVar.S();
                return Unit.a;
            case 29:
                kucVar.B().T();
                return Unit.a;
            case 30:
                kucVar.J().T();
                return Unit.a;
            case 31:
                kucVar.C().T();
                return Unit.a;
            case 32:
                kucVar.K().T();
                return Unit.a;
            case 33:
                kucVar.H().T();
                return Unit.a;
            case 34:
                kucVar.E().T();
                return Unit.a;
            case 35:
                kucVar.Q().T();
                return Unit.a;
            case 36:
                kucVar.N().T();
                return Unit.a;
            case 37:
                kucVar.O().T();
                return Unit.a;
            case 38:
                kucVar.P().T();
                return Unit.a;
            case 39:
                kucVar.R().T();
                return Unit.a;
            case 40:
                kucVar.A().T();
                return Unit.a;
            case 41:
                kucVar.d0().T();
                return Unit.a;
            case 42:
                kucVar.c0().T();
                return Unit.a;
            case 43:
                kucVar.M().T();
                return Unit.a;
            case 44:
                kucVar.L().T();
                return Unit.a;
            case 45:
                kucVar.d();
                return Unit.a;
            case 46:
                rsd rsdVar = aucVar.undoManager;
                if (rsdVar != null) {
                    rsdVar.b(kucVar.a0());
                }
                rsd rsdVar2 = aucVar.undoManager;
                if (rsdVar2 != null && (textFieldValueG = rsdVar2.g()) != null) {
                    aucVar.onValueChange.invoke(textFieldValueG);
                    Unit unit9 = Unit.a;
                }
                return Unit.a;
            case 47:
                rsd rsdVar3 = aucVar.undoManager;
                if (rsdVar3 != null && (textFieldValueC = rsdVar3.c()) != null) {
                    aucVar.onValueChange.invoke(textFieldValueC);
                    Unit unit10 = Unit.a;
                }
                return Unit.a;
            case 48:
                qi6.b();
            case 49:
                Unit unit11 = Unit.a;
                return Unit.a;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(kuc kucVar) {
        kucVar.B();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(kuc kucVar) {
        kucVar.J();
        return Unit.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn3 s(kuc kucVar) {
        int iR = kucVar.r();
        if (iR == -1) {
            return null;
        }
        return new DeleteSurroundingTextCommand(x.i(kucVar.getSelection()) - iR, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn3 t(kuc kucVar) {
        int iL = kucVar.l();
        if (iL != -1) {
            return new DeleteSurroundingTextCommand(0, iL - x.i(kucVar.getSelection()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn3 u(kuc kucVar) {
        Integer numU = kucVar.u();
        if (numU == null) {
            return null;
        }
        return new DeleteSurroundingTextCommand(x.i(kucVar.getSelection()) - numU.intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn3 v(kuc kucVar) {
        Integer numM = kucVar.m();
        if (numM != null) {
            return new DeleteSurroundingTextCommand(0, numM.intValue() - x.i(kucVar.getSelection()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn3 w(kuc kucVar) {
        Integer numI = kucVar.i();
        if (numI == null) {
            return null;
        }
        return new DeleteSurroundingTextCommand(x.i(kucVar.getSelection()) - numI.intValue(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final cn3 x(kuc kucVar) {
        Integer numF = kucVar.f();
        if (numF != null) {
            return new DeleteSurroundingTextCommand(0, numF.intValue() - x.i(kucVar.getSelection()));
        }
        return null;
    }

    private final CommitTextCommand y(KeyEvent event) {
        Integer numA;
        if (cuc.a(event) && (numA = this.keyCombiner.a(event)) != null) {
            return new CommitTextCommand(tbc.a(new StringBuilder(), numA.intValue()).toString(), 1);
        }
        return null;
    }

    public final boolean o(KeyEvent event) {
        final KeyCommand keyCommandA;
        CommitTextCommand commitTextCommandY = y(event);
        if (commitTextCommandY != null) {
            if (!this.editable) {
                return false;
            }
            l(commitTextCommandY);
            this.preparedSelectionState.b();
            return true;
        }
        if (!ri6.e(si6.b(event), ri6.INSTANCE.a()) || (keyCommandA = this.keyMapping.a(event)) == null || (keyCommandA.getEditsText() && !this.editable)) {
            return false;
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        booleanRef.element = true;
        n(new Function1() { // from class: com.google.android.qtc
            public final Object invoke(Object obj) {
                return auc.p(keyCommandA, this, booleanRef, (kuc) obj);
            }
        });
        rsd rsdVar = this.undoManager;
        if (rsdVar != null) {
            rsdVar.a();
        }
        return booleanRef.element;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private auc(k07 k07Var, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, yyc yycVar, zn8 zn8Var, rsd rsdVar, fq2 fq2Var, zi6 zi6Var, Function1<? super TextFieldValue, Unit> function1, int i) {
        this.state = k07Var;
        this.selectionManager = textFieldSelectionManager;
        this.value = textFieldValue;
        this.editable = z;
        this.singleLine = z2;
        this.preparedSelectionState = yycVar;
        this.offsetMapping = zn8Var;
        this.undoManager = rsdVar;
        this.keyCombiner = fq2Var;
        this.keyMapping = zi6Var;
        this.onValueChange = function1;
        this.imeAction = i;
    }

    public /* synthetic */ auc(k07 k07Var, TextFieldSelectionManager textFieldSelectionManager, TextFieldValue textFieldValue, boolean z, boolean z2, yyc yycVar, zn8 zn8Var, rsd rsdVar, fq2 fq2Var, zi6 zi6Var, Function1 function1, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(k07Var, textFieldSelectionManager, (i2 & 4) != 0 ? new TextFieldValue((String) null, 0L, (x) null, 7, (DefaultConstructorMarker) null) : textFieldValue, (i2 & 8) != 0 ? true : z, (i2 & 16) != 0 ? false : z2, yycVar, (i2 & 64) != 0 ? zn8.INSTANCE.a() : zn8Var, (i2 & 128) != 0 ? null : rsdVar, fq2Var, (i2 & 512) != 0 ? bj6.a() : zi6Var, (i2 & 1024) != 0 ? new Function1() { // from class: com.google.android.rtc
            public final Object invoke(Object obj) {
                return auc.k((TextFieldValue) obj);
            }
        } : function1, i, null);
    }
}
