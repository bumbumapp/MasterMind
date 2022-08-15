package eth.bumbumapps.mastermindy;

import java.util.ArrayList;
import java.util.Arrays;

import mmcore.HintStruct;

public class Translator {
    private static Translator instance = null;
    private final ArrayList<Integer> pawnColorAL;

    public static Translator getInstance() {
        if(instance == null) {
            instance = new Translator();
        }
        return instance;
    }

    private Translator() {
        pawnColorAL = new ArrayList<>(Arrays.asList(
                R.drawable.ic_pawn_1, R.drawable.ic_pawn_3, R.drawable.ic_pawn_4,
                R.drawable.ic_pawn_2, R.drawable.ic_pawn_5, R.drawable.ic_pawn_7,
                R.drawable.ic_pawn_8, R.drawable.ic_pawn_9, R.drawable.ic_pawn_10,
                R.drawable.ic_pawn_11, R.drawable.ic_pawn_12, R.drawable.ic_pawn_13));
    }

    public int posToR(int pos) {
        return pawnColorAL.get(pos);
    }

    public int RtoPos(int R) {
        return pawnColorAL.indexOf(R);
    }

    public ArrayList<Integer> arrayListRtoPos(ArrayList<Integer> valuesR) {
        ArrayList<Integer> arrayListPos = new ArrayList<>();
        for(int valR : valuesR) {
            arrayListPos.add(RtoPos(valR));
        }
        return arrayListPos;
    }

    public ArrayList<Integer> arrayListPostoR(ArrayList<Integer> valuesPos) {
        ArrayList<Integer> arrayListR = new ArrayList<>();
        for(int valPos : valuesPos) {
            arrayListR.add(posToR(valPos));
        }
        return arrayListR;
    }

    public ArrayList<Integer> hintToR(HintStruct hint) {
        ArrayList<Integer> arrayListHints = new ArrayList<>();
        for(int i = 0; i < hint.numBlacks; i++) {
            arrayListHints.add(R.drawable.black);
        }
        for(int i = 0; i < hint.numWhites; i++) {
            arrayListHints.add(R.drawable.white);
        }
        for(int i = 0; i < hint.numBlanks; i++) {
            arrayListHints.add(R.drawable.blank);
        }
        return arrayListHints;
    }

}
