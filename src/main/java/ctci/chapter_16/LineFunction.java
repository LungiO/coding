package ctci.chapter_16;

class LineFunction {
    double k;
    double d;

    LineFunction(double k, double d) {
        this.k = k;
        this.d = d;
    }

    double getYAtX(double x) {
        return k * x + d;
    }
}
