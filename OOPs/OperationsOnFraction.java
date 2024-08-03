package OOPs;

    /*
        Add : (2/3)+(4/5) = (22/15)
        Mul : (5/3)*(4/5) = (20/15) = (4\3)
        ...
    */
public class OperationsOnFraction { // ['+', '-', '*', '/']

    public static class Fraction{
        int num;
        int den;

        public Fraction(int num, int den){
            this.num = num;
            this.den = den;
        }

        public void simplify(){
            if(this.num == this.den){
                this.num = 1;
                this.den = 1;
            }
            else if(this.num > this.den){
                for(int i=2 ; i<this.den ; i++){
                    if(this.num%i==0 && this.den%i==0){
                        this.num=this.num/i;
                        this.den=this.den/i;
                    }
                }
            }
            else {
                for(int i=2 ; i<this.num ; i++){
                    if(this.num%i==0 && this.den%i==0){
                        this.num=this.num/i;
                        this.den=this.den/i;
                    }
                }
            }
        }

    }




    public static void main(String[] args) {
        Fraction f1 = new Fraction(14,21);
        Fraction f2 = new Fraction(2,3);
        f1.simplify();
        System.out.println(f1.num+"/"+f1.den);
    }
}
