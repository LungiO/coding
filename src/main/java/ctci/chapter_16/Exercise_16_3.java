package ctci.chapter_16;

/**
 * 16.3 Intersection:
 * Given two straight line segments (represented as a start point and an end point),
 * compute the point of intersection, if any.
 */


class Exercise_16_3 {
    LineFunction line1;
    LineFunction line2;

    GraphPoint calcSolution(GraphPoint line1start, GraphPoint line1end, GraphPoint line2start, GraphPoint line2end) {
        line1 = calcLineFunction(line1start, line1end);
        line2 = calcLineFunction(line2start, line2end);
        if (line1.k == line2.k) {
            return null;
        }
        return calcIntersection(line1, line2);
    }

    private LineFunction calcLineFunction(GraphPoint start, GraphPoint end) {
        double k = (start.y - end.y) / (start.x - end.x);
        double d = start.y - k * start.x;
        return new LineFunction(k, d);
    }

    private GraphPoint calcIntersection(LineFunction line1, LineFunction line2) {
        double x = (line2.d - line1.d) / (line1.k - line2.k);
        double y = line1.k * x + line1.d;
        return new GraphPoint(x, y);
    }
}
