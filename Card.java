import java.util.Arrays;

public class Card {
    public static final String MINUS = "-";
    public static final String PLUS = "+";
    private String[] faces; // only have 2 elements
    private int upFace; // either 0 or 1, one of the two String in faces.

    public String[] getFaces() {
        return faces;
    }

    public void setFaces(String[] faces) {
        this.faces = faces;
    }

    public int getUpFace() {
        return upFace;
    }

    public void setUpFace(int upFace) {
        this.upFace = upFace;
    }

    public Card(String[] faces) {
        this.faces = faces;
    }

    public String getUpSide()
    {
        return faces[upFace];
    }

    public String getDownSide()
    {
        return faces[1 - upFace];
    }

    @Override
    public String toString() {
        return "Card{up = " +
                getUpSide() +
                ", down = " + getDownSide() +
                '}';
    }
}
