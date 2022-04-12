package Lab5.modules;


abstract class Symbol implements SentenceItem
{
    protected char _symbol;

    abstract public void setSymbol(char _symbol);

    public String render() {
        return String.valueOf(_symbol);
    }

}

/*
 Створювати об'єкти Letter та Mark тільки через відповідні класи LetterCreator, MarkCreator
 Окремі класи створені для рекомендації уникнення "перегрузки" конструкторів складними виразами, залишая там тільки ініціціалізацію полів.
 */

class Letter extends Symbol implements Render {

    public void setSymbol(char symbol) {
        if(String.valueOf(symbol).matches("[^а-яА-Яa-zA-Z]+")) throw new IllegalArgumentException("Invalid value for letter");
        _symbol = symbol;
    }
}

class Mark extends Symbol implements Render {

    public void setSymbol(char symbol) {
        if(String.valueOf(symbol).matches("[а-яА-Яa-zA-Z]+")) throw new IllegalArgumentException("Invalid value for mark");
        _symbol = symbol;
    }
}

class WhiteSpace implements SentenceItem
{
    public String render() {
        return "\s";
    }
}

abstract class SymbolCreator {

    public Symbol create(char symbol) {
        Symbol product = getProduct();
        product.setSymbol(symbol);
        return product;
    }
    abstract public Symbol getProduct();
}

class LetterCreator extends SymbolCreator {

    public Symbol getProduct() {
        return new Letter();
    }
}

class MarkCreator extends SymbolCreator {

    public Symbol getProduct() {
        return new Mark();
    }
}


