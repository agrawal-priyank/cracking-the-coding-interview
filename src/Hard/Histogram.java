package Hard;

public class Histogram {

    private int height;
    private int leftMaxIndex = -1;
    private int rightMaxIndex = -1;

    public Histogram(int height){
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getLeftMaxIndex() {
        return leftMaxIndex;
    }

    public void setLeftMaxIndex(int leftMaxIndex) {
        this.leftMaxIndex = leftMaxIndex;
    }

    public int getRightMaxIndex() {
        return rightMaxIndex;
    }

    public void setRightMaxIndex(int rightMaxIndex) {
        this.rightMaxIndex = rightMaxIndex;
    }

}