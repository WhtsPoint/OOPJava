package Lab5.modules;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Word implements JoinRender, SentenceItem {

    private ArrayList<Letter> _letterList;
    public Word(ArrayList<Letter> letterList) {
        _letterList = letterList;
    }

    public ArrayList<Render> getItems() {
        ArrayList<Render> renderList = new ArrayList<Render>();
    }

    public void addLetter(Letter addedLetter)
    {
        _letterList.add(addedLetter);
    }

    public void removeLetter(int index)
    {
        _letterList.remove(index);
    }

}
