package com.javarush.burdygin;

import com.javarush.burdygin.alphabet.Alphabet;
import com.javarush.burdygin.alphabet.AlphabetLogic;
import com.javarush.burdygin.alphabet.AlphabetObject;

import java.util.ArrayList;
import java.util.List;

public class AlphabetConfig {
    private static final AlphabetObject alphabetObjectLatin = new AlphabetObject(Alphabet.A_LAT, Alphabet.B_LAT, Alphabet.Y_LAT, Alphabet.Z_LAT);
    private static final AlphabetObject alphabetObjectCyrillic = new AlphabetObject(Alphabet.A_CYR, Alphabet.B_CYR, Alphabet.YU_CYR, Alphabet.YA_CYR, Alphabet.YO_CYR);
    private static final AlphabetObject alphabetObjectSymbol = new AlphabetObject(Alphabet.SPACE, Alphabet.EXCLAMATION_MARK, Alphabet.QUESTION_MARK, Alphabet.COMMERCIAL_AT, Alphabet.NEW_STRING, Alphabet.CARRIAGE_RETURN);

    private static final List<AlphabetObject> alphabetsObjects = new ArrayList<>(List.of(alphabetObjectLatin, alphabetObjectCyrillic, alphabetObjectSymbol));

    private static final AlphabetLogic alphabetLogic = new AlphabetLogic(alphabetsObjects);

    public static AlphabetLogic getAlphabetLogic() {
        return alphabetLogic;
    }

    public static int alphabetLength() {
        int result = 0;
        for (AlphabetObject alphabetObject : alphabetsObjects) {
            result += alphabetObject.last - (alphabetObject.getFirst() - 1);
            if (alphabetObject.exempts != null) {
                result += alphabetObject.exempts.length;
            }
        }
        return result;
    }
}
