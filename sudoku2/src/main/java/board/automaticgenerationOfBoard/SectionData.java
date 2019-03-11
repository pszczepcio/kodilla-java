package board.automaticgenerationOfBoard;

public class SectionData {
    private int iStart;
    private int jStart;
    private int iEnd;
    private int jEnd;

    public SectionData(int iStart, int jStart, int iEnd, int jEnd) {
        this.iStart = iStart;
        this.jStart = jStart;
        this.iEnd = iEnd;
        this.jEnd = jEnd;
    }

    public int getiStart() {
        return iStart;
    }

    public int getjStart() {
        return jStart;
    }

    public int getiEnd() {
        return iEnd;
    }

    public int getjEnd() {
        return jEnd;
    }
}
