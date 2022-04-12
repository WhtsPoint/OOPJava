package Lab5.modules;

import java.util.ArrayList;

public class Text extends JoinRender {
    private ArrayList<Sentence> _sentences;

    public Text(ArrayList<Sentence> sentences)
    {
        _sentences = sentences;
    }

    public void addSentence(Sentence sentence)
    {
        _sentences.add(sentence);
    }

}
