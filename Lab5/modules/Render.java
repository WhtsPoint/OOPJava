package Lab5.modules;

import java.util.ArrayList;

interface Render {

    abstract String render();
}

interface JoinRender extends Render {

    abstract public ArrayList<Render> getItems();

    public default String render() {
        String result = "";
        for (Render item : getItems()) {
            result += item.render();
        }

        return result;
    }
}
