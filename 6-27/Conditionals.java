public class Conditionals {
  public static void main(String[] args) {
    boolean sixEqualsSix = 6 == 6;
    boolean fiveGreaterThan11 = 5 > 11;
    boolean negSevenLessThanOrEqualNeg42 = -7 <= -42;

    if(sixEqualsSix) {
      if(fiveGreaterThan11) {
        //A
      } else if(negSevenLessThanOrEqualNeg42) {
        //B
      }//else if negSevenLessThanOrEqualNeg42
    } else if (negSevenLessThanOrEqualNeg42) {
      //C
    }//else if negSevenLessThanOrEqualNeg42
    else {
      //D
    }//else


    //AND
    boolean a = true && true;//true
    boolean b = true && false;//false
    boolean c = false && true;//false
    boolean d = false && false;//false

    //OR
    boolean e = true || true;//true
    boolean f = true || false;//true
    boolean g = false || true;//true
    boolean h = false || false;//false

    //XOR
    boolean i = true ^ true;//false
    boolean j = true ^ false;//true
    boolean k = false ^ true;//true
    boolean l = false ^ false;//false

    //NOT
    boolean falsehood = !true;
    boolean truthhood = !false;

    //NAND
    boolean x = a ? !b : true;
    //XNOR
    boolean y = !(a^b);
    boolean z = (a==b);
  }//main
}
