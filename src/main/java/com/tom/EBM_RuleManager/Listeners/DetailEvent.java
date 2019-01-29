package com.tom.EBM_RuleManager.Listeners;
import java.util.EventObject;

public class DetailEvent extends EventObject {
    private String text;
    public DetailEvent(Object source, String text){
        super(source);//this calls the constructor of the parent class in this case EventObject //If you wanted to call a function from the parent use super.NameOfFunction();

        this.text = text;
    }

    public String getText(){
        return text;
    }
}
