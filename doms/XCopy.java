package doms;
// will it not create object recursively
// it is givinh o/p as 42   84 
//How?
class XCopy {
        public static void main(String [] args) {
            int orig = 42;
            XCopy x = new XCopy();
            int y = x.go(orig);
            System.out.println(orig + " " + y);
        }
        int go(int arg) {
            arg = arg * 2;
            return arg;
        }
    }